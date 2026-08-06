package com.jinlan.moreornplants.worldgen.biome;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;

public class ModThirdOverworldBiomesBuilder extends ModOverworldBiomesBuilder {
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_MOD = new ResourceKey[][]{
            {null,                       null,                       null,                       null,                       null},
            {ModBiomes.CHINABERRY_WOODS, ModBiomes.CHINABERRY_WOODS, ModBiomes.GINKGO_FOREST,    ModBiomes.GINKGO_FOREST,    null},
            {ModBiomes.CROPS_GREEN,      ModBiomes.CROPS_GREEN,      ModBiomes.EVERGREEN_FOREST, ModBiomes.EVERGREEN_FOREST, null},
            {null,                       null,                       null,                       null,                       null},
            {null,                       null,                       null,                       null,                       null},
    };
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_VARIANT_MOD = new ResourceKey[][]{
            {null,                  null,                  null,                            null,                            null},
            {ModBiomes.YELLOW_LAND, ModBiomes.YELLOW_LAND, ModBiomes.SWEETGUM_WOODS,        ModBiomes.SWEETGUM_WOODS,        null},
            {ModBiomes.WHITE_LAND,  ModBiomes.WHITE_LAND,  ModBiomes.THE_LAND_OF_ABUNDANCE, ModBiomes.THE_LAND_OF_ABUNDANCE, null},
            {null,                  null,                  null,                            null,                            null},
            {null,                  null,                  null,                            null,                            null}
    };

    @Override
    protected ResourceKey<Biome> pickMiddleBiome(int temperatureIndex, int humidityIndex, Climate.Parameter weirdness) {
        ResourceKey<Biome>[][] filteredMiddleBiomes = createFilteredBiomeMap(MIDDLE_BIOMES_MOD);
        ResourceKey<Biome>[][] filteredMiddleVariants = createFilteredBiomeMap(MIDDLE_BIOMES_VARIANT_MOD);

        ResourceKey<Biome> modBiome = weirdness.max() < 0L ?
                filteredMiddleBiomes[temperatureIndex][humidityIndex] :
                filteredMiddleVariants[temperatureIndex][humidityIndex];

        if (modBiome != null) {
            return modBiome;
        }

        return super.pickMiddleBiome(temperatureIndex, humidityIndex, weirdness);
    }
}
