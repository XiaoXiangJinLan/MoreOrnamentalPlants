package com.jinlan.moreornplants.worldgen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.PeachPinkPetalsBlock;
import com.jinlan.moreornplants.feature.blockstateproviders.VersicolorMeiLeavesProvider;
import com.jinlan.moreornplants.feature.foliageplacers.*;
import com.jinlan.moreornplants.feature.treedecorators.SnowAroundTrunk;
import com.jinlan.moreornplants.feature.treedecorators.VersicolorWeepingMeiVineDecorator;
import com.jinlan.moreornplants.feature.treedecorators.WeepingCrabappleFlowerDecorator;
import com.jinlan.moreornplants.feature.treedecorators.WeepingMeiVineDecorator;
import com.jinlan.moreornplants.feature.trunkplacers.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.CherryFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FancyFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.FancyTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_RED_MEI = registerKey("ancient_red_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MEI = registerKey("red_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_RED_MEI_WITH_SNOW = registerKey("ancient_red_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MEI_WITH_SNOW = registerKey("red_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_WHITE_MEI = registerKey("ancient_white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MEI = registerKey("white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GREEN_CALYX_MEI = registerKey("ancient_green_calyx_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CALYX_MEI = registerKey("green_calyx_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DOUBLE_PINK_MEI = registerKey("ancient_double_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_PINK_MEI = registerKey("double_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_VERSICOLOR_MEI = registerKey("ancient_versicolor_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_MEI = registerKey("versicolor_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_WEEPING_MEI = registerKey("red_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_WEEPING_MEI = registerKey("white_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_WEEPING_MEI = registerKey("green_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_WEEPING_MEI = registerKey("pink_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_WEEPING_MEI = registerKey("versicolor_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> UPRIGHT_CRABAPPLE = registerKey("upright_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_CRABAPPLE = registerKey("weeping_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_APRICOT = registerKey("pink_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_APRICOT = registerKey("white_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORNAMENTAL_PEACH = registerKey("ornamental_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_PEACH = registerKey("wild_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PINK_PETALS_PATCH = registerKey("peach_pink_petals_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEAR = registerKey("pear");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_PURPLE_LEAF_PLUM = registerKey("flowering_purple_leaf_plum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_LEAF_PLUM = registerKey("purple_leaf_plum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_OSMANTHUS = registerKey("golden_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_OSMANTHUS = registerKey("orange_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_OSMANTHUS = registerKey("white_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_GINKGO = registerKey("golden_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_GINKGO = registerKey("green_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GOLDEN_GINKGO = registerKey("ancient_golden_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GREEN_GINKGO = registerKey("ancient_green_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_PARASOL = registerKey("yellow_chinese_parasol");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CHINESE_PARASOL = registerKey("green_chinese_parasol");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEETGUM = registerKey("sweetgum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMPHOR = registerKey("camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMPHOR_WITH_NEW_LEAVES = registerKey("camphor_with_new_leaves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_CAMPHOR = registerKey("ancient_camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_FOREST = registerKey("chrysanthemum_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_KEY = registerKey("chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_CHRYSANTHEMUM_KEY = registerKey("golden_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHRYSANTHEMUM_KEY = registerKey("white_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CHRYSANTHEMUM_KEY = registerKey("purple_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHRYSANTHEMUM_KEY = registerKey("pink_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_ROSE_KEY = registerKey("chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHINESE_ROSE_KEY = registerKey("pink_chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_ROSE_KEY = registerKey("yellow_chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHINESE_ROSE_KEY = registerKey("white_chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHINESE_ROSE_MEADOW = registerKey("pink_chinese_rose_meadow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_KEY = registerKey("peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMELLIA_KEY = registerKey("camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_CAMELLIA_KEY = registerKey("versicolor_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_AZALEA_KEY = registerKey("crimson_azalea_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINTERSWEET = registerKey("wintersweet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERS_GROVE_FLOWERS = registerKey("flowers_grove_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_FLOWERS_GROVE = registerKey("small_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TULIP_GROVE = registerKey("tulip_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_GROVE = registerKey("chrysanthemum_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYMBIDIUM = registerKey("cymbidium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYMBIDIUM_FOREST = registerKey("cymbidium_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LILY_OF_THE_VALLEY_FOREST = registerKey("lily_of_the_valley_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_ORCHID_FOREST = registerKey("blue_orchid_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_GROVE = registerKey("peony_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CAMELLIA_KEY = registerKey("pink_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRIMSON_AZALEA_GROVE = registerKey("crimson_azalea_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_FLOWERS_GROVE = registerKey("tall_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_MEADOWS = registerKey("peony_meadows");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        register(context, ANCIENT_RED_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_GREEN_CALYX_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_DOUBLE_PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_VERSICOLOR_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),55, 30, 15),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, RED_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, GREEN_CALYX_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, DOUBLE_PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, VERSICOLOR_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),60, 25, 15),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, RED_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.RED_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.RED_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, WHITE_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.WHITE_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.WHITE_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, GREEN_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.GREEN_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.GREEN_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, PINK_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.PINK_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.PINK_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, VERSICOLOR_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),60, 25, 15),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new VersicolorWeepingMeiVineDecorator(0.8f, 36, 3, 5, 0.5f, 0.25f, 0.25f))).ignoreVines().build());

        register(context, ANCIENT_RED_MEI_WITH_SNOW, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(20, 4, 4, 3, 8, 10, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).decorators(List.of(new SnowAroundTrunk(8, 0.9F, 6))).ignoreVines().build());
        register(context, RED_MEI_WITH_SNOW, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new SnowAroundTrunk(10, 0.9F, 10))).ignoreVines().build());

        register(context, UPRIGHT_CRABAPPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new StraightTrunkPlacer(5, 2, 0),
                BlockStateProvider.simple(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, WEEPING_CRABAPPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new WeepingCrabappleTrunkPlacer(9, 1, 1, 3, 3, 4, 5, 1.0F, 0.6F),
                BlockStateProvider.simple(ModBlocks.WEEPING_CRABAPPLE_LEAVES.get()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)).decorators(List.of(new WeepingCrabappleFlowerDecorator(0.9F))).ignoreVines().build());

        register(context, PINK_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 4, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.PINK_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.1F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, WHITE_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 3, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.WHITE_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.1F),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, ORNAMENTAL_PEACH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEACH_LOG.get()),
                new PeachTrunkPlacer(6, 2, 2, 2, 4, 3, 4, 0.9F, 0.4F),
                BlockStateProvider.simple(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get()),
                new PeachFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(3)),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, WILD_PEACH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEACH_LOG.get()),
                new PeachTrunkPlacer(7, 2, 2, 2, 4, 4, 5, 0.9F, 0.5F),
                BlockStateProvider.simple(ModBlocks.WILD_PEACH_LEAVES.get()),
                new PeachFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        SimpleWeightedRandomList.Builder<BlockState> peachPetalsBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                peachPetalsBuilder.add(ModBlocks.PEACH_PINK_PETALS.get().defaultBlockState()
                        .setValue(PeachPinkPetalsBlock.AMOUNT, Integer.valueOf(i))
                        .setValue(PeachPinkPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, PEACH_PINK_PETALS_PATCH, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(peachPetalsBuilder)))));

        register(context, PEAR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEAR_LOG.get()),
                new FancyTrunkPlacer(12, 4, 0),
                BlockStateProvider.simple(ModBlocks.PEAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, FLOWERING_PURPLE_LEAF_PLUM, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()),
                new StraightTrunkPlacer(7, 2, 0),
                BlockStateProvider.simple(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 5),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, PURPLE_LEAF_PLUM, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()),
                new StraightTrunkPlacer(7, 2, 0),
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 5),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, GOLDEN_OSMANTHUS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OSMANTHUS_LOG.get()),
                new FancyTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, ORANGE_OSMANTHUS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OSMANTHUS_LOG.get()),
                new FancyTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.ORANGE_OSMANTHUS_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, WHITE_OSMANTHUS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OSMANTHUS_LOG.get()),
                new FancyTrunkPlacer(5, 4, 0),
                BlockStateProvider.simple(ModBlocks.WHITE_OSMANTHUS_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, GOLDEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new StraightTrunkPlacer(12, 3, 0),
                BlockStateProvider.simple(ModBlocks.GOLDEN_GINKGO_LEAVES.get()),
                new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, GREEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new StraightTrunkPlacer(12, 3, 0),
                BlockStateProvider.simple(ModBlocks.GREEN_GINKGO_LEAVES.get()),
                new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, ANCIENT_GOLDEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new GiantTrunkPlacer(24, 2, 4),
                BlockStateProvider.simple(ModBlocks.GOLDEN_GINKGO_LEAVES.get()),
                new AncientGinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), UniformInt.of(15, 17)),
                new TwoLayersFeatureSize(1, 1, 2)).ignoreVines().build());
        register(context, ANCIENT_GREEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new GiantTrunkPlacer(24, 2, 4),
                BlockStateProvider.simple(ModBlocks.GREEN_GINKGO_LEAVES.get()),
                new AncientGinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), UniformInt.of(15, 17)),
                new TwoLayersFeatureSize(1, 1, 2)).ignoreVines().build());

        register(context, YELLOW_CHINESE_PARASOL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LOG.get()),
                new ChineseParasolTrunkPlacer(13, 4, 1, 2, 3),
                BlockStateProvider.simple(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, GREEN_CHINESE_PARASOL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LOG.get()),
                new ChineseParasolTrunkPlacer(13, 4, 1, 2, 3),
                BlockStateProvider.simple(ModBlocks.GREEN_CHINESE_PARASOL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, SWEETGUM, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LOG.get()),
                new StraightTrunkPlacer(13, 5, 0),
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LEAVES.get()),
                new SweetgumFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

        register(context, CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(9, 4, 2, 3, 2, 4, 0.7F, 3),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, CAMPHOR_WITH_NEW_LEAVES, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(8, 4, 2, 3, 2, 4, 0.7F, 3),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CAMPHOR_LEAVES.get().defaultBlockState(), 7).add(ModBlocks.NEW_CAMPHOR_LEAVES.get().defaultBlockState(), 1)),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());
        register(context, ANCIENT_CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.7F, 5),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build());

        register(context, CYMBIDIUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 8,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SPRING_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, LILY_OF_THE_VALLEY_FOREST, Feature.FLOWER, new RandomPatchConfiguration(6, 8, 8,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, BLUE_ORCHID_FOREST, Feature.FLOWER, new RandomPatchConfiguration(4, 8, 8,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.BLUE_ORCHID)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, CHRYSANTHEMUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(24, 3, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GOLDEN_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CHRYSANTHEMUM.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(12, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GOLDEN_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLDEN_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, WHITE_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PURPLE_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PINK_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 12, 12,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CAMELLIA.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, VERSICOLOR_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 12, 12,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.VERSICOLOR_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, CRIMSON_AZALEA_KEY, Feature.FLOWER, new RandomPatchConfiguration(80, 12, 12,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CRIMSON_AZALEA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, WINTERSWEET, Feature.FLOWER, new RandomPatchConfiguration(16, 0, 0,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WINTERSWEET.get())), // 你的腊梅方块
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR), // 当前位置是空气
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR), // 上方一格也是空气
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL))))); // 指定可以放置在哪些方块之上

        register(context, FLOWERS_GROVE_FLOWERS, Feature.FLOWER, new RandomPatchConfiguration(24, 10, 10,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE_BUSH.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CHINESE_ROSE_BUSH.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE_BUSH.get().defaultBlockState(), 1)
                                        .add(ModBlocks.YELLOW_CHINESE_ROSE_BUSH.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CAMELLIA.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHRYSANTHEMUM_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 3, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.GOLD_BACKED_SCARLET_MUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GREEN_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CYMBIDIUM, Feature.FLOWER, new RandomPatchConfiguration(4, 1, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SPRING_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_GROVE, Feature.FLOWER, new RandomPatchConfiguration(42, 4, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.RED_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PURPLE_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.YELLOW_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.LIGHT_PINK_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.LIGHT_RED_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.LIGHT_PURPLE_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.LIGHT_YELLOW_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.VIOLET_PINK_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.INK_RED_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.INK_PURPLE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.OCHRE_YELLOW_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_PEONY.get().defaultBlockState(), 2).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 4, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHINESE_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PINK_CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 4, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CHINESE_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, YELLOW_CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 4, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.YELLOW_CHINESE_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, WHITE_CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 4, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CHINESE_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PINK_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(32, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CRIMSON_AZALEA_GROVE, Feature.FLOWER, new RandomPatchConfiguration(24, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CRIMSON_AZALEA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, TALL_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(52, 6, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.ROSE_BUSH.defaultBlockState(), 1)
                                        .add(Blocks.PEONY.defaultBlockState(), 1)
                                        .add(Blocks.LILAC.defaultBlockState(), 1)
                                        .add(Blocks.SUNFLOWER.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, SMALL_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(52, 6, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.DANDELION.defaultBlockState(), 1)
                                        .add(Blocks.POPPY.defaultBlockState(), 1)
                                        .add(Blocks.BLUE_ORCHID.defaultBlockState(), 1)
                                        .add(Blocks.ALLIUM.defaultBlockState(), 1)
                                        .add(Blocks.OXEYE_DAISY.defaultBlockState(), 1)
                                        .add(Blocks.CORNFLOWER.defaultBlockState(), 1)
                                        .add(Blocks.LILY_OF_THE_VALLEY.defaultBlockState(), 1)
                                        .add(Blocks.AZURE_BLUET.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, TULIP_GROVE, Feature.FLOWER, new RandomPatchConfiguration(52, 6, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.RED_TULIP.defaultBlockState(), 1)
                                        .add(Blocks.ORANGE_TULIP.defaultBlockState(), 1)
                                        .add(Blocks.WHITE_TULIP.defaultBlockState(), 1)
                                        .add(Blocks.PINK_TULIP.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, PEONY_MEADOWS, Feature.FLOWER, new RandomPatchConfiguration(64, 16, 16,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.PEONY.defaultBlockState(), 6)
                                        .add(ModBlocks.TWO_QIAO_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.VERSICOLOR_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 16, 16,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.PEONY.get().defaultBlockState(), 4)
                                        .add(ModBlocks.LIGHT_RED_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_PURPLE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_YELLOW_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PINK_CHINESE_ROSE_MEADOW, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CHINESE_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MoreOrnPlants.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
