package com.jinlan.moreornplants.block.xiangnangBlocks;

import com.jinlan.moreornplants.block.ModBlockEntities;
import com.jinlan.moreornplants.block.entity.xiangnang.GuiXiangnangBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class GuiXiangnangBlock extends MeiXiangnangBlock {
    public GuiXiangnangBlock(Properties properties) {
        super(properties);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new GuiXiangnangBlockEntity(pos, state);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState state, @NotNull BlockEntityType<T> blockEntityType) {
        return level.isClientSide ? null : createTickerHelper(
                blockEntityType,
                ModBlockEntities.GUI_XIANGNANG.get(),
                GuiXiangnangBlockEntity::tick
        );
    }
}
