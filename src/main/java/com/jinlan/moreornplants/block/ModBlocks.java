package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.More_Orn_Plants;
import com.jinlan.moreornplants.block.LeavesBlocks.*;
import com.jinlan.moreornplants.block.WeepingBlocks.*;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModBlocks {

    public static final Block RED_MEI_LEAVES = register("red_mei_leaves", new RedMeiLeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.RED)));
    public static final Block WHITE_MEI_LEAVES = register("white_mei_leaves", new WhiteMeiLeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.WHITE)));
    public static final Block GREEN_CALYX_MEI_LEAVES = register("green_calyx_mei_leaves", new GreenCalyxMeiLeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.PALE_GREEN)));
    public static final Block DOUBLE_PINK_MEI_LEAVES = register("double_pink_mei_leaves", new DoublePinkMeiLeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES)));
    public static final Block VERSICOLOR_MEI_LEAVES = register("versicolor_mei_leaves", new VersicolorMeiLeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES)));

    public static final Block RED_WEEPING_MEI = register("red_weeping_mei", new RedWeepingMeiBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).ticksRandomly().noCollision().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RED_WEEPING_MEI_PLANT = register("red_weeping_mei_plant", new RedWeepingMeiPlantBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).noCollision().breakInstantly().sounds(BlockSoundGroup.CAVE_VINES).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WHITE_WEEPING_MEI = register("white_weeping_mei", new WhiteWeepingMeiBlock(AbstractBlock.Settings.copy(ModBlocks.RED_WEEPING_MEI).mapColor(MapColor.WHITE)));
    public static final Block WHITE_WEEPING_MEI_PLANT = register("white_weeping_mei_plant", new WhiteWeepingMeiPlantBlock(AbstractBlock.Settings.copy(ModBlocks.RED_WEEPING_MEI_PLANT).mapColor(MapColor.WHITE)));
    public static final Block GREEN_WEEPING_MEI = register("green_weeping_mei", new GreenWeepingMeiBlock(AbstractBlock.Settings.copy(ModBlocks.RED_WEEPING_MEI).mapColor(MapColor.PALE_GREEN)));
    public static final Block GREEN_WEEPING_MEI_PLANT = register("green_weeping_mei_plant", new GreenWeepingMeiPlantBlock(AbstractBlock.Settings.copy(ModBlocks.RED_WEEPING_MEI_PLANT).mapColor(MapColor.PALE_GREEN)));
    public static final Block PINK_WEEPING_MEI = register("pink_weeping_mei", new PinkWeepingMeiBlock(AbstractBlock.Settings.copy(ModBlocks.RED_WEEPING_MEI).mapColor(MapColor.PINK)));
    public static final Block PINK_WEEPING_MEI_PLANT = register("pink_weeping_mei_plant", new PinkWeepingMeiPlantBlock(AbstractBlock.Settings.copy(ModBlocks.RED_WEEPING_MEI_PLANT).mapColor(MapColor.PINK)));
    public static final Block VERSICOLOR_WEEPING_MEI = register("versicolor_weeping_mei", new VersicolorWeepingMeiBlock(AbstractBlock.Settings.copy(ModBlocks.PINK_WEEPING_MEI)));
    public static final Block VERSICOLOR_WEEPING_MEI_PLANT = register("versicolor_weeping_mei_plant", new VersicolorWeepingMeiPlantBlock(AbstractBlock.Settings.copy(ModBlocks.PINK_WEEPING_MEI_PLANT)));

    public static final Block RED_MEI_LOG = register("red_mei_log", createLogBlock(MapColor.RED, MapColor.BROWN));
    public static final Block WHITE_MEI_LOG = register("white_mei_log", createLogBlock(MapColor.WHITE, MapColor.BROWN));
    public static final Block GREEN_CALYX_MEI_LOG = register("green_calyx_mei_log", createLogBlock(MapColor.PALE_GREEN, MapColor.BROWN));
    public static final Block DOUBLE_PINK_MEI_LOG = register("double_pink_mei_log", createLogBlock(MapColor.PINK, MapColor.BROWN));

    public static final Block RED_MEI_WOOD = register("red_mei_wood", new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).instrument(Instrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block WHITE_MEI_WOOD = register("white_mei_wood", new PillarBlock(AbstractBlock.Settings.copy(ModBlocks.RED_MEI_WOOD)));
    public static final Block GREEN_CALYX_MEI_WOOD = register("green_calyx_mei_wood", new PillarBlock(AbstractBlock.Settings.copy(ModBlocks.RED_MEI_WOOD)));
    public static final Block DOUBLE_PINK_MEI_WOOD = register("double_pink_mei_wood", new PillarBlock(AbstractBlock.Settings.copy(ModBlocks.RED_MEI_WOOD)));

    public static final Block STRIPPED_RED_MEI_LOG = register("stripped_red_mei_log", createLogBlock(MapColor.RED, MapColor.RED));
    public static final Block STRIPPED_WHITE_MEI_LOG = register("stripped_white_mei_log", createLogBlock(MapColor.WHITE, MapColor.WHITE));
    public static final Block STRIPPED_GREEN_CALYX_MEI_LOG = register("stripped_green_calyx_mei_log", createLogBlock(MapColor.PALE_GREEN, MapColor.PALE_GREEN));
    public static final Block STRIPPED_DOUBLE_PINK_MEI_LOG = register("stripped_double_pink_mei_log", createLogBlock(MapColor.PINK, MapColor.PINK));

    public static final Block STRIPPED_RED_MEI_WOOD = register("stripped_red_mei_wood", new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).instrument(Instrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_WHITE_MEI_WOOD = register("stripped_white_mei_wood", new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.WHITE).instrument(Instrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_GREEN_CALYX_MEI_WOOD = register("stripped_green_calyx_mei_wood", new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).instrument(Instrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));
    public static final Block STRIPPED_DOUBLE_PINK_MEI_WOOD = register("stripped_double_pink_mei_wood", new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.PINK).instrument(Instrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static PillarBlock createLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        return new PillarBlock(AbstractBlock.Settings.create().mapColor((state) -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor).instrument(Instrument.BASS).strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());
    }

    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(More_Orn_Plants.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(More_Orn_Plants.MOD_ID, id),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {

    }
}
