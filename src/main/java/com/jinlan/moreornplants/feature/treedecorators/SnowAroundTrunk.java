package com.jinlan.moreornplants.feature.treedecorators;

import com.jinlan.moreornplants.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SnowLayerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.List;

public class SnowAroundTrunk extends TreeDecorator {
    public static final Codec<SnowAroundTrunk> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.intRange(1, 10).fieldOf("radius").forGetter(decorator -> decorator.radius),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("placement_chance").forGetter(decorator -> decorator.placementChance),
                    Codec.intRange(0, 10).fieldOf("vertical_range").forGetter(decorator -> decorator.verticalRange)
            ).apply(instance, SnowAroundTrunk::new)
    );

    private final int radius;
    private final float placementChance;
    private final int verticalRange; // 垂直范围，适应地形高度差

    public SnowAroundTrunk(int radius, float placementChance, int verticalRange) {
        this.radius = radius;
        this.placementChance = placementChance;
        this.verticalRange = verticalRange;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.SNOW_AROUND_TRUNK.get();
    }

    @Override
    public void place(TreeDecorator.Context context) {
        LevelSimulatedReader level = context.level();
        RandomSource random = context.random();
        List<BlockPos> logPositions = context.logs();

        // 找到树干底部位置（最低的Y坐标）
        BlockPos trunkBase = findTrunkBase(logPositions);
        if (trunkBase == null) return;

        // 在树干周围生成雪层（考虑垂直范围）
        generateSnowAroundTrunk(context, level, random, trunkBase);
    }

    // 找到树干底部位置
    private BlockPos findTrunkBase(List<BlockPos> logPositions) {
        if (logPositions.isEmpty()) return null;

        BlockPos lowestPos = logPositions.get(0);
        for (BlockPos pos : logPositions) {
            if (pos.getY() < lowestPos.getY()) {
                lowestPos = pos;
            }
        }
        return lowestPos;
    }

    // 在树干周围生成雪层（考虑垂直范围）
    private void generateSnowAroundTrunk(TreeDecorator.Context context, LevelSimulatedReader level,
                                         RandomSource random, BlockPos trunkBase) {
        // 在指定半径和垂直范围内放置雪层
        for (int x = -radius; x <= radius; x++) {
            for (int z = -radius; z <= radius; z++) {
                // 跳过中心点（树干位置）
                if (x == 0 && z == 0) continue;

                // 检查是否在圆形范围内
                double distance = Math.sqrt(x * x + z * z);
                if (distance > radius) continue;

                // 根据距离调整放置几率（离树干越远几率越高）
                float distanceFactor = (float)(distance / radius);
                float adjustedChance = placementChance * distanceFactor;

                if (random.nextFloat() < adjustedChance) {
                    // 在垂直范围内尝试放置雪层
                    tryPlaceSnowInVerticalRange(context, level, random, trunkBase, x, z);
                }
            }
        }
    }

    // 在垂直范围内尝试放置雪层
    private void tryPlaceSnowInVerticalRange(TreeDecorator.Context context, LevelSimulatedReader level,
                                             RandomSource random, BlockPos trunkBase, int x, int z) {
        // 从树干底部开始，在垂直范围内寻找合适的位置放置雪层
        for (int yOffset = 0; yOffset <= verticalRange; yOffset++) {
            // 尝试在树干底部下方yOffset格放置
            BlockPos candidatePos = trunkBase.below(yOffset).offset(x, 0, z);

            // 如果这个位置可以放置雪层，就放置并停止搜索
            if (tryPlaceSnowLayer(context, level, random, candidatePos)) {
                break;
            }

            // 同时尝试在树干底部上方yOffset格放置（如果verticalRange允许）
            if (yOffset > 0) {
                BlockPos candidatePosAbove = trunkBase.above(yOffset).offset(x, 0, z);
                if (tryPlaceSnowLayer(context, level, random, candidatePosAbove)) {
                    break;
                }
            }
        }
    }

    // 尝试在指定位置放置雪层
    private boolean tryPlaceSnowLayer(TreeDecorator.Context context, LevelSimulatedReader level,
                                      RandomSource random, BlockPos pos) {
        // 检查下方方块是否可支撑雪层
        if (isValidSnowBase(level, pos.below())) {
            // 检查当前位置是否可放置雪层（只允许在空气位置放置）
            if (level.isStateAtPosition(pos, BlockBehaviour.BlockStateBase::isAir)) {
                // 创建1层雪状态
                BlockState snowState = Blocks.SNOW.defaultBlockState()
                        .setValue(SnowLayerBlock.LAYERS, 1);

                // 放置雪层
                context.setBlock(pos, snowState);
                return true;
            }
        }
        return false;
    }

    // 检查是否有效的雪层支撑方块
    private boolean isValidSnowBase(LevelSimulatedReader level, BlockPos pos) {
        // 雪层可以放置在大多数固体方块上
        return level.isStateAtPosition(pos, state ->
                state.isSolidRender((BlockGetter) level, pos) &&
                        !state.is(Blocks.ICE) &&
                        !state.is(Blocks.PACKED_ICE) &&
                        !state.is(Blocks.BLUE_ICE) &&
                        !state.is(Blocks.SNOW) // 避免在已有的雪上放置
        );
    }
}