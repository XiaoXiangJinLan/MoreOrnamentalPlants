package com.jinlan.moreornplants.worldgen.biome;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;

public class ModSecondOverworldBiomesBuilder extends ModOverworldBiomesBuilder{
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_MOD = new ResourceKey[][]{
            {null,                          null,                          null,                        null,                        null},
            {ModBiomes.CHINESE_ROSE_FIELDS, ModBiomes.CHINESE_ROSE_FIELDS, ModBiomes.MISCANTHUS_FIELDS, ModBiomes.MISCANTHUS_FIELDS, null},
            {ModBiomes.CROPS_GREEN,         ModBiomes.CROPS_GREEN,         ModBiomes.CHINABERRY_WOODS,  ModBiomes.CHINABERRY_WOODS,  null},
            {null,                    null,                                null,                        null,                        null},
            {null,                    null,                                null,                        null,                        null}
    };
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_VARIANT_MOD = new ResourceKey[][]{
            {null,                          null,                          null,                        null,                        null},
            {ModBiomes.CHINESE_ROSE_FIELDS, ModBiomes.CHINESE_ROSE_FIELDS, ModBiomes.MISCANTHUS_FIELDS, ModBiomes.MISCANTHUS_FIELDS, null},
            {ModBiomes.CROPS_GREEN,         ModBiomes.CROPS_GREEN,         ModBiomes.CHINABERRY_WOODS,  ModBiomes.CHINABERRY_WOODS,  null},
            {null,                          null,                          null,                        null,                        null},
            {null,                          null,                          null,                        null,                        null}
    };

    @Override
    protected ResourceKey<Biome> pickMiddleBiome(int temperatureIndex, int humidityIndex, Climate.Parameter weirdness) {
        // 获取过滤后的生物群系映射
        ResourceKey<Biome>[][] filteredMiddleBiomes = createFilteredBiomeMap(MIDDLE_BIOMES_MOD);
        ResourceKey<Biome>[][] filteredMiddleVariants = createFilteredBiomeMap(MIDDLE_BIOMES_VARIANT_MOD);

        // 根据weirdness选择正确的映射
        ResourceKey<Biome> modBiome = weirdness.max() < 0L ?
                filteredMiddleBiomes[temperatureIndex][humidityIndex] :
                filteredMiddleVariants[temperatureIndex][humidityIndex];

        // 检查模组生物群系是否启用且允许
        if (modBiome != null) {
            return modBiome;
        }

        // 回退到父类的选择（原版生物群系）
        return super.pickMiddleBiome(temperatureIndex, humidityIndex, weirdness);
    }
}
