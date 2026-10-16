package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class BowlFoodBlockItem extends FoodBlockItem{
    public BowlFoodBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity entity) {
        ItemStack result = super.finishUsingItem(stack, level, entity);
        if (entity instanceof Player player && player.getAbilities().instabuild) {
            return result;
        }
        if (!level.isClientSide) {
            ItemStack bowl = new ItemStack(Items.BOWL);
            if (entity instanceof Player player) {
                if (!player.getInventory().add(bowl)) {
                    player.drop(bowl, false);
                }
            } else {
                entity.spawnAtLocation(bowl);
            }
        }
        return result;
    }
}
