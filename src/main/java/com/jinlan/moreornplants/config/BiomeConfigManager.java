package com.jinlan.moreornplants.config;

import net.minecraft.resources.ResourceLocation;

import java.util.*;
import java.util.stream.Collectors;

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

    public static boolean isLocationAllowed(ResourceLocation biomeLocation) {
        Set<ResourceLocation> blacklistedBiomes = ModBiomeConfig.BIOME_BLACKLIST.get().stream()
                .map(ResourceLocation::tryParse)
                .collect(Collectors.toSet());
        Set<ResourceLocation> whitelistedBiomes = ModBiomeConfig.BIOME_WHITELIST.get().stream()
                .map(ResourceLocation::tryParse)
                .collect(Collectors.toSet());

        // 检查黑名单
        if (blacklistedBiomes.contains(biomeLocation)) {
            return false;
        }

        // 检查白名单（如果白名单不为空）
        return whitelistedBiomes.isEmpty() || whitelistedBiomes.contains(biomeLocation);
    }

    public static int getOverworldBiomesWeight() {
        return ModBiomeConfig.OVERWORLD_BIOMES_WEIGHT.get();
    }

    public static int getSpecialBiomesWeight() {
        return ModBiomeConfig.SPECIAL_BIOMES_WEIGHT.get();
    }

    public static boolean shouldPrioritizeModBiomes() {
        return ModBiomeConfig.PRIORITIZE_MOD_BIOMES.get();
    }

    public static boolean allowVanillaOverride() {
        return ModBiomeConfig.ALLOW_VANILLA_OVERRIDE.get();
    }

}
