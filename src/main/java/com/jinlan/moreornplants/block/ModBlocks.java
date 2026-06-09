package com.jinlan.moreornplants.block;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.BambooBlocks.BlackBambooSaplingBlock;
import com.jinlan.moreornplants.block.BambooBlocks.BlackBambooStalkBlock;
import com.jinlan.moreornplants.block.BambooBlocks.MottledBambooSaplingBlock;
import com.jinlan.moreornplants.block.BambooBlocks.MottledBambooStalkBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.*;
import com.jinlan.moreornplants.block.LeavesBlocks.*;
import com.jinlan.moreornplants.block.WaterPlantsBlock.MuxueGrassBlock;
import com.jinlan.moreornplants.block.WaterPlantsBlock.TallMuxueGrassBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.*;
import com.jinlan.moreornplants.block.foodBlock.SoupBlock;
import com.jinlan.moreornplants.block.saplingBlocks.*;
import com.jinlan.moreornplants.block.xiangnangBlocks.*;
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
            registerBlock("red_mei_leaves", () -> new RedBoneMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> WHITE_MEI_LEAVES =
            registerBlock("white_mei_leaves", () -> new WhiteMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> PINK_MEI_LEAVES =
            registerBlock("pink_mei_leaves", () -> new PinkMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_LEAVES =
            registerBlock("green_calyx_mei_leaves", () -> new GreenCalyxMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_LEAVES =
            registerBlock("double_pink_mei_leaves", () -> new DoublePinkMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> DOUBLE_WHITE_MEI_LEAVES =
            registerBlock("double_white_mei_leaves", () -> new DoubleWhiteMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> FLAVESCENS_MEI_LEAVES =
            registerBlock("flavescens_mei_leaves", () -> new FlavescensMeiLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_YELLOW)));
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
    public static final RegistryObject<Block> CLOUD_APRICOT_LEAVES =
            registerBlock("cloud_apricot_leaves", () -> new CloudApricotLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> ORNAMENTAL_PEACH_LEAVES =
            registerBlock("ornamental_peach_leaves", () -> new OrnPeachLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> WILD_PEACH_LEAVES =
            registerBlock("wild_peach_leaves", () -> new WildPeachLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> WHITE_PEACH_LEAVES =
            registerBlock("white_peach_leaves", () -> new WhitePeachLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> IMMORTAL_PEACH_LEAVES =
            registerBlock("immortal_peach_leaves", () -> new ImmortalPeachLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES)));
    public static final RegistryObject<Block> PEAR_LEAVES =
            registerBlock("pear_leaves", () -> new PearLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> TAIWAN_CHERRY_LEAVES =
            registerBlock("taiwan_cherry_leaves", () -> new TaiwanCherryLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> FLOWERING_PURPLE_LEAF_PLUM_LEAVES =
            registerBlock("flowering_purple_leaf_plum_leaves", () -> new FloweringPurpleLeafPlumLeavesBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LEAVES).mapColor(MapColor.SNOW)));
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
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_LEAVES =
            registerBlock("red_crape_myrtle_leaves", () -> new RedCrapeMyrtleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_LEAVES =
            registerBlock("pink_crape_myrtle_leaves", () -> new PinkCrapeMyrtleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_LEAVES =
            registerBlock("white_crape_myrtle_leaves", () -> new WhiteCrapeMyrtleLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> RED_AZALEA_LEAVES =
            registerBlock("red_azalea_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> MAYING_RHODODENDRON_LEAVES =
            registerBlock("maying_rhododendron_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.COLOR_RED)));
    public static final RegistryObject<Block> DEWDROP_RHODODENDRON_LEAVES =
            registerBlock("dewdrop_rhododendron_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> CHARMING_RHODODENDRON_LEAVES =
            registerBlock("charming_rhododendron_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.COLOR_MAGENTA)));
    public static final RegistryObject<Block> GREAT_WHITE_RHODODENDRON_LEAVES =
            registerBlock("great_white_rhododendron_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.SNOW)));
    public static final RegistryObject<Block> PURPLE_RHODODENDRON_LEAVES =
            registerBlock("purple_rhododendron_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.COLOR_PURPLE)));
    public static final RegistryObject<Block> PINK_RHODODENDRON_LEAVES =
            registerBlock("pink_rhododendron_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> CHINESE_AZALEA_LEAVES =
            registerBlock("chinese_azalea_leaves", () -> new ModLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> CAMELLIA_LEAVES =
            registerBlock("camellia_leaves", () -> new CamelliaLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final RegistryObject<Block> WHITE_CAMELLIA_LEAVES =
            registerBlock("white_camellia_leaves", () -> new WhiteCamelliaLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final RegistryObject<Block> PINK_CAMELLIA_LEAVES =
            registerBlock("pink_camellia_leaves", () -> new PinkCamelliaLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)));
    public static final RegistryObject<Block> VERSICOLOR_CAMELLIA_LEAVES =
            registerBlock("versicolor_camellia_leaves", () -> new VersicolorCamelliaLeavesBlock(BlockBehaviour.Properties.copy(Blocks.FLOWERING_AZALEA_LEAVES)));

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
    public static final RegistryObject<Block> CRABAPPLE =
            BLOCKS.register("crabapple", () -> new CrabappleBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.CHERRY_LEAVES).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CLOUD_APRICOT =
            BLOCKS.register("cloud_apricot", () -> new ApricotBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.SWEET_BERRY_BUSH).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> IMMORTAL_PEACH =
            BLOCKS.register("immortal_peach", () -> new PeachBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.SWEET_BERRY_BUSH).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MEI =
            BLOCKS.register("mei", () -> new MeiBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.SWEET_BERRY_BUSH).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CHINESE_WISTERIA =
            registerBlock("chinese_wisteria", () -> new WisteriaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHINESE_WISTERIA_PLANT =
            BLOCKS.register("chinese_wisteria_plant", () -> new WisteriaPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CHINESE_WISTERIA =
            registerBlock("white_chinese_wisteria", () -> new WhiteWisteriaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CHINESE_WISTERIA_PLANT =
            BLOCKS.register("white_chinese_wisteria_plant", () -> new WhiteWisteriaPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLUE_CHINESE_WISTERIA =
            registerBlock("blue_chinese_wisteria", () -> new BlueWisteriaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLUE_CHINESE_WISTERIA_PLANT =
            BLOCKS.register("blue_chinese_wisteria_plant", () -> new BlueWisteriaPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLUE).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_CHINESE_WISTERIA =
            registerBlock("red_chinese_wisteria", () -> new RedWisteriaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_CHINESE_WISTERIA_PLANT =
            BLOCKS.register("red_chinese_wisteria_plant", () -> new RedWisteriaPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> NANJING_WISTERIA =
            registerBlock("nanjing_wisteria", () -> new NanjingWisteriaBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> NANJING_WISTERIA_PLANT =
            BLOCKS.register("nanjing_wisteria_plant", () -> new NanjingWisteriaPlantBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.CAVE_VINES).pushReaction(PushReaction.DESTROY)));

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
            registerBlock("desert_poplar_fence_gate", () -> new ModFenceGateBlock(BlockBehaviour.Properties.of().mapColor(DESERT_POPLAR_PLANKS.get().defaultMapColor()).forceSolidOn().instrument(NoteBlockInstrument.BASS).strength(2.0F, 3.0F).ignitedByLava(), ModWoodTypes.DESERT_POPLAR));

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
    public static final RegistryObject<Block> PINK_MEI_SAPLING =
            registerBlock("pink_mei_sapling", () -> new SaplingBlock(new PinkMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREEN_CALYX_MEI_SAPLING =
            registerBlock("green_calyx_mei_sapling", () -> new SaplingBlock(new GreenCalyxMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DOUBLE_PINK_MEI_SAPLING =
            registerBlock("double_pink_mei_sapling", () -> new SaplingBlock(new DoublePinkMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DOUBLE_WHITE_MEI_SAPLING =
            registerBlock("double_white_mei_sapling", () -> new SaplingBlock(new DoubleWhiteMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FLAVESCENS_MEI_SAPLING =
            registerBlock("flavescens_mei_sapling", () -> new SaplingBlock(new FlavescensMeiTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
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
    public static final RegistryObject<Block> CLOUD_APRICOT_SAPLING =
            registerBlock("cloud_apricot_sapling", () -> new SaplingBlock(new CloudApricotTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ORNAMENTAL_PEACH_SAPLING =
            registerBlock("ornamental_peach_sapling", () -> new SaplingBlock(new OrnPeachTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WILD_PEACH_SAPLING =
            registerBlock("wild_peach_sapling", () -> new SaplingBlock(new WildPeachTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_PEACH_SAPLING =
            registerBlock("white_peach_sapling", () -> new SaplingBlock(new WhitePeachTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> IMMORTAL_PEACH_SAPLING =
            registerBlock("immortal_peach_sapling", () -> new SaplingBlock(new ImmortalPeachTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PEAR_SAPLING =
            registerBlock("pear_sapling", () -> new SaplingBlock(new PearTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TAIWAN_CHERRY_SAPLING =
            registerBlock("taiwan_cherry_sapling", () -> new SaplingBlock(new TaiwanCherryTreeGrower(), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING).pushReaction(PushReaction.DESTROY)));
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
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE_SAPLING =
            registerBlock("red_crape_myrtle_sapling", () -> new RedCrapeMyrtleSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE_SAPLING =
            registerBlock("pink_crape_myrtle_sapling", () -> new PinkCrapeMyrtleSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE_SAPLING =
            registerBlock("white_crape_myrtle_sapling", () -> new WhiteCrapeMyrtleSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> POTTED_RED_MEI_SAPLING =
            BLOCKS.register("potted_red_mei_sapling", () -> flowerPot(RED_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WHITE_MEI_SAPLING =
            BLOCKS.register("potted_white_mei_sapling", () -> flowerPot(WHITE_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_PINK_MEI_SAPLING =
            BLOCKS.register("potted_pink_mei_sapling", () -> flowerPot(PINK_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_GREEN_CALYX_MEI_SAPLING =
            BLOCKS.register("potted_green_calyx_mei_sapling", () -> flowerPot(GREEN_CALYX_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_DOUBLE_PINK_MEI_SAPLING =
            BLOCKS.register("potted_double_pink_mei_sapling", () -> flowerPot(DOUBLE_PINK_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_DOUBLE_WHITE_MEI_SAPLING =
            BLOCKS.register("potted_double_white_mei_sapling", () -> flowerPot(DOUBLE_WHITE_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_FLAVESCENS_MEI_SAPLING =
            BLOCKS.register("potted_flavescens_mei_sapling", () -> flowerPot(FLAVESCENS_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_VERSICOLOR_MEI_SAPLING =
            BLOCKS.register("potted_versicolor_mei_sapling", () -> flowerPot(VERSICOLOR_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_RED_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_red_weeping_mei_sapling", () -> flowerPot(RED_WEEPING_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WHITE_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_white_weeping_mei_sapling", () -> flowerPot(WHITE_WEEPING_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_GREEN_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_green_weeping_mei_sapling", () -> flowerPot(GREEN_WEEPING_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_PINK_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_pink_weeping_mei_sapling", () -> flowerPot(PINK_WEEPING_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_VERSICOLOR_WEEPING_MEI_SAPLING =
            BLOCKS.register("potted_versicolor_weeping_mei_sapling", () -> flowerPot(VERSICOLOR_WEEPING_MEI_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_UPRIGHT_CRABAPPLE_SAPLING =
            BLOCKS.register("potted_upright_crabapple_sapling", () -> flowerPot(UPRIGHT_CRABAPPLE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WEEPING_CRABAPPLE_SAPLING =
            BLOCKS.register("potted_weeping_crabapple_sapling", () -> flowerPot(WEEPING_CRABAPPLE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_PINK_APRICOT_SAPLING =
            BLOCKS.register("potted_pink_apricot_sapling", () -> flowerPot(PINK_APRICOT_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WHITE_APRICOT_SAPLING =
            BLOCKS.register("potted_white_apricot_sapling", () -> flowerPot(WHITE_APRICOT_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_CLOUD_APRICOT_SAPLING =
            BLOCKS.register("potted_cloud_apricot_sapling", () -> flowerPot(CLOUD_APRICOT_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_ORNAMENTAL_PEACH_SAPLING =
            BLOCKS.register("potted_ornamental_peach_sapling", () -> flowerPot(ORNAMENTAL_PEACH_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WILD_PEACH_SAPLING =
            BLOCKS.register("potted_wild_peach_sapling", () -> flowerPot(WILD_PEACH_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WHITE_PEACH_SAPLING =
            BLOCKS.register("potted_white_peach_sapling", () -> flowerPot(WHITE_PEACH_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_IMMORTAL_PEACH_SAPLING =
            BLOCKS.register("potted_immortal_peach_sapling", () -> flowerPot(IMMORTAL_PEACH_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_PEAR_SAPLING =
            BLOCKS.register("potted_pear_sapling", () -> flowerPot(PEAR_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_TAIWAN_CHERRY_SAPLING =
            BLOCKS.register("potted_taiwan_cherry_sapling", () -> flowerPot(TAIWAN_CHERRY_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_FLOWERING_PURPLE_LEAF_PLUM_SAPLING =
            BLOCKS.register("potted_flowering_purple_leaf_plum_sapling", () -> flowerPot(FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_LEAF_PLUM_SAPLING =
            BLOCKS.register("potted_purple_leaf_plum_sapling", () -> flowerPot(PURPLE_LEAF_PLUM_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_GOLDEN_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_golden_osmanthus_sapling", () -> flowerPot(GOLDEN_OSMANTHUS_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_ORANGE_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_orange_osmanthus_sapling", () -> flowerPot(ORANGE_OSMANTHUS_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WHITE_OSMANTHUS_SAPLING =
            BLOCKS.register("potted_white_osmanthus_sapling", () -> flowerPot(WHITE_OSMANTHUS_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_GOLDEN_GINKGO_SAPLING =
            BLOCKS.register("potted_golden_ginkgo_sapling", () -> flowerPot(GOLDEN_GINKGO_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_GREEN_GINKGO_SAPLING =
            BLOCKS.register("potted_green_ginkgo_sapling", () -> flowerPot(GREEN_GINKGO_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_YELLOW_CHINESE_PARASOL_SAPLING =
            BLOCKS.register("potted_yellow_chinese_parasol_sapling", () -> flowerPot(YELLOW_CHINESE_PARASOL_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_GREEN_CHINESE_PARASOL_SAPLING =
            BLOCKS.register("potted_green_chinese_parasol_sapling", () -> flowerPot(GREEN_CHINESE_PARASOL_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_SWEETGUM_SAPLING =
            BLOCKS.register("potted_sweetgum_sapling", () -> flowerPot(SWEETGUM_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_CAMPHOR_SAPLING =
            BLOCKS.register("potted_camphor_sapling", () -> flowerPot(CAMPHOR_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_DOVE_TREE_SAPLING =
            BLOCKS.register("potted_dove_tree_sapling", () -> flowerPot(DOVE_TREE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_CHINABERRY_SAPLING =
            BLOCKS.register("potted_chinaberry_sapling", () -> flowerPot(CHINABERRY_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_DESERT_POPLAR_SAPLING =
            BLOCKS.register("potted_desert_poplar_sapling", () -> flowerPot(DESERT_POPLAR_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_CRAPE_MYRTLE_SAPLING =
            BLOCKS.register("potted_crape_myrtle_sapling", () -> flowerPot(CRAPE_MYRTLE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_RED_CRAPE_MYRTLE_SAPLING =
            BLOCKS.register("potted_red_crape_myrtle_sapling", () -> flowerPot(RED_CRAPE_MYRTLE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_PINK_CRAPE_MYRTLE_SAPLING =
            BLOCKS.register("potted_pink_crape_myrtle_sapling", () -> flowerPot(PINK_CRAPE_MYRTLE_SAPLING.get()));
    public static final RegistryObject<Block> POTTED_WHITE_CRAPE_MYRTLE_SAPLING =
            BLOCKS.register("potted_white_crape_myrtle_sapling", () -> flowerPot(WHITE_CRAPE_MYRTLE_SAPLING.get()));

    public static final RegistryObject<Block> CHRYSANTHEMUM =
            registerBlock("chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> XIHU_LIUYUE =
            registerBlock("xihu_liuyue", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLD_BACKED_SCARLET_MUM =
            registerBlock("gold_backed_scarlet_mum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CHRYSANTHEMUM =
            registerBlock("white_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLACK_CHRYSANTHEMUM =
            registerBlock("black_chrysanthemum", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
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
            registerBlock("summer_cymbidium", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AUTUMN_CYMBIDIUM =
            registerBlock("autumn_cymbidium", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WINTER_CYMBIDIUM =
            registerBlock("winter_cymbidium", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
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
            registerBlock("camellia", () -> new CamelliaSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CAMELLIA =
            registerBlock("white_camellia", () -> new WhiteCamelliaSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_CAMELLIA =
            registerBlock("pink_camellia", () -> new PinkCamelliaSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_CAMELLIA =
            registerBlock("versicolor_camellia", () -> new VersicolorCamelliaSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_AZALEA =
            registerBlock("red_azalea", () -> new RedAzaleaSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MAYING_RHODODENDRON =
            registerBlock("maying_rhododendron", () -> new MayingRhododendronSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DEWDROP_RHODODENDRON =
            registerBlock("dewdrop_rhododendron", () -> new DewdropRhododendronSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHARMING_RHODODENDRON =
            registerBlock("charming_rhododendron", () -> new CharmingRhododendronSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_MAGENTA).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GREAT_WHITE_RHODODENDRON =
            registerBlock("great_white_rhododendron", () -> new GreatWhiteRhododendronSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_RHODODENDRON =
            registerBlock("purple_rhododendron", () -> new PurpleRhododendronSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_RHODODENDRON =
            registerBlock("pink_rhododendron", () -> new PinkRhododendronSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHINESE_AZALEA =
            registerBlock("chinese_azalea", () -> new ChineseAzaleaSaplingBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHINESE_NARCISSUS =
            registerBlock("chinese_narcissus", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_CHINESE_NARCISSUS =
            registerBlock("golden_chinese_narcissus", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_MOTH_ORCHID =
            registerBlock("white_moth_orchid", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_MOTH_ORCHID =
            registerBlock("pink_moth_orchid", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_MOTH_ORCHID =
            registerBlock("purple_moth_orchid", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_MOTH_ORCHID =
            registerBlock("golden_moth_orchid", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FOUNTAIN_GRASS =
            registerBlock("fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_FOUNTAIN_GRASS =
            registerBlock("purple_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_FOUNTAIN_GRASS =
            registerBlock("pink_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_FOUNTAIN_GRASS =
            registerBlock("white_fountain_grass", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BAMBOO_STICK =
            BLOCKS.register("bamboo_stick", () -> new ModFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> POTTED_CHRYSANTHEMUM =
            BLOCKS.register("potted_chrysanthemum", () -> flowerPot(CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_XIHU_LIUYUE =
            BLOCKS.register("potted_xihu_liuyue", () -> flowerPot(XIHU_LIUYUE.get()));
    public static final RegistryObject<Block> POTTED_GOLD_BACKED_SCARLET_MUM =
            BLOCKS.register("potted_gold_backed_scarlet_mum", () -> flowerPot(GOLD_BACKED_SCARLET_MUM.get()));
    public static final RegistryObject<Block> POTTED_WHITE_CHRYSANTHEMUM =
            BLOCKS.register("potted_white_chrysanthemum", () -> flowerPot(WHITE_CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_BLACK_CHRYSANTHEMUM =
            BLOCKS.register("potted_black_chrysanthemum", () -> flowerPot(BLACK_CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_GREEN_CHRYSANTHEMUM =
            BLOCKS.register("potted_green_chrysanthemum", () -> flowerPot(GREEN_CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_CHRYSANTHEMUM =
            BLOCKS.register("potted_purple_chrysanthemum", () -> flowerPot(PURPLE_CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_VIOLET_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_violet_pink_chrysanthemum", () -> flowerPot(VIOLET_PINK_CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_pink_chrysanthemum", () -> flowerPot(PINK_CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_LIGHT_PINK_CHRYSANTHEMUM =
            BLOCKS.register("potted_light_pink_chrysanthemum", () -> flowerPot(LIGHT_PINK_CHRYSANTHEMUM.get()));
    public static final RegistryObject<Block> POTTED_SPRING_CYMBIDIUM =
            BLOCKS.register("potted_spring_cymbidium", () -> flowerPot(SPRING_CYMBIDIUM.get()));
    public static final RegistryObject<Block> POTTED_SUMMER_CYMBIDIUM =
            BLOCKS.register("potted_summer_cymbidium", () -> flowerPot(SUMMER_CYMBIDIUM.get()));
    public static final RegistryObject<Block> POTTED_AUTUMN_CYMBIDIUM =
            BLOCKS.register("potted_autumn_cymbidium", () -> flowerPot(AUTUMN_CYMBIDIUM.get()));
    public static final RegistryObject<Block> POTTED_PEONY =
            BLOCKS.register("potted_peony", () -> flowerPot(PEONY.get()));
    public static final RegistryObject<Block> POTTED_LIGHT_PINK_PEONY =
            BLOCKS.register("potted_light_pink_peony", () -> flowerPot(LIGHT_PINK_PEONY.get()));
    public static final RegistryObject<Block> POTTED_VIOLET_PINK_PEONY =
            BLOCKS.register("potted_violet_pink_peony", () -> flowerPot(VIOLET_PINK_PEONY.get()));
    public static final RegistryObject<Block> POTTED_PINK_PEONY =
            BLOCKS.register("potted_pink_peony", () -> flowerPot(PINK_PEONY.get()));
    public static final RegistryObject<Block> POTTED_RED_PEONY =
            BLOCKS.register("potted_red_peony", () -> flowerPot(RED_PEONY.get()));
    public static final RegistryObject<Block> POTTED_LIGHT_RED_PEONY =
            BLOCKS.register("potted_light_red_peony", () -> flowerPot(LIGHT_RED_PEONY.get()));
    public static final RegistryObject<Block> POTTED_INK_RED_PEONY =
            BLOCKS.register("potted_ink_red_peony", () -> flowerPot(INK_RED_PEONY.get()));
    public static final RegistryObject<Block> POTTED_VERMILION_PEONY =
            BLOCKS.register("potted_vermilion_peony", () -> flowerPot(VERMILION_PEONY.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_PEONY =
            BLOCKS.register("potted_purple_peony", () -> flowerPot(PURPLE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_LIGHT_PURPLE_PEONY =
            BLOCKS.register("potted_light_purple_peony", () -> flowerPot(LIGHT_PURPLE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_INK_PURPLE_PEONY =
            BLOCKS.register("potted_ink_purple_peony", () -> flowerPot(INK_PURPLE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_VIOLET_PEONY =
            BLOCKS.register("potted_violet_peony", () -> flowerPot(VIOLET_PEONY.get()));
    public static final RegistryObject<Block> POTTED_YELLOW_PEONY =
            BLOCKS.register("potted_yellow_peony", () -> flowerPot(YELLOW_PEONY.get()));
    public static final RegistryObject<Block> POTTED_LIGHT_YELLOW_PEONY =
            BLOCKS.register("potted_light_yellow_peony", () -> flowerPot(LIGHT_YELLOW_PEONY.get()));
    public static final RegistryObject<Block> POTTED_OCHRE_YELLOW_PEONY =
            BLOCKS.register("potted_ochre_yellow_peony", () -> flowerPot(OCHRE_YELLOW_PEONY.get()));
    public static final RegistryObject<Block> POTTED_GOLDEN_PEONY =
            BLOCKS.register("potted_golden_peony", () -> flowerPot(GOLDEN_PEONY.get()));
    public static final RegistryObject<Block> POTTED_WHITE_PEONY =
            BLOCKS.register("potted_white_peony", () -> flowerPot(WHITE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_INK_PEONY =
            BLOCKS.register("potted_ink_peony", () -> flowerPot(INK_PEONY.get()));
    public static final RegistryObject<Block> POTTED_BLUE_PEONY =
            BLOCKS.register("potted_blue_peony", () -> flowerPot(BLUE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_GREEN_PEONY =
            BLOCKS.register("potted_green_peony", () -> flowerPot(GREEN_PEONY.get()));
    public static final RegistryObject<Block> POTTED_COLORFUL_PEONY =
            BLOCKS.register("potted_colorful_peony", () -> flowerPot(COLORFUL_PEONY.get()));
    public static final RegistryObject<Block> POTTED_LIGHT_COLORFUL_PEONY =
            BLOCKS.register("potted_light_colorful_peony", () -> flowerPot(LIGHT_COLORFUL_PEONY.get()));
    public static final RegistryObject<Block> POTTED_INK_COLORFUL_PEONY =
            BLOCKS.register("potted_ink_colorful_peony", () -> flowerPot(INK_COLORFUL_PEONY.get()));
    public static final RegistryObject<Block> POTTED_RED_WHITE_PEONY =
            BLOCKS.register("potted_red_white_peony", () -> flowerPot(RED_WHITE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_PINK_WHITE_PEONY =
            BLOCKS.register("potted_pink_white_peony", () -> flowerPot(PINK_WHITE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_YELLOW_WHITE_PEONY =
            BLOCKS.register("potted_yellow_white_peony", () -> flowerPot(YELLOW_WHITE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_WHITE_PEONY =
            BLOCKS.register("potted_purple_white_peony", () -> flowerPot(PURPLE_WHITE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_WU_HUA_LONG_YU_PEONY =
            BLOCKS.register("potted_wu_hua_long_yu_peony", () -> flowerPot(WU_HUA_LONG_YU_PEONY.get()));
    public static final RegistryObject<Block> POTTED_MAUVE_PEONY =
            BLOCKS.register("potted_mauve_peony", () -> flowerPot(MAUVE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CAMELLIA =
            BLOCKS.register("potted_camellia", () -> flowerPot(CAMELLIA.get()));
    public static final RegistryObject<Block> POTTED_WHITE_CAMELLIA =
            BLOCKS.register("potted_white_camellia", () -> flowerPot(WHITE_CAMELLIA.get()));
    public static final RegistryObject<Block> POTTED_PINK_CAMELLIA =
            BLOCKS.register("potted_pink_camellia", () -> flowerPot(PINK_CAMELLIA.get()));
    public static final RegistryObject<Block> POTTED_VERSICOLOR_CAMELLIA =
            BLOCKS.register("potted_versicolor_camellia", () -> flowerPot(VERSICOLOR_CAMELLIA.get()));
    public static final RegistryObject<Block> POTTED_RED_AZALEA =
            BLOCKS.register("potted_red_azalea", () -> flowerPot(RED_AZALEA.get()));
    public static final RegistryObject<Block> POTTED_MAYING_RHODODENDRON =
            BLOCKS.register("potted_maying_rhododendron", () -> flowerPot(MAYING_RHODODENDRON.get()));
    public static final RegistryObject<Block> POTTED_DEWDROP_RHODODENDRON =
            BLOCKS.register("potted_dewdrop_rhododendron", () -> flowerPot(DEWDROP_RHODODENDRON.get()));
    public static final RegistryObject<Block> POTTED_CHARMING_RHODODENDRON =
            BLOCKS.register("potted_charming_rhododendron", () -> flowerPot(CHARMING_RHODODENDRON.get()));
    public static final RegistryObject<Block> POTTED_GREAT_WHITE_RHODODENDRON =
            BLOCKS.register("potted_great_white_rhododendron", () -> flowerPot(GREAT_WHITE_RHODODENDRON.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_RHODODENDRON =
            BLOCKS.register("potted_purple_rhododendron", () -> flowerPot(PURPLE_RHODODENDRON.get()));
    public static final RegistryObject<Block> POTTED_PINK_RHODODENDRON =
            BLOCKS.register("potted_pink_rhododendron", () -> flowerPot(PINK_RHODODENDRON.get()));
    public static final RegistryObject<Block> POTTED_CHINESE_AZALEA =
            BLOCKS.register("potted_chinese_azalea", () -> flowerPot(CHINESE_AZALEA.get()));
    public static final RegistryObject<Block> POTTED_CHINESE_NARCISSUS =
            BLOCKS.register("potted_chinese_narcissus", () -> flowerPot(CHINESE_NARCISSUS.get()));
    public static final RegistryObject<Block> POTTED_GOLDEN_CHINESE_NARCISSUS =
            BLOCKS.register("potted_golden_chinese_narcissus", () -> flowerPot(GOLDEN_CHINESE_NARCISSUS.get()));
    public static final RegistryObject<Block> POTTED_WHITE_MOTH_ORCHID =
            BLOCKS.register("potted_white_moth_orchid", () -> flowerPot(WHITE_MOTH_ORCHID.get()));
    public static final RegistryObject<Block> POTTED_PINK_MOTH_ORCHID =
            BLOCKS.register("potted_pink_moth_orchid", () -> flowerPot(PINK_MOTH_ORCHID.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_MOTH_ORCHID =
            BLOCKS.register("potted_purple_moth_orchid", () -> flowerPot(PURPLE_MOTH_ORCHID.get()));
    public static final RegistryObject<Block> POTTED_GOLDEN_MOTH_ORCHID =
            BLOCKS.register("potted_golden_moth_orchid", () -> flowerPot(GOLDEN_MOTH_ORCHID.get()));
    public static final RegistryObject<Block> POTTED_FOUNTAIN_GRASS =
            BLOCKS.register("potted_fountain_grass", () -> flowerPot(FOUNTAIN_GRASS.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_FOUNTAIN_GRASS =
            BLOCKS.register("potted_purple_fountain_grass", () -> flowerPot(PURPLE_FOUNTAIN_GRASS.get()));
    public static final RegistryObject<Block> POTTED_PINK_FOUNTAIN_GRASS =
            BLOCKS.register("potted_pink_fountain_grass", () -> flowerPot(PINK_FOUNTAIN_GRASS.get()));
    public static final RegistryObject<Block> POTTED_WHITE_FOUNTAIN_GRASS =
            BLOCKS.register("potted_white_fountain_grass", () -> flowerPot(WHITE_FOUNTAIN_GRASS.get()));
    public static final RegistryObject<Block> POTTED_BAMBOO_STICK =
            BLOCKS.register("potted_bamboo_stick", () -> flowerPot(BAMBOO_STICK.get()));

    public static final RegistryObject<Block> WINTERSWEET =
            registerBlock("wintersweet", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YAO_HUANG_PEONY =
            registerBlock("yao_huang_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WEI_ZI_PEONY =
            registerBlock("wei_zi_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ZHAO_PINK_PEONY =
            registerBlock("zhao_pink_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DOU_GREEN_PEONY =
            registerBlock("dou_green_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LUOYANG_RED_PEONY =
            registerBlock("luoyang_red_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TWO_QIAO_PEONY =
            registerBlock("two_qiao_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VERSICOLOR_PEONY =
            registerBlock("versicolor_peony", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).ignitedByLava().pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHINESE_ROSE =
            registerBlock("chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_CHINESE_ROSE =
            registerBlock("pink_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_CHINESE_ROSE =
            registerBlock("yellow_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CHINESE_ROSE =
            registerBlock("white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_CHINESE_ROSE =
            registerBlock("purple_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_PINK_CHINESE_ROSE =
            registerBlock("red_pink_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_YELLOW_CHINESE_ROSE =
            registerBlock("red_yellow_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_WHITE_CHINESE_ROSE =
            registerBlock("red_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_WHITE_CHINESE_ROSE =
            registerBlock("pink_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> YELLOW_WHITE_CHINESE_ROSE =
            registerBlock("yellow_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PURPLE_WHITE_CHINESE_ROSE =
            registerBlock("purple_white_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BAOHUA_CHINESE_ROSE =
            registerBlock("baohua_chinese_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TALL_CAMELLIA =
            registerBlock("tall_camellia", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TALL_WHITE_CAMELLIA =
            registerBlock("tall_white_camellia", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TALL_PINK_CAMELLIA =
            registerBlock("tall_pink_camellia", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TALL_VERSICOLOR_CAMELLIA =
            registerBlock("tall_versicolor_camellia", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CRAPE_MYRTLE =
            registerBlock("crape_myrtle", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RED_CRAPE_MYRTLE =
            registerBlock("red_crape_myrtle", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PINK_CRAPE_MYRTLE =
            registerBlock("pink_crape_myrtle", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WHITE_CRAPE_MYRTLE =
            registerBlock("white_crape_myrtle", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> COTTON_ROSE =
            registerBlock("cotton_rose", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MISCANTHUS =
            registerBlock("miscanthus", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOLDEN_MISCANTHUS =
            BLOCKS.register("golden_miscanthus", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HARDY_BANANA =
            registerBlock("hardy_banana", () -> new ModTallFlowerBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> POTTED_WINTER_CYMBIDIUM =
            BLOCKS.register("potted_winter_cymbidium", () -> flowerPot(WINTER_CYMBIDIUM.get()));
    public static final RegistryObject<Block> POTTED_WINTERSWEET =
            BLOCKS.register("potted_wintersweet", () -> flowerPot(WINTERSWEET.get()));
    public static final RegistryObject<Block> POTTED_CHINESE_ROSE =
            BLOCKS.register("potted_chinese_rose", () -> flowerPot(CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_PINK_CHINESE_ROSE =
            BLOCKS.register("potted_pink_chinese_rose", () -> flowerPot(PINK_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_YELLOW_CHINESE_ROSE =
            BLOCKS.register("potted_yellow_chinese_rose", () -> flowerPot(YELLOW_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_white_chinese_rose", () -> flowerPot(WHITE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_CHINESE_ROSE =
            BLOCKS.register("potted_purple_chinese_rose", () -> flowerPot(PURPLE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_RED_PINK_CHINESE_ROSE =
            BLOCKS.register("potted_red_pink_chinese_rose", () -> flowerPot(RED_PINK_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_RED_YELLOW_CHINESE_ROSE =
            BLOCKS.register("potted_red_yellow_chinese_rose", () -> flowerPot(RED_YELLOW_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_RED_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_red_white_chinese_rose", () -> flowerPot(RED_WHITE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_PINK_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_pink_white_chinese_rose", () -> flowerPot(PINK_WHITE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_YELLOW_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_yellow_white_chinese_rose", () -> flowerPot(YELLOW_WHITE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_PURPLE_WHITE_CHINESE_ROSE =
            BLOCKS.register("potted_purple_white_chinese_rose", () -> flowerPot(PURPLE_WHITE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_BAOHUA_CHINESE_ROSE =
            BLOCKS.register("potted_baohua_chinese_rose", () -> flowerPot(BAOHUA_CHINESE_ROSE.get()));

    public static final RegistryObject<Block> CUT_PEONY =
            registerBlock("cut_peony", () -> cutFlower(ModBlocks.PEONY.get()));
    public static final RegistryObject<Block> CUT_LIGHT_PINK_PEONY =
            registerBlock("cut_light_pink_peony", () -> cutFlower(ModBlocks.LIGHT_PINK_PEONY.get()));
    public static final RegistryObject<Block> CUT_VIOLET_PINK_PEONY =
            registerBlock("cut_violet_pink_peony", () -> cutFlower(ModBlocks.VIOLET_PINK_PEONY.get()));
    public static final RegistryObject<Block> CUT_RED_PEONY =
            registerBlock("cut_red_peony", () -> cutFlower(ModBlocks.RED_PEONY.get()));
    public static final RegistryObject<Block> CUT_LIGHT_RED_PEONY =
            registerBlock("cut_light_red_peony", () -> cutFlower(ModBlocks.LIGHT_RED_PEONY.get()));
    public static final RegistryObject<Block> CUT_INK_RED_PEONY =
            registerBlock("cut_ink_red_peony", () -> cutFlower(ModBlocks.INK_RED_PEONY.get()));
    public static final RegistryObject<Block> CUT_PURPLE_PEONY =
            registerBlock("cut_purple_peony", () -> cutFlower(ModBlocks.PURPLE_PEONY.get()));
    public static final RegistryObject<Block> CUT_LIGHT_PURPLE_PEONY =
            registerBlock("cut_light_purple_peony", () -> cutFlower(ModBlocks.LIGHT_PURPLE_PEONY.get()));
    public static final RegistryObject<Block> CUT_INK_PURPLE_PEONY =
            registerBlock("cut_ink_purple_peony", () -> cutFlower(ModBlocks.INK_PURPLE_PEONY.get()));
    public static final RegistryObject<Block> CUT_YELLOW_PEONY =
            registerBlock("cut_yellow_peony", () -> cutFlower(ModBlocks.YELLOW_PEONY.get()));
    public static final RegistryObject<Block> CUT_LIGHT_YELLOW_PEONY =
            registerBlock("cut_light_yellow_peony", () -> cutFlower(ModBlocks.LIGHT_YELLOW_PEONY.get()));
    public static final RegistryObject<Block> CUT_OCHRE_YELLOW_PEONY =
            registerBlock("cut_ochre_yellow_peony", () -> cutFlower(ModBlocks.OCHRE_YELLOW_PEONY.get()));
    public static final RegistryObject<Block> CUT_WHITE_PEONY =
            registerBlock("cut_white_peony", () -> cutFlower(ModBlocks.WHITE_PEONY.get()));
    public static final RegistryObject<Block> CUT_INK_PEONY =
            registerBlock("cut_ink_peony", () -> cutFlower(ModBlocks.INK_PEONY.get()));
    public static final RegistryObject<Block> CUT_BLUE_PEONY =
            registerBlock("cut_blue_peony", () -> cutFlower(ModBlocks.BLUE_PEONY.get()));
    public static final RegistryObject<Block> CUT_GREEN_PEONY =
            registerBlock("cut_green_peony", () -> cutFlower(ModBlocks.GREEN_PEONY.get()));
    public static final RegistryObject<Block> CUT_WU_HUA_LONG_YU_PEONY =
            registerBlock("cut_wu_hua_long_yu_peony", () -> cutFlower(ModBlocks.WU_HUA_LONG_YU_PEONY.get()));
    public static final RegistryObject<Block> CUT_MAUVE_PEONY =
            registerBlock("cut_mauve_peony", () -> cutFlower(ModBlocks.MAUVE_PEONY.get()));
    public static final RegistryObject<Block> CUT_CHINESE_ROSE =
            registerBlock("cut_chinese_rose", () -> cutFlower(ModBlocks.CHINESE_ROSE.get()));
    public static final RegistryObject<Block> CUT_PINK_ROSE =
            registerBlock("cut_pink_rose", () -> cutFlower(ModBlocks.PINK_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> CUT_YELLOW_ROSE =
            registerBlock("cut_yellow_rose", () -> cutFlower(ModBlocks.YELLOW_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> CUT_WHITE_ROSE =
            registerBlock("cut_white_rose", () -> cutFlower(ModBlocks.WHITE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> CUT_PURPLE_ROSE =
            registerBlock("cut_purple_rose", () -> cutFlower(ModBlocks.PURPLE_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> CUT_BAOHUA_CHINESE_ROSE =
            registerBlock("cut_baohua_chinese_rose", () -> cutFlower(ModBlocks.BAOHUA_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> CUT_WINTERSWEET =
            registerBlock("cut_wintersweet", () -> cutFlower(ModBlocks.WINTERSWEET.get()));
    public static final RegistryObject<Block> CUT_COTTON_ROSE =
            registerBlock("cut_cotton_rose", () -> cutFlower(ModBlocks.COTTON_ROSE.get()));

    public static final RegistryObject<Block> POTTED_CUT_PEONY =
            BLOCKS.register("potted_cut_peony", () -> flowerPot(CUT_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_LIGHT_PINK_PEONY =
            BLOCKS.register("potted_cut_light_pink_peony", () -> flowerPot(CUT_LIGHT_PINK_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_VIOLET_PINK_PEONY =
            BLOCKS.register("potted_cut_violet_pink_peony", () -> flowerPot(CUT_VIOLET_PINK_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_RED_PEONY =
            BLOCKS.register("potted_cut_red_peony", () -> flowerPot(CUT_RED_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_LIGHT_RED_PEONY =
            BLOCKS.register("potted_cut_light_red_peony", () -> flowerPot(CUT_LIGHT_RED_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_INK_RED_PEONY =
            BLOCKS.register("potted_cut_ink_red_peony", () -> flowerPot(CUT_INK_RED_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_PURPLE_PEONY =
            BLOCKS.register("potted_cut_purple_peony", () -> flowerPot(CUT_PURPLE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_LIGHT_PURPLE_PEONY =
            BLOCKS.register("potted_cut_light_purple_peony", () -> flowerPot(CUT_LIGHT_PURPLE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_INK_PURPLE_PEONY =
            BLOCKS.register("potted_cut_ink_purple_peony", () -> flowerPot(CUT_INK_PURPLE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_YELLOW_PEONY =
            BLOCKS.register("potted_cut_yellow_peony", () -> flowerPot(CUT_YELLOW_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_LIGHT_YELLOW_PEONY =
            BLOCKS.register("potted_cut_light_yellow_peony", () -> flowerPot(CUT_LIGHT_YELLOW_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_OCHRE_YELLOW_PEONY =
            BLOCKS.register("potted_cut_ochre_yellow_peony", () -> flowerPot(CUT_OCHRE_YELLOW_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_WHITE_PEONY =
            BLOCKS.register("potted_cut_white_peony", () -> flowerPot(CUT_WHITE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_INK_PEONY =
            BLOCKS.register("potted_cut_ink_peony", () -> flowerPot(CUT_INK_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_BLUE_PEONY =
            BLOCKS.register("potted_cut_blue_peony", () -> flowerPot(CUT_BLUE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_GREEN_PEONY =
            BLOCKS.register("potted_cut_green_peony", () -> flowerPot(CUT_GREEN_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_WU_HUA_LONG_YU_PEONY =
            BLOCKS.register("potted_cut_wu_hua_long_yu_peony", () -> flowerPot(CUT_WU_HUA_LONG_YU_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_MAUVE_PEONY =
            BLOCKS.register("potted_cut_mauve_peony", () -> flowerPot(CUT_MAUVE_PEONY.get()));
    public static final RegistryObject<Block> POTTED_CUT_CHINESE_ROSE =
            BLOCKS.register("potted_cut_chinese_rose", () -> flowerPot(CUT_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_CUT_PINK_ROSE =
            BLOCKS.register("potted_cut_pink_rose", () -> flowerPot(CUT_PINK_ROSE.get()));
    public static final RegistryObject<Block> POTTED_CUT_YELLOW_ROSE =
            BLOCKS.register("potted_cut_yellow_rose", () -> flowerPot(CUT_YELLOW_ROSE.get()));
    public static final RegistryObject<Block> POTTED_CUT_WHITE_ROSE =
            BLOCKS.register("potted_cut_white_rose", () -> flowerPot(CUT_WHITE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_CUT_PURPLE_ROSE =
            BLOCKS.register("potted_cut_purple_rose", () -> flowerPot(CUT_PURPLE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_CUT_BAOHUA_CHINESE_ROSE =
            BLOCKS.register("potted_cut_baohua_chinese_rose", () -> flowerPot(CUT_BAOHUA_CHINESE_ROSE.get()));
    public static final RegistryObject<Block> POTTED_CUT_WINTERSWEET =
            BLOCKS.register("potted_cut_wintersweet", () -> flowerPot(CUT_WINTERSWEET.get()));
    public static final RegistryObject<Block> POTTED_CUT_COTTON_ROSE =
            BLOCKS.register("potted_cut_cotton_rose", () -> flowerPot(CUT_COTTON_ROSE.get()));

    public static final RegistryObject<Block> PEACH_PINK_PETALS =
            registerBlock("peach_pink_petals", () -> new ModFlowerPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FRAGRANT_SNOW_PETALS =
            registerBlock("fragrant_snow_petals", () -> new ModFlowerPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.SNOW).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SPRING_PETALS =
            registerBlock("spring_petals", () -> new ModFlowerPetalsBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MOTTLED_BAMBOO_SAPLING =
            BLOCKS.register("mottled_bamboo_sapling", () -> new MottledBambooSaplingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SAPLING)));
    public static final RegistryObject<Block> MOTTLED_BAMBOO =
            BLOCKS.register("mottled_bamboo", () -> new MottledBambooStalkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO)));
    public static final RegistryObject<Block> POTTED_MOTTLED_BAMBOO =
            BLOCKS.register("potted_mottled_bamboo", () -> flowerPot(MOTTLED_BAMBOO.get()));
    public static final RegistryObject<Block> BLACK_BAMBOO_SAPLING =
            BLOCKS.register("black_bamboo_sapling", () -> new BlackBambooSaplingBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SAPLING)));
    public static final RegistryObject<Block> BLACK_BAMBOO =
            BLOCKS.register("black_bamboo", () -> new BlackBambooStalkBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO)));
    public static final RegistryObject<Block> POTTED_BLACK_BAMBOO =
            BLOCKS.register("potted_black_bamboo", () -> flowerPot(BLACK_BAMBOO.get()));

    public static final RegistryObject<Block> LOTUS =
            registerBlock("lotus", () -> new WaterLotusBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).mapColor(MapColor.COLOR_PINK).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> WHITE_LOTUS =
            registerBlock("white_lotus", () -> new WaterLotusBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).mapColor(MapColor.SNOW).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> LOTUS_LEAF =
            registerBlock("lotus_leaf", () -> new WaterLotusLeafBlock(BlockBehaviour.Properties.copy(Blocks.LILY_PAD).noCollission().offsetType(BlockBehaviour.OffsetType.XZ)));
    public static final RegistryObject<Block> MUXUE_GRASS =
            registerBlock("muxue_grass", () -> new MuxueGrassBlock(BlockBehaviour.Properties.copy(Blocks.SEAGRASS).lightLevel(p_220867_ -> 12)));
    public static final RegistryObject<Block> TALL_MUXUE_GRASS =
            BLOCKS.register("tall_muxue_grass", () -> new TallMuxueGrassBlock(BlockBehaviour.Properties.copy(Blocks.TALL_SEAGRASS).lightLevel(p_220867_ -> 12)));

    public static final RegistryObject<Block> ORNAMENTAL_PEACH_PETALS =
            BLOCKS.register("ornamental_peach_petals", () -> leafPile2(MapColor.COLOR_PINK));
    public static final RegistryObject<Block> WILD_PEACH_PETALS =
            BLOCKS.register("wild_peach_petals", () -> leafPile2(MapColor.COLOR_PINK));
    public static final RegistryObject<Block> CHINESE_PARASOL_LEAF_0 =
            BLOCKS.register("chinese_parasol_leaf_0", () -> leafPile(MapColor.COLOR_YELLOW));
    public static final RegistryObject<Block> CHINESE_PARASOL_LEAF_1 =
            BLOCKS.register("chinese_parasol_leaf_1", () -> leafPile(MapColor.COLOR_ORANGE));
    public static final RegistryObject<Block> SWEETGUM_LEAF_0 =
            BLOCKS.register("sweetgum_leaf_0", () -> leafPile(MapColor.COLOR_RED));
    public static final RegistryObject<Block> SWEETGUM_LEAF_1 =
            BLOCKS.register("sweetgum_leaf_1", () -> leafPile(MapColor.COLOR_RED));
    public static final RegistryObject<Block> GINKGO_LEAF =
            BLOCKS.register("ginkgo_leaf", () -> leafPile2(MapColor.COLOR_YELLOW));

    public static final RegistryObject<Block> MEI_XIANGNANG =
            BLOCKS.register("mei_xiangnang", () -> new MeiXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> OSMANTHUS_XIANGNANG =
            BLOCKS.register("osmanthus_xiangnang", () -> new GuiXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CYMBIDIUM_XIANGNANG =
            BLOCKS.register("cymbidium_xiangnang", () -> new LanXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WINTERSWEET_XIANGNANG =
            BLOCKS.register("wintersweet_xiangnang", () -> new LaMeiXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LILAC_XIANGNANG =
            BLOCKS.register("lilac_xiangnang", () -> new LaMeiXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_YELLOW).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHINESE_ROSE_XIANGNANG =
            BLOCKS.register("chinese_rose_xiangnang", () -> new YueJiXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RUGOSA_ROSE_XIANGNANG =
            BLOCKS.register("rugosa_rose_xiangnang", () -> new YueJiXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> APRICOT_XIANGNANG =
            BLOCKS.register("apricot_xiangnang", () -> new TaoXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PEACH_XIANGNANG =
            BLOCKS.register("peach_xiangnang", () -> new TaoXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PEAR_XIANGNANG =
            BLOCKS.register("pear_xiangnang", () -> new TaoXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LOTUS_XIANGNANG =
            BLOCKS.register("lotus_xiangnang", () -> new TaoXiangnangBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK).noOcclusion().instabreak().sound(SoundType.WOOL).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ZIYING_BEADLIGHT =
            registerBlock("ziying_beadlight", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PEARLESCENT_FROGLIGHT).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SUYU_BEADLIGHT =
            registerBlock("suyu_beadlight", () -> new Block(BlockBehaviour.Properties.copy(Blocks.VERDANT_FROGLIGHT).sound(SoundType.METAL)));

    public static final RegistryObject<Block> BAMBOO_SHOOTS_SOUP =
            BLOCKS.register("bamboo_shoots_soup", () -> new SoupBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LOTUS_ROOT_SOUP =
            BLOCKS.register("lotus_root_soup", () -> new SoupBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LOTUS_SEED_SOUP =
            BLOCKS.register("lotus_seed_soup", () -> new SoupBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MUXUE_SOUP =
            BLOCKS.register("muxue_soup", () -> new SoupBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY)));

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

    private static Block cutFlower(Block tallFlower) {
        return new CutFlowerBlock(tallFlower, BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY));
    }

    private static Block flowerPot(Block potted) {
        return new FlowerPotBlock(potted, BlockBehaviour.Properties.of().instabreak().noOcclusion().pushReaction(PushReaction.DESTROY));
    }

    private static LeafPileBlock leafPile(MapColor pColor) {
        return new LeafPileBlock(BlockBehaviour.Properties.of().mapColor(pColor).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY));
    }

    public static Block leafPile2(MapColor color) {
        return new PeachPetalsBlock(BlockBehaviour.Properties.of().mapColor(color).noCollission().sound(SoundType.PINK_PETALS).pushReaction(PushReaction.DESTROY));
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
