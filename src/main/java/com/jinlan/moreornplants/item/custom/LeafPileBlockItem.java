package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class LeafPileBlockItem extends BurnBlockItem {
    public LeafPileBlockItem(Block block, Properties properties, int burnTime) {
        super(block, properties, burnTime);
    }

    @Override
    public @NotNull InteractionResult useOn(@NotNull UseOnContext p_220229_) {
        return InteractionResult.PASS;
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, @NotNull Player player, @NotNull InteractionHand hand) {
        BlockHitResult hitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);
        InteractionResult result = super.useOn(new UseOnContext(player, hand, hitResult));
        return new InteractionResultHolder<>(result, player.getItemInHand(hand));
    }
}
