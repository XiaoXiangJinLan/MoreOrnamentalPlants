package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.feature.BambooFeatures.BlackBambooFeature;
import com.jinlan.moreornplants.feature.BambooFeatures.MottledBambooFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.ProbabilityFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES =
        DeferredRegister.create(ForgeRegistries.FEATURES, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<Feature<ProbabilityFeatureConfiguration>> MOTTLED_BAMBOO =
            FEATURES.register("mottled_bamboo", () -> new MottledBambooFeature(ProbabilityFeatureConfiguration.CODEC));
    public static final RegistryObject<Feature<ProbabilityFeatureConfiguration>> BLACK_BAMBOO =
            FEATURES.register("black_bamboo", () -> new BlackBambooFeature(ProbabilityFeatureConfiguration.CODEC));

    public static void register(IEventBus eventBus) {
        FEATURES.register(eventBus);
    }
}
