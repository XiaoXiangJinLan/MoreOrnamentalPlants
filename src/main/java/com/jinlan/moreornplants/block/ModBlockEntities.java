package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.entity.xiangnang.*;
import com.jinlan.moreornplants.block.entity.ModHangingSignBlockEntity;
import com.jinlan.moreornplants.block.entity.ModSignBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, MoreOrnPlants.MODID);

    public static final Supplier<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.RED_MEI_SIGN.get(), ModBlocks.RED_MEI_WALL_SIGN.get(), ModBlocks.WHITE_MEI_SIGN.get(), ModBlocks.WHITE_MEI_WALL_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_WALL_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_WALL_SIGN.get(),
                            ModBlocks.CRABAPPLE_SIGN.get(), ModBlocks.CRABAPPLE_WALL_SIGN.get(),
                            ModBlocks.APRICOT_SIGN.get(), ModBlocks.APRICOT_WALL_SIGN.get(),
                            ModBlocks.PEACH_SIGN.get(), ModBlocks.PEACH_WALL_SIGN.get(),
                            ModBlocks.PEAR_SIGN.get(), ModBlocks.PEAR_WALL_SIGN.get(),
                            ModBlocks.PURPLE_LEAF_PLUM_SIGN.get(), ModBlocks.PURPLE_LEAF_PLUM_WALL_SIGN.get(),
                            ModBlocks.OSMANTHUS_SIGN.get(), ModBlocks.OSMANTHUS_WALL_SIGN.get(),
                            ModBlocks.GINKGO_SIGN.get(), ModBlocks.GINKGO_WALL_SIGN.get(),
                            ModBlocks.CHINESE_PARASOL_SIGN.get(), ModBlocks.CHINESE_PARASOL_WALL_SIGN.get(),
                            ModBlocks.SWEETGUM_SIGN.get(), ModBlocks.SWEETGUM_WALL_SIGN.get(),
                            ModBlocks.CAMPHOR_SIGN.get(), ModBlocks.CAMPHOR_WALL_SIGN.get(),
                            ModBlocks.DOVE_TREE_SIGN.get(), ModBlocks.DOVE_TREE_WALL_SIGN.get(),
                            ModBlocks.CHINABERRY_SIGN.get(), ModBlocks.CHINABERRY_WALL_SIGN.get(),
                            ModBlocks.DESERT_POPLAR_SIGN.get(), ModBlocks.DESERT_POPLAR_WALL_SIGN.get()).build(null));

    public static final Supplier<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.RED_MEI_HANGING_SIGN.get(), ModBlocks.RED_MEI_WALL_HANGING_SIGN.get(), ModBlocks.WHITE_MEI_HANGING_SIGN.get(), ModBlocks.WHITE_MEI_WALL_HANGING_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_HANGING_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_WALL_HANGING_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_HANGING_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_WALL_HANGING_SIGN.get(),
                            ModBlocks.CRABAPPLE_HANGING_SIGN.get(), ModBlocks.CRABAPPLE_WALL_HANGING_SIGN.get(),
                            ModBlocks.APRICOT_HANGING_SIGN.get(), ModBlocks.APRICOT_WALL_HANGING_SIGN.get(),
                            ModBlocks.PEACH_HANGING_SIGN.get(), ModBlocks.PEACH_WALL_HANGING_SIGN.get(),
                            ModBlocks.PEAR_HANGING_SIGN.get(), ModBlocks.PEAR_WALL_HANGING_SIGN.get(),
                            ModBlocks.PURPLE_LEAF_PLUM_HANGING_SIGN.get(), ModBlocks.PURPLE_LEAF_PLUM_WALL_HANGING_SIGN.get(),
                            ModBlocks.OSMANTHUS_HANGING_SIGN.get(), ModBlocks.OSMANTHUS_WALL_HANGING_SIGN.get(),
                            ModBlocks.GINKGO_HANGING_SIGN.get(), ModBlocks.GINKGO_WALL_HANGING_SIGN.get(),
                            ModBlocks.CHINESE_PARASOL_HANGING_SIGN.get(), ModBlocks.CHINESE_PARASOL_WALL_HANGING_SIGN.get(),
                            ModBlocks.SWEETGUM_HANGING_SIGN.get(), ModBlocks.SWEETGUM_WALL_HANGING_SIGN.get(),
                            ModBlocks.CAMPHOR_HANGING_SIGN.get(), ModBlocks.CAMPHOR_WALL_HANGING_SIGN.get(),
                            ModBlocks.DOVE_TREE_HANGING_SIGN.get(), ModBlocks.DOVE_TREE_WALL_HANGING_SIGN.get(),
                            ModBlocks.CHINABERRY_HANGING_SIGN.get(), ModBlocks.CHINABERRY_WALL_HANGING_SIGN.get(),
                            ModBlocks.DESERT_POPLAR_HANGING_SIGN.get(), ModBlocks.DESERT_POPLAR_WALL_HANGING_SIGN.get()).build(null));

    public static final Supplier<BlockEntityType<MeiXiangnangBlockEntity>> MEI_XIANGNANG =
            BLOCK_ENTITIES.register("mei_xiangnang", () ->
                    BlockEntityType.Builder.of(MeiXiangnangBlockEntity::new,
                            ModBlocks.MEI_XIANGNANG.get()).build(null));

    public static final Supplier<BlockEntityType<GuiXiangnangBlockEntity>> GUI_XIANGNANG =
            BLOCK_ENTITIES.register("gui_xiangnang", () ->
                    BlockEntityType.Builder.of(GuiXiangnangBlockEntity::new,
                            ModBlocks.OSMANTHUS_XIANGNANG.get()).build(null));

    public static final Supplier<BlockEntityType<LanXiangnangBlockEntity>> LAN_XIANGNANG =
            BLOCK_ENTITIES.register("lan_xiangnang", () ->
                    BlockEntityType.Builder.of(LanXiangnangBlockEntity::new,
                            ModBlocks.CYMBIDIUM_XIANGNANG.get()).build(null));

    public static final Supplier<BlockEntityType<LaMeiXiangnangBlockEntity>> LA_MEI_XIANGNANG =
            BLOCK_ENTITIES.register("la_mei_xiangnang", () ->
                    BlockEntityType.Builder.of(LaMeiXiangnangBlockEntity::new,
                            ModBlocks.WINTERSWEET_XIANGNANG.get(), ModBlocks.LILAC_XIANGNANG.get()).build(null));

    public static final Supplier<BlockEntityType<TaoXiangnangBlockEntity>> TAO_XIANGNANG =
            BLOCK_ENTITIES.register("tao_xiangnang", () ->
                    BlockEntityType.Builder.of(TaoXiangnangBlockEntity::new,
                            ModBlocks.PEACH_XIANGNANG.get(), ModBlocks.APRICOT_XIANGNANG.get(), ModBlocks.PEAR_XIANGNANG.get(), ModBlocks.LOTUS_XIANGNANG.get()).build(null));

    public static final Supplier<BlockEntityType<YueJiXiangnangBlockEntity>> YUE_JI_XIANGNANG =
            BLOCK_ENTITIES.register("yue_ji_xiangnang", () ->
                    BlockEntityType.Builder.of(YueJiXiangnangBlockEntity::new,
                            ModBlocks.CHINESE_ROSE_XIANGNANG.get(), ModBlocks.RUGOSA_ROSE_XIANGNANG.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
