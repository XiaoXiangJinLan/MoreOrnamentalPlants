package com.jinlan.moreornplants.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.util.Arrays;
import java.util.List;

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

    // 区域权重配置
    public static final ForgeConfigSpec.IntValue OVERWORLD_BIOMES_WEIGHT;
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
        BUILDER.pop();

        // 区域权重设置
        BUILDER.push("Region Weight Settings");
        OVERWORLD_BIOMES_WEIGHT = BUILDER
                .comment("Weight for main overworld biomes region")
                .defineInRange("overworldBiomesWeight", 2, 1, 20);
        SPECIAL_BIOMES_WEIGHT = BUILDER
                .comment("Weight for special biomes region")
                .defineInRange("specialBiomesWeight", 1, 1, 20);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
