package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.world.entity.npc.VillagerType;

public class ModVillagerTypes {
    public static void registerVillagerTypes() {
        VillagerType.BY_BIOME.put(ModBiomes.DESERT_POPLAR_WOODS, VillagerType.DESERT);
        VillagerType.BY_BIOME.put(ModBiomes.RED_MEI_FOREST, VillagerType.SNOW);
        VillagerType.BY_BIOME.put(ModBiomes.MOUNT_MEI, VillagerType.SNOW);
        VillagerType.BY_BIOME.put(ModBiomes.FRAGRANT_SNOW_SEA, VillagerType.SNOW);
        VillagerType.BY_BIOME.put(ModBiomes.COTTONROSE_REALM, VillagerType.SWAMP);
        VillagerType.BY_BIOME.put(ModBiomes.YUNMENG_MARSH, VillagerType.SWAMP);
    }
}
