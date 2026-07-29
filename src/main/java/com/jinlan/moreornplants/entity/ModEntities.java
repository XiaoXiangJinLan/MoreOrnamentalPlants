package com.jinlan.moreornplants.entity;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, MoreOrnPlants.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));
    public static final DeferredHolder<EntityType<?>, EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));

    public static final Supplier<EntityType<ZiyingFox>> ZIYING_FOX =
            ENTITY_TYPES.register("ziying_fox", () -> EntityType.Builder.of(ZiyingFox::new, MobCategory.CREATURE)
                    .sized(0.6F, 0.7F)
                    .eyeHeight(0.4F)
                    .passengerAttachments(new Vec3(0.0, 0.6375, -0.25))
                    .clientTrackingRange(8)
                    .immuneTo(Blocks.SWEET_BERRY_BUSH).build("ziying_fox"));
    public static final Supplier<EntityType<SuyuFox>> SUYU_FOX =
            ENTITY_TYPES.register("suyu_fox", () -> EntityType.Builder.of(SuyuFox::new, MobCategory.MONSTER)
                    .sized(0.6F, 0.7F)
                    .eyeHeight(0.4F)
                    .passengerAttachments(new Vec3(0.0, 0.6375, -0.25))
                    .clientTrackingRange(8)
                    .immuneTo(Blocks.SWEET_BERRY_BUSH).build("suyu_fox"));
    public static final Supplier<EntityType<BaihuaCat>> BAIHUA_CAT =
            ENTITY_TYPES.register("baihua_cat", () -> EntityType.Builder.of(BaihuaCat::new, MobCategory.MONSTER)
                    .sized(0.6F, 0.7F)
                    .eyeHeight(0.35F)
                    .passengerAttachments(0.5125F)
                    .clientTrackingRange(8).build("baihua_cat"));

    @SubscribeEvent
    public static void onRegisterAttributes(EntityAttributeCreationEvent event) {
        event.put(ZIYING_FOX.get(), ZiyingFox.createAttributes().build());
        event.put(SUYU_FOX.get(), SuyuFox.createAttributes().build());
        event.put(BAIHUA_CAT.get(), BaihuaCat.createAttributes().build());
    }

    public static void register(IEventBus eventBus) {ENTITY_TYPES.register(eventBus);}
}
