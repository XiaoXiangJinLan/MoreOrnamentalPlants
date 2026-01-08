package com.jinlan.moreornplants.feature.foliageplacers;

import com.jinlan.moreornplants.init.ModFoliagePlacerTypes;
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

public class PeachFoliagePlacer extends FoliagePlacer {
    public static final MapCodec<PeachFoliagePlacer> CODEC = RecordCodecBuilder.mapCodec(instance ->
            foliagePlacerParts(instance).and(
                    IntProvider.codec(0, 24).fieldOf("height").forGetter((placer) -> placer.height)
            ).apply(instance, PeachFoliagePlacer::new)
    );

    private final IntProvider height;
    private int currentFoliageHeight;

    public PeachFoliagePlacer(IntProvider radius, IntProvider offset, IntProvider height) {
        super(radius, offset);
        this.height = height;
    }

    @Override
    @NotNull
    protected FoliagePlacerType<?> type() {
        return ModFoliagePlacerTypes.PEACH_FOLIAGE_PLACER.get();
    }

    @Override
    protected void createFoliage(LevelSimulatedReader level, FoliageSetter foliageSetter, RandomSource random,
                                 TreeConfiguration config, int maxFreeTreeHeight, FoliageAttachment attachment,
                                 int foliageHeight, int foliageRadius, int offset) {
        this.currentFoliageHeight = foliageHeight;

        BlockPos centerPos = attachment.pos().above(offset);
        int radius = foliageRadius + attachment.radiusOffset();

        // 从上到下逐层生成树叶
        for(int layer = foliageHeight; layer >= 0; --layer) {
            int layerRadius;

            // 根据层数设置不同的半径（现在有4层：0-3）
            if (layer == foliageHeight) {
                // 第1层（最上层）
                layerRadius = Math.max(1, radius - 1);
            } else if (layer == 0) {
                // 最低层
                layerRadius = Math.max(1, radius - 1);
            } else {
                // 其他层
                layerRadius = radius;
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
        final var b = Math.abs(localX) == range && Math.abs(localZ) == range;
        if (localY == currentFoliageHeight || localY == 0) {
            return b;
        }

        return b ||
                (Math.abs(localX) == range - 1 && Math.abs(localZ) == range) ||
                (Math.abs(localX) == range && Math.abs(localZ) == range - 1);
    }
}
