package com.jinlan.moreornplants.item.custom;

import com.google.common.base.Suppliers;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModTiers implements Tier {
    ZIYING(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1695, 5.0F, 2.0F, 13, () -> Ingredient.of(ModItems.ZIYING_BEAD)),
    SUYU(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1695, 6.0F, 2.0F, 12, () -> Ingredient.of(ModItems.SUYU_BEAD)),
    ZIYU_YUANYANG(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1695, 5.0F, 3.0F, 12, () -> Ingredient.of(ModItems.ZIYU_YUANYANG_BEAD)),
    BAIHUA(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 100, 3.0F, 1.0F, 15, () -> Ingredient.of(ItemTags.FLOWERS));

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModTiers(TagKey<Block> incorrectBlockForDrops, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlockForDrops;
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
    public @NotNull TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
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
