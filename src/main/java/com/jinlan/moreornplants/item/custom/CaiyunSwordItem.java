package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class CaiyunSwordItem extends ZhuiyueSwordItem{
    public CaiyunSwordItem(Properties properties) {
        super(properties);
    }

    @Override
    public void postHurtEnemy(ItemStack stack, @NotNull LivingEntity target, @NotNull LivingEntity attacker) {
        stack.hurtAndBreak(1, attacker, EquipmentSlot.MAINHAND);

        if (attacker.level().isNight() && !attacker.level().isRaining() && !attacker.level().isThundering()) {
            int currentDamage = stack.getDamageValue();
            int newDamage = Math.max(0, currentDamage - 55);
            stack.setDamageValue(newDamage);
        }
    }
}
