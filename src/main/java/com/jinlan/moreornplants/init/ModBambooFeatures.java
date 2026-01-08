package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.feature.BambooFeatures.BlackBambooFeature;
import com.jinlan.moreornplants.feature.BambooFeatures.MottledBambooFeature;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBambooFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES =
        DeferredRegister.create(BuiltInRegistries.FEATURE, MoreOrnPlants.MODID);

    public static final Supplier<Feature<ProbabilityFeatureConfiguration>> MOTTLED_BAMBOO =
            FEATURES.register("mottled_bamboo", () -> new MottledBambooFeature(ProbabilityFeatureConfiguration.CODEC));
    public static final Supplier<Feature<ProbabilityFeatureConfiguration>> BLACK_BAMBOO =
            FEATURES.register("black_bamboo", () -> new BlackBambooFeature(ProbabilityFeatureConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
