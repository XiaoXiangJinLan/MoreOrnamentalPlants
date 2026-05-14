package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class MeiXiangnangItem extends BlockItem {
    private final int effectDuration;
    private final int effectAmplifier;

    public MeiXiangnangItem(Block block, Properties properties, int effectDuration, int effectAmplifier) {
        super(block, properties);
        this.effectDuration = effectDuration;
        this.effectAmplifier = effectAmplifier;
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);

        if (!level.isClientSide && entity instanceof LivingEntity livingEntity) {
            boolean isHeld = false;

            if (entity instanceof Player player) {
                if (player.getMainHandItem() == stack || player.getOffhandItem() == stack) {
                    isHeld = true;
                }

                if (!player.isSpectator() && isHeld) {
                    MobEffectInstance currentEffect = livingEntity.getEffect(MobEffects.REGENERATION);
                    MobEffectInstance currentEffect2 = livingEntity.getEffect(MobEffects.DAMAGE_BOOST);
                    MobEffectInstance currentEffect3 = livingEntity.getEffect(MobEffects.DAMAGE_RESISTANCE);
                    MobEffectInstance currentEffect4 = livingEntity.getEffect(MobEffects.DIG_SPEED);

                    if (currentEffect == null || currentEffect.getDuration() < 260 ||
                            currentEffect2 == null || currentEffect2.getDuration() < 260 ||
                            currentEffect3 == null || currentEffect3.getDuration() < 260 ||
                            currentEffect4 == null || currentEffect4.getDuration() < 260) {
                        livingEntity.addEffect(new MobEffectInstance(
                                MobEffects.REGENERATION, effectDuration, effectAmplifier));
                        livingEntity.addEffect(new MobEffectInstance(
                                MobEffects.DAMAGE_BOOST, effectDuration, 0));
                        livingEntity.addEffect(new MobEffectInstance(
                                MobEffects.DAMAGE_RESISTANCE, effectDuration, 0));
                        livingEntity.addEffect(new MobEffectInstance(
                                MobEffects.DIG_SPEED, effectDuration, 0));
                    }
                }
            }
        }
    }
}
