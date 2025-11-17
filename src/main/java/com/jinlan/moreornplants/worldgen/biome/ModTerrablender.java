package com.jinlan.moreornplants.worldgen.biome;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.config.BiomeConfigManager;
import net.minecraft.resources.ResourceLocation;
import terrablender.api.Regions;

public class ModTerrablender {
    public static void registerBiomes() {
        try {
            // 使用配置管理器获取权重
            int specialWeight = BiomeConfigManager.getSpecialBiomesWeight();
            int overworldWeight = BiomeConfigManager.getOverworldBiomesWeight();

            Regions.register(new thePeachBlossomSpringRegion(
                    new ResourceLocation(MoreOrnPlants.MOD_ID, "the_peach_blossom_spring"), specialWeight));

            // 注册主要生物群系区域
            Regions.register(new OverworldBiomesRegion(
                    new ResourceLocation(MoreOrnPlants.MOD_ID, "overworld_biomes"), overworldWeight));

            MoreOrnPlants.LOGGER.info("Successfully registered TerraBlender biomes with weights - overworld: {}, special: {}",
                    overworldWeight, specialWeight);
        } catch (Exception e) {
            MoreOrnPlants.LOGGER.error("Failed to register TerraBlender biomes", e);
        }
    }
}
