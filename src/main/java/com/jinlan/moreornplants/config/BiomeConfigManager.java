package com.jinlan.moreornplants.config;

public class BiomeConfigManager {
    public static boolean isBiomeEnabled(String biomeName) {
        return switch (biomeName) {
            case "red_mei_forest" -> ModBiomeConfig.ENABLE_RED_MEI_FOREST.get();
            case "snow_greets_spring" -> ModBiomeConfig.ENABLE_SNOW_GREETS_SPRING.get();
            case "handong_layue" -> ModBiomeConfig.ENABLE_HANDONG_LAYUE.get();
            case "peony_sea" -> ModBiomeConfig.ENABLE_PEONY_SEA.get();
            case "peony_meadows" -> ModBiomeConfig.ENABLE_PEONY_MEADOWS.get();
            case "evergreen_forest" -> ModBiomeConfig.ENABLE_EVERGREEN_FOREST.get();
            case "longevity_forest" -> ModBiomeConfig.ENABLE_LONGEVITY_FOREST.get();
            case "flowers_grove" -> ModBiomeConfig.ENABLE_FLOWERS_GROVE.get();
            case "flowers_fields" -> ModBiomeConfig.ENABLE_FLOWERS_FIELDS.get();
            case "crabapple_grove" -> ModBiomeConfig.ENABLE_CRABAPPLE_GROVE.get();
            case "colored_forest" -> ModBiomeConfig.ENABLE_COLORED_FOREST.get();
            case "wutong_forest" -> ModBiomeConfig.ENABLE_WUTONG_FOREST.get();
            case "the_peach_blossom_spring" -> ModBiomeConfig.ENABLE_PEACH_BLOSSOM_SPRING.get();
            case "camellia_valley" -> ModBiomeConfig.ENABLE_CAMELLIA_VALLEY.get();
            case "red_camellia_valley" -> ModBiomeConfig.ENABLE_RED_CAMELLIA_VALLEY.get();
            case "pink_camellia_valley" -> ModBiomeConfig.ENABLE_PINK_CAMELLIA_VALLEY.get();
            case "red_highlands" -> ModBiomeConfig.ENABLE_RED_HIGHLANDS.get();
            case "furong_guo" -> ModBiomeConfig.ENABLE_FURONG_GUO.get();
            case "desert_poplar_woods" -> ModBiomeConfig.ENABLE_DESERT_POPLAR_WOODS.get();
            case "tamarisk_fields" -> ModBiomeConfig.ENABLE_TAMARISK_FIELDS.get();
            case "gold_country" -> ModBiomeConfig.ENABLE_GOLD_COUNTRY.get();
            case "chinese_rose_fields" -> ModBiomeConfig.ENABLE_CHINESE_ROSE_FIELDS.get();
            case "sweetgum_woods" -> ModBiomeConfig.ENABLE_SWEETGUM_WOODS.get();
            case "chinaberry_woods" -> ModBiomeConfig.ENABLE_CHINABERRY_WOODS.get();
            case "snow_woods" -> ModBiomeConfig.ENABLE_SNOW_WOODS.get();
            case "miscanthus_fields" -> ModBiomeConfig.ENABLE_MISCANTHUS_FIELDS.get();
            case "ginkgo_forest" -> ModBiomeConfig.ENABLE_GINKGO_FOREST.get();
            case "crops_green" -> ModBiomeConfig.ENABLE_CROPS_GREEN.get();
            case "the_land_of_abundance" -> ModBiomeConfig.ENABLE_LAND_OF_ABUNDANCE.get();
            case "pink_land" -> ModBiomeConfig.ENABLE_PINK_LAND.get();
            case "purple_land" -> ModBiomeConfig.ENABLE_PURPLE_LAND.get();
            case "white_land" -> ModBiomeConfig.ENABLE_WHITE_LAND.get();
            case "yellow_land" -> ModBiomeConfig.ENABLE_YELLOW_LAND.get();
            case "purple_cloud" -> ModBiomeConfig.ENABLE_PURPLE_CLOUD.get();
            case "spring_river" -> ModBiomeConfig.ENABLE_SPRING_RIVER.get();
            case "lotus_river" -> ModBiomeConfig.ENABLE_LOTUS_RIVER.get();
            case "autumn_river" -> ModBiomeConfig.ENABLE_AUTUMN_RIVER.get();
            case "jiangtian_muxue" -> ModBiomeConfig.ENABLE_JIANGTIAN_MUXUE.get();
            case "penglai" -> ModBiomeConfig.ENABLE_PENGLAI.get();
            case "mount_mei" -> ModBiomeConfig.ENABLE_MOUNT_MEI.get();
            case "yunmeng_marsh" -> ModBiomeConfig.ENABLE_YUNMENG_MARSH.get();
            case "fragrant_snow_sea" -> ModBiomeConfig.ENABLE_FRAGRANT_SNOW_SEA.get();
            case "the_apricot_spring_plateau" -> ModBiomeConfig.ENABLE_APRICOT_SPRING_PLATEAU.get();
            case "azalea_forest" -> ModBiomeConfig.ENABLE_AZALEA_FOREST.get();
            case "ten_mile_gallery" -> ModBiomeConfig.ENABLE_TEN_MILE_GALLERY.get();
            case "wisteria_valley" -> ModBiomeConfig.ENABLE_WISTERIA_VALLEY.get();
            case "white_wisteria_valley" -> ModBiomeConfig.ENABLE_WHITE_WISTERIA_VALLEY.get();
            case "blue_wisteria_valley" -> ModBiomeConfig.ENABLE_BLUE_WISTERIA_VALLEY.get();
            case "ziying_caves" -> ModBiomeConfig.ENABLE_ZIYING_CAVES.get();
            case "suyu_caves" -> ModBiomeConfig.ENABLE_SUYU_CAVES.get();
            default -> true;
        };
    }

    public static int getOverworldBiomesWeight() {
        return ModBiomeConfig.OVERWORLD_BIOMES_WEIGHT.get();
    }

    public static int getSecondOverworldBiomesWeight() {
        return ModBiomeConfig.SECOND_OVERWORLD_BIOMES_WEIGHT.get();
    }

    public static int getThirdOverworldBiomesWeight() {
        return ModBiomeConfig.THIRD_OVERWORLD_BIOMES_WEIGHT.get();
    }
}
