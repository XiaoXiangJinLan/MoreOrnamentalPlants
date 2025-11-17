package com.jinlan.moreornplants.worldgen;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {
    public static ResourceKey<BiomeModifier> ADD_TREE_WHITE_MEI = registerKey("add_tree_white_mei");


    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures =context.lookup(Registries.PLACED_FEATURE);
        var biomes =context.lookup(Registries.BIOME);

        context.register(ADD_TREE_WHITE_MEI, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                HolderSet.direct(biomes.getOrThrow(Biomes.RIVER)),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.WHITE_MEI_PLACED)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(MoreOrnPlants.MOD_ID,name));
    }
}
