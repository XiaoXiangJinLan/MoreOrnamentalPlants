package com.jinlan.moreornplants.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class CommonTags {
    public static class Blocks {
        public static final TagKey<Block> MEI_SAPLING = tag("mei_sapling");
        public static final TagKey<Block> CRABAPPLE_SAPLING = tag("crabapple_sapling");
        public static final TagKey<Block> OSMANTHUS_SAPLING = tag("osmanthus_sapling");
        public static final TagKey<Block> APRICOT_SAPLING = tag("apricot_sapling");
        public static final TagKey<Block> PEACH_SAPLING = tag("peach_sapling");
        public static final TagKey<Block> PLUM_SAPLING = tag("plum_sapling");
        public static final TagKey<Block> GINKGO_SAPLING = tag("ginkgo_sapling");
        public static final TagKey<Block> CHINESE_PARASOL_SAPLING = tag("chinese_parasol_sapling");
        public static final TagKey<Block> CRAPE_MYRTLE_SAPLING = tag("crape_myrtle_sapling");

        public static final TagKey<Block> MEI_LEAVES = tag("mei_leaves");
        public static final TagKey<Block> CRABAPPLE_LEAVES = tag("crabapple_leaves");
        public static final TagKey<Block> OSMANTHUS_LEAVES = tag("osmanthus_leaves");
        public static final TagKey<Block> APRICOT_LEAVES = tag("apricot_leaves");
        public static final TagKey<Block> PEACH_LEAVES = tag("peach_leaves");
        public static final TagKey<Block> PLUM_LEAVES = tag("plum_leaves");
        public static final TagKey<Block> GINKGO_LEAVES = tag("ginkgo_leaves");
        public static final TagKey<Block> CHINESE_PARASOL_LEAVES = tag("chinese_parasol_leaves");
        public static final TagKey<Block> CAMPHOR_LEAVES = tag("camphor_leaves");
        public static final TagKey<Block> DOVE_TREE_LEAVES = tag("dove_tree_leaves");
        public static final TagKey<Block> CRAPE_MYRTLE_LEAVES = tag("crape_myrtle_leaves");
        public static final TagKey<Block> RHODODENDRON_LEAVES = tag("rhododendron_leaves");
        public static final TagKey<Block> CAMELLIA_LEAVES = tag("camellia_leaves");

        public static final TagKey<Block> WEEPING_MEI = tag("weeping_mei");
        public static final TagKey<Block> WISTERIA = tag("wisteria");

        public static final TagKey<Block> TREE_PEONY = tag("tree_peony");
        public static final TagKey<Block> CYMBIDIUM = tag("cymbidium");
        public static final TagKey<Block> HERBACEOUS_PEONY = tag("herbaceous_peony");
        public static final TagKey<Block> CHINESE_ROSE = tag("chinese_rose");
        public static final TagKey<Block> CHRYSANTHEMUM = tag("chrysanthemum");
        public static final TagKey<Block> CAMELLIA = tag("camellia");
        public static final TagKey<Block> AZALEA = tag("azalea");
        public static final TagKey<Block> RHODODENDRON = tag("rhododendron");
        public static final TagKey<Block> CRAPE_MYRTLE = tag("crape_myrtle");
        public static final TagKey<Block> LOTUS = tag("lotus");
        public static final TagKey<Block> NARCISSUS = tag("narcissus");
        public static final TagKey<Block> HOLLYHOCK = tag("hollyhock");

        private static TagKey<Block> tag(String path) {
            return BlockTags.create(ResourceLocation.parse("c" + ":" + path));
        }
    }

    public static class Items {
        public static final TagKey<Item> MEI_SAPLING = tag("mei_sapling");
        public static final TagKey<Item> CRABAPPLE_SAPLING = tag("crabapple_sapling");
        public static final TagKey<Item> OSMANTHUS_SAPLING = tag("osmanthus_sapling");
        public static final TagKey<Item> APRICOT_SAPLING = tag("apricot_sapling");
        public static final TagKey<Item> PEACH_SAPLING = tag("peach_sapling");
        public static final TagKey<Item> PLUM_SAPLING = tag("plum_sapling");
        public static final TagKey<Item> GINKGO_SAPLING = tag("ginkgo_sapling");
        public static final TagKey<Item> CHINESE_PARASOL_SAPLING = tag("chinese_parasol_sapling");
        public static final TagKey<Item> CRAPE_MYRTLE_SAPLING = tag("crape_myrtle_sapling");

        public static final TagKey<Item> MEI_LEAVES = tag("mei_leaves");
        public static final TagKey<Item> CRABAPPLE_LEAVES = tag("crabapple_leaves");
        public static final TagKey<Item> OSMANTHUS_LEAVES = tag("osmanthus_leaves");
        public static final TagKey<Item> APRICOT_LEAVES = tag("apricot_leaves");
        public static final TagKey<Item> PEACH_LEAVES = tag("peach_leaves");
        public static final TagKey<Item> PLUM_LEAVES = tag("plum_leaves");
        public static final TagKey<Item> GINKGO_LEAVES = tag("ginkgo_leaves");
        public static final TagKey<Item> CHINESE_PARASOL_LEAVES = tag("chinese_parasol_leaves");
        public static final TagKey<Item> CAMPHOR_LEAVES = tag("camphor_leaves");
        public static final TagKey<Item> DOVE_TREE_LEAVES = tag("dove_tree_leaves");
        public static final TagKey<Item> CRAPE_MYRTLE_LEAVES = tag("crape_myrtle_leaves");
        public static final TagKey<Item> RHODODENDRON_LEAVES = tag("rhododendron_leaves");
        public static final TagKey<Item> CAMELLIA_LEAVES = tag("camellia_leaves");

        public static final TagKey<Item> WEEPING_MEI = tag("weeping_mei");
        public static final TagKey<Item> WISTERIA = tag("wisteria");

        public static final TagKey<Item> TREE_PEONY = tag("tree_peony");
        public static final TagKey<Item> CYMBIDIUM = tag("cymbidium");
        public static final TagKey<Item> HERBACEOUS_PEONY = tag("herbaceous_peony");
        public static final TagKey<Item> CHINESE_ROSE = tag("chinese_rose");
        public static final TagKey<Item> CHRYSANTHEMUM = tag("chrysanthemum");
        public static final TagKey<Item> CAMELLIA = tag("camellia");
        public static final TagKey<Item> AZALEA = tag("azalea");
        public static final TagKey<Item> RHODODENDRON = tag("rhododendron");
        public static final TagKey<Item> CRAPE_MYRTLE = tag("crape_myrtle");
        public static final TagKey<Item> BAMBOO = tag("bamboo");
        public static final TagKey<Item> LOTUS = tag("lotus");
        public static final TagKey<Item> NARCISSUS = tag("narcissus");
        public static final TagKey<Item> HOLLYHOCK = tag("hollyhock");
        public static final TagKey<Item> ORNAMENTAL_GRASS = tag("ornamental_grass");

        public static final TagKey<Item> CROPS_LOTUS = tag("crops/lotus");
        public static final TagKey<Item> FOODS_BAMBOO_SHOOTS = tag("foods/bamboo_shoots");
        public static final TagKey<Item> FOODS_BAMBOO_SPROUTS = tag("foods/bamboo_sprouts");
        public static final TagKey<Item> FOODS_LOTUS_ROOT = tag("foods/lotus_root");
        public static final TagKey<Item> FOODS_LOTUS_SEED = tag("foods/lotus_seed");
        public static final TagKey<Item> FOODS_LOTUS_NUT = tag("foods/lotus_nut");

        private static TagKey<Item> tag(String path) {
            return ItemTags.create(ResourceLocation.parse("c" + ":" + path));
        }
    }
}
