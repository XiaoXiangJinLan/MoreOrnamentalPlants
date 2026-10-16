package com.jinlan.moreornplants.worldgen.dimension;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.worldgen.biome.QunfangWorldBiomesBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import com.mojang.datafixers.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalLong;

public class ModDimension {
    public static final ResourceKey<LevelStem> THE_QUNFANG =ResourceKey.create(Registries.LEVEL_STEM,
            new  ResourceLocation(MoreOrnPlants.MOD_ID, "the_qunfang"));
    public static final ResourceKey<Level> THE_QUNFANG_LEVEL =ResourceKey.create(Registries.DIMENSION,
            new  ResourceLocation(MoreOrnPlants.MOD_ID, "the_qunfang"));
    public static final ResourceKey<DimensionType> THE_QUNFANG_DIMENSION_TYPE =ResourceKey.create(Registries.DIMENSION_TYPE,
            new  ResourceLocation(MoreOrnPlants.MOD_ID, "the_qunfang_type"));

    public static void bootstrap(BootstapContext<DimensionType> context) {
        context.register(THE_QUNFANG_DIMENSION_TYPE, new DimensionType(
                OptionalLong.empty(),
                true,
                false,
                false,
                true,
                1.0,
                true,
                false,
                -64,
                384,
                384,
                BlockTags.INFINIBURN_OVERWORLD,
                BuiltinDimensionTypes.OVERWORLD_EFFECTS,
                0.0f,
                new DimensionType.MonsterSettings(false, false, UniformInt.of(0, 7), 0)
        ));
    }

    public static void bootstrapLevelStems(BootstapContext<LevelStem> ctx) {
        HolderGetter<Biome> biomes = ctx.lookup(Registries.BIOME);

        MultiNoiseBiomeSource source = MultiNoiseBiomeSource.createFromList(
                buildParameterList(biomes));

        NoiseBasedChunkGenerator generator = new NoiseBasedChunkGenerator(
                source,
                ctx.lookup(Registries.NOISE_SETTINGS)
                        .getOrThrow(NoiseGeneratorSettings.OVERWORLD));

        ctx.register(THE_QUNFANG, new LevelStem(
                ctx.lookup(Registries.DIMENSION_TYPE).getOrThrow(THE_QUNFANG_DIMENSION_TYPE),
                generator));
    }

    private static Climate.ParameterList<Holder<Biome>> buildParameterList(HolderGetter<Biome> biomes) {
        List<Pair<Climate.ParameterPoint, Holder<Biome>>> entries = new ArrayList<>();

        collect(entries, biomes, new QunfangWorldBiomesBuilder());

        return new Climate.ParameterList<>(entries);
    }

    private static void collect(List<Pair<Climate.ParameterPoint, Holder<Biome>>> out,
                                HolderGetter<Biome> biomes,
                                QunfangWorldBiomesBuilder builder) {
        builder.addBiomes(null, pair ->
                out.add(Pair.of(pair.getFirst(), biomes.getOrThrow(pair.getSecond()))));
    }
}
