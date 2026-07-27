package com.jinlan.moreornplants.config;


import net.neoforged.neoforge.common.ModConfigSpec;

public class ModBiomeConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    // 生物群系启用配置
    public static final ModConfigSpec.BooleanValue ENABLE_RED_MEI_FOREST;
    public static final ModConfigSpec.BooleanValue ENABLE_SNOW_GREETS_SPRING;
    public static final ModConfigSpec.BooleanValue ENABLE_SPRING_RIVER;
    public static final ModConfigSpec.BooleanValue ENABLE_LOTUS_RIVER;
    public static final ModConfigSpec.BooleanValue ENABLE_AUTUMN_RIVER;
    public static final ModConfigSpec.BooleanValue ENABLE_JIANGTIAN_MUXUE;
    public static final ModConfigSpec.BooleanValue ENABLE_PENGLAI;
    public static final ModConfigSpec.BooleanValue ENABLE_MOUNT_MEI;
    public static final ModConfigSpec.BooleanValue ENABLE_FRAGRANT_SNOW_SEA;
    public static final ModConfigSpec.BooleanValue ENABLE_PEONY_SEA;
    public static final ModConfigSpec.BooleanValue ENABLE_PEONY_MEADOWS;
    public static final ModConfigSpec.BooleanValue ENABLE_EVERGREEN_FOREST;
    public static final ModConfigSpec.BooleanValue ENABLE_LONGEVITY_FOREST;
    public static final ModConfigSpec.BooleanValue ENABLE_FLOWERS_GROVE;
    public static final ModConfigSpec.BooleanValue ENABLE_FLOWERS_FIELDS;
    public static final ModConfigSpec.BooleanValue ENABLE_CRABAPPLE_GROVE;
    public static final ModConfigSpec.BooleanValue ENABLE_COLORED_FOREST;
    public static final ModConfigSpec.BooleanValue ENABLE_WUTONG_FOREST;
    public static final ModConfigSpec.BooleanValue ENABLE_PEACH_BLOSSOM_SPRING;
    public static final ModConfigSpec.BooleanValue ENABLE_APRICOT_SPRING_PLATEAU;
    public static final ModConfigSpec.BooleanValue ENABLE_CAMELLIA_VALLEY;
    public static final ModConfigSpec.BooleanValue ENABLE_RED_CAMELLIA_VALLEY;
    public static final ModConfigSpec.BooleanValue ENABLE_PINK_CAMELLIA_VALLEY;
    public static final ModConfigSpec.BooleanValue ENABLE_RED_HIGHLANDS;
    public static final ModConfigSpec.BooleanValue ENABLE_AZALEA_FOREST;
    public static final ModConfigSpec.BooleanValue ENABLE_FURONG_GUO;
    public static final ModConfigSpec.BooleanValue ENABLE_YUNMENG_MARSH;
    public static final ModConfigSpec.BooleanValue ENABLE_DESERT_POPLAR_WOODS;
    public static final ModConfigSpec.BooleanValue ENABLE_TAMARISK_FIELDS;
    public static final ModConfigSpec.BooleanValue ENABLE_GOLD_COUNTRY;
    public static final ModConfigSpec.BooleanValue ENABLE_CHINESE_ROSE_FIELDS;
    public static final ModConfigSpec.BooleanValue ENABLE_SWEETGUM_WOODS;
    public static final ModConfigSpec.BooleanValue ENABLE_CHINABERRY_WOODS;
    public static final ModConfigSpec.BooleanValue ENABLE_SNOW_WOODS;
    public static final ModConfigSpec.BooleanValue ENABLE_MISCANTHUS_FIELDS;
    public static final ModConfigSpec.BooleanValue ENABLE_GINKGO_FOREST;
    public static final ModConfigSpec.BooleanValue ENABLE_CROPS_GREEN;
    public static final ModConfigSpec.BooleanValue ENABLE_LAND_OF_ABUNDANCE;
    public static final ModConfigSpec.BooleanValue ENABLE_PINK_LAND;
    public static final ModConfigSpec.BooleanValue ENABLE_PURPLE_LAND;
    public static final ModConfigSpec.BooleanValue ENABLE_WHITE_LAND;
    public static final ModConfigSpec.BooleanValue ENABLE_YELLOW_LAND;
    public static final ModConfigSpec.BooleanValue ENABLE_PURPLE_CLOUD;
    public static final ModConfigSpec.BooleanValue ENABLE_TEN_MILE_GALLERY;
    public static final ModConfigSpec.BooleanValue ENABLE_ZIYING_CAVES;
    public static final ModConfigSpec.BooleanValue ENABLE_SUYU_CAVES;

    // 区域权重配置
    public static final ModConfigSpec.IntValue OVERWORLD_BIOMES_WEIGHT;
    public static final ModConfigSpec.IntValue SECOND_OVERWORLD_BIOMES_WEIGHT;
    public static final ModConfigSpec.IntValue THIRD_OVERWORLD_BIOMES_WEIGHT;

    public static final ModConfigSpec.BooleanValue ENABLE_BIOME_EFFECTS;
    public static final ModConfigSpec.BooleanValue ENABLE_BIOME_HURT_ENEMY;
    public static final ModConfigSpec.BooleanValue ENABLE_BIOME_NO_ENEMY;
    public static final ModConfigSpec.BooleanValue ENABLE_MOD_FOX_SPAWN;

    // 武器伤害配置
    public static final ModConfigSpec.ConfigValue<Double> CAMPHOR_SWORD_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> CHINESE_PARASOL_SWORD_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> ZIYING_TOOLS_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> SUYU_TOOLS_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> ZIYU_YUANYANG_TOOLS_BASE_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> ZIYU_YUANYANG_TOOLS_CRIT_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> ZHUIYUE_SWORD_FULL_MOON_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> CAIYUN_SWORD_CLEAR_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> CAIYUN_SWORD_RAIN_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> CAIYUN_SWORD_THUNDER_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> BAIHUA_SWORD_FLOWER_MULTIPLIER;
    public static final ModConfigSpec.ConfigValue<Double> BAIHUA_SWORD_FLORAL_BIOME_MULTIPLIER;

    static {
        // 生物群系启用设置
        BUILDER.push("Biome Enable Settings");
        ENABLE_RED_MEI_FOREST = BUILDER
                .define("enableRedMeiForest", true);
        ENABLE_SNOW_GREETS_SPRING = BUILDER
                .define("enableSnowGreetsSpring", true);
        ENABLE_SPRING_RIVER = BUILDER
                .define("enableSpringRiver", true);
        ENABLE_LOTUS_RIVER = BUILDER
                .define("enableLotusRiver", true);
        ENABLE_AUTUMN_RIVER = BUILDER
                .define("enableAutumnRiver", true);
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
        ENABLE_FLOWERS_FIELDS = BUILDER
                .define("enableFlowersFields", true);
        ENABLE_CRABAPPLE_GROVE = BUILDER
                .define("enableCrabappleGrove", true);
        ENABLE_COLORED_FOREST = BUILDER
                .define("enableColoredForest", true);
        ENABLE_WUTONG_FOREST = BUILDER
                .define("enableWutongForest", true);
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
        ENABLE_TAMARISK_FIELDS = BUILDER
                .define("enableTamariskFields", true);
        ENABLE_GOLD_COUNTRY = BUILDER
                .define("enableGoldCountry", true);
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
        ENABLE_LAND_OF_ABUNDANCE = BUILDER
                .define("enableLandOfAbundance", true);
        ENABLE_PINK_LAND = BUILDER
                .define("enablePinkLand", true);
        ENABLE_PURPLE_LAND = BUILDER
                .define("enablePurpleLand", true);
        ENABLE_WHITE_LAND = BUILDER
                .define("enableWhiteLand", true);
        ENABLE_YELLOW_LAND = BUILDER
                .define("enableYellowLand", true);
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
                .defineInRange("overworldBiomesWeight", 6, 1, 20);
        SECOND_OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("Weight for second overworld biomes region")
                .defineInRange("secondOverworldBiomesWeight", 5, 1, 20);
        THIRD_OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("Weight for third overworld biomes region")
                .defineInRange("thirdOverworldBiomesWeight", 4, 1, 20);
        BUILDER.pop();

        // 生物群系提供效果设置
        BUILDER.push("Biome Effects Settings");
        ENABLE_BIOME_EFFECTS = BUILDER
                .define("enableBiomeEffects", true);
        ENABLE_BIOME_HURT_ENEMY = BUILDER
                .define("enableBiomeHurtEnemy", true);
        ENABLE_BIOME_NO_ENEMY = BUILDER
                .define("enableBiomeNoEnemy", true);
        ENABLE_MOD_FOX_SPAWN = BUILDER
                .define("enableModFoxSpawn", true);
        BUILDER.pop();

        // 武器伤害配置
        BUILDER.push("Weapon Config");
        CAMPHOR_SWORD_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Camphor Wooden Sword")
                .define("camphorSwordMultiplier", 5.5);
        CHINESE_PARASOL_SWORD_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Chinese Parasol Wooden Sword")
                .define("chineseParasolSwordMultiplier", 6.6);

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
                .define("zhuiyueSwordFullMoonMultiplier", 3.0);
        CAIYUN_SWORD_CLEAR_MULTIPLIER = BUILDER
                .comment("Damage multiplier for Caiyun Sword in clear weather")
                .define("caiyunSwordClearMultiplier", 2.0);
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
