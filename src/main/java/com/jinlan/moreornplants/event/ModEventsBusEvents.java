package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.entity.custom.BaihuaCat;
import com.jinlan.moreornplants.entity.custom.SuyuFox;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreOrnPlants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventsBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ZIYING_FOX.get(), ZiyingFox.createAttributes().build());
        event.put(ModEntities.SUYU_FOX.get(), SuyuFox.createAttributes().build());
        event.put(ModEntities.BAIHUA_CAT.get(), BaihuaCat.createAttributes().build());
    }
}
