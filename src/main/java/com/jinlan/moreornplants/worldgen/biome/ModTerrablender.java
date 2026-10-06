package com.jinlan.moreornplants.worldgen.biome;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.init.ModVillagerTypes;
import net.neoforged.fml.ModList;

public class ModTerrablender {
    public static void registerBiomes() {
        if (ModList.get().isLoaded("terrablender")) {
            try {
                Class<?> clazz = Class.forName("com.jinlan.moreornplants.worldgen.biome.TerraBlenderIntegration");
                clazz.getDeclaredMethod("registerBiomes").invoke(null);
            } catch (Exception e) {
                MoreOrnPlants.LOGGER.error("Failed to initialize TerraBlender integration", e);
            }
        } else {
            MoreOrnPlants.LOGGER.info("TerraBlender not found, skipping biome registration");
        }
        // 村民类型注册可以保留，因为它不依赖 TerraBlender
        ModVillagerTypes.registerVillagerTypes();
    }
}