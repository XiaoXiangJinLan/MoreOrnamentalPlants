package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.worldgen.features.ModTreeFeatures;
import com.jinlan.moreornplants.worldgen.ModPlacedFeatures;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import com.jinlan.moreornplants.worldgen.features.ModVegetationFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, context -> {
                ModTreeFeatures.bootstrap(context);
                ModVegetationFeatures.bootstrap(context);
            })
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(Registries.BIOME, ModBiomes::bootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(MoreOrnPlants.MODID));
    }
}
