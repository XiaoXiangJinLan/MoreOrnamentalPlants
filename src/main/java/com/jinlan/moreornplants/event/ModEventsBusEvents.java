package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

@EventBusSubscriber(modid = MoreOrnPlants.MODID)
public class ModEventsBusEvents {
    @SubscribeEvent
    public static void onLivingDamage(LivingIncomingDamageEvent event) {
        if (!(event.getSource().getDirectEntity() instanceof Player player)) return;

        ItemStack weapon = player.getMainHandItem();
        LivingEntity target = event.getEntity();

        if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get()) && target.isInvertedHealAndHarm()) {
            event.setAmount(event.getAmount() * 9.9F);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get()) && target.getType().is(EntityTypeTags.ARTHROPOD)) {
            event.setAmount(event.getAmount() * 2.2F);
        }
    }
}
