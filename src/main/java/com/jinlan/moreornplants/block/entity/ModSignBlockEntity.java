package com.jinlan.moreornplants.block.entity;

import com.jinlan.moreornplants.block.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class ModSignBlockEntity extends SignBlockEntity {
    public ModSignBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntities.MOD_SIGN.get(), pos, blockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return ModBlockEntities.MOD_SIGN.get();
    }
}
