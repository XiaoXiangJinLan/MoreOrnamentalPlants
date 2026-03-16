package com.jinlan.moreornplants.feature.treedecorators;

import com.jinlan.moreornplants.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class CrabappleDecorator extends TreeDecorator {
    public static final MapCodec<CrabappleDecorator> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    BlockState.CODEC.fieldOf("block").forGetter(decorator -> decorator.blockState),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(decorator -> decorator.probability)
            ).apply(instance, CrabappleDecorator::new)
    );

    private final BlockState blockState;
    private final float probability;

    public CrabappleDecorator(BlockState blockState, float probability) {
        this.blockState = blockState;
        this.probability = probability;
    }

    @Override
    @NotNull
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.CRABAPPLE_DECORATOR.get();
    }

    @Override
    public void place(Context context) {
        LevelSimulatedReader level = context.level();
        RandomSource random = context.random();
        List<BlockPos> leavesPositions = context.leaves();

        // 遍历所有树叶位置
        for (BlockPos leafPos : leavesPositions) {
            BlockPos belowPos = leafPos.below();

            // 检查该位置是否可以放置花朵
            if (level.isStateAtPosition(belowPos, BlockBehaviour.BlockStateBase::isAir) &&
                    random.nextFloat() < this.probability) {
                // 放置海棠
                context.setBlock(belowPos, blockState);
            }
        }
    }
}
