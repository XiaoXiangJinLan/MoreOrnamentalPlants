package com.jinlan.moreornplants.util;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks{
        public static final TagKey<Block> RED_MEI_LOGS = tag("red_mei_logs");
        public static final TagKey<Block> WHITE_MEI_LOGS = tag("white_mei_logs");
        public static final TagKey<Block> GREEN_CALYX_MEI_LOGS = tag("green_calyx_mei_logs");
        public static final TagKey<Block> DOUBLE_PINK_MEI_LOGS = tag("double_pink_mei_logs");
        public static final TagKey<Block> CRABAPPLE_LOGS = tag("crabapple_logs");
        public static final TagKey<Block> APRICOT_LOGS = tag("apricot_logs");
        public static final TagKey<Block> PEACH_LOGS = tag("peach_logs");
        public static final TagKey<Block> PEAR_LOGS = tag("pear_logs");
        public static final TagKey<Block> PURPLE_LEAF_PLUM_LOGS = tag("purple_leaf_plum_logs");
        public static final TagKey<Block> OSMANTHUS_LOGS = tag("osmanthus_logs");
        public static final TagKey<Block> GINKGO_LOGS = tag("ginkgo_logs");
        public static final TagKey<Block> CHINESE_PARASOL_LOGS = tag("chinese_parasol_logs");
        public static final TagKey<Block> SWEETGUM_LOGS = tag("sweetgum_logs");
        public static final TagKey<Block> CAMPHOR_LOGS = tag("camphor_logs");
        public static final TagKey<Block> MOTTLED_BAMBOO_PLANTABLE_ON = tag("mottled_bamboo_plantable_on");
        public static final TagKey<Block> BLACK_BAMBOO_PLANTABLE_ON = tag("black_bamboo_plantable_on");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MoreOrnPlants.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> RED_MEI_LOGS = tag("red_mei_logs");
        public static final TagKey<Item> WHITE_MEI_LOGS = tag("white_mei_logs");
        public static final TagKey<Item> GREEN_CALYX_MEI_LOGS = tag("green_calyx_mei_logs");
        public static final TagKey<Item> DOUBLE_PINK_MEI_LOGS = tag("double_pink_mei_logs");
        public static final TagKey<Item> CRABAPPLE_LOGS = tag("crabapple_logs");
        public static final TagKey<Item> APRICOT_LOGS = tag("apricot_logs");
        public static final TagKey<Item> PEACH_LOGS = tag("peach_logs");
        public static final TagKey<Item> PEAR_LOGS = tag("pear_logs");
        public static final TagKey<Item> PURPLE_LEAF_PLUM_LOGS = tag("purple_leaf_plum_logs");
        public static final TagKey<Item> OSMANTHUS_LOGS = tag("osmanthus_logs");
        public static final TagKey<Item> GINKGO_LOGS = tag("ginkgo_logs");
        public static final TagKey<Item> CHINESE_PARASOL_LOGS = tag("chinese_parasol_logs");
        public static final TagKey<Item> SWEETGUM_LOGS = tag("sweetgum_logs");
        public static final TagKey<Item> CAMPHOR_LOGS = tag("camphor_logs");
        public static final TagKey<Item> RED_DYE = tag("red_dye");
        public static final TagKey<Item> PINK_DYE = tag("pink_dye");
        public static final TagKey<Item> WHITE_DYE = tag("white_dye");
        public static final TagKey<Item> YELLOW_DYE = tag("yellow_dye");
        public static final TagKey<Item> LIME_DYE = tag("lime_dye");
        public static final TagKey<Item> GREEN_DYE = tag("green_dye");
        public static final TagKey<Item> PURPLE_DYE = tag("purple_dye");
        public static final TagKey<Item> LIGHT_BLUE_DYE = tag("light_blue_dye");
        public static final TagKey<Item> BLACK_DYE = tag("black_dye");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MoreOrnPlants.MOD_ID, name));
        }
    }
}
