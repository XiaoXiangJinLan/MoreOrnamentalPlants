package com.jinlan.moreornplants.feature.treedecorators;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.List;

public class WeepingCrabappleFlowerDecorator extends TreeDecorator {
    public static final Codec<WeepingCrabappleFlowerDecorator> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter(decorator -> decorator.probability)
            ).apply(instance, WeepingCrabappleFlowerDecorator::new)
    );

    private final float probability;

    public WeepingCrabappleFlowerDecorator(float probability) {
        this.probability = probability;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.WEEPING_CRABAPPLE_FLOWER_DECORATOR.get();
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
                // 放置垂丝海棠花朵
                context.setBlock(belowPos, ModBlocks.WEEPING_CRABAPPLE.get().defaultBlockState());
            }
        }
    }
}
