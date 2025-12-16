package com.jinlan.moreornplants.feature.foliageplacers;

import com.jinlan.moreornplants.init.ModFoliagePlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;

public class AncientGinkgoFoliagePlacer extends FoliagePlacer {
    public static final Codec<AncientGinkgoFoliagePlacer> CODEC = RecordCodecBuilder.create((instance) ->
            foliagePlacerParts(instance).and(
                    IntProvider.codec(0, 24).fieldOf("crown_height").forGetter((placer) -> placer.crownHeight)
    ).apply(instance, AncientGinkgoFoliagePlacer::new));

    private final IntProvider crownHeight;

    public AncientGinkgoFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider crownHeight) {
        super(radius, offset);
        this.crownHeight = crownHeight;
    }

    @Override
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.ANCIENT_GINKGO_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter blockSetter, RandomSource random,
                                 TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment,
                                 int foliageHeight, int foliageRadius, int offset) {
        BlockPos blockpos = attachment.pos();
        int i = 0;

        for(int j = blockpos.getY() - foliageHeight + offset; j <= blockpos.getY() + offset; ++j) {
            int k = blockpos.getY() - j; // 当前层距离树冠顶部的距离
            float relativeHeight = (float)k / (float)foliageHeight; // 相对高度 (0=顶部, 1=底部)

            // 修改1: 使用更平滑的半径变化函数，让顶端更圆润
            float radiusMultiplier = calculateRadiusMultiplier(relativeHeight);
            int l = foliageRadius + attachment.radiusOffset() + Mth.floor(radiusMultiplier * 1.6F);

            int i1;
            // 修改2: 减少特殊情况下的半径增加，让形状更一致
            if (k > 0 && l == i && (j & 1) == 0 && random.nextFloat() < 0.6f) {
                i1 = l + 1;
            } else {
                i1 = l;
            }

            this.placeLeavesRow(level, blockSetter, random, config,
                    new BlockPos(blockpos.getX(), j, blockpos.getZ()),
                    i1, 0, attachment.doubleTrunk());
            i = l;
        }

        // 修改3: 添加额外的顶层来增加圆润度
        addExtraTopLayers(level, blockSetter, random, config, blockpos, offset, attachment.doubleTrunk());
    }

    /**
     * 计算半径乘数，使用平滑的曲线函数让顶端更圆润
     */
    private float calculateRadiusMultiplier(float relativeHeight) {
        // 使用更平缓的三次函数曲线
        if (relativeHeight < 0.2f) {
            // 顶端区域：非常平缓的起始
            return relativeHeight * relativeHeight * 1.5f;
        } else if (relativeHeight < 0.6f) {
            // 中部：平缓增长
            return 0.06f + (relativeHeight - 0.2f) * 0.8f;
        } else {
            // 底部：稍微加快增长
            return 0.38f + (relativeHeight - 0.6f) * 1.2f;
        }
    }

    /**
     * 添加额外的顶层来增强圆润效果
     */
    private void addExtraTopLayers(LevelSimulatedReader level, FoliageSetter blockSetter, RandomSource random,
                                   TreeConfiguration config, BlockPos center, int offset, boolean doubleTrunk) {
        // 在原有顶层之上添加1-2层小半径的层
        int extraLayers = 2;
        for (int i = 1; i <= extraLayers; i++) {
            int radius = Math.max(1, 3 - i); // 逐层减小半径
            this.placeLeavesRow(level, blockSetter, random, config,
                    new BlockPos(center.getX(), center.getY() + offset + i, center.getZ()),
                    radius, 0, doubleTrunk);
        }
    }

    @Override
    public int foliageHeight(RandomSource random, int height, TreeConfiguration config) {
        return this.crownHeight.sample(random);
    }

    /**
     * 修改4: 优化跳过逻辑，让边缘更圆润自然
     */
    @Override
    protected boolean shouldSkipLocation(RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        // 移除原版的斜切逻辑，只使用圆形检测
        // 同时添加一些随机性让边缘更自然
        float distanceSq = localX * localX + localZ * localZ;
        float threshold = range * range;

        // 基础圆形检测
        if (distanceSq > threshold) {
            return true;
        }

        // 在边缘区域添加一些随机跳过，创造更自然的效果
        if (distanceSq > threshold * 0.8f) {
            return random.nextFloat() < 0.3f; // 30%几率跳过边缘方块
        }

        return false;
    }
}