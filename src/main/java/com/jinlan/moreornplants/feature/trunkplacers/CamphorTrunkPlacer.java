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
import java.util.List;
import java.util.function.BiConsumer;

public class CamphorTrunkPlacer extends TrunkPlacer {
    public static final Codec<CamphorTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(2, 6).fieldOf("fork_height").forGetter(placer -> placer.forkHeight),
                    Codec.intRange(2, 4).fieldOf("min_branches").forGetter(placer -> placer.minBranches),
                    Codec.intRange(3, 6).fieldOf("max_branches").forGetter(placer -> placer.maxBranches),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("branch_chance").forGetter(placer -> placer.branchChance),
                    Codec.intRange(2, 6).fieldOf("branch_length").forGetter(placer -> placer.branchLength)
            ).apply(instance, CamphorTrunkPlacer::new)
    );

    private final int forkHeight;
    private final int minBranches;
    private final int maxBranches;
    private final float branchChance;
    private final int branchLength;

    public CamphorTrunkPlacer(int baseHeight, int heightRandA, int heightRandB,
                              int forkHeight, int minBranches, int maxBranches,
                              float branchChance, int branchLength) {
        super(baseHeight, heightRandA, heightRandB);
        this.forkHeight = forkHeight;
        this.minBranches = minBranches;
        this.maxBranches = maxBranches;
        this.branchChance = branchChance;
        this.branchLength = branchLength;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.CAMPHOR_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                            RandomSource random, int freeTreeHeight, BlockPos pos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();

        BlockPos currentPos = pos;

        // 放置主干直到分叉点
        for (int height = 0; height < forkHeight && height < freeTreeHeight; height++) {
            this.placeLog(level, blockSetter, random, currentPos, config, Direction.Axis.Y);
            currentPos = currentPos.above();
        }

        // 在分叉点生成多个主干
        int branchCount = minBranches + random.nextInt(maxBranches - minBranches + 1);
        List<ForkInfo> forkInfos = generateForks(level, blockSetter, random, currentPos, branchCount, config);

        // 为每个主干生成分枝
        for (ForkInfo forkInfo : forkInfos) {
            foliageAttachments.addAll(generateMainTrunkWithBranches(level, blockSetter, random, forkInfo.position, forkInfo.direction, freeTreeHeight - forkHeight, config));
        }

        return foliageAttachments;
    }

    // 生成分叉点
    private List<ForkInfo> generateForks(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                         RandomSource random, BlockPos centerPos, int branchCount, TreeConfiguration config) {
        List<ForkInfo> forkInfos = new ArrayList<>();
        List<Direction> availableDirections = new ArrayList<>(List.of(Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST));

        // 随机打乱方向列表
        for (int i = availableDirections.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Direction temp = availableDirections.get(i);
            availableDirections.set(i, availableDirections.get(j));
            availableDirections.set(j, temp);
        }

        // 确保生成指定数量的分叉，每个方向不同
        int actualCount = Math.min(branchCount, availableDirections.size());
        for (int i = 0; i < actualCount; i++) {
            Direction direction = availableDirections.get(i);
            BlockPos forkPos = centerPos.relative(direction);

            // 放置分叉点原木（水平方向）
            this.placeLog(level, blockSetter, random, forkPos, config, direction.getAxis());
            forkInfos.add(new ForkInfo(forkPos, direction));
        }

        return forkInfos;
    }

    // 分叉信息类
        private record ForkInfo(BlockPos position, Direction direction) {
    }

    // 生成主干及其分枝
    private List<FoliagePlacer.FoliageAttachment> generateMainTrunkWithBranches(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                                                RandomSource random, BlockPos startPos, Direction growthDirection, int remainingHeight, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();
        BlockPos currentPos = startPos;

        // 生成主干
        for (int height = 0; height < remainingHeight; height++) {
            this.placeLog(level, blockSetter, random, currentPos, config, Direction.Axis.Y);

            // 在第二格或第三格位置继续向外移动一格
            if ((height == 1 || height == 2) && random.nextFloat() < 0.7f) {
                currentPos = currentPos.relative(growthDirection);
                // 放置移动后的原木（水平方向）
                this.placeLog(level, blockSetter, random, currentPos, config, growthDirection.getAxis());
            }

            // 有概率生成分枝
            if (height >= 1 && height <= remainingHeight - 2 && random.nextFloat() < branchChance) {
                generateBranch(level, blockSetter, random, currentPos, config, foliageAttachments);
            }

            currentPos = currentPos.above();
        }

        // 添加主干顶端的树叶附着点
        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.above(2), 0, false));

        return foliageAttachments;
    }

    // 生成分枝
    private void generateBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                RandomSource random, BlockPos startPos, TreeConfiguration config,
                                List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        BlockPos currentPos = startPos;
        Direction.Axis axis = getAxisFromDirection(direction);

        // 生成分枝
        for (int i = 0; i < branchLength; i++) {
            currentPos = currentPos.relative(direction);

            // 分枝稍微向上倾斜
            if (random.nextBoolean()) {
                currentPos = currentPos.above();
            }

            this.placeLog(level, blockSetter, random, currentPos, config, axis);

            // 在分枝末端添加树叶附着点
            if (i == branchLength - 1) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.above(2), 0, false));
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

    // 重写placeLog方法以支持方向
    protected void placeLog(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                            RandomSource random, BlockPos pos, TreeConfiguration config, Direction.Axis axis) {
        BlockState logState = config.trunkProvider.getState(random, pos)
                .setValue(ModFlammableRotatedPillarBlock.AXIS, axis);
        blockSetter.accept(pos, logState);
    }
}
