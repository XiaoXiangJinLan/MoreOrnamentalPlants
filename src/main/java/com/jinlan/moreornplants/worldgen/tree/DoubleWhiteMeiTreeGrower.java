package com.jinlan.moreornplants.worldgen.tree;

import com.jinlan.moreornplants.worldgen.features.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class DoubleWhiteMeiTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        if (pRandom.nextInt(10) == 0) {
            return ModTreeFeatures.ANCIENT_DOUBLE_WHITE_MEI;
        } else {
            return pHasFlowers ? ModTreeFeatures.DOUBLE_WHITE_MEI_BEES : ModTreeFeatures.DOUBLE_WHITE_MEI;
        }
    }
}
