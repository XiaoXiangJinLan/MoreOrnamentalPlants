package com.jinlan.moreornplants.block.FlowerBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class WinterCymbidiumBlock extends ModTallFlowerBlock{
    private static final VoxelShape UPPER_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 7.0D, 13.0D);
    private static final VoxelShape LOWER_SHAPE = Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D);

    public WinterCymbidiumBlock(Properties p_57296_) {
        super(p_57296_);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Vec3 vec3 = state.getOffset(level, pos);
        VoxelShape shape = state.getValue(HALF) == DoubleBlockHalf.LOWER ? LOWER_SHAPE : UPPER_SHAPE;
        return shape.move(vec3.x, vec3.y, vec3.z);
    }
}
