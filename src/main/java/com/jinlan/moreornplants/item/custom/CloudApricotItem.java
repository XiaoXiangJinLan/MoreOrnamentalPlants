package com.jinlan.moreornplants.item.custom;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CloudApricotItem extends FoodBlockItem{
    public CloudApricotItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    protected void onConsumed(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity entity) {
        List<Holder<MobEffect>> negatives = new ArrayList<>();
        for (MobEffectInstance effect : entity.getActiveEffects()) {
            if (effect.getEffect().value().getCategory() == MobEffectCategory.HARMFUL) {
                negatives.add(effect.getEffect());
            }
        }
        if (!negatives.isEmpty()) {
            Holder<MobEffect> chosen = negatives.get(level.random.nextInt(negatives.size()));
            entity.removeEffect(chosen);
        }
    }
}
