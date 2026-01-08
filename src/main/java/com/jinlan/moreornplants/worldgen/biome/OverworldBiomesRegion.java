package com.jinlan.moreornplants.worldgen.biome;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class OverworldBiomesRegion extends Region {
    public OverworldBiomesRegion(ResourceLocation name, int weight) {
        super(name, RegionType.OVERWORLD, weight);

        MoreOrnPlants.LOGGER.info("Registered OverworldBiomesRegion with weight: {}", weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        (new ModOverworldBiomesBuilder()).addBiomes(registry, mapper);
    }
}
