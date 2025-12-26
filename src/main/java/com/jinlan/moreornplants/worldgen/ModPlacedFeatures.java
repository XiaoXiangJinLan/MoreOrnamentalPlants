package com.jinlan.moreornplants.worldgen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ANCIENT_RED_MEI_PLACED = registerKey("ancient_red_mei_placed");
    public static final ResourceKey<PlacedFeature> RED_MEI_PLACED = registerKey("red_mei_placed");
    public static final ResourceKey<PlacedFeature> RED_MEI_RED_PLACED = registerKey("red_mei_red_placed");
    public static final ResourceKey<PlacedFeature> WHITE_MEI_PLACED = registerKey("white_mei_placed");
    public static final ResourceKey<PlacedFeature> UPRIGHT_CRABAPPLE_PLACED = registerKey("upright_crabapple_placed");
    public static final ResourceKey<PlacedFeature> WEEPING_CRABAPPLE_PLACED = registerKey("weeping_crabapple_placed");
    public static final ResourceKey<PlacedFeature> PINK_APRICOT_PLACED = registerKey("pink_apricot_placed");
    public static final ResourceKey<PlacedFeature> WHITE_APRICOT_PLACED = registerKey("white_apricot_placed");
    public static final ResourceKey<PlacedFeature> ORNAMENTAL_PEACH_PLACED = registerKey("ornamental_peach_placed");
    public static final ResourceKey<PlacedFeature> ORNAMENTAL_PEACH_RED_PLACED = registerKey("ornamental_peach_red_placed");
    public static final ResourceKey<PlacedFeature> WILD_PEACH_PLACED = registerKey("wild_peach_placed");
    public static final ResourceKey<PlacedFeature> PEACH_PINK_PETALS_PATCH_PLACED = registerKey("peach_pink_petals_patch_placed");
    public static final ResourceKey<PlacedFeature> ORNAMENTAL_PEACH_GROVE_PLACED = registerKey("ornamental_peach_grove_placed");
    public static final ResourceKey<PlacedFeature> PEAR_PLACED = registerKey("pear_placed");
    public static final ResourceKey<PlacedFeature> FLOWERING_PURPLE_LEAF_PLUM_PLACED = registerKey("flowering_purple_leaf_plum_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_LEAF_PLUM_PLACED = registerKey("purple_leaf_plum_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_OSMANTHUS_PLACED = registerKey("golden_osmanthus_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_OSMANTHUS_PLACED = registerKey("orange_osmanthus_placed");
    public static final ResourceKey<PlacedFeature> WHITE_OSMANTHUS_PLACED = registerKey("white_osmanthus_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_GINKGO_PLACED = registerKey("golden_ginkgo_placed");
    public static final ResourceKey<PlacedFeature> GREEN_GINKGO_PLACED = registerKey("green_ginkgo_placed");
    public static final ResourceKey<PlacedFeature> ANCIENT_GOLDEN_GINKGO_PLACED = registerKey("ancient_golden_ginkgo_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_CHINESE_PARASOL_PLACED = registerKey("yellow_chinese_parasol_placed");
    public static final ResourceKey<PlacedFeature> GREEN_CHINESE_PARASOL_PLACED = registerKey("green_chinese_parasol_placed");
    public static final ResourceKey<PlacedFeature> SWEETGUM_PLACED = registerKey("sweetgum_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_PLACED = registerKey("camphor_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_CAMELLIA_VALLEY_PLACED = registerKey("camphor_camellia_valley_placed");
    public static final ResourceKey<PlacedFeature> ANCIENT_CAMPHOR_PLACED = registerKey("ancient_camphor_placed");
    public static final ResourceKey<PlacedFeature> DOVE_TREE_PLACED = registerKey("dove_tree_placed");
    public static final ResourceKey<PlacedFeature> CHINABERRY_PLACED = registerKey("chinaberry_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_0_PLACED = registerKey("desert_poplar_0_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_1_PLACED = registerKey("desert_poplar_1_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_2_PLACED = registerKey("desert_poplar_2_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_3_PLACED = registerKey("desert_poplar_3_placed");
    public static final ResourceKey<PlacedFeature> CYMBIDIUM_PLACED = registerKey("cymbidium_placed");
    public static final ResourceKey<PlacedFeature> CYMBIDIUM_FOREST_PLACED = registerKey("cymbidium_forest_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_FOREST_PLACED = registerKey("chrysanthemum_forest_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_PLACED = registerKey("chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_CHRYSANTHEMUM_PLACED = registerKey("golden_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CHRYSANTHEMUM_PLACED = registerKey("white_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_CHRYSANTHEMUM_PLACED = registerKey("purple_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> PINK_CHRYSANTHEMUM_PLACED = registerKey("pink_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_GROVE_PLACED = registerKey("chrysanthemum_grove_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_ROSE_PLACED = registerKey("chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> PINK_CHINESE_ROSE_PLACED = registerKey("pink_chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_CHINESE_ROSE_PLACED = registerKey("yellow_chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CHINESE_ROSE_PLACED = registerKey("white_chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> CRIMSON_AZALEA_PLACED = registerKey("crimson_azalea_placed");
    public static final ResourceKey<PlacedFeature> CRIMSON_AZALEA_GROVE_PLACED = registerKey("crimson_azalea_grove_placed");
    public static final ResourceKey<PlacedFeature> CAMELLIA_PLACED = registerKey("camellia_placed");
    public static final ResourceKey<PlacedFeature> VERSICOLOR_CAMELLIA_PLACED = registerKey("versicolor_camellia_placed");
    public static final ResourceKey<PlacedFeature> PINK_CAMELLIA_PLACED = registerKey("pink_camellia_placed");
    public static final ResourceKey<PlacedFeature> CRAPE_MYRTLE_PLACED = registerKey("crape_myrtle_placed");
    public static final ResourceKey<PlacedFeature> CRAPE_MYRTLE_TREE_PLACED = registerKey("crape_myrtle_tree_placed");
    public static final ResourceKey<PlacedFeature> COTTON_ROSE_PLACED = registerKey("cotton_rose_placed");
    public static final ResourceKey<PlacedFeature> COTTON_ROSE_GROVE_PLACED = registerKey("cotton_rose_grove_placed");
    public static final ResourceKey<PlacedFeature> COTTON_ROSE_FOREST_PLACED = registerKey("cotton_rose_forest_placed");
    public static final ResourceKey<PlacedFeature> CHERRY_PLACED =registerKey("cherry_placed");
    public static final ResourceKey<PlacedFeature> FLOWERS_GROVE_FLOWERS_PLACED = registerKey("flowers_grove_flowers_placed");
    public static final ResourceKey<PlacedFeature> WINTERSWEET_PLACED = registerKey("wintersweet_placed");
    public static final ResourceKey<PlacedFeature> LILY_OF_THE_VALLEY_FOREST_PLACED = registerKey("lily_of_the_valley_forest_placed");
    public static final ResourceKey<PlacedFeature> BLUE_ORCHID_FOREST_PLACED = registerKey("blue_orchid_placed");
    public static final ResourceKey<PlacedFeature> PEONY_GROVE_PLACED = registerKey("peony_grove_placed");
    public static final ResourceKey<PlacedFeature> SMALL_FLOWERS_GROVE_PLACED = registerKey("small_flowers_grove_placed");
    public static final ResourceKey<PlacedFeature> TULIP_GROVE_PLACED = registerKey("tulip_grove_placed");
    public static final ResourceKey<PlacedFeature> TALL_FLOWERS_GROVE_PLACED = registerKey("tall_flowers_grove_placed");
    public static final ResourceKey<PlacedFeature> PEONY_MEADOWS = registerKey("peony_meadows_key");
    public static final ResourceKey<PlacedFeature> PEONY_PLACED = registerKey("peony_placed");
    public static final ResourceKey<PlacedFeature> MOTTLED_BAMBOO_PLACED =registerKey("mottled_bamboo_placed");
    public static final ResourceKey<PlacedFeature> BLACK_BAMBOO_PLACED =registerKey("black_bamboo_placed");
    public static final ResourceKey<PlacedFeature> LOTUS_PLACED =registerKey("lotus_placed");
    public static final ResourceKey<PlacedFeature> GRASS_GROVE =registerKey("grass_grove");
    public static final ResourceKey<PlacedFeature> GRASS_FOREST_1 =registerKey("grass_forest_1");
    public static final ResourceKey<PlacedFeature> GRASS_FOREST_2 =registerKey("grass_forest_2");
    public static final ResourceKey<PlacedFeature> GRASS_FERN =registerKey("grass_fern");
    public static final ResourceKey<PlacedFeature> GRASS_FERN_2 =registerKey("grass_fern_2");
    public static final ResourceKey<PlacedFeature> GRASS_DESERT =registerKey("grass_desert");
    public static final ResourceKey<PlacedFeature> DEAD_BUSH =registerKey("dead_bush");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ANCIENT_RED_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_RED_MEI_WITH_SNOW),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05F, 1),
                        ModBlocks.RED_MEI_SAPLING.get()));
        register(context, RED_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_MEI_WITH_SNOW),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.1f, 1),
                        ModBlocks.RED_MEI_SAPLING.get()));
        register(context, WINTERSWEET_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WINTERSWEET),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, WHITE_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.WHITE_MEI_SAPLING.get()));

        register(context, WEEPING_CRABAPPLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WEEPING_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.WEEPING_CRABAPPLE_SAPLING.get()));
        register(context, PINK_APRICOT_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.PINK_APRICOT_SAPLING.get()));
        register(context, ORNAMENTAL_PEACH_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));
        register(context, PEAR_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEAR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));
        register(context, FLOWERING_PURPLE_LEAF_PLUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERING_PURPLE_LEAF_PLUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1 ,0.1F, 1),
                        ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()));
        register(context, ORANGE_OSMANTHUS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_OSMANTHUS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.ORANGE_OSMANTHUS_SAPLING.get()));
        register(context, CHINABERRY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINABERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.CHINABERRY_SAPLING.get()));
        register(context, CRAPE_MYRTLE_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAPE_MYRTLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.CRAPE_MYRTLE_SAPLING.get()));
        register(context, CHERRY_PLACED, configuredFeatures.getOrThrow(TreeFeatures.CHERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        Blocks.CHERRY_SAPLING));
        register(context, FLOWERS_GROVE_FLOWERS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERS_GROVE_FLOWERS),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHRYSANTHEMUM_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CYMBIDIUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYMBIDIUM),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CHINESE_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, YELLOW_CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_CHINESE_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CHINESE_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CRAPE_MYRTLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAPE_MYRTLE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CAMELLIA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CRIMSON_AZALEA_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_AZALEA_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, COTTON_ROSE_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_ROSE_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_FLOWERS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_FLOWERS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TULIP_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TULIP_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_FLOWERS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_FLOWERS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, ORNAMENTAL_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));
        register(context, WILD_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILD_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.1f, 1),
                        ModBlocks.WILD_PEACH_SAPLING.get()));
        register(context, PEACH_PINK_PETALS_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEACH_PINK_PETALS_PATCH),
                List.of(CountPlacement.of(8),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, GOLDEN_GINKGO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_GINKGO),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.1f, 1),
                        ModBlocks.GOLDEN_GINKGO_SAPLING.get()));
        register(context, YELLOW_CHINESE_PARASOL_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_CHINESE_PARASOL),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get()));
        register(context, SWEETGUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SWEETGUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.SWEETGUM_SAPLING.get()));
        register(context, GOLDEN_OSMANTHUS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_OSMANTHUS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get()));
        register(context, PURPLE_LEAF_PLUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_LEAF_PLUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1 ,0.1F, 1),
                        ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get()));
        register(context, ANCIENT_GOLDEN_GINKGO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_GOLDEN_GINKGO),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0 ,0.05F, 1),
                        ModBlocks.GOLDEN_GINKGO_SAPLING.get()));
        register(context, CHRYSANTHEMUM_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(6),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GOLDEN_CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_CHRYSANTHEMUM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CHRYSANTHEMUM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PURPLE_CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_CHRYSANTHEMUM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CHRYSANTHEMUM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, COTTON_ROSE_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_ROSE_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CAMPHOR_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, ANCIENT_CAMPHOR_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, GREEN_CHINESE_PARASOL_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_CHINESE_PARASOL),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get()));
        register(context, GREEN_GINKGO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_GINKGO),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.GREEN_GINKGO_SAPLING.get()));
        register(context, WHITE_OSMANTHUS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_OSMANTHUS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.WHITE_OSMANTHUS_SAPLING.get()));
        register(context, DOVE_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOVE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.DOVE_TREE_SAPLING.get()));
        register(context, CYMBIDIUM_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYMBIDIUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, LILY_OF_THE_VALLEY_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LILY_OF_THE_VALLEY_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BLUE_ORCHID_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_ORCHID_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMELLIA_KEY),
                List.of(CountPlacement.of(30),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, VERSICOLOR_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.VERSICOLOR_CAMELLIA_KEY),
                List.of(CountPlacement.of(15),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_APRICOT_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.WHITE_APRICOT_SAPLING.get()));
        register(context, CAMPHOR_CAMELLIA_VALLEY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));

        register(context, CRIMSON_AZALEA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRIMSON_AZALEA_KEY),
                List.of(CountPlacement.of(36),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RED_MEI_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.RED_MEI_SAPLING.get()));
        register(context, ORNAMENTAL_PEACH_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));

        register(context, UPRIGHT_CRABAPPLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.UPRIGHT_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get()));
        register(context, PEONY_MEADOWS, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_MEADOWS),
                List.of(CountPlacement.of(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_KEY),
                List.of(CountPlacement.of(32),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, COTTON_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_ROSE_KEY),
                List.of(CountPlacement.of(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, MOTTLED_BAMBOO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOTTLED_BAMBOO_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BLACK_BAMBOO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_BAMBOO_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, LOTUS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LOTUS_KEY),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, DESERT_POPLAR_0_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DESERT_POPLAR_0),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 3),
                        ModBlocks.DESERT_POPLAR_SAPLING.get()));
        register(context, DESERT_POPLAR_1_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DESERT_POPLAR_1),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 5),
                        ModBlocks.DESERT_POPLAR_SAPLING.get()));
        register(context, DESERT_POPLAR_2_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DESERT_POPLAR_2),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 5),
                        ModBlocks.DESERT_POPLAR_SAPLING.get()));
        register(context, DESERT_POPLAR_3_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DESERT_POPLAR_3),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 3),
                        ModBlocks.DESERT_POPLAR_SAPLING.get()));

        register(context, GRASS_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_GROVE),
                List.of(CountPlacement.of(7),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FOREST_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FOREST_1),
                List.of(CountPlacement.of(9),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FOREST_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FOREST_2),
                List.of(CountPlacement.of(9),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FERN, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FERN),
                List.of(CountPlacement.of(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FERN_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FERN_2),
                List.of(CountPlacement.of(11),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_DESERT, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_DESERT),
                List.of(CountPlacement.of(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, DEAD_BUSH, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEAD_BUSH),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MoreOrnPlants.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
