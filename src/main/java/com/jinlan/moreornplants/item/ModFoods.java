package com.jinlan.moreornplants.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties PEELED_BAMBOO_SHOOTS = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 0), 0.8F).build();
    public static final FoodProperties BAMBOO_SHOOTS_SOUP = stew().build();
    public static final FoodProperties LOTUS_ROOT = new FoodProperties.Builder().nutrition(3).saturationMod(0.3F).build();
    public static final FoodProperties LOTUS_ROOT_SOUP = stew().build();
    public static final FoodProperties LOTUS_SEED = new FoodProperties.Builder().nutrition(1).saturationMod(0.3F).build();
    public static final FoodProperties LOTUS_SEED_SOUP = stew().build();

    private static FoodProperties.Builder stew() {
        return (new FoodProperties.Builder()).nutrition(6).saturationMod(0.6F);
    }
}
