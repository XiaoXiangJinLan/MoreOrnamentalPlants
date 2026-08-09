package com.jinlan.moreornplants.item.custom;

import com.google.common.base.Suppliers;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModTiers implements Tier {
    PEACH(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.of(ModTags.Items.PEACH_LOGS)),
    CAMPHOR(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.of(ModTags.Items.CAMPHOR_LOGS)),
    CHINESE_PARASOL(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.of(ModTags.Items.CHINESE_PARASOL_LOGS)),
    ZIYING(4, 1695, 5.0F, 2.0F, 13, () -> Ingredient.of(ModItems.ZIYING_BEAD.get())),
    SUYU(4, 1695, 6.0F, 2.0F, 12, () -> Ingredient.of(ModItems.SUYU_BEAD.get())),
    ZIYU_YUANYANG(4, 1695, 5.0F, 3.0F, 12, () -> Ingredient.of(ModItems.ZIYU_YUANYANG_BEAD.get())),
    BAIHUA(4, 100, 3.0F, 1.0F, 15, () -> Ingredient.of(ItemTags.FLOWERS));

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModTiers(int pLevel, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = pLevel;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public int getLevel() {
        return this.level;
    }
    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
