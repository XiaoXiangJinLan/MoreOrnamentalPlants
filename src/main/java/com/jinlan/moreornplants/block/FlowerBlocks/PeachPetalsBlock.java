package com.jinlan.moreornplants.block.FlowerBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.IceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;

public class PeachPetalsBlock extends ModFlowerPetalsBlock{
    public PeachPetalsBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, @NotNull BlockPos pos) {
        FluidState fluidstate = level.getFluidState(pos);
        FluidState fluidstate1 = level.getFluidState(pos.above());
        boolean canPlaceOnWater = (fluidstate.getType() == Fluids.WATER || state.getBlock() instanceof IceBlock) && fluidstate1.getType() == Fluids.EMPTY;

        boolean canPlaceOnFullSurface = state.isFaceSturdy(level, pos, Direction.UP) && state.getBlock() != Blocks.AIR;

        boolean canPlaceOnFarmlandOrLeaves = state.getBlock() instanceof FarmBlock || state.is(BlockTags.LEAVES);

        return canPlaceOnWater || canPlaceOnFullSurface || canPlaceOnFarmlandOrLeaves;
    }
}
