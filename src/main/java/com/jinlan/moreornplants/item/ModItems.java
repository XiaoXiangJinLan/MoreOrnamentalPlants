package com.jinlan.moreornplants.item;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.entity.custom.ModBoatEntity;
import com.jinlan.moreornplants.item.custom.*;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MoreOrnPlants.MODID);

    public static final DeferredItem<Item> RED_MEI_SIGN =
            ITEMS.register("red_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.RED_MEI_SIGN.get(), ModBlocks.RED_MEI_WALL_SIGN.get()));
    public static final DeferredItem<Item> WHITE_MEI_SIGN =
            ITEMS.register("white_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WHITE_MEI_SIGN.get(), ModBlocks.WHITE_MEI_WALL_SIGN.get()));
    public static final DeferredItem<Item> GREEN_CALYX_MEI_SIGN =
            ITEMS.register("green_calyx_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GREEN_CALYX_MEI_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_WALL_SIGN.get()));
    public static final DeferredItem<Item> DOUBLE_PINK_MEI_SIGN =
            ITEMS.register("double_pink_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DOUBLE_PINK_MEI_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_WALL_SIGN.get()));
    public static final DeferredItem<Item> CRABAPPLE_SIGN =
            ITEMS.register("crabapple_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CRABAPPLE_SIGN.get(), ModBlocks.CRABAPPLE_WALL_SIGN.get()));
    public static final DeferredItem<Item> APRICOT_SIGN =
            ITEMS.register("apricot_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.APRICOT_SIGN.get(), ModBlocks.APRICOT_WALL_SIGN.get()));
    public static final DeferredItem<Item> PEACH_SIGN =
            ITEMS.register("peach_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PEACH_SIGN.get(), ModBlocks.PEACH_WALL_SIGN.get()));
    public static final DeferredItem<Item> PEAR_SIGN =
            ITEMS.register("pear_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PEAR_SIGN.get(), ModBlocks.PEAR_WALL_SIGN.get()));
    public static final DeferredItem<Item> PURPLE_LEAF_PLUM_SIGN =
            ITEMS.register("purple_leaf_plum_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PURPLE_LEAF_PLUM_SIGN.get(), ModBlocks.PURPLE_LEAF_PLUM_WALL_SIGN.get()));
    public static final DeferredItem<Item> OSMANTHUS_SIGN =
            ITEMS.register("osmanthus_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.OSMANTHUS_SIGN.get(), ModBlocks.OSMANTHUS_WALL_SIGN.get()));
    public static final DeferredItem<Item> GINKGO_SIGN =
            ITEMS.register("ginkgo_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GINKGO_SIGN.get(), ModBlocks.GINKGO_WALL_SIGN.get()));
    public static final DeferredItem<Item> CHINESE_PARASOL_SIGN =
            ITEMS.register("chinese_parasol_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CHINESE_PARASOL_SIGN.get(), ModBlocks.CHINESE_PARASOL_WALL_SIGN.get()));
    public static final DeferredItem<Item> SWEETGUM_SIGN =
            ITEMS.register("sweetgum_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.SWEETGUM_SIGN.get(), ModBlocks.SWEETGUM_WALL_SIGN.get()));
    public static final DeferredItem<Item> CAMPHOR_SIGN =
            ITEMS.register("camphor_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CAMPHOR_SIGN.get(), ModBlocks.CAMPHOR_WALL_SIGN.get()));
    public static final DeferredItem<Item> DOVE_TREE_SIGN =
            ITEMS.register("dove_tree_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DOVE_TREE_SIGN.get(), ModBlocks.DOVE_TREE_WALL_SIGN.get()));
    public static final DeferredItem<Item> CHINABERRY_SIGN =
            ITEMS.register("chinaberry_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CHINABERRY_SIGN.get(), ModBlocks.CHINABERRY_WALL_SIGN.get()));
    public static final DeferredItem<Item> DESERT_POPLAR_SIGN =
            ITEMS.register("desert_poplar_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DESERT_POPLAR_SIGN.get(), ModBlocks.DESERT_POPLAR_WALL_SIGN.get()));

    public static final DeferredItem<Item> RED_MEI_HANGING_SIGN =
            ITEMS.register("red_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.RED_MEI_HANGING_SIGN.get(), ModBlocks.RED_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> WHITE_MEI_HANGING_SIGN =
            ITEMS.register("white_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.WHITE_MEI_HANGING_SIGN.get(), ModBlocks.WHITE_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> GREEN_CALYX_MEI_HANGING_SIGN =
            ITEMS.register("green_calyx_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.GREEN_CALYX_MEI_HANGING_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> DOUBLE_PINK_MEI_HANGING_SIGN =
            ITEMS.register("double_pink_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.DOUBLE_PINK_MEI_HANGING_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> CRABAPPLE_HANGING_SIGN =
            ITEMS.register("crabapple_hanging_sign", () -> new HangingSignItem(ModBlocks.CRABAPPLE_HANGING_SIGN.get(), ModBlocks.CRABAPPLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> APRICOT_HANGING_SIGN =
            ITEMS.register("apricot_hanging_sign", () -> new HangingSignItem(ModBlocks.APRICOT_HANGING_SIGN.get(), ModBlocks.APRICOT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> PEACH_HANGING_SIGN =
            ITEMS.register("peach_hanging_sign", () -> new HangingSignItem(ModBlocks.PEACH_HANGING_SIGN.get(), ModBlocks.PEACH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> PEAR_HANGING_SIGN =
            ITEMS.register("pear_hanging_sign", () -> new HangingSignItem(ModBlocks.PEAR_HANGING_SIGN.get(), ModBlocks.PEAR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> PURPLE_LEAF_PLUM_HANGING_SIGN =
            ITEMS.register("purple_leaf_plum_hanging_sign", () -> new HangingSignItem(ModBlocks.PURPLE_LEAF_PLUM_HANGING_SIGN.get(), ModBlocks.PURPLE_LEAF_PLUM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> OSMANTHUS_HANGING_SIGN =
            ITEMS.register("osmanthus_hanging_sign", () -> new HangingSignItem(ModBlocks.OSMANTHUS_HANGING_SIGN.get(), ModBlocks.OSMANTHUS_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> GINKGO_HANGING_SIGN =
            ITEMS.register("ginkgo_hanging_sign", () -> new HangingSignItem(ModBlocks.GINKGO_HANGING_SIGN.get(), ModBlocks.GINKGO_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> CHINESE_PARASOL_HANGING_SIGN =
            ITEMS.register("chinese_parasol_hanging_sign", () -> new HangingSignItem(ModBlocks.CHINESE_PARASOL_HANGING_SIGN.get(), ModBlocks.CHINESE_PARASOL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> SWEETGUM_HANGING_SIGN =
            ITEMS.register("sweetgum_hanging_sign", () -> new HangingSignItem(ModBlocks.SWEETGUM_HANGING_SIGN.get(), ModBlocks.SWEETGUM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> CAMPHOR_HANGING_SIGN =
            ITEMS.register("camphor_hanging_sign", () -> new HangingSignItem(ModBlocks.CAMPHOR_HANGING_SIGN.get(), ModBlocks.CAMPHOR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> DOVE_TREE_HANGING_SIGN =
            ITEMS.register("dove_tree_hanging_sign", () -> new HangingSignItem(ModBlocks.DOVE_TREE_HANGING_SIGN.get(), ModBlocks.DOVE_TREE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> CHINABERRY_HANGING_SIGN =
            ITEMS.register("chinaberry_hanging_sign", () -> new HangingSignItem(ModBlocks.CHINABERRY_HANGING_SIGN.get(), ModBlocks.CHINABERRY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> DESERT_POPLAR_HANGING_SIGN =
            ITEMS.register("desert_poplar_hanging_sign", () -> new HangingSignItem(ModBlocks.DESERT_POPLAR_HANGING_SIGN.get(), ModBlocks.DESERT_POPLAR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final DeferredItem<Item> RED_MEI_BOAT =
            ITEMS.register("red_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.RED_MEI, new Item.Properties()));
    public static final DeferredItem<Item> RED_MEI_CHEST_BOAT =
            ITEMS.register("red_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.RED_MEI, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MEI_BOAT =
            ITEMS.register("white_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.WHITE_MEI, new Item.Properties()));
    public static final DeferredItem<Item> WHITE_MEI_CHEST_BOAT =
            ITEMS.register("white_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.WHITE_MEI, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_CALYX_MEI_BOAT =
            ITEMS.register("green_calyx_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.GREEN_CALYX_MEI, new Item.Properties()));
    public static final DeferredItem<Item> GREEN_CALYX_MEI_CHEST_BOAT =
            ITEMS.register("green_calyx_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.GREEN_CALYX_MEI, new Item.Properties()));
    public static final DeferredItem<Item> DOUBLE_PINK_MEI_BOAT =
            ITEMS.register("double_pink_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.DOUBLE_PINK_MEI, new Item.Properties()));
    public static final DeferredItem<Item> DOUBLE_PINK_MEI_CHEST_BOAT =
            ITEMS.register("double_pink_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.DOUBLE_PINK_MEI, new Item.Properties()));
    public static final DeferredItem<Item> CRABAPPLE_BOAT =
            ITEMS.register("crabapple_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CRABAPPLE, new Item.Properties()));
    public static final DeferredItem<Item> CRABAPPLE_CHEST_BOAT =
            ITEMS.register("crabapple_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CRABAPPLE, new Item.Properties()));
    public static final DeferredItem<Item> APRICOT_BOAT =
            ITEMS.register("apricot_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.APRICOT, new Item.Properties()));
    public static final DeferredItem<Item> APRICOT_CHEST_BOAT =
            ITEMS.register("apricot_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.APRICOT, new Item.Properties()));
    public static final DeferredItem<Item> PEACH_BOAT =
            ITEMS.register("peach_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PEACH, new Item.Properties()));
    public static final DeferredItem<Item> PEACH_CHEST_BOAT =
            ITEMS.register("peach_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PEACH, new Item.Properties()));
    public static final DeferredItem<Item> PEAR_BOAT =
            ITEMS.register("pear_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PEAR, new Item.Properties()));
    public static final DeferredItem<Item> PEAR_CHEST_BOAT =
            ITEMS.register("pear_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PEAR, new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_LEAF_PLUM_BOAT =
            ITEMS.register("purple_leaf_plum_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PURPLE_LEAF_PLUM, new Item.Properties()));
    public static final DeferredItem<Item> PURPLE_LEAF_PLUM_CHEST_BOAT =
            ITEMS.register("purple_leaf_plum_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PURPLE_LEAF_PLUM, new Item.Properties()));
    public static final DeferredItem<Item> OSMANTHUS_BOAT =
            ITEMS.register("osmanthus_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.OSMANTHUS, new Item.Properties()));
    public static final DeferredItem<Item> OSMANTHUS_CHEST_BOAT =
            ITEMS.register("osmanthus_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.OSMANTHUS, new Item.Properties()));
    public static final DeferredItem<Item> GINKGO_BOAT =
            ITEMS.register("ginkgo_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.GINKGO, new Item.Properties()));
    public static final DeferredItem<Item> GINKGO_CHEST_BOAT =
            ITEMS.register("ginkgo_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.GINKGO, new Item.Properties()));
    public static final DeferredItem<Item> SWEETGUM_BOAT =
            ITEMS.register("sweetgum_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.SWEETGUM, new Item.Properties()));
    public static final DeferredItem<Item> SWEETGUM_CHEST_BOAT =
            ITEMS.register("sweetgum_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.SWEETGUM, new Item.Properties()));
    public static final DeferredItem<Item> CHINESE_PARASOL_BOAT =
            ITEMS.register("chinese_parasol_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CHINESE_PARASOL, new Item.Properties()));
    public static final DeferredItem<Item> CHINESE_PARASOL_CHEST_BOAT =
            ITEMS.register("chinese_parasol_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CHINESE_PARASOL, new Item.Properties()));
    public static final DeferredItem<Item> CAMPHOR_BOAT =
            ITEMS.register("camphor_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CAMPHOR, new Item.Properties()));
    public static final DeferredItem<Item> CAMPHOR_CHEST_BOAT =
            ITEMS.register("camphor_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CAMPHOR, new Item.Properties()));
    public static final DeferredItem<Item> DOVE_TREE_BOAT =
            ITEMS.register("dove_tree_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.DOVE_TREE, new Item.Properties()));
    public static final DeferredItem<Item> DOVE_TREE_CHEST_BOAT =
            ITEMS.register("dove_tree_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.DOVE_TREE, new Item.Properties()));
    public static final DeferredItem<Item> CHINABERRY_BOAT =
            ITEMS.register("chinaberry_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CHINABERRY, new Item.Properties()));
    public static final DeferredItem<Item> CHINABERRY_CHEST_BOAT =
            ITEMS.register("chinaberry_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CHINABERRY, new Item.Properties()));
    public static final DeferredItem<Item> DESERT_POPLAR_BOAT =
            ITEMS.register("desert_poplar_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.DESERT_POPLAR, new Item.Properties()));
    public static final DeferredItem<Item> DESERT_POPLAR_CHEST_BOAT =
            ITEMS.register("desert_poplar_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.DESERT_POPLAR, new Item.Properties()));

    public static final DeferredItem<Item> ZIYING_FOX_SPAWN_EGG =
            ITEMS.register("ziying_fox_spawn_egg", () -> new SpawnEggItem(ModEntities.ZIYING_FOX.get(), 14144467, 12369084, new Item.Properties()));
    public static final DeferredItem<Item> SUYU_FOX_SPAWN_EGG =
            ITEMS.register("suyu_fox_spawn_egg", () -> new SpawnEggItem(ModEntities.SUYU_FOX.get(), 14144467, 12369084, new Item.Properties()));
    public static final DeferredItem<Item> BAIHUA_CAI_SPAWN_EGG =
            ITEMS.register("baihua_cat_spawn_egg", () -> new SpawnEggItem(ModEntities.BAIHUA_CAT.get(), 14144467, 12369084, new Item.Properties()));

    public static final DeferredItem<Item> ZIYING_BEAD =
            ITEMS.register("ziying_bead", () -> new ZiyingBeadItem(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> SUYU_BEAD =
            ITEMS.register("suyu_bead", () -> new SuyuBeadItem(new Item.Properties().rarity(Rarity.RARE)));
    public static final DeferredItem<Item> ZIYU_YUANYANG_BEAD =
            ITEMS.register("ziyu_yuanyang_bead", () -> new ZiyuBeadItem(new Item.Properties().rarity(Rarity.RARE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));

    public static final DeferredItem<Item> CRAPE_MYRTLE_LOG =
            ITEMS.register("crape_myrtle_log", () -> new CrapeMyrtleLogBlockItem(ModBlocks.CRAPE_MYRTLE_LOG.get(), new Item.Properties()));
    public static final DeferredItem<Item> CRAPE_MYRTLE_WOOD =
            ITEMS.register("crape_myrtle_wood", () -> new CrapeMyrtleLogBlockItem(ModBlocks.CRAPE_MYRTLE_WOOD.get(), new Item.Properties()));

    public static final DeferredItem<Item> ORNAMENTAL_PEACH_PETALS =
            ITEMS.register("ornamental_peach_petals", () -> new LeafPileBlockItem(ModBlocks.ORNAMENTAL_PEACH_PETALS.get(), new Item.Properties()));
    public static final DeferredItem<Item> WILD_PEACH_PETALS =
            ITEMS.register("wild_peach_petals", () -> new LeafPileBlockItem(ModBlocks.WILD_PEACH_PETALS.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHINESE_PARASOL_LEAF_0 =
            ITEMS.register("chinese_parasol_leaf_0", () -> new LeafPileUseItemNameBlockItem(ModBlocks.CHINESE_PARASOL_LEAF_0.get(), new Item.Properties()));
    public static final DeferredItem<Item> CHINESE_PARASOL_LEAF_1 =
            ITEMS.register("chinese_parasol_leaf_1", () -> new LeafPileUseItemNameBlockItem(ModBlocks.CHINESE_PARASOL_LEAF_1.get(), new Item.Properties()));
    public static final DeferredItem<Item> SWEETGUM_LEAF_0 =
            ITEMS.register("sweetgum_leaf_0", () -> new LeafPileUseItemNameBlockItem(ModBlocks.SWEETGUM_LEAF_PILE_0.get(), new Item.Properties()));
    public static final DeferredItem<Item> SWEETGUM_LEAF_1 =
            ITEMS.register("sweetgum_leaf_1", () -> new LeafPileUseItemNameBlockItem(ModBlocks.SWEETGUM_LEAF_PILE_1.get(), new Item.Properties()));
    public static final DeferredItem<Item> GINKGO_LEAF =
            ITEMS.register("ginkgo_leaf", () -> new LeafPileUseItemNameBlockItem(ModBlocks.GINKGO_LEAF_PILE.get(), new Item.Properties()));

    public static final DeferredItem<Item> BAMBOO_STICK =
            ITEMS.register("bamboo_stick", () -> new BambooStickItem(ModBlocks.BAMBOO_STICK.get(), new Item.Properties()));
    public static final DeferredItem<Item> PEACH_WOODEN_SWORD =
            ITEMS.register("peach_wooden_sword", () -> new PeachWoodenSwordItem(Tiers.WOOD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.WOOD, 3, -2.4F))));
    public static final DeferredItem<Item> CAMPHOR_WOODEN_SWORD =
            ITEMS.register("camphor_wooden_sword", () -> new CamphorWoodenSwordItem(Tiers.WOOD, new Item.Properties().attributes(SwordItem.createAttributes(Tiers.WOOD, 3, -2.4F))));
    public static final DeferredItem<Item> ZIYING_SWORD =
            ITEMS.register("ziying_sword", () -> new ModRangeSwordItem(ModTiers.ZIYING, new Item.Properties().attributes(ModRangeSwordItem.createAttributes(ModTiers.ZIYING, 3, -2.4F, 1.0F))));
    public static final DeferredItem<Item> SUYU_SWORD =
            ITEMS.register("suyu_sword", () -> new ModRangeSwordItem(ModTiers.SUYU, new Item.Properties().attributes(ModRangeSwordItem.createAttributes(ModTiers.SUYU, 3, -1.6F, 1.0F))));
    public static final DeferredItem<Item> ZIYU_YUANYANG_SWORD =
            ITEMS.register("ziyu_yuanyang_sword", () -> new ModRangeSwordItem(ModTiers.ZIYU_YUANYANG, new Item.Properties().attributes(ModRangeSwordItem.createAttributes(ModTiers.ZIYU_YUANYANG, 3, -2.4F, 1.0F))));
    public static final DeferredItem<Item> ZIYING_AXE =
            ITEMS.register("ziying_axe", () -> new AxeItem(ModTiers.ZIYING, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.ZIYING, 6.0F, -3.0F))));
    public static final DeferredItem<Item> SUYU_AXE =
            ITEMS.register("suyu_axe", () -> new AxeItem(ModTiers.SUYU, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.SUYU, 6.0F, -2.6F))));
    public static final DeferredItem<Item> ZIYU_YUANYANG_AXE =
            ITEMS.register("ziyu_yuanyang_axe", () -> new AxeItem(ModTiers.ZIYU_YUANYANG, new Item.Properties().attributes(AxeItem.createAttributes(ModTiers.ZIYU_YUANYANG, 6.0F, -3.0F))));
    public static final DeferredItem<Item> ZIYING_PICKAXE =
            ITEMS.register("ziying_pickaxe", () -> new PickaxeItem(ModTiers.ZIYING, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.ZIYING, 1.0F, -2.8F))));
    public static final DeferredItem<Item> SUYU_PICKAXE =
            ITEMS.register("suyu_pickaxe", () -> new PickaxeItem(ModTiers.SUYU, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.SUYU, 1.0F, -2.0F))));
    public static final DeferredItem<Item> ZIYU_YUANYANG_PICKAXE =
            ITEMS.register("ziyu_yuanyang_pickaxe", () -> new PickaxeItem(ModTiers.ZIYU_YUANYANG, new Item.Properties().attributes(PickaxeItem.createAttributes(ModTiers.ZIYU_YUANYANG, 1.0F, -2.8F))));
    public static final DeferredItem<Item> ZHUIYUE_SWORD =
            ITEMS.register("zhuiyue_sword", () -> new ZhuiyueSwordItem(new Item.Properties().durability(9999)));
    public static final DeferredItem<Item> CAIYUN_SWORD =
            ITEMS.register("caiyun_sword", () -> new CaiyunSwordItem(new Item.Properties().durability(5555)));

    public static final DeferredItem<Item> MOTTLED_BAMBOO =
            ITEMS.register("mottled_bamboo", () -> new modBambooBlockItem(ModBlocks.MOTTLED_BAMBOO.get(), new Item.Properties()));
    public static final DeferredItem<Item> BLACK_BAMBOO =
            ITEMS.register("black_bamboo", () -> new modBambooBlockItem(ModBlocks.BLACK_BAMBOO.get(), new Item.Properties()));
    public static final DeferredItem<Item> PEELED_BAMBOO_SHOOTS =
            ITEMS.register("peeled_bamboo_shoots", () -> new Item(new Item.Properties().food(ModFoods.PEELED_BAMBOO_SHOOTS)));
    public static final DeferredItem<Item> BAMBOO_SHOOTS_SOUP =
            ITEMS.register("bamboo_shoots_soup", () -> new Item(new Item.Properties().food(ModFoods.BAMBOO_SHOOTS_SOUP)));

    public static final DeferredItem<Item> LOTUS_ROOT =
            ITEMS.register("lotus_root", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_ROOT)));
    public static final DeferredItem<Item> LOTUS_ROOT_SOUP =
            ITEMS.register("lotus_root_soup", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_ROOT_SOUP)));
    public static final DeferredItem<Item> LOTUS_SEED =
            ITEMS.register("lotus_seed", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_SEED)));
    public static final DeferredItem<Item> LOTUS_SEED_POD =
            ITEMS.register("lotus_seed_pod", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LOTUS_SEED_SOUP =
            ITEMS.register("lotus_seed_soup", () -> new Item(new Item.Properties().food(ModFoods.LOTUS_SEED_SOUP)));

    public static final DeferredItem<Item> CRABAPPLE =
            ITEMS.register("crabapple", () -> new Item(new Item.Properties().food(ModFoods.CRABAPPLE)));
    public static final DeferredItem<Item> GOLDEN_CRABAPPLE =
            ITEMS.register("golden_crabapple", () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(ModFoods.GOLDEN_CRABAPPLE)));
    public static final DeferredItem<Item> ENCHANTED_GOLDEN_CRABAPPLE =
            ITEMS.register("enchanted_golden_crabapple", () -> new Item(new Item.Properties().rarity(Rarity.EPIC).food(ModFoods.ENCHANTED_GOLDEN_CRABAPPLE).component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)));
    public static final DeferredItem<Item> CLOUD_APRICOT =
            ITEMS.register("cloud_apricot", () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(ModFoods.APRICOT)));
    public static final DeferredItem<Item> IMMORTAL_PEACH =
            ITEMS.register("immortal_peach", () -> new Item(new Item.Properties().rarity(Rarity.RARE).food(ModFoods.PEACH)));

    public static final DeferredItem<Item> MEI_XIANGNANG =
            ITEMS.register("mei_xiangnang", () -> new MeiXiangnangItem(ModBlocks.MEI_XIANGNANG.get(), new Item.Properties(), 300, 1));
    public static final DeferredItem<Item> OSMANTHUS_XIANGNANG =
            ITEMS.register("osmanthus_xiangnang", () -> new XiangnangItem(ModBlocks.OSMANTHUS_XIANGNANG.get(), new Item.Properties(), 600, 1));
    public static final DeferredItem<Item> CYMBIDIUM_XIANGNANG =
            ITEMS.register("cymbidium_xiangnang", () -> new XiangnangItem(ModBlocks.CYMBIDIUM_XIANGNANG.get(), new Item.Properties(), 300, 2));
    public static final DeferredItem<Item> WINTERSWEET_XIANGNANG =
            ITEMS.register("wintersweet_xiangnang", () -> new XiangnangItem(ModBlocks.WINTERSWEET_XIANGNANG.get(), new Item.Properties(), 300, 1));
    public static final DeferredItem<Item> LILAC_XIANGNANG =
            ITEMS.register("lilac_xiangnang", () -> new XiangnangItem(ModBlocks.LILAC_XIANGNANG.get(), new Item.Properties(), 300, 1));
    public static final DeferredItem<Item> CHINESE_ROSE_XIANGNANG =
            ITEMS.register("chinese_rose_xiangnang", () -> new XiangnangItem(ModBlocks.CHINESE_ROSE_XIANGNANG.get(), new Item.Properties(), 300, 1));
    public static final DeferredItem<Item> RUGOSA_ROSE_XIANGNANG =
            ITEMS.register("rugosa_rose_xiangnang", () -> new XiangnangItem(ModBlocks.RUGOSA_ROSE_XIANGNANG.get(), new Item.Properties(), 300, 1));
    public static final DeferredItem<Item> APRICOT_XIANGNANG =
            ITEMS.register("apricot_xiangnang", () -> new XiangnangItem(ModBlocks.APRICOT_XIANGNANG.get(), new Item.Properties(), 300, 0));
    public static final DeferredItem<Item> PEACH_XIANGNANG =
            ITEMS.register("peach_xiangnang", () -> new XiangnangItem(ModBlocks.PEACH_XIANGNANG.get(), new Item.Properties(), 300, 0));
    public static final DeferredItem<Item> PEAR_XIANGNANG =
            ITEMS.register("pear_xiangnang", () -> new XiangnangItem(ModBlocks.PEAR_XIANGNANG.get(), new Item.Properties(), 300, 0));
    public static final DeferredItem<Item> LOTUS_XIANGNANG =
            ITEMS.register("lotus_xiangnang", () -> new XiangnangItem(ModBlocks.LOTUS_XIANGNANG.get(), new Item.Properties(), 300, 0));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
