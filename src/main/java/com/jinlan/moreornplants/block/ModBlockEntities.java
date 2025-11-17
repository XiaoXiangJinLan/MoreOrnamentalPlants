package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.entity.ModHangingSignBlockEntity;
import com.jinlan.moreornplants.block.entity.ModSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
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
                            ModBlocks.CAMPHOR_SIGN.get(), ModBlocks.CAMPHOR_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
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
                            ModBlocks.CAMPHOR_HANGING_SIGN.get(), ModBlocks.CAMPHOR_WALL_HANGING_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
