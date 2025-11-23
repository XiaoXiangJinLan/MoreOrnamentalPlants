package com.jinlan.moreornplants.config;

public class BiomeConfigManager {
    public static boolean isBiomeEnabled(String biomeName) {
        return switch (biomeName) {
            case "red_mei_forest" -> ModBiomeConfig.ENABLE_RED_MEI_FOREST.get();
            case "peony_meadows" -> ModBiomeConfig.ENABLE_PEONY_MEADOWS.get();
            case "evergreen_forest" -> ModBiomeConfig.ENABLE_EVERGREEN_FOREST.get();
            case "flowers_grove" -> ModBiomeConfig.ENABLE_FLOWERS_GROVE.get();
            case "colored_forest" -> ModBiomeConfig.ENABLE_COLORED_FOREST.get();
            case "the_peach_blossom_spring" -> ModBiomeConfig.ENABLE_PEACH_BLOSSOM_SPRING.get();
            default -> true;
        };
    }

    public static int getOverworldBiomesWeight() {
        return ModBiomeConfig.OVERWORLD_BIOMES_WEIGHT.get();
    }

    public static int getSpecialBiomesWeight() {
        return ModBiomeConfig.SPECIAL_BIOMES_WEIGHT.get();
    }

}
