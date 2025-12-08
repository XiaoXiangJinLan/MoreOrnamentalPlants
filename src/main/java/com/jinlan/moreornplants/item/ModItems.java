package com.jinlan.moreornplants.item;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.entity.custom.ModBoatEntity;
import com.jinlan.moreornplants.item.custom.ModBoatItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<Item> RED_MEI_SIGN =
            ITEMS.register("red_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.RED_MEI_SIGN.get(), ModBlocks.RED_MEI_WALL_SIGN.get()));
    public static final RegistryObject<Item> WHITE_MEI_SIGN =
            ITEMS.register("white_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.WHITE_MEI_SIGN.get(), ModBlocks.WHITE_MEI_WALL_SIGN.get()));
    public static final RegistryObject<Item> GREEN_CALYX_MEI_SIGN =
            ITEMS.register("green_calyx_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GREEN_CALYX_MEI_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_WALL_SIGN.get()));
    public static final RegistryObject<Item> DOUBLE_PINK_MEI_SIGN =
            ITEMS.register("double_pink_mei_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DOUBLE_PINK_MEI_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_WALL_SIGN.get()));
    public static final RegistryObject<Item> CRABAPPLE_SIGN =
            ITEMS.register("crabapple_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CRABAPPLE_SIGN.get(), ModBlocks.CRABAPPLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> APRICOT_SIGN =
            ITEMS.register("apricot_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.APRICOT_SIGN.get(), ModBlocks.APRICOT_WALL_SIGN.get()));
    public static final RegistryObject<Item> PEACH_SIGN =
            ITEMS.register("peach_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PEACH_SIGN.get(), ModBlocks.PEACH_WALL_SIGN.get()));
    public static final RegistryObject<Item> PEAR_SIGN =
            ITEMS.register("pear_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PEAR_SIGN.get(), ModBlocks.PEAR_WALL_SIGN.get()));
    public static final RegistryObject<Item> PURPLE_LEAF_PLUM_SIGN =
            ITEMS.register("purple_leaf_plum_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.PURPLE_LEAF_PLUM_SIGN.get(), ModBlocks.PURPLE_LEAF_PLUM_WALL_SIGN.get()));
    public static final RegistryObject<Item> OSMANTHUS_SIGN =
            ITEMS.register("osmanthus_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.OSMANTHUS_SIGN.get(), ModBlocks.OSMANTHUS_WALL_SIGN.get()));
    public static final RegistryObject<Item> GINKGO_SIGN =
            ITEMS.register("ginkgo_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GINKGO_SIGN.get(), ModBlocks.GINKGO_WALL_SIGN.get()));
    public static final RegistryObject<Item> CHINESE_PARASOL_SIGN =
            ITEMS.register("chinese_parasol_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CHINESE_PARASOL_SIGN.get(), ModBlocks.CHINESE_PARASOL_WALL_SIGN.get()));
    public static final RegistryObject<Item> SWEETGUM_SIGN =
            ITEMS.register("sweetgum_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.SWEETGUM_SIGN.get(), ModBlocks.SWEETGUM_WALL_SIGN.get()));
    public static final RegistryObject<Item> CAMPHOR_SIGN =
            ITEMS.register("camphor_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.CAMPHOR_SIGN.get(), ModBlocks.CAMPHOR_WALL_SIGN.get()));

    public static final RegistryObject<Item> RED_MEI_HANGING_SIGN =
            ITEMS.register("red_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.RED_MEI_HANGING_SIGN.get(), ModBlocks.RED_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> WHITE_MEI_HANGING_SIGN =
            ITEMS.register("white_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.WHITE_MEI_HANGING_SIGN.get(), ModBlocks.WHITE_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GREEN_CALYX_MEI_HANGING_SIGN =
            ITEMS.register("green_calyx_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.GREEN_CALYX_MEI_HANGING_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DOUBLE_PINK_MEI_HANGING_SIGN =
            ITEMS.register("double_pink_mei_hanging_sign", () -> new HangingSignItem(ModBlocks.DOUBLE_PINK_MEI_HANGING_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CRABAPPLE_HANGING_SIGN =
            ITEMS.register("crabapple_hanging_sign", () -> new HangingSignItem(ModBlocks.CRABAPPLE_HANGING_SIGN.get(), ModBlocks.CRABAPPLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> APRICOT_HANGING_SIGN =
            ITEMS.register("apricot_hanging_sign", () -> new HangingSignItem(ModBlocks.APRICOT_HANGING_SIGN.get(), ModBlocks.APRICOT_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PEACH_HANGING_SIGN =
            ITEMS.register("peach_hanging_sign", () -> new HangingSignItem(ModBlocks.PEACH_HANGING_SIGN.get(), ModBlocks.PEACH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PEAR_HANGING_SIGN =
            ITEMS.register("pear_hanging_sign", () -> new HangingSignItem(ModBlocks.PEAR_HANGING_SIGN.get(), ModBlocks.PEAR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> PURPLE_LEAF_PLUM_HANGING_SIGN =
            ITEMS.register("purple_leaf_plum_hanging_sign", () -> new HangingSignItem(ModBlocks.PURPLE_LEAF_PLUM_HANGING_SIGN.get(), ModBlocks.PURPLE_LEAF_PLUM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> OSMANTHUS_HANGING_SIGN =
            ITEMS.register("osmanthus_hanging_sign", () -> new HangingSignItem(ModBlocks.OSMANTHUS_HANGING_SIGN.get(), ModBlocks.OSMANTHUS_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> GINKGO_HANGING_SIGN =
            ITEMS.register("ginkgo_hanging_sign", () -> new HangingSignItem(ModBlocks.GINKGO_HANGING_SIGN.get(), ModBlocks.GINKGO_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CHINESE_PARASOL_HANGING_SIGN =
            ITEMS.register("chinese_parasol_hanging_sign", () -> new HangingSignItem(ModBlocks.CHINESE_PARASOL_HANGING_SIGN.get(), ModBlocks.CHINESE_PARASOL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SWEETGUM_HANGING_SIGN =
            ITEMS.register("sweetgum_hanging_sign", () -> new HangingSignItem(ModBlocks.SWEETGUM_HANGING_SIGN.get(), ModBlocks.SWEETGUM_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> CAMPHOR_HANGING_SIGN =
            ITEMS.register("camphor_hanging_sign", () -> new HangingSignItem(ModBlocks.CAMPHOR_HANGING_SIGN.get(), ModBlocks.CAMPHOR_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> RED_MEI_BOAT =
            ITEMS.register("red_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.RED_MEI, new Item.Properties()));
    public static final RegistryObject<Item> RED_MEI_CHEST_BOAT =
            ITEMS.register("red_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.RED_MEI, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MEI_BOAT =
            ITEMS.register("white_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.WHITE_MEI, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_MEI_CHEST_BOAT =
            ITEMS.register("white_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.WHITE_MEI, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CALYX_MEI_BOAT =
            ITEMS.register("green_calyx_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.GREEN_CALYX_MEI, new Item.Properties()));
    public static final RegistryObject<Item> GREEN_CALYX_MEI_CHEST_BOAT =
            ITEMS.register("green_calyx_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.GREEN_CALYX_MEI, new Item.Properties()));
    public static final RegistryObject<Item> DOUBLE_PINK_MEI_BOAT =
            ITEMS.register("double_pink_mei_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.DOUBLE_PINK_MEI, new Item.Properties()));
    public static final RegistryObject<Item> DOUBLE_PINK_MEI_CHEST_BOAT =
            ITEMS.register("double_pink_mei_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.DOUBLE_PINK_MEI, new Item.Properties()));
    public static final RegistryObject<Item> CRABAPPLE_BOAT =
            ITEMS.register("crabapple_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CRABAPPLE, new Item.Properties()));
    public static final RegistryObject<Item> CRABAPPLE_CHEST_BOAT =
            ITEMS.register("crabapple_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CRABAPPLE, new Item.Properties()));
    public static final RegistryObject<Item> APRICOT_BOAT =
            ITEMS.register("apricot_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.APRICOT, new Item.Properties()));
    public static final RegistryObject<Item> APRICOT_CHEST_BOAT =
            ITEMS.register("apricot_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.APRICOT, new Item.Properties()));
    public static final RegistryObject<Item> PEACH_BOAT =
            ITEMS.register("peach_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PEACH, new Item.Properties()));
    public static final RegistryObject<Item> PEACH_CHEST_BOAT =
            ITEMS.register("peach_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PEACH, new Item.Properties()));
    public static final RegistryObject<Item> PEAR_BOAT =
            ITEMS.register("pear_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PEAR, new Item.Properties()));
    public static final RegistryObject<Item> PEAR_CHEST_BOAT =
            ITEMS.register("pear_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PEAR, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LEAF_PLUM_BOAT =
            ITEMS.register("purple_leaf_plum_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.PURPLE_LEAF_PLUM, new Item.Properties()));
    public static final RegistryObject<Item> PURPLE_LEAF_PLUM_CHEST_BOAT =
            ITEMS.register("purple_leaf_plum_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.PURPLE_LEAF_PLUM, new Item.Properties()));
    public static final RegistryObject<Item> OSMANTHUS_BOAT =
            ITEMS.register("osmanthus_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.OSMANTHUS, new Item.Properties()));
    public static final RegistryObject<Item> OSMANTHUS_CHEST_BOAT =
            ITEMS.register("osmanthus_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.OSMANTHUS, new Item.Properties()));
    public static final RegistryObject<Item> GINKGO_BOAT =
            ITEMS.register("ginkgo_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.GINKGO, new Item.Properties()));
    public static final RegistryObject<Item> GINKGO_CHEST_BOAT =
            ITEMS.register("ginkgo_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.GINKGO, new Item.Properties()));
    public static final RegistryObject<Item> SWEETGUM_BOAT =
            ITEMS.register("sweetgum_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.SWEETGUM, new Item.Properties()));
    public static final RegistryObject<Item> SWEETGUM_CHEST_BOAT =
            ITEMS.register("sweetgum_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.SWEETGUM, new Item.Properties()));
    public static final RegistryObject<Item> CHINESE_PARASOL_BOAT =
            ITEMS.register("chinese_parasol_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CHINESE_PARASOL, new Item.Properties()));
    public static final RegistryObject<Item> CHINESE_PARASOL_CHEST_BOAT =
            ITEMS.register("chinese_parasol_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CHINESE_PARASOL, new Item.Properties()));
    public static final RegistryObject<Item> CAMPHOR_BOAT =
            ITEMS.register("camphor_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.CAMPHOR, new Item.Properties()));
    public static final RegistryObject<Item> CAMPHOR_CHEST_BOAT =
            ITEMS.register("camphor_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.CAMPHOR, new Item.Properties()));

    public static final RegistryObject<Item> MOTTLED_BAMBOO_SHOOTS =
            ITEMS.register("mottled_bamboo_shoots", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_BAMBOO_SHOOTS =
            ITEMS.register("black_bamboo_shoots", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEELED_BAMBOO_SHOOTS =
            ITEMS.register("peeled_bamboo_shoots", () -> new Item((new Item.Properties()).food(ModFoods.PEELED_BAMBOO_SHOOTS)));
    public static final RegistryObject<Item> BAMBOO_SHOOTS_SOUP =
            ITEMS.register("bamboo_shoots_soup", () -> new Item((new Item.Properties()).food(ModFoods.BAMBOO_SHOOTS_SOUP)));

    public static final RegistryObject<Item> LOTUS_ROOT =
            ITEMS.register("lotus_root", () -> new Item((new Item.Properties()).food(ModFoods.LOTUS_ROOT)));
    public static final RegistryObject<Item> LOTUS_ROOT_SOUP =
            ITEMS.register("lotus_root_soup", () -> new Item((new Item.Properties()).food(ModFoods.LOTUS_ROOT_SOUP)));
    public static final RegistryObject<Item> LOTUS_SEED =
            ITEMS.register("lotus_seed", () -> new Item((new Item.Properties()).food(ModFoods.LOTUS_SEED)));
    public static final RegistryObject<Item> LOTUS_SEED_POD =
            ITEMS.register("lotus_seed_pod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOTUS_SEED_SOUP =
            ITEMS.register("lotus_seed_soup", () -> new Item((new Item.Properties()).food(ModFoods.LOTUS_SEED_SOUP)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
