package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.BambooBlocks.BlackBambooSaplingBlock;
import com.jinlan.moreornplants.block.BambooBlocks.BlackBambooStalkBlock;
import com.jinlan.moreornplants.block.BambooBlocks.MottledBambooSaplingBlock;
import com.jinlan.moreornplants.block.BambooBlocks.MottledBambooStalkBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.*;
import com.jinlan.moreornplants.block.LeavesBlocks.*;
import com.jinlan.moreornplants.block.WeepingBlocks.*;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModWoodTypes;
import com.jinlan.moreornplants.worldgen.tree.*;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<Block> RED_MEI_LEAVES =
            registerBlock("red_mei_leaves", () -> new RedMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> WHITE_MEI_LEAVES =
            registerBlock("white_mei_leaves", () -> new WhiteMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_LEAVES =
            registerBlock("green_calyx_mei_leaves", () -> new GreenCalyxMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_LEAVES =
            registerBlock("double_pink_mei_leaves", () -> new DoublePinkMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> VERSICOLOR_MEI_LEAVES =
            registerBlock("versicolor_mei_leaves", () -> new VersicolorMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> UPRIGHT_CRABAPPLE_LEAVES =
            registerBlock("upright_crabapple_leaves", () -> new UprightCrabappleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> WEEPING_CRABAPPLE_LEAVES =
            registerBlock("weeping_crabapple_leaves", () -> new WeepingCrabappleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> PINK_APRICOT_LEAVES =
            registerBlock("pink_apricot_leaves", () -> new PinkApricotLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> WHITE_APRICOT_LEAVES =
            registerBlock("white_apricot_leaves", () -> new WhiteApricotLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> ORNAMENTAL_PEACH_LEAVES =
            registerBlock("ornamental_peach_leaves", () -> new OrnPeachLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> WILD_PEACH_LEAVES =
            registerBlock("wild_peach_leaves", () -> new WildPeachLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> PEAR_LEAVES =
            registerBlock("pear_leaves", () -> new PearLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> FLOWERING_PURPLE_LEAF_PLUM_LEAVES =
            registerBlock("flowering_purple_leaf_plum_leaves", () -> new FloweringPurpleLeafPlumLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_LEAVES =
            registerBlock("purple_leaf_plum_leaves", () -> new PurpleLeafPlumLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> GOLDEN_OSMANTHUS_LEAVES =
            registerBlock("golden_osmanthus_leaves", () -> new GoldenOsmanthusLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> ORANGE_OSMANTHUS_LEAVES =
            registerBlock("orange_osmanthus_leaves", () -> new OrangeOsmanthusLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> WHITE_OSMANTHUS_LEAVES =
            registerBlock("white_osmanthus_leaves", () -> new WhiteOsmanthusLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> GOLDEN_GINKGO_LEAVES =
            registerBlock("golden_ginkgo_leaves", () -> new GoldenGinkgoLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.GOLD)));
    public static final RegistryObject<Block> GREEN_GINKGO_LEAVES =
            registerBlock("green_ginkgo_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> YELLOW_CHINESE_PARASOL_LEAVES =
            registerBlock("yellow_chinese_parasol_leaves", () -> new YellowChineseParasolLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> GREEN_CHINESE_PARASOL_LEAVES =
            registerBlock("green_chinese_parasol_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> SWEETGUM_LEAVES =
            registerBlock("sweetgum_leaves", () -> new SweetgumLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> CAMPHOR_LEAVES =
            registerBlock("camphor_leaves", () -> new CamphorLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> NEW_CAMPHOR_LEAVES =
            registerBlock("new_camphor_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> DOVE_TREE_LEAVES =
            registerBlock("dove_tree_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> DOVE_TREE_BLOSSOM_LEAVES =
            registerBlock("dove_tree_blossom_leaves", () -> new DoveTreeBlossomLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> CHINABERRY_LEAVES =
            registerBlock("chinaberry_leaves", () -> new ChinaberryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> DESERT_POPLAR_LEAVES =
            registerBlock("desert_poplar_leaves", () -> new DesertPoplarLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final RegistryObject<Block> CRAPE_MYRTLE_LEAVES =
            registerBlock("crape_myrtle_leaves", () -> new CrapeMyrtleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PURPLE)));

    public static final RegistryObject<Block> RED_WEEPING_MEI =
            registerBlock("red_weeping_mei", () -> new RedWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_WEEPING_MEI_PLANT =
            BLOCKS.register("red_weeping_mei_plant", () -> new RedWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_WEEPING_MEI =
            registerBlock("white_weeping_mei", () -> new WhiteWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_WEEPING_MEI_PLANT =
            BLOCKS.register("white_weeping_mei_plant", () -> new WhiteWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_WEEPING_MEI =
            registerBlock("green_weeping_mei", () -> new GreenWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_WEEPING_MEI_PLANT =
            BLOCKS.register("green_weeping_mei_plant", () -> new GreenWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_WEEPING_MEI =
            registerBlock("pink_weeping_mei", () -> new PinkWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_WEEPING_MEI_PLANT =
            BLOCKS.register("pink_weeping_mei_plant", () -> new PinkWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_WEEPING_MEI =
            registerBlock("versicolor_weeping_mei", () -> new VersicolorWeepingMeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_WEEPING_MEI_PLANT =
            BLOCKS.register("versicolor_weeping_mei_plant", () -> new VersicolorWeepingMeiPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WEEPING_CRABAPPLE =
            registerBlock("weeping_crabapple", () -> new WeepingCrabappleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.CHERRY_LEAVES).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RED_MEI_LOG =
            registerBlock("red_mei_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> WHITE_MEI_LOG =
            registerBlock("white_mei_log", () -> log(MapColor.SNOW, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_LOG =
            registerBlock("green_calyx_mei_log", () -> log(MapColor.COLOR_LIGHT_GREEN, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_LOG =
            registerBlock("double_pink_mei_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> CRABAPPLE_LOG =
            registerBlock("crabapple_log", () -> log(MapColor.COLOR_MAGENTA, MapColor.COLOR_GRAY));
    public static final RegistryObject<Block> APRICOT_LOG =
            registerBlock("apricot_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> PEACH_LOG =
            registerBlock("peach_log", () -> log(MapColor.COLOR_PINK, MapColor.WOOD));
    public static final RegistryObject<Block> PEAR_LOG =
            registerBlock("pear_log", () -> log(MapColor.SNOW, MapColor.COLOR_BLACK));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_LOG =
            registerBlock("purple_leaf_plum_log", () -> log(MapColor.TERRACOTTA_PURPLE, MapColor.COLOR_PURPLE));
    public static final RegistryObject<Block> OSMANTHUS_LOG =
            registerBlock("osmanthus_log", () -> log(MapColor.WOOD, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> GINKGO_LOG =
            registerBlock("ginkgo_log", () -> log(MapColor.GOLD, MapColor.COLOR_GRAY));
    public static final RegistryObject<Block> CHINESE_PARASOL_LOG =
            registerBlock("chinese_parasol_log", () -> log(MapColor.COLOR_GREEN, MapColor.COLOR_GREEN));
    public static final RegistryObject<Block> SWEETGUM_LOG =
            registerBlock("sweetgum_log", () -> log(MapColor.TERRACOTTA_RED, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> CAMPHOR_LOG =
            registerBlock("camphor_log", () -> log(MapColor.COLOR_LIGHT_GRAY, MapColor.COLOR_BLACK));
    public static final RegistryObject<Block> DOVE_TREE_LOG =
            registerBlock("dove_tree_log", () -> log(MapColor.WOOD, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> CHINABERRY_LOG =
            registerBlock("chinaberry_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> DESERT_POPLAR_LOG =
            registerBlock("desert_poplar_log", () -> log(MapColor.WOOD, MapColor.COLOR_BROWN));
    public static final RegistryObject<Block> CRAPE_MYRTLE_LOG =
            BLOCKS.register("crape_myrtle_log", () -> log(MapColor.WOOD, MapColor.WOOD));

    public static final RegistryObject<Block> RED_MEI_WOOD =
            registerBlock("red_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> WHITE_MEI_WOOD =
            registerBlock("white_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_WOOD =
            registerBlock("green_calyx_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_WOOD =
            registerBlock("double_pink_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CRABAPPLE_WOOD =
            registerBlock("crabapple_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> APRICOT_WOOD =
            registerBlock("apricot_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PEACH_WOOD =
            registerBlock("peach_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PEAR_WOOD =
            registerBlock("pear_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_WOOD =
            registerBlock("purple_leaf_plum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> OSMANTHUS_WOOD =
            registerBlock("osmanthus_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> GINKGO_WOOD =
            registerBlock("ginkgo_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CHINESE_PARASOL_WOOD =
            registerBlock("chinese_parasol_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> SWEETGUM_WOOD =
            registerBlock("sweetgum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CAMPHOR_WOOD =
            registerBlock("camphor_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DOVE_TREE_WOOD =
            registerBlock("dove_tree_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CHINABERRY_WOOD =
            registerBlock("chinaberry_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DESERT_POPLAR_WOOD =
            registerBlock("desert_poplar_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CRAPE_MYRTLE_WOOD =
            BLOCKS.register("crape_myrtle_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> STRIPPED_RED_MEI_LOG =
            registerBlock("stripped_red_mei_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_RED));
    public static final RegistryObject<Block> STRIPPED_WHITE_MEI_LOG =
            registerBlock("stripped_white_mei_log", () -> log(MapColor.SNOW, MapColor.SNOW));
    public static final RegistryObject<Block> STRIPPED_GREEN_CALYX_MEI_LOG =
            registerBlock("stripped_green_calyx_mei_log", () -> log(MapColor.COLOR_LIGHT_GREEN, MapColor.COLOR_LIGHT_GREEN));
    public static final RegistryObject<Block> STRIPPED_DOUBLE_PINK_MEI_LOG =
            registerBlock("stripped_double_pink_mei_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_PINK));
    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_LOG =
            registerBlock("stripped_crabapple_log", () -> log(MapColor.COLOR_MAGENTA, MapColor.COLOR_MAGENTA));
    public static final RegistryObject<Block> STRIPPED_APRICOT_LOG =
            registerBlock("stripped_apricot_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_PINK));
    public static final RegistryObject<Block> STRIPPED_PEACH_LOG =
            registerBlock("stripped_peach_log", () -> log(MapColor.COLOR_PINK, MapColor.COLOR_PINK));
    public static final RegistryObject<Block> STRIPPED_PEAR_LOG =
            registerBlock("stripped_pear_log", () -> log(MapColor.SNOW, MapColor.SAND));
    public static final RegistryObject<Block> STRIPPED_PURPLE_LEAF_PLUM_LOG =
            registerBlock("stripped_purple_leaf_plum_log", () -> log(MapColor.TERRACOTTA_PURPLE, MapColor.TERRACOTTA_PURPLE));
    public static final RegistryObject<Block> STRIPPED_OSMANTHUS_LOG =
            registerBlock("stripped_osmanthus_log", () -> log(MapColor.WOOD, MapColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_GINKGO_LOG =
            registerBlock("stripped_ginkgo_log", () -> log(MapColor.GOLD, MapColor.GOLD));
    public static final RegistryObject<Block> STRIPPED_CHINESE_PARASOL_LOG =
            registerBlock("stripped_chinese_parasol_log", () -> log(MapColor.COLOR_GREEN, MapColor.COLOR_LIGHT_GREEN));
    public static final RegistryObject<Block> STRIPPED_SWEETGUM_LOG =
            registerBlock("stripped_sweetgum_log", () -> log(MapColor.TERRACOTTA_RED, MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> STRIPPED_CAMPHOR_LOG =
            registerBlock("stripped_camphor_log", () -> log(MapColor.WOOD, MapColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_DOVE_TREE_LOG =
            registerBlock("stripped_dove_tree_log", () -> log(MapColor.COLOR_LIGHT_GRAY, MapColor.WOOD));
    public static final RegistryObject<Block> STRIPPED_CHINABERRY_LOG =
            registerBlock("stripped_chinaberry_log", () -> log(MapColor.COLOR_RED, MapColor.COLOR_RED));
    public static final RegistryObject<Block> STRIPPED_DESERT_POPLAR_LOG =
            registerBlock("stripped_desert_poplar_log", () -> log(MapColor.WOOD, MapColor.WOOD));

    public static final RegistryObject<Block> STRIPPED_RED_MEI_WOOD =
            registerBlock("stripped_red_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_WHITE_MEI_WOOD =
            registerBlock("stripped_white_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_GREEN_CALYX_MEI_WOOD =
            registerBlock("stripped_green_calyx_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_DOUBLE_PINK_MEI_WOOD =
            registerBlock("stripped_double_pink_mei_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_CRABAPPLE_WOOD =
            registerBlock("stripped_crabapple_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_APRICOT_WOOD =
            registerBlock("stripped_apricot_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_PEACH_WOOD =
            registerBlock("stripped_peach_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_PEAR_WOOD =
            registerBlock("stripped_pear_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_PURPLE_LEAF_PLUM_WOOD =
            registerBlock("stripped_purple_leaf_plum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_OSMANTHUS_WOOD =
            registerBlock("stripped_osmanthus_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_GINKGO_WOOD =
            registerBlock("stripped_ginkgo_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_CHINESE_PARASOL_WOOD =
            registerBlock("stripped_chinese_parasol_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_SWEETGUM_WOOD =
            registerBlock("stripped_sweetgum_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_CAMPHOR_WOOD =
            registerBlock("stripped_camphor_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_DOVE_TREE_WOOD =
            registerBlock("stripped_dove_tree_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_CHINABERRY_WOOD =
            registerBlock("stripped_chinaberry_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> STRIPPED_DESERT_POPLAR_WOOD =
            registerBlock("stripped_desert_poplar_wood", () -> new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> RED_MEI_PLANKS =
            registerBlock("red_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> WHITE_MEI_PLANKS =
            registerBlock("white_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_PLANKS =
            registerBlock("green_calyx_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_PLANKS =
            registerBlock("double_pink_mei_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CRABAPPLE_PLANKS =
            registerBlock("crabapple_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> APRICOT_PLANKS =
            registerBlock("apricot_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PEACH_PLANKS =
            registerBlock("peach_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PEAR_PLANKS =
            registerBlock("pear_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_PLANKS =
            registerBlock("purple_leaf_plum_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> OSMANTHUS_PLANKS =
            registerBlock("osmanthus_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> GINKGO_PLANKS =
            registerBlock("ginkgo_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CHINESE_PARASOL_PLANKS =
            registerBlock("chinese_parasol_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> SWEETGUM_PLANKS =
            registerBlock("sweetgum_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CAMPHOR_PLANKS =
            registerBlock("camphor_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DOVE_TREE_PLANKS =
            registerBlock("dove_tree_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CHINABERRY_PLANKS =
            registerBlock("chinaberry_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DESERT_POPLAR_PLANKS =
            registerBlock("desert_poplar_planks", () -> new ModPlanksBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> RED_MEI_STAIRS =
            registerBlock("red_mei_stairs", () -> new ModStairBlock(() -> ModBlocks.RED_MEI_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.RED_MEI_PLANKS.get())));
    public static final RegistryObject<Block> WHITE_MEI_STAIRS =
            registerBlock("white_mei_stairs", () -> new ModStairBlock(() -> ModBlocks.WHITE_MEI_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.WHITE_MEI_PLANKS.get())));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_STAIRS =
            registerBlock("green_calyx_mei_stairs", () -> new ModStairBlock(() -> ModBlocks.GREEN_CALYX_MEI_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.GREEN_CALYX_MEI_PLANKS.get())));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_STAIRS =
            registerBlock("double_pink_mei_stairs", () -> new ModStairBlock(() -> ModBlocks.DOUBLE_PINK_MEI_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get())));
    public static final RegistryObject<Block> CRABAPPLE_STAIRS =
            registerBlock("crabapple_stairs", () -> new ModStairBlock(() -> ModBlocks.CRABAPPLE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.CRABAPPLE_PLANKS.get())));
    public static final RegistryObject<Block> APRICOT_STAIRS =
            registerBlock("apricot_stairs", () -> new ModStairBlock(() -> ModBlocks.APRICOT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.APRICOT_PLANKS.get())));
    public static final RegistryObject<Block> PEACH_STAIRS =
            registerBlock("peach_stairs", () -> new ModStairBlock(() -> ModBlocks.PEACH_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.PEACH_PLANKS.get())));
    public static final RegistryObject<Block> PEAR_STAIRS =
            registerBlock("pear_stairs", () -> new ModStairBlock(() -> ModBlocks.PEAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.PEAR_PLANKS.get())));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_STAIRS =
            registerBlock("purple_leaf_plum_stairs", () -> new ModStairBlock(() -> ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get())));
    public static final RegistryObject<Block> OSMANTHUS_STAIRS =
            registerBlock("osmanthus_stairs", () -> new ModStairBlock(() -> ModBlocks.OSMANTHUS_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.OSMANTHUS_PLANKS.get())));
    public static final RegistryObject<Block> GINKGO_STAIRS =
            registerBlock("ginkgo_stairs", () -> new ModStairBlock(() -> ModBlocks.GINKGO_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.GINKGO_PLANKS.get())));
    public static final RegistryObject<Block> CHINESE_PARASOL_STAIRS =
            registerBlock("chinese_parasol_stairs", () -> new ModStairBlock(() -> ModBlocks.CHINESE_PARASOL_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.CHINESE_PARASOL_PLANKS.get())));
    public static final RegistryObject<Block> SWEETGUM_STAIRS =
            registerBlock("sweetgum_stairs", () -> new ModStairBlock(() -> ModBlocks.SWEETGUM_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.SWEETGUM_PLANKS.get())));
    public static final RegistryObject<Block> CAMPHOR_STAIRS =
            registerBlock("camphor_stairs", () -> new ModStairBlock(() -> ModBlocks.CAMPHOR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.CAMPHOR_PLANKS.get())));
    public static final RegistryObject<Block> DOVE_TREE_STAIRS =
            registerBlock("dove_tree_stairs", () -> new ModStairBlock(() -> ModBlocks.DOVE_TREE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.DOVE_TREE_PLANKS.get())));
    public static final RegistryObject<Block> CHINABERRY_STAIRS =
            registerBlock("chinaberry_stairs", () -> new ModStairBlock(() -> ModBlocks.CHINABERRY_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.CHINABERRY_PLANKS.get())));
    public static final RegistryObject<Block> DESERT_POPLAR_STAIRS =
            registerBlock("desert_poplar_stairs", () -> new ModStairBlock(() -> ModBlocks.DESERT_POPLAR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(ModBlocks.DESERT_POPLAR_PLANKS.get())));

    public static final RegistryObject<Block> RED_MEI_SLAB =
            registerBlock("red_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> WHITE_MEI_SLAB =
            registerBlock("white_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_SLAB =
            registerBlock("green_calyx_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_SLAB =
            registerBlock("double_pink_mei_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CRABAPPLE_SLAB =
            registerBlock("crabapple_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> APRICOT_SLAB =
            registerBlock("apricot_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PEACH_SLAB =
            registerBlock("peach_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PEAR_SLAB =
            registerBlock("pear_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SAND).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_SLAB =
            registerBlock("purple_leaf_plum_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> OSMANTHUS_SLAB =
            registerBlock("osmanthus_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> GINKGO_SLAB =
            registerBlock("ginkgo_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CHINESE_PARASOL_SLAB =
            registerBlock("chinese_parasol_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GREEN).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> SWEETGUM_SLAB =
            registerBlock("sweetgum_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CAMPHOR_SLAB =
            registerBlock("camphor_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DOVE_TREE_SLAB =
            registerBlock("dove_tree_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GRAY).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> CHINABERRY_SLAB =
            registerBlock("chinaberry_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));
    public static final RegistryObject<Block> DESERT_POPLAR_SLAB =
            registerBlock("desert_poplar_slab", () -> new ModSlabBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).sound(SoundType.WOOD).ignitedByLava()));

    public static final RegistryObject<Block> RED_MEI_BUTTON =
            registerBlock("red_mei_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> WHITE_MEI_BUTTON =
            registerBlock("white_mei_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_BUTTON =
            registerBlock("green_calyx_mei_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_BUTTON =
            registerBlock("double_pink_mei_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> CRABAPPLE_BUTTON =
            registerBlock("crabapple_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> APRICOT_BUTTON =
            registerBlock("apricot_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> PEACH_BUTTON =
            registerBlock("peach_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> PEAR_BUTTON =
            registerBlock("pear_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_BUTTON =
            registerBlock("purple_leaf_plum_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> OSMANTHUS_BUTTON =
            registerBlock("osmanthus_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> GINKGO_BUTTON =
            registerBlock("ginkgo_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> CHINESE_PARASOL_BUTTON =
            registerBlock("chinese_parasol_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> SWEETGUM_BUTTON =
            registerBlock("sweetgum_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> CAMPHOR_BUTTON =
            registerBlock("camphor_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> DOVE_TREE_BUTTON =
            registerBlock("dove_tree_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> CHINABERRY_BUTTON =
            registerBlock("chinaberry_button", () -> woodenButton(BlockSetType.OAK));
    public static final RegistryObject<Block> DESERT_POPLAR_BUTTON =
            registerBlock("desert_poplar_button", () -> woodenButton(BlockSetType.OAK));

    public static final RegistryObject<Block> RED_MEI_PRESSURE_PLATE =
            registerBlock("red_mei_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(RED_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> WHITE_MEI_PRESSURE_PLATE =
            registerBlock("white_mei_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_PRESSURE_PLATE =
            registerBlock("green_calyx_mei_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_PRESSURE_PLATE =
            registerBlock("double_pink_mei_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> CRABAPPLE_PRESSURE_PLATE =
            registerBlock("crabapple_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> APRICOT_PRESSURE_PLATE =
            registerBlock("apricot_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(APRICOT_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> PEACH_PRESSURE_PLATE =
            registerBlock("peach_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(PEACH_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> PEAR_PRESSURE_PLATE =
            registerBlock("pear_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(PEAR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_PRESSURE_PLATE =
            registerBlock("purple_leaf_plum_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> OSMANTHUS_PRESSURE_PLATE =
            registerBlock("osmanthus_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> GINKGO_PRESSURE_PLATE =
            registerBlock("ginkgo_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> CHINESE_PARASOL_PRESSURE_PLATE =
            registerBlock("chinese_parasol_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> SWEETGUM_PRESSURE_PLATE =
            registerBlock("sweetgum_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(SWEETGUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> CAMPHOR_PRESSURE_PLATE =
            registerBlock("camphor_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(CAMPHOR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> DOVE_TREE_PRESSURE_PLATE =
            registerBlock("dove_tree_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> CHINABERRY_PRESSURE_PLATE =
            registerBlock("chinaberry_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));
    public static final RegistryObject<Block> DESERT_POPLAR_PRESSURE_PLATE =
            registerBlock("desert_poplar_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of().mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).noCollission().strength(0.5F).ignitedByLava().pushReaction(PushReaction.DESTROY), BlockSetType.OAK));

    public static final RegistryObject<Block> RED_MEI_FENCE =
            registerBlock("red_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(RED_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_MEI_FENCE =
            registerBlock("white_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_FENCE =
            registerBlock("green_calyx_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_FENCE =
            registerBlock("double_pink_mei_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CRABAPPLE_FENCE =
            registerBlock("crabapple_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> APRICOT_FENCE =
            registerBlock("apricot_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(APRICOT_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PEACH_FENCE =
            registerBlock("peach_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(PEACH_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PEAR_FENCE =
            registerBlock("pear_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(PEAR_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_FENCE =
            registerBlock("purple_leaf_plum_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OSMANTHUS_FENCE =
            registerBlock("osmanthus_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GINKGO_FENCE =
            registerBlock("ginkgo_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHINESE_PARASOL_FENCE =
            registerBlock("chinese_parasol_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SWEETGUM_FENCE =
            registerBlock("sweetgum_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(SWEETGUM_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CAMPHOR_FENCE =
            registerBlock("camphor_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CAMPHOR_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DOVE_TREE_FENCE =
            registerBlock("dove_tree_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CHINABERRY_FENCE =
            registerBlock("chinaberry_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DESERT_POPLAR_FENCE =
            registerBlock("desert_poplar_fence" , () -> new ModFenceBlock(BlockBehaviour.Properties.of().mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()).instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava().sound(SoundType.WOOD)));

    public static final RegistryObject<Block> RED_MEI_FENCE_GATE =
            registerBlock("red_mei_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(RED_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.RED_MEI));
    public static final RegistryObject<Block> WHITE_MEI_FENCE_GATE =
            registerBlock("white_mei_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.WHITE_MEI));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_FENCE_GATE =
            registerBlock("green_calyx_mei_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.GREEN_CALYX_MEI));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_FENCE_GATE =
            registerBlock("double_pink_mei_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.DOUBLE_PINK_MEI));
    public static final RegistryObject<Block> CRABAPPLE_FENCE_GATE =
            registerBlock("crabapple_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.CRABAPPLE));
    public static final RegistryObject<Block> APRICOT_FENCE_GATE =
            registerBlock("apricot_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(APRICOT_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.APRICOT));
    public static final RegistryObject<Block> PEACH_FENCE_GATE =
            registerBlock("peach_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(PEACH_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.PEACH));
    public static final RegistryObject<Block> PEAR_FENCE_GATE =
            registerBlock("pear_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(PEAR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.PEAR));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_FENCE_GATE =
            registerBlock("purple_leaf_plum_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.PURPLE_LEAF_PLUM));
    public static final RegistryObject<Block> OSMANTHUS_FENCE_GATE =
            registerBlock("osmanthus_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.OSMANTHUS));
    public static final RegistryObject<Block> GINKGO_FENCE_GATE =
            registerBlock("ginkgo_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(GINKGO_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.GINKGO));
    public static final RegistryObject<Block> CHINESE_PARASOL_FENCE_GATE =
            registerBlock("chinese_parasol_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.CHINESE_PARASOL));
    public static final RegistryObject<Block> SWEETGUM_FENCE_GATE =
            registerBlock("sweetgum_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(SWEETGUM_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.SWEETGUM));
    public static final RegistryObject<Block> CAMPHOR_FENCE_GATE =
            registerBlock("camphor_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(CAMPHOR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.CAMPHOR));
    public static final RegistryObject<Block> DOVE_TREE_FENCE_GATE =
            registerBlock("dove_tree_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.DOVE_TREE));
    public static final RegistryObject<Block> CHINABERRY_FENCE_GATE =
            registerBlock("chinaberry_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.CHINABERRY));
    public static final RegistryObject<Block> DESERT_POPLAR_FENCE_GATE =
            registerBlock("desert_poplar_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(CHINABERRY_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.DESERT_POPLAR));

    public static final RegistryObject<Block> RED_MEI_DOOR =
            registerBlock("red_mei_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.RED_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> WHITE_MEI_DOOR =
            registerBlock("white_mei_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.WHITE_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_DOOR =
            registerBlock("green_calyx_mei_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_DOOR =
            registerBlock("double_pink_mei_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CRABAPPLE_DOOR =
            registerBlock("crabapple_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.CRABAPPLE_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> APRICOT_DOOR =
            registerBlock("apricot_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.APRICOT_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> PEACH_DOOR =
            registerBlock("peach_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.PEACH_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> PEAR_DOOR =
            registerBlock("pear_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.PEAR_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_DOOR =
            registerBlock("purple_leaf_plum_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> OSMANTHUS_DOOR =
            registerBlock("osmanthus_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.OSMANTHUS_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> GINKGO_DOOR =
            registerBlock("ginkgo_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.GINKGO_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CHINESE_PARASOL_DOOR =
            registerBlock("chinese_parasol_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.CHINESE_PARASOL_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> SWEETGUM_DOOR =
            registerBlock("sweetgum_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.SWEETGUM_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CAMPHOR_DOOR =
            registerBlock("camphor_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.CAMPHOR_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> DOVE_TREE_DOOR =
            registerBlock("dove_tree_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.DOVE_TREE_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CHINABERRY_DOOR =
            registerBlock("chinaberry_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.CHINABERRY_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> DESERT_POPLAR_DOOR =
            registerBlock("desert_poplar_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR).mapColor(ModBlocks.DESERT_POPLAR_PLANKS.get().defaultMapColor()), BlockSetType.OAK));

    public static final RegistryObject<Block> RED_MEI_TRAPDOOR =
            registerBlock("red_mei_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.RED_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> WHITE_MEI_TRAPDOOR =
            registerBlock("white_mei_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.WHITE_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_TRAPDOOR =
            registerBlock("green_calyx_mei_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_TRAPDOOR =
            registerBlock("double_pink_mei_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CRABAPPLE_TRAPDOOR =
            registerBlock("crabapple_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.CRABAPPLE_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> APRICOT_TRAPDOOR =
            registerBlock("apricot_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.APRICOT_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> PEACH_TRAPDOOR =
            registerBlock("peach_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.PEACH_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> PEAR_TRAPDOOR =
            registerBlock("pear_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.PEAR_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_TRAPDOOR =
            registerBlock("purple_leaf_plum_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> OSMANTHUS_TRAPDOOR =
            registerBlock("osmanthus_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.OSMANTHUS_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> GINKGO_TRAPDOOR =
            registerBlock("ginkgo_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.GINKGO_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CHINESE_PARASOL_TRAPDOOR =
            registerBlock("chinese_parasol_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.CHINESE_PARASOL_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> SWEETGUM_TRAPDOOR =
            registerBlock("sweetgum_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.SWEETGUM_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CAMPHOR_TRAPDOOR =
            registerBlock("camphor_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.CAMPHOR_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> DOVE_TREE_TRAPDOOR =
            registerBlock("dove_tree_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.DOVE_TREE_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> CHINABERRY_TRAPDOOR =
            registerBlock("chinaberry_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.CHINABERRY_PLANKS.get().defaultMapColor()), BlockSetType.OAK));
    public static final RegistryObject<Block> DESERT_POPLAR_TRAPDOOR =
            registerBlock("desert_poplar_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR).mapColor(ModBlocks.DESERT_POPLAR_PLANKS.get().defaultMapColor()), BlockSetType.OAK));

    public static final RegistryObject<Block> RED_MEI_SIGN =
            BLOCKS.register("red_mei_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(RED_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.RED_MEI));
    public static final RegistryObject<Block> WHITE_MEI_SIGN =
            BLOCKS.register("white_mei_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.WHITE_MEI));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_SIGN =
            BLOCKS.register("green_calyx_mei_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.GREEN_CALYX_MEI));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_SIGN =
            BLOCKS.register("double_pink_mei_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.DOUBLE_PINK_MEI));
    public static final RegistryObject<Block> CRABAPPLE_SIGN =
            BLOCKS.register("crabapple_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()), ModWoodTypes.CRABAPPLE));
    public static final RegistryObject<Block> APRICOT_SIGN =
            BLOCKS.register("apricot_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor()), ModWoodTypes.APRICOT));
    public static final RegistryObject<Block> PEACH_SIGN =
            BLOCKS.register("peach_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor()), ModWoodTypes.PEACH));
    public static final RegistryObject<Block> PEAR_SIGN =
            BLOCKS.register("pear_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor()), ModWoodTypes.PEAR));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_SIGN =
            BLOCKS.register("purple_leaf_plum_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()), ModWoodTypes.PURPLE_LEAF_PLUM));
    public static final RegistryObject<Block> OSMANTHUS_SIGN =
            BLOCKS.register("osmanthus_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()), ModWoodTypes.OSMANTHUS));
    public static final RegistryObject<Block> GINKGO_SIGN =
            BLOCKS.register("ginkgo_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor()), ModWoodTypes.GINKGO));
    public static final RegistryObject<Block> CHINESE_PARASOL_SIGN =
            BLOCKS.register("chinese_parasol_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINESE_PARASOL));
    public static final RegistryObject<Block> SWEETGUM_SIGN =
            BLOCKS.register("sweetgum_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor()), ModWoodTypes.SWEETGUM));
    public static final RegistryObject<Block> CAMPHOR_SIGN =
            BLOCKS.register("camphor_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor()), ModWoodTypes.CAMPHOR));
    public static final RegistryObject<Block> DOVE_TREE_SIGN =
            BLOCKS.register("dove_tree_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()), ModWoodTypes.DOVE_TREE));
    public static final RegistryObject<Block> CHINABERRY_SIGN =
            BLOCKS.register("chinaberry_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINABERRY));
    public static final RegistryObject<Block> DESERT_POPLAR_SIGN =
            BLOCKS.register("desert_poplar_sign", () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()), ModWoodTypes.DESERT_POPLAR));

    public static final RegistryObject<Block> RED_MEI_WALL_SIGN =
            BLOCKS.register("red_mei_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(RED_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.RED_MEI));
    public static final RegistryObject<Block> WHITE_MEI_WALL_SIGN =
            BLOCKS.register("white_mei_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.WHITE_MEI));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_WALL_SIGN =
            BLOCKS.register("green_calyx_mei_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.GREEN_CALYX_MEI));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_WALL_SIGN =
            BLOCKS.register("double_pink_mei_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.DOUBLE_PINK_MEI));
    public static final RegistryObject<Block> CRABAPPLE_WALL_SIGN =
            BLOCKS.register("crabapple_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()), ModWoodTypes.CRABAPPLE));
    public static final RegistryObject<Block> APRICOT_WALL_SIGN =
            BLOCKS.register("apricot_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor()), ModWoodTypes.APRICOT));
    public static final RegistryObject<Block> PEACH_WALL_SIGN =
            BLOCKS.register("peach_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor()), ModWoodTypes.PEACH));
    public static final RegistryObject<Block> PEAR_WALL_SIGN =
            BLOCKS.register("pear_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor()), ModWoodTypes.PEAR));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_WALL_SIGN =
            BLOCKS.register("purple_leaf_plum_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()), ModWoodTypes.PURPLE_LEAF_PLUM));
    public static final RegistryObject<Block> OSMANTHUS_WALL_SIGN =
            BLOCKS.register("osmanthus_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()), ModWoodTypes.OSMANTHUS));
    public static final RegistryObject<Block> GINKGO_WALL_SIGN =
            BLOCKS.register("ginkgo_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor()), ModWoodTypes.GINKGO));
    public static final RegistryObject<Block> CHINESE_PARASOL_WALL_SIGN =
            BLOCKS.register("chinese_parasol_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINESE_PARASOL));
    public static final RegistryObject<Block> SWEETGUM_WALL_SIGN =
            BLOCKS.register("sweetgum_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor()), ModWoodTypes.SWEETGUM));
    public static final RegistryObject<Block> CAMPHOR_WALL_SIGN =
            BLOCKS.register("camphor_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor()), ModWoodTypes.CAMPHOR));
    public static final RegistryObject<Block> DOVE_TREE_WALL_SIGN =
            BLOCKS.register("dove_tree_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()), ModWoodTypes.DOVE_TREE));
    public static final RegistryObject<Block> CHINABERRY_WALL_SIGN =
            BLOCKS.register("chinaberry_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINABERRY));
    public static final RegistryObject<Block> DESERT_POPLAR_WALL_SIGN =
            BLOCKS.register("desert_poplar_wall_sign", () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()), ModWoodTypes.DESERT_POPLAR));

    public static final RegistryObject<Block> RED_MEI_HANGING_SIGN =
            BLOCKS.register("red_mei_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(RED_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.RED_MEI));
    public static final RegistryObject<Block> WHITE_MEI_HANGING_SIGN =
            BLOCKS.register("white_mei_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.WHITE_MEI));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_HANGING_SIGN =
            BLOCKS.register("green_calyx_mei_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.GREEN_CALYX_MEI));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_HANGING_SIGN =
            BLOCKS.register("double_pink_mei_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.DOUBLE_PINK_MEI));
    public static final RegistryObject<Block> CRABAPPLE_HANGING_SIGN =
            BLOCKS.register("crabapple_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()), ModWoodTypes.CRABAPPLE));
    public static final RegistryObject<Block> APRICOT_HANGING_SIGN =
            BLOCKS.register("apricot_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor()), ModWoodTypes.APRICOT));
    public static final RegistryObject<Block> PEACH_HANGING_SIGN =
            BLOCKS.register("peach_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor()), ModWoodTypes.PEACH));
    public static final RegistryObject<Block> PEAR_HANGING_SIGN =
            BLOCKS.register("pear_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor()), ModWoodTypes.PEAR));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_HANGING_SIGN =
            BLOCKS.register("purple_leaf_plum_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()), ModWoodTypes.PURPLE_LEAF_PLUM));
    public static final RegistryObject<Block> OSMANTHUS_HANGING_SIGN =
            BLOCKS.register("osmanthus_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()), ModWoodTypes.OSMANTHUS));
    public static final RegistryObject<Block> GINKGO_HANGING_SIGN =
            BLOCKS.register("ginkgo_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor()), ModWoodTypes.GINKGO));
    public static final RegistryObject<Block> CHINESE_PARASOL_HANGING_SIGN =
            BLOCKS.register("chinese_parasol_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINESE_PARASOL));
    public static final RegistryObject<Block> SWEETGUM_HANGING_SIGN =
            BLOCKS.register("sweetgum_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor()), ModWoodTypes.SWEETGUM));
    public static final RegistryObject<Block> CAMPHOR_HANGING_SIGN =
            BLOCKS.register("camphor_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor()), ModWoodTypes.CAMPHOR));
    public static final RegistryObject<Block> DOVE_TREE_HANGING_SIGN =
            BLOCKS.register("dove_tree_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()), ModWoodTypes.DOVE_TREE));
    public static final RegistryObject<Block> CHINABERRY_HANGING_SIGN =
            BLOCKS.register("chinaberry_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINABERRY));
    public static final RegistryObject<Block> DESERT_POPLAR_HANGING_SIGN =
            BLOCKS.register("desert_poplar_hanging_sign", () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()), ModWoodTypes.DESERT_POPLAR));

    public static final RegistryObject<Block> RED_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("red_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(RED_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.RED_MEI));
    public static final RegistryObject<Block> WHITE_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("white_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(WHITE_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.WHITE_MEI));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("green_calyx_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(GREEN_CALYX_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.GREEN_CALYX_MEI));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_WALL_HANGING_SIGN =
            BLOCKS.register("double_pink_mei_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(DOUBLE_PINK_MEI_PLANKS.get().defaultMapColor()), ModWoodTypes.DOUBLE_PINK_MEI));
    public static final RegistryObject<Block> CRABAPPLE_WALL_HANGING_SIGN =
            BLOCKS.register("crabapple_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CRABAPPLE_PLANKS.get().defaultMapColor()), ModWoodTypes.CRABAPPLE));
    public static final RegistryObject<Block> APRICOT_WALL_HANGING_SIGN =
            BLOCKS.register("apricot_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(APRICOT_PLANKS.get().defaultMapColor()), ModWoodTypes.APRICOT));
    public static final RegistryObject<Block> PEACH_WALL_HANGING_SIGN =
            BLOCKS.register("peach_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(PEACH_PLANKS.get().defaultMapColor()), ModWoodTypes.PEACH));
    public static final RegistryObject<Block> PEAR_WALL_HANGING_SIGN =
            BLOCKS.register("pear_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(PEAR_PLANKS.get().defaultMapColor()), ModWoodTypes.PEAR));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_WALL_HANGING_SIGN =
            BLOCKS.register("purple_leaf_plum_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(PURPLE_LEAF_PLUM_PLANKS.get().defaultMapColor()), ModWoodTypes.PURPLE_LEAF_PLUM));
    public static final RegistryObject<Block> OSMANTHUS_WALL_HANGING_SIGN =
            BLOCKS.register("osmanthus_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(OSMANTHUS_PLANKS.get().defaultMapColor()), ModWoodTypes.OSMANTHUS));
    public static final RegistryObject<Block> GINKGO_WALL_HANGING_SIGN =
            BLOCKS.register("ginkgo_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(GINKGO_PLANKS.get().defaultMapColor()), ModWoodTypes.GINKGO));
    public static final RegistryObject<Block> CHINESE_PARASOL_WALL_HANGING_SIGN =
            BLOCKS.register("chinese_parasol_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CHINESE_PARASOL_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINESE_PARASOL));
    public static final RegistryObject<Block> SWEETGUM_WALL_HANGING_SIGN =
            BLOCKS.register("sweetgum_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(SWEETGUM_PLANKS.get().defaultMapColor()), ModWoodTypes.SWEETGUM));
    public static final RegistryObject<Block> CAMPHOR_WALL_HANGING_SIGN =
            BLOCKS.register("camphor_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CAMPHOR_PLANKS.get().defaultMapColor()), ModWoodTypes.CAMPHOR));
    public static final RegistryObject<Block> DOVE_TREE_WALL_HANGING_SIGN =
            BLOCKS.register("dove_tree_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(DOVE_TREE_PLANKS.get().defaultMapColor()), ModWoodTypes.DOVE_TREE));
    public static final RegistryObject<Block> CHINABERRY_WALL_HANGING_SIGN =
            BLOCKS.register("chinaberry_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(CHINABERRY_PLANKS.get().defaultMapColor()), ModWoodTypes.CHINABERRY));
    public static final RegistryObject<Block> DESERT_POPLAR_WALL_HANGING_SIGN =
            BLOCKS.register("desert_poplar_wall_hanging_sign", () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN).mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()), ModWoodTypes.DESERT_POPLAR));

    public static final RegistryObject<Block> RED_MEI_SAPLING =
            registerBlock("red_mei_sapling", () -> new SaplingBlock(new RedMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_MEI_SAPLING =
            registerBlock("white_mei_sapling", () -> new SaplingBlock(new WhiteMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_SAPLING =
            registerBlock("green_calyx_mei_sapling", () -> new SaplingBlock(new GreenCalyxMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_SAPLING =
            registerBlock("double_pink_mei_sapling", () -> new SaplingBlock(new DoublePinkMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_MEI_SAPLING =
            registerBlock("versicolor_mei_sapling", () -> new SaplingBlock(new VersicolorMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_WEEPING_MEI_SAPLING =
            registerBlock("red_weeping_mei_sapling", () -> new SaplingBlock(new RedWeepingMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_WEEPING_MEI_SAPLING =
            registerBlock("white_weeping_mei_sapling", () -> new SaplingBlock(new WhiteWeepingMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_WEEPING_MEI_SAPLING =
            registerBlock("green_weeping_mei_sapling", () -> new SaplingBlock(new GreenWeepingMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_WEEPING_MEI_SAPLING =
            registerBlock("pink_weeping_mei_sapling", () -> new SaplingBlock(new PinkWeepingMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_WEEPING_MEI_SAPLING =
            registerBlock("versicolor_weeping_mei_sapling", () -> new SaplingBlock(new VersicolorWeepingMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> UPRIGHT_CRABAPPLE_SAPLING =
            registerBlock("upright_crabapple_sapling", () -> new SaplingBlock(new UprightCrabappleTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WEEPING_CRABAPPLE_SAPLING =
            registerBlock("weeping_crabapple_sapling", () -> new SaplingBlock(new WeepingCrabappleTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_APRICOT_SAPLING =
            registerBlock("pink_apricot_sapling", () -> new SaplingBlock(new PinkApricotTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_APRICOT_SAPLING =
            registerBlock("white_apricot_sapling", () -> new SaplingBlock(new WhiteApricotTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ORNAMENTAL_PEACH_SAPLING =
            registerBlock("ornamental_peach_sapling", () -> new SaplingBlock(new OrnPeachTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WILD_PEACH_SAPLING =
            registerBlock("wild_peach_sapling", () -> new SaplingBlock(new WildPeachTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PEAR_SAPLING =
            registerBlock("pear_sapling", () -> new SaplingBlock(new PearTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FLOWERING_PURPLE_LEAF_PLUM_SAPLING =
            registerBlock("flowering_purple_leaf_plum_sapling", () -> new SaplingBlock(new FloweringPurplePlumTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_LEAF_PLUM_SAPLING =
            registerBlock("purple_leaf_plum_sapling", () -> new SaplingBlock(new PurplePlumTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_OSMANTHUS_SAPLING =
            registerBlock("golden_osmanthus_sapling", () -> new SaplingBlock(new GoldenOsmanthusTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ORANGE_OSMANTHUS_SAPLING =
            registerBlock("orange_osmanthus_sapling", () -> new SaplingBlock(new OrangeOsmanthusTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_OSMANTHUS_SAPLING =
            registerBlock("white_osmanthus_sapling", () -> new SaplingBlock(new WhiteOsmanthusTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_GINKGO_SAPLING =
            registerBlock("golden_ginkgo_sapling", () -> new SaplingBlock(new GoldenGinkgoTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_GINKGO_SAPLING =
            registerBlock("green_ginkgo_sapling", () -> new SaplingBlock(new GreenGinkgoTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_CHINESE_PARASOL_SAPLING =
            registerBlock("yellow_chinese_parasol_sapling", () -> new SaplingBlock(new YellowChineseParasolTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_CHINESE_PARASOL_SAPLING =
            registerBlock("green_chinese_parasol_sapling", () -> new SaplingBlock(new GreenChineseParasolTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SWEETGUM_SAPLING =
            registerBlock("sweetgum_sapling", () -> new SaplingBlock(new SweetgumTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAMPHOR_SAPLING =
            registerBlock("camphor_sapling", () -> new SaplingBlock(new CamphorTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DOVE_TREE_SAPLING =
            registerBlock("dove_tree_sapling", () -> new SaplingBlock(new DoveTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHINABERRY_SAPLING =
            registerBlock("chinaberry_sapling", () -> new SaplingBlock(new ChinaberryTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DESERT_POPLAR_SAPLING =
            registerBlock("desert_poplar_sapling", () -> new DesertSaplingBlock(new DesertPoplarTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CRAPE_MYRTLE_SAPLING =
            registerBlock("crape_myrtle_sapling", () -> new CrapeMyrtleSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> POTTED_RED_MEI_SAPLING =
            BLOCKS.register("potted_red_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_MEI_SAPLING =
            BLOCKS.register("potted_white_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GREEN_CALYX_MEI_SAPLING =
            BLOCKS.register("potted_green_calyx_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GREEN_CALYX_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_DOUBLE_PINK_MEI_SAPLING =
            BLOCKS.register("potted_double_pink_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.DOUBLE_PINK_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_VERSICOLOR_MEI_SAPLING =
            BLOCKS.register("potted_versicolor_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VERSICOLOR_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_RED_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_red_weeping_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_WEEPING_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_white_weeping_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_WEEPING_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GREEN_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_green_weeping_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GREEN_WEEPING_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_pink_weeping_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_WEEPING_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_VERSICOLOR_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_versicolor_weeping_mei_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_UPRIGHT_CRABAPPLE_SAPLING =
            BLOCKS.register("potted_upright_crabapple_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.UPRIGHT_CRABAPPLE_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WEEPING_CRABAPPLE_SAPLING =
            BLOCKS.register("potted_weeping_crabapple_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WEEPING_CRABAPPLE_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_APRICOT_SAPLING =
            BLOCKS.register("potted_pink_apricot_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_APRICOT_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_APRICOT_SAPLING =
            BLOCKS.register("potted_white_apricot_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_APRICOT_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_ORNAMENTAL_PEACH_SAPLING =
            BLOCKS.register("potted_ornamental_peach_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.ORNAMENTAL_PEACH_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WILD_PEACH_SAPLING =
            BLOCKS.register("potted_wild_peach_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WILD_PEACH_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PEAR_SAPLING =
            BLOCKS.register("potted_pear_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PEAR_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_FLOWERING_PURPLE_LEAF_PLUM_SAPLING =
            BLOCKS.register("potted_flowering_purple_leaf_plum_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PURPLE_LEAF_PLUM_SAPLING =
            BLOCKS.register("potted_purple_leaf_plum_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_LEAF_PLUM_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GOLDEN_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_golden_osmanthus_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GOLDEN_OSMANTHUS_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_ORANGE_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_orange_osmanthus_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.ORANGE_OSMANTHUS_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_white_osmanthus_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_OSMANTHUS_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GOLDEN_GINKGO_SAPLING =
            BLOCKS.register("potted_golden_ginkgo_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GOLDEN_GINKGO_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GREEN_GINKGO_SAPLING =
            BLOCKS.register("potted_green_ginkgo_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GREEN_GINKGO_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_YELLOW_CHINESE_PARASOL_SAPLING =
            BLOCKS.register("potted_yellow_chinese_parasol_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GREEN_CHINESE_PARASOL_SAPLING =
            BLOCKS.register("potted_green_chinese_parasol_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GREEN_CHINESE_PARASOL_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_SWEETGUM_SAPLING =
            BLOCKS.register("potted_sweetgum_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.SWEETGUM_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_CAMPHOR_SAPLING =
            BLOCKS.register("potted_camphor_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CAMPHOR_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_DOVE_TREE_SAPLING =
            BLOCKS.register("potted_dove_tree_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.DOVE_TREE_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_CHINABERRY_SAPLING =
            BLOCKS.register("potted_chinaberry_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CHINABERRY_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_DESERT_POPLAR_SAPLING =
            BLOCKS.register("potted_desert_poplar_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.DESERT_POPLAR_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_CRAPE_MYRTLE_SAPLING =
            BLOCKS.register("potted_crape_myrtle_sapling", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CRAPE_MYRTLE_SAPLING, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CHRYSANTHEMUM =
            registerBlock("chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_CHRYSANTHEMUM =
            registerBlock("golden_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.GOLD).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLD_BACKED_SCARLET_MUM =
            registerBlock("gold_backed_scarlet_mum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CHRYSANTHEMUM =
            registerBlock("white_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_CHRYSANTHEMUM =
            registerBlock("green_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_CHRYSANTHEMUM =
            registerBlock("purple_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VIOLET_PINK_CHRYSANTHEMUM =
            registerBlock("violet_pink_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_CHRYSANTHEMUM =
            registerBlock("pink_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_PINK_CHRYSANTHEMUM =
            registerBlock("light_pink_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SPRING_CYMBIDIUM =
            registerBlock("spring_cymbidium", () -> new FlowerBlock(() -> MobEffects.LUCK, 7, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SUMMER_CYMBIDIUM =
            registerBlock("summer_cymbidium", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AUTUMN_CYMBIDIUM =
            registerBlock("autumn_cymbidium", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PEONY =
            registerBlock("peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_PINK_PEONY =
            registerBlock("light_pink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VIOLET_PINK_PEONY =
            registerBlock("violet_pink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_PEONY =
            registerBlock("pink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_PEONY =
            registerBlock("red_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_RED_PEONY =
            registerBlock("light_red_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> INK_RED_PEONY =
            registerBlock("ink_red_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERMILION_PEONY =
            registerBlock("vermilion_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_PEONY =
            registerBlock("purple_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_PURPLE_PEONY =
            registerBlock("light_purple_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> INK_PURPLE_PEONY =
            registerBlock("ink_purple_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VIOLET_PEONY =
            registerBlock("violet_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_PEONY =
            registerBlock("yellow_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_YELLOW_PEONY =
            registerBlock("light_yellow_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> OCHRE_YELLOW_PEONY =
            registerBlock("ochre_yellow_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_PEONY =
            registerBlock("golden_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_PEONY =
            registerBlock("white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> INK_PEONY =
            registerBlock("ink_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLUE_PEONY =
            registerBlock("blue_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_PEONY =
            registerBlock("green_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> COLORFUL_PEONY =
            registerBlock("colorful_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LIGHT_COLORFUL_PEONY =
            registerBlock("light_colorful_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> INK_COLORFUL_PEONY =
            registerBlock("ink_colorful_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_WHITE_PEONY =
            registerBlock("red_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_WHITE_PEONY =
            registerBlock("pink_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_WHITE_PEONY =
            registerBlock("yellow_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_WHITE_PEONY =
            registerBlock("purple_white_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WU_HUA_LONG_YU_PEONY =
            registerBlock("wu_hua_long_yu_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MAUVE_PEONY =
            registerBlock("mauve_peony", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAMELLIA =
            registerBlock("camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CAMELLIA =
            registerBlock("white_camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_CAMELLIA =
            registerBlock("pink_camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_CAMELLIA =
            registerBlock("versicolor_camellia", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CRIMSON_AZALEA =
            registerBlock("crimson_azalea", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FOUNTAIN_GRASS =
            registerBlock("fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_FOUNTAIN_GRASS =
            registerBlock("purple_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_FOUNTAIN_GRASS =
            registerBlock("pink_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_FOUNTAIN_GRASS =
            registerBlock("white_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> POTTED_CHRYSANTHEMUM =
            BLOCKS.register("potted_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GOLDEN_CHRYSANTHEMUM =
            BLOCKS.register("potted_golden_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GOLDEN_CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GOLD_BACKED_SCARLET_MUM =
            BLOCKS.register("potted_gold_backed_scarlet_mum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GOLD_BACKED_SCARLET_MUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_CHRYSANTHEMUM =
            BLOCKS.register("potted_white_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GREEN_CHRYSANTHEMUM =
            BLOCKS.register("potted_green_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GREEN_CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PURPLE_CHRYSANTHEMUM =
            BLOCKS.register("potted_purple_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_VIOLET_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_violet_pink_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VIOLET_PINK_CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_pink_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_LIGHT_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_light_pink_chrysanthemum", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.LIGHT_PINK_CHRYSANTHEMUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_SPRING_CYMBIDIUM =
            BLOCKS.register("potted_spring_cymbidium", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.SPRING_CYMBIDIUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_SUMMER_CYMBIDIUM =
            BLOCKS.register("potted_summer_cymbidium", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.SUMMER_CYMBIDIUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_AUTUMN_CYMBIDIUM =
            BLOCKS.register("potted_autumn_cymbidium", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.AUTUMN_CYMBIDIUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PEONY =
            BLOCKS.register("potted_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_LIGHT_PINK_PEONY =
            BLOCKS.register("potted_light_pink_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.LIGHT_PINK_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_VIOLET_PINK_PEONY =
            BLOCKS.register("potted_violet_pink_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VIOLET_PINK_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_PEONY =
            BLOCKS.register("potted_pink_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_RED_PEONY =
            BLOCKS.register("potted_red_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_LIGHT_RED_PEONY =
            BLOCKS.register("potted_light_red_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.LIGHT_RED_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_INK_RED_PEONY =
            BLOCKS.register("potted_ink_red_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.INK_RED_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_VERMILION_PEONY =
            BLOCKS.register("potted_vermilion_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VERMILION_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PURPLE_PEONY =
            BLOCKS.register("potted_purple_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_LIGHT_PURPLE_PEONY =
            BLOCKS.register("potted_light_purple_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.LIGHT_PURPLE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_INK_PURPLE_PEONY =
            BLOCKS.register("potted_ink_purple_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.INK_PURPLE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_VIOLET_PEONY =
            BLOCKS.register("potted_violet_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VIOLET_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_YELLOW_PEONY =
            BLOCKS.register("potted_yellow_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.YELLOW_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_LIGHT_YELLOW_PEONY =
            BLOCKS.register("potted_light_yellow_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.LIGHT_YELLOW_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_OCHRE_YELLOW_PEONY =
            BLOCKS.register("potted_ochre_yellow_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.OCHRE_YELLOW_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GOLDEN_PEONY =
            BLOCKS.register("potted_golden_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GOLDEN_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_PEONY =
            BLOCKS.register("potted_white_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_INK_PEONY =
            BLOCKS.register("potted_ink_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.INK_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_BLUE_PEONY =
            BLOCKS.register("potted_blue_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BLUE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_GREEN_PEONY =
            BLOCKS.register("potted_green_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.GREEN_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_COLORFUL_PEONY =
            BLOCKS.register("potted_colorful_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.COLORFUL_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_LIGHT_COLORFUL_PEONY =
            BLOCKS.register("potted_light_colorful_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.LIGHT_COLORFUL_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_INK_COLORFUL_PEONY =
            BLOCKS.register("potted_ink_colorful_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.INK_COLORFUL_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_RED_WHITE_PEONY =
            BLOCKS.register("potted_red_white_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_WHITE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_WHITE_PEONY =
            BLOCKS.register("potted_pink_white_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_WHITE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_YELLOW_WHITE_PEONY =
            BLOCKS.register("potted_yellow_white_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.YELLOW_WHITE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PURPLE_WHITE_PEONY =
            BLOCKS.register("potted_purple_white_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_WHITE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WU_HUA_LONG_YU_PEONY =
            BLOCKS.register("potted_wu_hua_long_yu_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WU_HUA_LONG_YU_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_MAUVE_PEONY =
            BLOCKS.register("potted_mauve_peony", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MAUVE_PEONY, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_CAMELLIA =
            BLOCKS.register("potted_camellia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CAMELLIA, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_CAMELLIA =
            BLOCKS.register("potted_white_camellia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_CAMELLIA, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_CAMELLIA =
            BLOCKS.register("potted_pink_camellia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_CAMELLIA, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_VERSICOLOR_CAMELLIA =
            BLOCKS.register("potted_versicolor_camellia", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.VERSICOLOR_CAMELLIA, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_CRIMSON_AZALEA =
            BLOCKS.register("potted_crimson_azalea", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CRIMSON_AZALEA, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_FOUNTAIN_GRASS =
            BLOCKS.register("potted_fountain_grass", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.FOUNTAIN_GRASS, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PURPLE_FOUNTAIN_GRASS =
            BLOCKS.register("potted_purple_fountain_grass", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PURPLE_FOUNTAIN_GRASS, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_FOUNTAIN_GRASS =
            BLOCKS.register("potted_pink_fountain_grass", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_FOUNTAIN_GRASS, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_FOUNTAIN_GRASS =
            BLOCKS.register("potted_white_fountain_grass", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_FOUNTAIN_GRASS, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WINTERSWEET =
            registerBlock("wintersweet", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TWO_QIAO_PEONY =
            registerBlock("two_qiao_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_PEONY =
            registerBlock("versicolor_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WINTER_CYMBIDIUM =
            registerBlock("winter_cymbidium", () -> new ModHalfTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHINESE_ROSE =
            registerBlock("chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_CHINESE_ROSE =
            registerBlock("pink_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_CHINESE_ROSE =
            registerBlock("yellow_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CHINESE_ROSE =
            registerBlock("white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_PINK_CHINESE_ROSE =
            registerBlock("red_pink_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_YELLOW_CHINESE_ROSE =
            registerBlock("red_yellow_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_WHITE_CHINESE_ROSE =
            registerBlock("red_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_WHITE_CHINESE_ROSE =
            registerBlock("pink_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_WHITE_CHINESE_ROSE =
            registerBlock("yellow_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CRAPE_MYRTLE =
            registerBlock("crape_myrtle", () -> new ModRotatedPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> COTTON_ROSE =
            registerBlock("cotton_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MISCANTHUS =
            registerBlock("miscanthus", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_MISCANTHUS =
            BLOCKS.register("golden_miscanthus", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> POTTED_WINTER_CYMBIDIUM =
            BLOCKS.register("potted_winter_cymbidium", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WINTER_CYMBIDIUM, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WINTERSWEET =
            BLOCKS.register("potted_wintersweet", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WINTERSWEET, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_CHINESE_ROSE =
            BLOCKS.register("potted_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_CHINESE_ROSE =
            BLOCKS.register("potted_pink_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_YELLOW_CHINESE_ROSE =
            BLOCKS.register("potted_yellow_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.YELLOW_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_white_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.WHITE_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_RED_PINK_CHINESE_ROSE =
            BLOCKS.register("potted_red_pink_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_PINK_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_RED_YELLOW_CHINESE_ROSE =
            BLOCKS.register("potted_red_yellow_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_YELLOW_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_RED_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_red_white_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.RED_WHITE_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_PINK_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_pink_white_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.PINK_WHITE_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POTTED_YELLOW_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_yellow_white_chinese_rose", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.YELLOW_WHITE_CHINESE_ROSE, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PEACH_PINK_PETALS =
            registerBlock("peach_pink_petals", () -> new PeachPinkPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MOTTLED_BAMBOO_SAPLING =
            BLOCKS.register("mottled_bamboo_sapling", () -> new MottledBambooSaplingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SAPLING)));
    public static final RegistryObject<Block> MOTTLED_BAMBOO =
            BLOCKS.register("mottled_bamboo", () -> new MottledBambooStalkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO)));
    public static final RegistryObject<Block> POTTED_MOTTLED_BAMBOO =
            BLOCKS.register("potted_mottled_bamboo", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.MOTTLED_BAMBOO, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLACK_BAMBOO_SAPLING =
            BLOCKS.register("black_bamboo_sapling", () -> new BlackBambooSaplingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SAPLING)));
    public static final RegistryObject<Block> BLACK_BAMBOO =
            BLOCKS.register("black_bamboo", () -> new BlackBambooStalkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO)));
    public static final RegistryObject<Block> POTTED_BLACK_BAMBOO =
            BLOCKS.register("potted_black_bamboo", () -> new FlowerPotBlock(() -> ((FlowerPotBlock)Blocks.FLOWER_POT), ModBlocks.BLACK_BAMBOO, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LOTUS =
            registerBlock("lotus", () -> new WaterLotusBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).mapColor(MapColor.COLOR_PINK).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> WHITE_LOTUS =
            registerBlock("white_lotus", () -> new WaterLotusBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).mapColor(MapColor.SNOW).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> LOTUS_LEAF =
            registerBlock("lotus_leaf", () -> new WaterLotusLeafBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));

    public static final RegistryObject<Block> ORNAMENTAL_PEACH_PETALS =
            BLOCKS.register("ornamental_peach_petals", () -> leafPile(MapColor.COLOR_PINK, SoundType.PINK_PETALS));
    public static final RegistryObject<Block> WILD_PEACH_PETALS =
            BLOCKS.register("wild_peach_petals", () -> leafPile(MapColor.COLOR_PINK, SoundType.PINK_PETALS));
    public static final RegistryObject<Block> CHINESE_PARASOL_LEAF_0 =
            BLOCKS.register("chinese_parasol_leaf_0", () -> leafPile(MapColor.COLOR_YELLOW, SoundType.PINK_PETALS));
    public static final RegistryObject<Block> CHINESE_PARASOL_LEAF_1 =
            BLOCKS.register("chinese_parasol_leaf_1", () -> leafPile(MapColor.COLOR_ORANGE, SoundType.PINK_PETALS));
    public static final RegistryObject<Block> SWEETGUM_LEAF_PILE_0 =
            BLOCKS.register("sweetgum_leaf_pile_0", () -> leafPile(MapColor.COLOR_RED, SoundType.PINK_PETALS));
    public static final RegistryObject<Block> SWEETGUM_LEAF_PILE_1 =
            BLOCKS.register("sweetgum_leaf_pile_1", () -> leafPile(MapColor.COLOR_RED,SoundType.PINK_PETALS));
    public static final RegistryObject<Block> GINKGO_LEAF_PILE =
            BLOCKS.register("ginkgo_leaf_pile", () -> leafPile(MapColor.COLOR_YELLOW,SoundType.PINK_PETALS));

    private static ModRotatedPillarBlock log(MapColor pTopMapColor, MapColor pSideMapColor) {
        return new ModRotatedPillarBlock(BlockBehaviour.Properties.of().mapColor((p_152624_) ->
                p_152624_.getValue(RotatedPillarBlock.AXIS) == Direction.Axis.Y ? pTopMapColor : pSideMapColor).instrument(NoteBlockInstrument.BASS).strength(2.0F).sound(SoundType.WOOD).ignitedByLava());
    }

    private static ButtonBlock woodenButton(BlockSetType pSetType, FeatureFlag... pRequiredFeatures) {
        BlockBehaviour.Properties blockbehaviour$properties = BlockBehaviour.Properties.of().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY);
        if (pRequiredFeatures.length > 0) {
            blockbehaviour$properties = blockbehaviour$properties.requiredFeatures(pRequiredFeatures);
        }
        return new ButtonBlock(blockbehaviour$properties, pSetType, 30, true);
    }

    private static LeafPileBlock leafPile(MapColor pColor, SoundType pType) {
        return new LeafPileBlock(BlockBehaviour.Properties.of().mapColor(pColor).noCollission().sound(pType).pushReaction(PushReaction.DESTROY));
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> blocks = BLOCKS.register(name, block);
        registerBlockItem(name, blocks);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
