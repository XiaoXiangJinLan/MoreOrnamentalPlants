package com.jinlan.moreornplants.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoods {
    public static final FoodProperties PEELED_BAMBOO_SHOOTS = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 0), 0.8F).build();
    public static final FoodProperties BAMBOO_SHOOTS_SOUP = stew().build();
    public static final FoodProperties LOTUS_ROOT = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3F).build();
    public static final FoodProperties LOTUS_ROOT_SOUP = stew().build();
    public static final FoodProperties LOTUS_SEED = new FoodProperties.Builder().nutrition(1).saturationModifier(0.3F).build();
    public static final FoodProperties LOTUS_SEED_SOUP = stew().build();
    public static final FoodProperties CRABAPPLE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3F).build();
    public static final FoodProperties ENCHANTED_GOLDEN_CRABAPPLE = new FoodProperties.Builder().nutrition(2).saturationModifier(1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 2), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3000, 1), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 3000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1800, 4), 1.0F).alwaysEdible().build();
    public static final FoodProperties GOLDEN_CRABAPPLE = new FoodProperties.Builder().nutrition(2).saturationModifier(1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 2), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 3000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 1800, 1), 1.0F).alwaysEdible().build();
    public static final FoodProperties PEACH = new FoodProperties.Builder().nutrition(6).saturationModifier(1.6F)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 100, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 1000, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 6000, 19), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 8), 1.0F).alwaysEdible().build();
    public static final FoodProperties APRICOT = new FoodProperties.Builder().nutrition(6).saturationModifier(1.2F)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 60, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.SLOW_FALLING, 600, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 3000, 9), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 4), 1.0F).alwaysEdible().build();

    private static FoodProperties.Builder stew() {
        return (new FoodProperties.Builder()).nutrition(6).saturationModifier(0.6F).usingConvertsTo(Items.BOWL);
    }
}
