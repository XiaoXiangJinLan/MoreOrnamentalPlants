package com.jinlan.moreornplants.block.entity;

import com.jinlan.moreornplants.block.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModHangingSignBlockEntity extends HangingSignBlockEntity {
    public ModHangingSignBlockEntity(BlockPos p_250603_, BlockState p_251674_) {
        super(p_250603_, p_251674_);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return ModBlockEntities.MOD_HANGING_SIGN.get();
    }
}