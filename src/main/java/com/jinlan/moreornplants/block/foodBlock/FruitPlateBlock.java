package com.jinlan.moreornplants.block.foodBlock;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FruitPlateBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<FruitPlateBlock> CODEC = simpleCodec(FruitPlateBlock::new);
    protected static final VoxelShape SHAPE = Block.box(1.0D, 1.0D, 1.0D, 15.0D, 2.0D, 15.0D);

    public FruitPlateBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected @NotNull MapCodec<FruitPlateBlock> codec() {
        return CODEC;
    }


    protected IntegerProperty getCountProperty() {
        return null;
    }

    protected Item getFruitItem() {
        return null;
    }

    protected int getMaxCount() {
        return 0;
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state,
                                                       @NotNull Level level, @NotNull BlockPos pos,
                                                       @NotNull Player player, @NotNull InteractionHand hand,
                                                       @NotNull BlockHitResult hitResult) {
        IntegerProperty countProp = getCountProperty();
        Item fruitItem = getFruitItem();
        if (countProp == null || fruitItem == null) {
            return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }
        int count = state.getValue(countProp);
        int max = getMaxCount();
        if (stack.is(fruitItem) && count < max) {
            if (!level.isClientSide) {
                stack.consume(1, player);
                level.setBlock(pos, state.setValue(countProp, count + 1), 3);
                level.playSound(null, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 0.5F, 1.2F);
            }
            return ItemInteractionResult.sidedSuccess(level.isClientSide);
        }

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    @Override
    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, @NotNull Level level,
                                                        @NotNull BlockPos pos, @NotNull Player player,
                                                        @NotNull BlockHitResult hitResult) {
        IntegerProperty countProp = getCountProperty();
        Item fruitItem = getFruitItem();
        if (countProp == null || fruitItem == null) {
            return InteractionResult.PASS;
        }
        int count = state.getValue(countProp);
        if (count <= 0) {
            return InteractionResult.PASS;
        }
        if (!level.isClientSide) {
            ItemStack fruit = new ItemStack(fruitItem);
            if (!player.getInventory().add(fruit)) {
                player.drop(fruit, false);
            }
            level.setBlock(pos, state.setValue(countProp, count - 1), 3);
            level.playSound(null, pos, SoundEvents.ITEM_PICKUP, SoundSource.BLOCKS, 0.5F, 1.0F);
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    protected int getAnalogOutputSignal(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos) {
        IntegerProperty countProp = getCountProperty();
        int max = getMaxCount();
        if (countProp == null || max <= 0) {
            return 0;
        }
        int count = state.getValue(countProp);
        return (int) Math.ceil((double) count / max * 15);
    }

    @Override
    protected boolean hasAnalogOutputSignal(@NotNull BlockState state) {
        return true;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    @NotNull
    public VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return SHAPE;
    }

    @Override
    protected boolean isPathfindable(@NotNull BlockState state, @NotNull PathComputationType pathComputationType) {
        return false;
    }
}
