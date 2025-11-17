package com.jinlan.moreornplants.worldgen.tree;

import com.jinlan.moreornplants.worldgen.ModConfiguredFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class VersicolorMeiTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        if (pRandom.nextInt(10) == 0) {
            return ModConfiguredFeatures.ANCIENT_VERSICOLOR_MEI;
        } else {
            return ModConfiguredFeatures.VERSICOLOR_MEI;
        }
    }
}
