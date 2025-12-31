package com.jinlan.moreornplants.feature.treedecorators;

import com.jinlan.moreornplants.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.List;

public class LeafPileDecorator extends TreeDecorator {
    public static final Codec<LeafPileDecorator> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    BlockState.CODEC.fieldOf("leaf_pile_block").forGetter(decorator -> decorator.leafPileBlock),
                    Codec.intRange(1, 10).fieldOf("horizontal_radius").forGetter(decorator -> decorator.horizontalRadius),
                    Codec.intRange(0, 5).fieldOf("vertical_radius").forGetter(decorator -> decorator.verticalRadius),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("placement_chance").forGetter(decorator -> decorator.placementChance)
            ).apply(instance, LeafPileDecorator::new)
    );

    private final BlockState leafPileBlock;
    private final int horizontalRadius;      // 水平搜索半径
    private final int verticalRadius;        // 垂直搜索半径
    private final float placementChance;     // 放置几率

    public LeafPileDecorator(BlockState leafPileBlock, int horizontalRadius,
                             int verticalRadius, float placementChance) {
        this.leafPileBlock = leafPileBlock;
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
        this.placementChance = placementChance;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.LEAF_PILE_DECORATOR.get();
    }

    @Override
    public void place(TreeDecorator.Context context) {
        LevelSimulatedReader level = context.level();
        RandomSource random = context.random();
        List<BlockPos> logPositions = context.logs();

        if (logPositions.isEmpty()) return;

        // 找到树干底部位置
        BlockPos trunkBase = findTrunkBase(logPositions);

        // 在树干周围生成落叶
        generateLeafPiles(context, level, random, trunkBase);
    }

    private BlockPos findTrunkBase(List<BlockPos> logPositions) {
        BlockPos lowestPos = logPositions.get(0);
        for (BlockPos pos : logPositions) {
            if (pos.getY() < lowestPos.getY()) {
                lowestPos = pos;
            }
        }
        return lowestPos;
    }

    private void generateLeafPiles(TreeDecorator.Context context, LevelSimulatedReader level,
                                   RandomSource random, BlockPos trunkBase) {
        // 计算垂直搜索范围
        int minY = trunkBase.getY() - verticalRadius;
        int maxY = trunkBase.getY() + verticalRadius;

        // 确保minY <= maxY
        if (minY > maxY) {
            int temp = minY;
            minY = maxY;
            maxY = temp;
        }

        // 在三维空间内尝试放置落叶
        for (int dx = -horizontalRadius; dx <= horizontalRadius; dx++) {
            for (int dz = -horizontalRadius; dz <= horizontalRadius; dz++) {
                // 跳过树干位置
                if (dx == 0 && dz == 0) continue;

                // 检查是否在水平圆形范围内
                double distance = Math.sqrt(dx * dx + dz * dz);
                if (distance > horizontalRadius) continue;

                // 使用固定的放置几率
                if (random.nextFloat() < placementChance) {
                    // 在垂直半径范围内，从上到下寻找地面
                    findAndPlaceOnTerrain(context, level, random, trunkBase, dx, dz, minY, maxY);
                }
            }
        }
    }

    private void findAndPlaceOnTerrain(TreeDecorator.Context context, LevelSimulatedReader level,
                                       RandomSource random, BlockPos trunkBase, int dx, int dz,
                                       int minY, int maxY) {
        // 从上到下搜索，找到第一个合适的地面位置
        for (int y = maxY; y >= minY; y--) {
            BlockPos testPos = new BlockPos(
                    trunkBase.getX() + dx,
                    y,
                    trunkBase.getZ() + dz
            );

            // 尝试在这个位置放置落叶
            if (tryPlaceLeafPile(context, level, random, testPos)) {
                return; // 放置成功，停止搜索
            }
        }

        // 如果在垂直半径内没找到，继续向下搜索（不设限制）
        int minSearchY = Math.max(minY - 10, 0);
        for (int y = minY - 1; y >= minSearchY; y--) {
            BlockPos testPos = new BlockPos(
                    trunkBase.getX() + dx,
                    y,
                    trunkBase.getZ() + dz
            );

            if (tryPlaceLeafPile(context, level, random, testPos)) {
                return; // 放置成功
            }
        }
    }

    // 尝试在指定位置放置落叶
    private boolean tryPlaceLeafPile(TreeDecorator.Context context, LevelSimulatedReader level,
                                     RandomSource random, BlockPos pos) {
        // 检查下方方块是否可支撑落叶
        if (!isValidBase(level, pos.below())) {
            return false;
        }

        // 检查当前位置是否可放置（必须是空气）
        if (!level.isStateAtPosition(pos, BlockBehaviour.BlockStateBase::isAir)) {
            return false;
        }

        // 随机选择一个水平方向
        Direction[] horizontalDirections = Direction.Plane.HORIZONTAL.stream().toArray(Direction[]::new);
        Direction randomDirection = horizontalDirections[random.nextInt(horizontalDirections.length)];

        // 创建带方向的落叶方块状态
        BlockState leafPileState = leafPileBlock
                .setValue(BlockStateProperties.HORIZONTAL_FACING, randomDirection);

        // 放置落叶方块
        context.setBlock(pos, leafPileState);
        return true;
    }

    // 检查是否有效的落叶支撑方块
    private boolean isValidBase(LevelSimulatedReader level, BlockPos pos) {
        // 落叶可以放置在大多数固体方块上
        return level.isStateAtPosition(pos, state -> {
            // 检查是否是空气或液体
            if (state.isAir() || state.liquid()) {
                return false;
            }
            // 检查是否是完整的方块
            return state.isFaceSturdy(null, pos, Direction.UP);
        });
    }
}
