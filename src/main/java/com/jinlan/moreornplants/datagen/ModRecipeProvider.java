package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ForgeTags;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {
        planksFromLogs(pWriter, ModBlocks.RED_MEI_PLANKS.get(), ModTags.Items.RED_MEI_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.WHITE_MEI_PLANKS.get(), ModTags.Items.WHITE_MEI_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.GREEN_CALYX_MEI_PLANKS.get(), ModTags.Items.GREEN_CALYX_MEI_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.DOUBLE_PINK_MEI_PLANKS.get(), ModTags.Items.DOUBLE_PINK_MEI_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.CRABAPPLE_PLANKS.get(), ModTags.Items.CRABAPPLE_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.APRICOT_PLANKS.get(), ModTags.Items.APRICOT_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.PEACH_PLANKS.get(), ModTags.Items.PEACH_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.PEAR_PLANKS.get(), ModTags.Items.PEAR_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get(), ModTags.Items.PURPLE_LEAF_PLUM_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.OSMANTHUS_PLANKS.get(), ModTags.Items.OSMANTHUS_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.GINKGO_PLANKS.get(), ModTags.Items.GINKGO_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.CHINESE_PARASOL_PLANKS.get(), ModTags.Items.CHINESE_PARASOL_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.SWEETGUM_PLANKS.get(), ModTags.Items.SWEETGUM_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.CAMPHOR_PLANKS.get(), ModTags.Items.CAMPHOR_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.DOVE_TREE_PLANKS.get(), ModTags.Items.DOVE_TREE_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.CHINABERRY_PLANKS.get(), ModTags.Items.CHINABERRY_LOGS, 4);
        planksFromLogs(pWriter, ModBlocks.DESERT_POPLAR_PLANKS.get(), ModTags.Items.DESERT_POPLAR_LOGS, 4);

        woodFromLogs(pWriter, ModBlocks.RED_MEI_WOOD.get(), ModBlocks.RED_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.WHITE_MEI_WOOD.get(), ModBlocks.WHITE_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.GREEN_CALYX_MEI_WOOD.get(), ModBlocks.GREEN_CALYX_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.DOUBLE_PINK_MEI_WOOD.get(), ModBlocks.DOUBLE_PINK_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.CRABAPPLE_WOOD.get(), ModBlocks.CRABAPPLE_LOG.get());
        woodFromLogs(pWriter, ModBlocks.APRICOT_WOOD.get(), ModBlocks.APRICOT_LOG.get());
        woodFromLogs(pWriter, ModBlocks.PEACH_WOOD.get(), ModBlocks.PEACH_LOG.get());
        woodFromLogs(pWriter, ModBlocks.PEAR_WOOD.get(), ModBlocks.PEAR_LOG.get());
        woodFromLogs(pWriter, ModBlocks.PURPLE_LEAF_PLUM_WOOD.get(), ModBlocks.PURPLE_LEAF_PLUM_LOG.get());
        woodFromLogs(pWriter, ModBlocks.OSMANTHUS_WOOD.get(), ModBlocks.OSMANTHUS_LOG.get());
        woodFromLogs(pWriter, ModBlocks.GINKGO_WOOD.get(), ModBlocks.GINKGO_LOG.get());
        woodFromLogs(pWriter, ModBlocks.CHINESE_PARASOL_WOOD.get(), ModBlocks.CHINESE_PARASOL_LOG.get());
        woodFromLogs(pWriter, ModBlocks.SWEETGUM_WOOD.get(), ModBlocks.SWEETGUM_LOG.get());
        woodFromLogs(pWriter, ModBlocks.CAMPHOR_WOOD.get(), ModBlocks.CAMPHOR_LOG.get());
        woodFromLogs(pWriter, ModBlocks.DOVE_TREE_WOOD.get(), ModBlocks.DOVE_TREE_LOG.get());
        woodFromLogs(pWriter, ModBlocks.CHINABERRY_WOOD.get(), ModBlocks.CHINABERRY_LOG.get());
        woodFromLogs(pWriter, ModBlocks.DESERT_POPLAR_WOOD.get(), ModBlocks.DESERT_POPLAR_LOG.get());
        woodFromLogs(pWriter, ModBlocks.CRAPE_MYRTLE_WOOD.get(), ModBlocks.CRAPE_MYRTLE_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_RED_MEI_WOOD.get(), ModBlocks.STRIPPED_RED_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_WHITE_MEI_WOOD.get(), ModBlocks.STRIPPED_WHITE_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.get(), ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.get(), ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_CRABAPPLE_WOOD.get(), ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_APRICOT_WOOD.get(), ModBlocks.STRIPPED_APRICOT_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_PEACH_WOOD.get(), ModBlocks.STRIPPED_PEACH_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_PEAR_WOOD.get(), ModBlocks.STRIPPED_PEAR_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.get(), ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_OSMANTHUS_WOOD.get(), ModBlocks.STRIPPED_OSMANTHUS_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_GINKGO_WOOD.get(), ModBlocks.STRIPPED_GINKGO_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.get(), ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_SWEETGUM_WOOD.get(), ModBlocks.STRIPPED_SWEETGUM_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_CAMPHOR_WOOD.get(), ModBlocks.STRIPPED_CAMPHOR_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_DOVE_TREE_WOOD.get(), ModBlocks.STRIPPED_DOVE_TREE_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_CHINABERRY_WOOD.get(), ModBlocks.STRIPPED_CHINABERRY_LOG.get());
        woodFromLogs(pWriter, ModBlocks.STRIPPED_DESERT_POPLAR_WOOD.get(), ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get());

        stairBuilder(ModBlocks.RED_MEI_STAIRS.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.WHITE_MEI_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.GREEN_CALYX_MEI_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.DOUBLE_PINK_MEI_STAIRS.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.CRABAPPLE_STAIRS.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.APRICOT_STAIRS.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.PEACH_STAIRS.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.PEAR_STAIRS.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.PURPLE_LEAF_PLUM_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.OSMANTHUS_STAIRS.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.GINKGO_STAIRS.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.CHINESE_PARASOL_STAIRS.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.SWEETGUM_STAIRS.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.CAMPHOR_STAIRS.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.DOVE_TREE_STAIRS.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.CHINABERRY_STAIRS.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        stairBuilder(ModBlocks.DESERT_POPLAR_STAIRS.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_MEI_SLAB.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MEI_SLAB.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CALYX_MEI_SLAB.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_PINK_MEI_SLAB.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRABAPPLE_SLAB.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APRICOT_SLAB.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_SLAB.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_SLAB.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_LEAF_PLUM_SLAB.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OSMANTHUS_SLAB.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GINKGO_SLAB.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHINESE_PARASOL_SLAB.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SWEETGUM_SLAB.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAMPHOR_SLAB.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOVE_TREE_SLAB.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHINABERRY_SLAB.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_POPLAR_SLAB.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        doorBuilder(ModBlocks.RED_MEI_DOOR.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.WHITE_MEI_DOOR.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.GREEN_CALYX_MEI_DOOR.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.DOUBLE_PINK_MEI_DOOR.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.CRABAPPLE_DOOR.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.APRICOT_DOOR.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.PEACH_DOOR.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.PEAR_DOOR.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.PURPLE_LEAF_PLUM_DOOR.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.OSMANTHUS_DOOR.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.GINKGO_DOOR.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.CHINESE_PARASOL_DOOR.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.SWEETGUM_DOOR.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.CAMPHOR_DOOR.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.DOVE_TREE_DOOR.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.CHINABERRY_DOOR.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        doorBuilder(ModBlocks.DESERT_POPLAR_DOOR.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        trapdoorBuilder(ModBlocks.RED_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.WHITE_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.GREEN_CALYX_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.DOUBLE_PINK_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.CRABAPPLE_TRAPDOOR.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.APRICOT_TRAPDOOR.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.PEACH_TRAPDOOR.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.PEAR_TRAPDOOR.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.PURPLE_LEAF_PLUM_TRAPDOOR.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.OSMANTHUS_TRAPDOOR.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.GINKGO_TRAPDOOR.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.CHINESE_PARASOL_TRAPDOOR.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.SWEETGUM_TRAPDOOR.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.CAMPHOR_TRAPDOOR.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.DOVE_TREE_TRAPDOOR.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.CHINABERRY_TRAPDOOR.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        trapdoorBuilder(ModBlocks.DESERT_POPLAR_TRAPDOOR.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        fenceBuilder(ModBlocks.RED_MEI_FENCE.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.WHITE_MEI_FENCE.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.GREEN_CALYX_MEI_FENCE.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.DOUBLE_PINK_MEI_FENCE.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.CRABAPPLE_FENCE.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.APRICOT_FENCE.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.PEACH_FENCE.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.PEAR_FENCE.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.PURPLE_LEAF_PLUM_FENCE.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.OSMANTHUS_FENCE.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.GINKGO_FENCE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.CHINESE_PARASOL_FENCE.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.SWEETGUM_FENCE.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.CAMPHOR_FENCE.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.DOVE_TREE_FENCE.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.CHINABERRY_FENCE.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        fenceBuilder(ModBlocks.DESERT_POPLAR_FENCE.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        fenceGateBuilder(ModBlocks.RED_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.WHITE_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.GREEN_CALYX_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.CRABAPPLE_FENCE_GATE.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.APRICOT_FENCE_GATE.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.PEACH_FENCE_GATE.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.PEAR_FENCE_GATE.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.OSMANTHUS_FENCE_GATE.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.GINKGO_FENCE_GATE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.CHINESE_PARASOL_FENCE_GATE.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.SWEETGUM_FENCE_GATE.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.CAMPHOR_FENCE_GATE.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.DOVE_TREE_FENCE_GATE.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.CHINABERRY_FENCE_GATE.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        fenceGateBuilder(ModBlocks.DESERT_POPLAR_FENCE_GATE.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        buttonBuilder(ModBlocks.RED_MEI_BUTTON.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.WHITE_MEI_BUTTON.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.GREEN_CALYX_MEI_BUTTON.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.DOUBLE_PINK_MEI_BUTTON.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.CRABAPPLE_BUTTON.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.APRICOT_BUTTON.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.PEACH_BUTTON.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.PEAR_BUTTON.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.PURPLE_LEAF_PLUM_BUTTON.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.OSMANTHUS_BUTTON.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.GINKGO_BUTTON.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.CHINESE_PARASOL_BUTTON.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.SWEETGUM_BUTTON.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.CAMPHOR_BUTTON.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.DOVE_TREE_BUTTON.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.CHINABERRY_BUTTON.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        buttonBuilder(ModBlocks.DESERT_POPLAR_BUTTON.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.RED_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.WHITE_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.GREEN_CALYX_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.DOUBLE_PINK_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CRABAPPLE_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.APRICOT_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.PEACH_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.PEAR_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.PURPLE_LEAF_PLUM_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.OSMANTHUS_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.GINKGO_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CHINESE_PARASOL_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.SWEETGUM_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CAMPHOR_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.DOVE_TREE_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CHINABERRY_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.DESERT_POPLAR_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        signBuilder(ModItems.RED_MEI_SIGN.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.WHITE_MEI_SIGN.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.GREEN_CALYX_MEI_SIGN.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.DOUBLE_PINK_MEI_SIGN.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.CRABAPPLE_SIGN.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.APRICOT_SIGN.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.PEACH_SIGN.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.PEAR_SIGN.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.PURPLE_LEAF_PLUM_SIGN.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.OSMANTHUS_SIGN.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.GINKGO_SIGN.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.CHINESE_PARASOL_SIGN.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.SWEETGUM_SIGN.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.CAMPHOR_SIGN.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.DOVE_TREE_SIGN.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.CHINABERRY_SIGN.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(pWriter);
        signBuilder(ModItems.DESERT_POPLAR_SIGN.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(pWriter);

        hangingSign(pWriter, ModItems.RED_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_RED_MEI_LOG.get());
        hangingSign(pWriter, ModItems.WHITE_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_WHITE_MEI_LOG.get());
        hangingSign(pWriter, ModItems.GREEN_CALYX_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get());
        hangingSign(pWriter, ModItems.DOUBLE_PINK_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get());
        hangingSign(pWriter, ModItems.CRABAPPLE_HANGING_SIGN.get(), ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        hangingSign(pWriter, ModItems.APRICOT_HANGING_SIGN.get(), ModBlocks.STRIPPED_APRICOT_LOG.get());
        hangingSign(pWriter, ModItems.PEACH_HANGING_SIGN.get(), ModBlocks.STRIPPED_PEACH_LOG.get());
        hangingSign(pWriter, ModItems.PEAR_HANGING_SIGN.get(), ModBlocks.STRIPPED_PEAR_LOG.get());
        hangingSign(pWriter, ModItems.PURPLE_LEAF_PLUM_HANGING_SIGN.get(), ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get());
        hangingSign(pWriter, ModItems.OSMANTHUS_HANGING_SIGN.get(), ModBlocks.STRIPPED_OSMANTHUS_LOG.get());
        hangingSign(pWriter, ModItems.GINKGO_HANGING_SIGN.get(), ModBlocks.STRIPPED_GINKGO_LOG.get());
        hangingSign(pWriter, ModItems.CHINESE_PARASOL_HANGING_SIGN.get(), ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get());
        hangingSign(pWriter, ModItems.SWEETGUM_HANGING_SIGN.get(), ModBlocks.STRIPPED_SWEETGUM_LOG.get());
        hangingSign(pWriter, ModItems.CAMPHOR_HANGING_SIGN.get(), ModBlocks.STRIPPED_CAMPHOR_LOG.get());
        hangingSign(pWriter, ModItems.DOVE_TREE_HANGING_SIGN.get(), ModBlocks.STRIPPED_DOVE_TREE_LOG.get());
        hangingSign(pWriter, ModItems.CHINABERRY_HANGING_SIGN.get(), ModBlocks.STRIPPED_CHINABERRY_LOG.get());
        hangingSign(pWriter, ModItems.DESERT_POPLAR_HANGING_SIGN.get(), ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get());

        woodenBoat(pWriter, ModItems.RED_MEI_BOAT.get(), ModBlocks.RED_MEI_PLANKS.get());
        woodenBoat(pWriter, ModItems.WHITE_MEI_BOAT.get(), ModBlocks.WHITE_MEI_PLANKS.get());
        woodenBoat(pWriter, ModItems.GREEN_CALYX_MEI_BOAT.get(), ModBlocks.GREEN_CALYX_MEI_PLANKS.get());
        woodenBoat(pWriter, ModItems.DOUBLE_PINK_MEI_BOAT.get(), ModBlocks.DOUBLE_PINK_MEI_PLANKS.get());
        woodenBoat(pWriter, ModItems.CRABAPPLE_BOAT.get(), ModBlocks.CRABAPPLE_PLANKS.get());
        woodenBoat(pWriter, ModItems.APRICOT_BOAT.get(), ModBlocks.APRICOT_PLANKS.get());
        woodenBoat(pWriter, ModItems.PEACH_BOAT.get(), ModBlocks.PEACH_PLANKS.get());
        woodenBoat(pWriter, ModItems.PEAR_BOAT.get(), ModBlocks.PEAR_PLANKS.get());
        woodenBoat(pWriter, ModItems.PURPLE_LEAF_PLUM_BOAT.get(), ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get());
        woodenBoat(pWriter, ModItems.OSMANTHUS_BOAT.get(), ModBlocks.OSMANTHUS_PLANKS.get());
        woodenBoat(pWriter, ModItems.GINKGO_BOAT.get(), ModBlocks.GINKGO_PLANKS.get());
        woodenBoat(pWriter, ModItems.SWEETGUM_BOAT.get(), ModBlocks.SWEETGUM_PLANKS.get());
        woodenBoat(pWriter, ModItems.CHINESE_PARASOL_BOAT.get(), ModBlocks.CHINESE_PARASOL_PLANKS.get());
        woodenBoat(pWriter, ModItems.CAMPHOR_BOAT.get(), ModBlocks.CAMPHOR_PLANKS.get());
        woodenBoat(pWriter, ModItems.DOVE_TREE_BOAT.get(), ModBlocks.DOVE_TREE_PLANKS.get());
        woodenBoat(pWriter, ModItems.CHINABERRY_BOAT.get(), ModBlocks.CHINABERRY_PLANKS.get());
        woodenBoat(pWriter, ModItems.DESERT_POPLAR_BOAT.get(), ModBlocks.DESERT_POPLAR_PLANKS.get());

        chestBoat(pWriter, ModItems.RED_MEI_CHEST_BOAT.get(), ModBlocks.RED_MEI_PLANKS.get());
        chestBoat(pWriter, ModItems.WHITE_MEI_CHEST_BOAT.get(), ModBlocks.WHITE_MEI_PLANKS.get());
        chestBoat(pWriter, ModItems.GREEN_CALYX_MEI_CHEST_BOAT.get(), ModBlocks.GREEN_CALYX_MEI_PLANKS.get());
        chestBoat(pWriter, ModItems.DOUBLE_PINK_MEI_CHEST_BOAT.get(), ModBlocks.DOUBLE_PINK_MEI_PLANKS.get());
        chestBoat(pWriter, ModItems.CRABAPPLE_CHEST_BOAT.get(), ModBlocks.CRABAPPLE_PLANKS.get());
        chestBoat(pWriter, ModItems.APRICOT_CHEST_BOAT.get(), ModBlocks.APRICOT_PLANKS.get());
        chestBoat(pWriter, ModItems.PEACH_CHEST_BOAT.get(), ModBlocks.PEACH_PLANKS.get());
        chestBoat(pWriter, ModItems.PEAR_CHEST_BOAT.get(), ModBlocks.PEAR_PLANKS.get());
        chestBoat(pWriter, ModItems.PURPLE_LEAF_PLUM_CHEST_BOAT.get(), ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get());
        chestBoat(pWriter, ModItems.OSMANTHUS_CHEST_BOAT.get(), ModBlocks.OSMANTHUS_PLANKS.get());
        chestBoat(pWriter, ModItems.GINKGO_CHEST_BOAT.get(), ModBlocks.GINKGO_PLANKS.get());
        chestBoat(pWriter, ModItems.SWEETGUM_CHEST_BOAT.get(), ModBlocks.SWEETGUM_PLANKS.get());
        chestBoat(pWriter, ModItems.CHINESE_PARASOL_CHEST_BOAT.get(), ModBlocks.CHINESE_PARASOL_PLANKS.get());
        chestBoat(pWriter, ModItems.CAMPHOR_CHEST_BOAT.get(), ModBlocks.CAMPHOR_PLANKS.get());
        chestBoat(pWriter, ModItems.DOVE_TREE_CHEST_BOAT.get(), ModBlocks.DOVE_TREE_PLANKS.get());
        chestBoat(pWriter, ModItems.CHINABERRY_CHEST_BOAT.get(), ModBlocks.CHINABERRY_PLANKS.get());
        chestBoat(pWriter, ModItems.DESERT_POPLAR_CHEST_BOAT.get(), ModBlocks.DESERT_POPLAR_PLANKS.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STICK, 6)
                .requires(ModBlocks.CRAPE_MYRTLE_LOG.get())
                .group("sticks")
                .unlockedBy("has_crape_myrtle_logs", has(ModBlocks.CRAPE_MYRTLE_LOG.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "stick_from_crape_myrtle_log"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STICK, 6)
                .requires(ModBlocks.CRAPE_MYRTLE_WOOD.get())
                .group("sticks")
                .unlockedBy("has_crape_myrtle_logs", has(ModBlocks.CRAPE_MYRTLE_WOOD.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "stick_from_crape_myrtle_wood"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STICK, 2)
                .define('#', ModItems.MOTTLED_BAMBOO.get())
                .pattern("#")
                .pattern("#")
                .group("sticks")
                .unlockedBy("has_bamboo", has(ModItems.MOTTLED_BAMBOO.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "stick_from_mottled_bamboo_item"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STICK, 2)
                .define('#', ModItems.BLACK_BAMBOO.get())
                .pattern("#")
                .pattern("#")
                .group("sticks")
                .unlockedBy("has_bamboo", has(ModItems.BLACK_BAMBOO.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "stick_from_black_bamboo_item"));

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.SCAFFOLDING, 6)
                .define('~', Items.STRING)
                .define('I', ModItems.MOTTLED_BAMBOO.get())
                .pattern("I~I")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_bamboo", has(ModItems.MOTTLED_BAMBOO.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "scaffolding_from_mottled_bamboo_item"));
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.SCAFFOLDING, 6)
                .define('~', Items.STRING)
                .define('I', ModItems.BLACK_BAMBOO.get())
                .pattern("I~I")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_bamboo", has(ModItems.BLACK_BAMBOO.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "scaffolding_from_black_bamboo_item"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CRAFTING_TABLE)
                .define('#', ModItems.MOTTLED_BAMBOO.get())
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_bamboo", has(ModItems.MOTTLED_BAMBOO.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "crafting_table_from_mottled_bamboo_item"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CRAFTING_TABLE)
                .define('#', ModItems.BLACK_BAMBOO.get())
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_bamboo", has(ModItems.BLACK_BAMBOO.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "crafting_table_from_black_bamboo_item"));

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_CRABAPPLE.get())
                .define('#', Items.GOLD_INGOT)
                .define('X', ModItems.CRABAPPLE.get())
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .unlockedBy(getHasName(ModItems.CRABAPPLE.get()), has(ModItems.CRABAPPLE.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENCHANTED_GOLDEN_CRABAPPLE.get())
                .define('#', Items.GOLD_BLOCK)
                .define('X', ModItems.CRABAPPLE.get())
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .unlockedBy(getHasName(ModItems.CRABAPPLE.get()), has(ModItems.CRABAPPLE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GOLDEN_MEI.get())
                .requires(Items.GOLD_NUGGET, 4)
                .requires(ModItems.MEI.get())
                .unlockedBy(getHasName(ModItems.MEI.get()), has(ModItems.MEI.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_MEI_SAPLING.get(), 1)
                .requires(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get())
                .requires(ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()), has(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()))
                .unlockedBy(getHasName(ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get()), has(ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_WEEPING_MEI_SAPLING.get(), 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.RED_MEI_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.RED_MEI_SAPLING.get()), has(ModBlocks.RED_MEI_SAPLING.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_WEEPING_MEI_SAPLING.get(), 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get()), has(ModBlocks.DOUBLE_WHITE_MEI_SAPLING.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_WEEPING_MEI_SAPLING.get(), 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.GREEN_CALYX_MEI_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_SAPLING.get()), has(ModBlocks.GREEN_CALYX_MEI_SAPLING.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_WEEPING_MEI_SAPLING.get(), 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.DOUBLE_PINK_MEI_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()), has(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get(), 1)
                .requires(ModBlocks.PINK_WEEPING_MEI_SAPLING.get())
                .requires(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.PINK_WEEPING_MEI_SAPLING.get()), has(ModBlocks.PINK_WEEPING_MEI_SAPLING.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get()), has(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "versicolor_weeping_mei_sapling_from_pink_and_white_weeping_mei_sapling"));
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get(), 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.VERSICOLOR_MEI_SAPLING.get())
                .unlockedBy(getHasName(ModBlocks.VERSICOLOR_MEI_SAPLING.get()), has(ModBlocks.VERSICOLOR_MEI_SAPLING.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "versicolor_weeping_mei_sapling_from_versicolor_mei_sapling"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_CAMELLIA.get(), 2)
                .requires(ModBlocks.CAMELLIA.get())
                .requires(ModBlocks.WHITE_CAMELLIA.get())
                .unlockedBy(getHasName(ModBlocks.CAMELLIA.get()), has(ModBlocks.CAMELLIA.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_CAMELLIA.get()), has(ModBlocks.WHITE_CAMELLIA.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "versicolor_camellia_from_camellia"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_VERSICOLOR_CAMELLIA.get(), 2)
                .requires(ModBlocks.TALL_CAMELLIA.get())
                .requires(ModBlocks.TALL_WHITE_CAMELLIA.get())
                .unlockedBy(getHasName(ModBlocks.TALL_CAMELLIA.get()), has(ModBlocks.TALL_CAMELLIA.get()))
                .unlockedBy(getHasName(ModBlocks.TALL_WHITE_CAMELLIA.get()), has(ModBlocks.TALL_WHITE_CAMELLIA.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "tall_versicolor_camellia_from_tall_camellia"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_CAMELLIA.get(), 2)
                .requires(ModBlocks.CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.CAMELLIA.get()), has(ModBlocks.CAMELLIA.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CAMELLIA.get(), 2)
                .requires(ModBlocks.TALL_CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.TALL_CAMELLIA.get()), has(ModBlocks.TALL_CAMELLIA.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_WHITE_CAMELLIA.get(), 2)
                .requires(ModBlocks.WHITE_CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.WHITE_CAMELLIA.get()), has(ModBlocks.WHITE_CAMELLIA.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_CAMELLIA.get(), 2)
                .requires(ModBlocks.TALL_WHITE_CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.TALL_WHITE_CAMELLIA.get()), has(ModBlocks.TALL_WHITE_CAMELLIA.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_PINK_CAMELLIA.get(), 2)
                .requires(ModBlocks.PINK_CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.PINK_CAMELLIA.get()), has(ModBlocks.PINK_CAMELLIA.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_CAMELLIA.get(), 2)
                .requires(ModBlocks.TALL_PINK_CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.TALL_PINK_CAMELLIA.get()), has(ModBlocks.TALL_PINK_CAMELLIA.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_VERSICOLOR_CAMELLIA.get(), 2)
                .requires(ModBlocks.VERSICOLOR_CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.VERSICOLOR_CAMELLIA.get()), has(ModBlocks.VERSICOLOR_CAMELLIA.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "tall_versicolor_camellia_from_versicolor_camellia"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_CAMELLIA.get(), 2)
                .requires(ModBlocks.TALL_VERSICOLOR_CAMELLIA.get(), 2)
                .unlockedBy(getHasName(ModBlocks.TALL_VERSICOLOR_CAMELLIA.get()), has(ModBlocks.TALL_VERSICOLOR_CAMELLIA.get()))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "versicolor_camellia_from_tall_versicolor_camellia"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GOLD_BACKED_SCARLET_MUM.get(), 2)
                .requires(ModBlocks.CHRYSANTHEMUM.get())
                .requires(ModBlocks.XIHU_LIUYUE.get())
                .unlockedBy(getHasName(ModBlocks.CHRYSANTHEMUM.get()), has(ModBlocks.CHRYSANTHEMUM.get()))
                .unlockedBy(getHasName(ModBlocks.XIHU_LIUYUE.get()), has(ModBlocks.XIHU_LIUYUE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PINK_CHINESE_ROSE.get(), 2)
                .requires(ModBlocks.CHINESE_ROSE.get())
                .requires(ModBlocks.PINK_CHINESE_ROSE.get())
                .unlockedBy(getHasName(ModBlocks.CHINESE_ROSE.get()), has(ModBlocks.CHINESE_ROSE.get()))
                .unlockedBy(getHasName(ModBlocks.PINK_CHINESE_ROSE.get()), has(ModBlocks.PINK_CHINESE_ROSE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_YELLOW_CHINESE_ROSE.get(), 2)
                .requires(ModBlocks.CHINESE_ROSE.get())
                .requires(ModBlocks.YELLOW_CHINESE_ROSE.get())
                .unlockedBy(getHasName(ModBlocks.CHINESE_ROSE.get()), has(ModBlocks.CHINESE_ROSE.get()))
                .unlockedBy(getHasName(ModBlocks.YELLOW_CHINESE_ROSE.get()), has(ModBlocks.YELLOW_CHINESE_ROSE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_WHITE_CHINESE_ROSE.get(), 2)
                .requires(ModBlocks.CHINESE_ROSE.get())
                .requires(ModBlocks.WHITE_CHINESE_ROSE.get())
                .unlockedBy(getHasName(ModBlocks.CHINESE_ROSE.get()), has(ModBlocks.CHINESE_ROSE.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE.get()), has(ModBlocks.WHITE_CHINESE_ROSE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_WHITE_CHINESE_ROSE.get(), 2)
                .requires(ModBlocks.PINK_CHINESE_ROSE.get())
                .requires(ModBlocks.WHITE_CHINESE_ROSE.get())
                .unlockedBy(getHasName(ModBlocks.PINK_CHINESE_ROSE.get()), has(ModBlocks.PINK_CHINESE_ROSE.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE.get()), has(ModBlocks.WHITE_CHINESE_ROSE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get(), 2)
                .requires(ModBlocks.YELLOW_CHINESE_ROSE.get())
                .requires(ModBlocks.WHITE_CHINESE_ROSE.get())
                .unlockedBy(getHasName(ModBlocks.YELLOW_CHINESE_ROSE.get()), has(ModBlocks.YELLOW_CHINESE_ROSE.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE.get()), has(ModBlocks.WHITE_CHINESE_ROSE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_WHITE_CHINESE_ROSE.get(), 2)
                .requires(ModBlocks.PURPLE_CHINESE_ROSE.get())
                .requires(ModBlocks.WHITE_CHINESE_ROSE.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_CHINESE_ROSE.get()), has(ModBlocks.PURPLE_CHINESE_ROSE.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE.get()), has(ModBlocks.WHITE_CHINESE_ROSE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_PEONY.get(), 3)
                .requires(ModBlocks.PEONY.get())
                .requires(ModBlocks.LIGHT_PINK_PEONY.get())
                .requires(ModBlocks.VIOLET_PINK_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.PEONY.get()), has(ModBlocks.PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LIGHT_PINK_PEONY.get()), has(ModBlocks.LIGHT_PINK_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.VIOLET_PINK_PEONY.get()), has(ModBlocks.VIOLET_PINK_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERMILION_PEONY.get(), 3)
                .requires(ModBlocks.RED_PEONY.get())
                .requires(ModBlocks.LIGHT_RED_PEONY.get())
                .requires(ModBlocks.INK_RED_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.RED_PEONY.get()), has(ModBlocks.RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LIGHT_RED_PEONY.get()), has(ModBlocks.LIGHT_RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.INK_RED_PEONY.get()), has(ModBlocks.INK_RED_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VIOLET_PEONY.get(), 3)
                .requires(ModBlocks.PURPLE_PEONY.get())
                .requires(ModBlocks.LIGHT_PURPLE_PEONY.get())
                .requires(ModBlocks.INK_PURPLE_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY.get()), has(ModBlocks.PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LIGHT_PURPLE_PEONY.get()), has(ModBlocks.LIGHT_PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.INK_PURPLE_PEONY.get()), has(ModBlocks.INK_PURPLE_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GOLDEN_PEONY.get(), 3)
                .requires(ModBlocks.YELLOW_PEONY.get())
                .requires(ModBlocks.LIGHT_YELLOW_PEONY.get())
                .requires(ModBlocks.OCHRE_YELLOW_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY.get()), has(ModBlocks.YELLOW_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LIGHT_YELLOW_PEONY.get()), has(ModBlocks.LIGHT_YELLOW_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.OCHRE_YELLOW_PEONY.get()), has(ModBlocks.OCHRE_YELLOW_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COLORFUL_PEONY.get(), 4)
                .requires(ModBlocks.PEONY.get())
                .requires(ModBlocks.RED_PEONY.get())
                .requires(ModBlocks.PURPLE_PEONY.get())
                .requires(ModBlocks.YELLOW_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.PEONY.get()), has(ModBlocks.PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY.get()), has(ModBlocks.RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY.get()), has(ModBlocks.PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY.get()), has(ModBlocks.YELLOW_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_COLORFUL_PEONY.get(), 4)
                .requires(ModBlocks.LIGHT_PINK_PEONY.get())
                .requires(ModBlocks.LIGHT_RED_PEONY.get())
                .requires(ModBlocks.LIGHT_PURPLE_PEONY.get())
                .requires(ModBlocks.LIGHT_YELLOW_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.LIGHT_PINK_PEONY.get()), has(ModBlocks.LIGHT_PINK_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LIGHT_RED_PEONY.get()), has(ModBlocks.LIGHT_RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LIGHT_PURPLE_PEONY.get()), has(ModBlocks.LIGHT_PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LIGHT_YELLOW_PEONY.get()), has(ModBlocks.LIGHT_YELLOW_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.INK_COLORFUL_PEONY.get(), 4)
                .requires(ModBlocks.VIOLET_PINK_PEONY.get())
                .requires(ModBlocks.INK_RED_PEONY.get())
                .requires(ModBlocks.INK_PURPLE_PEONY.get())
                .requires(ModBlocks.OCHRE_YELLOW_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.VIOLET_PINK_PEONY.get()), has(ModBlocks.VIOLET_PINK_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.INK_RED_PEONY.get()), has(ModBlocks.INK_RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.INK_PURPLE_PEONY.get()), has(ModBlocks.INK_PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.OCHRE_YELLOW_PEONY.get()), has(ModBlocks.OCHRE_YELLOW_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_WHITE_PEONY.get(), 4)
                .requires(ModBlocks.WHITE_PEONY.get())
                .requires(ModBlocks.RED_PEONY.get())
                .requires(ModBlocks.PURPLE_PEONY.get())
                .requires(ModBlocks.YELLOW_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY.get()), has(ModBlocks.WHITE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY.get()), has(ModBlocks.RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY.get()), has(ModBlocks.PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY.get()), has(ModBlocks.YELLOW_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_WHITE_PEONY.get(), 4)
                .requires(ModBlocks.PEONY.get())
                .requires(ModBlocks.WHITE_PEONY.get())
                .requires(ModBlocks.PURPLE_PEONY.get())
                .requires(ModBlocks.YELLOW_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.PEONY.get()), has(ModBlocks.PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY.get()), has(ModBlocks.WHITE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY.get()), has(ModBlocks.PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY.get()), has(ModBlocks.YELLOW_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_WHITE_PEONY.get(), 4)
                .requires(ModBlocks.PEONY.get())
                .requires(ModBlocks.RED_PEONY.get())
                .requires(ModBlocks.WHITE_PEONY.get())
                .requires(ModBlocks.YELLOW_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.PEONY.get()), has(ModBlocks.PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY.get()), has(ModBlocks.RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY.get()), has(ModBlocks.WHITE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY.get()), has(ModBlocks.YELLOW_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_WHITE_PEONY.get(), 4)
                .requires(ModBlocks.PEONY.get())
                .requires(ModBlocks.RED_PEONY.get())
                .requires(ModBlocks.PURPLE_PEONY.get())
                .requires(ModBlocks.WHITE_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.PEONY.get()), has(ModBlocks.PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY.get()), has(ModBlocks.RED_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY.get()), has(ModBlocks.PURPLE_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY.get()), has(ModBlocks.WHITE_PEONY.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WU_HUA_LONG_YU_PEONY.get(), 2)
                .requires(ModBlocks.VIOLET_PINK_PEONY.get())
                .requires(ModBlocks.WHITE_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.VIOLET_PINK_PEONY.get()), has(ModBlocks.VIOLET_PINK_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY.get()), has(ModBlocks.WHITE_PEONY.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TWO_QIAO_PEONY.get(), 2)
                .requires(ModBlocks.WEI_ZI_PEONY.get())
                .requires(ModBlocks.ZHAO_PINK_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.WEI_ZI_PEONY.get()), has(ModBlocks.WEI_ZI_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.ZHAO_PINK_PEONY.get()), has(ModBlocks.ZHAO_PINK_PEONY.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VERSICOLOR_PEONY.get(), 1)
                .pattern(" d ")
                .pattern("zly")
                .pattern(" w ")
                .define('y', ModBlocks.YAO_HUANG_PEONY.get())
                .define('w', ModBlocks.WEI_ZI_PEONY.get())
                .define('z', ModBlocks.ZHAO_PINK_PEONY.get())
                .define('d', ModBlocks.DOU_GREEN_PEONY.get())
                .define('l', ModBlocks.LUOYANG_RED_PEONY.get())
                .unlockedBy(getHasName(ModBlocks.YAO_HUANG_PEONY.get()), has(ModBlocks.YAO_HUANG_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.WEI_ZI_PEONY.get()), has(ModBlocks.WEI_ZI_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.ZHAO_PINK_PEONY.get()), has(ModBlocks.ZHAO_PINK_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.DOU_GREEN_PEONY.get()), has(ModBlocks.DOU_GREEN_PEONY.get()))
                .unlockedBy(getHasName(ModBlocks.LUOYANG_RED_PEONY.get()), has(ModBlocks.LUOYANG_RED_PEONY.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CRAPE_MYRTLE.get(), 2)
                .requires(ModBlocks.CRAPE_MYRTLE_SAPLING.get(), 2)
                .unlockedBy(getHasName(ModBlocks.CRAPE_MYRTLE_SAPLING.get()), has(ModBlocks.CRAPE_MYRTLE_SAPLING.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CRAPE_MYRTLE_SAPLING.get(), 2)
                .requires(ModBlocks.CRAPE_MYRTLE.get(), 2)
                .unlockedBy(getHasName(ModBlocks.CRAPE_MYRTLE.get()), has(ModBlocks.CRAPE_MYRTLE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_CRAPE_MYRTLE.get(), 2)
                .requires(ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get(), 2)
                .unlockedBy(getHasName(ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get()), has(ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get(), 2)
                .requires(ModBlocks.RED_CRAPE_MYRTLE.get(), 2)
                .unlockedBy(getHasName(ModBlocks.RED_CRAPE_MYRTLE.get()), has(ModBlocks.RED_CRAPE_MYRTLE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_CRAPE_MYRTLE.get(), 2)
                .requires(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get(), 2)
                .unlockedBy(getHasName(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get()), has(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get(), 2)
                .requires(ModBlocks.PINK_CRAPE_MYRTLE.get(), 2)
                .unlockedBy(getHasName(ModBlocks.PINK_CRAPE_MYRTLE.get()), has(ModBlocks.PINK_CRAPE_MYRTLE.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_CRAPE_MYRTLE.get(), 2)
                .requires(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get(), 2)
                .unlockedBy(getHasName(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get()), has(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get(), 2)
                .requires(ModBlocks.WHITE_CRAPE_MYRTLE.get(), 2)
                .unlockedBy(getHasName(ModBlocks.WHITE_CRAPE_MYRTLE.get()), has(ModBlocks.WHITE_CRAPE_MYRTLE.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE)
                .requires(ModTags.Items.RED_DYE)
                .group("red_dye")
                .unlockedBy("has_red_dye_item", has(ModTags.Items.RED_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "red_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PINK_DYE)
                .requires(ModTags.Items.PINK_DYE)
                .group("pink_dye")
                .unlockedBy("has_pink_dye_item", has(ModTags.Items.PINK_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "pink_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHITE_DYE)
                .requires(ModTags.Items.WHITE_DYE)
                .group("white_dye")
                .unlockedBy("has_white_dye_item", has(ModTags.Items.WHITE_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "white_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.YELLOW_DYE)
                .requires(ModTags.Items.YELLOW_DYE)
                .group("yellow_dye")
                .unlockedBy("has_yellow_dye_item", has(ModTags.Items.YELLOW_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "yellow_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                .requires(ModTags.Items.ORANGE_DYE)
                .group("orange_dye")
                .unlockedBy("has_orange_dye_item", has(ModTags.Items.ORANGE_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "orang_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                .requires(ModTags.Items.PURPLE_DYE)
                .group("purple_dye")
                .unlockedBy("has_purple_dye_item", has(ModTags.Items.PURPLE_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "purple_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIME_DYE)
                .requires(ModTags.Items.LIME_DYE)
                .group("lime_dye")
                .unlockedBy("has_lime_dye_item", has(ModTags.Items.LIME_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "lime_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GREEN_DYE)
                .requires(ModTags.Items.GREEN_DYE)
                .group("green_dye")
                .unlockedBy("has_green_dye_item", has(ModTags.Items.GREEN_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "green_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .requires(ModTags.Items.LIGHT_BLUE_DYE)
                .group("light_blue_dye")
                .unlockedBy("has_light_blue_dye_item", has(ModTags.Items.LIGHT_BLUE_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "light_blue_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLUE_DYE)
                .requires(ModTags.Items.BLUE_DYE)
                .group("blue_dye")
                .unlockedBy("has_blue_dye_item", has(ModTags.Items.BLUE_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "blue_dye_from_flowers"));
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLACK_DYE)
                .requires(ModTags.Items.BLACK_DYE)
                .group("black_dye")
                .unlockedBy("has_black_dye_item", has(ModTags.Items.BLACK_DYE))
                .save(pWriter, new ResourceLocation(MoreOrnPlants.MOD_ID, "black_dye_from_flowers"));

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BAMBOO_SHOOTS_SOUP.get())
                .requires(ModItems.PEELED_BAMBOO_SHOOTS.get())
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModItems.PEELED_BAMBOO_SHOOTS.get()), has(ModItems.PEELED_BAMBOO_SHOOTS.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.LOTUS_ROOT_SOUP.get())
                .requires(ModItems.LOTUS_ROOT.get())
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModItems.LOTUS_ROOT.get()), has(ModItems.LOTUS_ROOT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.LOTUS_SEED.get(), 5)
                .requires(ModItems.LOTUS_SEED_POD.get())
                .unlockedBy(getHasName(ModItems.LOTUS_SEED_POD.get()), has(ModItems.LOTUS_SEED_POD.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.LOTUS_SEED_SOUP.get())
                .requires(ModItems.LOTUS_SEED.get(), 5)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModItems.LOTUS_SEED.get()), has(ModItems.LOTUS_SEED.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.MUXUE_SOUP.get())
                .requires(ModBlocks.MUXUE_GRASS.get(), 2)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModBlocks.MUXUE_GRASS.get()), has(ModBlocks.MUXUE_GRASS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MEI_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ForgeTags.Items.MEI_LEAVES)
                .unlockedBy("has_mei_leaves", has(ForgeTags.Items.MEI_LEAVES))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OSMANTHUS_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ForgeTags.Items.OSMANTHUS_LEAVES)
                .unlockedBy("has_osmanthus_leaves", has(ForgeTags.Items.OSMANTHUS_LEAVES))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYMBIDIUM_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ForgeTags.Items.CYMBIDIUM)
                .unlockedBy("has_cymbidium", has(ForgeTags.Items.CYMBIDIUM))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WINTERSWEET_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ModBlocks.WINTERSWEET.get())
                .unlockedBy("has_wintersweet", has(ModBlocks.WINTERSWEET.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LILAC_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', Items.LILAC)
                .unlockedBy("has_lilac", has(Items.LILAC))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CHINESE_ROSE_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ForgeTags.Items.CHINESE_ROSE)
                .unlockedBy("has_chinese_rose", has(ForgeTags.Items.CHINESE_ROSE))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUGOSA_ROSE_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', Items.ROSE_BUSH)
                .unlockedBy("has_rose_bush", has(Items.ROSE_BUSH))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.APRICOT_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ForgeTags.Items.APRICOT_LEAVES)
                .unlockedBy("has_apricot_leaves", has(ForgeTags.Items.APRICOT_LEAVES))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PEACH_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ForgeTags.Items.PEACH_LEAVES)
                .unlockedBy("has_peach_leaves", has(ForgeTags.Items.PEACH_LEAVES))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PEAR_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ModBlocks.PEAR_LEAVES.get())
                .unlockedBy("has_pear_leaves", has(ModBlocks.PEAR_LEAVES.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LOTUS_XIANGNANG.get())
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ForgeTags.Items.LOTUS)
                .unlockedBy("has_lotus", has(ForgeTags.Items.LOTUS))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEACH_WOODEN_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModTags.Items.PEACH_LOGS)
                .define('/', Items.STICK)
                .unlockedBy("has_peach_logs", has(ModTags.Items.PEACH_LOGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAMPHOR_WOODEN_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModTags.Items.CAMPHOR_LOGS)
                .define('/', Items.STICK)
                .unlockedBy("has_camphor_logs", has(ModTags.Items.CAMPHOR_LOGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModTags.Items.CHINESE_PARASOL_LOGS)
                .define('/', Items.STICK)
                .unlockedBy("has_chinese_parasol_logs", has(ModTags.Items.CHINESE_PARASOL_LOGS))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIYING_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModItems.ZIYING_BEAD.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD.get()), has(ModItems.ZIYING_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUYU_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModItems.SUYU_BEAD.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.SUYU_BEAD.get()), has(ModItems.SUYU_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIYU_YUANYANG_SWORD.get())
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModItems.ZIYU_YUANYANG_BEAD.get())
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD.get()), has(ModItems.ZIYU_YUANYANG_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_AXE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD.get()), has(ModItems.ZIYING_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_AXE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD.get()), has(ModItems.SUYU_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_AXE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD.get())
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD.get()), has(ModItems.ZIYU_YUANYANG_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_PICKAXE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD.get()), has(ModItems.ZIYING_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_PICKAXE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD.get()), has(ModItems.SUYU_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_PICKAXE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD.get())
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD.get()), has(ModItems.ZIYU_YUANYANG_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_HOE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD.get()), has(ModItems.ZIYING_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_HOE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD.get()), has(ModItems.SUYU_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_HOE.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD.get())
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD.get()), has(ModItems.ZIYU_YUANYANG_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_SHOVEL.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD.get()), has(ModItems.ZIYING_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_SHOVEL.get())
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD.get()), has(ModItems.SUYU_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_SHOVEL.get())
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD.get())
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD.get()), has(ModItems.ZIYU_YUANYANG_BEAD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CLOUD_APRICOT_SAPLING.get())
                .pattern(" P ")
                .pattern("PCW")
                .pattern(" W ")
                .define('P', ModBlocks.PINK_APRICOT_SAPLING.get())
                .define('W', ModBlocks.WHITE_APRICOT_SAPLING.get())
                .define('C', ModItems.ZIYU_YUANYANG_BEAD.get())
                .unlockedBy(getHasName(ModBlocks.PINK_APRICOT_SAPLING.get()), has(ModBlocks.PINK_APRICOT_SAPLING.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_APRICOT_SAPLING.get()), has(ModBlocks.WHITE_APRICOT_SAPLING.get()))
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD.get()), has(ModItems.ZIYU_YUANYANG_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IMMORTAL_PEACH_SAPLING.get())
                .pattern(" O ")
                .pattern("WCB")
                .pattern(" O ")
                .define('O', ModBlocks.ORNAMENTAL_PEACH_SAPLING.get())
                .define('W', ModBlocks.WILD_PEACH_SAPLING.get())
                .define('B', ModBlocks.WHITE_PEACH_SAPLING.get())
                .define('C', ModItems.ZIYU_YUANYANG_BEAD.get())
                .unlockedBy(getHasName(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()), has(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()))
                .unlockedBy(getHasName(ModBlocks.WILD_PEACH_SAPLING.get()), has(ModBlocks.WILD_PEACH_SAPLING.get()))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEACH_SAPLING.get()), has(ModBlocks.WHITE_PEACH_SAPLING.get()))
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD.get()), has(ModItems.ZIYU_YUANYANG_BEAD.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIYU_YUANYANG_BEAD.get())
                .requires(ModItems.ZIYING_BEAD.get())
                .requires(ModItems.SUYU_BEAD.get())
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD.get()), has(ModItems.ZIYING_BEAD.get()))
                .unlockedBy(getHasName(ModItems.SUYU_BEAD.get()), has(ModItems.SUYU_BEAD.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIYING_BEADLIGHT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ZIYING_BEAD.get())
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD.get()), has(ModItems.ZIYING_BEAD.get()))
                .save(pWriter);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUYU_BEADLIGHT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SUYU_BEAD.get())
                .unlockedBy(getHasName(ModItems.SUYU_BEAD.get()), has(ModItems.SUYU_BEAD.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIYING_BEAD.get(), 6)
                .requires(ModBlocks.ZIYING_BEADLIGHT.get())
                .unlockedBy(getHasName(ModBlocks.ZIYING_BEADLIGHT.get()), has(ModBlocks.ZIYING_BEADLIGHT.get()))
                .save(pWriter);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SUYU_BEAD.get(), 6)
                .requires(ModBlocks.SUYU_BEADLIGHT.get())
                .unlockedBy(getHasName(ModBlocks.SUYU_BEADLIGHT.get()), has(ModBlocks.SUYU_BEADLIGHT.get()))
                .save(pWriter);
    }
}
