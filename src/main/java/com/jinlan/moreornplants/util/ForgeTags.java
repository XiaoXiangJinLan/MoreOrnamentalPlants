package com.jinlan.moreornplants.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ForgeTags {
    public static class Items {
        public static final TagKey<Item> MEI_SAPLING = tag("mei_sapling");
        public static final TagKey<Item> TREE_PEONY = tag("tree_peony");
        public static final TagKey<Item> CYMBIDIUM = tag("cymbidium");
        public static final TagKey<Item> HERBACEOUS_PEONY = tag("herbaceous_peony");
        public static final TagKey<Item> CHINESE_ROSE = tag("chinese_rose");
        public static final TagKey<Item> CHRYSANTHEMUM = tag("chrysanthemum");
        public static final TagKey<Item> PLANT_IN_FLORILEGIUM = tag("plant_in_florilegium");
        public static final TagKey<Item> CAMELLIA = tag("camellia");
        public static final TagKey<Item> AZALEA = tag("azalea");
        public static final TagKey<Item> CRABAPPLE_SAPLING = tag("crabapple_sapling");
        public static final TagKey<Item> OSMANTHUS_SAPLING = tag("osmanthus_sapling");
        public static final TagKey<Item> APRICOT_SAPLING = tag("apricot_sapling");
        public static final TagKey<Item> PEACH_SAPLING = tag("peach_sapling");
        public static final TagKey<Item> PLUM_SAPLING = tag("plum_sapling");
        public static final TagKey<Item> GINKGO_SAPLING = tag("ginkgo_sapling");
        public static final TagKey<Item> CHINESE_PARASOL_SAPLING = tag("chinese_parasol_sapling");
        public static final TagKey<Item> CRAPE_MYRTLE = tag("crape_myrtle");
        public static final TagKey<Item> BAMBOO = tag("bamboo");
        public static final TagKey<Item> LOTUS = tag("lotus");
        public static final TagKey<Item> ORNAMENTAL_GRASS = tag("ornamental_grass");

        public static final TagKey<Item> VEGETABLES = tag("vegetables");
        public static final TagKey<Item> VEGETABLES_BAMBOO_SHOOTS = tag("vegetables/bamboo_shoots");
        public static final TagKey<Item> VEGETABLES_BAMBOO_SPROUTS = tag("vegetables/bamboo_sprouts");
        public static final TagKey<Item> VEGETABLES_LOTUS_ROOT = tag("vegetables/lotus_root");
        public static final TagKey<Item> VEGETABLES_LOTUS_SEED = tag("vegetables/lotus_seed");
        public static final TagKey<Item> VEGETABLES_LOTUS_NUT = tag("vegetables/lotus_nut");

        private static TagKey<Item> tag(String path) {
            return ItemTags.create(new ResourceLocation("forge", path));
        }
    }
}
