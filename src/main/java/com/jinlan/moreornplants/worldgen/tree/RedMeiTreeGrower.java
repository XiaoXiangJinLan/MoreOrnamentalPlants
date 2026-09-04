package com.jinlan.moreornplants.worldgen.tree;

import com.jinlan.moreornplants.worldgen.features.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class RedMeiTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        if (pRandom.nextInt(10) == 0) {
            return ModTreeFeatures.ANCIENT_RED_MEI;
        } else {
            return pHasFlowers ? ModTreeFeatures.RED_MEI_BEES : ModTreeFeatures.RED_MEI;
        }
    }
}
