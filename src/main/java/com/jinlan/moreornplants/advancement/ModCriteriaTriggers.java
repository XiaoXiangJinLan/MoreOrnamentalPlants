package com.jinlan.moreornplants.advancement;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModCriteriaTriggers {
    public static final MoonlightTrigger MOONLIGHT_TRIGGER = new MoonlightTrigger();

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            CriteriaTriggers.register(MOONLIGHT_TRIGGER);
        });
    }
}
