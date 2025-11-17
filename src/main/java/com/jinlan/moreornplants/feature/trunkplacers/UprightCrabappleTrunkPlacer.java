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

public class UprightCrabappleTrunkPlacer extends TrunkPlacer {
    public static final Codec<UprightCrabappleTrunkPlacer> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                    Codec.intRange(0, 32).fieldOf("base_height").forGetter(placer -> placer.baseHeight),
                    Codec.intRange(0, 24).fieldOf("height_rand_a").forGetter(placer -> placer.heightRandA),
                    Codec.intRange(0, 24).fieldOf("height_rand_b").forGetter(placer -> placer.heightRandB),
                    Codec.intRange(2, 8).fieldOf("branch_min_length").forGetter(placer -> placer.branchMinLength),
                    Codec.intRange(3, 12).fieldOf("branch_max_length").forGetter(placer -> placer.branchMaxLength)
            ).apply(instance, UprightCrabappleTrunkPlacer::new)
    );

    private final int branchMinLength;
    private final int branchMaxLength;

    public UprightCrabappleTrunkPlacer(int baseHeight, int heightRandA, int heightRandB,
                                       int branchMinLength, int branchMaxLength) {
        super(baseHeight, heightRandA, heightRandB);
        this.branchMinLength = branchMinLength;
        this.branchMaxLength = branchMaxLength;
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.UPRIGHT_CRABAPPLE_TRUNK_PLACER.get();
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

            // 在第2或第3格生成分枝（必定生成）
            if (height == 2 || height == 3) {
                // 四个方向同时生成分枝
                generateFourDirectionBranches(level, blockSetter, random, currentPos, freeTreeHeight - height,
                        config, foliageAttachments);
            }

            currentPos = currentPos.above();
        }

        // 添加主干顶端的树叶附着点
        foliageAttachments.add(new FoliagePlacer.FoliageAttachment(currentPos, 0, false));

        return foliageAttachments;
    }

    // 在四个方向同时生成分枝
    private void generateFourDirectionBranches(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                               RandomSource random, BlockPos startPos, int remainingHeight,
                                               TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        // 四个主要方向
        Direction[] directions = {Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST};

        for (Direction direction : directions) {
            createCrabappleBranch(level, blockSetter, random, startPos, direction, remainingHeight,
                    config, foliageAttachments);
        }
    }

    // 创建西府海棠分枝（新形状：水平 → 斜上方 → 垂直向上）
    private void createCrabappleBranch(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                                       RandomSource random, BlockPos startPos, Direction direction, int remainingHeight,
                                       TreeConfiguration config, List<FoliagePlacer.FoliageAttachment> foliageAttachments) {
        int branchLength = branchMinLength + random.nextInt(branchMaxLength - branchMinLength + 1);

        // 第一步：从主干向外水平延伸一格
        BlockPos horizontalPos = startPos.relative(direction);
        this.placeLog(level, blockSetter, random, horizontalPos, config, getAxisFromDirection(direction));

        // 第二步：从水平位置向外的斜上方放置一格（向外并向上）
        BlockPos diagonalPos = horizontalPos.relative(direction).above();
        this.placeLog(level, blockSetter, random, diagonalPos, config, Direction.Axis.Y);

        // 第三步：从斜上方位置开始垂直向上生长
        for (int i = 1; i < branchLength && i < remainingHeight - 2; i++) {
            BlockPos verticalPos = diagonalPos.above(i);
            this.placeLog(level, blockSetter, random, verticalPos, config, Direction.Axis.Y);

            // 在分枝末端添加树叶附着点
            if (i == branchLength - 1 || i == remainingHeight - 3) {
                foliageAttachments.add(new FoliagePlacer.FoliageAttachment(verticalPos, 0, false));
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

    // 重写placeLog方法以支持方向
    protected void placeLog(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> blockSetter,
                            RandomSource random, BlockPos pos, TreeConfiguration config, Direction.Axis axis) {
        BlockState logState = config.trunkProvider.getState(random, pos)
                .setValue(ModFlammableRotatedPillarBlock.AXIS, axis);
        blockSetter.accept(pos, logState);
    }
}
