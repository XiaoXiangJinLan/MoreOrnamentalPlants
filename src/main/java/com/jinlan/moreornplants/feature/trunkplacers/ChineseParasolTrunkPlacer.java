package com.jinlan.moreornplants.feature.trunkplacers;

import com.jinlan.moreornplants.block.ModRotatedPillarBlock;
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

public class ChineseParasolTrunkPlacer extends TrunkPlacer {
    public static final MapCodec<ChineseParasolTrunkPlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(1, 6).fieldOf("short_branch_length").forGetter(placer -> placer.shortBranchLength),
                    Codec.intRange(1, 8).fieldOf("long_branch_length").forGetter(placer -> placer.longBranchLength)
            ).apply(instance, ChineseParasolTrunkPlacer::new)
    );

       private final int shortBranchLength;
    private final int longBranchLength;

    public ChineseParasolTrunkPlacer(int baseHeight, int heightRandA, int heightRandB, int shortBranchLength, int longBranchLength) {
        super(baseHeight, heightRandA, heightRandB);
        this.shortBranchLength = shortBranchLength;
        this.longBranchLength = longBranchLength;
    }

    @Override
    @NotNull
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.CHINESE_PARASOL_TRUNK_PLACER.get();
    }

    @Override
    @NotNull
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                                            RandomSource random, int freeTreeHeight, BlockPos pos, TreeConfiguration config) {
        List<FoliagePlacer.FoliageAttachment> foliageAttachments = new ArrayList<>();

        BlockPos currentPos = pos;

        // 放置笔直的主干
        for (int height = 0; height < freeTreeHeight; height++) {
            // 放置主干原木（垂直方向）
            this.placeLog(level, blockSetter, random, currentPos, config, Direction.Axis.Y);

            // 在下层分枝高度生成长分枝
            if (height == freeTreeHeight - 6) {
                generateLowerLongBranches(level, blockSetter, random, currentPos, config, foliageAttachments);
            }

            // 在上层分枝高度生成短分枝
            if (height == freeTreeHeight - 3) {
                generateUpperShortBranches(level, blockSetter, random, currentPos, config, foliageAttachments);
            }

            currentPos = currentPos.above();
        }

        // 添加主干顶端的树叶附着点
        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos.below(), 0, false));

        return foliageAttachments;
    }

    // 生成下层长分枝（4格长度）
    private void generateLowerLongBranches(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                           RandomSource random, BlockPos startPos, TreeConfiguration config,
                                           List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        // 四个主要方向
        Direction[] directions = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

        for (Direction direction : directions) {
            createLongBranch(level, blockSetter, random, startPos, direction, config, foliageAttachments);
        }
    }

    // 生成上层短分枝（3格长度）
    private void generateUpperShortBranches(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                            RandomSource random, BlockPos startPos, TreeConfiguration config,
                                            List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        // 四个主要方向
        Direction[] directions = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

        for (Direction direction : directions) {
            createShortBranch(level, blockSetter, random, startPos, direction, config, foliageAttachments);
        }
    }

    // 创建长分枝（4格长度）
    private void createLongBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                  RandomSource random, BlockPos startPos, Direction direction,
                                  TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        BlockPos currentPos = startPos;
        Direction.Axis currentAxis = getAxisFromDirection(direction);

        // 长分枝延伸4格
        for (int i = 0; i < longBranchLength; i++) {
            currentPos = currentPos.relative(direction);

            // 长分枝稍微向上倾斜
            if (i > 0 && random.nextFloat() < 0.3f) {
                currentPos = currentPos.above();
                currentAxis = Direction.Axis.Y;
            }

            // 放置分枝原木
            this.placeLog(level, blockSetter, random, currentPos, config, currentAxis);

            // 在分枝末端添加树叶附着点
            if (i == longBranchLength - 1) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));
            }
        }
    }

    // 创建短分枝（3格长度）
    private void createShortBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                   RandomSource random, BlockPos startPos, Direction direction,
                                   TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        BlockPos currentPos = startPos;
        Direction.Axis currentAxis = getAxisFromDirection(direction);

        // 短分枝延伸3格
        for (int i = 0; i < shortBranchLength; i++) {
            currentPos = currentPos.relative(direction);

            // 短分枝基本保持水平，偶尔轻微向上
            if (i > 0 && random.nextFloat() < 0.2f) {
                currentPos = currentPos.above();
                currentAxis = Direction.Axis.Y;
            }

            // 放置分枝原木
            this.placeLog(level, blockSetter, random, currentPos, config, currentAxis);

            // 在分枝末端添加树叶附着点
            if (i == shortBranchLength - 1) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));
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
                .setValue(ModRotatedPillarBlock.AXIS, axis);
        blockSetter.accept(pos, logState);
    }
}
