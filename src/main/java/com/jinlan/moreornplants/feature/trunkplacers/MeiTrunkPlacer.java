package com.jinlan.moreornplants.feature.trunkplacers;

import com.jinlan.moreornplants.init.ModTrunkPlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
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
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class MeiTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<MeiTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(1, 5).fieldOf("fork_chance").forGetter(placer -> placer.forkChance),
                    Codec.intRange(1, 8).fieldOf("min_fork_length").forGetter(placer -> placer.minForkLength),
                    Codec.intRange(1, 12).fieldOf("max_fork_length").forGetter(placer -> placer.maxForkLength),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("bend_factor").forGetter(placer -> placer.bendFactor),
                    Codec.intRange(0, 90).fieldOf("max_fork_angle").forGetter(placer -> placer.maxForkAngle)
            ).apply(instance, MeiTrunkPlacer::new)
    );

    private final int forkChance;
    private final int minForkLength;
    private final int maxForkLength;
    private final float bendFactor; // 控制主干弯曲程度的因子 (0-1)
    private final int maxForkAngle; // 最大分叉角度 (0-90度)

    public MeiTrunkPlacer(int baseHeight, int heightRandA, int heightRandB,
                           int forkChance, int minForkLength, int maxForkLength,
                           float bendFactor, int maxForkAngle) {
        super(baseHeight, heightRandA, heightRandB);
        this.forkChance = forkChance;
        this.minForkLength = minForkLength;
        this.maxForkLength = maxForkLength;
        this.bendFactor = bendFactor;
        this.maxForkAngle = maxForkAngle;
    }

    @Override
    @NotNull
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.MEI_TRUNK_PLACER.get();
    }

    @Override
    @NotNull
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                            RandomSource random, int freeTreeHeight, BlockPos pos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();

        // 主干当前方向 (初始为向上)
        Direction currentDirection = Direction.UP;
        BlockPos currentPos = pos;

        // 放置弯曲的主干
        for (int i = 0; i < freeTreeHeight; i++) {
            // 有一定几率轻微改变主干方向
            if (random.nextFloat() < bendFactor && i > 0 && i < freeTreeHeight - 2) {
                // 从水平方向中随机选择一个轻微偏移
                Direction horizontalDirection = Direction.Plane.HORIZONTAL.getRandomDirection(random);

                // 应用偏移
                currentPos = currentPos.relative(horizontalDirection);
                currentDirection = horizontalDirection; // 更新当前方向
            }

            // 放置主干方块
            this.placeLog(level, blockSetter, random, currentPos, config);

            // 在一定高度处有几率产生分叉
            if (i > 2 && i < freeTreeHeight - 3 && random.nextInt(forkChance) == 0) {
                // 确定分叉方向 - 基于当前主干方向
                Direction forkDirection = getForkDirection(random, currentDirection);
                int forkLength = minForkLength + random.nextInt(maxForkLength - minForkLength + 1);

                // 放置分叉
                this.createBranch(level, blockSetter, random, currentPos, forkDirection, forkLength,
                        config, foliageAttachments, 0);
            }

            // 移动到下一个位置
            currentPos = currentPos.above();
        }

        // 添加主干顶端的树叶附着点
        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));

        return foliageAttachments;
    }

    // 根据当前主干方向计算分叉方向
    private Direction getForkDirection(RandomSource random, Direction currentDirection) {
        // 如果主干是直的向上，随机选择水平方向
        if (currentDirection == Direction.UP) {
            return Direction.Plane.HORIZONTAL.getRandomDirection(random);
        }

        // 否则，基于当前主干方向计算分叉方向
        // 使用最大分叉角度限制分叉方向
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
        return switch (dir) {
            case EAST -> 90;
            case SOUTH -> 180;
            case WEST -> 270;
            default -> 0;
        };
    }

    // 创建分支 (递归方法)
    private void createBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                              RandomSource random, BlockPos startPos, Direction direction, int length,
                              TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments,
                              int recursionDepth) {
        BlockPos currentPos = startPos;
        Direction currentDirection = direction;

        for (int i = 0; i < length; i++) {
            // 分支向上倾斜 (根据递归深度调整倾斜程度)
            float upwardBias = 0.7f - (recursionDepth * 0.2f); // 递归越深，向上倾斜越少
            if (random.nextFloat() < upwardBias) {
                currentPos = currentPos.above();
            }

            // 分支向前延伸
            currentPos = currentPos.relative(currentDirection);

            // 有小几率轻微改变分支方向
            if (random.nextFloat() < 0.3f) {
                Direction[] possibleTurns = {
                        currentDirection.getClockWise(),
                        currentDirection.getCounterClockWise()
                };
                currentDirection = possibleTurns[random.nextInt(possibleTurns.length)];
            }

            // 放置分支方块
            this.placeLog(level, blockSetter, random, currentPos, config);

            // 在分支末端添加树叶附着点
            if (i == length - 1) {
                BlockPos foliagePos = currentPos.above();
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(foliagePos, 0, false));
            }

            // 限制递归深度，防止无限分支
            if (recursionDepth < 2 && i > 1 && random.nextInt(5) == 0) {
                // 确定次级分支方向 - 基于当前分支方向
                Direction subDirection = getForkDirection(random, currentDirection);
                int subLength = 1 + random.nextInt(Math.max(1, length - i - 1));

                // 创建次级分支
                this.createBranch(level, blockSetter, random, currentPos, subDirection, subLength,
                        config, foliageAttachments, recursionDepth + 1);
            }
        }
    }
}
