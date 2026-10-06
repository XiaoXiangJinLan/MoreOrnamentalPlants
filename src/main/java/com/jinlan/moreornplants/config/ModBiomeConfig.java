package com.jinlan.moreornplants.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModBiomeConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // 生物群系启用配置
    public static final ForgeConfigSpec.BooleanValue ENABLE_RED_MEI_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SNOW_GREETS_SPRING;
    public static final ForgeConfigSpec.BooleanValue ENABLE_HANDONG_LAYUE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SPRING_RIVER;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LOTUS_RIVER;
    public static final ForgeConfigSpec.BooleanValue ENABLE_AUTUMN_RIVER;
    public static final ForgeConfigSpec.BooleanValue ENABLE_JIANGTIAN_MUXUE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PENGLAI;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MOUNT_MEI;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FRAGRANT_SNOW_SEA;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEONY_SEA;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEONY_MEADOWS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_EVERGREEN_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LONGEVITY_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FLOWERS_GROVE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FLOWERS_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CRABAPPLE_GROVE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_COLORED_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_WUTONG_FOREST;
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
    public static final ForgeConfigSpec.BooleanValue ENABLE_TAMARISK_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_GOLD_COUNTRY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CHINESE_ROSE_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SWEETGUM_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CHINABERRY_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SNOW_WOODS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MISCANTHUS_FIELDS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_GINKGO_FOREST;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CROPS_GREEN;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LAND_OF_ABUNDANCE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PINK_LAND;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PURPLE_LAND;
    public static final ForgeConfigSpec.BooleanValue ENABLE_WHITE_LAND;
    public static final ForgeConfigSpec.BooleanValue ENABLE_YELLOW_LAND;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PURPLE_CLOUD;
    public static final ForgeConfigSpec.BooleanValue ENABLE_TEN_MILE_GALLERY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_WISTERIA_VALLEY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_WHITE_WISTERIA_VALLEY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_BLUE_WISTERIA_VALLEY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_ZIYING_CAVES;
    public static final ForgeConfigSpec.BooleanValue ENABLE_SUYU_CAVES;

    public static final ForgeConfigSpec.BooleanValue ENABLE_FLOWER_BIOME_EFFECTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_LONGEVITY_FOREST_EFFECTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PENGLAI_EFFECTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_RED_HIGHLANDS_EFFECTS;
    public static final ForgeConfigSpec.BooleanValue ENABLE_WUTONG_BIOME_HURT_ENEMY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_CAVES_BIOME_HURT_ENEMY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEACH_BIOME_HURT_ENEMY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_PEACH_BIOME_AUTO_CURE;
    public static final ForgeConfigSpec.BooleanValue ENABLE_BIOME_NO_ENEMY;
    public static final ForgeConfigSpec.BooleanValue ENABLE_BIOME_SPEED_CROP;
    public static final ForgeConfigSpec.BooleanValue ENABLE_MOD_FOX_SPAWN;

    public static final ForgeConfigSpec.BooleanValue PARTICLE_DESPAWN_ON_GROUND;

    // 区域权重配置
    public static final ForgeConfigSpec.IntValue OVERWORLD_BIOMES_WEIGHT;
    public static final ForgeConfigSpec.IntValue SECOND_OVERWORLD_BIOMES_WEIGHT;
    public static final ForgeConfigSpec.IntValue THIRD_OVERWORLD_BIOMES_WEIGHT;

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
                .comment("白雪红梅")
                .define("enableRedMeiForest", true);
        ENABLE_SNOW_GREETS_SPRING = BUILDER
                .comment("飞雪迎春")
                .define("enableSnowGreetsSpring", true);
        ENABLE_FRAGRANT_SNOW_SEA = BUILDER
                .comment("香雪海")
                .define("enableFragrantSnowSea", true);
        ENABLE_HANDONG_LAYUE = BUILDER
                .comment("寒冬腊月")
                .define("enableHandongLayue", true);
        ENABLE_SPRING_RIVER = BUILDER
                .comment("春江")
                .define("enableSpringRiver", true);
        ENABLE_LOTUS_RIVER = BUILDER
                .comment("莲水")
                .define("enableLotusRiver", true);
        ENABLE_AUTUMN_RIVER = BUILDER
                .comment("秋水")
                .define("enableAutumnRiver", true);
        ENABLE_JIANGTIAN_MUXUE = BUILDER
                .comment("江天暮雪")
                .define("enableJiangtianMuxue", true);
        ENABLE_PENGLAI = BUILDER
                .comment("蓬莱")
                .define("enablePenglai", true);
        ENABLE_MOUNT_MEI = BUILDER
                .comment("梅山")
                .define("enableMountMei", true);
        ENABLE_PEONY_SEA = BUILDER
                .comment("牡丹花海")
                .define("enablePeonySea", true);
        ENABLE_PEONY_MEADOWS = BUILDER
                .comment("芍药花海")
                .define("enablePeonyMeadows", true);
        ENABLE_EVERGREEN_FOREST = BUILDER
                .comment("常绿林")
                .define("enableEvergreenForest", true);
        ENABLE_LONGEVITY_FOREST = BUILDER
                .comment("长寿林")
                .define("enableLongevityForest", true);
        ENABLE_FLOWERS_GROVE = BUILDER
                .comment("百花林")
                .define("enableFlowersGrove", true);
        ENABLE_FLOWERS_FIELDS = BUILDER
                .comment("百花田")
                .define("enableFlowersFields", true);
        ENABLE_CRABAPPLE_GROVE = BUILDER
                .comment("烟雨海棠")
                .define("enableCrabappleGrove", true);
        ENABLE_COLORED_FOREST = BUILDER
                .comment("彩叶林")
                .define("enableColoredForest", true);
        ENABLE_WUTONG_FOREST = BUILDER
                .comment("朝阳林")
                .define("enableWutongForest", true);
        ENABLE_PEACH_BLOSSOM_SPRING = BUILDER
                .comment("世外桃源")
                .define("enablePeachBlossomSpring", true);
        ENABLE_APRICOT_SPRING_PLATEAU = BUILDER
                .comment("高原春杏")
                .define("enableApricotSpringPlateau", true);
        ENABLE_CAMELLIA_VALLEY = BUILDER
                .comment("茶花谷")
                .define("enableCamelliaValley", true);
        ENABLE_RED_CAMELLIA_VALLEY = BUILDER
                .comment("红茶花谷")
                .define("enableRedCamelliaValley", true);
        ENABLE_PINK_CAMELLIA_VALLEY = BUILDER
                .comment("粉茶花谷")
                .define("enablePinkCamelliaValley", true);
        ENABLE_RED_HIGHLANDS = BUILDER
                .comment("映山红")
                .define("enableRedHighlands", true);
        ENABLE_AZALEA_FOREST = BUILDER
                .comment("百里杜鹃")
                .define("enableAzaleaForest", true);
        ENABLE_FURONG_GUO = BUILDER
                .comment("芙蓉国")
                .define("enableFurongGuo", true);
        ENABLE_YUNMENG_MARSH = BUILDER
                .comment("云梦泽")
                .define("enableYunmengMarsh", true);
        ENABLE_DESERT_POPLAR_WOODS = BUILDER
                .comment("胡杨林")
                .define("enableDesertPoplarWoods", true);
        ENABLE_TAMARISK_FIELDS = BUILDER
                .comment("柽柳田")
                .define("enableTamariskFields", true);
        ENABLE_GOLD_COUNTRY = BUILDER
                .comment("黄金国")
                .define("enableGoldCountry", true);
        ENABLE_CHINESE_ROSE_FIELDS = BUILDER
                .comment("月季花海")
                .define("enableChineseRoseFields", true);
        ENABLE_SWEETGUM_WOODS = BUILDER
                .comment("枫香林")
                .define("enableSweetgumWoods", true);
        ENABLE_CHINABERRY_WOODS = BUILDER
                .comment("楝花林")
                .define("enableChinaberryWoods", true);
        ENABLE_SNOW_WOODS = BUILDER
                .comment("晴雪林")
                .define("enableSnowWoods", true);
        ENABLE_MISCANTHUS_FIELDS = BUILDER
                .comment("芒草田")
                .define("enableMiscanthusFields", true);
        ENABLE_GINKGO_FOREST = BUILDER
                .comment("银杏林")
                .define("enableGinkgoForest", true);
        ENABLE_CROPS_GREEN = BUILDER
                .comment("禾青")
                .define("enableCropsGreen", true);
        ENABLE_LAND_OF_ABUNDANCE = BUILDER
                .comment("天府国")
                .define("enableLandOfAbundance", true);
        ENABLE_PINK_LAND = BUILDER
                .comment("粉黛花地")
                .define("enablePinkLand", true);
        ENABLE_PURPLE_LAND = BUILDER
                .comment("霁紫花地")
                .define("enablePurpleLand", true);
        ENABLE_WHITE_LAND = BUILDER
                .comment("皓月花地")
                .define("enableWhiteLand", true);
        ENABLE_YELLOW_LAND = BUILDER
                .comment("鹅黄花地")
                .define("enableYellowLand", true);
        ENABLE_PURPLE_CLOUD = BUILDER
                .comment("紫云林")
                .define("enablePurpleCloud", true);
        ENABLE_TEN_MILE_GALLERY = BUILDER
                .comment("十里画廊")
                .define("enableTenMileGallery", true);
        ENABLE_WISTERIA_VALLEY = BUILDER
                .comment("紫藤花谷")
                .define("enableWisteriaValley", true);
        ENABLE_WHITE_WISTERIA_VALLEY = BUILDER
                .comment("银藤花谷")
                .define("enableWhiteWisteriaValley", true);
        ENABLE_BLUE_WISTERIA_VALLEY = BUILDER
                .comment("蓝藤花谷")
                .define("enableBlueWisteriaValley", true);
        ENABLE_ZIYING_CAVES = BUILDER
                .comment("紫英洞")
                .define("enableZiyingCaves", true);
        ENABLE_SUYU_CAVES = BUILDER
                .comment("素玉洞")
                .define("enableSuyuCaves", true);
        BUILDER.pop();

        // 生物群系提供效果设置
        BUILDER.push("Biome Effects Settings");
        ENABLE_FLOWER_BIOME_EFFECTS = BUILDER
                .comment("是否让繁花群系提供效果")
                .define("enableFlowerBiomeEffects", true);
        ENABLE_LONGEVITY_FOREST_EFFECTS = BUILDER
                .comment("是否让长寿林提供效果")
                .define("enableLongevityForestEffects", true);
        ENABLE_PENGLAI_EFFECTS = BUILDER
                .comment("是否让蓬莱提供效果")
                .define("enablePenglaiEffects", true);
        ENABLE_RED_HIGHLANDS_EFFECTS = BUILDER
                .comment("是否让映山红提供效果")
                .define("enableRedHighlandsEffects", true);
        ENABLE_WUTONG_BIOME_HURT_ENEMY = BUILDER
                .comment("是否让朝阳林伤害敌对生物")
                .define("enableWutongBiomeHurtEnemy", true);
        ENABLE_CAVES_BIOME_HURT_ENEMY = BUILDER
                .comment("是否让紫英洞与素玉洞伤害敌对生物")
                .define("enableCavesBiomeHurtEnemy", true);
        ENABLE_PEACH_BIOME_HURT_ENEMY = BUILDER
                .comment("是否让世外桃源伤害敌对生物")
                .define("enablePeachBiomeHurtEnemy", true);
        ENABLE_PEACH_BIOME_AUTO_CURE = BUILDER
                .comment("是否让世外桃源疗愈僵尸村民")
                .define("enablePeachBiomeAutoCure", true);
        ENABLE_BIOME_NO_ENEMY = BUILDER
                .comment("是否让群系不生成敌对生物")
                .define("enableBiomeNoEnemy", true);
        ENABLE_BIOME_SPEED_CROP = BUILDER
                .comment("是否让群系加速作物生长")
                .define("enableBiomeSpeedCrop", true);
        ENABLE_MOD_FOX_SPAWN = BUILDER
                .comment("是否生成紫英狐与素玉狐")
                .define("enableModFoxSpawn", true);
        BUILDER.pop();

        // 花瓣粒子效果设置
        BUILDER.push("Particle Settings");
        PARTICLE_DESPAWN_ON_GROUND = BUILDER
                .comment("花瓣粒子触地消失")
                .define("particleDespawnOnGround", true);
        BUILDER.pop();

        // 区域权重设置
        BUILDER.push("Region Weight Settings");
        OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("主群系权重")
                .defineInRange("overworldBiomesWeight", 6, 0, 20);
        SECOND_OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("次群系权重")
                .defineInRange("secondOverworldBiomesWeight", 5, 0, 20);
        THIRD_OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("次次群系权重")
                .defineInRange("thirdOverworldBiomesWeight", 4, 0, 20);
        BUILDER.pop();

        // 武器伤害配置
        BUILDER.push("Weapon Config");
        CAMPHOR_SWORD_MULTIPLIER = BUILDER
                .comment("樟木剑伤害倍率")
                .define("camphorSwordMultiplier", 4.0);
        CHINESE_PARASOL_SWORD_MULTIPLIER = BUILDER
                .comment("梧桐剑伤害倍率")
                .define("chineseParasolSwordMultiplier", 6.0);

        ZIYING_TOOLS_MULTIPLIER = BUILDER
                .comment("紫英工具伤害倍率")
                .define("ziyingToolsMultiplier", 3.0);
        SUYU_TOOLS_MULTIPLIER = BUILDER
                .comment("素玉工具伤害倍率")
                .define("suyuToolsMultiplier", 1.5);
        ZIYU_YUANYANG_TOOLS_BASE_MULTIPLIER = BUILDER
                .comment("紫玉鸳鸯工具基础伤害倍率")
                .define("ziyuYuanyangToolsBaseMultiplier", 1.25);
        ZIYU_YUANYANG_TOOLS_CRIT_MULTIPLIER = BUILDER
                .comment("紫玉鸳鸯工具额外暴击倍率")
                .define("ziyuYuanyangToolsCritMultiplier", 3.0);

        ZHUIYUE_SWORD_FULL_MOON_MULTIPLIER = BUILDER
                .comment("追月剑满月伤害倍率")
                .define("zhuiyueSwordFullMoonMultiplier", 3.0);
        CAIYUN_SWORD_CLEAR_MULTIPLIER = BUILDER
                .comment("彩云剑晴天伤害倍率")
                .define("caiyunSwordClearMultiplier", 2.0);
        CAIYUN_SWORD_RAIN_MULTIPLIER = BUILDER
                .comment("彩云剑雨天伤害倍率")
                .define("caiyunSwordRainMultiplier", 1.0);
        CAIYUN_SWORD_THUNDER_MULTIPLIER = BUILDER
                .comment("彩云剑雷雨伤害倍率")
                .define("caiyunSwordThunderMultiplier", 0.5);

        BAIHUA_SWORD_FLOWER_MULTIPLIER = BUILDER
                .comment("百花剑花朵增伤倍率")
                .define("baihuaSwordFlowerMultiplier", 5.0);
        BAIHUA_SWORD_FLORAL_BIOME_MULTIPLIER = BUILDER
                .comment("百花剑群系增伤倍率")
                .define("baihuaSwordFloralBiomeMultiplier", 9.0);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
