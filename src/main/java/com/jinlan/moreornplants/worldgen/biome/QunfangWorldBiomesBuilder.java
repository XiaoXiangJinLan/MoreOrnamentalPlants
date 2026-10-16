package com.jinlan.moreornplants.worldgen.biome;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.Climate;

import java.util.function.Consumer;

public class QunfangWorldBiomesBuilder {
    private static final float VALLEY_SIZE = 0.05F;
    private static final float LOW_START = 0.26666668F;
    public static final float HIGH_START = 0.4F;
    private static final float HIGH_END = 0.93333334F;
    private static final float PEAK_SIZE = 0.1F;
    public static final float PEAK_START = 0.56666666F;
    private static final float PEAK_END = 0.7666667F;
    public static final float NEAR_INLAND_START = -0.11F;
    public static final float MID_INLAND_START = 0.03F;
    public static final float FAR_INLAND_START = 0.3F;
    public static final float EROSION_INDEX_1_START = -0.78F;
    public static final float EROSION_INDEX_2_START = -0.375F;
    private final Climate.Parameter FULL_RANGE = Climate.Parameter.span(-1.0F, 1.0F);
    private final Climate.Parameter[] temperatures = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.45F),
            Climate.Parameter.span(-0.45F, -0.1F),
            Climate.Parameter.span(-0.1F, 0.3F),
            Climate.Parameter.span(0.3F, 0.65F),
            Climate.Parameter.span(0.65F, 1.0F)
    };
    private final Climate.Parameter[] humidities = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.35F),
            Climate.Parameter.span(-0.35F, -0.1F),
            Climate.Parameter.span(-0.1F, 0.1F),
            Climate.Parameter.span(0.1F, 0.3F),
            Climate.Parameter.span(0.3F, 1.0F)
    };
    private final Climate.Parameter[] erosions = new Climate.Parameter[]{
            Climate.Parameter.span(-1.0F, -0.78F),
            Climate.Parameter.span(-0.78F, -0.375F),
            Climate.Parameter.span(-0.375F, -0.2225F),
            Climate.Parameter.span(-0.2225F, 0.05F),
            Climate.Parameter.span(0.05F, 0.45F),
            Climate.Parameter.span(0.45F, 0.55F),
            Climate.Parameter.span(0.55F, 1.0F)
    };
    private final Climate.Parameter FROZEN_RANGE = this.temperatures[0];
    private final Climate.Parameter UNFROZEN_RANGE = Climate.Parameter.span(this.temperatures[1], this.temperatures[4]);
    private final Climate.Parameter mushroomFieldsContinentalness = Climate.Parameter.span(-1.2F, -1.05F);
    private final Climate.Parameter deepOceanContinentalness = Climate.Parameter.span(-1.05F, -0.455F);
    private final Climate.Parameter oceanContinentalness = Climate.Parameter.span(-0.455F, -0.19F);
    private final Climate.Parameter coastContinentalness = Climate.Parameter.span(-0.19F, -0.11F);
    private final Climate.Parameter inlandContinentalness = Climate.Parameter.span(-0.11F, 0.55F);
    private final Climate.Parameter nearInlandContinentalness = Climate.Parameter.span(-0.11F, 0.03F);
    private final Climate.Parameter midInlandContinentalness = Climate.Parameter.span(0.03F, 0.3F);
    private final Climate.Parameter farInlandContinentalness = Climate.Parameter.span(0.3F, 1.0F);

    private final ResourceKey<Biome>[][] OCEANS = new ResourceKey[][]{
            {Biomes.DEEP_FROZEN_OCEAN, Biomes.DEEP_COLD_OCEAN, Biomes.DEEP_OCEAN, Biomes.DEEP_LUKEWARM_OCEAN, Biomes.WARM_OCEAN},
            {Biomes.FROZEN_OCEAN,      Biomes.COLD_OCEAN,      Biomes.OCEAN,      Biomes.LUKEWARM_OCEAN,      Biomes.WARM_OCEAN}
    };
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_MOD = new ResourceKey[][]{
            {ModBiomes.RED_MEI_FOREST,      ModBiomes.RED_MEI_FOREST,      ModBiomes.RED_MEI_FOREST,        ModBiomes.RED_MEI_FOREST,      ModBiomes.RED_MEI_FOREST},
            {ModBiomes.PEONY_SEA,           ModBiomes.SNOW_WOODS,          ModBiomes.GINKGO_FOREST,         ModBiomes.COLORED_FOREST,      ModBiomes.LONGEVITY_FOREST},
            {ModBiomes.FLOWERS_FIELDS,      ModBiomes.FLOWERS_GROVE,       ModBiomes.CAMELLIA_VALLEY,       ModBiomes.CAMELLIA_VALLEY,     ModBiomes.THE_PEACH_BLOSSOM_SPRING},
            {ModBiomes.CROPS_GREEN,         ModBiomes.DONGLI_SCENERY,      ModBiomes.THE_LAND_OF_ABUNDANCE, ModBiomes.WISTERIA_VALLEY,     ModBiomes.WISTERIA_VALLEY},
            {ModBiomes.DESERT_POPLAR_WOODS, ModBiomes.DESERT_POPLAR_WOODS, ModBiomes.DESERT_POPLAR_WOODS,   ModBiomes.DESERT_POPLAR_WOODS, ModBiomes.DESERT_POPLAR_WOODS}
    };
    private final ResourceKey<Biome>[][] MIDDLE_BIOMES_VARIANT_MOD = new ResourceKey[][]{
            {ModBiomes.SNOW_GREETS_SPRING,  ModBiomes.SNOW_GREETS_SPRING, ModBiomes.SNOW_GREETS_SPRING,   ModBiomes.SNOW_GREETS_SPRING,    ModBiomes.SNOW_GREETS_SPRING},
            {ModBiomes.PEONY_MEADOWS,       ModBiomes.CHINABERRY_WOODS,   ModBiomes.SWEETGUM_WOODS,       ModBiomes.WUTONG_FOREST,         ModBiomes.EVERGREEN_FOREST},
            {ModBiomes.CRABAPPLE_GROVE,     ModBiomes.CRABAPPLE_GROVE,    ModBiomes.PINK_CAMELLIA_VALLEY, ModBiomes.RED_CAMELLIA_VALLEY,   ModBiomes.THE_PEACH_BLOSSOM_SPRING},
            {ModBiomes.CHINESE_ROSE_FIELDS, ModBiomes.DONGLI_SCENERY,     ModBiomes.CRAPE_MYRTLE_GARDEN,  ModBiomes.WHITE_WISTERIA_VALLEY, ModBiomes.BLUE_WISTERIA_VALLEY},
            {ModBiomes.TAMARISK_FIELDS,     ModBiomes.TAMARISK_FIELDS,    ModBiomes.TAMARISK_FIELDS,      ModBiomes.TAMARISK_FIELDS,       ModBiomes.TAMARISK_FIELDS}
    };
    private final ResourceKey<Biome>[][] PLATEAU_BIOMES_MOD = new ResourceKey[][]{
            {ModBiomes.HANDONG_LAYUE, ModBiomes.HANDONG_LAYUE, ModBiomes.HANDONG_LAYUE,     ModBiomes.HANDONG_LAYUE,     ModBiomes.HANDONG_LAYUE},
            {ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, ModBiomes.MISCANTHUS_FIELDS, ModBiomes.MISCANTHUS_FIELDS, ModBiomes.EVERGREEN_FOREST},
            {ModBiomes.AZALEA_FOREST, ModBiomes.AZALEA_FOREST, ModBiomes.PURPLE_CLOUD,      ModBiomes.PURPLE_CLOUD,      ModBiomes.THE_PEACH_BLOSSOM_SPRING},
            {ModBiomes.PURPLE_LAND,   ModBiomes.PURPLE_LAND,   ModBiomes.PINK_LAND,         ModBiomes.PINK_LAND,         ModBiomes.THE_APRICOT_SPRING_PLATEAU},
            {ModBiomes.GOLD_COUNTRY,  ModBiomes.GOLD_COUNTRY,  ModBiomes.GOLD_COUNTRY,      ModBiomes.GOLD_COUNTRY,      ModBiomes.GOLD_COUNTRY}
    };
    private final ResourceKey<Biome>[][] PLATEAU_BIOMES_VARIANT_MOD = new ResourceKey[][]{
            {ModBiomes.FRAGRANT_SNOW_SEA,          ModBiomes.FRAGRANT_SNOW_SEA, ModBiomes.FRAGRANT_SNOW_SEA, ModBiomes.FRAGRANT_SNOW_SEA, ModBiomes.FRAGRANT_SNOW_SEA},
            {ModBiomes.THE_APRICOT_SPRING_PLATEAU, ModBiomes.TEN_MILE_GALLERY,  ModBiomes.PURPLE_CLOUD,      ModBiomes.PURPLE_CLOUD,      ModBiomes.LONGEVITY_FOREST},
            {ModBiomes.THE_APRICOT_SPRING_PLATEAU, ModBiomes.TEN_MILE_GALLERY,  ModBiomes.RED_HIGHLANDS,     ModBiomes.RED_HIGHLANDS,     ModBiomes.THE_PEACH_BLOSSOM_SPRING},
            {ModBiomes.YELLOW_LAND,                ModBiomes.YELLOW_LAND,       ModBiomes.WHITE_LAND,        ModBiomes.WHITE_LAND,        ModBiomes.THE_APRICOT_SPRING_PLATEAU},
            {ModBiomes.TAMARISK_FIELDS,            ModBiomes.TAMARISK_FIELDS,   ModBiomes.TAMARISK_FIELDS,   ModBiomes.TAMARISK_FIELDS,   ModBiomes.TAMARISK_FIELDS}
    };
    private final ResourceKey<Biome>[][] SHATTERED_BIOMES = new ResourceKey[][]{
            {Biomes.CHERRY_GROVE, Biomes.CHERRY_GROVE, Biomes.FLOWER_FOREST, Biomes.FLOWER_FOREST, Biomes.FLOWER_FOREST},
            {Biomes.CHERRY_GROVE, Biomes.CHERRY_GROVE, Biomes.FLOWER_FOREST, Biomes.FLOWER_FOREST, Biomes.FLOWER_FOREST},
            {null,                null,                null,                 null,                 null},
            {null,                null,                null,                 null,                 null},
            {null,                null,                null,                 null,                 null}
    };
    private final ResourceKey<Biome>[][] SLOPE_BIOMES_MOD = new ResourceKey[][]{
            {null,                null,                null,                null,                null},
            {ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI},
            {ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI, ModBiomes.MOUNT_MEI},
            {null,                null,                null,                null,                null},
            {null,                null,                null,                null,                null}
    };
    private final ResourceKey<Biome>[][] RIVER_BIOMES = new ResourceKey[][]{
            {ModBiomes.JIANGTIAN_MUXUE, ModBiomes.JIANGTIAN_MUXUE, ModBiomes.JIANGTIAN_MUXUE, ModBiomes.JIANGTIAN_MUXUE, ModBiomes.JIANGTIAN_MUXUE},
            {ModBiomes.SPRING_RIVER,    ModBiomes.SPRING_RIVER,    ModBiomes.AUTUMN_RIVER,    ModBiomes.AUTUMN_RIVER,    ModBiomes.LOTUS_RIVER},
            {ModBiomes.SPRING_RIVER,    ModBiomes.SPRING_RIVER,    ModBiomes.LOTUS_RIVER,     ModBiomes.LOTUS_RIVER,     ModBiomes.THE_PEACH_BLOSSOM_SPRING},
            {ModBiomes.SPRING_RIVER,    ModBiomes.AUTUMN_RIVER,    ModBiomes.LOTUS_RIVER,     Biomes.RIVER,              Biomes.RIVER},
            {Biomes.RIVER,              Biomes.RIVER,              Biomes.RIVER,              Biomes.RIVER,              Biomes.RIVER}
    };
    private final ResourceKey<Biome>[][] SWAMP_BIOMES = new ResourceKey[][]{
            {null,                    null,                    null,                    null,                    null},
            {ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO},
            {ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO,    ModBiomes.FURONG_GUO},
            {ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH},
            {ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH, ModBiomes.YUNMENG_MARSH}
    };
    private final ResourceKey<Biome>[][] ISLAND_BIOMES = new ResourceKey[][]{
            {Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS},
            {ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI},
            {ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI},
            {ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI,      ModBiomes.PENGLAI},
            {Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS, Biomes.MUSHROOM_FIELDS}
    };


    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        MoreOrnPlants.LOGGER.info("Starting Qunfang biome generation...");
        this.addOffCoastBiomes(mapper);
        this.addInlandBiomes(mapper);
        this.addUndergroundBiomes(mapper);
        MoreOrnPlants.LOGGER.info("Completed Qunfang biome generation");
    }

    private void addOffCoastBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        for (int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for (int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> islandBiome = this.pickIslandBiome(i, j);
                this.addSurfaceBiome(mapper, temperature, humidity, this.mushroomFieldsContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, islandBiome);
            }
        }

        for (int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.deepOceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, this.OCEANS[0][i]);
            this.addSurfaceBiome(mapper, temperature, this.FULL_RANGE, this.oceanContinentalness, this.FULL_RANGE, this.FULL_RANGE, 0.0F, this.OCEANS[1][i]);
        }
    }

    private void addInlandBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addMidSlice(mapper, Climate.Parameter.span(-1.0F, -0.93333334F));
        this.addHighSlice(mapper, Climate.Parameter.span(-0.93333334F, -0.7666667F));
        this.addPeaks(mapper, Climate.Parameter.span(-0.7666667F, -0.56666666F));
        this.addHighSlice(mapper, Climate.Parameter.span(-0.56666666F, -0.4F));
        this.addMidSlice(mapper, Climate.Parameter.span(-0.4F, -0.26666668F));
        this.addLowSlice(mapper, Climate.Parameter.span(-0.26666668F, -0.05F));
        this.addValleys(mapper, Climate.Parameter.span(-0.05F, 0.05F));
        this.addLowSlice(mapper, Climate.Parameter.span(0.05F, 0.26666668F));
        this.addMidSlice(mapper, Climate.Parameter.span(0.26666668F, 0.4F));
        this.addHighSlice(mapper, Climate.Parameter.span(0.4F, 0.56666666F));
        this.addPeaks(mapper, Climate.Parameter.span(0.56666666F, 0.7666667F));
        this.addHighSlice(mapper, Climate.Parameter.span(0.7666667F, 0.93333334F));
        this.addMidSlice(mapper, Climate.Parameter.span(0.93333334F, 1.0F));
    }

    protected void addPeaks(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter weirdness) {
        for (int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for (int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrBadlands = this.pickMiddleBiomeOrBadlandsIfHot(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrSlope = this.pickMiddleBiomeOrBadlandsIfHotOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> windsweptSavannaBiome = this.maybePickWindsweptSavannaBiome(i, j, weirdness, shatteredBiome);
                ResourceKey<Biome> peakBiome = this.pickPeakBiome(i, j, weirdness);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, peakBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[1], weirdness, 0.0F, middleBiomeOrSlope);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[1], weirdness, 0.0F, peakBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.midInlandContinentalness, this.erosions[3], weirdness, 0.0F, middleBiomeOrBadlands);
                this.addSurfaceBiome(mapper, temperature, humidity, this.farInlandContinentalness, this.erosions[3], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, windsweptSavannaBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, middleBiome);
            }
        }
    }

    protected void addHighSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter weirdness) {
        for (int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for (int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrBadlands = this.pickMiddleBiomeOrBadlandsIfHot(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrSlope = this.pickMiddleBiomeOrBadlandsIfHotOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> ShatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> WindsweptSavannaBiome = this.maybePickWindsweptSavannaBiome(i, j, weirdness, ShatteredBiome);
                ResourceKey<Biome> slopeBiome = this.pickSlopeBiome(i, j, weirdness);
                ResourceKey<Biome> peakBiome = this.pickPeakBiome(i, j, weirdness);
                this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, this.erosions[0], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, peakBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, this.erosions[1], weirdness, 0.0F, middleBiomeOrSlope);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[1], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.midInlandContinentalness, this.erosions[3], weirdness, 0.0F, middleBiomeOrBadlands);
                this.addSurfaceBiome(mapper, temperature, humidity, this.farInlandContinentalness, this.erosions[3], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[5], weirdness, 0.0F, ShatteredBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, WindsweptSavannaBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, middleBiome);
            }
        }
    }

    protected void addMidSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter weirdness) {
        this.addSurfaceBiome(mapper, this.FULL_RANGE, this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, Biomes.MEADOW);
        for (int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for (int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];

                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrBadlands = this.pickMiddleBiomeOrBadlandsIfHot(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrSlope = this.pickMiddleBiomeOrBadlandsIfHotOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> shatteredBiome = this.pickShatteredBiome(i, j, weirdness);
                ResourceKey<Biome> plateauBiome = this.pickPlateauBiome(i, j, weirdness);
                ResourceKey<Biome> beachBiome = this.pickBeachBiome(i, j);
                ResourceKey<Biome> PickWindsweptSavannaBiome = this.maybePickWindsweptSavannaBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> ShatteredCoastBiome = this.pickShatteredCoastBiome(i, j, weirdness);
                ResourceKey<Biome> slopeBiome = this.pickSlopeBiome(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j, weirdness);

                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[0], weirdness, 0.0F, slopeBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.midInlandContinentalness), this.erosions[1], weirdness, 0.0F, middleBiomeOrSlope);
                this.addSurfaceBiome(mapper, temperature, humidity, this.farInlandContinentalness, this.erosions[1], weirdness, 0.0F, i == 0 ? slopeBiome : plateauBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, this.erosions[2], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.midInlandContinentalness, this.erosions[2], weirdness, 0.0F, middleBiomeOrBadlands);
                this.addSurfaceBiome(mapper, temperature, humidity, this.farInlandContinentalness, this.erosions[2], weirdness, 0.0F, plateauBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.nearInlandContinentalness), this.erosions[3], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[3], weirdness, 0.0F, middleBiomeOrBadlands);

                if (weirdness.max() < 0L) {
                    this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, this.erosions[4], weirdness, 0.0F, beachBiome);
                    this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                } else {
                    this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                }

                this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, this.erosions[5], weirdness, 0.0F, ShatteredCoastBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, this.erosions[5], weirdness, 0.0F, PickWindsweptSavannaBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, shatteredBiome);

                if (weirdness.max() < 0L) {
                    this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, beachBiome);
                } else {
                    this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, middleBiome);
                }

                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
            }
        }
    }

    protected void addLowSlice(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter weirdness) {
        this.addSurfaceBiome(mapper, this.FULL_RANGE, this.FULL_RANGE, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[2]), weirdness, 0.0F, Biomes.MEADOW);
        for (int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for (int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];

                ResourceKey<Biome> middleBiome = this.pickMiddleBiome(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrBadlands = this.pickMiddleBiomeOrBadlandsIfHot(i, j, weirdness);
                ResourceKey<Biome> middleBiomeOrSlope = this.pickMiddleBiomeOrBadlandsIfHotOrSlopeIfCold(i, j, weirdness);
                ResourceKey<Biome> beachBiome = this.pickBeachBiome(i, j);
                ResourceKey<Biome> pickWindsweptSavannaBiome = this.maybePickWindsweptSavannaBiome(i, j, weirdness, middleBiome);
                ResourceKey<Biome> shatteredCoastBiome= this.pickShatteredCoastBiome(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j, weirdness);

                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiomeOrBadlands);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiomeOrSlope);
                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[3]), weirdness, 0.0F, middleBiomeOrBadlands);
                this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[3], this.erosions[4]), weirdness, 0.0F, beachBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[4], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, this.erosions[5], weirdness, 0.0F, shatteredCoastBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, this.erosions[5], weirdness, 0.0F, pickWindsweptSavannaBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), this.erosions[5], weirdness, 0.0F, middleBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, beachBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.nearInlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
            }
        }
    }

    protected void addValleys(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper, Climate.Parameter weirdness) {
        for (int i = 0; i < this.temperatures.length; ++i) {
            Climate.Parameter temperature = this.temperatures[i];

            for (int j = 0; j < this.humidities.length; ++j) {
                Climate.Parameter humidity = this.humidities[j];
                ResourceKey<Biome> riverBiome = this.pickRiverBiome(i,j);
                ResourceKey<Biome> middleBiomeOrBadlands = this.pickMiddleBiomeOrBadlandsIfHot(i, j, weirdness);
                ResourceKey<Biome> swampBiome = this.pickSwampBiome(i, j, weirdness);
                this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, weirdness.max() < 0L ? Biomes.MEADOW : riverBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.nearInlandContinentalness, Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, riverBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.coastContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[2], this.erosions[5]), weirdness, 0.0F, riverBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, this.coastContinentalness, this.erosions[6], weirdness, 0.0F, riverBiome);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.midInlandContinentalness, this.farInlandContinentalness), Climate.Parameter.span(this.erosions[0], this.erosions[1]), weirdness, 0.0F, middleBiomeOrBadlands);
                this.addSurfaceBiome(mapper, temperature, humidity, Climate.Parameter.span(this.inlandContinentalness, this.farInlandContinentalness), this.erosions[6], weirdness, 0.0F, swampBiome);
            }
        }
    }

    protected void addUndergroundBiomes(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> consume) {
        this.addUndergroundBiome(consume, Climate.Parameter.span(-0.5F, -0.3F), this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, 0.0F, ModBiomes.SUYU_CAVES);
        this.addUndergroundBiome(consume, Climate.Parameter.span(-0.2F, 0.0F), this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, 0.0F, ModBiomes.ZIYING_CAVES);
        this.addUndergroundBiome(consume, this.FULL_RANGE, Climate.Parameter.span(0.7F, 1.0F), this.FULL_RANGE, this.FULL_RANGE, this.FULL_RANGE, 0.0F, Biomes.LUSH_CAVES);
        this.addBottomBiome(
                consume,
                this.FULL_RANGE,
                this.FULL_RANGE,
                this.FULL_RANGE,
                Climate.Parameter.span(this.erosions[0], this.erosions[1]),
                this.FULL_RANGE,
                0.0F,
                Biomes.DEEP_DARK
        );
    }

    // ========== 生物群系选择器方法 ==========
    protected ResourceKey<Biome> pickMiddleBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            return MIDDLE_BIOMES_MOD[pTemperature][pHumidity];
        } else {
            ResourceKey<Biome> variant = MIDDLE_BIOMES_VARIANT_MOD[pTemperature][pHumidity];
            return variant != null ? variant : MIDDLE_BIOMES_MOD[pTemperature][pHumidity];
        }
    }

    protected ResourceKey<Biome> pickMiddleBiomeOrBadlandsIfHot(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        return pTemperature == 4 ? this.pickBadlandsBiome(pHumidity, weirdness) : this.pickMiddleBiome(pTemperature, pHumidity, weirdness);
    }

    protected ResourceKey<Biome> pickMiddleBiomeOrBadlandsIfHotOrSlopeIfCold(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        return pTemperature == 0 ? this.pickSlopeBiome(pTemperature, pHumidity, weirdness) : this.pickMiddleBiomeOrBadlandsIfHot(pTemperature, pHumidity, weirdness);
    }

    protected ResourceKey<Biome> pickPlateauBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        if (weirdness.max() < 0L) {
            return PLATEAU_BIOMES_MOD[pTemperature][pHumidity];
        } else {
            ResourceKey<Biome> variant = PLATEAU_BIOMES_VARIANT_MOD[pTemperature][pHumidity];
            return variant != null ? variant : PLATEAU_BIOMES_MOD[pTemperature][pHumidity];
        }
    }

    protected ResourceKey<Biome> pickPeakBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        if (pTemperature <= 2) {
            return weirdness.max() < 0L ? Biomes.JAGGED_PEAKS : Biomes.FROZEN_PEAKS;
        } else {
            return pTemperature == 3 ? Biomes.STONY_PEAKS : this.pickBadlandsBiome(pHumidity, weirdness);
        }
    }

    protected ResourceKey<Biome> pickSlopeBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> modSlope = SLOPE_BIOMES_MOD[pTemperature][pHumidity];
        if (modSlope != null) return modSlope;
        if (pTemperature >= 3) {
            return this.pickPlateauBiome(pTemperature, pHumidity, weirdness);
        } else {
            return pHumidity <= 1 ? Biomes.SNOWY_SLOPES : Biomes.GROVE;
        }
    }

    protected ResourceKey<Biome> pickBadlandsBiome(int pHumidity, Climate.Parameter weirdness) {
        if (pHumidity < 2) {
            return weirdness.max() < 0L ? Biomes.ERODED_BADLANDS : Biomes.BADLANDS;
        } else {
            return pHumidity < 3 ? ModBiomes.GOLD_COUNTRY : ModBiomes.TAMARISK_FIELDS;
        }
    }

    protected ResourceKey<Biome> pickShatteredBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> resourcekey = this.SHATTERED_BIOMES[pTemperature][pHumidity];
        return resourcekey == null ? this.pickMiddleBiome(pTemperature, pHumidity, weirdness) : resourcekey;
    }
    protected ResourceKey<Biome> maybePickWindsweptSavannaBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness, ResourceKey<Biome> pKey) {
        return pTemperature > 1 && pHumidity < 4 && weirdness.max() >= 0L ? Biomes.SUNFLOWER_PLAINS : pKey;
    }

    protected ResourceKey<Biome> pickShatteredCoastBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> resourcekey = weirdness.max() >= 0L
                ? this.pickMiddleBiome(pTemperature, pHumidity, weirdness)
                : this.pickBeachBiome(pTemperature, pHumidity);
        return this.maybePickWindsweptSavannaBiome(pTemperature, pHumidity, weirdness, resourcekey);
    }

    protected ResourceKey<Biome> pickBeachBiome(int pTemperature, int pHumidity) {
        if (pTemperature == 0) {
            return Biomes.SNOWY_BEACH;
        } else {
            return pTemperature == 4 ? Biomes.DESERT : Biomes.BEACH;
        }
    }

    protected ResourceKey<Biome> pickSwampBiome(int pTemperature, int pHumidity, Climate.Parameter weirdness) {
        ResourceKey<Biome> resourcekey = this.SWAMP_BIOMES[pTemperature][pHumidity];
        return resourcekey == null ? this.pickMiddleBiome(pTemperature, pHumidity, weirdness) : resourcekey;
    }

    protected ResourceKey<Biome> pickIslandBiome(int pTemperature, int pHumidity) {
        return ISLAND_BIOMES[pTemperature][pHumidity];
    }

    protected ResourceKey<Biome> pickRiverBiome(int pTemperature, int pHumidity) {
        return RIVER_BIOMES[pTemperature][pHumidity];
    }

    protected void addSurfaceBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper,
                                   Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness,
                                   Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {

        if (biome == null) return;

        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion,
                Climate.Parameter.point(0.0F), weirdness, offset), biome));
        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion,
                Climate.Parameter.point(1.0F), weirdness, offset), biome));
    }

    protected void addUndergroundBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper,
                                       Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness,
                                       Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {

        if (biome == null) return;

        mapper.accept(Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion,
                Climate.Parameter.span(0.2F, 0.9F), weirdness, offset), biome));
    }

    private void addBottomBiome(Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> consumer,
                                Climate.Parameter temperature, Climate.Parameter humidity, Climate.Parameter continentalness,
                                Climate.Parameter erosion, Climate.Parameter weirdness, float offset, ResourceKey<Biome> biome) {
        consumer.accept(
                Pair.of(Climate.parameters(temperature, humidity, continentalness, erosion, Climate.Parameter.point(1.1F), weirdness, offset), biome)
        );
    }
}
