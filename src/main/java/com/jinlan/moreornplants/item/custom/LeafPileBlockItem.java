package com.jinlan.moreornplants.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class LeafPileBlockItem extends BurnBlockItem {
    public LeafPileBlockItem(Block block, Item.Properties properties, int burnTime) {
        super(block, properties, burnTime);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        Player player = context.getPlayer();

        if (player != null) {
            // 检查视线是否指向水源
            BlockHitResult hitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);

            if (hitResult.getType() == HitResult.Type.BLOCK &&
                    level.getFluidState(hitResult.getBlockPos()).isSource()) {
                // 放置在水面上方
                BlockHitResult adjustedHit = hitResult.withPosition(hitResult.getBlockPos().above());
                UseOnContext waterContext = new UseOnContext(player, context.getHand(), adjustedHit);
                return super.useOn(waterContext);
            }
        }
        return super.useOn(context);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        // 获取玩家视线击中的方块（只检测水源方块）
        BlockHitResult hitResult = getPlayerPOVHitResult(level, player, ClipContext.Fluid.SOURCE_ONLY);

        if (hitResult.getType() == HitResult.Type.BLOCK) {
            // 将击中位置向上移动一格（从水面移动到水面上方）
            BlockHitResult adjustedHit = hitResult.withPosition(hitResult.getBlockPos().above());
            InteractionResult result = super.useOn(new UseOnContext(player, hand, adjustedHit));
            return new InteractionResultHolder<>(result, player.getItemInHand(hand));
        }

        // 如果玩家没有看向方块（如看向空气），则使用默认行为
        return super.use(level, player, hand);
    }
}
