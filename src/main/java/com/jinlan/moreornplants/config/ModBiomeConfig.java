package com.jinlan.moreornplants.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModBiomeConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // 生物群系启用配置
    public static final ForgeConfigSpec.BooleanValue ENABLE_RED_MEI_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SPRING_RIVER;
    public static final ForgeConfigSpec.BooleanValue ENABLE_JIANGTIAN_MUXUE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PENGLAI;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MOUNT_MEI;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FRAGRANT_SNOW_SEA;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEONY_SEA;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEONY_MEADOWS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_EVERGREEN_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LONGEVITY_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FLOWERS_GROVE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CRABAPPLE_GROVE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_COLORED_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEACH_BLOSSOM_SPRING;
    public static final ForgeConfigSpec.BooleanValue ENABLE_APRICOT_SPRING_PLATEAU;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CAMELLIA_VALLEY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_RED_CAMELLIA_VALLEY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PINK_CAMELLIA_VALLEY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_RED_HIGHLANDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_AZALEA_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FURONG_GUO;
    public static final ForgeConfigSpec.BooleanValue ENABLE_YUNMENG_MARSH;
    public static final ForgeConfigSpec.BooleanValue ENABLE_DESERT_POPLAR_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CHINESE_ROSE_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SWEETGUM_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CHINABERRY_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SNOW_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MISCANTHUS_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_GINKGO_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CROPS_GREEN;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PURPLE_CLOUD;
    public static final ForgeConfigSpec.BooleanValue ENABLE_TEN_MILE_GALLERY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_ZIYING_CAVES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SUYU_CAVES;

    // 区域权重配置
    public static final ForgeConfigSpec.IntValue OVERWORLD_BIOMES_WEIGHT;
    public static final ForgeConfigSpec.IntValue SECOND_OVERWORLD_BIOMES_WEIGHT;
    public static final ForgeConfigSpec.IntValue SPECIAL_BIOMES_WEIGHT;

    // 武器伤害配置
    public static final ForgeConfigSpec.ConfigValue<Double> CAMPHOR_SWORD_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> CHINESE_PARASOL_SWORD_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> ZIYING_TOOLS_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> SUYU_TOOLS_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> ZIYU_YUANYANG_TOOLS_BASE_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> ZIYU_YUANYANG_TOOLS_CRIT_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> ZHUIYUE_SWORD_FULL_MOON_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> CAIYUN_SWORD_CLEAR_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> CAIYUN_SWORD_RAIN_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> CAIYUN_SWORD_THUNDER_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> BAIHUA_SWORD_FLOWER_MULTIPLIER;
    public static final ForgeConfigSpec.ConfigValue<Double> BAIHUA_SWORD_FLORAL_BIOME_MULTIPLIER;

    static {
        // 生物群系启用设置
        BUILDER.push("Biome Enable Settings");
        ENABLE_RED_MEI_FOREST = BUILDER
                .define("enableRedMeiForest", true);
        ENABLE_SPRING_RIVER = BUILDER
                .define("enableSpringRiver", true);
        ENABLE_JIANGTIAN_MUXUE = BUILDER
                .define("enableJiangtianMuxue", true);
        ENABLE_PENGLAI = BUILDER
                .define("enablePenglai", true);
        ENABLE_MOUNT_MEI = BUILDER
                .define("enableMountMei", true);
        ENABLE_FRAGRANT_SNOW_SEA = BUILDER
                .define("enableFragrantSnowSea", true);
        ENABLE_PEONY_SEA = BUILDER
                .define("enablePeonySea", true);
        ENABLE_PEONY_MEADOWS = BUILDER
                .define("enablePeonyMeadows", true);
        ENABLE_EVERGREEN_FOREST = BUILDER
                .define("enableEvergreenForest", true);
        ENABLE_LONGEVITY_FOREST = BUILDER
                .define("enableLongevityForest", true);
        ENABLE_FLOWERS_GROVE = BUILDER
                .define("enableFlowersGrove", true);
        ENABLE_CRABAPPLE_GROVE = BUILDER
                .define("enableCrabappleGrove", true);
        ENABLE_COLORED_FOREST = BUILDER
                .define("enableColoredForest", true);
        ENABLE_PEACH_BLOSSOM_SPRING = BUILDER
                .define("enablePeachBlossomSpring", true);
        ENABLE_APRICOT_SPRING_PLATEAU = BUILDER
                .define("enableApricotSpringPlateau", true);
        ENABLE_CAMELLIA_VALLEY = BUILDER
                .define("enableCamelliaValley", true);
        ENABLE_RED_CAMELLIA_VALLEY = BUILDER
                .define("enableRedCamelliaValley", true);
        ENABLE_PINK_CAMELLIA_VALLEY = BUILDER
                .define("enablePinkCamelliaValley", true);
        ENABLE_RED_HIGHLANDS = BUILDER
                .define("enableRedHighlands", true);
        ENABLE_AZALEA_FOREST = BUILDER
                .define("enableAzaleaForest", true);
        ENABLE_FURONG_GUO = BUILDER
                .define("enableFurongGuo", true);
        ENABLE_YUNMENG_MARSH = BUILDER
                .define("enableYunmengMarsh", true);
        ENABLE_DESERT_POPLAR_WOODS = BUILDER
                .define("enableDesertPoplarWoods", true);
        ENABLE_CHINESE_ROSE_FIELDS = BUILDER
                .define("enableChineseRoseFields", true);
        ENABLE_SWEETGUM_WOODS = BUILDER
                .define("enableSweetgumWoods", true);
        ENABLE_CHINABERRY_WOODS = BUILDER
                .define("enableChinaberryWoods", true);
        ENABLE_SNOW_WOODS = BUILDER
                .define("enableSnowWoods", true);
        ENABLE_MISCANTHUS_FIELDS = BUILDER
                .define("enableMiscanthusFields", true);
        ENABLE_GINKGO_FOREST = BUILDER
                .define("enableGinkgoForest", true);
        ENABLE_CROPS_GREEN = BUILDER
                .define("enableCropsGreen", true);
        ENABLE_PURPLE_CLOUD = BUILDER
                .define("enablePurpleCloud", true);
        ENABLE_TEN_MILE_GALLERY = BUILDER
                .define("enableTenMileGallery", true);
        ENABLE_ZIYING_CAVES = BUILDER
                .define("enableZiyingCaves", true);
        ENABLE_SUYU_CAVES = BUILDER
                .define("enableSuyuCaves", true);
        BUILDER.pop();

        // 区域权重设置
        BUILDER.push("Region Weight Settings");
        OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("Weight for main overworld biomes region")
                .defineInRange("overworldBiomesWeight", 5, 1, 20);
        SECOND_OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("Weight for second overworld biomes region")
                .defineInRange("secondOverworldBiomesWeight", 4, 1, 20);
        SPECIAL_BIOMES_WEIGHT = BUILDER
                .comment("Weight for special biomes region")
                .defineInRange("specialBiomesWeight", 1, 1, 20);
        BUILDER.pop();

        // 武器伤害配置
        BUILDER.push("Weapon Config");
        CAMPHOR_SWORD_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Camphor Wooden Sword")
                .define("camphorSwordMultiplier", 2.22);
        CHINESE_PARASOL_SWORD_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Chinese Parasol Wooden Sword")
                .define("chineseParasolSwordMultiplier", 3.33);

        ZIYING_TOOLS_MULTIPLIER = BUILDER
                .comment("Critical hit damage multiplier for Ziying tools")
                .define("ziyingToolsMultiplier", 3.0);
        SUYU_TOOLS_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Suyu tools")
                .define("suyuToolsMultiplier", 1.5);
        ZIYU_YUANYANG_TOOLS_BASE_MULTIPLIER = BUILDER
                .comment("Base damage multiplier for Ziyu Yuanyang tools")
                .define("ziyuYuanyangToolsBaseMultiplier", 1.25);
        ZIYU_YUANYANG_TOOLS_CRIT_MULTIPLIER = BUILDER
                .comment("Critical hit damage multiplier for Ziyu Yuanyang tools")
                .define("ziyuYuanyangToolsCritMultiplier", 3.0);

        ZHUIYUE_SWORD_FULL_MOON_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Zhuiyue Sword during full moon")
                .define("zhuiyueSwordFullMoonMultiplier", 2.0);
        CAIYUN_SWORD_CLEAR_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Caiyun Sword in clear weather")
                .define("caiyunSwordClearMultiplier", 1.5);
        CAIYUN_SWORD_RAIN_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Caiyun Sword in rain (no thunder)")
                .define("caiyunSwordRainMultiplier", 1.0);
        CAIYUN_SWORD_THUNDER_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Caiyun Sword in thunderstorm")
                .define("caiyunSwordThunderMultiplier", 0.5);

        BAIHUA_SWORD_FLOWER_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Baihua Sword when player has a flower")
                .define("baihuaSwordFlowerMultiplier", 5.0);
        BAIHUA_SWORD_FLORAL_BIOME_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Baihua Sword in floral biomes")
                .define("baihuaSwordFloralBiomeMultiplier", 9.0);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
