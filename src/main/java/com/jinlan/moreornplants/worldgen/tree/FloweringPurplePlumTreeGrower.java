package com.jinlan.moreornplants.worldgen.tree;

import com.jinlan.moreornplants.worldgen.features.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FloweringPurplePlumTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(@NotNull RandomSource pRandom, boolean pHasFlowers) {
        return pHasFlowers ? ModTreeFeatures.FLOWERING_PURPLE_LEAF_PLUM_BEES : ModTreeFeatures.FLOWERING_PURPLE_LEAF_PLUM;
    }
}
