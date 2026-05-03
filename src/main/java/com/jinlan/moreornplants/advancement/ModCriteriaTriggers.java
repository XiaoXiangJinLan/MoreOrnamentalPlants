package com.jinlan.moreornplants.advancement;

import net.minecraft.advancements.CriteriaTriggers;

public class ModCriteriaTriggers {
    public static final MoonlightTrigger FLOWERS_AND_MOON = new MoonlightTrigger();

    public static void register() {
        CriteriaTriggers.register(FLOWERS_AND_MOON);
    }
}
