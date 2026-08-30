package com.jinlan.moreornplants.worldgen.features;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.FlowerBlocks.LeafPileBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.ModFlowerPetalsBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusBlock;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.WisteriaBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.WisteriaPlantBlock;
import com.jinlan.moreornplants.init.ModBambooFeatures;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
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
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.RandomizedIntStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

import java.util.List;

public class ModVegetationFeatures {
    //flower
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_FOREST = registerKey("chrysanthemum_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_KEY = registerKey("chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_LAND = registerKey("chrysanthemum_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> XIHU_LIUYUE_KEY = registerKey("xihu_liuyue_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHRYSANTHEMUM_KEY = registerKey("white_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHRYSANTHEMUM_LAND = registerKey("white_chrysanthemum_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_CHRYSANTHEMUM_KEY = registerKey("black_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CHRYSANTHEMUM_KEY = registerKey("purple_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CHRYSANTHEMUM_LAND = registerKey("purple_chrysanthemum_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHRYSANTHEMUM_KEY = registerKey("pink_chrysanthemum_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHRYSANTHEMUM_LAND = registerKey("pink_chrysanthemum_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_GROVE = registerKey("chrysanthemum_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_DONGLI = registerKey("chrysanthemum_dongli");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHRYSANTHEMUM_DONGLI_2 = registerKey("chrysanthemum_dongli_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_ROSE_KEY = registerKey("chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CHINESE_ROSE_KEY = registerKey("pink_chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_CHINESE_ROSE_KEY = registerKey("purple_chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_CHINESE_ROSE_KEY = registerKey("yellow_chinese_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CHINESE_ROSE_KEY = registerKey("white_chinese_rose_key");
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
    public static final ResourceKey<ConfiguredFeature<?, ?>> LIGHT_PEONY_GROVE = registerKey("light_peony_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> INK_PEONY_GROVE = registerKey("ink_peony_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_PENGLAI = registerKey("peony_penglai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YAO_HUANG_PEONY_KEY = registerKey("yao_huang_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WEI_ZI_PEONY_KEY = registerKey("wei_zi_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZHAO_PINK_PEONY_KEY = registerKey("zhao_pink_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ZHAO_PINK_PEONY_GROVE = registerKey("zhao_pink_peony_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOU_GREEN_PEONY_KEY = registerKey("dou_green_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LUOYANG_RED_PEONY_KEY = registerKey("luoyang_red_peony_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_TREE_MEADOWS = registerKey("peony_tree_meadows");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_TREE_GROVE = registerKey("peony_tree_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEONY_TREE_PENGLAI = registerKey("peony_tree_penglai");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CAMELLIA_KEY = registerKey("red_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CAMELLIA_KEY = registerKey("white_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CAMELLIA_KEY = registerKey("pink_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_RED_CAMELLIA_KEY = registerKey("tall_red_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_WHITE_CAMELLIA_KEY = registerKey("tall_white_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_PINK_CAMELLIA_KEY = registerKey("tall_pink_camellia_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CAMELLIA_GROVE = registerKey("camellia_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CAMELLIA_GROVE = registerKey("pink_camellia_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CAMELLIA_GROVE = registerKey("white_camellia_grove");
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
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWER_SNOW_SPRING = registerKey("flower_snow_spring");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYMBIDIUM = registerKey("cymbidium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CYMBIDIUM_RIVER = registerKey("cymbidium_river");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUMMER_CYMBIDIUM_YUNMENG = registerKey("summer_cymbidium_yunmeng");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRING_CYMBIDIUM_FOREST = registerKey("spring_cymbidium_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUMMER_CYMBIDIUM_FOREST = registerKey("summer_cymbidium_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> AUTUMN_CYMBIDIUM_PLAIN = registerKey("autumn_cymbidium_plain");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WINTER_CYMBIDIUM_FOREST = registerKey("winter_cymbidium_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_NARCISSUS_GROVE = registerKey("chinese_narcissus_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHINESE_NARCISSUS_WOODS = registerKey("chinese_narcissus_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_CHINESE_NARCISSUS_LAND = registerKey("chinese_narcissus_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LILY_OF_THE_VALLEY_FOREST = registerKey("lily_of_the_valley_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LILY_OF_THE_VALLEY_WOODS = registerKey("lily_of_the_valley_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORCHID_FOREST = registerKey("orchid_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MOTH_ORCHID_WOODS = registerKey("white_moth_orchid_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MOTH_ORCHID_LAND = registerKey("white_moth_orchid_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_MOTH_ORCHID_VALLEY = registerKey("white_moth_orchid_valley");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_MOTH_ORCHID_LAND = registerKey("golden_moth_orchid_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOTH_ORCHID_GROVE = registerKey("moth_orchid_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_MOTH_ORCHID_LAND = registerKey("pink_moth_orchid_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_MOTH_ORCHID_CLOUD = registerKey("purple_moth_orchid_cloud");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_MOTH_ORCHID_LAND = registerKey("purple_moth_orchid_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_MOTH_ORCHID_VALLEY = registerKey("purple_moth_orchid_valley");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOTH_ORCHID_TEM_MILE = registerKey("moth_orchid_ten_mile");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAPE_MYRTLE_KEY = registerKey("crape_myrtle_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_CRAPE_MYRTLE_GARDEN = registerKey("small_crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_RED_CRAPE_MYRTLE_GARDEN = registerKey("small_red_crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_PINK_CRAPE_MYRTLE_GARDEN = registerKey("small_pink_crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_WHITE_CRAPE_MYRTLE_GARDEN = registerKey("small_white_crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAPE_MYRTLE_GARDEN = registerKey("crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CRAPE_MYRTLE_GARDEN = registerKey("red_crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CRAPE_MYRTLE_GARDEN = registerKey("pink_crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRAPE_MYRTLE_GARDEN = registerKey("white_crape_myrtle_garden");
    public static final ResourceKey<ConfiguredFeature<?, ?>> CRAPE_MYRTLE_CAVES = registerKey("crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_CRAPE_MYRTLE_CAVES = registerKey("red_crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_CRAPE_MYRTLE_CAVES = registerKey("pink_crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRAPE_MYRTLE_CAVES = registerKey("white_crape_myrtle_caves");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_CRAPE_MYRTLE_CAVES_2 = registerKey("white_crape_myrtle_caves_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTON_ROSE_KEY = registerKey("cotton_rose_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTON_ROSE_GROVE = registerKey("cotton_rose_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTON_ROSE_FOREST = registerKey("cotton_rose_forest");
    public static final ResourceKey<ConfiguredFeature<?, ?>> COTTON_ROSE_TIANFU = registerKey("cotton_rose_tianfu");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOTTLED_BAMBOO_KEY = registerKey("mottled_bamboo_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_BAMBOO_KEY = registerKey("black_bamboo_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_BAMBOO_GALLERY_KEY = registerKey("black_bamboo_gallery_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_BAMBOO_SAPLING_KEY = registerKey("black_bamboo_sapling_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BAMBOO_KEY = registerKey("bamboo_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOTUS_KEY = registerKey("lotus_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LOTUS_RIVER = registerKey("lotus_river");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLLYHOCK_GROVE = registerKey("hollyhock_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HOLLYHOCK_TIANFU = registerKey("hollyhock_tianfu");
    public static final ResourceKey<ConfiguredFeature<?, ?>> HARDY_BANANA_KEY = registerKey("hardy_banana_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRANCHY_TAMARISK_KEY = registerKey("branchy_tamarisk");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRANCHY_TAMARISK_2 = registerKey("branchy_tamarisk_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRANCHY_TAMARISK_GROVE = registerKey("branchy_tamarisk_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BRANCHY_TAMARISK_LAND = registerKey("branchy_tamarisk_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_BRANCHY_TAMARISK = registerKey("golden_branchy_tamarisk");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MUXUE_GRASS_KEY = registerKey("muxue_grass_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_MUXUE_GRASS_KEY = registerKey("tall_muxue_grass_key");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WISTERIA = registerKey("wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_WISTERIA = registerKey("white_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_WISTERIA = registerKey("blue_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_WISTERIA = registerKey("red_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NANJING_WISTERIA = registerKey("nanjing_wisteria");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WOOD_SORREL_PATCH = registerKey("wood_sorrel_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_WOOD_SORREL_PATCH = registerKey("pink_wood_sorrel_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_WOOD_SORREL_PATCH = registerKey("yellow_wood_sorrel_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_WOOD_SORREL_PATCH = registerKey("white_wood_sorrel_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PINK_PETALS_PATCH = registerKey("peach_pink_petals_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PINK_PETALS_GROVE = registerKey("peach_pink_petals_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_FLOWERS_PEACH = registerKey("small_flowers_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_FLOWERS_PEACH = registerKey("tall_flowers_peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FRAGRANT_SNOW_PETALS_PATCH = registerKey("fragrant_snow_petals_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FRAGRANT_SNOW_PETALS_GROVE = registerKey("fragrant_snow_petals_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRING_PETALS_PATCH = registerKey("spring_petals_patch");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SPRING_PETALS_GROVE = registerKey("spring_petals_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_PETALS_GROVE = registerKey("pink_petals_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_FLOWERS_GROVE = registerKey("small_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_BLUE_FLOWERS_GROVE = registerKey("small_blue_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SMALL_WHITE_FLOWERS_GROVE = registerKey("small_white_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TULIP_GROVE = registerKey("tulip_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_FLOWERS_GROVE = registerKey("tall_flowers_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_FLOWERS_GROVE_2 = registerKey("tall_flowers_grove_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ROSE_BUSH = registerKey("rose_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DANDELION = registerKey("dandelion");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_ORCHID_VALLEY = registerKey("blue_orchid_valley");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALLIUM = registerKey("allium");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_TULIP = registerKey("white_tulip");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FLOWERS_PLAIN = registerKey("flowers_plain");
    //grass
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOUNTAIN_GRASS = registerKey("fountain_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOUNTAIN_GRASS_GROVE = registerKey("fountain_grass_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> FOUNTAIN_GRASS_WOODS = registerKey("fountain_grass_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_FOUNTAIN_GRASS_LAND = registerKey("pink_fountain_grass_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PURPLE_FOUNTAIN_GRASS_LAND = registerKey("purple_fountain_grass_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_FOUNTAIN_GRASS_LAND = registerKey("white_fountain_grass_land");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MISCANTHUS = registerKey("miscanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GOLDEN_MISCANTHUS = registerKey("golden_miscanthus");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_GROVE = registerKey("grass_grove");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_WOODS = registerKey("grass_woods");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FOREST_1 = registerKey("grass_forest_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FOREST_2 = registerKey("grass_forest_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FERN = registerKey("grass_fern");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FERN_1 = registerKey("grass_fern_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_FERN_2 = registerKey("grass_fern_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRASS_0 = registerKey("grass_0");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_GRASS = registerKey("tall_grass");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEAD_BUSH = registerKey("dead_bush");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PETALS = registerKey("peach_petals");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_PETALS_RIVER = registerKey("peach_petals_river");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAF_RIVER_0 = registerKey("leaf_river_0");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAF_RIVER_1 = registerKey("leaf_river_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAF_RIVER_2 = registerKey("leaf_river_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WATERLILY_RIVER = registerKey("waterlily_river");
    public static final ResourceKey<ConfiguredFeature<?, ?>> STONE = registerKey("stone");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_1 = registerKey("glowstone_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GLOWSTONE_2 = registerKey("glowstone_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_1 = registerKey("moss_patch_1");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_2 = registerKey("moss_patch_2");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_3 = registerKey("moss_patch_3");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_4 = registerKey("moss_patch_4");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOSS_PATCH_5 = registerKey("moss_patch_5");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        HolderGetter<ConfiguredFeature<?, ?>> holdergetter = context.lookup(Registries.CONFIGURED_FEATURE);

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
        register(context, SMALL_FLOWERS_PEACH, Feature.FLOWER, new RandomPatchConfiguration(54, 8, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.SPRING_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.CHRYSANTHEMUM.get().defaultBlockState(), 2)
                                        .add(ModBlocks.WHITE_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.BLUE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.CHARMING_RHODODENDRON.get().defaultBlockState(), 2)
                                        .add(ModBlocks.CHINESE_AZALEA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.CAMELLIA.get().defaultBlockState(), 2)
                                        .add(ModBlocks.WHITE_CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.CHINESE_NARCISSUS.get().defaultBlockState(), 2)
                                        .add(ModBlocks.GOLDEN_CHINESE_NARCISSUS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, TALL_FLOWERS_PEACH, Feature.FLOWER, new RandomPatchConfiguration(36, 8, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.YAO_HUANG_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.WEI_ZI_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.ZHAO_PINK_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.DOU_GREEN_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 2)
                                        .add(ModBlocks.TALL_CAMELLIA.get().defaultBlockState(), 2)
                                        .add(ModBlocks.TALL_WHITE_CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.TALL_PINK_CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.COTTON_ROSE.get().defaultBlockState(), 2)
                                        .add(ModBlocks.CRAPE_MYRTLE.get().defaultBlockState(), 2).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));

                register(context, CYMBIDIUM_RIVER, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.SPRING_CYMBIDIUM.get().defaultBlockState(), 2)
                                        .add(ModBlocks.SUMMER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.AUTUMN_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WINTER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.CHINESE_NARCISSUS.get().defaultBlockState(), 2)
                                        .add(ModBlocks.GOLDEN_CHINESE_NARCISSUS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GOLDEN_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(Blocks.BLUE_ORCHID.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
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
        SimpleWeightedRandomList.Builder<BlockState> leaf0RiverBuilder = SimpleWeightedRandomList.builder();
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            leaf0RiverBuilder.add(ModBlocks.CHINESE_PARASOL_LEAF_1.get().defaultBlockState()
                    .setValue(LeafPileBlock.FACING, direction), 1);
            leaf0RiverBuilder.add(ModBlocks.CHINESE_PARASOL_LEAF_0.get().defaultBlockState()
                    .setValue(LeafPileBlock.FACING, direction), 1);
        }
        register(context, LEAF_RIVER_0, Feature.RANDOM_PATCH, new RandomPatchConfiguration(8, 4, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(leaf0RiverBuilder)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.WATER)))));
        SimpleWeightedRandomList.Builder<BlockState> leaf1RiverBuilder = SimpleWeightedRandomList.builder();
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            leaf1RiverBuilder.add(ModBlocks.SWEETGUM_LEAF_0.get().defaultBlockState()
                    .setValue(LeafPileBlock.FACING, direction), 1);
            leaf1RiverBuilder.add(ModBlocks.SWEETGUM_LEAF_0.get().defaultBlockState()
                    .setValue(LeafPileBlock.FACING, direction), 1);
        }
        register(context, LEAF_RIVER_1, Feature.RANDOM_PATCH, new RandomPatchConfiguration(6, 4, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(leaf1RiverBuilder)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.WATER)))));
        SimpleWeightedRandomList.Builder<BlockState> leaf2RiverBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for (Direction direction : Direction.Plane.HORIZONTAL) {
                leaf2RiverBuilder.add(ModBlocks.GINKGO_LEAF.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction));
            }
        }
        register(context, LEAF_RIVER_2, Feature.RANDOM_PATCH, new RandomPatchConfiguration(8, 4, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(leaf2RiverBuilder)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.WATER)))));
        register(context, WATERLILY_RIVER, Feature.RANDOM_PATCH, new RandomPatchConfiguration(10, 6, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_PAD)),
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHINESE_ROSE_PENGLAI, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_PINK_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.RED_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_WHITE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, SUMMER_CYMBIDIUM_YUNMENG, Feature.FLOWER, new RandomPatchConfiguration(32, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SUMMER_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, SPRING_CYMBIDIUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SPRING_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, SUMMER_CYMBIDIUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.SUMMER_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WINTER_CYMBIDIUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WINTER_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, HARDY_BANANA_KEY, Feature.FLOWER, new RandomPatchConfiguration(8, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HARDY_BANANA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, LILY_OF_THE_VALLEY_FOREST, Feature.FLOWER, new RandomPatchConfiguration(6, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, ORCHID_FOREST, Feature.FLOWER, new RandomPatchConfiguration(8, 8, 6,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.BLUE_ORCHID.defaultBlockState(), 2)
                                        .add(ModBlocks.WHITE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GOLDEN_MOTH_ORCHID.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, CHRYSANTHEMUM_FOREST, Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3,
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(12, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, XIHU_LIUYUE_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.XIHU_LIUYUE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, BLACK_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLACK_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PURPLE_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_CHRYSANTHEMUM_KEY, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, COTTON_ROSE_FOREST, Feature.FLOWER, new RandomPatchConfiguration(12, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COTTON_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, RED_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 10, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 10, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 10, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, TALL_RED_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.TALL_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, TALL_WHITE_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.TALL_WHITE_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, TALL_PINK_CAMELLIA_KEY, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.TALL_PINK_CAMELLIA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, RED_AZALEA_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_AZALEA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, MAYING_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MAYING_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, DEWDROP_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.DEWDROP_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHARMING_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHARMING_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, GREAT_WHITE_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GREAT_WHITE_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PURPLE_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_RHODODENDRON_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_RHODODENDRON.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHINESE_AZALEA_KEY, Feature.FLOWER, new RandomPatchConfiguration(99, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHINESE_AZALEA.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, AZALEA_KEY, Feature.FLOWER, new RandomPatchConfiguration(6, 4, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.FLOWERING_AZALEA)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, WINTERSWEET, Feature.FLOWER, new RandomPatchConfiguration(16, 0, 0,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WINTERSWEET.get())), // 你的腊梅方块
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR), // 当前位置是空气
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR), // 上方一格也是空气
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT))))); // 指定可以放置在哪些方块之上

        register(context, STONE, Feature.RANDOM_PATCH, new RandomPatchConfiguration(16, 0, 0,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.STONE)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, GLOWSTONE_1, Feature.RANDOM_PATCH, new RandomPatchConfiguration(186, 5, 10,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.GLOWSTONE)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), ModBlocks.CAMPHOR_LOG.get())))));
        register(context, GLOWSTONE_2, Feature.RANDOM_PATCH, new RandomPatchConfiguration(16, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.GLOWSTONE)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK)))));

        register(context, FLOWER_SNOW_SPRING, Feature.FLOWER, new RandomPatchConfiguration(62, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.SPRING_CYMBIDIUM.get().defaultBlockState(), 3)
                                        .add(ModBlocks.CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CAMELLIA.get().defaultBlockState(), 1)
                                        .add(ModBlocks.TALL_CAMELLIA.get().defaultBlockState(), 2)
                                        .add(ModBlocks.TALL_WHITE_CAMELLIA.get().defaultBlockState(), 2)
                                        .add(ModBlocks.TALL_PINK_CAMELLIA.get().defaultBlockState(), 2)
                                        .add(ModBlocks.CHINESE_NARCISSUS.get().defaultBlockState(), 3)
                                        .add(ModBlocks.GOLDEN_CHINESE_NARCISSUS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, CHRYSANTHEMUM_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CYMBIDIUM, Feature.FLOWER, new RandomPatchConfiguration(16, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.SPRING_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.SUMMER_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.AUTUMN_CYMBIDIUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WINTER_CYMBIDIUM.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_TREE_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.YAO_HUANG_PEONY.get().defaultBlockState(), 3)
                                        .add(ModBlocks.WEI_ZI_PEONY.get().defaultBlockState(), 3)
                                        .add(ModBlocks.ZHAO_PINK_PEONY.get().defaultBlockState(), 3)
                                        .add(ModBlocks.DOU_GREEN_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LUOYANG_RED_PEONY.get().defaultBlockState(), 3)
                                        .add(ModBlocks.VERSICOLOR_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.TWO_QIAO_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.RED_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PURPLE_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.YELLOW_PEONY.get().defaultBlockState(), 2)
                                        .add(ModBlocks.BLUE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GREEN_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.INK_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WU_HUA_LONG_YU_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, LIGHT_PEONY_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.LIGHT_PINK_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_RED_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_PURPLE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.LIGHT_YELLOW_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, INK_PEONY_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.VIOLET_PINK_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.INK_RED_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.INK_PURPLE_PEONY.get().defaultBlockState(), 1)
                                        .add(ModBlocks.OCHRE_YELLOW_PEONY.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHINESE_ROSE_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CRAPE_MYRTLE_KEY, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, COTTON_ROSE_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COTTON_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CAMELLIA_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CAMELLIA.get().defaultBlockState(), 4)
                                        .add(ModBlocks.TALL_CAMELLIA.get().defaultBlockState(), 5).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_CAMELLIA_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.PINK_CAMELLIA.get().defaultBlockState(), 4)
                                        .add(ModBlocks.TALL_PINK_CAMELLIA.get().defaultBlockState(), 5).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_CAMELLIA_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.WHITE_CAMELLIA.get().defaultBlockState(), 4)
                                        .add(ModBlocks.TALL_WHITE_CAMELLIA.get().defaultBlockState(), 5).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, AZALEA_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHINESE_NARCISSUS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_NARCISSUS.get().defaultBlockState(), 3)
                                        .add(ModBlocks.GOLDEN_CHINESE_NARCISSUS.get().defaultBlockState(), 2).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, HOLLYHOCK_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.HOLLYHOCK.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_HOLLYHOCK.get().defaultBlockState(), 1)
                                        .add(ModBlocks.ORANGE_HOLLYHOCK.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_HOLLYHOCK.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, MOTH_ORCHID_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.WHITE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_MOTH_ORCHID.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PURPLE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GOLDEN_MOTH_ORCHID.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, BRANCHY_TAMARISK_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BRANCHY_TAMARISK.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, FOUNTAIN_GRASS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_FOUNTAIN_GRASS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, TALL_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.ROSE_BUSH.defaultBlockState(), 1)
                                        .add(Blocks.PEONY.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, TALL_FLOWERS_GROVE_2, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.LILAC.defaultBlockState(), 1)
                                        .add(Blocks.SUNFLOWER.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, SMALL_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.DANDELION.defaultBlockState(), 1)
                                        .add(Blocks.POPPY.defaultBlockState(), 1)
                                        .add(Blocks.ALLIUM.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, SMALL_BLUE_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.BLUE_ORCHID.defaultBlockState(), 1)
                                        .add(Blocks.CORNFLOWER.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, SMALL_WHITE_FLOWERS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.OXEYE_DAISY.defaultBlockState(), 1)
                                        .add(Blocks.LILY_OF_THE_VALLEY.defaultBlockState(), 1)
                                        .add(Blocks.AZURE_BLUET.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, TULIP_GROVE, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.RED_TULIP.defaultBlockState(), 1)
                                        .add(Blocks.ORANGE_TULIP.defaultBlockState(), 1)
                                        .add(Blocks.WHITE_TULIP.defaultBlockState(), 1)
                                        .add(Blocks.PINK_TULIP.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        SimpleWeightedRandomList.Builder<BlockState> oxalisBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                oxalisBuilder.add(ModBlocks.WOOD_SORREL.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
                oxalisBuilder.add(ModBlocks.PINK_WOOD_SORREL.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
                oxalisBuilder.add(ModBlocks.WHITE_WOOD_SORREL.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
                oxalisBuilder.add(ModBlocks.ORANGE_WOOD_SORREL.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 2);
            }
        }
        register(context, WOOD_SORREL_PATCH, Feature.FLOWER, new RandomPatchConfiguration(16, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(oxalisBuilder)))));
        register(context, PEACH_PINK_PETALS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(16, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(peachPinkPetalsBuilder)))));
        register(context, FRAGRANT_SNOW_PETALS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(16, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(fragrantSnowPetalsBuilder)))));
        register(context, SPRING_PETALS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(16, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(springPetalsBuilder)))));
        SimpleWeightedRandomList.Builder<BlockState> pinkPetalsBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                pinkPetalsBuilder.add(Blocks.PINK_PETALS.defaultBlockState()
                        .setValue(PinkPetalsBlock.AMOUNT, i)
                        .setValue(PinkPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, PINK_PETALS_GROVE, Feature.FLOWER, new RandomPatchConfiguration(16, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(pinkPetalsBuilder)))));

        register(context, PEONY_PINK_GROVE, Feature.FLOWER, new RandomPatchConfiguration(36, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, ZHAO_PINK_PEONY_GROVE, Feature.FLOWER, new RandomPatchConfiguration(18, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ZHAO_PINK_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, YAO_HUANG_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.YAO_HUANG_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WEI_ZI_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WEI_ZI_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, ZHAO_PINK_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.ZHAO_PINK_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, DOU_GREEN_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.DOU_GREEN_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, LUOYANG_RED_PEONY_KEY, Feature.FLOWER, new RandomPatchConfiguration(162, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LUOYANG_RED_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
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
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_PINK_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_LIGHT_PINK_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_PINK_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_RED_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_RED_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_PURPLE_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_PURPLE_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_YELLOW_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LIGHT_YELLOW_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_WHITE_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_BLUE_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLUE_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PEONY_GREEN_KEY, Feature.FLOWER, new RandomPatchConfiguration(81, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GREEN_PEONY.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, COTTON_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(16, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COTTON_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, MOTTLED_BAMBOO_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(100, 9, 4,
                PlacementUtils.onlyWhenEmpty(ModBambooFeatures.MOTTLED_BAMBOO.get(),
                        new ProbabilityFeatureConfiguration(0.0F))));
        register(context, BLACK_BAMBOO_KEY,Feature.RANDOM_PATCH, new RandomPatchConfiguration(100, 9, 4,
                PlacementUtils.onlyWhenEmpty(ModBambooFeatures.BLACK_BAMBOO.get(),
                        new ProbabilityFeatureConfiguration(0.0F))));
        register(context, BLACK_BAMBOO_GALLERY_KEY,Feature.RANDOM_PATCH, new RandomPatchConfiguration(25, 5, 2,
                PlacementUtils.onlyWhenEmpty(ModBambooFeatures.BLACK_BAMBOO.get(),
                        new ProbabilityFeatureConfiguration(0.0F))));
        register(context, BLACK_BAMBOO_SAPLING_KEY, Feature.FLOWER, new RandomPatchConfiguration(20, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BLACK_BAMBOO_SAPLING.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, MOTH_ORCHID_TEM_MILE, Feature.FLOWER, new RandomPatchConfiguration(28, 4, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.WHITE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_MOTH_ORCHID.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GOLDEN_MOTH_ORCHID.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        SimpleWeightedRandomList.Builder<BlockState> lotusBuilder = SimpleWeightedRandomList.builder();
        lotusBuilder.add(ModBlocks.LOTUS_LEAF.get().defaultBlockState().setValue(WaterLotusBlock.AGE, 3),82);
        for (int age = 0; age <= 3; age++) {
            int weight = (age <= 1) ? 1 : 2;
            lotusBuilder.add(ModBlocks.LOTUS.get().defaultBlockState().setValue(WaterLotusBlock.AGE, age), weight*2);
            lotusBuilder.add(ModBlocks.WHITE_LOTUS.get().defaultBlockState().setValue(WaterLotusBlock.AGE, age), weight);
        }
        register(context, LOTUS_KEY, Feature.FLOWER, new RandomPatchConfiguration(256, 14, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(lotusBuilder.build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.WATER),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, -1, 0), Blocks.DIRT, Blocks.SAND, Blocks.CLAY, Blocks.MUD)))));
        SimpleWeightedRandomList.Builder<BlockState> lotusBuilder2 = SimpleWeightedRandomList.builder();
        lotusBuilder2.add(ModBlocks.LOTUS_LEAF.get().defaultBlockState().setValue(WaterLotusBlock.AGE, 3),164);
        for (int age = 0; age <= 3; age++) {
            int weight = (age <= 1) ? 1 : 2;
            lotusBuilder2.add(ModBlocks.LOTUS.get().defaultBlockState().setValue(WaterLotusBlock.AGE, age), weight*3);
            lotusBuilder2.add(ModBlocks.WHITE_LOTUS.get().defaultBlockState().setValue(WaterLotusBlock.AGE, age), weight*2);
            lotusBuilder2.add(ModBlocks.RED_LOTUS.get().defaultBlockState().setValue(WaterLotusBlock.AGE, age), weight);
        }
        register(context, LOTUS_RIVER, Feature.FLOWER, new RandomPatchConfiguration(256, 14, 1,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(lotusBuilder2.build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.WATER),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR)))));

        register(context, MUXUE_GRASS_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(36, 3, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MUXUE_GRASS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.WATER),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.CLAY)))));
        register(context, TALL_MUXUE_GRASS_KEY, Feature.RANDOM_PATCH, new RandomPatchConfiguration(36, 3, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.MUXUE_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.TALL_MUXUE_GRASS.get().defaultBlockState(), 4).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.WATER),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.WATER),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.DIRT, Blocks.SAND, Blocks.GRAVEL, Blocks.CLAY)))));

        register(context, CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(172, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 9)
                                        .add(ModBlocks.PINK_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(172, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CHINESE_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PURPLE_CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(172, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.PURPLE_CHINESE_ROSE.get().defaultBlockState(), 9)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, YELLOW_CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(172, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.YELLOW_CHINESE_ROSE.get().defaultBlockState(), 9)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_CHINESE_ROSE_KEY, Feature.FLOWER, new RandomPatchConfiguration(172, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE.get().defaultBlockState(), 8).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, ROSE_BUSH, Feature.FLOWER, new RandomPatchConfiguration(18, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.ROSE_BUSH)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, CHINESE_ROSE_WOODS_KEY, Feature.FLOWER, new RandomPatchConfiguration(56, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 5)
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PINK_CHINESE_ROSE.get().defaultBlockState(), 3)
                                        .add(ModBlocks.YELLOW_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, SMALL_CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE_SAPLING.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, SMALL_RED_CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, SMALL_PINK_CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, SMALL_WHITE_CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CRAPE_MYRTLE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, RED_CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.RED_CRAPE_MYRTLE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CRAPE_MYRTLE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_CRAPE_MYRTLE_GARDEN, Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CRAPE_MYRTLE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, CHRYSANTHEMUM_DONGLI, Feature.FLOWER, new RandomPatchConfiguration(106, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.BLACK_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CHRYSANTHEMUM.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHRYSANTHEMUM_DONGLI_2, Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHRYSANTHEMUM.get().defaultBlockState(), 1)
                                        .add(ModBlocks.XIHU_LIUYUE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.GOLD_BACKED_SCARLET_MUM.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, FOUNTAIN_GRASS_WOODS, Feature.FLOWER, new RandomPatchConfiguration(32, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.FOUNTAIN_GRASS.get().defaultBlockState(), 2)
                                        .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, LILY_OF_THE_VALLEY_WOODS, Feature.FLOWER, new RandomPatchConfiguration(24, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.LILY_OF_THE_VALLEY)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHINESE_NARCISSUS_WOODS, Feature.FLOWER, new RandomPatchConfiguration(24, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHINESE_NARCISSUS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_MOTH_ORCHID_WOODS, Feature.FLOWER, new RandomPatchConfiguration(24, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, PURPLE_MOTH_ORCHID_CLOUD, Feature.FLOWER, new RandomPatchConfiguration(10, 2, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, FOUNTAIN_GRASS, Feature.FLOWER, new RandomPatchConfiguration(36, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_FOUNTAIN_GRASS.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_FOUNTAIN_GRASS.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, CHINESE_ROSE_PLAIN, Feature.FLOWER, new RandomPatchConfiguration(12, 3, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_CHINESE_ROSE.get().defaultBlockState(), 1)
                                        .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, MISCANTHUS, Feature.FLOWER, new RandomPatchConfiguration(72, 5, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.MISCANTHUS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, AUTUMN_CYMBIDIUM_PLAIN, Feature.FLOWER, new RandomPatchConfiguration(12, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.AUTUMN_CYMBIDIUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, FLOWERS_PLAIN, Feature.FLOWER, new RandomPatchConfiguration(8, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.DANDELION.defaultBlockState(), 1)
                                        .add(Blocks.ALLIUM.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, COTTON_ROSE_TIANFU, Feature.FLOWER, new RandomPatchConfiguration(36, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.COTTON_ROSE.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, BAMBOO_KEY,Feature.RANDOM_PATCH, new RandomPatchConfiguration(100, 9, 4,
                PlacementUtils.onlyWhenEmpty(Feature.BAMBOO,
                        new ProbabilityFeatureConfiguration(0.0F))));
        register(context, HOLLYHOCK_TIANFU, Feature.FLOWER, new RandomPatchConfiguration(36, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(ModBlocks.HOLLYHOCK.get().defaultBlockState(), 1)
                                        .add(ModBlocks.PINK_HOLLYHOCK.get().defaultBlockState(), 1)
                                        .add(ModBlocks.ORANGE_HOLLYHOCK.get().defaultBlockState(), 1)
                                        .add(ModBlocks.WHITE_HOLLYHOCK.get().defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, BRANCHY_TAMARISK_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BRANCHY_TAMARISK.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_MOTH_ORCHID_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_CHRYSANTHEMUM_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PINK_FOUNTAIN_GRASS_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PINK_FOUNTAIN_GRASS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        SimpleWeightedRandomList.Builder<BlockState> pinkOxalisBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                pinkOxalisBuilder.add(ModBlocks.PINK_WOOD_SORREL.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, PINK_WOOD_SORREL_PATCH, Feature.FLOWER, new RandomPatchConfiguration(24, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(pinkOxalisBuilder)))));

        register(context, WHITE_MOTH_ORCHID_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_CHRYSANTHEMUM_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_FOUNTAIN_GRASS_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_FOUNTAIN_GRASS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_TULIP, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.WHITE_TULIP)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        SimpleWeightedRandomList.Builder<BlockState> whiteOxalisBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                whiteOxalisBuilder.add(ModBlocks.WHITE_WOOD_SORREL.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, WHITE_WOOD_SORREL_PATCH, Feature.FLOWER, new RandomPatchConfiguration(24, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(whiteOxalisBuilder)))));

        register(context, CHRYSANTHEMUM_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, GOLDEN_MOTH_ORCHID_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLDEN_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, GOLDEN_CHINESE_NARCISSUS_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLDEN_CHINESE_NARCISSUS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, DANDELION, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.DANDELION)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        SimpleWeightedRandomList.Builder<BlockState> yellowOxalisBuilder = SimpleWeightedRandomList.builder();
        for(int i = 1; i <= 4; ++i) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                yellowOxalisBuilder.add(ModBlocks.WOOD_SORREL.get().defaultBlockState()
                        .setValue(ModFlowerPetalsBlock.AMOUNT, i)
                        .setValue(ModFlowerPetalsBlock.FACING, direction), 1);
            }
        }
        register(context, YELLOW_WOOD_SORREL_PATCH, Feature.FLOWER, new RandomPatchConfiguration(24, 7, 2,
                PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(yellowOxalisBuilder)))));

        register(context, PURPLE_FOUNTAIN_GRASS_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_FOUNTAIN_GRASS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PURPLE_MOTH_ORCHID_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, PURPLE_CHRYSANTHEMUM_LAND, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_CHRYSANTHEMUM.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, ALLIUM, Feature.FLOWER, new RandomPatchConfiguration(64, 7, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.ALLIUM)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, GOLDEN_MISCANTHUS, Feature.FLOWER, new RandomPatchConfiguration(72, 8, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLDEN_MISCANTHUS.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

        register(context, BRANCHY_TAMARISK_KEY, Feature.FLOWER, new RandomPatchConfiguration(100, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BRANCHY_TAMARISK.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DEAD_BUSH_MAY_PLACE_ON)))));
        register(context, BRANCHY_TAMARISK_2, Feature.FLOWER, new RandomPatchConfiguration(50, 4, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.BRANCHY_TAMARISK.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DEAD_BUSH_MAY_PLACE_ON)))));
        register(context, GOLDEN_BRANCHY_TAMARISK, Feature.FLOWER, new RandomPatchConfiguration(100, 6, 2,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.GOLDEN_BRANCHY_TAMARISK.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DEAD_BUSH_MAY_PLACE_ON)))));

        register(context, PURPLE_MOTH_ORCHID_VALLEY, Feature.FLOWER, new RandomPatchConfiguration(21, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.PURPLE_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, WHITE_MOTH_ORCHID_VALLEY, Feature.FLOWER, new RandomPatchConfiguration(21, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.WHITE_MOTH_ORCHID.get())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));
        register(context, BLUE_ORCHID_VALLEY, Feature.FLOWER, new RandomPatchConfiguration(21, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.BLUE_ORCHID)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DIRT)))));

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
                                .add(Blocks.SHORT_GRASS.defaultBlockState(), 10)
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
                                .add(Blocks.SHORT_GRASS.defaultBlockState(), 10)
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
                                .add(Blocks.SHORT_GRASS.defaultBlockState(), 10)
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
                                .add(Blocks.SHORT_GRASS.defaultBlockState(), 10)
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
                                .add(Blocks.SHORT_GRASS.defaultBlockState(), 10)
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
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.SHORT_GRASS)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_WOODS, Feature.RANDOM_PATCH, new RandomPatchConfiguration(40, 7, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.SHORT_GRASS.defaultBlockState(), 7)
                                        .add(Blocks.TALL_GRASS.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FOREST_1, Feature.RANDOM_PATCH, new RandomPatchConfiguration(30, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.SHORT_GRASS.defaultBlockState(), 9)
                                        .add(Blocks.FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FOREST_2, Feature.RANDOM_PATCH, new RandomPatchConfiguration(30, 6, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.SHORT_GRASS.defaultBlockState(), 7)
                                        .add(Blocks.FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FERN, Feature.RANDOM_PATCH, new RandomPatchConfiguration(16, 4, 4,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.SHORT_GRASS.defaultBlockState(), 5)
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
                                        .add(Blocks.SHORT_GRASS.defaultBlockState(), 4)
                                        .add(Blocks.FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, GRASS_FERN_2, Feature.RANDOM_PATCH, new RandomPatchConfiguration(40, 5, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(new WeightedStateProvider(
                                SimpleWeightedRandomList.<BlockState>builder()
                                        .add(Blocks.SHORT_GRASS.defaultBlockState(), 6)
                                        .add(Blocks.TALL_GRASS.defaultBlockState(), 1)
                                        .add(Blocks.FERN.defaultBlockState(), 2)
                                        .add(Blocks.LARGE_FERN.defaultBlockState(), 1).build())),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.MUD)))));
        register(context, GRASS_0, Feature.RANDOM_PATCH, new RandomPatchConfiguration(46, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.SHORT_GRASS)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, TALL_GRASS, Feature.RANDOM_PATCH, new RandomPatchConfiguration(36, 7, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.TALL_GRASS)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesBlocks(new BlockPos(0, 1, 0), Blocks.AIR),
                                BlockPredicate.matchesBlocks(Direction.DOWN.getNormal(), Blocks.GRASS_BLOCK, Blocks.DIRT, Blocks.PODZOL)))));
        register(context, DEAD_BUSH, Feature.RANDOM_PATCH, new RandomPatchConfiguration(4, 6, 3,
                PlacementUtils.filtered(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(Blocks.DEAD_BUSH)),
                        BlockPredicate.allOf(
                                BlockPredicate.matchesBlocks(BlockPos.ZERO, Blocks.AIR),
                                BlockPredicate.matchesTag(Direction.DOWN.getNormal(), BlockTags.DEAD_BUSH_MAY_PLACE_ON)))));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse(MoreOrnPlants.MODID + ":" + name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
