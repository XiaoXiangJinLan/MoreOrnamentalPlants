package com.jinlan.moreornplants.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModBiomeConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // 生物群系启用配置
    public static final ForgeConfigSpec.BooleanValue ENABLE_RED_MEI_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEONY_MEADOWS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_EVERGREEN_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FLOWERS_GROVE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_COLORED_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEACH_BLOSSOM_SPRING;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CAMELLIA_VALLEY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CRIMSON_HIGHLANDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_COTTONROSE_REALM;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DESERT_POPLAR_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CHINESE_ROSE_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CHINABERRY_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MISCANTHUS_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CROPS_GREEN;

    // 区域权重配置
    public static final ForgeConfigSpec.IntValue OVERWORLD_BIOMES_WEIGHT;
    public static final ForgeConfigSpec.IntValue SECOND_OVERWORLD_BIOMES_WEIGHT;
    public static final ForgeConfigSpec.IntValue SPECIAL_BIOMES_WEIGHT;

    static {
        BUILDER.push("MoreOrnPlants Biome Configuration");

        // 生物群系启用设置
        BUILDER.push("Biome Enable Settings");
        ENABLE_RED_MEI_FOREST = BUILDER
                .comment("Enable Red Mei Forest biome generation")
                .define("enableRedMeiForest", true);
        ENABLE_PEONY_MEADOWS = BUILDER
                .comment("Enable Peony Meadows biome generation")
                .define("enablePeonyMeadows", true);
        ENABLE_EVERGREEN_FOREST = BUILDER
                .comment("Enable Evergreen Forest biome generation")
                .define("enableEvergreenForest", true);
        ENABLE_FLOWERS_GROVE = BUILDER
                .comment("Enable Flowers Grove biome generation")
                .define("enableFlowersGrove", true);
        ENABLE_COLORED_FOREST = BUILDER
                .comment("Enable Colored Forest biome generation")
                .define("enableColoredForest", true);
        ENABLE_PEACH_BLOSSOM_SPRING = BUILDER
                .comment("Enable The Peach Blossom Spring biome generation")
                .define("enablePeachBlossomSpring", true);
        ENABLE_CAMELLIA_VALLEY = BUILDER
                .comment("Enable Camellia Valley biome generation")
                .define("enableCamelliaValley", true);
        ENABLE_CRIMSON_HIGHLANDS = BUILDER
                .comment("Enable Crimson Highlands biome generation")
                .define("enableCrimsonHighlands", true);
        ENABLE_COTTONROSE_REALM = BUILDER
                .comment("Enable Cottonrose Realm biome generation")
                .define("enableCottonroseRealm", true);
        ENABLE_DESERT_POPLAR_WOODS = BUILDER
                .comment("Enable Desert Poplar Woods biome generation")
                .define("enableDesertPoplarWoods", true);
        ENABLE_CHINESE_ROSE_FIELDS = BUILDER
                .comment("Enable Chinese Rose Fields biome generation")
                .define("enableChineseRoseFields", true);
        ENABLE_CHINABERRY_WOODS = BUILDER
                .comment("Enable Chinaberry Woods biome generation")
                .define("enableChinaberryWoods", true);
        ENABLE_MISCANTHUS_FIELDS = BUILDER
                .comment("Enable Miscanthus Fields biome generation")
                .define("enableMiscanthusFields", true);
        ENABLE_CROPS_GREEN = BUILDER
                .comment("Enable Crops Green Woods biome generation")
                .define("enableCropsGreen", true);
        BUILDER.pop();

        // 区域权重设置
        BUILDER.push("Region Weight Settings");
        OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("Weight for main overworld biomes region")
                .defineInRange("overworldBiomesWeight", 5, 1, 20);
        SECOND_OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("Weight for second overworld biomes region")
                .defineInRange("overworldBiomesWeight", 4, 1, 20);
        SPECIAL_BIOMES_WEIGHT = BUILDER
                .comment("Weight for special biomes region")
                .defineInRange("specialBiomesWeight", 1, 1, 20);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
