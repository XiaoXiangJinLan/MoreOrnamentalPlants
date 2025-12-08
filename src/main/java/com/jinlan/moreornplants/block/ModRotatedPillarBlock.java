package com.jinlan.moreornplants.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModRotatedPillarBlock extends RotatedPillarBlock {
    public ModRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (context.getItemInHand().getItem() instanceof AxeItem) {
            if (state.is(ModBlocks.RED_MEI_LOG.get())) {
                return ModBlocks.STRIPPED_RED_MEI_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.WHITE_MEI_LOG.get())) {
                return ModBlocks.STRIPPED_WHITE_MEI_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.GREEN_CALYX_MEI_LOG.get())) {
                return ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.DOUBLE_PINK_MEI_LOG.get())) {
                return ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.RED_MEI_WOOD.get())) {
                return ModBlocks.STRIPPED_RED_MEI_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.WHITE_MEI_WOOD.get())) {
                return ModBlocks.STRIPPED_WHITE_MEI_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.GREEN_CALYX_MEI_WOOD.get())) {
                return ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.DOUBLE_PINK_MEI_WOOD.get())) {
                return ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.CRABAPPLE_LOG.get())) {
                return ModBlocks.STRIPPED_CRABAPPLE_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.CRABAPPLE_WOOD.get())) {
                return ModBlocks.STRIPPED_CRABAPPLE_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.APRICOT_LOG.get())) {
                return ModBlocks.STRIPPED_APRICOT_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.APRICOT_WOOD.get())) {
                return ModBlocks.STRIPPED_APRICOT_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.PEACH_LOG.get())) {
                return ModBlocks.STRIPPED_PEACH_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.PEACH_WOOD.get())) {
                return ModBlocks.STRIPPED_PEACH_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.PEAR_LOG.get())) {
                return ModBlocks.STRIPPED_PEAR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.PEAR_WOOD.get())) {
                return ModBlocks.STRIPPED_PEAR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.PURPLE_LEAF_PLUM_LOG.get())) {
                return ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.PURPLE_LEAF_PLUM_WOOD.get())) {
                return ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.OSMANTHUS_LOG.get())) {
                return ModBlocks.STRIPPED_OSMANTHUS_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.OSMANTHUS_WOOD.get())) {
                return ModBlocks.STRIPPED_OSMANTHUS_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.GINKGO_LOG.get())) {
                return ModBlocks.STRIPPED_GINKGO_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.GINKGO_WOOD.get())) {
                return ModBlocks.STRIPPED_GINKGO_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.CHINESE_PARASOL_LOG.get())) {
                return ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.CHINESE_PARASOL_WOOD.get())) {
                return ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.SWEETGUM_LOG.get())) {
                return ModBlocks.STRIPPED_SWEETGUM_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.SWEETGUM_WOOD.get())) {
                return ModBlocks.STRIPPED_SWEETGUM_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }

            if (state.is(ModBlocks.CAMPHOR_LOG.get())) {
                return ModBlocks.STRIPPED_CAMPHOR_LOG.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
            if (state.is(ModBlocks.CAMPHOR_WOOD.get())) {
                return ModBlocks.STRIPPED_CAMPHOR_WOOD.get().defaultBlockState().setValue(AXIS, state.getValue(AXIS));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
