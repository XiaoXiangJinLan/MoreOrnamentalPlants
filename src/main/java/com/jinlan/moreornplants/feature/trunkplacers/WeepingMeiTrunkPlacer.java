package com.jinlan.moreornplants.feature.trunkplacers;

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

public class WeepingMeiTrunkPlacer extends TrunkPlacer {
    public static final Codec<WeepingMeiTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(1, 5).fieldOf("fork_chance").forGetter(placer -> placer.forkChance),
                    Codec.intRange(2, 12).fieldOf("min_fork_length").forGetter(placer -> placer.minForkLength),
                    Codec.intRange(4, 16).fieldOf("max_fork_length").forGetter(placer -> placer.maxForkLength),
                    Codec.floatRange(0.1F, 0.5F).fieldOf("bend_factor").forGetter(placer -> placer.bendFactor),
                    Codec.intRange(0, 90).fieldOf("max_fork_angle").forGetter(placer -> placer.maxForkAngle),
                    Codec.floatRange(0.1F, 0.9F).fieldOf("weeping_factor").forGetter(placer -> placer.weepingFactor)
            ).apply(instance, WeepingMeiTrunkPlacer::new)
    );

    private final int forkChance;
    private final int minForkLength;
    private final int maxForkLength;
    private final float bendFactor;
    private final int maxForkAngle;
    private final float weepingFactor; // 下垂因子，控制下垂程度

    public WeepingMeiTrunkPlacer(int baseHeight, int heightRandA, int heightRandB,
                                 int forkChance, int minForkLength, int maxForkLength,
                                 float bendFactor, int maxForkAngle, float weepingFactor) {
        super(baseHeight, heightRandA, heightRandB);
        this.forkChance = forkChance;
        this.minForkLength = minForkLength;
        this.maxForkLength = maxForkLength;
        this.bendFactor = bendFactor;
        this.maxForkAngle = maxForkAngle;
        this.weepingFactor = weepingFactor;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.WEEPING_MEI_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                            RandomSource random, int freeTreeHeight, BlockPos pos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();

        // 用于记录已经生成过侧枝的方向
        Set<Direction> usedDirections = new HashSet<>();

        // 主干当前方向 (初始为向上)
        Direction currentDirection = Direction.UP;
        BlockPos currentPos = pos;

        // 记录主干中间部分的位置，用于保底侧枝生成
        List<BlockPos> middleSectionPositions = new ArrayList<>();

        // 用于跟踪是否已经在中间部分生成了侧枝
        boolean middleBranchGenerated = false;

        // 放置弯曲的主干
        for (int i = 0; i < freeTreeHeight; i++) {
            // 有一定几率轻微改变主干方向
            if (random.nextFloat() < bendFactor && i > 1 && i < freeTreeHeight - 2) {
                // 从水平方向中随机选择一个轻微偏移
                Direction horizontalDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);

                // 应用偏移
                currentPos = currentPos.relative(horizontalDirection);
                currentDirection = horizontalDirection;
            }

            // 放置主干方块
            this.placeLog(level, blockSetter, random, currentPos, config);

            // 记录主干中间部分的位置（从1/3高度到2/3高度）
            if (i >= freeTreeHeight / 3 && i <= 2 * freeTreeHeight / 3) {
                middleSectionPositions.add(currentPos.immutable());
            }

            // 在一定高度处有几率产生分叉，但确保每个方向只生成一个侧枝
            if (i > 4 && i < freeTreeHeight - 8 && random.nextInt(forkChance) == 0) {
                // 获取可用的分叉方向（排除已经使用过的方向）
                List<Direction> availableDirections = getAvailableDirections(usedDirections, currentDirection, random);

                // 如果有可用的方向，则生成侧枝
                if (!availableDirections.isEmpty()) {
                    Direction forkDirection = availableDirections.get(random.nextInt(availableDirections.size()));
                    int forkLength = minForkLength + random.nextInt(maxForkLength - minForkLength + 1);

                    // 记录已使用的方向
                    usedDirections.add(forkDirection);

                    // 标记在中间部分生成了侧枝
                    if (i >= freeTreeHeight / 3 && i <= 2 * freeTreeHeight / 3) {
                        middleBranchGenerated = true;
                    }

                    // 放置侧枝（使用新的下垂分支创建方法）
                    this.createWeepingBranch(level, blockSetter, random, currentPos, forkDirection, forkLength,
                            config, foliageAttachments, 0);
                }
            }

            // 移动到下一个位置
            currentPos = currentPos.above();
        }

        // 保底机制：如果在主干中间部分没有生成任何侧枝，强制生成一个
        if (!middleBranchGenerated && !middleSectionPositions.isEmpty()) {
            // 从中间部分随机选择一个位置
            BlockPos middlePos = middleSectionPositions.get(random.nextInt(middleSectionPositions.size()));

            // 获取可用的方向
            List<Direction> availableDirections = getAvailableDirections(usedDirections, Direction.UP, random);

            if (!availableDirections.isEmpty()) {
                Direction forkDirection = availableDirections.get(random.nextInt(availableDirections.size()));
                int forkLength = minForkLength + random.nextInt(maxForkLength - minForkLength + 1);

                // 记录已使用的方向
                usedDirections.add(forkDirection);

                // 放置保底侧枝（使用新的下垂分支创建方法）
                this.createWeepingBranch(level, blockSetter, random, middlePos, forkDirection, forkLength,
                        config, foliageAttachments, 0);
            }
        }

        // 在主干顶端也添加一个树叶附着点
        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));

        return foliageAttachments;
    }

    // 创建下垂的侧枝（主要修改这个方法）
    private void createWeepingBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                     RandomSource random, BlockPos startPos, Direction direction, int length,
                                     TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments,
                                     int recursionDepth) {
        BlockPos currentPos = startPos;
        Direction currentDirection = direction;

        // 记录是否已经在中间部分生成了次级侧枝
        boolean middleBranchGenerated = false;

        for (int i = 0; i < length; i++) {
            // 侧枝生长逻辑：前2/3部分向上生长，后1/3部分开始下垂
            if (i < 2 * length / 3) {
                // 前2/3：向上生长
                if (random.nextFloat() < 0.7f - (recursionDepth * 0.2f)) {
                    currentPos = currentPos.above();
                }
            } else {
                // 后1/3：开始下垂
                // 根据下垂因子决定下垂的概率
                if (random.nextFloat() < weepingFactor) {
                    currentPos = currentPos.below();
                }
            }

            // 侧枝向前延伸
            currentPos = currentPos.relative(currentDirection);

            // 放置侧枝方块
            this.placeLog(level, blockSetter, random, currentPos, config);

            // 在侧枝的中间部分（大约1/3到2/3处）强制生成一个次级侧枝
            if (!middleBranchGenerated && i >= length / 3 && i <= 2 * length / 3 && recursionDepth < 2) {
                // 确定次级侧枝方向
                Direction subDirection = getUpwardBranchDirection(random, currentDirection);
                int subLength = 2 + random.nextInt(Math.max(1, length - i - 2));

                // 创建次级侧枝（也使用下垂分支创建方法）
                this.createWeepingBranch(level, blockSetter, random, currentPos, subDirection, subLength,
                        config, foliageAttachments, recursionDepth + 1);
                middleBranchGenerated = true;
            }

            // 在分支末端添加树叶附着点
            if (i == length - 1) {
                BlockPos foliagePos = currentPos.above();
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(foliagePos, 0, false));
            }

            // 限制递归深度，防止无限分叉
            if (recursionDepth < 2 && i > 1 && random.nextInt(5) == 0) {
                // 确定次级侧枝方向 - 基于当前侧枝方向
                Direction subDirection = getForkDirection(random, currentDirection);
                int subLength = 1 + random.nextInt(Math.max(1, length - i - 1));

                // 创建次级侧枝（也使用下垂分支创建方法）
                this.createWeepingBranch(level, blockSetter, random, currentPos, subDirection, subLength,
                        config, foliageAttachments, recursionDepth + 1);
            }
        }
    }

    private List<Direction> getAvailableDirections(Set<Direction> usedDirections, Direction currentDirection, RandomSource random) {
        // 实现与AncientMeiTrunkPlacer相同
        List<Direction> availableDirections = new ArrayList<>();
        Direction[] allDirections = Direction.Plane.HORIZONTAL.stream().toArray(Direction[]::new);

        for (Direction dir : allDirections) {
            if (usedDirections.contains(dir)) {
                continue;
            }

            int angleDiff = getAngleDifference(currentDirection, dir);
            if (angleDiff <= maxForkAngle) {
                availableDirections.add(dir);
            }
        }

        if (availableDirections.isEmpty()) {
            for (Direction dir : allDirections) {
                if (!usedDirections.contains(dir)) {
                    availableDirections.add(dir);
                }
            }
        }

        return availableDirections;
    }

    private Direction getForkDirection(RandomSource random, Direction currentDirection) {
        // 实现与AncientMeiTrunkPlacer相同
        if (currentDirection == Direction.UP) {
            return Direction.Plane.HORIZONTAL.getRandomDirection(random);
        }

        Direction[] possibleDirections = {
                currentDirection,
                currentDirection.getClockWise(),
                currentDirection.getCounterClockWise(),
                currentDirection.getOpposite()
        };

        List<Direction> validDirections = new ArrayList<>();
        for (Direction dir : possibleDirections) {
            int angleDiff = Math.abs(getAngleDifference(currentDirection, dir));
            if (angleDiff <= maxForkAngle) {
                validDirections.add(dir);
            }
        }

        if (validDirections.isEmpty()) {
            return currentDirection;
        }

        return validDirections.get(random.nextInt(validDirections.size()));
    }

    private int getAngleDifference(Direction dir1, Direction dir2) {
        // 实现与AncientMeiTrunkPlacer相同
        if (dir1 == dir2) return 0;

        int angle1 = directionToAngle(dir1);
        int angle2 = directionToAngle(dir2);

        int diff = Math.abs(angle1 - angle2);
        return Math.min(diff, 360 - diff);
    }

    private int directionToAngle(Direction dir) {
        // 实现与AncientMeiTrunkPlacer相同
        switch (dir) {
            case NORTH: return 0;
            case EAST: return 90;
            case SOUTH: return 180;
            case WEST: return 270;
            default: return 0;
        }
    }

    private Direction getUpwardBranchDirection(RandomSource random, Direction currentDirection) {
        // 实现与AncientMeiTrunkPlacer相同
        List<Direction> preferredDirections = new ArrayList<>();
        preferredDirections.add(Direction.UP);

        if (currentDirection.getAxis().isHorizontal()) {
            preferredDirections.add(currentDirection);
            preferredDirections.add(currentDirection.getClockWise());
            preferredDirections.add(currentDirection.getCounterClockWise());
        }

        return preferredDirections.get(random.nextInt(preferredDirections.size()));
    }
}
