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

    // 兼容性配置
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> BIOME_BLACKLIST;
    public static final ForgeConfigSpec.ConfigValue<List<? extends String>> BIOME_WHITELIST;

    // 生成控制配置
    public static final ForgeConfigSpec.BooleanValue ALLOW_VANILLA_OVERRIDE;
    public static final ForgeConfigSpec.BooleanValue PRIORITIZE_MOD_BIOMES;
    public static final ForgeConfigSpec.IntValue GENERATION_FREQUENCY;

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

        // 兼容性设置
        BUILDER.push("Compatibility Settings");
        BIOME_BLACKLIST = BUILDER
                .comment("List of biome IDs where this mod's biomes should NOT generate")
                .defineList("biomeBlacklist", Arrays.asList(
                        "minecraft:mushroom_fields",
                        "minecraft:deep_dark"
                ), obj -> obj instanceof String);
        BIOME_WHITELIST = BUILDER
                .comment("List of biome IDs where this mod's biomes are ALLOWED to generate (empty = all biomes)")
                .defineList("biomeWhitelist", Arrays.asList(), obj -> obj instanceof String);
        BUILDER.pop();

        // 生成控制设置
        BUILDER.push("Generation Control Settings");
        ALLOW_VANILLA_OVERRIDE = BUILDER
                .comment("Allow mod biomes to replace vanilla biomes in some cases")
                .define("allowVanillaOverride", true);
        PRIORITIZE_MOD_BIOMES = BUILDER
                .comment("Prioritize mod biomes over vanilla biomes when possible")
                .define("prioritizeModBiomes", false);
        GENERATION_FREQUENCY = BUILDER
                .comment("Overall generation frequency multiplier (1 = normal, 2 = double, etc.)")
                .defineInRange("generationFrequency", 1, 1, 5);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
