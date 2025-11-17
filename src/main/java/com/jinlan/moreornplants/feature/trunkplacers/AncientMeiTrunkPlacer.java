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

public class AncientMeiTrunkPlacer extends TrunkPlacer {
    public static final Codec<AncientMeiTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(1, 5).fieldOf("fork_chance").forGetter(placer -> placer.forkChance),
                    Codec.intRange(2, 12).fieldOf("min_fork_length").forGetter(placer -> placer.minForkLength),
                    Codec.intRange(4, 16).fieldOf("max_fork_length").forGetter(placer -> placer.maxForkLength),
                    Codec.floatRange(0.1F, 0.5F).fieldOf("bend_factor").forGetter(placer -> placer.bendFactor),
                    Codec.intRange(0, 90).fieldOf("max_fork_angle").forGetter(placer -> placer.maxForkAngle),
                    Codec.intRange(3, 8).fieldOf("top_branch_count").forGetter(placer -> placer.topBranchCount),
                    Codec.intRange(1, 5).fieldOf("top_branch_length").forGetter(placer -> placer.topBranchLength)
            ).apply(instance, AncientMeiTrunkPlacer::new)
    );

    private final int forkChance;
    private final int minForkLength;
    private final int maxForkLength;
    private final float bendFactor;
    private final int maxForkAngle;
    private final int topBranchCount; // 主干顶端小分枝数量
    private final int topBranchLength; // 主干顶端小分枝长度

    public AncientMeiTrunkPlacer(int baseHeight, int heightRandA, int heightRandB,
                               int forkChance, int minForkLength, int maxForkLength,
                               float bendFactor, int maxForkAngle,
                               int topBranchCount, int topBranchLength) {
        super(baseHeight, heightRandA, heightRandB);
        this.forkChance = forkChance;
        this.minForkLength = minForkLength;
        this.maxForkLength = maxForkLength;
        this.bendFactor = bendFactor;
        this.maxForkAngle = maxForkAngle;
        this.topBranchCount = topBranchCount;
        this.topBranchLength = topBranchLength;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.ANCIENT_MEI_TRUNK_PLACER.get();
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

        // 记录主干顶端3到5格内的位置，用于生成小分枝
        List<BlockPos> topSectionPositions = new ArrayList<>();

        // 记录主干中间部分的位置，用于保底侧枝生成
        List<BlockPos> middleSectionPositions = new ArrayList<>();

        // 用于跟踪是否已经在中间部分生成了侧枝
        boolean middleBranchGenerated = false;

        // 计算主干底部加粗的高度范围，底部加粗的最高处是i=2
        int bottomThickeningEndHeight = 2; // 底部加粗结束的高度

        // 记录第三层选择的方向对，用于第四层
        Direction[] secondLayerDirections = null;

        // 放置弯曲的主干
        for (int i = 0; i < freeTreeHeight; i++) {
            // 在底部加粗范围内，在四个方向添加方块
            if (i <= bottomThickeningEndHeight) {
                // 底部加粗逻辑：在主干四个方向放置额外的方块
                secondLayerDirections = createThickenedTrunk(level, blockSetter, random, currentPos, config, i, secondLayerDirections);
            }

            // 有一定几率轻微改变主干方向
            if (random.nextFloat() < bendFactor && i > 4 && i < freeTreeHeight - 2) {
                // 从水平方向中随机选择一个轻微偏移
                Direction horizontalDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);

                // 应用偏移
                currentPos = currentPos.relative(horizontalDirection);
                currentDirection = horizontalDirection;
            }
            // 放置主干方块
            this.placeLog(level, blockSetter, random, currentPos, config);

            // 记录主干顶端4到5格内的位置
            if (i >= freeTreeHeight - 5 && i <= freeTreeHeight - 4) {
                topSectionPositions.add(currentPos.immutable());
            }

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

                    // 放置侧枝
                    this.createBranch(level, blockSetter, random, currentPos, forkDirection, forkLength,
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

                // 放置保底侧枝
                this.createBranch(level, blockSetter, random, middlePos, forkDirection, forkLength,
                        config, foliageAttachments, 0);
            }
        }

        // 在主干上层部分（距离顶端5格内）生成多个小分枝
        if (!topSectionPositions.isEmpty()) {
            generateTopBranches(level, blockSetter, random, topSectionPositions, config, foliageAttachments);
        }

        // 在主干顶端也添加一个树叶附着点
        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.below(), 0, false));

        return foliageAttachments;
    }

    // 创建变粗的主干底部
    private Direction[] createThickenedTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                             RandomSource random, BlockPos centerPos, TreeConfiguration config,
                                             int currentHeight, Direction[] secondLayerDirections) {
        // 四个主要方向
        Direction[] directions = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

        // 根据高度决定变粗的程度
        if (currentHeight == 0) {
            // 最底层：在四个方向各添加一个方块
            for (Direction dir : directions) {
                BlockPos thickPos = centerPos.relative(dir);
                this.placeLog(level, blockSetter, random, thickPos, config);

                // 检查加粗方块下方是否是空气，如果是则向下延伸
                if (level.isStateAtPosition(thickPos.below(), state -> state.isAir())) {
                    this.placeLog(level, blockSetter, random, thickPos.below(), config);
                }
            }
        } else if (currentHeight == 1) {
            // 第三层：在相对的两个方向添加方块
            // 使用北-南或东-西方向对，随机选择一组
            if (random.nextBoolean()) {
                // 北-南方向
                this.placeLog(level, blockSetter, random, centerPos.north(), config);
                this.placeLog(level, blockSetter, random, centerPos.south(), config);
                secondLayerDirections = new Direction[]{Direction.NORTH, Direction.SOUTH};
            } else {
                // 东-西方向
                this.placeLog(level, blockSetter, random, centerPos.east(), config);
                this.placeLog(level, blockSetter, random, centerPos.west(), config);
                secondLayerDirections = new Direction[]{Direction.EAST, Direction.WEST};
            }
        } else if (currentHeight == 2) {
            // 第四层：只在一个方向添加方块，形成逐渐变细的效果
            Direction selectedDirection = secondLayerDirections[random.nextInt(secondLayerDirections.length)];
            this.placeLog(level, blockSetter, random, centerPos.relative(selectedDirection), config);
        }

        return secondLayerDirections;
    }

    //获取可用的侧枝方向列表，排除已经使用过的方向，并确保方向在最大角度限制内
    private List<Direction> getAvailableDirections(Set<Direction> usedDirections, Direction currentDirection, RandomSource random) {
        List<Direction> availableDirections = new ArrayList<>();

        // 获取所有水平方向
        Direction[] allDirections = Direction.Plane.HORIZONTAL.stream().toArray(Direction[]::new);

        for (Direction dir : allDirections) {
            // 检查是否已经使用过
            if (usedDirections.contains(dir)) {
                continue;
            }

            // 检查是否在最大角度限制内
            int angleDiff = getAngleDifference(currentDirection, dir);
            if (angleDiff <= maxForkAngle) {
                availableDirections.add(dir);
            }
        }

        // 如果没有符合角度限制的方向，放宽限制
        if (availableDirections.isEmpty()) {
            for (Direction dir : allDirections) {
                if (!usedDirections.contains(dir)) {
                    availableDirections.add(dir);
                }
            }
        }

        return availableDirections;
    }

    // 生成主干顶端的小分枝
    private void generateTopBranches(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                     RandomSource random, List<BlockPos> topPositions, TreeConfiguration config,
                                     List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        // 随机选择位置生成小分枝
        List<BlockPos> selectedPositions = new ArrayList<>();
        for (int i = 0; i < topBranchCount; i++) {
            if (topPositions.isEmpty()) break;

            int index = random.nextInt(topPositions.size());
            BlockPos selectedPos = topPositions.get(index);
            selectedPositions.add(selectedPos);
            }

        // 生成指定数量的小分枝
        for (BlockPos startPos : selectedPositions) {
            // 随机选择方向 (主要围绕顶部)
            Direction direction = Direction.Plane.HORIZONTAL.getRandomDirection(random);

            // 随机分枝长度
            int length = 1 + random.nextInt(topBranchLength);

            // 创建小分枝
            createTopBranch(level, blockSetter, random, startPos, direction, length, config, foliageAttachments);
        }
    }

    // 创建主干上层部分的小分枝
    private void createTopBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                 RandomSource random, BlockPos startPos, Direction direction, int length,
                                 TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        BlockPos currentPos = startPos;

        for (int i = 0; i < length; i++) {
            // 每次移动都向上，同时向水平方向延伸，形成斜向上生长
            currentPos = currentPos.above().relative(direction);

            // 放置小分枝方块
            this.placeLog(level, blockSetter, random, currentPos, config);

            // 在小分枝末端添加树叶附着点
            if (i == length - 1) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));
            }
        }
    }

    // 根据当前主干方向计算侧枝方向
    private Direction getForkDirection(RandomSource random, Direction currentDirection) {
        // 如果主干是直的向上，随机选择水平方向
        if (currentDirection == Direction.UP) {
            return Direction.Plane.HORIZONTAL.getRandomDirection(random);
        }

        // 否则，基于当前主干方向计算侧枝方向
        // 使用最大分叉角度限制侧枝方向
        Direction[] possibleDirections = {
                currentDirection,
                currentDirection.getClockWise(),
                currentDirection.getCounterClockWise(),
                currentDirection.getOpposite()
        };

        // 根据最大角度限制选择合适的方向
        List<Direction> validDirections = new ArrayList<>();
        for (Direction dir : possibleDirections) {
            // 计算与当前方向的夹角 (简化计算)
            int angleDiff = Math.abs(getAngleDifference(currentDirection, dir));
            if (angleDiff <= maxForkAngle) {
                validDirections.add(dir);
            }
        }

        // 如果没有有效方向，返回当前方向
        if (validDirections.isEmpty()) {
            return currentDirection;
        }

        // 从有效方向中随机选择一个
        return validDirections.get(random.nextInt(validDirections.size()));
    }

    // 简化计算两个方向之间的角度差
    private int getAngleDifference(Direction dir1, Direction dir2) {
        if (dir1 == dir2) return 0;

        // 将方向转换为角度 (0-360)
        int angle1 = directionToAngle(dir1);
        int angle2 = directionToAngle(dir2);

        // 计算最小角度差
        int diff = Math.abs(angle1 - angle2);
        return Math.min(diff, 360 - diff);
    }

    // 将方向转换为角度
    private int directionToAngle(Direction dir) {
        switch (dir) {
            case NORTH: return 0;
            case EAST: return 90;
            case SOUTH: return 180;
            case WEST: return 270;
            default: return 0;
        }
    }

    // 创建侧枝 (递归方法)
    private void createBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                              RandomSource random, BlockPos startPos, Direction direction, int length,
                              TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments,
                              int recursionDepth) {
        BlockPos currentPos = startPos;
        Direction currentDirection = direction;

        // 记录是否已经在中间部分生成了次级侧枝
        boolean middleBranchGenerated = false;

        for (int i = 0; i < length; i++) {
            // 侧枝向上倾斜 (根据递归深度调整倾斜程度)
            float upwardBias = 0.7f - (recursionDepth * 0.2f); // 递归越深，向上倾斜越少
            if (random.nextFloat() < upwardBias) {
                currentPos = currentPos.above();
            }

            // 侧枝向前延伸
            currentPos = currentPos.relative(currentDirection);

            // 放置侧枝方块
            this.placeLog(level, blockSetter, random, currentPos, config);

            // 在侧枝的中间部分（大约1/3到2/3处）强制生成一个次级侧枝
            if (!middleBranchGenerated && i >= length / 3 && i <= 2 * length / 3 && recursionDepth < 2) {
                // 确定次级侧枝方向 - 始终与当前侧枝垂直
                Direction subDirection = getUpwardBranchDirection(random, currentDirection);
                int subLength = 2 + random.nextInt(Math.max(1, length - i - 2));

                // 创建次级侧枝
                this.createBranch(level, blockSetter, random, currentPos, subDirection, subLength,
                        config, foliageAttachments, recursionDepth + 1);
                middleBranchGenerated = true;
            }

            // 在分支末端添加树叶附着点
            if (i == length - 1) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));
            }

            // 限制递归深度，防止无限分叉
            if (recursionDepth < 2 && i > 1 && random.nextInt(5) == 0) {
                // 确定次级侧枝方向 - 基于当前侧枝方向
                Direction subDirection = getForkDirection(random, currentDirection);
                int subLength = 1 + random.nextInt(Math.max(1, length - i - 1));

                // 创建次级侧枝
                this.createBranch(level, blockSetter, random, currentPos, subDirection, subLength,
                        config, foliageAttachments, recursionDepth + 1);
            }
        }
    }

    //获取向上或斜向上的分支方向，用于生成次级侧枝
    private Direction getUpwardBranchDirection(RandomSource random, Direction currentDirection) {
        if (currentDirection.getAxis().isHorizontal()) {
            // 根据当前方向确定垂直方向
            if (currentDirection == Direction.NORTH || currentDirection == Direction.SOUTH) {
                // 南北方向的侧枝，次级侧枝取东西方向
                return random.nextBoolean() ? Direction.EAST : Direction.WEST;
            } else {
                // 东西方向的侧枝，次级侧枝取南北方向
                return random.nextBoolean() ? Direction.NORTH : Direction.SOUTH;
            }
        }

        // 如果当前方向是向上或其他方向，随机选择水平方向
        return Direction.Plane.HORIZONTAL.getRandomDirection(random);
    }
}
