package com.jinlan.moreornplants.entity;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.ModBoatEntity;
import com.jinlan.moreornplants.entity.custom.ModChestBoatEntity;
import com.jinlan.moreornplants.entity.custom.SuyuFox;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () ->EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));
    public static final RegistryObject<EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () ->EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));

    public static final RegistryObject<EntityType<ZiyingFox>> ZIYING_FOX =
            ENTITY_TYPES.register("ziying_fox", () -> EntityType.Builder.of(ZiyingFox::new, MobCategory.CREATURE)
                    .sized(0.6F, 0.7F)
                    .clientTrackingRange(8)
                    .immuneTo(Blocks.SWEET_BERRY_BUSH).build("ziying_fox"));
    public static final RegistryObject<EntityType<SuyuFox>> SUYU_FOX =
            ENTITY_TYPES.register("suyu_fox", () -> EntityType.Builder.of(SuyuFox::new, MobCategory.CREATURE)
                    .sized(0.6F, 0.7F)
                    .clientTrackingRange(8)
                    .immuneTo(Blocks.SWEET_BERRY_BUSH).build("suyu_fox"));

    @SubscribeEvent
    public static void onRegisterAttributes(EntityAttributeCreationEvent event) {
        event.put(ZIYING_FOX.get(), ZiyingFox.createAttributes().build());
        event.put(SUYU_FOX.get(), SuyuFox.createAttributes().build());
    }

    public static void register(IEventBus eventBus) {ENTITY_TYPES.register(eventBus);}
}
