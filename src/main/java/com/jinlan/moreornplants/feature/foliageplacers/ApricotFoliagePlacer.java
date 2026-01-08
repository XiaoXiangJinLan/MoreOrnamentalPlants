package com.jinlan.moreornplants.feature.foliageplacers;

import com.jinlan.moreornplants.init.ModFoliagePlacerTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import org.jetbrains.annotations.NotNull;

public class ApricotFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<ApricotFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            foliagePlacerParts(instance).and(instance.group(
                    IntProvider.codec(0, 24).fieldOf("height").forGetter((placer) -> placer.height),
                    Codec.floatRange(0.0F, 1.0F).fieldOf("outer_layer_hole_chance").forGetter((placer) -> placer.outerLayerHoleChance)
            )).apply(instance, ApricotFoliagePlacer::new)
    );

    private final IntProvider height;
    private final float outerLayerHoleChance;

    public ApricotFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider height, float outerLayerHoleChance) {
        super(radius, offset);
        this.height = height;
        this.outerLayerHoleChance = outerLayerHoleChance;
    }

    @Override
    @NotNull
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.APRICOT_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random,
                                 TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment,
                                 int foliageHeight, int foliageRadius, int offset) {
        BlockPos centerPos = attachment.pos().above(offset);
        int radius = foliageRadius + attachment.radiusOffset();

        // 从上到下逐层生成树叶
        for(int layer = foliageHeight; layer >= 0; --layer) {
            int layerRadius;

            // 根据层数设置不同的半径（现在有5层：0-4）
            if (layer == 4) {
                // 第1层（最上层）：半径1格
                layerRadius = Math.max(1, radius - 2);
            } else if (layer == 3) {
                // 第2层：半径2格
                layerRadius = Math.max(1, radius - 1);
            } else if (layer == 2 || layer == 1) {
                // 第3、4层（中层）：半径3格
                layerRadius = radius;
            } else {
                // 第5层（最底层）：半径2格
                layerRadius = Math.max(1, radius - 1);
            }

            this.placeLeavesRow(level, foliageSetter, random, config, centerPos, layerRadius, layer, attachment.doubleTrunk());
        }
    }

    @Override
    public int foliageHeight(@NotNull RandomSource random, int trunkHeight, @NotNull TreeConfiguration config) {
        return this.height.sample(random);
    }

    @Override
    protected boolean shouldSkipLocation(@NotNull RandomSource random, int localX, int localY, int localZ, int range, boolean large) {
        final var isAbsoluteCorner = Math.abs(localX) == range && Math.abs(localZ) == range;
        if (localY >= 3) { // 第1、2层对应的localY值
            // 只跳过绝对角落位置
            return isAbsoluteCorner;
        }

        // 扩大角落范围：跳过角落和靠近角落的位置
        boolean isCorner =
                isAbsoluteCorner || // 绝对角落
                        (Math.abs(localX) == range - 1 && Math.abs(localZ) == range) || // 靠近角落
                        (Math.abs(localX) == range && Math.abs(localZ) == range - 1); // 靠近角落

        if (isCorner) {
            return true;
        }

        // 在外圈位置随机跳过（小概率不生成树叶）
        boolean isOuterLayer = Math.abs(localX) == range || Math.abs(localZ) == range;
        return isOuterLayer && random.nextFloat() < this.outerLayerHoleChance;
    }
}