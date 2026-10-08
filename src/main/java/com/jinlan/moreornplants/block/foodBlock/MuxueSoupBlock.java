package com.jinlan.moreornplants.block.foodBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class MuxueSoupBlock extends SoupBlock{
    public MuxueSoupBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResult use(@NotNull BlockState pState, Level pLevel, @NotNull BlockPos pPos, Player pPlayer, @NotNull InteractionHand pHand, @NotNull BlockHitResult pHit) {
        ItemStack itemstack = pPlayer.getItemInHand(pHand);
        if (pLevel.isClientSide) {
            if (eat(pLevel, pPos, pState, pPlayer).consumesAction()) {
                return InteractionResult.SUCCESS;
            }

            if (itemstack.isEmpty()) {
                return InteractionResult.CONSUME;
            }
        }
        return eat(pLevel, pPos, pState, pPlayer);
    }

    protected static InteractionResult eat(LevelAccessor level, BlockPos pos, BlockState state, Player player) {
        if (!player.canEat(false)) {
            return InteractionResult.PASS;
        } else {
            player.getFoodData().eat(1, 0.2F);
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 900, 0));
            int i = state.getValue(BITES);
            level.gameEvent(player, GameEvent.EAT, pos);
            if (level instanceof Level realLevel && !realLevel.isClientSide) {
                if (i < MAX_BITES) {
                    realLevel.playSound(null, pos, SoundEvents.GENERIC_DRINK, SoundSource.PLAYERS, 0.5F, realLevel.getRandom().nextFloat() * 0.1F + 0.9F);
                } else {
                    realLevel.playSound(null, pos, SoundEvents.ITEM_PICKUP, SoundSource.PLAYERS, 0.6F, realLevel.getRandom().nextFloat() * 0.2F + 1.0F);
                }
            }
            if (i < MAX_BITES) {
                level.setBlock(pos, state.setValue(BITES, i + 1), 3);
            } else {
                level.removeBlock(pos, false);
                if (level instanceof Level realLevel) {
                    Block.popResource(realLevel, pos, new ItemStack(Items.BOWL));
                }
                level.gameEvent(player, GameEvent.BLOCK_DESTROY, pos);
            }
            return InteractionResult.SUCCESS;
        }
    }
}
