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
            case "camellia_valley" -> ModBiomeConfig.ENABLE_CAMELLIA_VALLEY.get();
            case "crimson_highlands" -> ModBiomeConfig.ENABLE_CRIMSON_HIGHLANDS.get();
            case "cottonrose_realm" -> ModBiomeConfig.ENABLE_COTTONROSE_REALM.get();
            case "desert_poplar_woods" -> ModBiomeConfig.ENABLE_DESERT_POPLAR_WOODS.get();
            case "chinese_rose_fields" -> ModBiomeConfig.ENABLE_CHINESE_ROSE_FIELDS.get();
            case "chinaberry_woods" -> ModBiomeConfig.ENABLE_CHINABERRY_WOODS.get();
            case "miscanthus_fields" -> ModBiomeConfig.ENABLE_MISCANTHUS_FIELDS.get();
            case "crops_green" -> ModBiomeConfig.ENABLE_CROPS_GREEN.get();
            default -> true;
        };
    }

    public static int getOverworldBiomesWeight() {
        return ModBiomeConfig.OVERWORLD_BIOMES_WEIGHT.get();
    }

    public static int getSecondOverworldBiomesWeight() {
        return ModBiomeConfig.SECOND_OVERWORLD_BIOMES_WEIGHT.get();
    }

    public static int getSpecialBiomesWeight() {
        return ModBiomeConfig.SPECIAL_BIOMES_WEIGHT.get();
    }

}
