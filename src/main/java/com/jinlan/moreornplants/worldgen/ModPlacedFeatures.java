package com.jinlan.moreornplants.worldgen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> ANCIENT_RED_MEI_PLACED = registerKey("ancient_red_mei_placed");
    public static final ResourceKey<PlacedFeature> RED_MEI_PLACED = registerKey("red_mei_placed");
    public static final ResourceKey<PlacedFeature> RED_MEI_RED_PLACED = registerKey("red_mei_red_placed");
    public static final ResourceKey<PlacedFeature> WHITE_MEI_PLACED = registerKey("white_mei_placed");
    public static final ResourceKey<PlacedFeature> PINK_MEI_PLACED = registerKey("pink_mei_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_MEI_PLACED = registerKey("golden_mei_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_MEI_GOLD_PLACED = registerKey("golden_mei_gold_placed");
    public static final ResourceKey<PlacedFeature> DOUBLE_PINK_MEI_PLACED = registerKey("double_pink_mei_placed");
    public static final ResourceKey<PlacedFeature> FLAVESCENS_MEI_PLACED = registerKey("flavescens_mei_placed");
    public static final ResourceKey<PlacedFeature> GREEN_CALYX_MEI_PLACED = registerKey("green_calyx_mei_placed");
    public static final ResourceKey<PlacedFeature> PINK_WEEPING_MEI_PLACED = registerKey("pink_weeping_mei_placed");
    public static final ResourceKey<PlacedFeature> GREEN_WEEPING_MEI_RED_PLACED = registerKey("green_weeping_mei_red_placed");
    public static final ResourceKey<PlacedFeature> VERSICOLOR_WEEPING_MEI_PLACED = registerKey("versicolor_weeping_mei_placed");
    public static final ResourceKey<PlacedFeature> DOUBLE_WHITE_MEI_SNOW = registerKey("double_white_mei_snow");
    public static final ResourceKey<PlacedFeature> WHITE_MEI_SNOW = registerKey("white_mei_snow");
    public static final ResourceKey<PlacedFeature> WHITE_WEEPING_MEI_SNOW = registerKey("white_weeping_mei_snow");
    public static final ResourceKey<PlacedFeature> GREEN_WEEPING_MEI_SNOW = registerKey("green_weeping_mei_snow");
    public static final ResourceKey<PlacedFeature> SNOW_RED_MEI_PLACED = registerKey("snow_red_mei_placed");
    public static final ResourceKey<PlacedFeature> SNOW_WHITE_MEI_PLACED = registerKey("snow_white_mei_placed");
    public static final ResourceKey<PlacedFeature> SNOW_PINK_MEI_PLACED = registerKey("snow_pink_mei_placed");
    public static final ResourceKey<PlacedFeature> SNOW_DOUBLE_PINK_MEI_PLACED = registerKey("snow_double_pink_mei_placed");
    public static final ResourceKey<PlacedFeature> SNOW_DOUBLE_WHITE_MEI_PLACED = registerKey("snow_double_white_mei_placed");
    public static final ResourceKey<PlacedFeature> SNOW_GREEN_CALYX_MEI_PLACED = registerKey("snow_green_calyx_mei_placed");
    public static final ResourceKey<PlacedFeature> SNOW_FLAVESCENS_MEI_PLACED = registerKey("snow_flavescens_mei_placed");
    public static final ResourceKey<PlacedFeature> SNOW_VERSICOLOR_MEI_PLACED = registerKey("snow_versicolor_mei_placed");
    public static final ResourceKey<PlacedFeature> UPRIGHT_CRABAPPLE_PLACED = registerKey("upright_crabapple_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_CRABAPPLE_PLACED = registerKey("golden_crabapple_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_CRABAPPLE_FIELDS = registerKey("golden_crabapple_fields");
    public static final ResourceKey<PlacedFeature> GOLDEN_CRABAPPLE_GOLD_PLACED = registerKey("golden_crabapple_gold_placed");
    public static final ResourceKey<PlacedFeature> WEEPING_CRABAPPLE_PLACED = registerKey("weeping_crabapple_placed");
    public static final ResourceKey<PlacedFeature> UPRIGHT_CRABAPPLE_GROVE = registerKey("upright_crabapple_grove");
    public static final ResourceKey<PlacedFeature> WEEPING_CRABAPPLE_GROVE = registerKey("weeping_crabapple_grove");
    public static final ResourceKey<PlacedFeature> WEEPING_CRABAPPLE_FIELDS = registerKey("weeping_crabapple_fields");
    public static final ResourceKey<PlacedFeature> UPRIGHT_CRABAPPLE_PENGLAI = registerKey("upright_crabapple_penglai");
    public static final ResourceKey<PlacedFeature> WEEPING_CRABAPPLE_PENGLAI = registerKey("weeping_crabapple_penglai");
    public static final ResourceKey<PlacedFeature> PINK_APRICOT_PLACED = registerKey("pink_apricot_placed");
    public static final ResourceKey<PlacedFeature> PINK_APRICOT_FIELDS = registerKey("pink_apricot_fields");
    public static final ResourceKey<PlacedFeature> WHITE_APRICOT_PLACED = registerKey("white_apricot_placed");
    public static final ResourceKey<PlacedFeature> CLOUD_APRICOT_PLACED = registerKey("cloud_apricot_placed");
    public static final ResourceKey<PlacedFeature> PINK_APRICOT_PLATEAU_1 = registerKey("pink_apricot_plateau_1");
    public static final ResourceKey<PlacedFeature> WHITE_APRICOT_PLATEAU_1 = registerKey("white_apricot_plateau_1");
    public static final ResourceKey<PlacedFeature> PINK_APRICOT_PLATEAU_2 = registerKey("pink_apricot_plateau_2");
    public static final ResourceKey<PlacedFeature> WHITE_APRICOT_PLATEAU_2 = registerKey("white_apricot_plateau_2");
    public static final ResourceKey<PlacedFeature> ORNAMENTAL_PEACH_PLACED = registerKey("ornamental_peach_placed");
    public static final ResourceKey<PlacedFeature> ORNAMENTAL_PEACH_RED_PLACED = registerKey("ornamental_peach_red_placed");
    public static final ResourceKey<PlacedFeature> ORNAMENTAL_PEACH_GROVE_PLACED = registerKey("ornamental_peach_grove_placed");
    public static final ResourceKey<PlacedFeature> ORNAMENTAL_PEACH_FIELDS = registerKey("ornamental_peach_fields");
    public static final ResourceKey<PlacedFeature> WILD_PEACH_PLACED = registerKey("wild_peach_placed");
    public static final ResourceKey<PlacedFeature> WHITE_PEACH_PLACED = registerKey("white_peach_placed");
    public static final ResourceKey<PlacedFeature> IMMORTAL_PEACH_PLACED = registerKey("immortal_peach_placed");
    public static final ResourceKey<PlacedFeature> PEAR_PLACED = registerKey("pear_placed");
    public static final ResourceKey<PlacedFeature> PEAR_FIELDS = registerKey("pear_fields");
    public static final ResourceKey<PlacedFeature> PEAR_WOODS = registerKey("pear_woods");
    public static final ResourceKey<PlacedFeature> FLOWERING_PURPLE_LEAF_PLUM_PLACED = registerKey("flowering_purple_leaf_plum_placed");
    public static final ResourceKey<PlacedFeature> FLOWERING_PURPLE_LEAF_PLUM_FIELDS = registerKey("flowering_purple_leaf_plum_fields");
    public static final ResourceKey<PlacedFeature> PURPLE_LEAF_PLUM_PLACED = registerKey("purple_leaf_plum_placed");
    public static final ResourceKey<PlacedFeature> FLOWERING_PURPLE_LEAF_PLUM_CLOUD_PLACED = registerKey("flowering_purple_leaf_plum_cloud_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_LEAF_PLUM_CLOUD_PLACED = registerKey("purple_leaf_plum_cloud_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_OSMANTHUS_PLACED = registerKey("golden_osmanthus_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_OSMANTHUS_PLACED = registerKey("orange_osmanthus_placed");
    public static final ResourceKey<PlacedFeature> ORANGE_OSMANTHUS_FIELDS = registerKey("orange_osmanthus_fields");
    public static final ResourceKey<PlacedFeature> WHITE_OSMANTHUS_PLACED = registerKey("white_osmanthus_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_GINKGO_PLACED = registerKey("golden_ginkgo_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_GINKGO_FOREST = registerKey("golden_ginkgo_forest");
    public static final ResourceKey<PlacedFeature> GREEN_GINKGO_PLACED = registerKey("green_ginkgo_placed");
    public static final ResourceKey<PlacedFeature> ANCIENT_GREEN_GINKGO_LONGEVITY = registerKey("ancient_green_ginkgo_longevity");
    public static final ResourceKey<PlacedFeature> YELLOW_CHINESE_PARASOL_PLACED = registerKey("yellow_chinese_parasol_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_CHINESE_PARASOL_PLACED2 = registerKey("yellow_chinese_parasol_placed2");
    public static final ResourceKey<PlacedFeature> GREEN_CHINESE_PARASOL_PLACED = registerKey("green_chinese_parasol_placed");
    public static final ResourceKey<PlacedFeature> GREEN_CHINESE_PARASOL_PLACED2 = registerKey("green_chinese_parasol_placed2");
    public static final ResourceKey<PlacedFeature> SWEETGUM_PLACED = registerKey("sweetgum_placed");
    public static final ResourceKey<PlacedFeature> SWEETGUM_ROSE_PLACED = registerKey("sweetgum_rose_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_PLACED = registerKey("camphor_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_PEACH_PLACED = registerKey("camphor_peach_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_YUNMENG_PLACED = registerKey("camphor_yunmeng_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_VALLEY_PLACED = registerKey("camphor_valley_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_PLAIN_PLACED = registerKey("camphor_plain_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_WOODS_PLACED = registerKey("camphor_woods_placed");
    public static final ResourceKey<PlacedFeature> CAMPHOR_ROSE_PLACED = registerKey("camphor_rose_placed");
    public static final ResourceKey<PlacedFeature> SMALL_CAMPHOR_WOODS_PLACED = registerKey("small_camphor_woods_placed");
    public static final ResourceKey<PlacedFeature> ANCIENT_CAMPHOR_PLACED = registerKey("ancient_camphor_placed");
    public static final ResourceKey<PlacedFeature> ANCIENT_CAMPHOR_PEACH_PLACED = registerKey("ancient_camphor_peach_placed");
    public static final ResourceKey<PlacedFeature> ANCIENT_CAMPHOR_LONGEVITY = registerKey("ancient_camphor_longevity");
    public static final ResourceKey<PlacedFeature> DOVE_TREE_PLACED = registerKey("dove_tree_placed");
    public static final ResourceKey<PlacedFeature> DOVE_TREE_TIANFU = registerKey("dove_tree_tianfu");
    public static final ResourceKey<PlacedFeature> CHINABERRY_PLACED = registerKey("chinaberry_placed");
    public static final ResourceKey<PlacedFeature> CHINABERRY_FIELDS = registerKey("chinaberry_fields");
    public static final ResourceKey<PlacedFeature> CHINABERRY_SMALL_PLACED = registerKey("chinaberry_small_placed");
    public static final ResourceKey<PlacedFeature> CHINABERRY_WOODS_PLACED = registerKey("chinaberry_woods_placed");
    public static final ResourceKey<PlacedFeature> CHINABERRY_PLAIN_PLACED = registerKey("chinaberry_plain_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_0_PLACED = registerKey("desert_poplar_0_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_1_PLACED = registerKey("desert_poplar_1_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_2_PLACED = registerKey("desert_poplar_2_placed");
    public static final ResourceKey<PlacedFeature> DESERT_POPLAR_3_PLACED = registerKey("desert_poplar_3_placed");
    public static final ResourceKey<PlacedFeature> TAIWAN_CHERRY_PLACED =registerKey("taiwan_cherry_placed");
    public static final ResourceKey<PlacedFeature> TAIWAN_CHERRY_FIELDS =registerKey("taiwan_cherry_fields");
    public static final ResourceKey<PlacedFeature> MEGA_PINE_LONGEVITY = registerKey("mega_pine_longevity");
    //flower
    public static final ResourceKey<PlacedFeature> CYMBIDIUM_PLACED = registerKey("cymbidium_placed");
    public static final ResourceKey<PlacedFeature> CYMBIDIUM_RIVER_PLACED = registerKey("cymbidium_river_placed");
    public static final ResourceKey<PlacedFeature> SUMMER_CYMBIDIUM_YUNMENG_PLACED = registerKey("summer_cymbidium_yunmeng_placed");
    public static final ResourceKey<PlacedFeature> SPRING_CYMBIDIUM_FOREST_PLACED = registerKey("spring_cymbidium_forest_placed");
    public static final ResourceKey<PlacedFeature> SUMMER_CYMBIDIUM_FOREST_PLACED = registerKey("summer_cymbidium_forest_placed");
    public static final ResourceKey<PlacedFeature> AUTUMN_CYMBIDIUM_PlAIN_PLACED = registerKey("autumn_cymbidium_plain_placed");
    public static final ResourceKey<PlacedFeature> WINTER_CYMBIDIUM_FOREST_PLACED = registerKey("winter_cymbidium_forest_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_FOREST_PLACED = registerKey("chrysanthemum_forest_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_LONGEVITY_PLACED = registerKey("chrysanthemum_longevity_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_GALLERY_PLACED = registerKey("chrysanthemum_gallery_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_PLACED = registerKey("chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_LAND = registerKey("chrysanthemum_land");
    public static final ResourceKey<PlacedFeature> XIHU_LIUYUE_PLACED = registerKey("xihu_liuyue_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CHRYSANTHEMUM_PLACED = registerKey("white_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CHRYSANTHEMUM_LAND = registerKey("white_chrysanthemum_land");
    public static final ResourceKey<PlacedFeature> BLACK_CHRYSANTHEMUM_PLACED = registerKey("black_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_CHRYSANTHEMUM_PLACED = registerKey("purple_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_CHRYSANTHEMUM_WOODS = registerKey("purple_chrysanthemum_woods");
    public static final ResourceKey<PlacedFeature> PURPLE_CHRYSANTHEMUM_LAND = registerKey("purple_chrysanthemum_land");
    public static final ResourceKey<PlacedFeature> PINK_CHRYSANTHEMUM_PLACED = registerKey("pink_chrysanthemum_placed");
    public static final ResourceKey<PlacedFeature> PINK_CHRYSANTHEMUM_LAND = registerKey("pink_chrysanthemum_land");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_GROVE_PLACED = registerKey("chrysanthemum_grove_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_DONGLI_PLACED = registerKey("chrysanthemum_dongli_placed");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_DONGLI_PLACED_2 = registerKey("chrysanthemum_dongli_placed_2");
    public static final ResourceKey<PlacedFeature> CHRYSANTHEMUM_DONGLI_PLACED_3 = registerKey("chrysanthemum_dongli_placed_3");
    public static final ResourceKey<PlacedFeature> CHINESE_ROSE_PLACED = registerKey("chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> PINK_CHINESE_ROSE_PLACED = registerKey("pink_chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_CHINESE_ROSE_PLACED = registerKey("purple_chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_CHINESE_ROSE_PLACED = registerKey("yellow_chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CHINESE_ROSE_PLACED = registerKey("white_chinese_rose_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_ROSE_WOODS_PLACED = registerKey("chinese_rose_woods_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_ROSE_PENGLAI_PLACED = registerKey("chinese_rose_penglai_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_ROSE_GROVE_PLACED = registerKey("chinese_rose_grove_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_ROSE_PLAIN_PLACED = registerKey("chinese_rose_plain_placed");
    public static final ResourceKey<PlacedFeature> AZALEA_TREE_PLACED = registerKey("azalea_tree_placed");
    public static final ResourceKey<PlacedFeature> RED_AZALEA_TREE_PLACED = registerKey("red_azalea_tree_placed");
    public static final ResourceKey<PlacedFeature> MAYING_RHODODENDRON_TREE_PLACED = registerKey("maying_rhododendron_tree_placed");
    public static final ResourceKey<PlacedFeature> DEWDROP_RHODODENDRON_TREE_PLACED = registerKey("dewdrop_rhododendron_tree_placed");
    public static final ResourceKey<PlacedFeature> CHARMING_RHODODENDRON_TREE_PLACED = registerKey("charming_rhododendron_tree_placed");
    public static final ResourceKey<PlacedFeature> GREAT_WHITE_RHODODENDRON_TREE_PLACED = registerKey("great_white_rhododendron_tree_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_RHODODENDRON_TREE_PLACED = registerKey("purple_rhododendron_tree_placed");
    public static final ResourceKey<PlacedFeature> PINK_RHODODENDRON_TREE_PLACED = registerKey("pink_rhododendron_tree_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_AZALEA_TREE_PLACED = registerKey("chinese_azalea_tree_placed");
    public static final ResourceKey<PlacedFeature> RED_AZALEA_PLACED = registerKey("red_azalea_placed");
    public static final ResourceKey<PlacedFeature> MAYING_RHODODENDRON_PLACED = registerKey("maying_rhododendron_placed");
    public static final ResourceKey<PlacedFeature> DEWDROP_RHODODENDRON_PLACED = registerKey("dewdrop_rhododendron_placed");
    public static final ResourceKey<PlacedFeature> CHARMING_RHODODENDRON_PLACED = registerKey("charming_rhododendron_placed");
    public static final ResourceKey<PlacedFeature> GREAT_WHITE_RHODODENDRON_PLACED = registerKey("great_white_rhododendron_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_RHODODENDRON_PLACED = registerKey("purple_rhododendron_placed");
    public static final ResourceKey<PlacedFeature> PINK_RHODODENDRON_PLACED = registerKey("pink_rhododendron_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_AZALEA_PLACED = registerKey("chinese_azalea_placed");
    public static final ResourceKey<PlacedFeature> AZALEA_PLACED = registerKey("azalea_placed");
    public static final ResourceKey<PlacedFeature> RED_AZALEA_RED_PLACED = registerKey("red_azalea_red_placed");
    public static final ResourceKey<PlacedFeature> MAYING_RHODODENDRON_RED_PLACED = registerKey("maying_rhododendron_red_placed");
    public static final ResourceKey<PlacedFeature> AZALEA_GROVE_PLACED = registerKey("azalea_grove_placed");
    public static final ResourceKey<PlacedFeature> AZALEA_GALLERY = registerKey("azalea_gallery");
    public static final ResourceKey<PlacedFeature> CAMELLIA_TREE_PLACED = registerKey("camellia_tree_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CAMELLIA_TREE_PLACED = registerKey("white_camellia_tree_placed");
    public static final ResourceKey<PlacedFeature> PINK_CAMELLIA_TREE_PLACED = registerKey("pink_camellia_tree_placed");
    public static final ResourceKey<PlacedFeature> RED_CAMELLIA_PLACED = registerKey("red_camellia_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CAMELLIA_PLACED = registerKey("white_camellia_placed");
    public static final ResourceKey<PlacedFeature> PINK_CAMELLIA_PLACED = registerKey("pink_camellia_placed");
    public static final ResourceKey<PlacedFeature> TALL_RED_CAMELLIA_PLACED = registerKey("tall_red_camellia_placed");
    public static final ResourceKey<PlacedFeature> TALL_WHITE_CAMELLIA_PLACED = registerKey("tall_white_camellia_placed");
    public static final ResourceKey<PlacedFeature> TALL_PINK_CAMELLIA_PLACED = registerKey("tall_pink_camellia_placed");
    public static final ResourceKey<PlacedFeature> CAMELLIA_GROVE_PLACED = registerKey("camellia_grove_placed");
    public static final ResourceKey<PlacedFeature> PINK_CAMELLIA_GROVE_PLACED = registerKey("pink_camellia_grove_placed");
    public static final ResourceKey<PlacedFeature> WHITE_CAMELLIA_GROVE_PLACED = registerKey("white_camellia_grove_placed");
    public static final ResourceKey<PlacedFeature> PINK_CAMELLIA_GALLERY = registerKey("pink_camellia_gallery");
    public static final ResourceKey<PlacedFeature> CRAPE_MYRTLE_PLACED = registerKey("crape_myrtle_placed");
    public static final ResourceKey<PlacedFeature> SMALL_CRAPE_MYRTLE_GARDEN = registerKey("small_crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> SMALL_RED_CRAPE_MYRTLE_GARDEN = registerKey("small_red_crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> SMALL_PINK_CRAPE_MYRTLE_GARDEN = registerKey("small_pink_crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> SMALL_WHITE_CRAPE_MYRTLE_GARDEN = registerKey("small_white_crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> CRAPE_MYRTLE_GARDEN = registerKey("crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> RED_CRAPE_MYRTLE_GARDEN = registerKey("red_crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> PINK_CRAPE_MYRTLE_GARDEN = registerKey("pink_crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> WHITE_CRAPE_MYRTLE_GARDEN = registerKey("white_crape_myrtle_garden");
    public static final ResourceKey<PlacedFeature> CRAPE_MYRTLE_TREE_GARDEN = registerKey("crape_myrtle_tree_garden");
    public static final ResourceKey<PlacedFeature> RED_CRAPE_MYRTLE_TREE_GARDEN = registerKey("red_crape_myrtle_tree_garden");
    public static final ResourceKey<PlacedFeature> PINK_CRAPE_MYRTLE_TREE_GARDEN = registerKey("pink_crape_myrtle_tree_garden");
    public static final ResourceKey<PlacedFeature> WHITE_CRAPE_MYRTLE_TREE_GARDEN = registerKey("white_crape_myrtle_tree_garden");
    public static final ResourceKey<PlacedFeature> CRAPE_MYRTLE_CAVES = registerKey("crape_myrtle_caves");
    public static final ResourceKey<PlacedFeature> RED_CRAPE_MYRTLE_CAVES = registerKey("red_crape_myrtle_caves");
    public static final ResourceKey<PlacedFeature> PINK_CRAPE_MYRTLE_CAVES = registerKey("pink_crape_myrtle_caves");
    public static final ResourceKey<PlacedFeature> WHITE_CRAPE_MYRTLE_CAVES = registerKey("white_crape_myrtle_caves");
    public static final ResourceKey<PlacedFeature> WHITE_CRAPE_MYRTLE_CAVES_2 = registerKey("white_crape_myrtle_caves_2");
    public static final ResourceKey<PlacedFeature> COTTON_ROSE_PLACED = registerKey("cotton_rose_placed");
    public static final ResourceKey<PlacedFeature> COTTON_ROSE_GROVE_PLACED = registerKey("cotton_rose_grove_placed");
    public static final ResourceKey<PlacedFeature> COTTON_ROSE_FOREST_PLACED = registerKey("cotton_rose_forest_placed");
    public static final ResourceKey<PlacedFeature> COTTON_ROSE_TIANFU_PLACED = registerKey("cotton_rose_tianfu_placed");
    public static final ResourceKey<PlacedFeature> WINTERSWEET_PLACED = registerKey("wintersweet_placed");
    public static final ResourceKey<PlacedFeature> WINTERSWEET_GROVE = registerKey("wintersweet_grove");
    public static final ResourceKey<PlacedFeature> WINTERSWEET_COLD = registerKey("wintersweet_cold");
    public static final ResourceKey<PlacedFeature> FLOWER_SNOW_SPRING_PLACED = registerKey("flower_snow_spring_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_NARCISSUS_GROVE_PLACED = registerKey("chinese_narcissus_grove_placed");
    public static final ResourceKey<PlacedFeature> CHINESE_NARCISSUS_WOODS_PLACED = registerKey("chinese_narcissus_woods_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_CHINESE_NARCISSUS_LAND = registerKey("golden_chinese_narcissus_land");
    public static final ResourceKey<PlacedFeature> LILY_OF_THE_VALLEY_FOREST_PLACED = registerKey("lily_of_the_valley_forest_placed");
    public static final ResourceKey<PlacedFeature> LILY_OF_THE_VALLEY_WOODS_PLACED = registerKey("lily_of_the_valley_woods_placed");
    public static final ResourceKey<PlacedFeature> ORCHID_FOREST_PLACED = registerKey("orchid_placed");
    public static final ResourceKey<PlacedFeature> WHITE_MOTH_ORCHID_WOODS_PLACED = registerKey("white_moth_orchid_woods_placed");
    public static final ResourceKey<PlacedFeature> WHITE_MOTH_ORCHID_LAND_PLACED = registerKey("white_moth_orchid_land_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_MOTH_ORCHID_LAND_PLACED = registerKey("golden_moth_orchid_land_placed");
    public static final ResourceKey<PlacedFeature> MOTH_ORCHID_GROVE_PLACED = registerKey("moth_orchid_grove_placed");
    public static final ResourceKey<PlacedFeature> PINK_MOTH_ORCHID_LAND_PLACED = registerKey("pink_moth_orchid_land_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_MOTH_ORCHID_CLOUD_PLACED = registerKey("purple_moth_orchid_cloud_placed");
    public static final ResourceKey<PlacedFeature> PURPLE_MOTH_ORCHID_LAND_PLACED = registerKey("purple_moth_orchid_land_placed");
    public static final ResourceKey<PlacedFeature> MOTH_ORCHID_TEM_MILE_PLACED = registerKey("moth_orchid_ten_mile_placed");
    public static final ResourceKey<PlacedFeature> PEONY_GROVE_PLACED = registerKey("peony_grove_placed");
    public static final ResourceKey<PlacedFeature> LIGHT_PEONY_GROVE_PLACED = registerKey("light_peony_grove_placed");
    public static final ResourceKey<PlacedFeature> INK_PEONY_GROVE_PLACED = registerKey("ink_peony_grove_placed");
    public static final ResourceKey<PlacedFeature> PEONY_PINK_GROVE = registerKey("peony_pink_grove");
    public static final ResourceKey<PlacedFeature> PEONY_PENGLAI_PLACED = registerKey("peony_penglai_placed");
    public static final ResourceKey<PlacedFeature> PEONY_TREE_PENGLAI_PLACED = registerKey("peony_tree_penglai_placed");
    public static final ResourceKey<PlacedFeature> PEONY_TREE_GROVE_PLACED = registerKey("peony_tree_grove_placed");
    public static final ResourceKey<PlacedFeature> PEONY_TREE_PINK_GROVE = registerKey("peony_tree_pink_grove");
    public static final ResourceKey<PlacedFeature> PEONY_SEA = registerKey("peony_sea");
    public static final ResourceKey<PlacedFeature> PEONY_SEA_YELLOW = registerKey("peony_sea_yellow");
    public static final ResourceKey<PlacedFeature> PEONY_SEA_PURPLE = registerKey("peony_sea_purple");
    public static final ResourceKey<PlacedFeature> PEONY_SEA_PINK = registerKey("peony_sea_pink");
    public static final ResourceKey<PlacedFeature> PEONY_SEA_GREEN = registerKey("peony_sea_green");
    public static final ResourceKey<PlacedFeature> PEONY_SEA_RED = registerKey("peony_sea_red");
    public static final ResourceKey<PlacedFeature> PEONY_SEA_PLACED = registerKey("peony_sea_placed");
    public static final ResourceKey<PlacedFeature> PEONY_MEADOWS = registerKey("peony_meadows_placed");
    public static final ResourceKey<PlacedFeature> PEONY_PLACED = registerKey("peony_placed");
    public static final ResourceKey<PlacedFeature> PEONY_PINK_PLACED = registerKey("peony_pink_placed");
    public static final ResourceKey<PlacedFeature> PEONY_LIGHT_PINK_PLACED = registerKey("peony_light_pink_placed");
    public static final ResourceKey<PlacedFeature> PEONY_RED_PLACED = registerKey("peony_red_placed");
    public static final ResourceKey<PlacedFeature> PEONY_YELLOW_PLACED = registerKey("peony_yellow_placed");
    public static final ResourceKey<PlacedFeature> PEONY_PURPLE_PLACED = registerKey("peony_purple_placed");
    public static final ResourceKey<PlacedFeature> PEONY_WHITE_PLACED = registerKey("peony_white_placed");
    public static final ResourceKey<PlacedFeature> PEONY_BLUE_PLACED = registerKey("peony_blue_placed");
    public static final ResourceKey<PlacedFeature> PEONY_GREEN_PLACED = registerKey("peony_green_placed");
    public static final ResourceKey<PlacedFeature> MOTTLED_BAMBOO_PLACED = registerKey("mottled_bamboo_placed");
    public static final ResourceKey<PlacedFeature> BLACK_BAMBOO_PLACED = registerKey("black_bamboo_placed");
    public static final ResourceKey<PlacedFeature> BLACK_BAMBOO_GALLERY_PLACED = registerKey("black_bamboo_gallery_placed");
    public static final ResourceKey<PlacedFeature> BLACK_BAMBOO_SAPLING_PLACED = registerKey("black_bamboo_sapling_placed");
    public static final ResourceKey<PlacedFeature> BAMBOO_PLACED = registerKey("bamboo_placed");
    public static final ResourceKey<PlacedFeature> LOTUS_PLACED = registerKey("lotus_placed");
    public static final ResourceKey<PlacedFeature> LOTUS_RIVER_PLACED = registerKey("lotus_river_placed");
    public static final ResourceKey<PlacedFeature> HOLLYHOCK_GROVE_PLACED = registerKey("hollyhock_grove_placed");
    public static final ResourceKey<PlacedFeature> HOLLYHOCK_TIANFU_PLACED = registerKey("hollyhock_tianfu_placed");
    public static final ResourceKey<PlacedFeature> HARDY_BANANA_PLACED = registerKey("hardy_banana_placed");
    public static final ResourceKey<PlacedFeature> MUXUE_GRASS_PLACED = registerKey("muxue_grass_placed");
    public static final ResourceKey<PlacedFeature> WISTERIA_TREE_PLACED = registerKey("wisteria_tree_placed");
    public static final ResourceKey<PlacedFeature> WISTERIA_TREE_FIELDS = registerKey("wisteria_tree_fields");
    public static final ResourceKey<PlacedFeature> WISTERIA_1 = registerKey("wisteria_1");
    public static final ResourceKey<PlacedFeature> WISTERIA_2 = registerKey("wisteria_2");
    public static final ResourceKey<PlacedFeature> WISTERIA_3 = registerKey("wisteria_3");
    public static final ResourceKey<PlacedFeature> WISTERIA_4 = registerKey("wisteria_4");
    public static final ResourceKey<PlacedFeature> WISTERIA_5 = registerKey("wisteria_5");
    public static final ResourceKey<PlacedFeature> WHITE_WISTERIA_1 = registerKey("white_wisteria_1");
    public static final ResourceKey<PlacedFeature> WHITE_WISTERIA_2 = registerKey("white_wisteria_2");
    public static final ResourceKey<PlacedFeature> WHITE_WISTERIA_3 = registerKey("white_wisteria_3");
    public static final ResourceKey<PlacedFeature> BRANCHY_TAMARISK_PLACED = registerKey("branchy_tamarisk_placed");
    public static final ResourceKey<PlacedFeature> BRANCHY_TAMARISK_PLACED_2 = registerKey("branchy_tamarisk_placed_2");
    public static final ResourceKey<PlacedFeature> BRANCHY_TAMARISK_PLACED_3 = registerKey("branchy_tamarisk_placed_3");
    public static final ResourceKey<PlacedFeature> BRANCHY_TAMARISK_GROVE_PLACED = registerKey("branchy_tamarisk_grove_placed");
    public static final ResourceKey<PlacedFeature> BRANCHY_TAMARISK_LAND_PLACED = registerKey("branchy_tamarisk_land_placed");
    public static final ResourceKey<PlacedFeature> GOLDEN_BRANCHY_TAMARISK_PLACED = registerKey("golden_branchy_tamarisk_placed");
    public static final ResourceKey<PlacedFeature> WOOD_SORREL_PATCH_PLACED = registerKey("wood_sorrel_patch_placed");
    public static final ResourceKey<PlacedFeature> PINK_WOOD_SORREL_PATCH_PLACED = registerKey("pink_wood_sorrel_patch_placed");
    public static final ResourceKey<PlacedFeature> YELLOW_WOOD_SORREL_PATCH_PLACED = registerKey("yellow_wood_sorrel_patch_placed");
    public static final ResourceKey<PlacedFeature> WHITE_WOOD_SORREL_PATCH_PLACED = registerKey("white_wood_sorrel_patch_placed");
    public static final ResourceKey<PlacedFeature> PEACH_PINK_PETALS_PATCH_PLACED = registerKey("peach_pink_petals_patch_placed");
    public static final ResourceKey<PlacedFeature> PEACH_PINK_PETALS_GROVE_PLACED = registerKey("peach_pink_petals_grove_placed");
    public static final ResourceKey<PlacedFeature> SMALL_FLOWERS_PEACH_PLACED = registerKey("small_flowers_peach_placed");
    public static final ResourceKey<PlacedFeature> TALL_FLOWERS_PEACH_PLACED = registerKey("tall_flowers_peach_placed");
    public static final ResourceKey<PlacedFeature> FRAGRANT_SNOW_PETALS_PATCH_PLACED = registerKey("fragrant_snow_petals_patch_placed");
    public static final ResourceKey<PlacedFeature> FRAGRANT_SNOW_PETALS_GROVE_PLACED = registerKey("fragrant_snow_grove_patch_placed");
    public static final ResourceKey<PlacedFeature> SPRING_PETALS_PATCH_PLACED = registerKey("spring_petals_patch_placed");
    public static final ResourceKey<PlacedFeature> SPRING_PETALS_GROVE_PLACED = registerKey("spring_petals_grove_placed");
    public static final ResourceKey<PlacedFeature> PINK_PETALS_GROVE_PLACED = registerKey("pink_petals_grove_placed");
    public static final ResourceKey<PlacedFeature> SMALL_FLOWERS_GROVE_PLACED = registerKey("small_flowers_grove_placed");
    public static final ResourceKey<PlacedFeature> SMALL_BLUE_FLOWERS_GROVE_PLACED = registerKey("small_blue_flowers_grove_placed");
    public static final ResourceKey<PlacedFeature> SMALL_WHITE_FLOWERS_GROVE_PLACED = registerKey("small_white_flowers_grove_placed");
    public static final ResourceKey<PlacedFeature> TULIP_GROVE_PLACED = registerKey("tulip_grove_placed");
    public static final ResourceKey<PlacedFeature> TALL_FLOWERS_GROVE_PLACED = registerKey("tall_flowers_grove_placed");
    public static final ResourceKey<PlacedFeature> TALL_FLOWERS_GROVE_2_PLACED = registerKey("tall_flowers_grove_2_placed");
    public static final ResourceKey<PlacedFeature> DANDELION_LAND = registerKey("dandelion_land");
    public static final ResourceKey<PlacedFeature> ALLIUM_LAND = registerKey("allium_land");
    public static final ResourceKey<PlacedFeature> WHITE_TULIP_LAND = registerKey("white_tulip_land");
    public static final ResourceKey<PlacedFeature> ROSE_BUSH = registerKey("rose_bush");
    public static final ResourceKey<PlacedFeature> FLOWERS_PLAIN = registerKey("flowers_plain");
    //grass
    public static final ResourceKey<PlacedFeature> FOUNTAIN_GRASS_PLACED = registerKey("fountain_grass_placed");
    public static final ResourceKey<PlacedFeature> FOUNTAIN_GRASS_GROVE = registerKey("fountain_grass_grove");
    public static final ResourceKey<PlacedFeature> FOUNTAIN_GRASS_WOODS = registerKey("fountain_grass_woods");
    public static final ResourceKey<PlacedFeature> PINK_FOUNTAIN_GRASS_LAND = registerKey("pink_fountain_grass_land");
    public static final ResourceKey<PlacedFeature> PURPLE_FOUNTAIN_GRASS_LAND = registerKey("purple_fountain_grass_land");
    public static final ResourceKey<PlacedFeature> WHITE_FOUNTAIN_GRASS_LAND = registerKey("white_fountain_grass_land");
    public static final ResourceKey<PlacedFeature> MISCANTHUS = registerKey("miscanthus");
    public static final ResourceKey<PlacedFeature> GOLDEN_MISCANTHUS = registerKey("golden_miscanthus");
    public static final ResourceKey<PlacedFeature> GOLDEN_MISCANTHUS_FOREST = registerKey("golden_miscanthus_forest");
    public static final ResourceKey<PlacedFeature> GRASS_VALLY = registerKey("grass_vally");
    public static final ResourceKey<PlacedFeature> GRASS_PLAIN = registerKey("grass_plain");
    public static final ResourceKey<PlacedFeature> GRASS_HIGHLAND = registerKey("grass_highland");
    public static final ResourceKey<PlacedFeature> GRASS_GROVE = registerKey("grass_grove");
    public static final ResourceKey<PlacedFeature> GRASS_WOODS = registerKey("grass_woods");
    public static final ResourceKey<PlacedFeature> GRASS_FOREST_1 = registerKey("grass_forest_1");
    public static final ResourceKey<PlacedFeature> GRASS_FOREST_2 = registerKey("grass_forest_2");
    public static final ResourceKey<PlacedFeature> GRASS_FOREST_3 = registerKey("grass_forest_3");
    public static final ResourceKey<PlacedFeature> GRASS_FERN = registerKey("grass_fern");
    public static final ResourceKey<PlacedFeature> GRASS_FERN_1 = registerKey("grass_fern_1");
    public static final ResourceKey<PlacedFeature> GRASS_FERN_2 = registerKey("grass_fern_2");
    public static final ResourceKey<PlacedFeature> GRASS_FERN_3 = registerKey("grass_fern_3");
    public static final ResourceKey<PlacedFeature> GRASS_FURONG = registerKey("grass_furong");
    public static final ResourceKey<PlacedFeature> GRASS_DESERT = registerKey("grass_desert");
    public static final ResourceKey<PlacedFeature> TALL_GRASS = registerKey("tall_grass");
    public static final ResourceKey<PlacedFeature> DEAD_BUSH = registerKey("dead_bush");
    public static final ResourceKey<PlacedFeature> PEACH_PETALS = registerKey("peach_petals");
    public static final ResourceKey<PlacedFeature> PEACH_PETALS_RIVER = registerKey("peach_petals_river");
    public static final ResourceKey<PlacedFeature> LEAF_RIVER_0 = registerKey("leaf_river_0");
    public static final ResourceKey<PlacedFeature> LEAF_RIVER_1 = registerKey("leaf_river_1");
    public static final ResourceKey<PlacedFeature> LEAF_RIVER_2 = registerKey("leaf_river_2");
    public static final ResourceKey<PlacedFeature> WATERLILY_RIVER = registerKey("waterlily_river");
    public static final ResourceKey<PlacedFeature> STONE_PLACED = registerKey("stone_placed");

    public static final ResourceKey<PlacedFeature> PINK_APRICOT = registerKey("pink_apricot");
    public static final ResourceKey<PlacedFeature> WHITE_APRICOT = registerKey("white_apricot");

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

        register(context, WINTERSWEET_COLD, configuredFeatures.getOrThrow(ModConfiguredFeatures.WINTERSWEET),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, STONE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.STONE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, WHITE_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        ModBlocks.WHITE_MEI_SAPLING.get()));
        register(context, PINK_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        ModBlocks.PINK_MEI_SAPLING.get()));
        register(context, CYMBIDIUM_RIVER_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYMBIDIUM_RIVER),
                List.of(CountPlacement.of(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEACH_PETALS_RIVER, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEACH_PETALS_RIVER),
                List.of(CountPlacement.of(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, MUXUE_GRASS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MUXUE_GRASS_KEY),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_TOP_SOLID, BiomeFilter.biome()));

        register(context, DOUBLE_PINK_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOUBLE_PINK_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1F, 1),
                        ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()));
        register(context, CAMPHOR_YUNMENG_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2F, 2),
                        ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()));
        register(context, SUMMER_CYMBIDIUM_YUNMENG_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUMMER_CYMBIDIUM_YUNMENG),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, GREEN_CALYX_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_CALYX_MEI_WITH_SNOW),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        ModBlocks.GREEN_CALYX_MEI_SAPLING.get()));
        register(context, FLAVESCENS_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLAVESCENS_MEI_WITH_SNOW),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1F, 1),
                        ModBlocks.FLAVESCENS_MEI_SAPLING.get()));

        register(context, PINK_WEEPING_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_WEEPING_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2F, 1),
                        ModBlocks.PINK_WEEPING_MEI_SAPLING.get()));
        register(context, GREEN_WEEPING_MEI_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_WEEPING_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.GREEN_WEEPING_MEI_SAPLING.get()));
        register(context, VERSICOLOR_WEEPING_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.VERSICOLOR_WEEPING_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get()));
        register(context, UPRIGHT_CRABAPPLE_PENGLAI, configuredFeatures.getOrThrow(ModConfiguredFeatures.UPRIGHT_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1),
                        ModBlocks.GREEN_WEEPING_MEI_SAPLING.get()));
        register(context, WEEPING_CRABAPPLE_PENGLAI, configuredFeatures.getOrThrow(ModConfiguredFeatures.WEEPING_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1),
                        ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get()));
        register(context, CLOUD_APRICOT_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CLOUD_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.CLOUD_APRICOT_SAPLING.get()));
        register(context, IMMORTAL_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.IMMORTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.IMMORTAL_PEACH_SAPLING.get()));
        register(context, PEONY_TREE_PENGLAI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_TREE_PENGLAI),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_PENGLAI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_PENGLAI),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHINESE_ROSE_PENGLAI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_ROSE_PENGLAI),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, DOUBLE_WHITE_MEI_SNOW, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOUBLE_WHITE_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get()));
        register(context, WHITE_MEI_SNOW, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.GREEN_CALYX_MEI_SAPLING.get()));
        register(context, WHITE_WEEPING_MEI_SNOW, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_WEEPING_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.WHITE_WEEPING_MEI_SAPLING.get()));
        register(context, GREEN_WEEPING_MEI_SNOW, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_WEEPING_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.GREEN_WEEPING_MEI_SAPLING.get()));
        register(context, FRAGRANT_SNOW_PETALS_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FRAGRANT_SNOW_PETALS_PATCH),
                List.of(NoiseThresholdCountPlacement.of(-0.8, 6, 10),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, SNOW_RED_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.RED_MEI_SAPLING.get()));
        register(context, SNOW_WHITE_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1),
                        ModBlocks.WHITE_MEI_SAPLING.get()));
        register(context, SNOW_PINK_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1),
                        ModBlocks.PINK_MEI_SAPLING.get()));
        register(context, SNOW_DOUBLE_PINK_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOUBLE_PINK_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1),
                        ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()));
        register(context, SNOW_DOUBLE_WHITE_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOUBLE_WHITE_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05f, 1),
                        ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get()));
        register(context, SNOW_GREEN_CALYX_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_CALYX_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.GREEN_CALYX_MEI_SAPLING.get()));
        register(context, SNOW_FLAVESCENS_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLAVESCENS_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.FLAVESCENS_MEI_SAPLING.get()));
        register(context, SNOW_VERSICOLOR_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.VERSICOLOR_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.VERSICOLOR_MEI_SAPLING.get()));
        register(context, GOLDEN_MEI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.GOLDEN_MEI_SAPLING.get()));
        register(context, FLOWER_SNOW_SPRING_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWER_SNOW_SPRING),
                List.of(CountPlacement.of(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, GOLDEN_CRABAPPLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.GOLDEN_CRABAPPLE_SAPLING.get()));
        register(context, WEEPING_CRABAPPLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WEEPING_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.WEEPING_CRABAPPLE_SAPLING.get()));
        register(context, PINK_APRICOT_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.PINK_APRICOT_SAPLING.get()));
        register(context, ORNAMENTAL_PEACH_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));
        register(context, PEAR_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEAR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.PEAR_SAPLING.get()));
        register(context, FLOWERING_PURPLE_LEAF_PLUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERING_PURPLE_LEAF_PLUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0 ,0.5F, 1),
                        ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()));
        register(context, ORANGE_OSMANTHUS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_OSMANTHUS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.ORANGE_OSMANTHUS_SAPLING.get()));
        register(context, CHINABERRY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINABERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.CHINABERRY_SAPLING.get()));
        register(context, WISTERIA_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WISTERIA_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        ModBlocks.CRAPE_MYRTLE_SAPLING.get()));
        register(context, TAIWAN_CHERRY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TAIWAN_CHERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 1),
                        Blocks.CHERRY_SAPLING));
        register(context, CHRYSANTHEMUM_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CYMBIDIUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CYMBIDIUM),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, LIGHT_PEONY_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LIGHT_PEONY_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, INK_PEONY_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.INK_PEONY_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_TREE_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_TREE_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHINESE_ROSE_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_ROSE_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, AZALEA_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.AZALEA_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHINESE_NARCISSUS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_NARCISSUS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CAMELLIA_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMELLIA_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CAMELLIA_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CAMELLIA_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CAMELLIA_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CAMELLIA_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CRAPE_MYRTLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAPE_MYRTLE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, COTTON_ROSE_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_ROSE_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WINTERSWEET_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.WINTERSWEET),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, HOLLYHOCK_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.HOLLYHOCK_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, MOTH_ORCHID_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOTH_ORCHID_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, FOUNTAIN_GRASS_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.FOUNTAIN_GRASS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BRANCHY_TAMARISK_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRANCHY_TAMARISK_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WOOD_SORREL_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WOOD_SORREL_PATCH),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEACH_PINK_PETALS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEACH_PINK_PETALS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, FRAGRANT_SNOW_PETALS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FRAGRANT_SNOW_PETALS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SPRING_PETALS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SPRING_PETALS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_PETALS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_PETALS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_FLOWERS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_FLOWERS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_BLUE_FLOWERS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_BLUE_FLOWERS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_WHITE_FLOWERS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_WHITE_FLOWERS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TULIP_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TULIP_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_FLOWERS_GROVE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_FLOWERS_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_FLOWERS_GROVE_2_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_FLOWERS_GROVE_2),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GOLDEN_CRABAPPLE_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.01f, 1),
                        ModBlocks.GOLDEN_CRABAPPLE_SAPLING.get()));
        register(context, WEEPING_CRABAPPLE_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.WEEPING_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.WEEPING_CRABAPPLE_SAPLING.get()));
        register(context, PINK_APRICOT_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.PINK_APRICOT_SAPLING.get()));
        register(context, ORNAMENTAL_PEACH_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));
        register(context, PEAR_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEAR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.PEAR_SAPLING.get()));
        register(context, FLOWERING_PURPLE_LEAF_PLUM_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERING_PURPLE_LEAF_PLUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0 ,0.025F, 1),
                        ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()));
        register(context, ORANGE_OSMANTHUS_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORANGE_OSMANTHUS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.ORANGE_OSMANTHUS_SAPLING.get()));
        register(context, CHINABERRY_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINABERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.CHINABERRY_SAPLING.get()));
        register(context, WISTERIA_TREE_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.WISTERIA_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.CRAPE_MYRTLE_SAPLING.get()));
        register(context, TAIWAN_CHERRY_FIELDS, configuredFeatures.getOrThrow(ModConfiguredFeatures.TAIWAN_CHERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.025f, 1),
                        ModBlocks.TAIWAN_CHERRY_SAPLING.get()));

        register(context, UPRIGHT_CRABAPPLE_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.UPRIGHT_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.05f, 1),
                        ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get()));
        register(context, WEEPING_CRABAPPLE_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.WEEPING_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.05f, 1),
                        ModBlocks.WEEPING_CRABAPPLE_SAPLING.get()));
        register(context, PEONY_PINK_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_PINK_GROVE),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_TREE_PINK_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZHAO_PINK_PEONY_GROVE),
                List.of(CountPlacement.of(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, ORNAMENTAL_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));
        register(context, WILD_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WILD_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.2f, 1),
                        ModBlocks.WILD_PEACH_SAPLING.get()));
        register(context, WHITE_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.WHITE_PEACH_SAPLING.get()));
        register(context, CAMPHOR_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, ANCIENT_CAMPHOR_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, PEACH_PINK_PETALS_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEACH_PINK_PETALS_PATCH),
                List.of(NoiseThresholdCountPlacement.of(-0.8, 4, 8),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_FLOWERS_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_FLOWERS_PEACH),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_FLOWERS_PEACH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_FLOWERS_PEACH),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEACH_PETALS, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEACH_PETALS),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, GOLDEN_GINKGO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_GINKGO_WITH_LEAF_PILE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        ModBlocks.GOLDEN_GINKGO_SAPLING.get()));
        register(context, YELLOW_CHINESE_PARASOL_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_CHINESE_PARASOL_WITH_LEAF_PILE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get()));
        register(context, SWEETGUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SWEETGUM_WITH_LEAF_PILE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1f, 1),
                        ModBlocks.SWEETGUM_SAPLING.get()));
        register(context, GOLDEN_OSMANTHUS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_OSMANTHUS),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get()));
        register(context, PURPLE_LEAF_PLUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_LEAF_PLUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2 ,0.1F, 1),
                        ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get()));
        register(context, CHRYSANTHEMUM_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(6),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, XIHU_LIUYUE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.XIHU_LIUYUE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CHRYSANTHEMUM_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BLACK_CHRYSANTHEMUM_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_CHRYSANTHEMUM_KEY),
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
        register(context, LEAF_RIVER_0, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAF_RIVER_0),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 1, 2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, LEAF_RIVER_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAF_RIVER_1),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, LEAF_RIVER_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAF_RIVER_2),
                List.of(NoiseThresholdCountPlacement.of(0.1D, 2, 1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, LOTUS_RIVER_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LOTUS_RIVER),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WATERLILY_RIVER, configuredFeatures.getOrThrow(ModConfiguredFeatures.WATERLILY_RIVER),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, YELLOW_CHINESE_PARASOL_PLACED2, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_CHINESE_PARASOL_WITH_LEAF_PILE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.2f, 1),
                        ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get()));
        register(context, GREEN_CHINESE_PARASOL_PLACED2, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREEN_CHINESE_PARASOL),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get()));

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
        register(context, SPRING_CYMBIDIUM_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SPRING_CYMBIDIUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SUMMER_CYMBIDIUM_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUMMER_CYMBIDIUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WINTER_CYMBIDIUM_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WINTER_CYMBIDIUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, HARDY_BANANA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.HARDY_BANANA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, LILY_OF_THE_VALLEY_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LILY_OF_THE_VALLEY_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, ORCHID_FOREST_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORCHID_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CHRYSANTHEMUM_LONGEVITY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, ANCIENT_CAMPHOR_LONGEVITY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.05F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, ANCIENT_GREEN_GINKGO_LONGEVITY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ANCIENT_GREEN_GINKGO),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, MEGA_PINE_LONGEVITY, configuredFeatures.getOrThrow(TreeFeatures.MEGA_PINE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.05F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));

        register(context, RED_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_CAMELLIA_KEY),
                List.of(CountPlacement.of(9),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CAMELLIA_KEY),
                List.of(CountPlacement.of(9),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CAMELLIA_KEY),
                List.of(CountPlacement.of(9),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_RED_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_RED_CAMELLIA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_WHITE_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_WHITE_CAMELLIA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_PINK_CAMELLIA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_PINK_CAMELLIA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CAMELLIA_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMELLIA_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.CAMELLIA.get()));
        register(context, WHITE_CAMELLIA_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CAMELLIA_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.WHITE_CAMELLIA.get()));
        register(context, PINK_CAMELLIA_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CAMELLIA_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.PINK_CAMELLIA.get()));
        register(context, WHITE_APRICOT_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.WHITE_APRICOT_SAPLING.get()));
        register(context, CAMPHOR_VALLEY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));

        register(context, RED_AZALEA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_AZALEA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, MAYING_RHODODENDRON_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAYING_RHODODENDRON_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, DEWDROP_RHODODENDRON_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEWDROP_RHODODENDRON_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHARMING_RHODODENDRON_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHARMING_RHODODENDRON_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GREAT_WHITE_RHODODENDRON_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREAT_WHITE_RHODODENDRON_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PURPLE_RHODODENDRON_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_RHODODENDRON_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_RHODODENDRON_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_RHODODENDRON_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHINESE_AZALEA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_AZALEA_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, AZALEA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.AZALEA_KEY),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, AZALEA_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERING_AZALEA_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        Blocks.AZALEA));
        register(context, RED_AZALEA_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_AZALEA_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.RED_AZALEA.get()));
        register(context, MAYING_RHODODENDRON_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAYING_RHODODENDRON_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.MAYING_RHODODENDRON.get()));
        register(context, DEWDROP_RHODODENDRON_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEWDROP_RHODODENDRON_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.DEWDROP_RHODODENDRON.get()));
        register(context, CHARMING_RHODODENDRON_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHARMING_RHODODENDRON_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.CHARMING_RHODODENDRON.get()));
        register(context, GREAT_WHITE_RHODODENDRON_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GREAT_WHITE_RHODODENDRON_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.GREAT_WHITE_RHODODENDRON.get()));
        register(context, PURPLE_RHODODENDRON_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_RHODODENDRON_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.PURPLE_RHODODENDRON.get()));
        register(context, PINK_RHODODENDRON_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_RHODODENDRON_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.PINK_RHODODENDRON.get()));
        register(context, CHINESE_AZALEA_TREE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_AZALEA_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.CHINESE_AZALEA.get()));

        register(context, RED_AZALEA_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_AZALEA_KEY),
                List.of(CountPlacement.of(8),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, MAYING_RHODODENDRON_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAYING_RHODODENDRON_KEY),
                List.of(CountPlacement.of(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RED_MEI_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.RED_MEI_SAPLING.get()));
        register(context, ORNAMENTAL_PEACH_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORNAMENTAL_PEACH),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.1f, 1),
                        ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));

        register(context, UPRIGHT_CRABAPPLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.UPRIGHT_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 1),
                        ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get()));
        register(context, PEONY_SEA, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_TREE_MEADOWS),
                List.of(RarityFilter.onAverageOnceEvery(6),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_SEA_YELLOW, configuredFeatures.getOrThrow(ModConfiguredFeatures.YAO_HUANG_PEONY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_SEA_PURPLE, configuredFeatures.getOrThrow(ModConfiguredFeatures.WEI_ZI_PEONY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_SEA_PINK, configuredFeatures.getOrThrow(ModConfiguredFeatures.ZHAO_PINK_PEONY_KEY),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_SEA_GREEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOU_GREEN_PEONY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_SEA_RED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LUOYANG_RED_PEONY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_SEA_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_KEY),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, PEONY_MEADOWS, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_TREE_MEADOWS),
                List.of(CountPlacement.of(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_KEY),
                List.of(RarityFilter.onAverageOnceEvery(6),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_PINK_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_PINK_KEY),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_LIGHT_PINK_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_LIGHT_PINK_KEY),
                List.of(CountPlacement.of(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_RED_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_RED_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_PURPLE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_PURPLE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_YELLOW_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_YELLOW_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_WHITE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_WHITE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_BLUE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_BLUE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PEONY_GREEN_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEONY_GREEN_KEY),
                List.of(RarityFilter.onAverageOnceEvery(3),
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
                List.of(CountPlacement.of(4),
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
        register(context, BRANCHY_TAMARISK_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRANCHY_TAMARISK_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BRANCHY_TAMARISK_PLACED_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRANCHY_TAMARISK_KEY),
                List.of(NoiseThresholdCountPlacement.of(0.1D, 3, 0),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BRANCHY_TAMARISK_PLACED_3, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRANCHY_TAMARISK_2),
                List.of(RarityFilter.onAverageOnceEvery(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, GOLDEN_MEI_GOLD_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_MEI),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 2),
                        ModBlocks.DESERT_POPLAR_SAPLING.get()));
        register(context, GOLDEN_CRABAPPLE_GOLD_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_CRABAPPLE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.5f, 2),
                        ModBlocks.DESERT_POPLAR_SAPLING.get()));
        register(context, GOLDEN_BRANCHY_TAMARISK_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_BRANCHY_TAMARISK_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_ROSE_KEY),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 0, 4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CHINESE_ROSE_KEY),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 0, 2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PURPLE_CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_CHINESE_ROSE_KEY),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 2, 0),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, YELLOW_CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_CHINESE_ROSE_KEY),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 2, 0),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CHINESE_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CHINESE_ROSE_KEY),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 2, 0),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, ROSE_BUSH, configuredFeatures.getOrThrow(ModConfiguredFeatures.ROSE_BUSH),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 1, 2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CHINESE_ROSE_WOODS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_ROSE_WOODS_KEY),
                List.of(NoiseThresholdCountPlacement.of(0.2D, 2, 4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SWEETGUM_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SWEETGUM_WITH_LEAF_PILE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.1f, 1),
                        ModBlocks.SWEETGUM_SAPLING.get()));
        register(context, CAMPHOR_ROSE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.NEW_CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(2, 0.1F, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));

        register(context, CRAPE_MYRTLE_TREE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAPE_MYRTLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.25f, 1),
                        ModBlocks.IMMORTAL_PEACH_SAPLING.get()));
        register(context, RED_CRAPE_MYRTLE_TREE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_CRAPE_MYRTLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.25f, 1),
                        ModBlocks.IMMORTAL_PEACH_SAPLING.get()));
        register(context, PINK_CRAPE_MYRTLE_TREE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CRAPE_MYRTLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.25f, 1),
                        ModBlocks.IMMORTAL_PEACH_SAPLING.get()));
        register(context, WHITE_CRAPE_MYRTLE_TREE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CRAPE_MYRTLE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.25f, 1),
                        ModBlocks.IMMORTAL_PEACH_SAPLING.get()));
        register(context, SMALL_CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_RED_CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_RED_CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_PINK_CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_PINK_CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, SMALL_WHITE_CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_WHITE_CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, RED_CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CRAPE_MYRTLE_GARDEN, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CRAPE_MYRTLE_GARDEN),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CHRYSANTHEMUM_DONGLI_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_DONGLI),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHRYSANTHEMUM_DONGLI_PLACED_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHRYSANTHEMUM_DONGLI_PLACED_3, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_FOREST),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CHINABERRY_WOODS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINABERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.2f, 1),
                        ModBlocks.CHINABERRY_SAPLING.get()));
        register(context, CHINABERRY_SMALL_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINABERRY_SMALL),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.2f, 1),
                        ModBlocks.CHINABERRY_SAPLING.get()));
        register(context, CAMPHOR_WOODS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, SMALL_CAMPHOR_WOODS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SMALL_CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 1),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, FOUNTAIN_GRASS_WOODS, configuredFeatures.getOrThrow(ModConfiguredFeatures.FOUNTAIN_GRASS_WOODS),
                List.of(CountPlacement.of(18),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, PEAR_WOODS, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEAR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(4, 0.1f, 1),
                        ModBlocks.PEAR_SAPLING.get()));
        register(context, LILY_OF_THE_VALLEY_WOODS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.LILY_OF_THE_VALLEY_WOODS),
                List.of(NoiseThresholdCountPlacement.of(-0.1D, 4, 0),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHINESE_NARCISSUS_WOODS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_NARCISSUS_WOODS),
                List.of(NoiseThresholdCountPlacement.of(0.1D, 0, 4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_MOTH_ORCHID_WOODS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_MOTH_ORCHID_WOODS),
                List.of(CountPlacement.of(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CAMPHOR_PLAIN_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMPHOR),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 5),
                        ModBlocks.CAMPHOR_SAPLING.get()));
        register(context, CHINABERRY_PLAIN_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINABERRY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 4),
                        ModBlocks.CHINABERRY_SAPLING.get()));
        register(context, FOUNTAIN_GRASS_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FOUNTAIN_GRASS),
                List.of(NoiseThresholdCountPlacement.of(0.6D, 1, 2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, CHINESE_ROSE_PLAIN_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHINESE_ROSE_PLAIN),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, AUTUMN_CYMBIDIUM_PlAIN_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.AUTUMN_CYMBIDIUM_PLAIN),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, MISCANTHUS, configuredFeatures.getOrThrow(ModConfiguredFeatures.MISCANTHUS),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, FLOWERS_PLAIN, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERS_PLAIN),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, COTTON_ROSE_TIANFU_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.COTTON_ROSE_TIANFU),
                List.of(NoiseThresholdCountPlacement.of(-0.4D, 0, 2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, HOLLYHOCK_TIANFU_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.HOLLYHOCK_TIANFU),
                List.of(NoiseThresholdCountPlacement.of(-0.4D, 3, 1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, DOVE_TREE_TIANFU, configuredFeatures.getOrThrow(ModConfiguredFeatures.DOVE_TREE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.05f, 5),
                        ModBlocks.DOVE_TREE_SAPLING.get()));
        register(context, BAMBOO_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BAMBOO_KEY),
                List.of(RarityFilter.onAverageOnceEvery(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, FLOWERING_PURPLE_LEAF_PLUM_CLOUD_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.FLOWERING_PURPLE_LEAF_PLUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(5 ,0.1F, 1),
                        ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()));
        register(context, PURPLE_LEAF_PLUM_CLOUD_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_LEAF_PLUM),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(5 ,0.1F, 1),
                        ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get()));
        register(context, PURPLE_CHRYSANTHEMUM_WOODS, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_CHRYSANTHEMUM_KEY),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PURPLE_MOTH_ORCHID_CLOUD_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_MOTH_ORCHID_CLOUD),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, BRANCHY_TAMARISK_LAND_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BRANCHY_TAMARISK_LAND),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_MOTH_ORCHID_LAND_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_MOTH_ORCHID_LAND),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CHRYSANTHEMUM_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_CHRYSANTHEMUM_LAND),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_FOUNTAIN_GRASS_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_FOUNTAIN_GRASS_LAND),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_WOOD_SORREL_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_WOOD_SORREL_PATCH),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CHRYSANTHEMUM_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_LAND),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GOLDEN_MOTH_ORCHID_LAND_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_MOTH_ORCHID_LAND),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GOLDEN_CHINESE_NARCISSUS_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_CHINESE_NARCISSUS_LAND),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, DANDELION_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.DANDELION),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, YELLOW_WOOD_SORREL_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.YELLOW_WOOD_SORREL_PATCH),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, WHITE_MOTH_ORCHID_LAND_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_MOTH_ORCHID_LAND),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_CHRYSANTHEMUM_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_CHRYSANTHEMUM_LAND),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_FOUNTAIN_GRASS_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_FOUNTAIN_GRASS_LAND),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_TULIP_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_TULIP),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, WHITE_WOOD_SORREL_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_WOOD_SORREL_PATCH),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, PURPLE_FOUNTAIN_GRASS_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_FOUNTAIN_GRASS_LAND),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PURPLE_MOTH_ORCHID_LAND_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_MOTH_ORCHID_LAND),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PURPLE_CHRYSANTHEMUM_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.PURPLE_CHRYSANTHEMUM_LAND),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, ALLIUM_LAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.ALLIUM),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, GOLDEN_MISCANTHUS, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_MISCANTHUS),
                List.of(CountPlacement.of(16),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, GOLDEN_GINKGO_FOREST, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_GINKGO_WITH_LEAF_PILE),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(12, 0.2f, 1),
                        ModBlocks.GOLDEN_GINKGO_SAPLING.get()));
        register(context, GOLDEN_MISCANTHUS_FOREST, configuredFeatures.getOrThrow(ModConfiguredFeatures.GOLDEN_MISCANTHUS),
                List.of(CountPlacement.of(4),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, PINK_APRICOT_PLATEAU_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.PINK_APRICOT_SAPLING.get()));
        register(context, WHITE_APRICOT_PLATEAU_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.1f, 1),
                        ModBlocks.WHITE_APRICOT_SAPLING.get()));
        register(context, PINK_APRICOT_PLATEAU_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 2),
                        ModBlocks.PINK_APRICOT_SAPLING.get()));
        register(context, WHITE_APRICOT_PLATEAU_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_APRICOT),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(0, 0.2f, 2),
                        ModBlocks.WHITE_APRICOT_SAPLING.get()));
        register(context, SPRING_PETALS_PATCH_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.SPRING_PETALS_PATCH),
                List.of(NoiseThresholdCountPlacement.of(-0.8, 6, 10),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, CHRYSANTHEMUM_GALLERY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHRYSANTHEMUM_FOREST),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, PINK_CAMELLIA_GALLERY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CAMELLIA_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, AZALEA_GALLERY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AZALEA_GROVE),
                List.of(RarityFilter.onAverageOnceEvery(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, MOTH_ORCHID_TEM_MILE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOTH_ORCHID_TEM_MILE),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BLACK_BAMBOO_GALLERY_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_BAMBOO_GALLERY_KEY),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, BLACK_BAMBOO_SAPLING_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLACK_BAMBOO_SAPLING_KEY),
                List.of(RarityFilter.onAverageOnceEvery(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, WISTERIA_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.WISTERIA),
                List.of(CountPlacement.of(256),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, WISTERIA_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.WISTERIA),
                List.of(CountPlacement.of(256),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, WISTERIA_3, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLUE_WISTERIA),
                List.of(CountPlacement.of(128),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, WISTERIA_4, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_WISTERIA),
                List.of(CountPlacement.of(128),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, WISTERIA_5, configuredFeatures.getOrThrow(ModConfiguredFeatures.NANJING_WISTERIA),
                List.of(CountPlacement.of(128),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, WHITE_WISTERIA_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_WISTERIA),
                List.of(CountPlacement.of(256),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, WHITE_WISTERIA_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_WISTERIA),
                List.of(CountPlacement.of(256),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, WHITE_WISTERIA_3, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_WISTERIA),
                List.of(CountPlacement.of(188),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.UP, BlockPredicate.hasSturdyFace(Direction.DOWN), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(-1)), BiomeFilter.biome()));
        register(context, CRAPE_MYRTLE_CAVES, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOSS_PATCH_1),
                List.of(CountPlacement.of(100),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
        register(context, RED_CRAPE_MYRTLE_CAVES, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOSS_PATCH_2),
                List.of(CountPlacement.of(10),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
        register(context, PINK_CRAPE_MYRTLE_CAVES, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOSS_PATCH_3),
                List.of(CountPlacement.of(10),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
        register(context, WHITE_CRAPE_MYRTLE_CAVES, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOSS_PATCH_4),
                List.of(CountPlacement.of(10),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));
        register(context, WHITE_CRAPE_MYRTLE_CAVES_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.MOSS_PATCH_5),
                List.of(CountPlacement.of(110),
                        InSquarePlacement.spread(), PlacementUtils.RANGE_BOTTOM_TO_MAX_TERRAIN_HEIGHT,
                        EnvironmentScanPlacement.scanningFor(Direction.DOWN, BlockPredicate.solid(), BlockPredicate.ONLY_IN_AIR_PREDICATE, 12),
                        RandomOffsetPlacement.vertical(ConstantInt.of(1)), BiomeFilter.biome()));

        register(context, GRASS_VALLY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_0),
                List.of(CountPlacement.of(18),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_PLAIN, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_0),
                List.of(NoiseThresholdCountPlacement.of(-0.8D, 18, 20),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_HIGHLAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_0),
                List.of(CountPlacement.of(14),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_GROVE, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_GROVE),
                List.of(CountPlacement.of(16),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_WOODS, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_WOODS),
                List.of(CountPlacement.of(24),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FOREST_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FOREST_1),
                List.of(CountPlacement.of(11),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FOREST_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FOREST_2),
                List.of(CountPlacement.of(15),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FOREST_3, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_0),
                List.of(NoiseThresholdCountPlacement.of(-0.8D, 6, 12),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FERN, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FERN),
                List.of(CountPlacement.of(5),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FERN_1, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FERN_1),
                List.of(CountPlacement.of(3),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FERN_3, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FERN_2),
                List.of(NoiseThresholdCountPlacement.of(-0.8D, 7, 12),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FURONG, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_0),
                List.of(CountPlacement.of(10),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_FERN_2, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_FERN_2),
                List.of(CountPlacement.of(20),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, GRASS_DESERT, configuredFeatures.getOrThrow(ModConfiguredFeatures.GRASS_0),
                List.of(CountPlacement.of(1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, TALL_GRASS, configuredFeatures.getOrThrow(ModConfiguredFeatures.TALL_GRASS),
                List.of(NoiseThresholdCountPlacement.of(-0.8D, 2, 1),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));
        register(context, DEAD_BUSH, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEAD_BUSH),
                List.of(CountPlacement.of(2),
                        InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome()));

        register(context, PINK_APRICOT, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINK_APRICOT),
                List.of(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(
                                ModBlocks.PINK_APRICOT_SAPLING.get().defaultBlockState(), BlockPos.ZERO))));
        register(context, WHITE_APRICOT, configuredFeatures.getOrThrow(ModConfiguredFeatures.WHITE_APRICOT),
                List.of(BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(
                                ModBlocks.WHITE_APRICOT_SAPLING.get().defaultBlockState(), BlockPos.ZERO))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(MoreOrnPlants.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
