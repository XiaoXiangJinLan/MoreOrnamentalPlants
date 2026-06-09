package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class MuxueSoupItem extends BowlFoodBlockItem {
    public MuxueSoupItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);

        if (!level.isClientSide) {
            entity.removeEffect(MobEffects.CONFUSION);
            entity.removeEffect(MobEffects.BLINDNESS);
            entity.removeEffect(MobEffects.WEAKNESS);
            entity.removeEffect(MobEffects.POISON);
            entity.removeEffect(MobEffects.WITHER);
            entity.removeEffect(MobEffects.DARKNESS);
        }

        return result;
    }
}
