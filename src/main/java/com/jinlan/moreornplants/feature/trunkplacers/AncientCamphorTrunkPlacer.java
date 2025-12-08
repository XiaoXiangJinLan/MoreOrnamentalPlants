package com.jinlan.moreornplants.feature.trunkplacers;

import com.jinlan.moreornplants.block.ModRotatedPillarBlock;
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

public class AncientCamphorTrunkPlacer extends TrunkPlacer {
    public static final Codec<AncientCamphorTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(2, 6).fieldOf("fork_height").forGetter(placer -> placer.forkHeight),
                    Codec.intRange(2, 4).fieldOf("min_branches").forGetter(placer -> placer.minBranches),
                    Codec.intRange(3, 6).fieldOf("max_branches").forGetter(placer -> placer.maxBranches),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("branch_chance").forGetter(placer -> placer.branchChance),
                    Codec.intRange(2, 6).fieldOf("branch_length").forGetter(placer -> placer.branchLength)
            ).apply(instance, AncientCamphorTrunkPlacer::new)
    );

    private final int forkHeight;
    private final int minBranches;
    private final int maxBranches;
    private final float branchChance;
    private final int branchLength;

    public AncientCamphorTrunkPlacer(int baseHeight, int heightRandA, int heightRandB,
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
        return ModTrunkPlacerTypes.ANCIENT_CAMPHOR_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                            RandomSource random, int freeTreeHeight, BlockPos pos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();

        BlockPos currentPos = pos;

        // 生成主干根部（底部两格）
        createRootBase(level, blockSetter, random, currentPos, config);

        // 放置主干直到分叉点，并在基部变粗
        for (int height = 0; height < forkHeight && height < freeTreeHeight; height++) {
            // 放置主干原木
            this.placeLog(level, blockSetter, random, currentPos, config, Direction.Axis.Y);

            // 在基部范围内（fork_height高度内）在四个面放置原木使其变粗
            if (height < forkHeight) {
                createThickenedBase(level, blockSetter, random, currentPos, config, height);
            }

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

    // 创建主干根部（模拟古树根基）
    private void createRootBase(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                RandomSource random, BlockPos centerPos, TreeConfiguration config) {
        // 四个主要方向
        Direction[] directions = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

        // 底部第一层：生成向外延伸的根部
        for (Direction dir : directions) {
            BlockPos rootPos = centerPos.relative(dir);

            // 放置根部原木（水平方向）
            this.placeLog(level, blockSetter, random, rootPos, config, dir.getAxis());

            // 检查根部方块下方是否是空气，如果是则向下延伸
            if (level.isStateAtPosition(rootPos.below(), state -> state.isAir())) {
                this.placeLog(level, blockSetter, random, rootPos.below(), config, dir.getAxis());
            }

            // 有概率继续向外延伸根部
            if (random.nextFloat() < 0.6f) {
                BlockPos extendedPos = rootPos.relative(dir);
                this.placeLog(level, blockSetter, random, extendedPos, config, dir.getAxis());

                // 检查延伸根部下方是否是空气，如果是则向下延伸
                if (level.isStateAtPosition(extendedPos.below(), state -> state.isAir())) {
                    this.placeLog(level, blockSetter, random, extendedPos.below(), config, dir.getAxis());
                }
            }
        }

        // 底部第二层：生成更复杂的根部结构
        BlockPos secondLayerPos = centerPos.above();
        for (Direction dir : directions) {
            // 在斜角方向也生成根部
            if (random.nextFloat() < 0.5f) {
                Direction diagonalDir = dir.getClockWise();
                BlockPos diagonalPos = secondLayerPos.relative(dir).relative(diagonalDir);
                this.placeLog(level, blockSetter, random, diagonalPos, config, dir.getAxis());

                // 检查斜角根部下方是否是空气，如果是则向下延伸
                if (level.isStateAtPosition(diagonalPos.below(), state -> state.isAir())) {
                    this.placeLog(level, blockSetter, random, diagonalPos.below(), config, dir.getAxis());
                }
            }
        }
    }

    // 创建变粗的主干基部
    private void createThickenedBase(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                     RandomSource random, BlockPos centerPos, TreeConfiguration config, int currentHeight) {
        // 四个主要方向
        Direction[] directions = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

        // 在所有方向放置加粗方块
        for (Direction dir : directions) {
            BlockPos thickPos = centerPos.relative(dir);
            this.placeLog(level, blockSetter, random, thickPos, config, Direction.Axis.Y);

            // 在最底层生成额外的加粗方块
            if (currentHeight == 0) {
                BlockPos extraPos = thickPos.relative(dir.getClockWise());
                this.placeLog(level, blockSetter, random, extraPos, config, Direction.Axis.Y);
            }
        }
    }

    // 生成分叉点（保持原有逻辑）
    private List<ForkInfo> generateForks(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                         RandomSource random, BlockPos centerPos, int branchCount, TreeConfiguration config) {
        List<ForkInfo> forkInfos = new ArrayList<>();

        // 强制使用四个基本方向
        List<Direction> directions = List.of(Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST);

        // 确保必定生成四个分叉
        for (Direction direction : directions) {
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

    // 生成主干及其分枝（保持原有逻辑）
    private List<FoliagePlacer.FoliageAttachment> generateMainTrunkWithBranches(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                                                RandomSource random, BlockPos startPos, Direction growthDirection, int remainingHeight, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();
        BlockPos currentPos = startPos;

        for (int height = 0; height < remainingHeight; height++) {
            this.placeLog(level, blockSetter, random, currentPos, config, Direction.Axis.Y);

            if ((height == 1 || height == 2) && random.nextFloat() < 0.7f) {
                currentPos = currentPos.relative(growthDirection);
                this.placeLog(level, blockSetter, random, currentPos, config, growthDirection.getAxis());
            }

            if (height >= 1 && height <= remainingHeight - 2 && random.nextFloat() < branchChance) {
                generateBranch(level, blockSetter, random, currentPos, config, foliageAttachments);
            }

            currentPos = currentPos.above();
        }

        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.above(2), 0, false));
        return foliageAttachments;
    }

    // 生成分枝（保持原有逻辑）
    private void generateBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                RandomSource random, BlockPos startPos, TreeConfiguration config,
                                List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(random);
        BlockPos currentPos = startPos;
        Direction.Axis axis = getAxisFromDirection(direction);

        for (int i = 0; i < branchLength; i++) {
            currentPos = currentPos.relative(direction);
            if (random.nextBoolean()) {
                currentPos = currentPos.above();
            }
            this.placeLog(level, blockSetter, random, currentPos, config, axis);
            if (i == branchLength - 1) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.above(2), 0, false));
            }
        }
    }

    // 根据方向获取原木轴（保持原有逻辑）
    private Direction.Axis getAxisFromDirection(Direction direction) {
        return switch (direction) {
            case NORTH, SOUTH -> Direction.Axis.Z;
            case EAST, WEST -> Direction.Axis.X;
            default -> Direction.Axis.Y;
        };
    }

    // 重写placeLog方法以支持方向（保持原有逻辑）
    protected void placeLog(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                            RandomSource random, BlockPos pos, TreeConfiguration config, Direction.Axis axis) {
        BlockState logState = config.trunkProvider.getState(random, pos)
                .setValue(ModRotatedPillarBlock.AXIS, axis);
        blockSetter.accept(pos, logState);
    }
}
