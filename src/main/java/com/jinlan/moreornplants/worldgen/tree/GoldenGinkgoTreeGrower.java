package com.jinlan.moreornplants.worldgen.tree;

import com.jinlan.moreornplants.worldgen.features.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractMegaTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class GoldenGinkgoTreeGrower extends AbstractMegaTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource pRandom, boolean pHasFlowers) {
        return pRandom.nextBoolean() ? ModTreeFeatures.GOLDEN_GINKGO : ModTreeFeatures.GOLDEN_GINKGO_WITH_LEAF_PILE;
    }

    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredMegaFeature(RandomSource pRandom) {
        return ModTreeFeatures.ANCIENT_GOLDEN_GINKGO;
    }
}
