package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreOrnPlants.MOD_ID)
public class ModEventsBusEvents {
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (!(event.getSource().getDirectEntity() instanceof Player player)) return;

        ItemStack weapon = player.getMainHandItem();
        LivingEntity target = event.getEntity();

        if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get()) && target.isInvertedHealAndHarm()) {
            event.setAmount(event.getAmount() * 9.9F);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get()) && target.getMobType() == MobType.ARTHROPOD) {
            event.setAmount(event.getAmount() * 2.2F);
        }
    }
}
