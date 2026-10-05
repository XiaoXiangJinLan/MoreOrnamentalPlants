package com.jinlan.moreornplants.block.foodBlock;

import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class PeachPlateBlock extends FruitPlateBlock{
    public static final IntegerProperty COUNTS = IntegerProperty.create("counts", 0, 4);
    public PeachPlateBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(COUNTS, 4));
    }

    @Override
    protected IntegerProperty getCountProperty() {
        return COUNTS;
    }

    @Override
    protected Item getFruitItem() {
        return ModItems.IMMORTAL_PEACH.get();
    }

    @Override
    protected int getMaxCount() {
        return 4;
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(COUNTS);
    }
}
