package com.jinlan.moreornplants.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ForgeTags {
    public static class Items {
        public static final TagKey<Item> WINTERSWEET = tag("wintersweet");
        public static final TagKey<Item> MEI = tag("mei");
        public static final TagKey<Item> TREE_PEONY = tag("tree_peony");
        public static final TagKey<Item> HERBACEOUS_PEONY = tag("herbaceous_peony");
        public static final TagKey<Item> CHINESE_ROSES = tag("chinese_rose");
        public static final TagKey<Item> CHRYSANTHEMUMS = tag("chrysanthemum");
        public static final TagKey<Item> PLANT_IN_FLORILEGIUM = tag("plant_in_florilegium");
        public static final TagKey<Item> CAMELLIAS = tag("camellia");
        public static final TagKey<Item> AZALEA = tag("azalea");
        public static final TagKey<Item> CRABAPPLE = tag("crabapple");
        public static final TagKey<Item> OSMANTHUS = tag("osmanthus");
        public static final TagKey<Item> APRICOT = tag("apricot");
        public static final TagKey<Item> PEACH = tag("peach");
        public static final TagKey<Item> PLUM = tag("plum");
        public static final TagKey<Item> GINKGO = tag("ginkgo");
        public static final TagKey<Item> CHINESE_PARASOL = tag("chinese_parasol");
        public static final TagKey<Item> BAMBOO = tag("bamboo");

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
