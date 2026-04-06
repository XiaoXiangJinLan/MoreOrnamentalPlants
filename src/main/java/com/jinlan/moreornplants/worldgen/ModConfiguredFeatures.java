package com.jinlan.moreornplants.worldgen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.FlowerBlocks.ModFlowerPetalsBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusLeafBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.PeachBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.WisteriaBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.WisteriaPlantBlock;
import com.jinlan.moreornplants.feature.blockstateproviders.VersicolorMeiLeavesProvider;
import com.jinlan.moreornplants.feature.foliageplacers.*;
import com.jinlan.moreornplants.feature.treedecorators.*;
import com.jinlan.moreornplants.feature.trunkplacers.*;
import com.jinlan.moreornplants.init.ModFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.util.valueproviders.WeightedListInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RandomizedIntStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.*;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_RED_MEI = registerKey("ancient_red_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MEI = registerKey("red_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_RED_MEI_WITH_SNOW = registerKey("ancient_red_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_MEI_WITH_SNOW = registerKey("red_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_WHITE_MEI = registerKey("ancient_white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MEI = registerKey("white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_PINK_MEI = registerKey("ancient_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MEI = registerKey("pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GREEN_CALYX_MEI = registerKey("ancient_green_calyx_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CALYX_MEI = registerKey("green_calyx_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CALYX_MEI_WITH_SNOW = registerKey("green_calyx_mei_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DOUBLE_PINK_MEI = registerKey("ancient_double_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_PINK_MEI = registerKey("double_pink_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_DOUBLE_WHITE_MEI = registerKey("ancient_double_white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_WHITE_MEI = registerKey("double_white_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_FLAVESCENS_MEI = registerKey("ancient_flavescens_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLAVESCENS_MEI = registerKey("flavescens_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLAVESCENS_MEI_WITH_SNOW = registerKey("flavescens_meii_with_snow");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_VERSICOLOR_MEI = registerKey("ancient_versicolor_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_MEI = registerKey("versicolor_mei");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_WEEPING_MEI = registerKey("red_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_WEEPING_MEI = registerKey("white_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_WEEPING_MEI = registerKey("green_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_WEEPING_MEI = registerKey("pink_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> VERSICOLOR_WEEPING_MEI = registerKey("versicolor_weeping_mei_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FRAGRANT_SNOW_PETALS_PATCH = registerKey("fragrant_snow_petals_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> UPRIGHT_CRABAPPLE = registerKey("upright_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> UPRIGHT_CRABAPPLE_WITH_FRUITS = registerKey("upright_crabapple_fruits");
    public static final ResourceKey<ConfiguredFeature<?, ?>> UPRIGHT_CRABAPPLE_SMALL = registerKey("upright_crabapple_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEEPING_CRABAPPLE = registerKey("weeping_crabapple");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_APRICOT = registerKey("pink_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_APRICOT = registerKey("white_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CLOUD_APRICOT = registerKey("cloud_apricot");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRING_PETALS_PATCH = registerKey("spring_petals_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORNAMENTAL_PEACH = registerKey("ornamental_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_PEACH = registerKey("wild_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IMMORTAL_PEACH = registerKey("immortal_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PINK_PETALS_PATCH = registerKey("peach_pink_petals_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEAR = registerKey("pear");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERING_PURPLE_LEAF_PLUM = registerKey("flowering_purple_leaf_plum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_LEAF_PLUM = registerKey("purple_leaf_plum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_OSMANTHUS = registerKey("golden_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORANGE_OSMANTHUS = registerKey("orange_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_OSMANTHUS = registerKey("white_osmanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_GINKGO = registerKey("golden_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_GINKGO_WITH_LEAF_PILE = registerKey("golden_ginkgo_with_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_GINKGO = registerKey("green_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GOLDEN_GINKGO = registerKey("ancient_golden_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_GREEN_GINKGO = registerKey("ancient_green_ginkgo");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_PARASOL = registerKey("yellow_chinese_parasol");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_PARASOL_WITH_LEAF_PILE = registerKey("yellow_chinese_parasol_with_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_CHINESE_PARASOL = registerKey("green_chinese_parasol");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEETGUM = registerKey("sweetgum");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SWEETGUM_WITH_LEAF_PILE = registerKey("sweetgum_with_leaf_pile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMPHOR = registerKey("camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMPHOR_WITH_NEW_LEAVES = registerKey("camphor_with_new_leaves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ANCIENT_CAMPHOR = registerKey("ancient_camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_CAMPHOR = registerKey("small_camphor");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOVE_TREE = registerKey("dove_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINABERRY = registerKey("chinaberry");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINABERRY_SMALL = registerKey("chinaberry_small");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_0 = registerKey("desert_poplar_0");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_1 = registerKey("desert_poplar_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_2 = registerKey("desert_poplar_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DESERT_POPLAR_3 = registerKey("desert_poplar_3");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_FOREST = registerKey("chrysanthemum_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_KEY = registerKey("chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> XIHU_LIUYUE_KEY = registerKey("xihu_liuyue_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHRYSANTHEMUM_KEY = registerKey("white_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CHRYSANTHEMUM_KEY = registerKey("purple_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHRYSANTHEMUM_KEY = registerKey("pink_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_GROVE = registerKey("chrysanthemum_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_ROSE_KEY = registerKey("chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_ROSE_WOODS_KEY = registerKey("chinese_rose_woods_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_ROSE_PENGLAI = registerKey("chinese_rose_penglai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_ROSE_GROVE = registerKey("chinese_rose_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_ROSE_PLAIN = registerKey("chinese_rose_plain");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_KEY = registerKey("peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_PINK_KEY = registerKey("peony_pink_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_LIGHT_PINK_KEY = registerKey("peony_light_pink_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_RED_KEY = registerKey("peony_red_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_YELLOW_KEY = registerKey("peony_yellow_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_PURPLE_KEY = registerKey("peony_purple_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_WHITE_KEY = registerKey("peony_white_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_BLUE_KEY = registerKey("peony_blue_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_GREEN_KEY = registerKey("peony_green_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_PINK_GROVE = registerKey("peony_pink_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_GROVE = registerKey("peony_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_PENGLAI = registerKey("peony_penglai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_TREE_MEADOWS = registerKey("peony_tree_meadows");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YAO_HUANG_PEONY_KEY = registerKey("yao_huang_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEI_ZI_PEONY_KEY = registerKey("wei_zi_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZHAO_PINK_PEONY_KEY = registerKey("zhao_pink_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZHAO_PINK_PEONY_GROVE = registerKey("zhao_pink_peony_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOU_GREEN_PEONY_KEY = registerKey("dou_green_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LUOYANG_RED_PEONY_KEY = registerKey("luoyang_red_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_TREE_GROVE = registerKey("peony_tree_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_TREE_PENGLAI = registerKey("peony_tree_penglai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CAMELLIA_KEY = registerKey("red_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CAMELLIA_KEY = registerKey("white_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CAMELLIA_KEY = registerKey("pink_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CAMELLIA_GROVE = registerKey("pink_camellia_grove");
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
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_AZALEA_KEY = registerKey("red_azalea_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAYING_RHODODENDRON_KEY = registerKey("maying_rhododendron_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEWDROP_RHODODENDRON_KEY = registerKey("dewdrop_rhododendron_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHARMING_RHODODENDRON_KEY = registerKey("charming_rhododendron_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREAT_WHITE_RHODODENDRON_KEY = registerKey("great_white_rhododendron_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_RHODODENDRON_KEY = registerKey("purple_rhododendron_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_RHODODENDRON_KEY = registerKey("pink_rhododendron_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_AZALEA_KEY = registerKey("chinese_azalea_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_KEY = registerKey("azalea_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AZALEA_GROVE = registerKey("azalea_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINTERSWEET = registerKey("wintersweet");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERS_GROVE_FLOWERS = registerKey("flowers_grove_flowers");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_FLOWERS_GROVE = registerKey("small_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TULIP_GROVE = registerKey("tulip_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYMBIDIUM = registerKey("cymbidium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYMBIDIUM_RIVER = registerKey("cymbidium_river");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUMMER_CYMBIDIUM_YUNMENG = registerKey("summer_cymbidium_yunmeng");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRING_CYMBIDIUM_FOREST = registerKey("spring_cymbidium_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUMMER_CYMBIDIUM_FOREST = registerKey("summer_cymbidium_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMN_CYMBIDIUM_PLAIN = registerKey("autumn_cymbidium_plain");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINTER_CYMBIDIUM_FOREST = registerKey("winter_cymbidium_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LILY_OF_THE_VALLEY_FOREST = registerKey("lily_of_the_valley_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LILY_OF_THE_VALLEY_WOODS = registerKey("lily_of_the_valley_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_ORCHID_FOREST = registerKey("blue_orchid_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_FLOWERS_GROVE = registerKey("tall_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAPE_MYRTLE_KEY = registerKey("crape_myrtle_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAPE_MYRTLE_TREE = registerKey("crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CRAPE_MYRTLE_TREE = registerKey("red_crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CRAPE_MYRTLE_TREE = registerKey("pink_crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRAPE_MYRTLE_TREE = registerKey("white_crape_myrtle_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRAPE_MYRTLE_CAVES_2 = registerKey("white_crape_myrtle_caves_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAPE_MYRTLE_CAVES = registerKey("crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CRAPE_MYRTLE_CAVES = registerKey("red_crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CRAPE_MYRTLE_CAVES = registerKey("pink_crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRAPE_MYRTLE_CAVES = registerKey("white_crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTON_ROSE_KEY = registerKey("cotton_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTON_ROSE_GROVE = registerKey("cotton_rose_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTON_ROSE_FOREST = registerKey("cotton_rose_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOTTLED_BAMBOO_KEY = registerKey("mottled_bamboo_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_BAMBOO_KEY = registerKey("black_bamboo_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_BAMBOO_GALLERY_KEY = registerKey("black_bamboo_gallery_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOTUS_KEY = registerKey("lotus_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WISTERIA_TREE = registerKey("wisteria_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WISTERIA = registerKey("wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_WISTERIA = registerKey("white_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_WISTERIA = registerKey("blue_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_WISTERIA = registerKey("red_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NANJING_WISTERIA = registerKey("nanjing_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROSE_BUSH = registerKey("rose_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOUNTAIN_GRASS = registerKey("fountain_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOUNTAIN_GRASS_GROVE = registerKey("fountain_grass_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOUNTAIN_GRASS_WOODS = registerKey("fountain_grass_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MISCANTHUS = registerKey("miscanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_MISCANTHUS = registerKey("golden_miscanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERS_PLAIN = registerKey("flowers_plain");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_GROVE = registerKey("grass_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_WOODS = registerKey("grass_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FOREST_1 = registerKey("grass_forest_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FOREST_2 = registerKey("grass_forest_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FERN = registerKey("grass_fern");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FERN_1 = registerKey("grass_fern_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FERN_2 = registerKey("grass_fern_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_0 = registerKey("grass_0");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_BUSH = registerKey("dead_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PETALS = registerKey("peach_petals");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PETALS_RIVER = registerKey("peach_petals_river");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_1 = registerKey("moss_patch_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_2 = registerKey("moss_patch_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_3 = registerKey("moss_patch_3");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_4 = registerKey("moss_patch_4");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_5 = registerKey("moss_patch_5");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holdergetter = context.lookup(Registries.CONFIGURED_FEATURE);

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
        register(context, ANCIENT_PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.PINK_MEI_LEAVES.get()),
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
        register(context, ANCIENT_DOUBLE_WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(0, 0, 0, OptionalInt.of(4))).ignoreVines().build());
        register(context, ANCIENT_FLAVESCENS_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new AncientMeiTrunkPlacer(16, 2, 4, 2, 6, 8, 0.5F, 60, 4, 3),
                BlockStateProvider.simple(ModBlocks.FLAVESCENS_MEI_LEAVES.get()),
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
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, GREEN_CALYX_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.GREEN_CALYX_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DOUBLE_PINK_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, DOUBLE_WHITE_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.DOUBLE_WHITE_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, FLAVESCENS_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.WHITE_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                BlockStateProvider.simple(ModBlocks.FLAVESCENS_MEI_LEAVES.get()),
                new MeiFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, VERSICOLOR_MEI, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LOG.get()),
                new MeiTrunkPlacer(7, 2, 2, 3, 4, 6, 0.4F, 60),
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),60, 25, 15),
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
                new VersicolorMeiLeavesProvider(BlockStateProvider.simple(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.WHITE_MEI_LEAVES.get()), BlockStateProvider.simple(ModBlocks.VERSICOLOR_MEI_LEAVES.get()),60, 25, 15),
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

        SimpleWeightedRandomList.Builder<BlockState> fragrantSnowPetalsBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                fragrantSnowPetalsBuilder.add(ModBlocks.FRAGRANT_SNOW_PETALS.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, FRAGRANT_SNOW_PETALS_PATCH, Feature.FLOWER, new RandomPatchConfiguration(102, 7, 3,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(fragrantSnowPetalsBuilder)))));

        register(context, UPRIGHT_CRABAPPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(7, 1, 1, 2, 4, 4, 2, 3, 0.9F),
                BlockStateProvider.simple(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, UPRIGHT_CRABAPPLE_WITH_FRUITS, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(7, 1, 1, 2, 4, 4, 2, 3, 0.9F),
                BlockStateProvider.simple(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(2), 3),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(ModBlocks.CRABAPPLE.get().defaultBlockState().setValue(PeachBlock.AGE, 2), 0.6F))).ignoreVines().build());
        register(context, UPRIGHT_CRABAPPLE_SMALL, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new StraightTrunkPlacer(5, 2, 0),
                BlockStateProvider.simple(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WEEPING_CRABAPPLE, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CRABAPPLE_LOG.get()),
                new CrabappleTrunkPlacer(9, 1, 1, 3, 5, 3, 4, 5, 0.6F),
                BlockStateProvider.simple(ModBlocks.WEEPING_CRABAPPLE_LEAVES.get()),
                new CherryFoliagePlacer(ConstantInt.of(4), ConstantInt.of(0), ConstantInt.of(5), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(ModBlocks.WEEPING_CRABAPPLE.get().defaultBlockState(), 0.9F))).ignoreVines().build());

        register(context, PINK_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 4, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.PINK_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.1F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, WHITE_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 3, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.WHITE_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.1F),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, CLOUD_APRICOT, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.APRICOT_LOG.get()),
                new ApricotTrunkPlacer(9, 2,2, 3, 3, 3, 6, 0.7F, 0.6F),
                BlockStateProvider.simple(ModBlocks.CLOUD_APRICOT_LEAVES.get()),
                new ApricotFoliagePlacer(ConstantInt.of(3), ConstantInt.of(0), ConstantInt.of(4), 0.1F),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(ModBlocks.CLOUD_APRICOT.get().defaultBlockState().setValue(PeachBlock.AGE, 2), 0.18F))).ignoreVines().build());
        SimpleWeightedRandomList.Builder<BlockState> springPetalsBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                springPetalsBuilder.add(ModBlocks.SPRING_PETALS.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, SPRING_PETALS_PATCH, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(springPetalsBuilder)))));

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
        register(context, IMMORTAL_PEACH, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEACH_LOG.get()),
                new PeachTrunkPlacer(7, 2, 2, 2, 4, 4, 5, 0.9F, 0.5F),
                BlockStateProvider.simple(ModBlocks.IMMORTAL_PEACH_LEAVES.get()),
                new PeachFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), ConstantInt.of(4)),
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new CrabappleDecorator(ModBlocks.IMMORTAL_PEACH.get().defaultBlockState().setValue(PeachBlock.AGE, 2), 0.12F))).ignoreVines().build());
        SimpleWeightedRandomList.Builder<BlockState> peachPinkPetalsBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                peachPinkPetalsBuilder.add(ModBlocks.PEACH_PINK_PETALS.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, PEACH_PINK_PETALS_PATCH, Feature.FLOWER, new RandomPatchConfiguration(96, 6, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(peachPinkPetalsBuilder)))));
        SimpleWeightedRandomList.Builder<BlockState> peachPetalsBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                peachPetalsBuilder.add(ModBlocks.ORNAMENTAL_PEACH_PETALS.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 2);
                peachPetalsBuilder.add(ModBlocks.WILD_PEACH_PETALS.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, PEACH_PETALS, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 7, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(peachPetalsBuilder)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.WATER)))));

        register(context, PEAR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.PEAR_LOG.get()),
                new FancyTrunkPlacer(12, 4, 0),
                BlockStateProvider.simple(ModBlocks.PEAR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(4), 4),
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
                new TwoLayersFeatureSize(1, 0, 1)).decorators(List.of(new LeafPileDecorator(ModBlocks.GINKGO_LEAF_PILE.get().defaultBlockState(), 6, 2, 0.1F))).ignoreVines().build());
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
                        new LeafPileDecorator(ModBlocks.SWEETGUM_LEAF_PILE_0.get().defaultBlockState(), 6, 2, 0.05F),
                        new LeafPileDecorator(ModBlocks.SWEETGUM_LEAF_PILE_1.get().defaultBlockState(), 6, 2, 0.05F))).ignoreVines().build());

        register(context, CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(9, 4, 2, 3, 2, 4, 0.7F, 3),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, CAMPHOR_WITH_NEW_LEAVES, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new CamphorTrunkPlacer(8, 4, 2, 3, 2, 4, 0.7F, 3),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(ModBlocks.CAMPHOR_LEAVES.get().defaultBlockState(), 7).add(ModBlocks.NEW_CAMPHOR_LEAVES.get().defaultBlockState(), 1)),
                new FancyFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
        register(context, ANCIENT_CAMPHOR, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LOG.get()),
                new AncientCamphorTrunkPlacer(16, 4, 4, 5, 4, 4, 0.7F, 5),
                BlockStateProvider.simple(ModBlocks.CAMPHOR_LEAVES.get()),
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
                        BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA_PLANT.get().defaultBlockState().setValue(WisteriaPlantBlock.TOP, true)), 0.9f, 72, 2, 2))).ignoreVines().build());

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

        register(context, CYMBIDIUM_RIVER, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.SPRING_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.SUMMER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.AUTUMN_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WINTER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(Blocks.BLUE_ORCHID.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        SimpleWeightedRandomList.Builder<BlockState> peachPetalsRiverBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                peachPetalsRiverBuilder.add(ModBlocks.ORNAMENTAL_PEACH_PETALS.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
                peachPetalsRiverBuilder.add(ModBlocks.WILD_PEACH_PETALS.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, PEACH_PETALS_RIVER, Feature.RANDOM_PATCH, new RandomPatchConfiguration(8, 4, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(peachPetalsRiverBuilder)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.WATER)))));

        register(context, PEONY_TREE_PENGLAI, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.TWO_QIAO_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.VERSICOLOR_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_PENGLAI, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.COLORFUL_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_COLORFUL_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.INK_COLORFUL_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_WHITE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_WHITE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.YELLOW_WHITE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_WHITE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WU_HUA_LONG_YU_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHINESE_ROSE_PENGLAI, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_PINK_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, SUMMER_CYMBIDIUM_YUNMENG, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SUMMER_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.DIRT, Blocks.MUD)))));

        register(context, SPRING_CYMBIDIUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SPRING_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, SUMMER_CYMBIDIUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SUMMER_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, WINTER_CYMBIDIUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WINTER_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, LILY_OF_THE_VALLEY_FOREST, Feature.FLOWER, new RandomPatchConfiguration(6, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, BLUE_ORCHID_FOREST, Feature.FLOWER, new RandomPatchConfiguration(4, 8, 6,
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
                                        .add(ModBlocks.XIHU_LIUYUE.get().defaultBlockState(), 1)
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
        register(context, XIHU_LIUYUE_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.XIHU_LIUYUE.get())),
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
        register(context, COTTON_ROSE_FOREST, Feature.FLOWER, new RandomPatchConfiguration(12, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COTTON_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, RED_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 10, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, WHITE_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 10, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PINK_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 10, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, RED_AZALEA_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_AZALEA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, MAYING_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MAYING_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, DEWDROP_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.DEWDROP_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHARMING_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHARMING_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GREAT_WHITE_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GREAT_WHITE_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PURPLE_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PINK_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHINESE_AZALEA_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHINESE_AZALEA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, AZALEA_KEY, Feature.FLOWER, new RandomPatchConfiguration(6, 4, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.FLOWERING_AZALEA)),
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

        register(context, FLOWERS_GROVE_FLOWERS, Feature.FLOWER, new RandomPatchConfiguration(24, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.SPRING_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.SUMMER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.AUTUMN_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WINTER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CAMELLIA.get().defaultBlockState(), 6).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHRYSANTHEMUM_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 3, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.XIHU_LIUYUE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GOLD_BACKED_SCARLET_MUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GREEN_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CYMBIDIUM, Feature.FLOWER, new RandomPatchConfiguration(6, 5, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.SPRING_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.SUMMER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.AUTUMN_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WINTER_CYMBIDIUM.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_TREE_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.YAO_HUANG_PEONY.get().defaultBlockState(), 6)
                                        .add(ModBlocks.WEI_ZI_PEONY.get().defaultBlockState(), 6)
                                        .add(ModBlocks.ZHAO_PINK_PEONY.get().defaultBlockState(), 6)
                                        .add(ModBlocks.DOU_GREEN_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LUOYANG_RED_PEONY.get().defaultBlockState(), 6).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_GROVE, Feature.FLOWER, new RandomPatchConfiguration(42, 5, 4,
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
                                        .add(ModBlocks.INK_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_PEONY.get().defaultBlockState(), 2).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHINESE_ROSE_GROVE, Feature.FLOWER, new RandomPatchConfiguration(52, 5, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_PINK_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CRAPE_MYRTLE_KEY, Feature.FLOWER, new RandomPatchConfiguration(9, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CRAPE_MYRTLE.get().defaultBlockState(), 2)
                                        .add(ModBlocks.RED_CRAPE_MYRTLE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CRAPE_MYRTLE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CRAPE_MYRTLE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, COTTON_ROSE_GROVE, Feature.FLOWER, new RandomPatchConfiguration(18, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COTTON_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PINK_CAMELLIA_GROVE, Feature.FLOWER, new RandomPatchConfiguration(32, 4, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, AZALEA_GROVE, Feature.FLOWER, new RandomPatchConfiguration(24, 4, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.RED_AZALEA.get().defaultBlockState(), 3)
                                        .add(ModBlocks.MAYING_RHODODENDRON.get().defaultBlockState(), 2)
                                        .add(ModBlocks.DEWDROP_RHODODENDRON.get().defaultBlockState(), 2)
                                        .add(ModBlocks.CHARMING_RHODODENDRON.get().defaultBlockState(), 3)
                                        .add(ModBlocks.GREAT_WHITE_RHODODENDRON.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PURPLE_RHODODENDRON.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PINK_RHODODENDRON.get().defaultBlockState(), 2)
                                        .add(ModBlocks.CHINESE_AZALEA.get().defaultBlockState(), 2).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, FOUNTAIN_GRASS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(24, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_FOUNTAIN_GRASS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));register(context, TALL_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(52, 6, 4,
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
        register(context, SMALL_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(52, 6, 4,
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
        register(context, TULIP_GROVE, Feature.FLOWER, new RandomPatchConfiguration(52, 6, 4,
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

        register(context, PEONY_PINK_GROVE, Feature.FLOWER, new RandomPatchConfiguration(72, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, ZHAO_PINK_PEONY_GROVE, Feature.FLOWER, new RandomPatchConfiguration(72, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ZHAO_PINK_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, PEONY_TREE_MEADOWS, Feature.FLOWER, new RandomPatchConfiguration(72, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.YAO_HUANG_PEONY.get().defaultBlockState(), 20)
                                        .add(ModBlocks.WEI_ZI_PEONY.get().defaultBlockState(), 20)
                                        .add(ModBlocks.ZHAO_PINK_PEONY.get().defaultBlockState(), 59)
                                        .add(ModBlocks.DOU_GREEN_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, YAO_HUANG_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.YAO_HUANG_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, WEI_ZI_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WEI_ZI_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, ZHAO_PINK_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(72, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ZHAO_PINK_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, DOU_GREEN_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.DOU_GREEN_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, LUOYANG_RED_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LUOYANG_RED_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(72, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.PEONY.get().defaultBlockState(), 5)
                                        .add(ModBlocks.LIGHT_RED_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.LIGHT_PURPLE_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.LIGHT_YELLOW_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_PINK_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_LIGHT_PINK_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_PINK_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_RED_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_RED_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_PURPLE_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_PURPLE_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_YELLOW_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_YELLOW_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_WHITE_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_BLUE_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUE_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, PEONY_GREEN_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GREEN_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, COTTON_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(16, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COTTON_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, MOTTLED_BAMBOO_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(100, 9, 4,
                PlacementUtils.onlyWhenEmpty(ModFeatures.MOTTLED_BAMBOO.get(),
                        new ProbabilityFeatureConfiguration(0.0F))));
        register(context, BLACK_BAMBOO_KEY,Feature.RANDOM_PATCH, new RandomPatchConfiguration(100, 9, 4,
                PlacementUtils.onlyWhenEmpty(ModFeatures.BLACK_BAMBOO.get(),
                        new ProbabilityFeatureConfiguration(0.0F))));
        register(context, BLACK_BAMBOO_GALLERY_KEY,Feature.RANDOM_PATCH, new RandomPatchConfiguration(5, 6, 3,
                PlacementUtils.onlyWhenEmpty(ModFeatures.BLACK_BAMBOO.get(),
                        new ProbabilityFeatureConfiguration(0.0F))));

        SimpleWeightedRandomList.Builder<BlockState> lotusBuilder = SimpleWeightedRandomList.builder();
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            lotusBuilder.add(ModBlocks.LOTUS_LEAF.get().defaultBlockState()
                    .setValue(WaterLotusLeafBlock.FACING, direction).setValue(WaterLotusBlock.AGE, 3),20);
        }
        for (int age = 0; age <= 3; age++) {
            int weight = (age <= 1) ? 1 : 2;
            lotusBuilder.add(ModBlocks.LOTUS.get().defaultBlockState().setValue(WaterLotusBlock.AGE, age), weight*2);
            lotusBuilder.add(ModBlocks.WHITE_LOTUS.get().defaultBlockState().setValue(WaterLotusBlock.AGE, age), weight);
        }
        register(context, LOTUS_KEY, Feature.FLOWER, new RandomPatchConfiguration(256, 14, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(lotusBuilder.build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.WATER),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), Blocks.DIRT, Blocks.SAND, Blocks.CLAY, Blocks.MUD)))));

        register(context, CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 5)
                                        .add(ModBlocks.PINK_CHINESE_ROSE.get().defaultBlockState(), 3)
                                        .add(ModBlocks.YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, ROSE_BUSH, Feature.FLOWER, new RandomPatchConfiguration(18, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.ROSE_BUSH)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, CHINESE_ROSE_WOODS_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 5)
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PINK_CHINESE_ROSE.get().defaultBlockState(), 3)
                                        .add(ModBlocks.YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, FOUNTAIN_GRASS_WOODS, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.FOUNTAIN_GRASS.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, LILY_OF_THE_VALLEY_WOODS, Feature.FLOWER, new RandomPatchConfiguration(24, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, FOUNTAIN_GRASS, Feature.FLOWER, new RandomPatchConfiguration(36, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_FOUNTAIN_GRASS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, CHINESE_ROSE_PLAIN, Feature.FLOWER, new RandomPatchConfiguration(16, 10, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, MISCANTHUS, Feature.FLOWER, new RandomPatchConfiguration(64, 5, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MISCANTHUS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, AUTUMN_CYMBIDIUM_PLAIN, Feature.FLOWER, new RandomPatchConfiguration(12, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.AUTUMN_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, FLOWERS_PLAIN, Feature.FLOWER, new RandomPatchConfiguration(8, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.DANDELION.defaultBlockState(), 1)
                                        .add(Blocks.ALLIUM.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        register(context, GOLDEN_MISCANTHUS, Feature.FLOWER, new RandomPatchConfiguration(72, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLDEN_MISCANTHUS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

        RandomizedIntStateProvider randomizedintstateprovider = new RandomizedIntStateProvider(
                BlockStateProvider.simple(ModBlocks.CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                WisteriaBlock.AGE, UniformInt.of(23, 25)
        );
        register(context, WISTERIA, Feature.BLOCK_COLUMN, new BlockColumnConfiguration(
                List.of(BlockColumnConfiguration.layer(ConstantInt.of(1),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHINESE_WISTERIA_PLANT.get().defaultBlockState().setValue(WisteriaPlantBlock.TOP, true))).toPlace()),
                        BlockColumnConfiguration.layer(
                                new WeightedListInt(
                                        SimpleWeightedRandomList.<IntProvider>builder()
                                                .add(UniformInt.of(0, 18), 2)
                                                .add(UniformInt.of(0, 12), 3)
                                                .add(UniformInt.of(0, 6), 10).build()),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHINESE_WISTERIA_PLANT.get())).toPlace()),
                        BlockColumnConfiguration.layer(ConstantInt.of(1), randomizedintstateprovider)), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true));
        RandomizedIntStateProvider randomizedintstateprovider2 = new RandomizedIntStateProvider(
                BlockStateProvider.simple(ModBlocks.WHITE_CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                WisteriaBlock.AGE, UniformInt.of(23, 25)
        );
        register(context, WHITE_WISTERIA, Feature.BLOCK_COLUMN, new BlockColumnConfiguration(
                List.of(BlockColumnConfiguration.layer(ConstantInt.of(1),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CHINESE_WISTERIA_PLANT.get().defaultBlockState().setValue(WisteriaPlantBlock.TOP, true))).toPlace()),
                        BlockColumnConfiguration.layer(
                                new WeightedListInt(
                                        SimpleWeightedRandomList.<IntProvider>builder()
                                                .add(UniformInt.of(0, 18), 2)
                                                .add(UniformInt.of(0, 12), 3)
                                                .add(UniformInt.of(0, 6), 10).build()),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CHINESE_WISTERIA_PLANT.get())).toPlace()),
                        BlockColumnConfiguration.layer(ConstantInt.of(1), randomizedintstateprovider2)), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true));
        RandomizedIntStateProvider randomizedintstateprovider3 = new RandomizedIntStateProvider(
                BlockStateProvider.simple(ModBlocks.BLUE_CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                WisteriaBlock.AGE, UniformInt.of(23, 25)
        );
        register(context, BLUE_WISTERIA, Feature.BLOCK_COLUMN, new BlockColumnConfiguration(
                List.of(BlockColumnConfiguration.layer(ConstantInt.of(1),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get().defaultBlockState().setValue(WisteriaPlantBlock.TOP, true))).toPlace()),
                        BlockColumnConfiguration.layer(
                                new WeightedListInt(
                                        SimpleWeightedRandomList.<IntProvider>builder()
                                                .add(UniformInt.of(0, 18), 2)
                                                .add(UniformInt.of(0, 12), 3)
                                                .add(UniformInt.of(0, 6), 10).build()),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUE_CHINESE_WISTERIA_PLANT.get())).toPlace()),
                        BlockColumnConfiguration.layer(ConstantInt.of(1), randomizedintstateprovider3)), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true));
        RandomizedIntStateProvider randomizedintstateprovider4 = new RandomizedIntStateProvider(
                BlockStateProvider.simple(ModBlocks.RED_CHINESE_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                WisteriaBlock.AGE, UniformInt.of(23, 25)
        );
        register(context, RED_WISTERIA, Feature.BLOCK_COLUMN, new BlockColumnConfiguration(
                List.of(BlockColumnConfiguration.layer(ConstantInt.of(1),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_CHINESE_WISTERIA_PLANT.get().defaultBlockState().setValue(WisteriaPlantBlock.TOP, true))).toPlace()),
                        BlockColumnConfiguration.layer(
                                new WeightedListInt(
                                        SimpleWeightedRandomList.<IntProvider>builder()
                                                .add(UniformInt.of(0, 18), 2)
                                                .add(UniformInt.of(0, 12), 3)
                                                .add(UniformInt.of(0, 6), 10).build()),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_CHINESE_WISTERIA_PLANT.get())).toPlace()),
                        BlockColumnConfiguration.layer(ConstantInt.of(1), randomizedintstateprovider4)), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true));
        RandomizedIntStateProvider randomizedintstateprovider5 = new RandomizedIntStateProvider(
                BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA.get().defaultBlockState().setValue(WisteriaBlock.TOP, false)),
                WisteriaBlock.AGE, UniformInt.of(23, 25)
        );
        register(context, NANJING_WISTERIA, Feature.BLOCK_COLUMN, new BlockColumnConfiguration(
                List.of(BlockColumnConfiguration.layer(ConstantInt.of(1),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA_PLANT.get().defaultBlockState().setValue(WisteriaPlantBlock.TOP, true))).toPlace()),
                        BlockColumnConfiguration.layer(
                                new WeightedListInt(
                                        SimpleWeightedRandomList.<IntProvider>builder()
                                                .add(UniformInt.of(0, 18), 2)
                                                .add(UniformInt.of(0, 12), 3)
                                                .add(UniformInt.of(0, 6), 10).build()),
                                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.NANJING_WISTERIA_PLANT.get())).toPlace()),
                        BlockColumnConfiguration.layer(ConstantInt.of(1), randomizedintstateprovider5)), Direction.DOWN, BlockPredicate.ONLY_IN_AIR_PREDICATE, true));
        register(context, CRAPE_MYRTLE_CAVES, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                new WeightedStateProvider(
                        SimpleWeightedRandomList.<BlockState>builder()
                                .add(ModBlocks.CRAPE_MYRTLE.get().defaultBlockState(), 10)
                                .add(ModBlocks.CRAPE_MYRTLE_SAPLING.get().defaultBlockState(), 50)
                                .add(Blocks.MOSS_CARPET.defaultBlockState(), 20)
                                .add(Blocks.GRASS.defaultBlockState(), 10)
                                .add(Blocks.TALL_GRASS.defaultBlockState(), 4)
                                .add(ModBlocks.ZIYING_BEADLIGHT.get().defaultBlockState(), 1))));
        register(context, MOSS_PATCH_1, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(
                BlockTags.MOSS_REPLACEABLE, BlockStateProvider.simple(Blocks.MOSS_BLOCK),
                PlacementUtils.inlinePlaced(holdergetter.getOrThrow(CRAPE_MYRTLE_CAVES)),
                CaveSurface.FLOOR,
                ConstantInt.of(1), 0.0F, 5, 0.8F,
                UniformInt.of(4, 7), 0.3F));
        register(context, RED_CRAPE_MYRTLE_CAVES, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                new WeightedStateProvider(
                        SimpleWeightedRandomList.<BlockState>builder()
                                .add(ModBlocks.RED_CRAPE_MYRTLE.get().defaultBlockState(), 10)
                                .add(ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get().defaultBlockState(), 50)
                                .add(Blocks.MOSS_CARPET.defaultBlockState(), 20)
                                .add(Blocks.GRASS.defaultBlockState(), 10)
                                .add(Blocks.TALL_GRASS.defaultBlockState(), 4)
                                .add(ModBlocks.ZIYING_BEADLIGHT.get().defaultBlockState(), 1))));
        register(context, MOSS_PATCH_2, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(
                BlockTags.MOSS_REPLACEABLE, BlockStateProvider.simple(Blocks.MOSS_BLOCK),
                PlacementUtils.inlinePlaced(holdergetter.getOrThrow(RED_CRAPE_MYRTLE_CAVES)),
                CaveSurface.FLOOR,
                ConstantInt.of(1), 0.0F, 5, 0.8F,
                UniformInt.of(4, 7), 0.3F));
        register(context, PINK_CRAPE_MYRTLE_CAVES, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                new WeightedStateProvider(
                        SimpleWeightedRandomList.<BlockState>builder()
                                .add(ModBlocks.PINK_CRAPE_MYRTLE.get().defaultBlockState(), 10)
                                .add(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get().defaultBlockState(), 50)
                                .add(Blocks.MOSS_CARPET.defaultBlockState(), 20)
                                .add(Blocks.GRASS.defaultBlockState(), 10)
                                .add(Blocks.TALL_GRASS.defaultBlockState(), 4)
                                .add(ModBlocks.ZIYING_BEADLIGHT.get().defaultBlockState(), 1))));
        register(context, MOSS_PATCH_3, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(
                BlockTags.MOSS_REPLACEABLE, BlockStateProvider.simple(Blocks.MOSS_BLOCK),
                PlacementUtils.inlinePlaced(holdergetter.getOrThrow(PINK_CRAPE_MYRTLE_CAVES)),
                CaveSurface.FLOOR,
                ConstantInt.of(1), 0.0F, 5, 0.8F,
                UniformInt.of(4, 7), 0.3F));
        register(context, WHITE_CRAPE_MYRTLE_CAVES, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                new WeightedStateProvider(
                        SimpleWeightedRandomList.<BlockState>builder()
                                .add(ModBlocks.WHITE_CRAPE_MYRTLE.get().defaultBlockState(), 10)
                                .add(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get().defaultBlockState(), 50)
                                .add(Blocks.MOSS_CARPET.defaultBlockState(), 20)
                                .add(Blocks.GRASS.defaultBlockState(), 10)
                                .add(Blocks.TALL_GRASS.defaultBlockState(), 4)
                                .add(ModBlocks.ZIYING_BEADLIGHT.get().defaultBlockState(), 1))));
        register(context, MOSS_PATCH_4, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(
                BlockTags.MOSS_REPLACEABLE, BlockStateProvider.simple(Blocks.MOSS_BLOCK),
                PlacementUtils.inlinePlaced(holdergetter.getOrThrow(WHITE_CRAPE_MYRTLE_CAVES)),
                CaveSurface.FLOOR,
                ConstantInt.of(1), 0.0F, 5, 0.8F,
                UniformInt.of(4, 7), 0.3F));
        register(context, WHITE_CRAPE_MYRTLE_CAVES_2, Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(
                new WeightedStateProvider(
                        SimpleWeightedRandomList.<BlockState>builder()
                                .add(ModBlocks.WHITE_CRAPE_MYRTLE.get().defaultBlockState(), 10)
                                .add(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get().defaultBlockState(), 50)
                                .add(Blocks.MOSS_CARPET.defaultBlockState(), 20)
                                .add(Blocks.GRASS.defaultBlockState(), 10)
                                .add(Blocks.TALL_GRASS.defaultBlockState(), 4)
                                .add(ModBlocks.SUYU_BEADLIGHT.get().defaultBlockState(), 1))));
        register(context, MOSS_PATCH_5, Feature.VEGETATION_PATCH, new VegetationPatchConfiguration(
                BlockTags.MOSS_REPLACEABLE, BlockStateProvider.simple(Blocks.MOSS_BLOCK),
                PlacementUtils.inlinePlaced(holdergetter.getOrThrow(WHITE_CRAPE_MYRTLE_CAVES_2)),
                CaveSurface.FLOOR,
                ConstantInt.of(1), 0.0F, 5, 0.8F,
                UniformInt.of(4, 7), 0.3F));

        register(context, GRASS_GROVE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(30, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.GRASS)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_WOODS, Feature.RANDOM_PATCH, new RandomPatchConfiguration(40, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.GRASS.defaultBlockState(), 7)
                                        .add(Blocks.TALL_GRASS.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FOREST_1, Feature.RANDOM_PATCH, new RandomPatchConfiguration(30, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.GRASS.defaultBlockState(), 9)
                                        .add(Blocks.FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FOREST_2, Feature.RANDOM_PATCH, new RandomPatchConfiguration(30, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.GRASS.defaultBlockState(), 7)
                                        .add(Blocks.FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FERN, Feature.RANDOM_PATCH, new RandomPatchConfiguration(16, 4, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.GRASS.defaultBlockState(), 5)
                                        .add(Blocks.TALL_GRASS.defaultBlockState(), 1)
                                        .add(Blocks.FERN.defaultBlockState(), 2)
                                        .add(Blocks.LARGE_FERN.defaultBlockState(), 2).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FERN_1, Feature.RANDOM_PATCH, new RandomPatchConfiguration(32, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.GRASS.defaultBlockState(), 4)
                                        .add(Blocks.FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FERN_2, Feature.RANDOM_PATCH, new RandomPatchConfiguration(40, 5, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.GRASS.defaultBlockState(), 6)
                                        .add(Blocks.TALL_GRASS.defaultBlockState(), 1)
                                        .add(Blocks.FERN.defaultBlockState(), 2)
                                        .add(Blocks.LARGE_FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.MUD)))));
        register(context, GRASS_0, Feature.RANDOM_PATCH, new RandomPatchConfiguration(46, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.GRASS)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, DEAD_BUSH, Feature.RANDOM_PATCH, new RandomPatchConfiguration(4, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.DEAD_BUSH)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.SAND)))));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MoreOrnPlants.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
