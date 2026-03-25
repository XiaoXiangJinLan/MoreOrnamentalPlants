package com.jinlan.moreornplants.item.custom;

import com.google.common.base.Suppliers;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModTiers implements Tier {
    ZIYING(3, 1695, 5.0F, 2.0F, 12, () -> Ingredient.of(ModItems.ZIYING_BEAD.get())),
    SUYU(3, 1695, 5.0F, 2.0F, 12, () -> Ingredient.of(ModItems.SUYU_BEAD.get())),
    ZIYU_YUANYANG(3, 1695, 5.0F, 3.0F, 12, () -> Ingredient.of(ModItems.ZIYU_YUANYANG_BEAD.get()));

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
