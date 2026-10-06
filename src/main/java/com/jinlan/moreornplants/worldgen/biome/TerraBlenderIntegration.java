package com.jinlan.moreornplants.worldgen.biome;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.config.BiomeConfigManager;
import com.jinlan.moreornplants.worldgen.biome.surface.ModSurfaceRules;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

public class TerraBlenderIntegration {
    public static void registerBiomes() {
        int overworldWeight = BiomeConfigManager.getOverworldBiomesWeight();
        int secondOverworldWeight = BiomeConfigManager.getSecondOverworldBiomesWeight();
        int thirdOverworldWeight = BiomeConfigManager.getThirdOverworldBiomesWeight();

        Regions.register(new OverworldBiomesRegion(
                new ResourceLocation(MoreOrnPlants.MOD_ID, "overworld_biomes"), overworldWeight));
        Regions.register(new SecondOverworldBiomesRegion(
                new ResourceLocation(MoreOrnPlants.MOD_ID, "second_overworld_biomes"), secondOverworldWeight));
        Regions.register(new ThirdOverworldBiomesRegion(
                new ResourceLocation(MoreOrnPlants.MOD_ID, "third_overworld_biomes"), thirdOverworldWeight));

        SurfaceRuleManager.addSurfaceRules(
                SurfaceRuleManager.RuleCategory.OVERWORLD,
                MoreOrnPlants.MOD_ID,
                ModSurfaceRules.makeRules()
        );
    }
}