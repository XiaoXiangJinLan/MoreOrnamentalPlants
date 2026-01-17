package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.BambooBlocks.BlackBambooSaplingBlock;
import com.jinlan.moreornplants.block.BambooBlocks.BlackBambooStalkBlock;
import com.jinlan.moreornplants.block.BambooBlocks.MottledBambooSaplingBlock;
import com.jinlan.moreornplants.block.BambooBlocks.MottledBambooStalkBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.*;
import com.jinlan.moreornplants.block.LeavesBlocks.*;
import com.jinlan.moreornplants.block.WeepingBlocks.*;
import com.jinlan.moreornplants.block.tree.ModTreeGrower;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModBlockSetType;
import com.jinlan.moreornplants.util.ModWoodTypes;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MoreOrnPlants.MODID);

    public static final DeferredBlock<Block> RED_MEI_LEAVES =
            registerBlock("red_mei_leaves", () -> new RedMeiLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final DeferredBlock<Block> WHITE_MEI_LEAVES =
            registerBlock("white_mei_leaves", () -> new WhiteMeiLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_LEAVES =
            registerBlock("green_calyx_mei_leaves", () -> new GreenCalyxMeiLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_LEAVES =
            registerBlock("double_pink_mei_leaves", () -> new DoublePinkMeiLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final DeferredBlock<Block> VERSICOLOR_MEI_LEAVES =
            registerBlock("versicolor_mei_leaves", () -> new VersicolorMeiLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final DeferredBlock<Block> UPRIGHT_CRABAPPLE_LEAVES =
            registerBlock("upright_crabapple_leaves", () -> new UprightCrabappleLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final DeferredBlock<Block> WEEPING_CRABAPPLE_LEAVES =
            registerBlock("weeping_crabapple_leaves", () -> new WeepingCrabappleLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_MAGENTA)));
    public static final DeferredBlock<Block> PINK_APRICOT_LEAVES =
            registerBlock("pink_apricot_leaves", () -> new PinkApricotLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final DeferredBlock<Block> WHITE_APRICOT_LEAVES =
            registerBlock("white_apricot_leaves", () -> new WhiteApricotLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final DeferredBlock<Block> ORNAMENTAL_PEACH_LEAVES =
            registerBlock("ornamental_peach_leaves", () -> new OrnPeachLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final DeferredBlock<Block> WILD_PEACH_LEAVES =
            registerBlock("wild_peach_leaves", () -> new WildPeachLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES)));
    public static final DeferredBlock<Block> PEAR_LEAVES =
            registerBlock("pear_leaves", () -> new PearLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final DeferredBlock<Block> FLOWERING_PURPLE_LEAF_PLUM_LEAVES =
            registerBlock("flowering_purple_leaf_plum_leaves", () -> new FloweringPurpleLeafPlumLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_LEAVES =
            registerBlock("purple_leaf_plum_leaves", () -> new PurpleLeafPlumLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PURPLE)));
    public static final DeferredBlock<Block> GOLDEN_OSMANTHUS_LEAVES =
            registerBlock("golden_osmanthus_leaves", () -> new GoldenOsmanthusLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> ORANGE_OSMANTHUS_LEAVES =
            registerBlock("orange_osmanthus_leaves", () -> new OrangeOsmanthusLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> WHITE_OSMANTHUS_LEAVES =
            registerBlock("white_osmanthus_leaves", () -> new WhiteOsmanthusLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> GOLDEN_GINKGO_LEAVES =
            registerBlock("golden_ginkgo_leaves", () -> new GoldenGinkgoLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.GOLD)));
    public static final DeferredBlock<Block> GREEN_GINKGO_LEAVES =
            registerBlock("green_ginkgo_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> YELLOW_CHINESE_PARASOL_LEAVES =
            registerBlock("yellow_chinese_parasol_leaves", () -> new YellowChineseParasolLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_YELLOW)));
    public static final DeferredBlock<Block> GREEN_CHINESE_PARASOL_LEAVES =
            registerBlock("green_chinese_parasol_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> SWEETGUM_LEAVES =
            registerBlock("sweetgum_leaves", () -> new SweetgumLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final DeferredBlock<Block> CAMPHOR_LEAVES =
            registerBlock("camphor_leaves", () -> new CamphorLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> NEW_CAMPHOR_LEAVES =
            registerBlock("new_camphor_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> DOVE_TREE_LEAVES =
            registerBlock("dove_tree_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> DOVE_TREE_BLOSSOM_LEAVES =
            registerBlock("dove_tree_blossom_leaves", () -> new DoveTreeBlossomLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES)));
    public static final DeferredBlock<Block> CHINABERRY_LEAVES =
            registerBlock("chinaberry_leaves", () -> new ChinaberryLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_YELLOW)));
    public static final DeferredBlock<Block> DESERT_POPLAR_LEAVES =
            registerBlock("desert_poplar_leaves", () -> new DesertPoplarLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final DeferredBlock<Block> CRAPE_MYRTLE_LEAVES =
            registerBlock("crape_myrtle_leaves", () -> new CrapeMyrtleLeavesBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PURPLE)));

    public static final DeferredBlock<Block> RED_WEEPING_MEI =
            registerBlock("red_weeping_mei", () -> new RedWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_WEEPING_MEI_PLANT =
            BLOCKS.register("red_weeping_mei_plant", () -> new RedWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_WEEPING_MEI =
            registerBlock("white_weeping_mei", () -> new WhiteWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_WEEPING_MEI_PLANT =
            BLOCKS.register("white_weeping_mei_plant", () -> new WhiteWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_WEEPING_MEI =
            registerBlock("green_weeping_mei", () -> new GreenWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_WEEPING_MEI_PLANT =
            BLOCKS.register("green_weeping_mei_plant", () -> new GreenWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_WEEPING_MEI =
            registerBlock("pink_weeping_mei", () -> new PinkWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_WEEPING_MEI_PLANT =
            BLOCKS.register("pink_weeping_mei_plant", () -> new PinkWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VERSICOLOR_WEEPING_MEI =
            registerBlock("versicolor_weeping_mei", () -> new VersicolorWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VERSICOLOR_WEEPING_MEI_PLANT =
            BLOCKS.register("versicolor_weeping_mei_plant", () -> new VersicolorWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> WEEPING_CRABAPPLE =
            registerBlock("weeping_crabapple", () -> new WeepingCrabappleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.CHERRY_LEAVES).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> RED_MEI_LOG =
            registerBlock("red_mei_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> WHITE_MEI_LOG =
            registerBlock("white_mei_log", () -> log(MapColor.SNOW, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_LOG =
            registerBlock("green_calyx_mei_log", () -> log(MapColor.COLOR_LIGHT_GREEN, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_LOG =
            registerBlock("double_pink_mei_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> CRABAPPLE_LOG =
            registerBlock("crabapple_log", () -> log(MapColor.COLOR_MAGENTA, MapColor.COLOR_GRAY));
    public static final DeferredBlock<Block> APRICOT_LOG =
            registerBlock("apricot_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> PEACH_LOG =
            registerBlock("peach_log", () -> log(MapColor.COLOR_PINK, MapColor.WOOD));
    public static final DeferredBlock<Block> PEAR_LOG =
            registerBlock("pear_log", () -> log(MapColor.SNOW, MapColor.COLOR_BLACK));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_LOG =
            registerBlock("purple_leaf_plum_log", () -> log(MapColor.TERRACOTTA_PURPLE, MapColor.COLOR_PURPLE));
    public static final DeferredBlock<Block> OSMANTHUS_LOG =
            registerBlock("osmanthus_log", () -> log(MapColor.WOOD, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> GINKGO_LOG =
            registerBlock("ginkgo_log", () -> log(MapColor.GOLD, MapColor.COLOR_GRAY));
    public static final DeferredBlock<Block> CHINESE_PARASOL_LOG =
            registerBlock("chinese_parasol_log", () -> log(MapColor.COLOR_GREEN, MapColor.COLOR_GREEN));
    public static final DeferredBlock<Block> SWEETGUM_LOG =
            registerBlock("sweetgum_log", () -> log(MapColor.TERRACOTTA_RED, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> CAMPHOR_LOG =
            registerBlock("camphor_log", () -> log(MapColor.COLOR_LIGHT_GRAY, MapColor.COLOR_BLACK));
    public static final DeferredBlock<Block> DOVE_TREE_LOG =
            registerBlock("dove_tree_log", () -> log(MapColor.WOOD, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> CHINABERRY_LOG =
            registerBlock("chinaberry_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> DESERT_POPLAR_LOG =
            registerBlock("desert_poplar_log", () -> log(MapColor.WOOD, MapColor.COLOR_BROWN));
    public static final DeferredBlock<Block> CRAPE_MYRTLE_LOG =
            BLOCKS.register("crape_myrtle_log", () -> log(MapColor.WOOD, MapColor.WOOD));

    public static final DeferredBlock<Block> RED_MEI_WOOD =
            registerBlock("red_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> WHITE_MEI_WOOD =
            registerBlock("white_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_WOOD =
            registerBlock("green_calyx_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_WOOD =
            registerBlock("double_pink_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CRABAPPLE_WOOD =
            registerBlock("crabapple_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> APRICOT_WOOD =
            registerBlock("apricot_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PEACH_WOOD =
            registerBlock("peach_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PEAR_WOOD =
            registerBlock("pear_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_WOOD =
            registerBlock("purple_leaf_plum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> OSMANTHUS_WOOD =
            registerBlock("osmanthus_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> GINKGO_WOOD =
            registerBlock("ginkgo_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CHINESE_PARASOL_WOOD =
            registerBlock("chinese_parasol_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> SWEETGUM_WOOD =
            registerBlock("sweetgum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CAMPHOR_WOOD =
            registerBlock("camphor_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DOVE_TREE_WOOD =
            registerBlock("dove_tree_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CHINABERRY_WOOD =
            registerBlock("chinaberry_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DESERT_POPLAR_WOOD =
            registerBlock("desert_poplar_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CRAPE_MYRTLE_WOOD =
            BLOCKS.register("crape_myrtle_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final DeferredBlock<Block> STRIPPED_RED_MEI_LOG =
            registerBlock("stripped_red_mei_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_RED));
    public static final DeferredBlock<Block> STRIPPED_WHITE_MEI_LOG =
            registerBlock("stripped_white_mei_log", () -> log(MapColor.SNOW, MapColor.SNOW));
    public static final DeferredBlock<Block> STRIPPED_GREEN_CALYX_MEI_LOG =
            registerBlock("stripped_green_calyx_mei_log", () -> log(MapColor.COLOR_LIGHT_GREEN, MapColor.COLOR_LIGHT_GREEN));
    public static final DeferredBlock<Block> STRIPPED_DOUBLE_PINK_MEI_LOG =
            registerBlock("stripped_double_pink_mei_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_PINK));
    public static final DeferredBlock<Block> STRIPPED_CRABAPPLE_LOG =
            registerBlock("stripped_crabapple_log", () -> log(MapColor.COLOR_MAGENTA, MapColor.COLOR_MAGENTA));
    public static final DeferredBlock<Block> STRIPPED_APRICOT_LOG =
            registerBlock("stripped_apricot_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_PINK));
    public static final DeferredBlock<Block> STRIPPED_PEACH_LOG =
            registerBlock("stripped_peach_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_PINK));
    public static final DeferredBlock<Block> STRIPPED_PEAR_LOG =
            registerBlock("stripped_pear_log", () -> log(MapColor.SNOW, MapColor.SAND));
    public static final DeferredBlock<Block> STRIPPED_PURPLE_LEAF_PLUM_LOG =
            registerBlock("stripped_purple_leaf_plum_log", () -> log(MapColor.TERRACOTTA_PURPLE, MapColor.TERRACOTTA_PURPLE));
    public static final DeferredBlock<Block> STRIPPED_OSMANTHUS_LOG =
            registerBlock("stripped_osmanthus_log", () -> log(MapColor.WOOD, MapColor.WOOD));
    public static final DeferredBlock<Block> STRIPPED_GINKGO_LOG =
            registerBlock("stripped_ginkgo_log", () -> log(MapColor.GOLD, MapColor.GOLD));
    public static final DeferredBlock<Block> STRIPPED_CHINESE_PARASOL_LOG =
            registerBlock("stripped_chinese_parasol_log", () -> log(MapColor.COLOR_GREEN, MapColor.COLOR_LIGHT_GREEN));
    public static final DeferredBlock<Block> STRIPPED_SWEETGUM_LOG =
            registerBlock("stripped_sweetgum_log", () -> log(MapColor.TERRACOTTA_RED, MapColor.COLOR_ORANGE));
    public static final DeferredBlock<Block> STRIPPED_CAMPHOR_LOG =
            registerBlock("stripped_camphor_log", () -> log(MapColor.WOOD, MapColor.WOOD));
    public static final DeferredBlock<Block> STRIPPED_DOVE_TREE_LOG =
            registerBlock("stripped_dove_tree_log", () -> log(MapColor.COLOR_LIGHT_GRAY, MapColor.WOOD));
    public static final DeferredBlock<Block> STRIPPED_CHINABERRY_LOG =
            registerBlock("stripped_chinaberry_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_RED));
    public static final DeferredBlock<Block> STRIPPED_DESERT_POPLAR_LOG =
            registerBlock("stripped_desert_poplar_log", () -> log(MapColor.WOOD, MapColor.WOOD));

    public static final DeferredBlock<Block> STRIPPED_RED_MEI_WOOD =
            registerBlock("stripped_red_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_WHITE_MEI_WOOD =
            registerBlock("stripped_white_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_GREEN_CALYX_MEI_WOOD =
            registerBlock("stripped_green_calyx_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_DOUBLE_PINK_MEI_WOOD =
            registerBlock("stripped_double_pink_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_CRABAPPLE_WOOD =
            registerBlock("stripped_crabapple_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_APRICOT_WOOD =
            registerBlock("stripped_apricot_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_PEACH_WOOD =
            registerBlock("stripped_peach_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_PEAR_WOOD =
            registerBlock("stripped_pear_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_PURPLE_LEAF_PLUM_WOOD =
            registerBlock("stripped_purple_leaf_plum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_OSMANTHUS_WOOD =
            registerBlock("stripped_osmanthus_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_GINKGO_WOOD =
            registerBlock("stripped_ginkgo_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_CHINESE_PARASOL_WOOD =
            registerBlock("stripped_chinese_parasol_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_SWEETGUM_WOOD =
            registerBlock("stripped_sweetgum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_CAMPHOR_WOOD =
            registerBlock("stripped_camphor_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_DOVE_TREE_WOOD =
            registerBlock("stripped_dove_tree_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_CHINABERRY_WOOD =
            registerBlock("stripped_chinaberry_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_DESERT_POPLAR_WOOD =
            registerBlock("stripped_desert_poplar_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final DeferredBlock<Block> RED_MEI_PLANKS =
            registerBlock("red_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> WHITE_MEI_PLANKS =
            registerBlock("white_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_PLANKS =
            registerBlock("green_calyx_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_PLANKS =
            registerBlock("double_pink_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CRABAPPLE_PLANKS =
            registerBlock("crabapple_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> APRICOT_PLANKS =
            registerBlock("apricot_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PEACH_PLANKS =
            registerBlock("peach_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PEAR_PLANKS =
            registerBlock("pear_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_PLANKS =
            registerBlock("purple_leaf_plum_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> OSMANTHUS_PLANKS =
            registerBlock("osmanthus_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> GINKGO_PLANKS =
            registerBlock("ginkgo_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CHINESE_PARASOL_PLANKS =
            registerBlock("chinese_parasol_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> SWEETGUM_PLANKS =
            registerBlock("sweetgum_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CAMPHOR_PLANKS =
            registerBlock("camphor_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DOVE_TREE_PLANKS =
            registerBlock("dove_tree_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CHINABERRY_PLANKS =
            registerBlock("chinaberry_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DESERT_POPLAR_PLANKS =
            registerBlock("desert_poplar_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final DeferredBlock<Block> RED_MEI_STAIRS =
            registerBlock("red_mei_stairs", () -> stair(ModBlocks.RED_MEI_PLANKS.get()));
    public static final DeferredBlock<Block> WHITE_MEI_STAIRS =
            registerBlock("white_mei_stairs", () -> stair(ModBlocks.WHITE_MEI_PLANKS.get()));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_STAIRS =
            registerBlock("green_calyx_mei_stairs", () -> stair(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_STAIRS =
            registerBlock("double_pink_mei_stairs", () -> stair(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
    public static final DeferredBlock<Block> CRABAPPLE_STAIRS =
            registerBlock("crabapple_stairs", () -> stair(ModBlocks.CRABAPPLE_PLANKS.get()));
    public static final DeferredBlock<Block> APRICOT_STAIRS =
            registerBlock("apricot_stairs", () -> stair(ModBlocks.APRICOT_PLANKS.get()));
    public static final DeferredBlock<Block> PEACH_STAIRS =
            registerBlock("peach_stairs", () -> stair(ModBlocks.PEACH_PLANKS.get()));
    public static final DeferredBlock<Block> PEAR_STAIRS =
            registerBlock("pear_stairs", () -> stair(ModBlocks.PEAR_PLANKS.get()));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_STAIRS =
            registerBlock("purple_leaf_plum_stairs", () -> stair(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
    public static final DeferredBlock<Block> OSMANTHUS_STAIRS =
            registerBlock("osmanthus_stairs", () -> stair(ModBlocks.OSMANTHUS_PLANKS.get()));
    public static final DeferredBlock<Block> GINKGO_STAIRS =
            registerBlock("ginkgo_stairs", () -> stair(ModBlocks.GINKGO_PLANKS.get()));
    public static final DeferredBlock<Block> CHINESE_PARASOL_STAIRS =
            registerBlock("chinese_parasol_stairs", () -> stair(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
    public static final DeferredBlock<Block> SWEETGUM_STAIRS =
            registerBlock("sweetgum_stairs", () -> stair(ModBlocks.SWEETGUM_PLANKS.get()));
    public static final DeferredBlock<Block> CAMPHOR_STAIRS =
            registerBlock("camphor_stairs", () -> stair(ModBlocks.CAMPHOR_PLANKS.get()));
    public static final DeferredBlock<Block> DOVE_TREE_STAIRS =
            registerBlock("dove_tree_stairs", () -> stair(ModBlocks.DOVE_TREE_PLANKS.get()));
    public static final DeferredBlock<Block> CHINABERRY_STAIRS =
            registerBlock("chinaberry_stairs", () -> stair(ModBlocks.CHINABERRY_PLANKS.get()));
    public static final DeferredBlock<Block> DESERT_POPLAR_STAIRS =
            registerBlock("desert_poplar_stairs", () -> stair(ModBlocks.DESERT_POPLAR_PLANKS.get()));

    public static final DeferredBlock<Block> RED_MEI_SLAB =
            registerBlock("red_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> WHITE_MEI_SLAB =
            registerBlock("white_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_SLAB =
            registerBlock("green_calyx_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_SLAB =
            registerBlock("double_pink_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CRABAPPLE_SLAB =
            registerBlock("crabapple_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> APRICOT_SLAB =
            registerBlock("apricot_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PEACH_SLAB =
            registerBlock("peach_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PEAR_SLAB =
            registerBlock("pear_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_SLAB =
            registerBlock("purple_leaf_plum_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> OSMANTHUS_SLAB =
            registerBlock("osmanthus_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> GINKGO_SLAB =
            registerBlock("ginkgo_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CHINESE_PARASOL_SLAB =
            registerBlock("chinese_parasol_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> SWEETGUM_SLAB =
            registerBlock("sweetgum_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CAMPHOR_SLAB =
            registerBlock("camphor_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DOVE_TREE_SLAB =
            registerBlock("dove_tree_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> CHINABERRY_SLAB =
            registerBlock("chinaberry_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final DeferredBlock<Block> DESERT_POPLAR_SLAB =
            registerBlock("desert_poplar_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final DeferredBlock<Block> RED_MEI_BUTTON =
            registerBlock("red_mei_button", () -> woodenButton(ModBlockSetType.RED_MEI));
    public static final DeferredBlock<Block> WHITE_MEI_BUTTON =
            registerBlock("white_mei_button", () -> woodenButton(ModBlockSetType.WHITE_MEI));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_BUTTON =
            registerBlock("green_calyx_mei_button", () -> woodenButton(ModBlockSetType.GREEN_CALYX_MEI));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_BUTTON =
            registerBlock("double_pink_mei_button", () -> woodenButton(ModBlockSetType.DOUBLE_PINK_MEI));
    public static final DeferredBlock<Block> CRABAPPLE_BUTTON =
            registerBlock("crabapple_button", () -> woodenButton(ModBlockSetType.CRABAPPLE));
    public static final DeferredBlock<Block> APRICOT_BUTTON =
            registerBlock("apricot_button", () -> woodenButton(ModBlockSetType.APRICOT));
    public static final DeferredBlock<Block> PEACH_BUTTON =
            registerBlock("peach_button", () -> woodenButton(ModBlockSetType.PEACH));
    public static final DeferredBlock<Block> PEAR_BUTTON =
            registerBlock("pear_button", () -> woodenButton(ModBlockSetType.PEAR));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_BUTTON =
            registerBlock("purple_leaf_plum_button", () -> woodenButton(ModBlockSetType.PURPLE_LEAF_PLUM));
    public static final DeferredBlock<Block> OSMANTHUS_BUTTON =
            registerBlock("osmanthus_button", () -> woodenButton(ModBlockSetType.OSMANTHUS));
    public static final DeferredBlock<Block> GINKGO_BUTTON =
            registerBlock("ginkgo_button", () -> woodenButton(ModBlockSetType.GINKGO));
    public static final DeferredBlock<Block> CHINESE_PARASOL_BUTTON =
            registerBlock("chinese_parasol_button", () -> woodenButton(ModBlockSetType.CHINESE_PARASOL));
    public static final DeferredBlock<Block> SWEETGUM_BUTTON =
            registerBlock("sweetgum_button", () -> woodenButton(ModBlockSetType.SWEETGUM));
    public static final DeferredBlock<Block> CAMPHOR_BUTTON =
            registerBlock("camphor_button", () -> woodenButton(ModBlockSetType.CAMPHOR));
    public static final DeferredBlock<Block> DOVE_TREE_BUTTON =
            registerBlock("dove_tree_button", () -> woodenButton(ModBlockSetType.DOVE_TREE));
    public static final DeferredBlock<Block> CHINABERRY_BUTTON =
            registerBlock("chinaberry_button", () -> woodenButton(ModBlockSetType.CHINABERRY));
    public static final DeferredBlock<Block> DESERT_POPLAR_BUTTON =
            registerBlock("desert_poplar_button", () -> woodenButton(ModBlockSetType.DESERT_POPLAR));

    public static final DeferredBlock<Block> RED_MEI_PRESSURE_PLATE =
            registerBlock("red_mei_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.RED_MEI, BlockBehaviour.Properties.of().mapColor(RED_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_MEI_PRESSURE_PLATE =
            registerBlock("white_mei_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.WHITE_MEI, BlockBehaviour.Properties.of().mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_PRESSURE_PLATE =
            registerBlock("green_calyx_mei_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.GREEN_CALYX_MEI, BlockBehaviour.Properties.of().mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_PRESSURE_PLATE =
            registerBlock("double_pink_mei_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.DOUBLE_PINK_MEI, BlockBehaviour.Properties.of().mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CRABAPPLE_PRESSURE_PLATE =
            registerBlock("crabapple_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.CRABAPPLE, BlockBehaviour.Properties.of().mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> APRICOT_PRESSURE_PLATE =
            registerBlock("apricot_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.APRICOT, BlockBehaviour.Properties.of().mapColor(APRICOT_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PEACH_PRESSURE_PLATE =
            registerBlock("peach_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.PEACH, BlockBehaviour.Properties.of().mapColor(PEACH_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PEAR_PRESSURE_PLATE =
            registerBlock("pear_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.PEAR, BlockBehaviour.Properties.of().mapColor(PEAR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_PRESSURE_PLATE =
            registerBlock("purple_leaf_plum_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.of().mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> OSMANTHUS_PRESSURE_PLATE =
            registerBlock("osmanthus_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.OSMANTHUS, BlockBehaviour.Properties.of().mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GINKGO_PRESSURE_PLATE =
            registerBlock("ginkgo_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.GINKGO, BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CHINESE_PARASOL_PRESSURE_PLATE =
            registerBlock("chinese_parasol_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.CHINESE_PARASOL, BlockBehaviour.Properties.of().mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> SWEETGUM_PRESSURE_PLATE =
            registerBlock("sweetgum_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.SWEETGUM, BlockBehaviour.Properties.of().mapColor(SWEETGUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CAMPHOR_PRESSURE_PLATE =
            registerBlock("camphor_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.CAMPHOR, BlockBehaviour.Properties.of().mapColor(CAMPHOR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DOVE_TREE_PRESSURE_PLATE =
            registerBlock("dove_tree_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.DOVE_TREE, BlockBehaviour.Properties.of().mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CHINABERRY_PRESSURE_PLATE =
            registerBlock("chinaberry_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.CHINABERRY, BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DESERT_POPLAR_PRESSURE_PLATE =
            registerBlock("desert_poplar_pressure_plate", () -> new PressurePlateBlock(ModBlockSetType.DESERT_POPLAR, BlockBehaviour.Properties.of().mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> RED_MEI_FENCE =
            registerBlock("red_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(RED_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> WHITE_MEI_FENCE =
            registerBlock("white_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_FENCE =
            registerBlock("green_calyx_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_FENCE =
            registerBlock("double_pink_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CRABAPPLE_FENCE =
            registerBlock("crabapple_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> APRICOT_FENCE =
            registerBlock("apricot_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(APRICOT_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> PEACH_FENCE =
            registerBlock("peach_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(PEACH_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> PEAR_FENCE =
            registerBlock("pear_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(PEAR_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_FENCE =
            registerBlock("purple_leaf_plum_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> OSMANTHUS_FENCE =
            registerBlock("osmanthus_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> GINKGO_FENCE =
            registerBlock("ginkgo_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHINESE_PARASOL_FENCE =
            registerBlock("chinese_parasol_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> SWEETGUM_FENCE =
            registerBlock("sweetgum_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(SWEETGUM_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CAMPHOR_FENCE =
            registerBlock("camphor_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CAMPHOR_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DOVE_TREE_FENCE =
            registerBlock("dove_tree_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> CHINABERRY_FENCE =
            registerBlock("chinaberry_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> DESERT_POPLAR_FENCE =
            registerBlock("desert_poplar_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> RED_MEI_FENCE_GATE =
            registerBlock("red_mei_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.RED_MEI, BlockBehaviour.Properties.of().mapColor(RED_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> WHITE_MEI_FENCE_GATE =
            registerBlock("white_mei_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.WHITE_MEI, BlockBehaviour.Properties.of().mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_FENCE_GATE =
            registerBlock("green_calyx_mei_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.GREEN_CALYX_MEI, BlockBehaviour.Properties.of().mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_FENCE_GATE =
            registerBlock("double_pink_mei_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.DOUBLE_PINK_MEI, BlockBehaviour.Properties.of().mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> CRABAPPLE_FENCE_GATE =
            registerBlock("crabapple_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.CRABAPPLE, BlockBehaviour.Properties.of().mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> APRICOT_FENCE_GATE =
            registerBlock("apricot_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.APRICOT, BlockBehaviour.Properties.of().mapColor(APRICOT_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> PEACH_FENCE_GATE =
            registerBlock("peach_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.PEACH, BlockBehaviour.Properties.of().mapColor(PEACH_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> PEAR_FENCE_GATE =
            registerBlock("pear_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.PEAR, BlockBehaviour.Properties.of().mapColor(PEAR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_FENCE_GATE =
            registerBlock("purple_leaf_plum_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.of().mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> OSMANTHUS_FENCE_GATE =
            registerBlock("osmanthus_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.OSMANTHUS, BlockBehaviour.Properties.of().mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> GINKGO_FENCE_GATE =
            registerBlock("ginkgo_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.GINKGO, BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> CHINESE_PARASOL_FENCE_GATE =
            registerBlock("chinese_parasol_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.CHINESE_PARASOL, BlockBehaviour.Properties.of().mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> SWEETGUM_FENCE_GATE =
            registerBlock("sweetgum_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.SWEETGUM, BlockBehaviour.Properties.of().mapColor(SWEETGUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> CAMPHOR_FENCE_GATE =
            registerBlock("camphor_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.CAMPHOR, BlockBehaviour.Properties.of().mapColor(CAMPHOR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> DOVE_TREE_FENCE_GATE =
            registerBlock("dove_tree_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.DOVE_TREE, BlockBehaviour.Properties.of().mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> CHINABERRY_FENCE_GATE =
            registerBlock("chinaberry_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.CHINABERRY, BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));
    public static final DeferredBlock<Block> DESERT_POPLAR_FENCE_GATE =
            registerBlock("desert_poplar_fence_gate", () -> new ModFenceGateBlock(ModWoodTypes.DESERT_POPLAR, BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava()));

    public static final DeferredBlock<Block> RED_MEI_DOOR =
            registerBlock("red_mei_door", () -> new DoorBlock(ModBlockSetType.RED_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(RED_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> WHITE_MEI_DOOR =
            registerBlock("white_mei_door", () -> new DoorBlock(ModBlockSetType.WHITE_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_DOOR =
            registerBlock("green_calyx_mei_door", () -> new DoorBlock(ModBlockSetType.GREEN_CALYX_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_DOOR =
            registerBlock("double_pink_mei_door", () -> new DoorBlock(ModBlockSetType.DOUBLE_PINK_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CRABAPPLE_DOOR =
            registerBlock("crabapple_door", () -> new DoorBlock(ModBlockSetType.CRABAPPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> APRICOT_DOOR =
            registerBlock("apricot_door", () -> new DoorBlock(ModBlockSetType.APRICOT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(APRICOT_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEACH_DOOR =
            registerBlock("peach_door", () -> new DoorBlock(ModBlockSetType.PEACH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(PEACH_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEAR_DOOR =
            registerBlock("pear_door", () -> new DoorBlock(ModBlockSetType.PEAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(PEAR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_DOOR =
            registerBlock("purple_leaf_plum_door", () -> new DoorBlock(ModBlockSetType.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> OSMANTHUS_DOOR =
            registerBlock("osmanthus_door", () -> new DoorBlock(ModBlockSetType.OSMANTHUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GINKGO_DOOR =
            registerBlock("ginkgo_door", () -> new DoorBlock(ModBlockSetType.GINKGO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(GINKGO_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINESE_PARASOL_DOOR =
            registerBlock("chinese_parasol_door", () -> new DoorBlock(ModBlockSetType.CHINESE_PARASOL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> SWEETGUM_DOOR =
            registerBlock("sweetgum_door", () -> new DoorBlock(ModBlockSetType.SWEETGUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(SWEETGUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CAMPHOR_DOOR =
            registerBlock("camphor_door", () -> new DoorBlock(ModBlockSetType.CAMPHOR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(CAMPHOR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOVE_TREE_DOOR =
            registerBlock("dove_tree_door", () -> new DoorBlock(ModBlockSetType.DOVE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINABERRY_DOOR =
            registerBlock("chinaberry_door", () -> new DoorBlock(ModBlockSetType.CHINABERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(CHINABERRY_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DESERT_POPLAR_DOOR =
            registerBlock("desert_poplar_door", () -> new DoorBlock(ModBlockSetType.DESERT_POPLAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor())));

    public static final DeferredBlock<Block> RED_MEI_TRAPDOOR =
            registerBlock("red_mei_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.RED_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_RED)));
    public static final DeferredBlock<Block> WHITE_MEI_TRAPDOOR =
            registerBlock("white_mei_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.WHITE_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.SNOW)));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_TRAPDOOR =
            registerBlock("green_calyx_mei_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.GREEN_CALYX_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_TRAPDOOR =
            registerBlock("double_pink_mei_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.DOUBLE_PINK_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_PINK)));
    public static final DeferredBlock<Block> CRABAPPLE_TRAPDOOR =
            registerBlock("crabapple_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.CRABAPPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_MAGENTA)));
    public static final DeferredBlock<Block> APRICOT_TRAPDOOR =
            registerBlock("apricot_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.APRICOT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_PINK)));
    public static final DeferredBlock<Block> PEACH_TRAPDOOR =
            registerBlock("peach_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.PEACH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_PINK)));
    public static final DeferredBlock<Block> PEAR_TRAPDOOR =
            registerBlock("pear_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.PEAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.SAND)));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_TRAPDOOR =
            registerBlock("purple_leaf_plum_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final DeferredBlock<Block> OSMANTHUS_TRAPDOOR =
            registerBlock("osmanthus_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.OSMANTHUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.WOOD)));
    public static final DeferredBlock<Block> GINKGO_TRAPDOOR =
            registerBlock("ginkgo_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.GINKGO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.GOLD)));
    public static final DeferredBlock<Block> CHINESE_PARASOL_TRAPDOOR =
            registerBlock("chinese_parasol_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.CHINESE_PARASOL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_GREEN)));
    public static final DeferredBlock<Block> SWEETGUM_TRAPDOOR =
            registerBlock("sweetgum_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.SWEETGUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.TERRACOTTA_RED)));
    public static final DeferredBlock<Block> CAMPHOR_TRAPDOOR =
            registerBlock("camphor_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.CAMPHOR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.WOOD)));
    public static final DeferredBlock<Block> DOVE_TREE_TRAPDOOR =
            registerBlock("dove_tree_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.DOVE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final DeferredBlock<Block> CHINABERRY_TRAPDOOR =
            registerBlock("chinaberry_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.CHINABERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.COLOR_RED)));
    public static final DeferredBlock<Block> DESERT_POPLAR_TRAPDOOR =
            registerBlock("desert_poplar_trapdoor", () -> new TrapDoorBlock(ModBlockSetType.DESERT_POPLAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR).mapColor(MapColor.WOOD)));

    public static final DeferredBlock<Block> RED_MEI_SIGN =
            BLOCKS.register("red_mei_sign", () -> new ModStandingSignBlock(ModWoodTypes.RED_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(MapColor.COLOR_RED)));
    public static final DeferredBlock<Block> WHITE_MEI_SIGN =
            BLOCKS.register("white_mei_sign", () -> new ModStandingSignBlock(ModWoodTypes.WHITE_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(MapColor.SNOW)));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_SIGN =
            BLOCKS.register("green_calyx_mei_sign", () -> new ModStandingSignBlock(ModWoodTypes.GREEN_CALYX_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_SIGN =
            BLOCKS.register("double_pink_mei_sign", () -> new ModStandingSignBlock(ModWoodTypes.DOUBLE_PINK_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CRABAPPLE_SIGN =
            BLOCKS.register("crabapple_sign", () -> new ModStandingSignBlock(ModWoodTypes.CRABAPPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> APRICOT_SIGN =
            BLOCKS.register("apricot_sign", () -> new ModStandingSignBlock(ModWoodTypes.APRICOT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEACH_SIGN =
            BLOCKS.register("peach_sign", () -> new ModStandingSignBlock(ModWoodTypes.PEACH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEAR_SIGN =
            BLOCKS.register("pear_sign", () -> new ModStandingSignBlock(ModWoodTypes.PEAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_SIGN =
            BLOCKS.register("purple_leaf_plum_sign", () -> new ModStandingSignBlock(ModWoodTypes.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> OSMANTHUS_SIGN =
            BLOCKS.register("osmanthus_sign", () -> new ModStandingSignBlock(ModWoodTypes.OSMANTHUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GINKGO_SIGN =
            BLOCKS.register("ginkgo_sign", () -> new ModStandingSignBlock(ModWoodTypes.GINKGO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINESE_PARASOL_SIGN =
            BLOCKS.register("chinese_parasol_sign", () -> new ModStandingSignBlock(ModWoodTypes.CHINESE_PARASOL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> SWEETGUM_SIGN =
            BLOCKS.register("sweetgum_sign", () -> new ModStandingSignBlock(ModWoodTypes.SWEETGUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CAMPHOR_SIGN =
            BLOCKS.register("camphor_sign", () -> new ModStandingSignBlock(ModWoodTypes.CAMPHOR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOVE_TREE_SIGN =
            BLOCKS.register("dove_tree_sign", () -> new ModStandingSignBlock(ModWoodTypes.DOVE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINABERRY_SIGN =
            BLOCKS.register("chinaberry_sign", () -> new ModStandingSignBlock(ModWoodTypes.CHINABERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DESERT_POPLAR_SIGN =
            BLOCKS.register("desert_poplar_sign", () -> new ModStandingSignBlock(ModWoodTypes.DESERT_POPLAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor())));

    public static final DeferredBlock<Block> RED_MEI_WALL_SIGN =
            BLOCKS.register("red_mei_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.RED_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(RED_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> WHITE_MEI_WALL_SIGN =
            BLOCKS.register("white_mei_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.WHITE_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_WALL_SIGN =
            BLOCKS.register("green_calyx_mei_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.GREEN_CALYX_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_WALL_SIGN =
            BLOCKS.register("double_pink_mei_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.DOUBLE_PINK_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CRABAPPLE_WALL_SIGN =
            BLOCKS.register("crabapple_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.CRABAPPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> APRICOT_WALL_SIGN =
            BLOCKS.register("apricot_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.APRICOT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEACH_WALL_SIGN =
            BLOCKS.register("peach_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.PEACH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEAR_WALL_SIGN =
            BLOCKS.register("pear_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.PEAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_WALL_SIGN =
            BLOCKS.register("purple_leaf_plum_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> OSMANTHUS_WALL_SIGN =
            BLOCKS.register("osmanthus_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.OSMANTHUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GINKGO_WALL_SIGN =
            BLOCKS.register("ginkgo_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.GINKGO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINESE_PARASOL_WALL_SIGN =
            BLOCKS.register("chinese_parasol_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.CHINESE_PARASOL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> SWEETGUM_WALL_SIGN =
            BLOCKS.register("sweetgum_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.SWEETGUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CAMPHOR_WALL_SIGN =
            BLOCKS.register("camphor_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.CAMPHOR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOVE_TREE_WALL_SIGN =
            BLOCKS.register("dove_tree_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.DOVE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINABERRY_WALL_SIGN =
            BLOCKS.register("chinaberry_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.CHINABERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DESERT_POPLAR_WALL_SIGN =
            BLOCKS.register("desert_poplar_wall_sign", () -> new ModWallSignBlock(ModWoodTypes.DESERT_POPLAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor())));

    public static final DeferredBlock<Block> RED_MEI_HANGING_SIGN =
            BLOCKS.register("red_mei_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.RED_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(RED_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> WHITE_MEI_HANGING_SIGN =
            BLOCKS.register("white_mei_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.WHITE_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_HANGING_SIGN =
            BLOCKS.register("green_calyx_mei_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.GREEN_CALYX_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_HANGING_SIGN =
            BLOCKS.register("double_pink_mei_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.DOUBLE_PINK_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CRABAPPLE_HANGING_SIGN =
            BLOCKS.register("crabapple_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.CRABAPPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> APRICOT_HANGING_SIGN =
            BLOCKS.register("apricot_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.APRICOT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEACH_HANGING_SIGN =
            BLOCKS.register("peach_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.PEACH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEAR_HANGING_SIGN =
            BLOCKS.register("pear_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.PEAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_HANGING_SIGN =
            BLOCKS.register("purple_leaf_plum_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> OSMANTHUS_HANGING_SIGN =
            BLOCKS.register("osmanthus_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.OSMANTHUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GINKGO_HANGING_SIGN =
            BLOCKS.register("ginkgo_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.GINKGO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINESE_PARASOL_HANGING_SIGN =
            BLOCKS.register("chinese_parasol_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.CHINESE_PARASOL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> SWEETGUM_HANGING_SIGN =
            BLOCKS.register("sweetgum_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.SWEETGUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CAMPHOR_HANGING_SIGN =
            BLOCKS.register("camphor_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.CAMPHOR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOVE_TREE_HANGING_SIGN =
            BLOCKS.register("dove_tree_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.DOVE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINABERRY_HANGING_SIGN =
            BLOCKS.register("chinaberry_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.CHINABERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DESERT_POPLAR_HANGING_SIGN =
            BLOCKS.register("desert_poplar_hanging_sign", () -> new ModHangingSignBlock(ModWoodTypes.DESERT_POPLAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor())));

    public static final DeferredBlock<Block> RED_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("red_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.RED_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(RED_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> WHITE_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("white_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.WHITE_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("green_calyx_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.GREEN_CALYX_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("double_pink_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.DOUBLE_PINK_MEI, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CRABAPPLE_WALL_HANGING_SIGN =
            BLOCKS.register("crabapple_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.CRABAPPLE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> APRICOT_WALL_HANGING_SIGN =
            BLOCKS.register("apricot_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.APRICOT, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEACH_WALL_HANGING_SIGN =
            BLOCKS.register("peach_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.PEACH, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PEAR_WALL_HANGING_SIGN =
            BLOCKS.register("pear_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.PEAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_WALL_HANGING_SIGN =
            BLOCKS.register("purple_leaf_plum_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> OSMANTHUS_WALL_HANGING_SIGN =
            BLOCKS.register("osmanthus_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.OSMANTHUS, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> GINKGO_WALL_HANGING_SIGN =
            BLOCKS.register("ginkgo_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.GINKGO, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINESE_PARASOL_WALL_HANGING_SIGN =
            BLOCKS.register("chinese_parasol_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.CHINESE_PARASOL, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> SWEETGUM_WALL_HANGING_SIGN =
            BLOCKS.register("sweetgum_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.SWEETGUM, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CAMPHOR_WALL_HANGING_SIGN =
            BLOCKS.register("camphor_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.CAMPHOR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DOVE_TREE_WALL_HANGING_SIGN =
            BLOCKS.register("dove_tree_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.DOVE_TREE, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> CHINABERRY_WALL_HANGING_SIGN =
            BLOCKS.register("chinaberry_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.CHINABERRY, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor())));
    public static final DeferredBlock<Block> DESERT_POPLAR_WALL_HANGING_SIGN =
            BLOCKS.register("desert_poplar_wall_hanging_sign", () -> new ModWallHangingSignBlock(ModWoodTypes.DESERT_POPLAR, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor())));

    public static final DeferredBlock<Block> RED_MEI_SAPLING =
            registerBlock("red_mei_sapling", () -> new SaplingBlock(ModTreeGrower.RED_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_MEI_SAPLING =
            registerBlock("white_mei_sapling", () -> new SaplingBlock(ModTreeGrower.WHITE_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_CALYX_MEI_SAPLING =
            registerBlock("green_calyx_mei_sapling", () -> new SaplingBlock(ModTreeGrower.GREEN_CALYX_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DOUBLE_PINK_MEI_SAPLING =
            registerBlock("double_pink_mei_sapling", () -> new SaplingBlock(ModTreeGrower.DOUBLE_PINK_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VERSICOLOR_MEI_SAPLING =
            registerBlock("versicolor_mei_sapling", () -> new SaplingBlock(ModTreeGrower.VERSICOLOR_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_WEEPING_MEI_SAPLING =
            registerBlock("red_weeping_mei_sapling", () -> new SaplingBlock(ModTreeGrower.RED_WEEPING_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_WEEPING_MEI_SAPLING =
            registerBlock("white_weeping_mei_sapling", () -> new SaplingBlock(ModTreeGrower.WHITE_WEEPING_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_WEEPING_MEI_SAPLING =
            registerBlock("green_weeping_mei_sapling", () -> new SaplingBlock(ModTreeGrower.GREEN_WEEPING_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_WEEPING_MEI_SAPLING =
            registerBlock("pink_weeping_mei_sapling", () -> new SaplingBlock(ModTreeGrower.PINK_WEEPING_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VERSICOLOR_WEEPING_MEI_SAPLING =
            registerBlock("versicolor_weeping_mei_sapling", () -> new SaplingBlock(ModTreeGrower.VERSICOLOR_WEEPING_MEI, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> UPRIGHT_CRABAPPLE_SAPLING =
            registerBlock("upright_crabapple_sapling", () -> new SaplingBlock(ModTreeGrower.UPRIGHT_CRABAPPLE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WEEPING_CRABAPPLE_SAPLING =
            registerBlock("weeping_crabapple_sapling", () -> new SaplingBlock(ModTreeGrower.WEEPING_CRABAPPLE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_APRICOT_SAPLING =
            registerBlock("pink_apricot_sapling", () -> new SaplingBlock(ModTreeGrower.PINK_APRICOT, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_APRICOT_SAPLING =
            registerBlock("white_apricot_sapling", () -> new SaplingBlock(ModTreeGrower.WHITE_APRICOT, BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> ORNAMENTAL_PEACH_SAPLING =
            registerBlock("ornamental_peach_sapling", () -> new SaplingBlock(ModTreeGrower.ORNAMENTAL_PEACH, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WILD_PEACH_SAPLING =
            registerBlock("wild_peach_sapling", () -> new SaplingBlock(ModTreeGrower.WILD_PEACH, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PEAR_SAPLING =
            registerBlock("pear_sapling", () -> new SaplingBlock(ModTreeGrower.PEAR, BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> FLOWERING_PURPLE_LEAF_PLUM_SAPLING =
            registerBlock("flowering_purple_leaf_plum_sapling", () -> new SaplingBlock(ModTreeGrower.FLOWERING_PURPLE_LEAF_PLUM, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PURPLE_LEAF_PLUM_SAPLING =
            registerBlock("purple_leaf_plum_sapling", () -> new SaplingBlock(ModTreeGrower.PURPLE_LEAF_PLUM, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLDEN_OSMANTHUS_SAPLING =
            registerBlock("golden_osmanthus_sapling", () -> new SaplingBlock(ModTreeGrower.GOLDEN_OSMANTHUS, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> ORANGE_OSMANTHUS_SAPLING =
            registerBlock("orange_osmanthus_sapling", () -> new SaplingBlock(ModTreeGrower.ORANGE_OSMANTHUS, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_OSMANTHUS_SAPLING =
            registerBlock("white_osmanthus_sapling", () -> new SaplingBlock(ModTreeGrower.WHITE_OSMANTHUS, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLDEN_GINKGO_SAPLING =
            registerBlock("golden_ginkgo_sapling", () -> new SaplingBlock(ModTreeGrower.GOLDEN_GINKGO, BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_GINKGO_SAPLING =
            registerBlock("green_ginkgo_sapling", () -> new SaplingBlock(ModTreeGrower.GREEN_GINKGO, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> YELLOW_CHINESE_PARASOL_SAPLING =
            registerBlock("yellow_chinese_parasol_sapling", () -> new SaplingBlock(ModTreeGrower.YELLOW_CHINESE_PARASOL, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_CHINESE_PARASOL_SAPLING =
            registerBlock("green_chinese_parasol_sapling", () -> new SaplingBlock(ModTreeGrower.GREEN_CHINESE_PARASOL, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> SWEETGUM_SAPLING =
            registerBlock("sweetgum_sapling", () -> new SaplingBlock(ModTreeGrower.SWEETGUM, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CAMPHOR_SAPLING =
            registerBlock("camphor_sapling", () -> new SaplingBlock(ModTreeGrower.CAMPHOR, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DOVE_TREE_SAPLING =
            registerBlock("dove_tree_sapling", () -> new SaplingBlock(ModTreeGrower.DOVE_TREE, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CHINABERRY_SAPLING =
            registerBlock("chinaberry_sapling", () -> new SaplingBlock(ModTreeGrower.CHINABERRY, BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DESERT_POPLAR_SAPLING =
            registerBlock("desert_poplar_sapling", () -> new DesertSaplingBlock(ModTreeGrower.DESERT_POPLAR, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CRAPE_MYRTLE_SAPLING =
            registerBlock("crape_myrtle_sapling", () -> new CrapeMyrtleSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> POTTED_RED_MEI_SAPLING =
            BLOCKS.register("potted_red_mei_sapling", () -> flowerPot(RED_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_MEI_SAPLING =
            BLOCKS.register("potted_white_mei_sapling", () -> flowerPot(WHITE_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_GREEN_CALYX_MEI_SAPLING =
            BLOCKS.register("potted_green_calyx_mei_sapling", () -> flowerPot(GREEN_CALYX_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_DOUBLE_PINK_MEI_SAPLING =
            BLOCKS.register("potted_double_pink_mei_sapling", () -> flowerPot(DOUBLE_PINK_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_VERSICOLOR_MEI_SAPLING =
            BLOCKS.register("potted_versicolor_mei_sapling", () -> flowerPot(VERSICOLOR_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_RED_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_red_weeping_mei_sapling", () -> flowerPot(RED_WEEPING_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_white_weeping_mei_sapling", () -> flowerPot(WHITE_WEEPING_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_GREEN_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_green_weeping_mei_sapling", () -> flowerPot(GREEN_WEEPING_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_PINK_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_pink_weeping_mei_sapling", () -> flowerPot(PINK_WEEPING_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_VERSICOLOR_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_versicolor_weeping_mei_sapling", () -> flowerPot(VERSICOLOR_WEEPING_MEI_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_UPRIGHT_CRABAPPLE_SAPLING =
            BLOCKS.register("potted_upright_crabapple_sapling", () -> flowerPot(UPRIGHT_CRABAPPLE_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_WEEPING_CRABAPPLE_SAPLING =
            BLOCKS.register("potted_weeping_crabapple_sapling", () -> flowerPot(WEEPING_CRABAPPLE_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_PINK_APRICOT_SAPLING =
            BLOCKS.register("potted_pink_apricot_sapling", () -> flowerPot(PINK_APRICOT_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_APRICOT_SAPLING =
            BLOCKS.register("potted_white_apricot_sapling", () -> flowerPot(WHITE_APRICOT_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_ORNAMENTAL_PEACH_SAPLING =
            BLOCKS.register("potted_ornamental_peach_sapling", () -> flowerPot(ORNAMENTAL_PEACH_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_WILD_PEACH_SAPLING =
            BLOCKS.register("potted_wild_peach_sapling", () -> flowerPot(WILD_PEACH_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_PEAR_SAPLING =
            BLOCKS.register("potted_pear_sapling", () -> flowerPot(PEAR_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_FLOWERING_PURPLE_LEAF_PLUM_SAPLING =
            BLOCKS.register("potted_flowering_purple_leaf_plum_sapling", () -> flowerPot(FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_PURPLE_LEAF_PLUM_SAPLING =
            BLOCKS.register("potted_purple_leaf_plum_sapling", () -> flowerPot(PURPLE_LEAF_PLUM_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_GOLDEN_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_golden_osmanthus_sapling", () -> flowerPot(GOLDEN_OSMANTHUS_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_ORANGE_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_orange_osmanthus_sapling", () -> flowerPot(ORANGE_OSMANTHUS_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_white_osmanthus_sapling", () -> flowerPot(WHITE_OSMANTHUS_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_GOLDEN_GINKGO_SAPLING =
            BLOCKS.register("potted_golden_ginkgo_sapling", () -> flowerPot(GOLDEN_GINKGO_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_GREEN_GINKGO_SAPLING =
            BLOCKS.register("potted_green_ginkgo_sapling", () -> flowerPot(GREEN_GINKGO_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_YELLOW_CHINESE_PARASOL_SAPLING =
            BLOCKS.register("potted_yellow_chinese_parasol_sapling", () -> flowerPot(YELLOW_CHINESE_PARASOL_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_GREEN_CHINESE_PARASOL_SAPLING =
            BLOCKS.register("potted_green_chinese_parasol_sapling", () -> flowerPot(GREEN_CHINESE_PARASOL_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_SWEETGUM_SAPLING =
            BLOCKS.register("potted_sweetgum_sapling", () -> flowerPot(SWEETGUM_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_CAMPHOR_SAPLING =
            BLOCKS.register("potted_camphor_sapling", () -> flowerPot(CAMPHOR_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_DOVE_TREE_SAPLING =
            BLOCKS.register("potted_dove_tree_sapling", () -> flowerPot(DOVE_TREE_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_CHINABERRY_SAPLING =
            BLOCKS.register("potted_chinaberry_sapling", () -> flowerPot(CHINABERRY_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_DESERT_POPLAR_SAPLING =
            BLOCKS.register("potted_desert_poplar_sapling", () -> flowerPot(DESERT_POPLAR_SAPLING.get()));
    public static final DeferredBlock<Block> POTTED_CRAPE_MYRTLE_SAPLING =
            BLOCKS.register("potted_crape_myrtle_sapling", () -> flowerPot(CRAPE_MYRTLE_SAPLING.get()));

    public static final DeferredBlock<Block> CHRYSANTHEMUM =
            registerBlock("chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLDEN_CHRYSANTHEMUM =
            registerBlock("golden_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLD_BACKED_SCARLET_MUM =
            registerBlock("gold_backed_scarlet_mum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_CHRYSANTHEMUM =
            registerBlock("white_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_CHRYSANTHEMUM =
            registerBlock("green_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PURPLE_CHRYSANTHEMUM =
            registerBlock("purple_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VIOLET_PINK_CHRYSANTHEMUM =
            registerBlock("violet_pink_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_CHRYSANTHEMUM =
            registerBlock("pink_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> LIGHT_PINK_CHRYSANTHEMUM =
            registerBlock("light_pink_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> SPRING_CYMBIDIUM =
            registerBlock("spring_cymbidium", () -> new FlowerBlock(MobEffects.LUCK, 7, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> SUMMER_CYMBIDIUM =
            registerBlock("summer_cymbidium", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> AUTUMN_CYMBIDIUM =
            registerBlock("autumn_cymbidium", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PEONY =
            registerBlock("peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> LIGHT_PINK_PEONY =
            registerBlock("light_pink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VIOLET_PINK_PEONY =
            registerBlock("violet_pink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_PEONY =
            registerBlock("pink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_PEONY =
            registerBlock("red_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> LIGHT_RED_PEONY =
            registerBlock("light_red_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> INK_RED_PEONY =
            registerBlock("ink_red_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VERMILION_PEONY =
            registerBlock("vermilion_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PURPLE_PEONY =
            registerBlock("purple_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> LIGHT_PURPLE_PEONY =
            registerBlock("light_purple_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> INK_PURPLE_PEONY =
            registerBlock("ink_purple_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VIOLET_PEONY =
            registerBlock("violet_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> YELLOW_PEONY =
            registerBlock("yellow_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> LIGHT_YELLOW_PEONY =
            registerBlock("light_yellow_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> OCHRE_YELLOW_PEONY =
            registerBlock("ochre_yellow_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLDEN_PEONY =
            registerBlock("golden_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_PEONY =
            registerBlock("white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> INK_PEONY =
            registerBlock("ink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BLUE_PEONY =
            registerBlock("blue_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GREEN_PEONY =
            registerBlock("green_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> COLORFUL_PEONY =
            registerBlock("colorful_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> LIGHT_COLORFUL_PEONY =
            registerBlock("light_colorful_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> INK_COLORFUL_PEONY =
            registerBlock("ink_colorful_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_WHITE_PEONY =
            registerBlock("red_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_WHITE_PEONY =
            registerBlock("pink_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> YELLOW_WHITE_PEONY =
            registerBlock("yellow_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PURPLE_WHITE_PEONY =
            registerBlock("purple_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WU_HUA_LONG_YU_PEONY =
            registerBlock("wu_hua_long_yu_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> MAUVE_PEONY =
            registerBlock("mauve_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CAMELLIA =
            registerBlock("camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_CAMELLIA =
            registerBlock("white_camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_CAMELLIA =
            registerBlock("pink_camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VERSICOLOR_CAMELLIA =
            registerBlock("versicolor_camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CRIMSON_AZALEA =
            registerBlock("crimson_azalea", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> FOUNTAIN_GRASS =
            registerBlock("fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PURPLE_FOUNTAIN_GRASS =
            registerBlock("purple_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_FOUNTAIN_GRASS =
            registerBlock("pink_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_FOUNTAIN_GRASS =
            registerBlock("white_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> BAMBOO_STICK =
            BLOCKS.register("bamboo_stick", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> POTTED_CHRYSANTHEMUM =
            BLOCKS.register("potted_chrysanthemum", () -> flowerPot(CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_GOLDEN_CHRYSANTHEMUM =
            BLOCKS.register("potted_golden_chrysanthemum", () -> flowerPot(GOLDEN_CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_GOLD_BACKED_SCARLET_MUM =
            BLOCKS.register("potted_gold_backed_scarlet_mum", () -> flowerPot(GOLD_BACKED_SCARLET_MUM.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_CHRYSANTHEMUM =
            BLOCKS.register("potted_white_chrysanthemum", () -> flowerPot(WHITE_CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_GREEN_CHRYSANTHEMUM =
            BLOCKS.register("potted_green_chrysanthemum", () -> flowerPot(GREEN_CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_PURPLE_CHRYSANTHEMUM =
            BLOCKS.register("potted_purple_chrysanthemum", () -> flowerPot(PURPLE_CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_VIOLET_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_violet_pink_chrysanthemum", () -> flowerPot(VIOLET_PINK_CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_pink_chrysanthemum", () -> flowerPot(PINK_CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_LIGHT_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_light_pink_chrysanthemum", () -> flowerPot(LIGHT_PINK_CHRYSANTHEMUM.get()));
    public static final DeferredBlock<Block> POTTED_SPRING_CYMBIDIUM =
            BLOCKS.register("potted_spring_cymbidium", () -> flowerPot(SPRING_CYMBIDIUM.get()));
    public static final DeferredBlock<Block> POTTED_SUMMER_CYMBIDIUM =
            BLOCKS.register("potted_summer_cymbidium", () -> flowerPot(SUMMER_CYMBIDIUM.get()));
    public static final DeferredBlock<Block> POTTED_AUTUMN_CYMBIDIUM =
            BLOCKS.register("potted_autumn_cymbidium", () -> flowerPot(AUTUMN_CYMBIDIUM.get()));
    public static final DeferredBlock<Block> POTTED_PEONY =
            BLOCKS.register("potted_peony", () -> flowerPot(PEONY.get()));
    public static final DeferredBlock<Block> POTTED_LIGHT_PINK_PEONY =
            BLOCKS.register("potted_light_pink_peony", () -> flowerPot(LIGHT_PINK_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_VIOLET_PINK_PEONY =
            BLOCKS.register("potted_violet_pink_peony", () -> flowerPot(VIOLET_PINK_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_PINK_PEONY =
            BLOCKS.register("potted_pink_peony", () -> flowerPot(PINK_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_RED_PEONY =
            BLOCKS.register("potted_red_peony", () -> flowerPot(RED_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_LIGHT_RED_PEONY =
            BLOCKS.register("potted_light_red_peony", () -> flowerPot(LIGHT_RED_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_INK_RED_PEONY =
            BLOCKS.register("potted_ink_red_peony", () -> flowerPot(INK_RED_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_VERMILION_PEONY =
            BLOCKS.register("potted_vermilion_peony", () -> flowerPot(VERMILION_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_PURPLE_PEONY =
            BLOCKS.register("potted_purple_peony", () -> flowerPot(PURPLE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_LIGHT_PURPLE_PEONY =
            BLOCKS.register("potted_light_purple_peony", () -> flowerPot(LIGHT_PURPLE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_INK_PURPLE_PEONY =
            BLOCKS.register("potted_ink_purple_peony", () -> flowerPot(INK_PURPLE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_VIOLET_PEONY =
            BLOCKS.register("potted_violet_peony", () -> flowerPot(VIOLET_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_YELLOW_PEONY =
            BLOCKS.register("potted_yellow_peony", () -> flowerPot(YELLOW_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_LIGHT_YELLOW_PEONY =
            BLOCKS.register("potted_light_yellow_peony", () -> flowerPot(LIGHT_YELLOW_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_OCHRE_YELLOW_PEONY =
            BLOCKS.register("potted_ochre_yellow_peony", () -> flowerPot(OCHRE_YELLOW_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_GOLDEN_PEONY =
            BLOCKS.register("potted_golden_peony", () -> flowerPot(GOLDEN_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_PEONY =
            BLOCKS.register("potted_white_peony", () -> flowerPot(WHITE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_INK_PEONY =
            BLOCKS.register("potted_ink_peony", () -> flowerPot(INK_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_BLUE_PEONY =
            BLOCKS.register("potted_blue_peony", () -> flowerPot(BLUE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_GREEN_PEONY =
            BLOCKS.register("potted_green_peony", () -> flowerPot(GREEN_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_COLORFUL_PEONY =
            BLOCKS.register("potted_colorful_peony", () -> flowerPot(COLORFUL_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_LIGHT_COLORFUL_PEONY =
            BLOCKS.register("potted_light_colorful_peony", () -> flowerPot(LIGHT_COLORFUL_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_INK_COLORFUL_PEONY =
            BLOCKS.register("potted_ink_colorful_peony", () -> flowerPot(INK_COLORFUL_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_RED_WHITE_PEONY =
            BLOCKS.register("potted_red_white_peony", () -> flowerPot(RED_WHITE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_PINK_WHITE_PEONY =
            BLOCKS.register("potted_pink_white_peony", () -> flowerPot(PINK_WHITE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_YELLOW_WHITE_PEONY =
            BLOCKS.register("potted_yellow_white_peony", () -> flowerPot(YELLOW_WHITE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_PURPLE_WHITE_PEONY =
            BLOCKS.register("potted_purple_white_peony", () -> flowerPot(PURPLE_WHITE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_WU_HUA_LONG_YU_PEONY =
            BLOCKS.register("potted_wu_hua_long_yu_peony", () -> flowerPot(WU_HUA_LONG_YU_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_MAUVE_PEONY =
            BLOCKS.register("potted_mauve_peony", () -> flowerPot(MAUVE_PEONY.get()));
    public static final DeferredBlock<Block> POTTED_CAMELLIA =
            BLOCKS.register("potted_camellia", () -> flowerPot(CAMELLIA.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_CAMELLIA =
            BLOCKS.register("potted_white_camellia", () -> flowerPot(WHITE_CAMELLIA.get()));
    public static final DeferredBlock<Block> POTTED_PINK_CAMELLIA =
            BLOCKS.register("potted_pink_camellia", () -> flowerPot(PINK_CAMELLIA.get()));
    public static final DeferredBlock<Block> POTTED_VERSICOLOR_CAMELLIA =
            BLOCKS.register("potted_versicolor_camellia", () -> flowerPot(VERSICOLOR_CAMELLIA.get()));
    public static final DeferredBlock<Block> POTTED_CRIMSON_AZALEA =
            BLOCKS.register("potted_crimson_azalea", () -> flowerPot(CRIMSON_AZALEA.get()));
    public static final DeferredBlock<Block> POTTED_FOUNTAIN_GRASS =
            BLOCKS.register("potted_fountain_grass", () -> flowerPot(FOUNTAIN_GRASS.get()));
    public static final DeferredBlock<Block> POTTED_PURPLE_FOUNTAIN_GRASS =
            BLOCKS.register("potted_purple_fountain_grass", () -> flowerPot(PURPLE_FOUNTAIN_GRASS.get()));
    public static final DeferredBlock<Block> POTTED_PINK_FOUNTAIN_GRASS =
            BLOCKS.register("potted_pink_fountain_grass", () -> flowerPot(PINK_FOUNTAIN_GRASS.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_FOUNTAIN_GRASS =
            BLOCKS.register("potted_white_fountain_grass", () -> flowerPot(WHITE_FOUNTAIN_GRASS.get()));
    public static final DeferredBlock<Block> POTTED_BAMBOO_STICK =
            BLOCKS.register("potted_bamboo_stick", () -> flowerPot(BAMBOO_STICK.get()));

    public static final DeferredBlock<Block> WINTERSWEET =
            registerBlock("wintersweet", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> TWO_QIAO_PEONY =
            registerBlock("two_qiao_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VERSICOLOR_PEONY =
            registerBlock("versicolor_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WINTER_CYMBIDIUM =
            registerBlock("winter_cymbidium", () -> new WinterCymbidiumBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CHINESE_ROSE =
            registerBlock("chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_CHINESE_ROSE =
            registerBlock("pink_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> YELLOW_CHINESE_ROSE =
            registerBlock("yellow_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> WHITE_CHINESE_ROSE =
            registerBlock("white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_PINK_CHINESE_ROSE =
            registerBlock("red_pink_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_YELLOW_CHINESE_ROSE =
            registerBlock("red_yellow_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_WHITE_CHINESE_ROSE =
            registerBlock("red_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> PINK_WHITE_CHINESE_ROSE =
            registerBlock("pink_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> YELLOW_WHITE_CHINESE_ROSE =
            registerBlock("yellow_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> CRAPE_MYRTLE =
            registerBlock("crape_myrtle", () -> new ModRotatedPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> COTTON_ROSE =
            registerBlock("cotton_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> MISCANTHUS =
            registerBlock("miscanthus", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> GOLDEN_MISCANTHUS =
            BLOCKS.register("golden_miscanthus", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> POTTED_WINTER_CYMBIDIUM =
            BLOCKS.register("potted_winter_cymbidium", () -> flowerPot(WINTER_CYMBIDIUM.get()));
    public static final DeferredBlock<Block> POTTED_WINTERSWEET =
            BLOCKS.register("potted_wintersweet", () -> flowerPot(WINTERSWEET.get()));
    public static final DeferredBlock<Block> POTTED_CHINESE_ROSE =
            BLOCKS.register("potted_chinese_rose", () -> flowerPot(CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_PINK_CHINESE_ROSE =
            BLOCKS.register("potted_pink_chinese_rose", () -> flowerPot(PINK_CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_YELLOW_CHINESE_ROSE =
            BLOCKS.register("potted_yellow_chinese_rose", () -> flowerPot(YELLOW_CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_white_chinese_rose", () -> flowerPot(WHITE_CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_RED_PINK_CHINESE_ROSE =
            BLOCKS.register("potted_red_pink_chinese_rose", () -> flowerPot(RED_PINK_CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_RED_YELLOW_CHINESE_ROSE =
            BLOCKS.register("potted_red_yellow_chinese_rose", () -> flowerPot(RED_YELLOW_CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_RED_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_red_white_chinese_rose", () -> flowerPot(RED_WHITE_CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_PINK_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_pink_white_chinese_rose", () -> flowerPot(PINK_WHITE_CHINESE_ROSE.get()));
    public static final DeferredBlock<Block> POTTED_YELLOW_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_yellow_white_chinese_rose", () -> flowerPot(YELLOW_WHITE_CHINESE_ROSE.get()));

    public static final DeferredBlock<Block> PEACH_PINK_PETALS =
            registerBlock("peach_pink_petals", () -> new ModFlowerPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> FRAGRANT_SNOW_PETALS =
            registerBlock("fragrant_snow_petals", () -> new ModFlowerPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> MOTTLED_BAMBOO_SAPLING =
            BLOCKS.register("mottled_bamboo_sapling", () -> new MottledBambooSaplingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SAPLING)));
    public static final DeferredBlock<Block> MOTTLED_BAMBOO =
            BLOCKS.register("mottled_bamboo", () -> new MottledBambooStalkBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO)));
    public static final DeferredBlock<Block> POTTED_MOTTLED_BAMBOO =
            BLOCKS.register("potted_mottled_bamboo", () -> flowerPot(MOTTLED_BAMBOO.get()));
    public static final DeferredBlock<Block> BLACK_BAMBOO_SAPLING =
            BLOCKS.register("black_bamboo_sapling", () -> new BlackBambooSaplingBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_SAPLING)));
    public static final DeferredBlock<Block> BLACK_BAMBOO =
            BLOCKS.register("black_bamboo", () -> new BlackBambooStalkBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO)));
    public static final DeferredBlock<Block> POTTED_BLACK_BAMBOO =
            BLOCKS.register("potted_black_bamboo", () -> flowerPot(BLACK_BAMBOO.get()));

    public static final DeferredBlock<Block> LOTUS =
            registerBlock("lotus", () -> new WaterLotusBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LILY_PAD).mapColor(MapColor.COLOR_PINK).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final DeferredBlock<Block> WHITE_LOTUS =
            registerBlock("white_lotus", () -> new WaterLotusBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LILY_PAD).mapColor(MapColor.SNOW).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final DeferredBlock<Block> LOTUS_LEAF =
            registerBlock("lotus_leaf", () -> new WaterLotusLeafBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.LILY_PAD).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));

    public static final DeferredBlock<Block> ORNAMENTAL_PEACH_PETALS =
            BLOCKS.register("ornamental_peach_petals", () -> leafPile(MapColor.COLOR_PINK, SoundType.PINK_PETALS));
    public static final DeferredBlock<Block> WILD_PEACH_PETALS =
            BLOCKS.register("wild_peach_petals", () -> leafPile(MapColor.COLOR_PINK, SoundType.PINK_PETALS));
    public static final DeferredBlock<Block> CHINESE_PARASOL_LEAF_0 =
            BLOCKS.register("chinese_parasol_leaf_0", () -> leafPile(MapColor.COLOR_YELLOW, SoundType.PINK_PETALS));
    public static final DeferredBlock<Block> CHINESE_PARASOL_LEAF_1 =
            BLOCKS.register("chinese_parasol_leaf_1", () -> leafPile(MapColor.COLOR_ORANGE, SoundType.PINK_PETALS));
    public static final DeferredBlock<Block> SWEETGUM_LEAF_PILE_0 =
            BLOCKS.register("sweetgum_leaf_pile_0", () -> leafPile(MapColor.COLOR_RED, SoundType.PINK_PETALS));
    public static final DeferredBlock<Block> SWEETGUM_LEAF_PILE_1 =
            BLOCKS.register("sweetgum_leaf_pile_1", () -> leafPile(MapColor.COLOR_RED,SoundType.PINK_PETALS));
    public static final DeferredBlock<Block> GINKGO_LEAF_PILE =
            BLOCKS.register("ginkgo_leaf_pile", () -> leafPile(MapColor.COLOR_YELLOW,SoundType.PINK_PETALS));

    private static Block log(MapColor topMapColor, MapColor sideMapColor) {
        return new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(p_152624_ -> p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor)
                        .instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
    }

    private static Block woodenButton(BlockSetType type) {
        return new ButtonBlock(type, 30, BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY));
    }

    private static Block flowerPot(Block potted) {
        return new FlowerPotBlock(potted, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY));
    }

    private static Block stair(Block baseBlock) {
        return new ModStairBlock(baseBlock.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(baseBlock));
    }

    public static Block leafPile(MapColor pColor, SoundType pType) {
        return new LeafPileBlock(BlockBehaviour.Properties.of().mapColor(pColor).noCollission().sound(pType).pushReaction(PushReaction.DESTROY));
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        registerBlockItem(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
