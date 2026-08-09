package com.jinlan.moreornplants.util;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
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
        public static final TagKey<Block> DOVE_TREE_LOGS = tag("dove_tree_logs");
        public static final TagKey<Block> CHINABERRY_LOGS = tag("chinaberry_logs");
        public static final TagKey<Block> DESERT_POPLAR_LOGS = tag("desert_poplar_logs");
        public static final TagKey<Block> MOTTLED_BAMBOO_PLANTABLE_ON = tag("mottled_bamboo_plantable_on");
        public static final TagKey<Block> BLACK_BAMBOO_PLANTABLE_ON = tag("black_bamboo_plantable_on");
        public static final TagKey<Block> ZIYING_FOX_SPAWNABLE_ON = tag("ziying_fox_spawnable_on");

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
        public static final TagKey<Item> DOVE_TREE_LOGS = tag("dove_tree_logs");
        public static final TagKey<Item> CHINABERRY_LOGS = tag("chinaberry_logs");
        public static final TagKey<Item> DESERT_POPLAR_LOGS = tag("desert_poplar_logs");
        public static final TagKey<Item> MEI_SAPLING = tag("mei_sapling");
        public static final TagKey<Item> CRABAPPLE_SAPLING = tag("crabapple_sapling");
        public static final TagKey<Item> RED_DYE = tag("red_dye");
        public static final TagKey<Item> PINK_DYE = tag("pink_dye");
        public static final TagKey<Item> WHITE_DYE = tag("white_dye");
        public static final TagKey<Item> YELLOW_DYE = tag("yellow_dye");
        public static final TagKey<Item> ORANGE_DYE = tag("orange_dye");
        public static final TagKey<Item> MAGENTA_DYE = tag("magenta_dye");
        public static final TagKey<Item> LIME_DYE = tag("lime_dye");
        public static final TagKey<Item> GREEN_DYE = tag("green_dye");
        public static final TagKey<Item> PURPLE_DYE = tag("purple_dye");
        public static final TagKey<Item> LIGHT_BLUE_DYE = tag("light_blue_dye");
        public static final TagKey<Item> BLUE_DYE = tag("blue_dye");
        public static final TagKey<Item> BLACK_DYE = tag("black_dye");
        public static final TagKey<Item> ZIYING_FOX_FOOD = tag("ziying_fox_food");
        public static final TagKey<Item> ZIYING_FOX_APPEAL_TO = tag("ziying_fox_appeal_to");
        public static final TagKey<Item> SUYU_FOX_FOOD = tag("suyu_fox_food");
        public static final TagKey<Item> SUYU_FOX_APPEAL_TO = tag("suyu_fox_appeal_to");
        public static final TagKey<Item> BAIHUA_CAT_FOOD = tag("baihua_cat_food");
        public static final TagKey<Item> ZIYING_TOOLS = tag("ziying_tools");
        public static final TagKey<Item> SUYU_TOOLS = tag("suyu_tools");
        public static final TagKey<Item> ZIYU_YUANYANG_TOOLS = tag("ziyu_yuanyang_tools");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MoreOrnPlants.MOD_ID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> CRABAPPLE_BEARING = tag("crabapple_bearing");
        public static final TagKey<Biome> PEACH_BEARING = tag("peach_bearing");
        public static final TagKey<Biome> APRICOT_BEARING = tag("apricot_bearing");
        public static final TagKey<Biome> NO_ENEMY = tag("no_enemy");
        public static final TagKey<Biome> FLOWERS_AND_MOON = tag("flowers_and_moon");
        public static final TagKey<Biome> PINK_BAIHUA_CAT = tag("pink_baihua_cat");
        public static final TagKey<Biome> BLUE_BAIHUA_CAT = tag("blue_baihua_cat");
        public static final TagKey<Biome> PURPLE_BAIHUA_CAT = tag("purple_baihua_cat");

        private static TagKey<Biome> tag(String name) {
            return TagKey.create(Registries.BIOME, new ResourceLocation(MoreOrnPlants.MOD_ID, name));
        }
    }
}
