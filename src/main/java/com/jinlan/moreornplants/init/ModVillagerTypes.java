package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.level.biome.Biome;

import java.lang.reflect.Field;
import java.util.Map;

public class ModVillagerTypes {
    public static void registerVillagerTypes() {
        registerVillagerType(ModBiomes.DESERT_POPLAR_WOODS, VillagerType.DESERT);
        registerVillagerType(ModBiomes.RED_MEI_FOREST, VillagerType.SNOW);
        registerVillagerType(ModBiomes.COTTONROSE_REALM, VillagerType.SWAMP);
    }
    @SuppressWarnings("unchecked")
    private static void registerVillagerType(ResourceKey<Biome> biomeKey, VillagerType villagerType) {
        try {
            // 使用反射访问私有字段
            Field byBiomeField = VillagerType.class.getDeclaredField("BY_BIOME");
            byBiomeField.setAccessible(true);

            Map<ResourceKey<Biome>, VillagerType> map =
                    (Map<ResourceKey<Biome>, VillagerType>) byBiomeField.get(null);

            map.put(biomeKey, villagerType);

        } catch (Exception e) {
            // 静默失败，村民类型不是核心功能
        }
    }
}
