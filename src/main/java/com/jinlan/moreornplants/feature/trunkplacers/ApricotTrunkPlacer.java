package com.jinlan.moreornplants.feature.trunkplacers;

import com.jinlan.moreornplants.block.ModFlammableRotatedPillarBlock;
import com.jinlan.moreornplants.init.ModTrunkPlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;

public class ApricotTrunkPlacer extends TrunkPlacer {
    public static final Codec<ApricotTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(1, 8).fieldOf("branch_start_height").forGetter(placer -> placer.branchStartHeight),
                    Codec.intRange(1, 4).fieldOf("max_branches_per_level").forGetter(placer -> placer.maxBranchesPerLevel),
                    Codec.intRange(2, 8).fieldOf("branch_min_length").forGetter(placer -> placer.branchMinLength),
                    Codec.intRange(3, 12).fieldOf("branch_max_length").forGetter(placer -> placer.branchMaxLength),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("branch_chance").forGetter(placer -> placer.branchChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("branch_upward_bias").forGetter(placer -> placer.branchUpwardBias)
            ).apply(instance, ApricotTrunkPlacer::new)
    );

    private final int branchStartHeight;
    private final int maxBranchesPerLevel;
    private final int branchMinLength;
    private final int branchMaxLength;
    private final float branchChance;
    private final float branchUpwardBias;

    public ApricotTrunkPlacer(int baseHeight, int heightRandA, int heightRandB,
                              int branchStartHeight, int maxBranchesPerLevel,
                              int branchMinLength, int branchMaxLength,
                              float branchChance, float branchUpwardBias) {
        super(baseHeight, heightRandA, heightRandB);
        this.branchStartHeight = branchStartHeight;
        this.maxBranchesPerLevel = maxBranchesPerLevel;
        this.branchMinLength = branchMinLength;
        this.branchMaxLength = branchMaxLength;
        this.branchChance = branchChance;
        this.branchUpwardBias = branchUpwardBias;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.APRICOT_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                            RandomSource random, int freeTreeHeight, BlockPos pos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();

        BlockPos currentPos = pos;

        // 放置笔直的主干
        for (int height = 0; height < freeTreeHeight; height++) {
            // 放置主干原木（垂直方向）
            this.placeLog(level, blockSetter, random, currentPos, config, Direction.Axis.Y);

            // 在达到分支起始高度后，开始生成分支
            if (height >= branchStartHeight && height < freeTreeHeight - 3) {
                // 决定是否在这个高度生成分支
                if (random.nextFloat() < branchChance) {
                    // 生成多个方向的分支
                    generateBranchesAtLevel(level, blockSetter, random, currentPos, freeTreeHeight - height,
                            config, foliageAttachments);
                }
            }

            currentPos = currentPos.above();
        }

        // 添加主干顶端的树叶附着点
        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.below(2), 0, false));

        return foliageAttachments;
    }

    // 在特定高度生成多个方向的分支
    private void generateBranchesAtLevel(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                         RandomSource random, BlockPos startPos, int remainingHeight,
                                         TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        // 可用的水平方向
        Direction[] horizontalDirections = {
                Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST,
                Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST // 重复以增加某些方向的权重
        };

        // 随机决定这个高度生成的分支数量（1到最大分支数）
        int branchCount = 1 + random.nextInt(maxBranchesPerLevel);
        Set<Direction> usedDirections = new HashSet<>();

        for (int i = 0; i < branchCount; i++) {
            // 随机选择一个方向，确保不重复
            Direction branchDirection = getUniqueDirection(random, usedDirections, horizontalDirections);
            if (branchDirection == null) {
                break; // 没有可用的方向了
            }

            usedDirections.add(branchDirection);

            // 生成分支
            createApricotBranch(level, blockSetter, random, startPos, branchDirection, remainingHeight,
                    config, foliageAttachments);
        }
    }

    // 获取唯一的方向
    private Direction getUniqueDirection(RandomSource random, Set<Direction> usedDirections, Direction[] availableDirections) {
        List<Direction> possibleDirections = new ArrayList<>();

        for (Direction dir : availableDirections) {
            if (!usedDirections.contains(dir)) {
                possibleDirections.add(dir);
            }
        }

        if (possibleDirections.isEmpty()) {
            return null;
        }

        return possibleDirections.get(random.nextInt(possibleDirections.size()));
    }

    // 创建杏花树分支（带原木方向）
    private void createApricotBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                     RandomSource random, BlockPos startPos, Direction direction, int remainingHeight,
                                     TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        int branchLength = branchMinLength + random.nextInt(branchMaxLength - branchMinLength + 1);

        BlockPos currentPos = startPos;
        Direction.Axis currentAxis;

        for (int i = 0; i < branchLength && i < remainingHeight - 1; i++) {
            // 分支向前延伸
            currentPos = currentPos.relative(direction);

            // 根据向上偏置决定是否向上生长
            if (random.nextFloat() < branchUpwardBias) {
                currentPos = currentPos.above();
                // 向上生长时，原木方向变为垂直
                currentAxis = Direction.Axis.Y;
            } else {
                // 水平生长时，保持水平方向
                currentAxis = getAxisFromDirection(direction);
            }

            // 放置分支原木（带方向）
            this.placeLog(level, blockSetter, random, currentPos, config, currentAxis);

            // 在分支的每个节点都有几率生成小侧枝
            if (i > 0 && random.nextFloat() < 0.3f) {
                createSmallTwig(level, blockSetter, random, currentPos, config, foliageAttachments);
            }

            // 在分支末端添加树叶附着点
            if (i == branchLength - 1 || i == remainingHeight - 2) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.above().below(2), 0, false));
                break;
            }
        }
    }

    // 根据方向获取原木轴
    private Direction.Axis getAxisFromDirection(Direction direction) {
        return switch (direction) {
            case NORTH, SOUTH -> Direction.Axis.Z;
            case EAST, WEST -> Direction.Axis.X;
            default -> Direction.Axis.Y;
        };
    }

    // 创建小侧枝
    private void createSmallTwig(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                 RandomSource random, BlockPos startPos, TreeConfiguration config,
                                 List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        Direction twigDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        int twigLength = 1 + random.nextInt(2);

        BlockPos currentPos = startPos;
        Direction.Axis twigAxis = getAxisFromDirection(twigDirection);

        for (int i = 0; i < twigLength; i++) {
            currentPos = currentPos.relative(twigDirection);

            // 侧枝稍微向上生长
            if (random.nextBoolean()) {
                currentPos = currentPos.above();
                twigAxis = Direction.Axis.Y;
            }

            this.placeLog(level, blockSetter, random, currentPos, config, twigAxis);

            // 在侧枝末端添加树叶
            if (i == twigLength - 1) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));
            }
        }
    }

    // 重写placeLog方法以支持方向
    protected void placeLog(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                            RandomSource random, BlockPos pos, TreeConfiguration config, Direction.Axis axis) {
        BlockState logState = config.trunkProvider.getState(random, pos)
                .setValue(ModFlammableRotatedPillarBlock.AXIS, axis);
        blockSetter.accept(pos, logState);
    }
}
