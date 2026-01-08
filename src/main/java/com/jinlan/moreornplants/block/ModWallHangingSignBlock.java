package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.block.entity.ModHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.jetbrains.annotations.NotNull;

public class ModWallHangingSignBlock extends WallHangingSignBlock {
    public ModWallHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pType, pProperties);
    }

    @Override
    public @NotNull BlockEntity newBlockEntity(@NotNull BlockPos pPos, @NotNull BlockState pState) {
        return new ModHangingSignBlockEntity(pPos, pState);
    }
}
