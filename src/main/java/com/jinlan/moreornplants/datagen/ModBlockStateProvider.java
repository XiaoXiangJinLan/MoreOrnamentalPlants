package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.FlowerBlocks.PeachPinkPetalsBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusLeafBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.PinkWeepingMeiPlantBlock;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.client.model.generators.VariantBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreOrnPlants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) ModBlocks.RED_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.RED_MEI_WOOD.get()),
                blockTexture(ModBlocks.RED_MEI_LOG.get()), blockTexture(ModBlocks.RED_MEI_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.WHITE_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.WHITE_MEI_WOOD.get()),
                blockTexture(ModBlocks.WHITE_MEI_LOG.get()), blockTexture(ModBlocks.WHITE_MEI_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.GREEN_CALYX_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GREEN_CALYX_MEI_WOOD.get()),
                blockTexture(ModBlocks.GREEN_CALYX_MEI_LOG.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DOUBLE_PINK_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DOUBLE_PINK_MEI_WOOD.get()),
                blockTexture(ModBlocks.DOUBLE_PINK_MEI_LOG.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CRABAPPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CRABAPPLE_WOOD.get()),
                blockTexture(ModBlocks.CRABAPPLE_LOG.get()), blockTexture(ModBlocks.CRABAPPLE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.APRICOT_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.APRICOT_WOOD.get()),
                blockTexture(ModBlocks.APRICOT_LOG.get()), blockTexture(ModBlocks.APRICOT_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.PEACH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PEACH_WOOD.get()),
                blockTexture(ModBlocks.PEACH_LOG.get()), blockTexture(ModBlocks.PEACH_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.PEAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PEAR_WOOD.get()),
                blockTexture(ModBlocks.PEAR_LOG.get()), blockTexture(ModBlocks.PEAR_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.PURPLE_LEAF_PLUM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.PURPLE_LEAF_PLUM_WOOD.get()),
                blockTexture(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.OSMANTHUS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.OSMANTHUS_WOOD.get()),
                blockTexture(ModBlocks.OSMANTHUS_LOG.get()), blockTexture(ModBlocks.OSMANTHUS_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.GINKGO_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GINKGO_WOOD.get()),
                blockTexture(ModBlocks.GINKGO_LOG.get()), blockTexture(ModBlocks.GINKGO_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CHINESE_PARASOL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CHINESE_PARASOL_WOOD.get()),
                blockTexture(ModBlocks.CHINESE_PARASOL_LOG.get()), blockTexture(ModBlocks.CHINESE_PARASOL_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.SWEETGUM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.SWEETGUM_WOOD.get()),
                blockTexture(ModBlocks.SWEETGUM_LOG.get()), blockTexture(ModBlocks.SWEETGUM_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CAMPHOR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CAMPHOR_WOOD.get()),
                blockTexture(ModBlocks.CAMPHOR_LOG.get()), blockTexture(ModBlocks.CAMPHOR_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DOVE_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DOVE_TREE_WOOD.get()),
                blockTexture(ModBlocks.DOVE_TREE_LOG.get()), blockTexture(ModBlocks.DOVE_TREE_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CHINABERRY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CHINABERRY_WOOD.get()),
                blockTexture(ModBlocks.CHINABERRY_LOG.get()), blockTexture(ModBlocks.CHINABERRY_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DESERT_POPLAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.DESERT_POPLAR_WOOD.get()),
                blockTexture(ModBlocks.DESERT_POPLAR_LOG.get()), blockTexture(ModBlocks.DESERT_POPLAR_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.CRAPE_MYRTLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.CRAPE_MYRTLE_WOOD.get()),
                blockTexture(ModBlocks.CRAPE_MYRTLE_LOG.get()), blockTexture(ModBlocks.CRAPE_MYRTLE_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RED_MEI_LOG.get()), blockTexture(ModBlocks.STRIPPED_RED_MEI_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_red_mei_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_RED_MEI_WOOD.get()), blockTexture(ModBlocks.STRIPPED_RED_MEI_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_RED_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WHITE_MEI_LOG.get()), blockTexture(ModBlocks.STRIPPED_WHITE_MEI_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_white_mei_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_WHITE_MEI_WOOD.get()), blockTexture(ModBlocks.STRIPPED_WHITE_MEI_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_WHITE_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get()), blockTexture(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_green_calyx_mei_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get()), blockTexture(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_double_pink_mei_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_LOG.get()), blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_crabapple_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CRABAPPLE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_APRICOT_LOG.get()), blockTexture(ModBlocks.STRIPPED_APRICOT_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_apricot_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_APRICOT_WOOD.get()), blockTexture(ModBlocks.STRIPPED_APRICOT_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_APRICOT_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PEACH_LOG.get()), blockTexture(ModBlocks.STRIPPED_PEACH_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_peach_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PEACH_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PEACH_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PEACH_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PEAR_LOG.get()), blockTexture(ModBlocks.STRIPPED_PEAR_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_pear_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PEAR_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PEAR_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PEAR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get()), blockTexture(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_purple_leaf_plum_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.get()), blockTexture(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_OSMANTHUS_LOG.get()), blockTexture(ModBlocks.STRIPPED_OSMANTHUS_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_osmanthus_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_OSMANTHUS_WOOD.get()), blockTexture(ModBlocks.STRIPPED_OSMANTHUS_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_OSMANTHUS_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GINKGO_LOG.get()), blockTexture(ModBlocks.STRIPPED_GINKGO_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_ginkgo_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_GINKGO_WOOD.get()), blockTexture(ModBlocks.STRIPPED_GINKGO_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_GINKGO_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get()), blockTexture(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_chinese_parasol_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SWEETGUM_LOG.get()), blockTexture(ModBlocks.STRIPPED_SWEETGUM_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_sweetgum_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_SWEETGUM_WOOD.get()), blockTexture(ModBlocks.STRIPPED_SWEETGUM_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_SWEETGUM_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CAMPHOR_LOG.get()), blockTexture(ModBlocks.STRIPPED_CAMPHOR_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_camphor_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CAMPHOR_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CAMPHOR_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CAMPHOR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DOVE_TREE_LOG.get()), blockTexture(ModBlocks.STRIPPED_DOVE_TREE_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_dove_tree_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DOVE_TREE_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DOVE_TREE_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_DOVE_TREE_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CHINABERRY_LOG.get()), blockTexture(ModBlocks.STRIPPED_CHINABERRY_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_chinaberry_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_CHINABERRY_WOOD.get()), blockTexture(ModBlocks.STRIPPED_CHINABERRY_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_CHINABERRY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get()), blockTexture(ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get()), new ResourceLocation(MoreOrnPlants.MOD_ID, "block/stripped_desert_poplar_log_top"));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DESERT_POPLAR_WOOD.get()), blockTexture(ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get()));

        blockItem(ModBlocks.RED_MEI_LOG);
        blockItem(ModBlocks.RED_MEI_WOOD);
        blockItem(ModBlocks.STRIPPED_RED_MEI_LOG);
        blockItem(ModBlocks.STRIPPED_RED_MEI_WOOD);
        blockItem(ModBlocks.WHITE_MEI_LOG);
        blockItem(ModBlocks.WHITE_MEI_WOOD);
        blockItem(ModBlocks.STRIPPED_WHITE_MEI_LOG);
        blockItem(ModBlocks.STRIPPED_WHITE_MEI_WOOD);
        blockItem(ModBlocks.GREEN_CALYX_MEI_LOG);
        blockItem(ModBlocks.GREEN_CALYX_MEI_WOOD);
        blockItem(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG);
        blockItem(ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD);
        blockItem(ModBlocks.DOUBLE_PINK_MEI_LOG);
        blockItem(ModBlocks.DOUBLE_PINK_MEI_WOOD);
        blockItem(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG);
        blockItem(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD);
        blockItem(ModBlocks.CRABAPPLE_LOG);
        blockItem(ModBlocks.CRABAPPLE_WOOD);
        blockItem(ModBlocks.STRIPPED_CRABAPPLE_LOG);
        blockItem(ModBlocks.STRIPPED_CRABAPPLE_WOOD);
        blockItem(ModBlocks.APRICOT_LOG);
        blockItem(ModBlocks.APRICOT_WOOD);
        blockItem(ModBlocks.STRIPPED_APRICOT_LOG);
        blockItem(ModBlocks.STRIPPED_APRICOT_WOOD);
        blockItem(ModBlocks.PEACH_LOG);
        blockItem(ModBlocks.PEACH_WOOD);
        blockItem(ModBlocks.STRIPPED_PEACH_LOG);
        blockItem(ModBlocks.STRIPPED_PEACH_WOOD);
        blockItem(ModBlocks.PEAR_LOG);
        blockItem(ModBlocks.PEAR_WOOD);
        blockItem(ModBlocks.STRIPPED_PEAR_LOG);
        blockItem(ModBlocks.STRIPPED_PEAR_WOOD);
        blockItem(ModBlocks.PURPLE_LEAF_PLUM_LOG);
        blockItem(ModBlocks.PURPLE_LEAF_PLUM_WOOD);
        blockItem(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG);
        blockItem(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD);
        blockItem(ModBlocks.OSMANTHUS_LOG);
        blockItem(ModBlocks.OSMANTHUS_WOOD);
        blockItem(ModBlocks.STRIPPED_OSMANTHUS_LOG);
        blockItem(ModBlocks.STRIPPED_OSMANTHUS_WOOD);
        blockItem(ModBlocks.GINKGO_LOG);
        blockItem(ModBlocks.GINKGO_WOOD);
        blockItem(ModBlocks.STRIPPED_GINKGO_LOG);
        blockItem(ModBlocks.STRIPPED_GINKGO_WOOD);
        blockItem(ModBlocks.CHINESE_PARASOL_LOG);
        blockItem(ModBlocks.CHINESE_PARASOL_WOOD);
        blockItem(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG);
        blockItem(ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD);
        blockItem(ModBlocks.SWEETGUM_LOG);
        blockItem(ModBlocks.SWEETGUM_WOOD);
        blockItem(ModBlocks.STRIPPED_SWEETGUM_LOG);
        blockItem(ModBlocks.STRIPPED_SWEETGUM_WOOD);
        blockItem(ModBlocks.CAMPHOR_LOG);
        blockItem(ModBlocks.CAMPHOR_WOOD);
        blockItem(ModBlocks.STRIPPED_CAMPHOR_LOG);
        blockItem(ModBlocks.STRIPPED_CAMPHOR_WOOD);
        blockItem(ModBlocks.DOVE_TREE_LOG);
        blockItem(ModBlocks.DOVE_TREE_WOOD);
        blockItem(ModBlocks.STRIPPED_DOVE_TREE_LOG);
        blockItem(ModBlocks.STRIPPED_DOVE_TREE_WOOD);
        blockItem(ModBlocks.CHINABERRY_LOG);
        blockItem(ModBlocks.CHINABERRY_WOOD);
        blockItem(ModBlocks.STRIPPED_CHINABERRY_LOG);
        blockItem(ModBlocks.STRIPPED_CHINABERRY_WOOD);
        blockItem(ModBlocks.DESERT_POPLAR_LOG);
        blockItem(ModBlocks.DESERT_POPLAR_WOOD);
        blockItem(ModBlocks.STRIPPED_DESERT_POPLAR_LOG);
        blockItem(ModBlocks.STRIPPED_DESERT_POPLAR_WOOD);
        blockItem(ModBlocks.CRAPE_MYRTLE_LOG);
        blockItem(ModBlocks.CRAPE_MYRTLE_WOOD);

        blockwithItem(ModBlocks.RED_MEI_PLANKS);
        blockwithItem(ModBlocks.WHITE_MEI_PLANKS);
        blockwithItem(ModBlocks.GREEN_CALYX_MEI_PLANKS);
        blockwithItem(ModBlocks.DOUBLE_PINK_MEI_PLANKS);
        blockwithItem(ModBlocks.CRABAPPLE_PLANKS);
        blockwithItem(ModBlocks.APRICOT_PLANKS);
        blockwithItem(ModBlocks.PEACH_PLANKS);
        blockwithItem(ModBlocks.PEAR_PLANKS);
        blockwithItem(ModBlocks.PURPLE_LEAF_PLUM_PLANKS);
        blockwithItem(ModBlocks.OSMANTHUS_PLANKS);
        blockwithItem(ModBlocks.GINKGO_PLANKS);
        blockwithItem(ModBlocks.CHINESE_PARASOL_PLANKS);
        blockwithItem(ModBlocks.SWEETGUM_PLANKS);
        blockwithItem(ModBlocks.CAMPHOR_PLANKS);
        blockwithItem(ModBlocks.DOVE_TREE_PLANKS);
        blockwithItem(ModBlocks.CHINABERRY_PLANKS);
        blockwithItem(ModBlocks.DESERT_POPLAR_PLANKS);

        stairsBlock(((StairBlock) ModBlocks.RED_MEI_STAIRS.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.WHITE_MEI_STAIRS.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.GREEN_CALYX_MEI_STAIRS.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.DOUBLE_PINK_MEI_STAIRS.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.CRABAPPLE_STAIRS.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.APRICOT_STAIRS.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.PEACH_STAIRS.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.PEAR_STAIRS.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.PURPLE_LEAF_PLUM_STAIRS.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.OSMANTHUS_STAIRS.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.GINKGO_STAIRS.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.CHINESE_PARASOL_STAIRS.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.SWEETGUM_STAIRS.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.CAMPHOR_STAIRS.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.DOVE_TREE_STAIRS.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.CHINABERRY_STAIRS.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()));
        stairsBlock(((StairBlock) ModBlocks.DESERT_POPLAR_STAIRS.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()));

        slabBlock(((SlabBlock) ModBlocks.RED_MEI_SLAB.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.WHITE_MEI_SLAB.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GREEN_CALYX_MEI_SLAB.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.DOUBLE_PINK_MEI_SLAB.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CRABAPPLE_SLAB.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.APRICOT_SLAB.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PEACH_SLAB.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PEAR_SLAB.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.PURPLE_LEAF_PLUM_SLAB.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.OSMANTHUS_SLAB.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GINKGO_SLAB.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHINESE_PARASOL_SLAB.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.SWEETGUM_SLAB.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CAMPHOR_SLAB.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.DOVE_TREE_SLAB.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CHINABERRY_SLAB.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.DESERT_POPLAR_SLAB.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.RED_MEI_BUTTON.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.WHITE_MEI_BUTTON.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.GREEN_CALYX_MEI_BUTTON.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.DOUBLE_PINK_MEI_BUTTON.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CRABAPPLE_BUTTON.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.APRICOT_BUTTON.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.PEACH_BUTTON.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.PEAR_BUTTON.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.PURPLE_LEAF_PLUM_BUTTON.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.OSMANTHUS_BUTTON.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.GINKGO_BUTTON.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CHINESE_PARASOL_BUTTON.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.SWEETGUM_BUTTON.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CAMPHOR_BUTTON.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.DOVE_TREE_BUTTON.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.CHINABERRY_BUTTON.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.DESERT_POPLAR_BUTTON.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()));

        pressurePlateBlock(((PressurePlateBlock) ModBlocks.RED_MEI_PRESSURE_PLATE.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.WHITE_MEI_PRESSURE_PLATE.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GREEN_CALYX_MEI_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DOUBLE_PINK_MEI_PRESSURE_PLATE.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CRABAPPLE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.APRICOT_PRESSURE_PLATE.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PEACH_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PEAR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PURPLE_LEAF_PLUM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.OSMANTHUS_PRESSURE_PLATE.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GINKGO_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CHINESE_PARASOL_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SWEETGUM_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CAMPHOR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DOVE_TREE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.CHINABERRY_PRESSURE_PLATE.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DESERT_POPLAR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.RED_MEI_FENCE.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.WHITE_MEI_FENCE.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.GREEN_CALYX_MEI_FENCE.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.DOUBLE_PINK_MEI_FENCE.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CRABAPPLE_FENCE.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.APRICOT_FENCE.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.PEACH_FENCE.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.PEAR_FENCE.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.PURPLE_LEAF_PLUM_FENCE.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.OSMANTHUS_FENCE.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.GINKGO_FENCE.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CHINESE_PARASOL_FENCE.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.SWEETGUM_FENCE.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CAMPHOR_FENCE.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.DOVE_TREE_FENCE.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.CHINABERRY_FENCE.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.DESERT_POPLAR_FENCE.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()));

        fenceGateBlock(((FenceGateBlock) ModBlocks.RED_MEI_FENCE_GATE.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.WHITE_MEI_FENCE_GATE.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.GREEN_CALYX_MEI_FENCE_GATE.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CRABAPPLE_FENCE_GATE.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.APRICOT_FENCE_GATE.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PEACH_FENCE_GATE.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PEAR_FENCE_GATE.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.OSMANTHUS_FENCE_GATE.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.GINKGO_FENCE_GATE.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CHINESE_PARASOL_FENCE_GATE.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SWEETGUM_FENCE_GATE.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CAMPHOR_FENCE_GATE.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.DOVE_TREE_FENCE_GATE.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.CHINABERRY_FENCE_GATE.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.DESERT_POPLAR_FENCE_GATE.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.RED_MEI_DOOR.get()), modLoc("block/red_mei_door_bottom"), modLoc("block/red_mei_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.WHITE_MEI_DOOR.get()), modLoc("block/white_mei_door_bottom"), modLoc("block/white_mei_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.GREEN_CALYX_MEI_DOOR.get()), modLoc("block/green_calyx_mei_door_bottom"), modLoc("block/green_calyx_mei_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.DOUBLE_PINK_MEI_DOOR.get()), modLoc("block/double_pink_mei_door_bottom"), modLoc("block/double_pink_mei_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CRABAPPLE_DOOR.get()), modLoc("block/crabapple_door_bottom"), modLoc("block/crabapple_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.APRICOT_DOOR.get()), modLoc("block/apricot_door_bottom"), modLoc("block/apricot_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.PEACH_DOOR.get()), modLoc("block/peach_door_bottom"), modLoc("block/peach_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.PEAR_DOOR.get()), modLoc("block/pear_door_bottom"), modLoc("block/pear_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.PURPLE_LEAF_PLUM_DOOR.get()), modLoc("block/purple_leaf_plum_door_bottom"), modLoc("block/purple_leaf_plum_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.OSMANTHUS_DOOR.get()), modLoc("block/osmanthus_door_bottom"), modLoc("block/osmanthus_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.GINKGO_DOOR.get()), modLoc("block/ginkgo_door_bottom"), modLoc("block/ginkgo_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CHINESE_PARASOL_DOOR.get()), modLoc("block/chinese_parasol_door_bottom"), modLoc("block/chinese_parasol_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.SWEETGUM_DOOR.get()), modLoc("block/sweetgum_door_bottom"), modLoc("block/sweetgum_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CAMPHOR_DOOR.get()), modLoc("block/camphor_door_bottom"), modLoc("block/camphor_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.DOVE_TREE_DOOR.get()), modLoc("block/dove_tree_door_bottom"), modLoc("block/dove_tree_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.CHINABERRY_DOOR.get()), modLoc("block/chinaberry_door_bottom"), modLoc("block/chinaberry_door_top"), "cutout");
        doorBlockWithRenderType(((DoorBlock) ModBlocks.DESERT_POPLAR_DOOR.get()), modLoc("block/desert_poplar_door_bottom"), modLoc("block/desert_poplar_door_top"), "cutout");

        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.RED_MEI_TRAPDOOR.get()), modLoc("block/red_mei_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.WHITE_MEI_TRAPDOOR.get()), modLoc("block/white_mei_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.GREEN_CALYX_MEI_TRAPDOOR.get()), modLoc("block/green_calyx_mei_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.DOUBLE_PINK_MEI_TRAPDOOR.get()), modLoc("block/double_pink_mei_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CRABAPPLE_TRAPDOOR.get()), modLoc("block/crabapple_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.APRICOT_TRAPDOOR.get()), modLoc("block/apricot_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PEACH_TRAPDOOR.get()), modLoc("block/peach_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PEAR_TRAPDOOR.get()), modLoc("block/pear_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.PURPLE_LEAF_PLUM_TRAPDOOR.get()), modLoc("block/purple_leaf_plum_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.OSMANTHUS_TRAPDOOR.get()), modLoc("block/osmanthus_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.GINKGO_TRAPDOOR.get()), modLoc("block/ginkgo_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CHINESE_PARASOL_TRAPDOOR.get()), modLoc("block/chinese_parasol_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.SWEETGUM_TRAPDOOR.get()), modLoc("block/sweetgum_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CAMPHOR_TRAPDOOR.get()), modLoc("block/camphor_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.DOVE_TREE_TRAPDOOR.get()), modLoc("block/dove_tree_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.CHINABERRY_TRAPDOOR.get()), modLoc("block/chinaberry_trapdoor"), true, "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.DESERT_POPLAR_TRAPDOOR.get()), modLoc("block/desert_poplar_trapdoor"), true, "cutout");

        signBlock(((StandingSignBlock) ModBlocks.RED_MEI_SIGN.get()), ((WallSignBlock) ModBlocks.RED_MEI_WALL_SIGN.get()), blockTexture(ModBlocks.RED_MEI_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.WHITE_MEI_SIGN.get()), ((WallSignBlock) ModBlocks.WHITE_MEI_WALL_SIGN.get()), blockTexture(ModBlocks.WHITE_MEI_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.GREEN_CALYX_MEI_SIGN.get()), ((WallSignBlock) ModBlocks.GREEN_CALYX_MEI_WALL_SIGN.get()), blockTexture(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.DOUBLE_PINK_MEI_SIGN.get()), ((WallSignBlock) ModBlocks.DOUBLE_PINK_MEI_WALL_SIGN.get()), blockTexture(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.CRABAPPLE_SIGN.get()), ((WallSignBlock) ModBlocks.CRABAPPLE_WALL_SIGN.get()), blockTexture(ModBlocks.CRABAPPLE_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.APRICOT_SIGN.get()), ((WallSignBlock) ModBlocks.APRICOT_WALL_SIGN.get()), blockTexture(ModBlocks.APRICOT_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.PEACH_SIGN.get()), ((WallSignBlock) ModBlocks.PEACH_WALL_SIGN.get()), blockTexture(ModBlocks.PEACH_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.PEAR_SIGN.get()), ((WallSignBlock) ModBlocks.PEAR_WALL_SIGN.get()), blockTexture(ModBlocks.PEAR_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.PURPLE_LEAF_PLUM_SIGN.get()), ((WallSignBlock) ModBlocks.PURPLE_LEAF_PLUM_WALL_SIGN.get()), blockTexture(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.OSMANTHUS_SIGN.get()), ((WallSignBlock) ModBlocks.OSMANTHUS_WALL_SIGN.get()), blockTexture(ModBlocks.OSMANTHUS_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.GINKGO_SIGN.get()), ((WallSignBlock) ModBlocks.GINKGO_WALL_SIGN.get()), blockTexture(ModBlocks.GINKGO_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.CHINESE_PARASOL_SIGN.get()), ((WallSignBlock) ModBlocks.CHINESE_PARASOL_WALL_SIGN.get()), blockTexture(ModBlocks.CHINESE_PARASOL_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.SWEETGUM_SIGN.get()), ((WallSignBlock) ModBlocks.SWEETGUM_WALL_SIGN.get()), blockTexture(ModBlocks.SWEETGUM_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.CAMPHOR_SIGN.get()), ((WallSignBlock) ModBlocks.CAMPHOR_WALL_SIGN.get()), blockTexture(ModBlocks.CAMPHOR_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.DOVE_TREE_SIGN.get()), ((WallSignBlock) ModBlocks.DOVE_TREE_WALL_SIGN.get()), blockTexture(ModBlocks.DOVE_TREE_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.CHINABERRY_SIGN.get()), ((WallSignBlock) ModBlocks.CHINABERRY_WALL_SIGN.get()), blockTexture(ModBlocks.CHINABERRY_PLANKS.get()));
        signBlock(((StandingSignBlock) ModBlocks.DESERT_POPLAR_SIGN.get()), ((WallSignBlock) ModBlocks.DESERT_POPLAR_WALL_SIGN.get()), blockTexture(ModBlocks.DESERT_POPLAR_PLANKS.get()));

        hangingSignBlock(ModBlocks.RED_MEI_HANGING_SIGN.get(), ModBlocks.RED_MEI_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_RED_MEI_LOG.get()));
        hangingSignBlock(ModBlocks.WHITE_MEI_HANGING_SIGN.get(), ModBlocks.WHITE_MEI_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_WHITE_MEI_LOG.get()));
        hangingSignBlock(ModBlocks.GREEN_CALYX_MEI_HANGING_SIGN.get(), ModBlocks.GREEN_CALYX_MEI_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get()));
        hangingSignBlock(ModBlocks.DOUBLE_PINK_MEI_HANGING_SIGN.get(), ModBlocks.DOUBLE_PINK_MEI_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get()));
        hangingSignBlock(ModBlocks.CRABAPPLE_HANGING_SIGN.get(), ModBlocks.CRABAPPLE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_CRABAPPLE_LOG.get()));
        hangingSignBlock(ModBlocks.APRICOT_HANGING_SIGN.get(), ModBlocks.APRICOT_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_APRICOT_LOG.get()));
        hangingSignBlock(ModBlocks.PEACH_HANGING_SIGN.get(), ModBlocks.PEACH_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_PEACH_LOG.get()));
        hangingSignBlock(ModBlocks.PEAR_HANGING_SIGN.get(), ModBlocks.PEAR_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_PEAR_LOG.get()));
        hangingSignBlock(ModBlocks.PURPLE_LEAF_PLUM_HANGING_SIGN.get(), ModBlocks.PURPLE_LEAF_PLUM_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get()));
        hangingSignBlock(ModBlocks.OSMANTHUS_HANGING_SIGN.get(), ModBlocks.OSMANTHUS_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_OSMANTHUS_LOG.get()));
        hangingSignBlock(ModBlocks.GINKGO_HANGING_SIGN.get(), ModBlocks.GINKGO_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_GINKGO_LOG.get()));
        hangingSignBlock(ModBlocks.CHINESE_PARASOL_HANGING_SIGN.get(), ModBlocks.CHINESE_PARASOL_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get()));
        hangingSignBlock(ModBlocks.SWEETGUM_HANGING_SIGN.get(), ModBlocks.SWEETGUM_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_SWEETGUM_LOG.get()));
        hangingSignBlock(ModBlocks.CAMPHOR_HANGING_SIGN.get(), ModBlocks.CAMPHOR_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_CAMPHOR_LOG.get()));
        hangingSignBlock(ModBlocks.DOVE_TREE_HANGING_SIGN.get(), ModBlocks.DOVE_TREE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_DOVE_TREE_LOG.get()));
        hangingSignBlock(ModBlocks.CHINABERRY_HANGING_SIGN.get(), ModBlocks.CHINABERRY_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_CHINABERRY_LOG.get()));
        hangingSignBlock(ModBlocks.DESERT_POPLAR_HANGING_SIGN.get(), ModBlocks.DESERT_POPLAR_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get()));

        leavesBlock(ModBlocks.RED_MEI_LEAVES);
        saplingBlock(ModBlocks.RED_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_RED_MEI_SAPLING.get(), models().singleTexture("potted_red_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.RED_MEI_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.WHITE_MEI_LEAVES);
        saplingBlock(ModBlocks.WHITE_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_MEI_SAPLING.get(), models().singleTexture("potted_white_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_MEI_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.GREEN_CALYX_MEI_LEAVES);
        saplingBlock(ModBlocks.GREEN_CALYX_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_GREEN_CALYX_MEI_SAPLING.get(), models().singleTexture("potted_green_calyx_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GREEN_CALYX_MEI_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.DOUBLE_PINK_MEI_LEAVES);
        saplingBlock(ModBlocks.DOUBLE_PINK_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_DOUBLE_PINK_MEI_SAPLING.get(), models().singleTexture("potted_double_pink_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.VERSICOLOR_MEI_LEAVES);
        saplingBlock(ModBlocks.VERSICOLOR_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_VERSICOLOR_MEI_SAPLING.get(), models().singleTexture("potted_versicolor_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.VERSICOLOR_MEI_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.RED_WEEPING_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_RED_WEEPING_MEI_SAPLING.get(), models().singleTexture("potted_red_weeping_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.RED_WEEPING_MEI_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.WHITE_WEEPING_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_WEEPING_MEI_SAPLING.get(), models().singleTexture("potted_white_weeping_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.GREEN_WEEPING_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_GREEN_WEEPING_MEI_SAPLING.get(), models().singleTexture("potted_green_weeping_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GREEN_WEEPING_MEI_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.PINK_WEEPING_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_WEEPING_MEI_SAPLING.get(), models().singleTexture("potted_pink_weeping_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PINK_WEEPING_MEI_SAPLING.get())).renderType("cutout"));
        saplingBlock(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_VERSICOLOR_WEEPING_MEI_SAPLING.get(), models().singleTexture("potted_versicolor_weeping_mei_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES);
        saplingBlock(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_UPRIGHT_CRABAPPLE_SAPLING.get(), models().singleTexture("potted_upright_crabapple_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.WEEPING_CRABAPPLE_LEAVES);
        saplingBlock(ModBlocks.WEEPING_CRABAPPLE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_WEEPING_CRABAPPLE_SAPLING.get(), models().singleTexture("potted_weeping_crabapple_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WEEPING_CRABAPPLE_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.PINK_APRICOT_LEAVES);
        saplingBlock(ModBlocks.PINK_APRICOT_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_APRICOT_SAPLING.get(), models().singleTexture("potted_pink_apricot_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PINK_APRICOT_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.WHITE_APRICOT_LEAVES);
        saplingBlock(ModBlocks.WHITE_APRICOT_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_APRICOT_SAPLING.get(), models().singleTexture("potted_white_apricot_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_APRICOT_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.ORNAMENTAL_PEACH_LEAVES);
        saplingBlock(ModBlocks.ORNAMENTAL_PEACH_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_ORNAMENTAL_PEACH_SAPLING.get(), models().singleTexture("potted_ornamental_peach_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.WILD_PEACH_LEAVES);
        saplingBlock(ModBlocks.WILD_PEACH_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_WILD_PEACH_SAPLING.get(), models().singleTexture("potted_wild_peach_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WILD_PEACH_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.PEAR_LEAVES);
        saplingBlock(ModBlocks.PEAR_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_PEAR_SAPLING.get(), models().singleTexture("potted_pear_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PEAR_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES);
        saplingBlock(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get(), models().singleTexture("potted_flowering_purple_leaf_plum_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.PURPLE_LEAF_PLUM_LEAVES);
        saplingBlock(ModBlocks.PURPLE_LEAF_PLUM_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_LEAF_PLUM_SAPLING.get(), models().singleTexture("potted_purple_leaf_plum_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.GOLDEN_OSMANTHUS_LEAVES);
        saplingBlock(ModBlocks.GOLDEN_OSMANTHUS_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_GOLDEN_OSMANTHUS_SAPLING.get(), models().singleTexture("potted_golden_osmanthus_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.ORANGE_OSMANTHUS_LEAVES);
        saplingBlock(ModBlocks.ORANGE_OSMANTHUS_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_ORANGE_OSMANTHUS_SAPLING.get(), models().singleTexture("potted_orange_osmanthus_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.ORANGE_OSMANTHUS_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.WHITE_OSMANTHUS_LEAVES);
        saplingBlock(ModBlocks.WHITE_OSMANTHUS_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_OSMANTHUS_SAPLING.get(), models().singleTexture("potted_white_osmanthus_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_OSMANTHUS_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.GOLDEN_GINKGO_LEAVES);
        saplingBlock(ModBlocks.GOLDEN_GINKGO_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_GOLDEN_GINKGO_SAPLING.get(), models().singleTexture("potted_golden_ginkgo_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GOLDEN_GINKGO_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.GREEN_GINKGO_LEAVES);
        saplingBlock(ModBlocks.GREEN_GINKGO_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_GREEN_GINKGO_SAPLING.get(), models().singleTexture("potted_green_ginkgo_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GREEN_GINKGO_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES);
        saplingBlock(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_YELLOW_CHINESE_PARASOL_SAPLING.get(), models().singleTexture("potted_yellow_chinese_parasol_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.GREEN_CHINESE_PARASOL_LEAVES);
        saplingBlock(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_GREEN_CHINESE_PARASOL_SAPLING.get(), models().singleTexture("potted_green_chinese_parasol_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.SWEETGUM_LEAVES);
        saplingBlock(ModBlocks.SWEETGUM_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_SWEETGUM_SAPLING.get(), models().singleTexture("potted_sweetgum_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.SWEETGUM_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.CAMPHOR_LEAVES);
        leavesBlock(ModBlocks.NEW_CAMPHOR_LEAVES);
        saplingBlock(ModBlocks.CAMPHOR_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_CAMPHOR_SAPLING.get(), models().singleTexture("potted_camphor_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAMPHOR_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.DOVE_TREE_LEAVES);
        leavesBlock(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES);
        saplingBlock(ModBlocks.DOVE_TREE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_DOVE_TREE_SAPLING.get(), models().singleTexture("potted_dove_tree_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.DOVE_TREE_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.CHINABERRY_LEAVES);
        saplingBlock(ModBlocks.CHINABERRY_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_CHINABERRY_SAPLING.get(), models().singleTexture("potted_chinaberry_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CHINABERRY_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.DESERT_POPLAR_LEAVES);
        saplingBlock(ModBlocks.DESERT_POPLAR_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_DESERT_POPLAR_SAPLING.get(), models().singleTexture("potted_desert_poplar_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.DESERT_POPLAR_SAPLING.get())).renderType("cutout"));
        leavesBlock(ModBlocks.CRAPE_MYRTLE_LEAVES);
        saplingBlock(ModBlocks.CRAPE_MYRTLE_SAPLING);
        simpleBlockWithItem(ModBlocks.POTTED_CRAPE_MYRTLE_SAPLING.get(), models().singleTexture("potted_crape_myrtle_sapling", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CRAPE_MYRTLE_SAPLING.get())).renderType("cutout"));

        flowerBlock(ModBlocks.RED_WEEPING_MEI);
        weepingMeiPlantBlock(ModBlocks.RED_WEEPING_MEI_PLANT);
        flowerBlock(ModBlocks.WHITE_WEEPING_MEI);
        weepingMeiPlantBlock(ModBlocks.WHITE_WEEPING_MEI_PLANT);
        flowerBlock(ModBlocks.GREEN_WEEPING_MEI);
        weepingMeiPlantBlock(ModBlocks.GREEN_WEEPING_MEI_PLANT);
        flowerBlock(ModBlocks.PINK_WEEPING_MEI);
        weepingMeiPlantBlock(ModBlocks.PINK_WEEPING_MEI_PLANT);
        flowerBlock(ModBlocks.VERSICOLOR_WEEPING_MEI);
        weepingMeiPlantBlock(ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT);

        flowerBlock(ModBlocks.WEEPING_CRABAPPLE);

        flowerBlock(ModBlocks.CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_CHRYSANTHEMUM.get(), models().singleTexture("potted_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.GOLDEN_CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_GOLDEN_CHRYSANTHEMUM.get(), models().singleTexture("potted_golden_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GOLDEN_CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.GOLD_BACKED_SCARLET_MUM);
        simpleBlockWithItem(ModBlocks.POTTED_GOLD_BACKED_SCARLET_MUM.get(), models().singleTexture("potted_gold_backed_scarlet_mum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GOLD_BACKED_SCARLET_MUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.WHITE_CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_CHRYSANTHEMUM.get(), models().singleTexture("potted_white_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.GREEN_CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_GREEN_CHRYSANTHEMUM.get(), models().singleTexture("potted_green_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GREEN_CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PURPLE_CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_CHRYSANTHEMUM.get(), models().singleTexture("potted_purple_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PURPLE_CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_VIOLET_PINK_CHRYSANTHEMUM.get(), models().singleTexture("potted_violet_pink_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PINK_CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_CHRYSANTHEMUM.get(), models().singleTexture("potted_pink_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PINK_CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM);
        simpleBlockWithItem(ModBlocks.POTTED_LIGHT_PINK_CHRYSANTHEMUM.get(), models().singleTexture("potted_light_pink_chrysanthemum", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.SPRING_CYMBIDIUM);
        simpleBlockWithItem(ModBlocks.POTTED_SPRING_CYMBIDIUM.get(), models().singleTexture("potted_spring_cymbidium", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.SPRING_CYMBIDIUM.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_PEONY.get(), models().singleTexture("potted_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.LIGHT_PINK_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_LIGHT_PINK_PEONY.get(), models().singleTexture("potted_light_pink_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.LIGHT_PINK_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.VIOLET_PINK_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_VIOLET_PINK_PEONY.get(), models().singleTexture("potted_violet_pink_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.VIOLET_PINK_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PINK_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_PEONY.get(), models().singleTexture("potted_pink_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PINK_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.RED_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_RED_PEONY.get(), models().singleTexture("potted_red_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.RED_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.LIGHT_RED_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_LIGHT_RED_PEONY.get(), models().singleTexture("potted_light_red_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.LIGHT_RED_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.INK_RED_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_INK_RED_PEONY.get(), models().singleTexture("potted_ink_red_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.INK_RED_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.VERMILION_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_VERMILION_PEONY.get(), models().singleTexture("potted_vermilion_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.VERMILION_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PURPLE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_PEONY.get(), models().singleTexture("potted_purple_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PURPLE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.LIGHT_PURPLE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_LIGHT_PURPLE_PEONY.get(), models().singleTexture("potted_light_purple_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.LIGHT_PURPLE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.INK_PURPLE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_INK_PURPLE_PEONY.get(), models().singleTexture("potted_ink_purple_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.INK_PURPLE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.VIOLET_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_VIOLET_PEONY.get(), models().singleTexture("potted_violet_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.VIOLET_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.YELLOW_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_YELLOW_PEONY.get(), models().singleTexture("potted_yellow_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.YELLOW_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.LIGHT_YELLOW_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_LIGHT_YELLOW_PEONY.get(), models().singleTexture("potted_light_yellow_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.LIGHT_YELLOW_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.OCHRE_YELLOW_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_OCHRE_YELLOW_PEONY.get(), models().singleTexture("potted_ochre_yellow_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.OCHRE_YELLOW_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.GOLDEN_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_GOLDEN_PEONY.get(), models().singleTexture("potted_golden_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GOLDEN_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.WHITE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_PEONY.get(), models().singleTexture("potted_white_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.INK_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_INK_PEONY.get(), models().singleTexture("potted_ink_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.INK_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.BLUE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_BLUE_PEONY.get(), models().singleTexture("potted_blue_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.BLUE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.GREEN_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_GREEN_PEONY.get(), models().singleTexture("potted_green_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GREEN_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.COLORFUL_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_COLORFUL_PEONY.get(), models().singleTexture("potted_colorful_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.COLORFUL_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.LIGHT_COLORFUL_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_LIGHT_COLORFUL_PEONY.get(), models().singleTexture("potted_light_colorful_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.LIGHT_COLORFUL_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.INK_COLORFUL_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_INK_COLORFUL_PEONY.get(), models().singleTexture("potted_ink_colorful_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.INK_COLORFUL_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.RED_WHITE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_RED_WHITE_PEONY.get(), models().singleTexture("potted_red_white_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.RED_WHITE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PINK_WHITE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_WHITE_PEONY.get(), models().singleTexture("potted_pink_white_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PINK_WHITE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.YELLOW_WHITE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_YELLOW_WHITE_PEONY.get(), models().singleTexture("potted_yellow_white_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.YELLOW_WHITE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PURPLE_WHITE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_PURPLE_WHITE_PEONY.get(), models().singleTexture("potted_purple_white_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PURPLE_WHITE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.WU_HUA_LONG_YU_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_WU_HUA_LONG_YU_PEONY.get(), models().singleTexture("potted_wu_hua_long_yu_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WU_HUA_LONG_YU_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.MAUVE_PEONY);
        simpleBlockWithItem(ModBlocks.POTTED_MAUVE_PEONY.get(), models().singleTexture("potted_mauve_peony", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.MAUVE_PEONY.get())).renderType("cutout"));
        flowerBlock(ModBlocks.CAMELLIA);
        simpleBlockWithItem(ModBlocks.POTTED_CAMELLIA.get(), models().singleTexture("potted_camellia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CAMELLIA.get())).renderType("cutout"));
        flowerBlock(ModBlocks.PINK_CAMELLIA);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_CAMELLIA.get(), models().singleTexture("potted_pink_camellia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PINK_CAMELLIA.get())).renderType("cutout"));
        flowerBlock(ModBlocks.WHITE_CAMELLIA);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_CAMELLIA.get(), models().singleTexture("potted_white_camellia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WHITE_CAMELLIA.get())).renderType("cutout"));
        flowerBlock(ModBlocks.VERSICOLOR_CAMELLIA);
        simpleBlockWithItem(ModBlocks.POTTED_VERSICOLOR_CAMELLIA.get(), models().singleTexture("potted_versicolor_camellia", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.VERSICOLOR_CAMELLIA.get())).renderType("cutout"));
        flowerBlock(ModBlocks.CRIMSON_AZALEA);
        simpleBlockWithItem(ModBlocks.POTTED_CRIMSON_AZALEA.get(), models().singleTexture("potted_crimson_azalea", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.CRIMSON_AZALEA.get())).renderType("cutout"));

        tallCrossBlock(ModBlocks.WINTERSWEET);
        tallCrossBlock(ModBlocks.TWO_QIAO_PEONY);
        tallCrossBlock(ModBlocks.VERSICOLOR_PEONY);
        tallCrossBlock(ModBlocks.CHINESE_ROSE);
        tallCrossBlock(ModBlocks.PINK_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.YELLOW_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.WHITE_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.RED_PINK_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.RED_YELLOW_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.RED_WHITE_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.PINK_WHITE_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.YELLOW_WHITE_CHINESE_ROSE);
        tallCrossBlock(ModBlocks.COTTON_ROSE);
        tallRotatedCrossBlock(ModBlocks.CRAPE_MYRTLE);

        flowerBlock(ModBlocks.WINTERSWEET_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_WINTERSWEET_BUSH.get(), models().singleTexture("potted_wintersweet_bush", new ResourceLocation("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.WINTERSWEET_BUSH.get())).renderType("cutout"));
        flowerBlock(ModBlocks.CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.PINK_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_pink_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_pink_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.YELLOW_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_YELLOW_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_yellow_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_yellow_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.WHITE_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_WHITE_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_white_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_white_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.RED_PINK_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_RED_PINK_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_red_pink_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_red_pink_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.RED_YELLOW_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_RED_YELLOW_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_red_yellow_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_red_yellow_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.RED_WHITE_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_RED_WHITE_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_red_white_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_red_white_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.PINK_WHITE_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_PINK_WHITE_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_pink_white_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_pink_white_chinese_rose_bush")).renderType("cutout"));
        flowerBlock(ModBlocks.YELLOW_WHITE_CHINESE_ROSE_BUSH);
        simpleBlockWithItem(ModBlocks.POTTED_YELLOW_WHITE_CHINESE_ROSE_BUSH.get(), models().singleTexture("potted_yellow_white_chinese_rose_bush", new ResourceLocation("flower_pot_cross"), "plant",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/potted_yellow_white_chinese_rose_bush")).renderType("cutout"));

        saplingBlock(ModBlocks.MOTTLED_BAMBOO_SAPLING, true);
        bambooModelsOnly(ModBlocks.MOTTLED_BAMBOO);
        pottedBambooBlock(ModBlocks.POTTED_MOTTLED_BAMBOO);
        saplingBlock(ModBlocks.BLACK_BAMBOO_SAPLING, true);
        bambooModelsOnly(ModBlocks.BLACK_BAMBOO);
        pottedBambooBlock(ModBlocks.POTTED_BLACK_BAMBOO);

        lotusBlock(ModBlocks.LOTUS);
        lotusBlock(ModBlocks.WHITE_LOTUS);
        lotusLeafBlock(ModBlocks.LOTUS_LEAF);

        peachPinkPetalsBlock(ModBlocks.PEACH_PINK_PETALS);
        leafPileBlock(ModBlocks.ORNAMENTAL_PEACH_PETALS);
        leafPileBlock(ModBlocks.WILD_PEACH_PETALS);
    }

    private void weepingMeiPlantBlock(RegistryObject<Block> blockRegistryObject) {
        String baseName = blockRegistryObject.getId().getPath();
        ModelFile normalModel = models().cross(blockRegistryObject.getId().getPath(),
                blockTexture(blockRegistryObject.get())).renderType("cutout");
        ModelFile topModel = models().cross(blockRegistryObject.getId().getPath() + "_top",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/" + baseName + "_2")).renderType("cutout");
        getVariantBuilder(blockRegistryObject.get())
                .partialState().with(PinkWeepingMeiPlantBlock.TOP, false)
                .modelForState().modelFile(normalModel).addModel()
                .partialState().with(PinkWeepingMeiPlantBlock.TOP, true)
                .modelForState().modelFile(topModel).addModel();
        simpleBlockItem(blockRegistryObject.get(), normalModel);
    }

    private void tallCrossBlock(RegistryObject<Block> blockRegistryObject) {
        String baseName = blockRegistryObject.getId().getPath();
        ResourceLocation bottomTexture = new ResourceLocation(MoreOrnPlants.MOD_ID, "block/" + baseName + "_bottom");
        ResourceLocation topTexture = new ResourceLocation(MoreOrnPlants.MOD_ID, "block/" + baseName + "_top");
        ModelFile bottomModel = models().cross(baseName + "_bottom", bottomTexture).renderType("cutout");
        ModelFile topModel = models().cross(baseName + "_top", topTexture).renderType("cutout");
        getVariantBuilder(blockRegistryObject.get())
                .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                .modelForState().modelFile(bottomModel).addModel()
                .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER)
                .modelForState().modelFile(topModel).addModel();
        simpleBlockItem(blockRegistryObject.get(), bottomModel);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject, boolean tinted) {
        if (tinted) {
            String baseName = blockRegistryObject.getId().getPath();
            String textureName = baseName.replace("_sapling", "_stage0");
            simpleBlock(blockRegistryObject.get(),
                    models().withExistingParent(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                                    new ResourceLocation("block/tinted_cross"))
                            .texture("cross", modLoc("block/" + textureName))
                            .renderType("cutout"));
        } else {
            simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),blockTexture(blockRegistryObject.get())).renderType("cutout"));
        }
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        saplingBlock(blockRegistryObject, false);
    }

    private void flowerBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    private void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(MoreOrnPlants.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockwithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void peachPinkPetalsBlock(RegistryObject<Block> blockRegistryObject) {
        ResourceLocation flowerbedTexture = modLoc("block/peach_pink_petals");
        ResourceLocation stemTexture = modLoc("block/peach_pink_petals_stem");
        ModelFile model1 = models().withExistingParent(blockRegistryObject.getId().getPath() + "_1", new ResourceLocation("block/flowerbed_1"))
                .texture("flowerbed", flowerbedTexture).texture("stem", stemTexture).renderType("cutout");
        ModelFile model2 = models().withExistingParent(blockRegistryObject.getId().getPath() + "_2", new ResourceLocation("block/flowerbed_2"))
                .texture("flowerbed", flowerbedTexture).texture("stem", stemTexture).renderType("cutout");
        ModelFile model3 = models().withExistingParent(blockRegistryObject.getId().getPath() + "_3", new ResourceLocation("block/flowerbed_3"))
                .texture("flowerbed", flowerbedTexture).texture("stem", stemTexture).renderType("cutout");
        ModelFile model4 = models().withExistingParent(blockRegistryObject.getId().getPath() + "_4", new ResourceLocation("block/flowerbed_4"))
                .texture("flowerbed", flowerbedTexture).texture("stem", stemTexture).renderType("cutout");
        MultiPartBlockStateBuilder builder = getMultipartBuilder(blockRegistryObject.get());
        for (Direction facing : Direction.Plane.HORIZONTAL) {
            int yRot = switch (facing) {
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };
            builder.part()
                    .modelFile(model1)
                    .rotationY(yRot)
                    .addModel()
                    .condition(PeachPinkPetalsBlock.FACING, facing)
                    .condition(PeachPinkPetalsBlock.AMOUNT, 1, 2, 3, 4);
            builder.part()
                    .modelFile(model2)
                    .rotationY(yRot)
                    .addModel()
                    .condition(PeachPinkPetalsBlock.FACING, facing)
                    .condition(PeachPinkPetalsBlock.AMOUNT, 2, 3, 4);
            builder.part()
                    .modelFile(model3)
                    .rotationY(yRot)
                    .addModel()
                    .condition(PeachPinkPetalsBlock.FACING, facing)
                    .condition(PeachPinkPetalsBlock.AMOUNT, 3, 4);
            builder.part()
                    .modelFile(model4)
                    .rotationY(yRot)
                    .addModel()
                    .condition(PeachPinkPetalsBlock.FACING, facing)
                    .condition(PeachPinkPetalsBlock.AMOUNT, 4);
        }
        simpleBlockItem(blockRegistryObject.get(), model4);
    }

    private void leafPileBlock(RegistryObject<Block> blockRegistryObject) {
        String baseName = blockRegistryObject.getId().getPath();
        String texturePath = "block/" + baseName;
        ModelFile model = models().withExistingParent(baseName, modLoc("block/leaf_pile"))
                .texture("leaf", modLoc(texturePath))
                .renderType("cutout");
        simpleBlock(blockRegistryObject.get(), model);
        simpleBlockItem(blockRegistryObject.get(), model);
    }

    private void bambooModelsOnly(RegistryObject<Block> blockRegistryObject) {
        String baseName = blockRegistryObject.getId().getPath();
        ResourceLocation stalkTexture = modLoc("block/" + baseName + "_stalk");
        for (int i = 1; i <= 4; i++) {
            models().getBuilder(baseName + i + "_age0")
                    .parent(new ModelFile.UncheckedModelFile("block/bamboo" + i + "_age0"))
                    .texture("all", stalkTexture);
            models().getBuilder(baseName + i + "_age1")
                    .parent(new ModelFile.UncheckedModelFile("block/bamboo" + i + "_age1"))
                    .texture("all", stalkTexture);
        }
        models().getBuilder(baseName + "_small_leaves")
                .parent(new ModelFile.UncheckedModelFile("block/bamboo_small_leaves"))
                .texture("texture", modLoc("block/" + baseName + "_small_leaves"))
                .texture("particle", modLoc("block/" + baseName + "_small_leaves"))
                .renderType("cutout");
        models().getBuilder(baseName + "_large_leaves")
                .parent(new ModelFile.UncheckedModelFile("block/bamboo_large_leaves"))
                .texture("texture", modLoc("block/" + baseName + "_large_leaves"))
                .texture("particle", modLoc("block/" + baseName + "_large_leaves"))
                .renderType("cutout");
        ModelFile itemModel = models().getBuilder(baseName)
                .parent(new ModelFile.UncheckedModelFile("item/generated"))
                .texture("layer0", stalkTexture);
        simpleBlockItem(blockRegistryObject.get(), itemModel);
    }

    private void pottedBambooBlock(RegistryObject<Block> pottedBlock) {
        String baseName = pottedBlock.getId().getPath();
        String bambooType = baseName.replace("potted_", "");
        ModelFile pottedModel = models().withExistingParent(baseName, new ResourceLocation("minecraft:block/potted_bamboo"))
                .texture("bamboo", modLoc("block/" + bambooType + "_stalk"))
                .texture("leaf", modLoc("block/" + bambooType + "_singleleaf"))
                .renderType("cutout");
        simpleBlockWithItem(pottedBlock.get(), pottedModel);
    }

    private void lotusBlock(RegistryObject<Block> blockRegistryObject) {
        String baseName = blockRegistryObject.getId().getPath();
        ModelFile bottomModel = models().cross(baseName + "_bottom",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/lotus_bottom")).renderType("cutout");
        for (int age = 0; age <= 3; age++) {
            String stemTexture = baseName + "_stem_age_" + age;
            String petalTexture = (age <= 1) ? baseName + "_petal_none" : baseName + "_petal";
            String petalSmallTexture;
            if (age == 0) {
                petalSmallTexture = baseName + "_petal_none";
            } else if (age == 1) {
                petalSmallTexture = baseName + "_petal";
            } else {
                petalSmallTexture = baseName + "_petal_small";
            }
            ModelFile topModel = models().withExistingParent(baseName + "_top_age" + age, modLoc("block/lotus_petals"))
                    .texture("petal", modLoc("block/" + petalTexture))
                    .texture("petal_small", modLoc("block/" + petalSmallTexture))
                    .texture("stem", modLoc("block/" + stemTexture))
                    .renderType("cutout");
            getVariantBuilder(blockRegistryObject.get())
                    .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER).with(WaterLotusBlock.AGE, age)
                    .modelForState().modelFile(bottomModel).addModel()
                    .partialState().with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER).with(WaterLotusBlock.AGE, age)
                    .modelForState().modelFile(topModel).addModel();
        }
        simpleBlockItem(blockRegistryObject.get(), bottomModel);
    }

    private void lotusLeafBlock(RegistryObject<Block> blockRegistryObject) {
        String baseName = blockRegistryObject.getId().getPath();
        ModelFile bottomModel = models().cross(baseName + "_bottom",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/lotus_bottom")).renderType("cutout");
        ModelFile topModel = models().withExistingParent(baseName + "_top", modLoc("block/lotus_leaf"))
                .texture("leaf", modLoc("block/" + baseName))
                .texture("stem", modLoc("block/" + baseName + "_stem"))
                .renderType("cutout");
        VariantBlockStateBuilder builder = getVariantBuilder(blockRegistryObject.get());
        builder.partialState()
                .with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                .modelForState().modelFile(bottomModel)
                .addModel();
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            int rotationY;
            switch (direction) {
                case WEST -> rotationY = 90;
                case NORTH -> rotationY = 180;
                case EAST -> rotationY = 270;
                default -> rotationY = 0;
            }
            builder.partialState()
                    .with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER)
                    .with(WaterLotusLeafBlock.FACING, direction)
                    .modelForState().modelFile(topModel).rotationY(rotationY)
                    .addModel();
        }
        simpleBlockItem(blockRegistryObject.get(), bottomModel);
    }

    private void tallRotatedCrossBlock(RegistryObject<Block> blockRegistryObject) {
        String baseName = blockRegistryObject.getId().getPath();
        ModelFile bottomModel = models().withExistingParent(baseName + "_bottom", modLoc("block/crape_myrtle"))
                .texture("cross", modLoc("block/" + baseName + "_bottom")).renderType("cutout");
        ModelFile topModel = models().withExistingParent(baseName + "_top", modLoc("block/crape_myrtle"))
                .texture("cross", modLoc("block/" + baseName + "_top")).renderType("cutout");
        VariantBlockStateBuilder builder = getVariantBuilder(blockRegistryObject.get());
        for (Direction direction : Direction.Plane.HORIZONTAL) {
            int rotationY;
            switch (direction) {
                case EAST -> rotationY = 90;
                case SOUTH -> rotationY = 180;
                case WEST -> rotationY = 270;
                default -> rotationY = 0;
            }
            builder.partialState()
                    .with(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                    .with(WaterLotusLeafBlock.FACING, direction)
                    .modelForState().modelFile(bottomModel).rotationY(rotationY)
                    .addModel();
            builder.partialState()
                    .with(DoublePlantBlock.HALF, DoubleBlockHalf.UPPER)
                    .with(WaterLotusLeafBlock.FACING, direction)
                    .modelForState().modelFile(topModel).rotationY(rotationY)
                    .addModel();
        }
        simpleBlockItem(blockRegistryObject.get(), bottomModel);
    }
}
