package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.core.Holder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
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

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();
        if (!(entity instanceof Player || entity instanceof Villager || entity instanceof Animal ||
                entity instanceof AbstractGolem || entity instanceof Allay)) {
            return;
        }

        if (entity.tickCount % 100 != 0) return;

        // 获取实体当前所在的生物群系
        Holder<Biome> biomeHolder = entity.level().getBiome(entity.blockPosition());
        if (biomeHolder.is(ModBiomes.LONGEVITY_FOREST)) {
            MobEffectInstance currentEffect = entity.getEffect(MobEffects.HEALTH_BOOST);
            if (currentEffect == null || currentEffect.getDuration() < 1200) {
                entity.addEffect(new MobEffectInstance(
                        MobEffects.HEALTH_BOOST, 36600, 4));
                entity.addEffect(new MobEffectInstance(
                        MobEffects.HEAL, 1, 4));
            }
        }
    }

    @SubscribeEvent
    public static void onLivingTick2(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();
        if (!(entity instanceof Player || entity instanceof Villager || entity instanceof Animal ||
                entity instanceof AbstractGolem || entity instanceof Allay)) {
            return;
        }

        if (entity.tickCount % 40 != 0) return;

        Holder<Biome> biomeHolder = entity.level().getBiome(entity.blockPosition());
        if (biomeHolder.is(ModBiomes.PENGLAI)) {
            MobEffectInstance currentEffect1 = entity.getEffect(MobEffects.FIRE_RESISTANCE);
            MobEffectInstance currentEffect2 = entity.getEffect(MobEffects.WATER_BREATHING);
            MobEffectInstance currentEffect3 = entity.getEffect(MobEffects.DAMAGE_BOOST);
            MobEffectInstance currentEffect4 = entity.getEffect(MobEffects.LUCK);
            if (currentEffect1 == null || currentEffect1.getDuration() < 48300 ||
                    currentEffect2 == null || currentEffect2.getDuration() < 48300 ||
                    currentEffect3 == null || currentEffect3.getDuration() < 48300 ||
                    currentEffect4 == null || currentEffect4.getDuration() < 48300) {
                entity.addEffect(new MobEffectInstance(
                        MobEffects.SATURATION, 1, 4));
                entity.addEffect(new MobEffectInstance(
                        MobEffects.HEAL, 1, 4));
                entity.addEffect(new MobEffectInstance(
                        MobEffects.FIRE_RESISTANCE, 48600, 4));
                entity.addEffect(new MobEffectInstance(
                        MobEffects.WATER_BREATHING, 48600, 4));
                entity.addEffect(new MobEffectInstance(
                        MobEffects.DAMAGE_BOOST, 48600, 4));
                entity.addEffect(new MobEffectInstance(
                        MobEffects.LUCK, 48600, 4));
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerInteractEntity(PlayerInteractEvent.EntityInteract event) {
        if (event.getLevel().isClientSide) return;
        if (!(event.getTarget() instanceof ZombieVillager zombieVillager)) return;

        ItemStack stack = event.getItemStack();
        if (!stack.is(ModItems.GOLDEN_CRABAPPLE.get())) return;
        event.setCanceled(true);

        if (zombieVillager.isConverting()) {
            event.setCancellationResult(InteractionResult.CONSUME);
            return;
        }

        if (zombieVillager.hasEffect(MobEffects.WEAKNESS)) {
            stack.shrink(1);
            zombieVillager.startConverting(event.getEntity().getUUID(), zombieVillager.getRandom().nextInt(2401) + 3600);
            event.setCancellationResult(InteractionResult.SUCCESS);
        } else {
            event.setCancellationResult(InteractionResult.CONSUME);
        }
    }
}
