package com.jinlan.moreornplants.advancement;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.advancements.CriterionTrigger;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCriteriaTriggers {
    public static final DeferredRegister<CriterionTrigger<?>> TRIGGERS =
            DeferredRegister.create(BuiltInRegistries.TRIGGER_TYPES, MoreOrnPlants.MODID);

    public static final DeferredHolder<CriterionTrigger<?>, MoonlightTrigger> FLOWERS_AND_MOON =
            TRIGGERS.register("flowers_and_moon", MoonlightTrigger::new);

    public static void register(IEventBus eventBus) {
        TRIGGERS.register(eventBus);
    }
}
