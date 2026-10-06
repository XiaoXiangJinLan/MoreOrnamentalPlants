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
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "overworld_biomes"), overworldWeight));
        Regions.register(new SecondOverworldBiomesRegion(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "second_overworld_biomes"), secondOverworldWeight));
        Regions.register(new ThirdOverworldBiomesRegion(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "third_overworld_biomes"), thirdOverworldWeight));

        SurfaceRuleManager.addSurfaceRules(
                SurfaceRuleManager.RuleCategory.OVERWORLD,
                MoreOrnPlants.MODID,
                ModSurfaceRules.makeRules()
        );
    }
}