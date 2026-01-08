package com.jinlan.moreornplants.worldgen.biome;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.config.BiomeConfigManager;
import com.jinlan.moreornplants.init.ModVillagerTypes;
import com.jinlan.moreornplants.worldgen.biome.surface.ModSurfaceRules;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;

public class ModTerrablender {
    public static void registerBiomes() {
        // 使用配置管理器获取权重
        int specialWeight = BiomeConfigManager.getSpecialBiomesWeight();
        int overworldWeight = BiomeConfigManager.getOverworldBiomesWeight();
        int secondOverworldWeight = BiomeConfigManager.getSecondOverworldBiomesWeight();

        Regions.register(new thePeachBlossomSpringRegion(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "the_peach_blossom_spring"), specialWeight));

        // 注册主要生物群系区域
        Regions.register(new OverworldBiomesRegion(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "overworld_biomes"), overworldWeight));

        Regions.register(new SecondOverworldBiomesRegion(
                ResourceLocation.parse(MoreOrnPlants.MODID + ":" + "second_overworld_biomes"), secondOverworldWeight));

        SurfaceRuleManager.addSurfaceRules(
                SurfaceRuleManager.RuleCategory.OVERWORLD,
                MoreOrnPlants.MODID,
                ModSurfaceRules.makeRules()
        );
        ModVillagerTypes.registerVillagerTypes();
    }
}
