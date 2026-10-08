package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ImmortalPeachItem extends FoodBlockItem{
    public ImmortalPeachItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    protected void onConsumed(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity entity) {
        List<MobEffectInstance> negatives = new ArrayList<>();
        for (MobEffectInstance effect : entity.getActiveEffects()) {
            if (effect.getEffect().value().getCategory() == MobEffectCategory.HARMFUL) {
                negatives.add(effect);
            }
        }
        for (MobEffectInstance effect : negatives) {
            entity.removeEffect(effect.getEffect());
        }
    }
}
