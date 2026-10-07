package com.jinlan.moreornplants.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class SeasonsTags {
    public static class Blocks {
        public static final TagKey<Block> SPRING_CROPS = tag("spring_crops");
        public static final TagKey<Block> SUMMER_CROPS = tag("summer_crops");
        public static final TagKey<Block> AUTUMN_CROPS = tag("autumn_crops");
        public static final TagKey<Block> WINTER_CROPS = tag("winter_crops");

        private static TagKey<Block> tag(String path) {
            return BlockTags.create(ResourceLocation.parse("sereneseasons" + ":" + path));
        }
    }

    public static class Items {
        public static final TagKey<Item> SPRING_CROPS = tag("spring_crops");
        public static final TagKey<Item> SUMMER_CROPS = tag("summer_crops");
        public static final TagKey<Item> AUTUMN_CROPS = tag("autumn_crops");
        public static final TagKey<Item> WINTER_CROPS = tag("winter_crops");

        private static TagKey<Item> tag(String path) {
            return ItemTags.create(ResourceLocation.parse("sereneseasons" + ":" + path));
        }
    }
}
