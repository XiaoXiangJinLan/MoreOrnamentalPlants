package com.jinlan.moreornplants.entity;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.ModBoatEntity;
import com.jinlan.moreornplants.entity.custom.ModChestBoatEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MoreOrnPlants.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () ->EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));
    public static final DeferredHolder<EntityType<?>, EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () ->EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));

    public static void register(IEventBus eventBus) {ENTITY_TYPES.register(eventBus);}
}
