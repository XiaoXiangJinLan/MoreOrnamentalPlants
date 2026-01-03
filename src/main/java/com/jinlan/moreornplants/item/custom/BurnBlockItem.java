package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

public class BurnBlockItem extends BlockItem {
    private int burnTime = 0 ;
    public BurnBlockItem(Block pBlock, Properties pProperties, int burnTime) {
        super(pBlock, pProperties);
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }
}
