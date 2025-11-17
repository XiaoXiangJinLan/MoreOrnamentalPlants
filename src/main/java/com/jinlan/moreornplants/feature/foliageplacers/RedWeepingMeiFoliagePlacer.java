package com.jinlan.moreornplants.feature.foliageplacers;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.RedWeepingMeiBlock;
import com.jinlan.moreornplants.init.ModFoliagePlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

import java.util.ArrayList;
import java.util.List;

public class RedWeepingMeiFoliagePlacer extends FoliagePlacer {
    public static final Codec<RedWeepingMeiFoliagePlacer> CODEC = RecordCodecBuilder.create(instance ->
            foliagePlacerParts(instance).and(instance.group(
                    IntProvider.codec(4, 16).fieldOf("height").forGetter((placer) -> placer.height),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("wide_bottom_layer_hole_chance").forGetter((placer) -> placer.wideBottomLayerHoleChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("corner_hole_chance").forGetter((placer) -> placer.cornerHoleChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_chance").forGetter((placer) -> placer.hangingLeavesChance),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("hanging_leaves_extension_chance").forGetter((placer) -> placer.hangingLeavesExtensionChance)
            )).apply(instance, RedWeepingMeiFoliagePlacer::new)
    );

    private final IntProvider height;
    private final float wideBottomLayerHoleChance;
    private final float cornerHoleChance;
    private final float hangingLeavesChance;
    private final float hangingLeavesExtensionChance;

    public RedWeepingMeiFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider height, float wideBottomLayerHoleChance, float cornerHoleChance, float hangingLeavesChance, float hangingLeavesExtensionChance) {
        super(radius, offset);
        this.height = height;
        this.wideBottomLayerHoleChance = wideBottomLayerHoleChance;
        this.cornerHoleChance = cornerHoleChance;
        this.hangingLeavesChance = hangingLeavesChance;
        this.hangingLeavesExtensionChance = hangingLeavesExtensionChance;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.RED_WEEPING_MEI_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random, TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment, int foliageHeight, int foliageRadius, int offset) {
        boolean flag = attachment.doubleTrunk();
        BlockPos centerPos = attachment.pos().above(offset);
        int radius = foliageRadius + attachment.radiusOffset() - 1;

        // 放置树叶层，从顶部开始向下
        this.placeLeavesRow(level, foliageSetter, random, config, centerPos, radius - 1, foliageHeight - 3, flag);

        // 放置主要的树叶层
        for(int layer = foliageHeight - 4; layer >= 0; --layer) {
            this.placeLeavesRow(level, foliageSetter, random, config, centerPos, radius, layer, flag);
        }
        for(int layer = foliageHeight - 5; layer >= 0; --layer) {
            this.placeLeavesRow(level, foliageSetter, random, config, centerPos, radius, layer, flag);
        }

        this.placeLeavesRowWithHangingLeavesBelow(level, foliageSetter, random, config, centerPos, radius, -1, flag, this.hangingLeavesChance, this.hangingLeavesExtensionChance);
        this.placeLeavesRowWithHangingLeavesBelow(level, foliageSetter, random, config, centerPos, radius - 1, -2, flag, this.hangingLeavesChance, this.hangingLeavesExtensionChance);

        // 在底部生成垂枝梅花藤
        generateWeepingVines(level, foliageSetter, random, config, centerPos, radius, foliageHeight);
    }

    @Override
    public int foliageHeight(RandomSource random, int trunkHeight, TreeConfiguration config) {
        return this.height.sample(random);
    }

    @Override
    protected boolean shouldSkipLocation(RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        if (localY == -1 && (localX == range || localZ == range) && random.nextFloat() < this.wideBottomLayerHoleChance) {
            return true;
        } else {
            boolean isCorner = localX == range && localZ == range;
            boolean isLargeRange = range > 2;

            if (isLargeRange) {
                return isCorner || (localX + localZ > range * 2 - 2 && random.nextFloat() < this.cornerHoleChance);
            } else {
                return isCorner && random.nextFloat() < this.cornerHoleChance;
            }
        }
    }

    /**
     * 生成垂枝梅花藤
     */
    private void generateWeepingVines(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random, TreeConfiguration config, BlockPos centerPos, int radius, int foliageHeight) {
        // 收集所有可能生成藤蔓的位置
        List<BlockPos> candidatePositions = new ArrayList<>();

        // 扫描整个树叶团区域
        for (int xOffset = -radius; xOffset <= radius; xOffset++) {
            for (int zOffset = -radius; zOffset <= radius; zOffset++) {
                // 计算到中心的距离
                double distance = Math.sqrt(xOffset * xOffset + zOffset * zOffset);

                // 如果位置在树叶范围内
                if (distance <= radius) {
                    // 检查从底部到顶部的所有可能位置
                    for (int yOffset = -foliageHeight; yOffset <= 0; yOffset++) {
                        BlockPos checkPos = centerPos.offset(xOffset, yOffset, zOffset);

                        // 检查该位置是否有树叶
                        if (level.isStateAtPosition(checkPos, state -> state.is(config.foliageProvider.getState(random, checkPos).getBlock()))) {
                            // 检查树叶正下方是否可以放置藤蔓
                            BlockPos belowPos = checkPos.below();
                            if (level.isStateAtPosition(belowPos, state -> state.isAir())) {
                                candidatePositions.add(belowPos);
                            }
                        }
                    }
                }
            }
        }

        // 随机打乱候选位置
        for (int i = candidatePositions.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            BlockPos temp = candidatePositions.get(i);
            candidatePositions.set(i, candidatePositions.get(j));
            candidatePositions.set(j, temp);
        }

        // 高概率生成藤蔓 - 80%的概率在每个候选位置生成
        int vinesGenerated = 0;
        for (BlockPos candidate : candidatePositions) {
            if (random.nextFloat() < 0.8f) { // 80%概率生成
                generateSingleVine(level, foliageSetter, random, candidate);
                vinesGenerated++;

                // 如果已经生成了足够多的藤蔓，可以提前停止
                if (vinesGenerated > 12) {
                    break;
                }
            }
        }

        // 如果生成的藤蔓太少，强制再生成一些
        if (vinesGenerated < 8) {
            int additionalVines = 8 - vinesGenerated;
            for (int i = 0; i < additionalVines && i < candidatePositions.size(); i++) {
                generateSingleVine(level, foliageSetter, random, candidatePositions.get(i));
            }
        }
    }

    /**
     * 生成单个垂枝梅花藤
     */
    private void generateSingleVine(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random, BlockPos startPos) {
        // 藤蔓长度为3-5格
        int vineLength = random.nextInt(3) + 3;

        // 检查起始位置是否可以放置藤蔓
        if (!level.isStateAtPosition(startPos, state -> state.isAir())) {
            return;
        }

        // 藤蔓的最下方是头部
        BlockPos headPos = startPos.below(vineLength - 1);

        // 检查所有位置是否都可以放置
        for (int i = 0; i < vineLength - 1; i++) {
            BlockPos checkPos = startPos.below(i);
            if (!level.isStateAtPosition(checkPos, state -> state.isAir())) {
                return; // 如果中间有障碍，不生成这个藤蔓
            }
        }

        // 放置藤蔓身体部分
        for (int i = 0; i < vineLength - 1; i++) {
            BlockPos plantPos = startPos.below(i);
            foliageSetter.set(plantPos, ModBlocks.RED_WEEPING_MEI_PLANT.get().defaultBlockState());
        }

        // 放置藤蔓头部在最下方
        BlockState headState = ModBlocks.RED_WEEPING_MEI.get().defaultBlockState()
                .setValue(RedWeepingMeiBlock.AGE, 25); // 设置年龄为25，阻止自然生长
        foliageSetter.set(headPos, headState);
    }
}
