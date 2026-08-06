package com.jinlan.moreornplants.worldgen.biome;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;

public class ModSecondOverworldBiomesBuilder extends ModOverworldBiomesBuilder{
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_MOD = new ResourceKey[][]{
            {ModBiomes.FRAGRANT_SNOW_SEA,   ModBiomes.FRAGRANT_SNOW_SEA,   ModBiomes.FRAGRANT_SNOW_SEA,   ModBiomes.FRAGRANT_SNOW_SEA,   null},
            {ModBiomes.CHINESE_ROSE_FIELDS, ModBiomes.CHINESE_ROSE_FIELDS, ModBiomes.MISCANTHUS_FIELDS,   ModBiomes.MISCANTHUS_FIELDS,   null},
            {ModBiomes.FLOWERS_FIELDS,      ModBiomes.FLOWERS_FIELDS,      ModBiomes.CRAPE_MYRTLE_GARDEN, ModBiomes.CRAPE_MYRTLE_GARDEN, null},
            {null,                          null,                          null,                          null,                          null},
            {ModBiomes.TAMARISK_FIELDS,     ModBiomes.TAMARISK_FIELDS,     ModBiomes.TAMARISK_FIELDS,     ModBiomes.TAMARISK_FIELDS,     ModBiomes.TAMARISK_FIELDS}
    };
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_VARIANT_MOD = new ResourceKey[][]{
            {null,                  null,                  null,                     null,                     null},
            {ModBiomes.PURPLE_LAND, ModBiomes.PURPLE_LAND, ModBiomes.DONGLI_SCENERY, ModBiomes.DONGLI_SCENERY, null},
            {ModBiomes.PINK_LAND,   ModBiomes.PINK_LAND,   ModBiomes.SNOW_WOODS,     ModBiomes.SNOW_WOODS,     null},
            {null,                  null,                  null,                     null,                     null},
            {null,                  null,                  null,                     null,                     null}
    };
    private final ResourceKey<Biome>[][] PLATEAU_BIOMES_MOD = new ResourceKey[][]{
            {null,                    null,                    null,                    null,                    null},
            {ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, null},
            {ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, null},
            {null,                    null,                    null,                    null,                    null},
            {null,                    null,                    null,                    null,                    null}
    };
    private final ResourceKey<Biome>[][] PLATEAU_BIOMES_VARIANT_MOD = new ResourceKey[][]{
            {null, null,                       null,                       null,                       null},
            {null, ModBiomes.TEN_MILE_GALLERY, ModBiomes.TEN_MILE_GALLERY, ModBiomes.TEN_MILE_GALLERY, null},
            {null, null,                       ModBiomes.TEN_MILE_GALLERY, ModBiomes.TEN_MILE_GALLERY, null},
            {null, null,                       null,                       null,                       null},
            {null, null,                       null,                       null,                       null}
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

    @Override
    protected ResourceKey<Biome> pickPlateauBiome(int temperatureIndex, int humidityIndex, Climate.Parameter weirdness) {
        ResourceKey<Biome>[][] filteredPlateauBiomes = createFilteredBiomeMap(PLATEAU_BIOMES_MOD);
        ResourceKey<Biome>[][] filteredPlateauVariants = createFilteredBiomeMap(PLATEAU_BIOMES_VARIANT_MOD);

        ResourceKey<Biome> modBiome = weirdness.max() < 0L ?
                filteredPlateauBiomes[temperatureIndex][humidityIndex] :
                filteredPlateauVariants[temperatureIndex][humidityIndex];

        if (modBiome != null) {
            return modBiome;
        }

        return super.pickPlateauBiome(temperatureIndex, humidityIndex, weirdness);
    }
}
