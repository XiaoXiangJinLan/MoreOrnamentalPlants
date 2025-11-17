package com.jinlan.moreornplants.feature.treedecorators;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.PinkWeepingMeiBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.VersicolorWeepingMeiBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.WhiteWeepingMeiBlock;
import com.jinlan.moreornplants.init.ModTreeDecoratorTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.GrowingPlantHeadBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;

import java.util.ArrayList;
import java.util.List;

public class VersicolorWeepingMeiVineDecorator extends TreeDecorator {
    public static final Codec<VersicolorWeepingMeiVineDecorator> CODEC = RecordCodecBuilder.create(instance ->
            instance.group(
                    Codec.floatRange(0.0F, 1.0F).fieldOf("generation_chance").forGetter((decorator) -> decorator.generationChance),
                    Codec.intRange(1, 50).fieldOf("max_vines").forGetter((decorator) -> decorator.maxVines),
                    Codec.intRange(1, 10).fieldOf("min_length").forGetter((decorator) -> decorator.minLength),
                    Codec.intRange(1, 10).fieldOf("max_length").forGetter((decorator) -> decorator.maxLength),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("versicolor_chance").forGetter((decorator) -> decorator.versicolorChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("pink_chance").forGetter((decorator) -> decorator.pinkChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("white_chance").forGetter((decorator) -> decorator.whiteChance)
            ).apply(instance, VersicolorWeepingMeiVineDecorator::new)
    );

    private final float generationChance;
    private final int maxVines;
    private final int minLength;
    private final int maxLength;
    private final float versicolorChance;
    private final float pinkChance;
    private final float whiteChance;

    public VersicolorWeepingMeiVineDecorator(float generationChance, int maxVines, int minLength, int maxLength
                                             , float versicolorChance, float pinkChance, float whiteChance) {
        this.generationChance = generationChance;
        this.maxVines = maxVines;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.versicolorChance = versicolorChance;
        this.pinkChance = pinkChance;
        this.whiteChance = whiteChance;
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return ModTreeDecoratorTypes.VERSICOLOR_WEEPING_MEI_VINE_DECORATOR.get();
    }

    @Override
    public void place(Context context) {
        LevelSimulatedReader level = context.level();
        RandomSource random = context.random();
        List<BlockPos> leavesPositions = context.leaves();

        // 收集所有可能生成藤蔓的位置
        List<BlockPos> candidatePositions = new ArrayList<>();

        for (BlockPos leafPos : leavesPositions) {
            // 检查树叶正下方是否可以放置藤蔓
            BlockPos belowPos = leafPos.below();
            if (level.isStateAtPosition(belowPos, state -> state.isAir())) {
                candidatePositions.add(belowPos);
            }
        }

        // 随机打乱候选位置
        for (int i = candidatePositions.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            BlockPos temp = candidatePositions.get(i);
            candidatePositions.set(i, candidatePositions.get(j));
            candidatePositions.set(j, temp);
        }

        // 生成藤蔓
        int vinesGenerated = 0;
        for (BlockPos candidate : candidatePositions) {
            if (random.nextFloat() < generationChance) {
                generateSingleVine(level, context, random, candidate);
                vinesGenerated++;

                // 如果已经生成了足够多的藤蔓，提前停止
                if (vinesGenerated >= maxVines) {
                    break;
                }
            }
        }
    }

    private void generateSingleVine(LevelSimulatedReader level, Context context, RandomSource random, BlockPos startPos) {
        // 随机藤蔓长度
        int maxVineLength = random.nextInt(maxLength - minLength + 1) + minLength;

        // 检查起始位置是否可以放置藤蔓
        if (!level.isStateAtPosition(startPos, state -> state.isAir())) {
            return;
        }

        // 确定实际可生成的藤蔓长度
        int actualVineLength = 1; // 至少可以生成头部

        // 检查下方位置，确定实际长度
        for (int i = 1; i < maxVineLength; i++) {
            BlockPos checkPos = startPos.below(i);
            if (level.isStateAtPosition(checkPos, state -> state.isAir())) {
                actualVineLength++;
            } else {
                // 遇到障碍，停止检查
                break;
            }
        }

        // 如果实际长度小于最小长度要求，则不生成
        if (actualVineLength < minLength) {
            return;
        }

        VineType vineType = getRandomVineType(random);

        for (int i = 0; i < actualVineLength - 1; i++) {
            BlockPos plantPos = startPos.below(i);
            context.setBlock(plantPos, vineType.plantBlock.defaultBlockState());
        }

        BlockState headState = vineType.headBlock.defaultBlockState();
        if (headState.getBlock() instanceof GrowingPlantHeadBlock) {
            headState = headState.setValue(vineType.ageProperty, 25);
        }
        context.setBlock(startPos.below(actualVineLength - 1), headState);
    }

    private VineType getRandomVineType(RandomSource random) {
        float chance = random.nextFloat();
        float total = versicolorChance + pinkChance + whiteChance;

        float normalizedVersicolor = versicolorChance / total;
        float normalizedPink = pinkChance / total;

        if (chance < normalizedVersicolor) {
            return VineType.VERSICOLOR;
        } else if (chance < normalizedVersicolor + normalizedPink) {
            return VineType.PINK;
        } else {
            return VineType.WHITE;
        }
    }

    private enum VineType {
        VERSICOLOR(ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT.get(), ModBlocks.VERSICOLOR_WEEPING_MEI.get(), VersicolorWeepingMeiBlock.AGE),
        PINK(ModBlocks.PINK_WEEPING_MEI_PLANT.get(), ModBlocks.PINK_WEEPING_MEI.get(), PinkWeepingMeiBlock.AGE),
        WHITE(ModBlocks.WHITE_WEEPING_MEI_PLANT.get(), ModBlocks.WHITE_WEEPING_MEI.get(), WhiteWeepingMeiBlock.AGE);

        public final net.minecraft.world.level.block.Block plantBlock;
        public final net.minecraft.world.level.block.Block headBlock;
        public final IntegerProperty ageProperty;

        VineType(net.minecraft.world.level.block.Block plantBlock, net.minecraft.world.level.block.Block headBlock, IntegerProperty ageProperty) {
            this.plantBlock = plantBlock;
            this.headBlock = headBlock;
            this.ageProperty = ageProperty;
        }
    }
}
