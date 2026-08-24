package com.jinlan.moreornplants.worldgen.features;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.CrabappleBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.PeachBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.WisteriaBlock;
import com.jinlan.moreornplants.feature.blockstateproviders.VersicolorMeiLeavesProvider;
import com.jinlan.moreornplants.feature.foliageplacers.*;
import com.jinlan.moreornplants.feature.treedecorators.*;
import com.jinlan.moreornplants.feature.trunkplacers.*;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;

import java.util.List;
import java.util.OptionalInt;

public class ModTreeFeatures {
    //mei
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_RED_MEI = registerKey("ancient_red_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MEI = registerKey("red_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_RED_MEI_WITH_SNOW = registerKey("ancient_red_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MEI_WITH_SNOW = registerKey("red_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_WHITE_MEI = registerKey("ancient_white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MEI = registerKey("white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_PINK_MEI = registerKey("ancient_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MEI = registerKey("pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GOLDEN_MEI = registerKey("ancient_golden_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_MEI = registerKey("golden_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GREEN_CALYX_MEI = registerKey("ancient_green_calyx_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CALYX_MEI = registerKey("green_calyx_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CALYX_MEI_WITH_SNOW = registerKey("green_calyx_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DOUBLE_PINK_MEI = registerKey("ancient_double_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_PINK_MEI = registerKey("double_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DOUBLE_WHITE_MEI = registerKey("ancient_double_white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_WHITE_MEI = registerKey("double_white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_FLAVESCENS_MEI = registerKey("ancient_flavescens_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLAVESCENS_MEI = registerKey("flavescens_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLAVESCENS_MEI_WITH_SNOW = registerKey("flavescens_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_VERSICOLOR_MEI = registerKey("ancient_versicolor_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_MEI = registerKey("versicolor_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_WEEPING_MEI = registerKey("red_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_WEEPING_MEI = registerKey("white_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_WEEPING_MEI = registerKey("green_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_WEEPING_MEI = registerKey("pink_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_WEEPING_MEI = registerKey("versicolor_weeping_mei_key");
    //crabapple
    public static final ResourceKey<ConfiguredFeature<?, ?>> UPRIGHT_CRABAPPLE = registerKey("upright_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> UPRIGHT_CRABAPPLE_WITH_FRUITS = registerKey("upright_crabapple_fruits");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_CRABAPPLE = registerKey("golden_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_CRABAPPLE_WITH_FRUITS = registerKey("golden_crabapple_fruits");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_CRABAPPLE = registerKey("weeping_crabapple");
    //apricot & peach & pear & cherry & plum
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_APRICOT = registerKey("pink_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_APRICOT = registerKey("white_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOUD_APRICOT = registerKey("cloud_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORNAMENTAL_PEACH = registerKey("ornamental_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_PEACH = registerKey("wild_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_PEACH = registerKey("white_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IMMORTAL_PEACH = registerKey("immortal_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEAR = registerKey("pear");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEAR_WITH_FALLEN_LOG = registerKey("pear_with_fallen_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TAIWAN_CHERRY = registerKey("taiwan_cherry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_PURPLE_LEAF_PLUM = registerKey("flowering_purple_leaf_plum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_LEAF_PLUM = registerKey("purple_leaf_plum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_LEAF_PLUM_WITH_FALLEN_LOG = registerKey("purple_leaf_plum_with_fallen_log");
    //osmanthus
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_OSMANTHUS = registerKey("golden_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_OSMANTHUS = registerKey("orange_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_OSMANTHUS = registerKey("white_osmanthus");
    //ginkgo & wutong & sweetgum
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_GINKGO = registerKey("golden_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_GINKGO_WITH_LEAF_PILE = registerKey("golden_ginkgo_with_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_GINKGO_WITH_FALLEN_LOG = registerKey("golden_ginkgo_with_fallen_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_GINKGO = registerKey("green_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GOLDEN_GINKGO = registerKey("ancient_golden_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GOLDEN_GINKGO_WITH_LEAF_PILE = registerKey("ancient_golden_ginkgo_with_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GREEN_GINKGO = registerKey("ancient_green_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_PARASOL = registerKey("yellow_chinese_parasol");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_PARASOL_WITH_LEAF_PILE = registerKey("yellow_chinese_parasol_with_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_PARASOL_WITH_FALLEN_LOG = registerKey("yellow_chinese_parasol_with_fallen_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CHINESE_PARASOL = registerKey("green_chinese_parasol");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEETGUM = registerKey("sweetgum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEETGUM_WITH_LEAF_PILE = registerKey("sweetgum_with_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEETGUM_WITH_FALLEN_LOG = registerKey("sweetgum_with_fallen_log");
    // camphor & dove tree & chinaberry & desert poplar
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMPHOR = registerKey("camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMPHOR_WITH_FALLEN_LOG = registerKey("camphor_with_fallen_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NEW_CAMPHOR = registerKey("new_camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NEW_CAMPHOR_WITH_FALLEN_LOG = registerKey("new_camphor_with_fallen_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_CAMPHOR = registerKey("ancient_camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NEW_ANCIENT_CAMPHOR = registerKey("new_ancient_camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_CAMPHOR = registerKey("small_camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOVE_TREE = registerKey("dove_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINABERRY = registerKey("chinaberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINABERRY_WITH_FALLEN_LOG = registerKey("chinaberry_with_fallen_log");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINABERRY_SMALL = registerKey("chinaberry_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_0 = registerKey("desert_poplar_0");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_1 = registerKey("desert_poplar_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_2 = registerKey("desert_poplar_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_3 = registerKey("desert_poplar_3");
    //crape myrtle & camellia & azalea
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAPE_MYRTLE_TREE = registerKey("crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CRAPE_MYRTLE_TREE = registerKey("red_crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CRAPE_MYRTLE_TREE = registerKey("pink_crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRAPE_MYRTLE_TREE = registerKey("white_crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMELLIA_TREE = registerKey("camellia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CAMELLIA_TREE = registerKey("white_camellia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CAMELLIA_TREE = registerKey("pink_camellia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_CAMELLIA_TREE = registerKey("versicolor_camellia_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_AZALEA_TREE_KEY = registerKey("flowering_azalea_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_AZALEA_TREE_KEY = registerKey("red_azalea_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAYING_RHODODENDRON_TREE_KEY = registerKey("maying_rhododendron_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEWDROP_RHODODENDRON_TREE_KEY = registerKey("dewdrop_rhododendron_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHARMING_RHODODENDRON_TREE_KEY = registerKey("charming_rhododendron_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREAT_WHITE_RHODODENDRON_TREE_KEY = registerKey("great_white_rhododendron_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_RHODODENDRON_TREE_KEY = registerKey("purple_rhododendron_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_RHODODENDRON_TREE_KEY = registerKey("pink_rhododendron_tree_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_AZALEA_TREE_KEY = registerKey("chinese_azalea_tree_key");
    //wisteria
    public static final ResourceKey<ConfiguredFeature<?, ?>> WISTERIA_TREE = registerKey("wisteria_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_WISTERIA_TREE = registerKey("tall_wisteria_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PURPLE_WISTERIA_TREE = registerKey("tall_purple_wisteria_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_WHITE_WISTERIA_TREE = registerKey("tall_white_wisteria_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_RED_WISTERIA_TREE = registerKey("tall_red_wisteria_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BLUE_WISTERIA_TREE = registerKey("tall_blue_wisteria_tree");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ANCIENT_RED_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_GOLDEN_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.GOLDEN_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_GREEN_CALYX_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_DOUBLE_PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_DOUBLE_WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_FLAVESCENS_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                BlockStateProvider.simple(ModBlocks.FLAVESCENS_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_VERSICOLOR_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 45, 4, 3),
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),55, 30, 15),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());

        register(context, RED_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 0, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 0, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, GOLDEN_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 0, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.GOLDEN_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, GREEN_CALYX_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DOUBLE_PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DOUBLE_WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, FLAVESCENS_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 5, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.FLAVESCENS_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, VERSICOLOR_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 5, 0.4F, 60),
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),60, 25, 15),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, RED_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.RED_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.RED_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, WHITE_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.WHITE_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.WHITE_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, GREEN_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.GREEN_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.GREEN_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, PINK_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.PINK_WEEPING_MEI.get()), BlockStateProvider.simple(ModBlocks.PINK_WEEPING_MEI_PLANT.get()), 0.9f, 36, 3, 5))).ignoreVines().build());
        register(context, VERSICOLOR_WEEPING_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new WeepingMeiTrunkPlacer(8, 2, 2, 3, 4, 6, 0.5F, 60, 0.3F),
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),60, 25, 15),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new VersicolorWeepingMeiVineDecorator(0.8f, 36, 3, 5, 0.5f, 0.25f, 0.25f))).ignoreVines().build());

        register(context, ANCIENT_RED_MEI_WITH_SNOW, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 3, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).decorators(List.of(new SnowAroundTrunk(10, 0.9F, 10))).ignoreVines().build());
        register(context, RED_MEI_WITH_SNOW, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.RED_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.RED_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new SnowAroundTrunk(8, 0.9F, 6))).ignoreVines().build());
        register(context, GREEN_CALYX_MEI_WITH_SNOW, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new SnowAroundTrunk(8, 0.9F, 6))).ignoreVines().build());
        register(context, FLAVESCENS_MEI_WITH_SNOW, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.FLAVESCENS_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new SnowAroundTrunk(8, 0.9F, 6))).ignoreVines().build());

        register(context, UPRIGHT_CRABAPPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(7, 1, 1, 2, 4, 4, 2, 3, 0.9F),
                BlockStateProvider.simple(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        SimpleWeightedRandomList.Builder<BlockState> crabappleBuilder = SimpleWeightedRandomList.builder();
        for(Direction direction : Direction.Plane.HORIZONTAL) {
            crabappleBuilder.add(ModBlocks.CRABAPPLE.get().defaultBlockState()
                    .setValue(PeachBlock.AGE, 1)
                    .setValue(CrabappleBlock.FACING, direction), 1);
        }
        WeightedStateProvider provider = new WeightedStateProvider(crabappleBuilder.build());
        register(context, UPRIGHT_CRABAPPLE_WITH_FRUITS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(7, 1, 1, 2, 4, 4, 2, 3, 0.9F),
                BlockStateProvider.simple(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(provider, 0.6F))).ignoreVines().build());
        register(context, GOLDEN_CRABAPPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(7, 1, 1, 2, 4, 4, 2, 3, 0.9F),
                BlockStateProvider.simple(ModBlocks.GOLDEN_CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        SimpleWeightedRandomList.Builder<BlockState> goldenCrabappleBuilder = SimpleWeightedRandomList.builder();
        for(Direction direction : Direction.Plane.HORIZONTAL) {
            goldenCrabappleBuilder.add(ModBlocks.GOLDEN_CRABAPPLE.get().defaultBlockState()
                    .setValue(PeachBlock.AGE, 1)
                    .setValue(CrabappleBlock.FACING, direction), 1);
        }
        WeightedStateProvider provider2 = new WeightedStateProvider(goldenCrabappleBuilder.build());
        register(context, GOLDEN_CRABAPPLE_WITH_FRUITS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(7, 1, 1, 2, 4, 4, 2, 3, 0.9F),
                BlockStateProvider.simple(ModBlocks.GOLDEN_CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(provider2, 0.6F))).ignoreVines().build());
        register(context, WEEPING_CRABAPPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(10, 1, 1, 5, 4, 3, 3, 4, 0.6F),
                BlockStateProvider.simple(ModBlocks.WEEPING_CRABAPPLE_LEAVES.get()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(ModBlocks.WEEPING_CRABAPPLE.get().defaultBlockState(), 0.9F))).ignoreVines().build());

        register(context, PINK_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 4, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.PINK_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(3)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 3, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.WHITE_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(3)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, CLOUD_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 3, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.CLOUD_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(3)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(ModBlocks.CLOUD_APRICOT.get().defaultBlockState().setValue(PeachBlock.AGE, 1), 0.18F))).ignoreVines().build());

        register(context, ORNAMENTAL_PEACH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEACH_LOG.get()),
                new PeachTrunkPlacer(6, 2, 2, 2, 4, 3, 4, 0.9F, 0.4F),
                BlockStateProvider.simple(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get()),
                new PeachFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(3)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WILD_PEACH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEACH_LOG.get()),
                new PeachTrunkPlacer(7, 2, 2, 2, 4, 4, 5, 0.9F, 0.5F),
                BlockStateProvider.simple(ModBlocks.WILD_PEACH_LEAVES.get()),
                new PeachFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_PEACH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEACH_LOG.get()),
                new PeachTrunkPlacer(6, 2, 2, 2, 4, 3, 4, 0.9F, 0.4F),
                BlockStateProvider.simple(ModBlocks.WHITE_PEACH_LEAVES.get()),
                new PeachFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(3)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, IMMORTAL_PEACH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEACH_LOG.get()),
                new PeachTrunkPlacer(7, 2, 2, 2, 4, 4, 5, 0.9F, 0.5F),
                BlockStateProvider.simple(ModBlocks.IMMORTAL_PEACH_LEAVES.get()),
                new PeachFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(ModBlocks.IMMORTAL_PEACH.get().defaultBlockState().setValue(PeachBlock.AGE, 1), 0.12F))).ignoreVines().build());

        register(context, PEAR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEAR_LOG.get()),
                new FancyTrunkPlacer(12, 4, 0),
                BlockStateProvider.simple(ModBlocks.PEAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PEAR_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEAR_LOG.get()),
                new FancyTrunkPlacer(12, 4, 0),
                BlockStateProvider.simple(ModBlocks.PEAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.PEAR_LOG.get()), 0.5f, BlockStateProvider.simple(Blocks.MOSS_CARPET), 0.6f))).ignoreVines().build());

        register(context, TAIWAN_CHERRY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(Blocks.CHERRY_LOG),
                new CherryTrunkPlacer(7, 1, 0,
                        new WeightedListInt(SimpleWeightedRandomList.<IntProvider>builder().add(ConstantInt.of(1), 1).add(ConstantInt.of(2), 1).add(ConstantInt.of(3), 1).build()),
                        UniformInt.of(2, 4), UniformInt.of(-4, -3), UniformInt.of(-1, 0)),
                BlockStateProvider.simple(ModBlocks.TAIWAN_CHERRY_LEAVES.get()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, FLOWERING_PURPLE_LEAF_PLUM, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()),
                new FancyTrunkPlacer(7, 2, 0),
                BlockStateProvider.simple(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 5),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PURPLE_LEAF_PLUM, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()),
                new FancyTrunkPlacer(7, 2, 0),
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 5),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PURPLE_LEAF_PLUM_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()),
                new FancyTrunkPlacer(7, 2, 0),
                BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 5),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()), 0.5f, BlockStateProvider.simple(Blocks.MOSS_CARPET), 0.6f))).ignoreVines().build());

        register(context, GOLDEN_OSMANTHUS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OSMANTHUS_LOG.get()),
                new FancyTrunkPlacer(5, 4, 1),
                BlockStateProvider.simple(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, ORANGE_OSMANTHUS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OSMANTHUS_LOG.get()),
                new FancyTrunkPlacer(5, 4, 1),
                BlockStateProvider.simple(ModBlocks.ORANGE_OSMANTHUS_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_OSMANTHUS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.OSMANTHUS_LOG.get()),
                new FancyTrunkPlacer(5, 4, 1),
                BlockStateProvider.simple(ModBlocks.WHITE_OSMANTHUS_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, GOLDEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new StraightTrunkPlacer(12, 3, 0),
                BlockStateProvider.simple(ModBlocks.GOLDEN_GINKGO_LEAVES.get()),
                new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, GOLDEN_GINKGO_WITH_LEAF_PILE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new StraightTrunkPlacer(12, 3, 0),
                BlockStateProvider.simple(ModBlocks.GOLDEN_GINKGO_LEAVES.get()),
                new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new LeafPileDecorator(ModBlocks.GINKGO_LEAF.get().defaultBlockState(), 6, 2, 0.1F))).ignoreVines().build());
        register(context, GOLDEN_GINKGO_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new StraightTrunkPlacer(12, 3, 0),
                BlockStateProvider.simple(ModBlocks.GOLDEN_GINKGO_LEAVES.get()),
                new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()), 0.5f, BlockStateProvider.simple(ModBlocks.GINKGO_LEAF.get()), 0.2f),
                        new LeafPileDecorator(ModBlocks.GINKGO_LEAF.get().defaultBlockState(), 6, 2, 0.1F))).ignoreVines().build());
        register(context, GREEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new StraightTrunkPlacer(12, 3, 0),
                BlockStateProvider.simple(ModBlocks.GREEN_GINKGO_LEAVES.get()),
                new GinkgoFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, ANCIENT_GOLDEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new GiantTrunkPlacer(26, 2, 2),
                BlockStateProvider.simple(ModBlocks.GOLDEN_GINKGO_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), UniformInt.of(18, 21)),
                new TwoLayersFeatureSize(1, 1, 2)).ignoreVines().build());
        register(context, ANCIENT_GOLDEN_GINKGO_WITH_LEAF_PILE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new GiantTrunkPlacer(26, 2, 2),
                BlockStateProvider.simple(ModBlocks.GOLDEN_GINKGO_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), UniformInt.of(18, 21)),
                new TwoLayersFeatureSize(1, 1, 2)).decorators(List.of(new LeafPileDecorator(ModBlocks.GINKGO_LEAF.get().defaultBlockState(), 6, 2, 0.1F))).ignoreVines().build());
        register(context, ANCIENT_GREEN_GINKGO, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GINKGO_LOG.get()),
                new GiantTrunkPlacer(26, 2, 2),
                BlockStateProvider.simple(ModBlocks.GREEN_GINKGO_LEAVES.get()),
                new MegaPineFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), UniformInt.of(18, 21)),
                new TwoLayersFeatureSize(1, 1, 2)).ignoreVines().build());

        register(context, YELLOW_CHINESE_PARASOL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LOG.get()),
                new ChineseParasolTrunkPlacer(13, 4, 1, 2, 3),
                BlockStateProvider.simple(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, YELLOW_CHINESE_PARASOL_WITH_LEAF_PILE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LOG.get()),
                new ChineseParasolTrunkPlacer(13, 4, 1, 2, 3),
                BlockStateProvider.simple(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new LeafPileDecorator(ModBlocks.CHINESE_PARASOL_LEAF_0.get().defaultBlockState(), 6, 2, 0.05F),
                        new LeafPileDecorator(ModBlocks.CHINESE_PARASOL_LEAF_1.get().defaultBlockState(), 6, 2, 0.05F))).ignoreVines().build());
        register(context, YELLOW_CHINESE_PARASOL_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LOG.get()),
                new ChineseParasolTrunkPlacer(13, 4, 1, 2, 3),
                BlockStateProvider.simple(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LOG.get()), 0.5f, BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LEAF_0.get()), 0.2f),
                        new LeafPileDecorator(ModBlocks.CHINESE_PARASOL_LEAF_0.get().defaultBlockState(), 6, 2, 0.05F),
                        new LeafPileDecorator(ModBlocks.CHINESE_PARASOL_LEAF_1.get().defaultBlockState(), 6, 2, 0.05F))).ignoreVines().build());
        register(context, GREEN_CHINESE_PARASOL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINESE_PARASOL_LOG.get()),
                new ChineseParasolTrunkPlacer(13, 4, 1, 2, 3),
                BlockStateProvider.simple(ModBlocks.GREEN_CHINESE_PARASOL_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, SWEETGUM, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LOG.get()),
                new StraightTrunkPlacer(13, 5, 0),
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LEAVES.get()),
                new SweetgumFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, SWEETGUM_WITH_LEAF_PILE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LOG.get()),
                new StraightTrunkPlacer(13, 5, 0),
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LEAVES.get()),
                new SweetgumFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new LeafPileDecorator(ModBlocks.SWEETGUM_LEAF_0.get().defaultBlockState(), 6, 2, 0.05F),
                        new LeafPileDecorator(ModBlocks.SWEETGUM_LEAF_1.get().defaultBlockState(), 6, 2, 0.05F))).ignoreVines().build());
        register(context, SWEETGUM_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LOG.get()),
                new StraightTrunkPlacer(13, 5, 0),
                BlockStateProvider.simple(ModBlocks.SWEETGUM_LEAVES.get()),
                new SweetgumFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), ConstantInt.of(6)),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.SWEETGUM_LOG.get()), 0.5f, BlockStateProvider.simple(ModBlocks.SWEETGUM_LEAF_0.get()), 0.2f),
                        new LeafPileDecorator(ModBlocks.SWEETGUM_LEAF_0.get().defaultBlockState(), 6, 2, 0.05F),
                        new LeafPileDecorator(ModBlocks.SWEETGUM_LEAF_1.get().defaultBlockState(), 6, 2, 0.05F))).ignoreVines().build());

        register(context, CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(9, 4, 2, 3, 2, 4, 0.7F, 3),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, CAMPHOR_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(9, 4, 2, 3, 2, 4, 0.7F, 3),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()), 0.5f, BlockStateProvider.simple(Blocks.MOSS_CARPET), 0.6f))).ignoreVines().build());
        register(context, NEW_CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(9, 4, 2, 3, 2, 4, 0.7F, 3),
                BlockStateProvider.simple(ModBlocks.NEW_CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, NEW_CAMPHOR_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(9, 4, 2, 3, 2, 4, 0.7F, 3),
                BlockStateProvider.simple(ModBlocks.NEW_CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()), 0.5f, BlockStateProvider.simple(Blocks.MOSS_CARPET), 0.6f))).ignoreVines().build());
        register(context, ANCIENT_CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.7F, 5),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build());
        register(context, NEW_ANCIENT_CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.7F, 5),
                BlockStateProvider.simple(ModBlocks.NEW_CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(0, 0, 0)).ignoreVines().build());
        register(context, SMALL_CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, DOVE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOVE_TREE_LOG.get()),
                new FancyTrunkPlacer(10, 4, 4),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.get().defaultBlockState(), 3).add(ModBlocks.DOVE_TREE_LEAVES.get().defaultBlockState(), 1)),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, CHINABERRY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINABERRY_LOG.get()),
                new CamphorTrunkPlacer(9, 3, 1, 4, 3, 4, 0.8F, 2),
                BlockStateProvider.simple(ModBlocks.CHINABERRY_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, CHINABERRY_WITH_FALLEN_LOG, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINABERRY_LOG.get()),
                new CamphorTrunkPlacer(9, 3, 1, 4, 3, 4, 0.8F, 2),
                BlockStateProvider.simple(ModBlocks.CHINABERRY_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1))
                .decorators(List.of(
                        new FallenLogDecorator(BlockStateProvider.simple(ModBlocks.CHINABERRY_LOG.get()), 0.8f, BlockStateProvider.simple(Blocks.MOSS_CARPET), 0.6f))).ignoreVines().build());
        register(context, CHINABERRY_SMALL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CHINABERRY_LOG.get()),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.simple(ModBlocks.CHINABERRY_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, DESERT_POPLAR_0, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LOG.get()),
                new StraightTrunkPlacer(1, 1, 0),
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(1), ConstantInt.of(0), 2),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DESERT_POPLAR_1, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LOG.get()),
                new StraightTrunkPlacer(7, 1, 0),
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 5),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DESERT_POPLAR_2, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LOG.get()),
                new CamphorTrunkPlacer(8, 2, 1, 3, 3, 4, 0.8F, 2),
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DESERT_POPLAR_3, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LOG.get()),
                new AncientCamphorTrunkPlacer(11, 3, 2, 6, 3, 4, 0.6F, 5),
                BlockStateProvider.simple(ModBlocks.DESERT_POPLAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, WISTERIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new ForkingTrunkPlacer(5, 2, 2),
                BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(
                        List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                                BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA_PLANT.get().defaultBlockState()), 0.9f, 72, 1, 3))).ignoreVines().build());
        register(context, TALL_WISTERIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.95F, 5),
                BlockStateProvider.simple(Blocks.ACACIA_LEAVES),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(
                List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                        BlockStateProvider.simple(ModBlocks.CHINESE_WISTERIA_PLANT.get().defaultBlockState()), 0.95f, 300, 2, 5))).ignoreVines().build());
        register(context, TALL_PURPLE_WISTERIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.95F, 5),
                BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(
                List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                        BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA_PLANT.get().defaultBlockState()), 0.95f, 300, 2, 5))).ignoreVines().build());
        register(context, TALL_WHITE_WISTERIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.95F, 5),
                BlockStateProvider.simple(ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(
                List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.WHITE_CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                        BlockStateProvider.simple(ModBlocks.WHITE_CHINESE_WISTERIA_PLANT.get().defaultBlockState()), 0.95f, 300, 2, 5))).ignoreVines().build());
        register(context, TALL_RED_WISTERIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.95F, 5),
                BlockStateProvider.simple(ModBlocks.RED_CRAPE_MYRTLE_LEAVES.get()),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(
                List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.RED_CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                        BlockStateProvider.simple(ModBlocks.RED_CHINESE_WISTERIA_PLANT.get().defaultBlockState()), 0.95f, 300, 2, 5))).ignoreVines().build());
        register(context, TALL_BLUE_WISTERIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.95F, 5),
                BlockStateProvider.simple(Blocks.ACACIA_LEAVES),
                new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(
                List.of(new WeepingMeiVineDecorator(BlockStateProvider.simple(ModBlocks.BLUE_CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                        BlockStateProvider.simple(ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get().defaultBlockState()), 0.95f, 300, 2, 5))).ignoreVines().build());

        register(context, CRAPE_MYRTLE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, RED_CRAPE_MYRTLE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.RED_CRAPE_MYRTLE_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PINK_CRAPE_MYRTLE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.PINK_CRAPE_MYRTLE_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_CRAPE_MYRTLE_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, FLOWERING_AZALEA_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 3).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, RED_AZALEA_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.RED_AZALEA_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, MAYING_RHODODENDRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.MAYING_RHODODENDRON_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DEWDROP_RHODODENDRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.DEWDROP_RHODODENDRON_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, CHARMING_RHODODENDRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CHARMING_RHODODENDRON_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, GREAT_WHITE_RHODODENDRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.GREAT_WHITE_RHODODENDRON_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PURPLE_RHODODENDRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PURPLE_RHODODENDRON_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PINK_RHODODENDRON_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.PINK_RHODODENDRON_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, CHINESE_AZALEA_TREE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CHINESE_AZALEA_LEAVES.get().defaultBlockState(), 2).add(Blocks.AZALEA_LEAVES.defaultBlockState(), 1)),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());

        register(context, CAMELLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.CAMELLIA_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_CAMELLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.WHITE_CAMELLIA_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PINK_CAMELLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.PINK_CAMELLIA_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, VERSICOLOR_CAMELLIA_TREE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new BendingTrunkPlacer(4, 2, 0, 3, UniformInt.of(1, 2)),
                BlockStateProvider.simple(ModBlocks.VERSICOLOR_CAMELLIA_LEAVES.get()),
                new RandomSpreadFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(2), 50),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + name));
    }

    @SuppressWarnings("SameParameterValue")
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
