package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.CommonTags;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        planksFromLogs(recipeOutput, ModBlocks.RED_MEI_PLANKS.get(), ModTags.Items.RED_MEI_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.WHITE_MEI_PLANKS.get(), ModTags.Items.WHITE_MEI_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.GREEN_CALYX_MEI_PLANKS.get(), ModTags.Items.GREEN_CALYX_MEI_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.DOUBLE_PINK_MEI_PLANKS.get(), ModTags.Items.DOUBLE_PINK_MEI_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.CRABAPPLE_PLANKS.get(), ModTags.Items.CRABAPPLE_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.APRICOT_PLANKS.get(), ModTags.Items.APRICOT_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.PEACH_PLANKS.get(), ModTags.Items.PEACH_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.PEAR_PLANKS.get(), ModTags.Items.PEAR_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get(), ModTags.Items.PURPLE_LEAF_PLUM_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.OSMANTHUS_PLANKS.get(), ModTags.Items.OSMANTHUS_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.GINKGO_PLANKS.get(), ModTags.Items.GINKGO_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.CHINESE_PARASOL_PLANKS.get(), ModTags.Items.CHINESE_PARASOL_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.SWEETGUM_PLANKS.get(), ModTags.Items.SWEETGUM_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.CAMPHOR_PLANKS.get(), ModTags.Items.CAMPHOR_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.DOVE_TREE_PLANKS.get(), ModTags.Items.DOVE_TREE_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.CHINABERRY_PLANKS.get(), ModTags.Items.CHINABERRY_LOGS, 4);
        planksFromLogs(recipeOutput, ModBlocks.DESERT_POPLAR_PLANKS.get(), ModTags.Items.DESERT_POPLAR_LOGS, 4);

        woodFromLogs(recipeOutput, ModBlocks.RED_MEI_WOOD.get(), ModBlocks.RED_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.WHITE_MEI_WOOD.get(), ModBlocks.WHITE_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.GREEN_CALYX_MEI_WOOD.get(), ModBlocks.GREEN_CALYX_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.DOUBLE_PINK_MEI_WOOD.get(), ModBlocks.DOUBLE_PINK_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.CRABAPPLE_WOOD.get(), ModBlocks.CRABAPPLE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.APRICOT_WOOD.get(), ModBlocks.APRICOT_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.PEACH_WOOD.get(), ModBlocks.PEACH_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.PEAR_WOOD.get(), ModBlocks.PEAR_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.PURPLE_LEAF_PLUM_WOOD.get(), ModBlocks.PURPLE_LEAF_PLUM_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.OSMANTHUS_WOOD.get(), ModBlocks.OSMANTHUS_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.GINKGO_WOOD.get(), ModBlocks.GINKGO_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.CHINESE_PARASOL_WOOD.get(), ModBlocks.CHINESE_PARASOL_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.SWEETGUM_WOOD.get(), ModBlocks.SWEETGUM_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.CAMPHOR_WOOD.get(), ModBlocks.CAMPHOR_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.DOVE_TREE_WOOD.get(), ModBlocks.DOVE_TREE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.CHINABERRY_WOOD.get(), ModBlocks.CHINABERRY_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.DESERT_POPLAR_WOOD.get(), ModBlocks.DESERT_POPLAR_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.CRAPE_MYRTLE_WOOD.get(), ModBlocks.CRAPE_MYRTLE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_RED_MEI_WOOD.get(), ModBlocks.STRIPPED_RED_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_WHITE_MEI_WOOD.get(), ModBlocks.STRIPPED_WHITE_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.get(), ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.get(), ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_CRABAPPLE_WOOD.get(), ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_APRICOT_WOOD.get(), ModBlocks.STRIPPED_APRICOT_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_PEACH_WOOD.get(), ModBlocks.STRIPPED_PEACH_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_PEAR_WOOD.get(), ModBlocks.STRIPPED_PEAR_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.get(), ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_OSMANTHUS_WOOD.get(), ModBlocks.STRIPPED_OSMANTHUS_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_GINKGO_WOOD.get(), ModBlocks.STRIPPED_GINKGO_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.get(), ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_SWEETGUM_WOOD.get(), ModBlocks.STRIPPED_SWEETGUM_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_CAMPHOR_WOOD.get(), ModBlocks.STRIPPED_CAMPHOR_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_DOVE_TREE_WOOD.get(), ModBlocks.STRIPPED_DOVE_TREE_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_CHINABERRY_WOOD.get(), ModBlocks.STRIPPED_CHINABERRY_LOG.get());
        woodFromLogs(recipeOutput, ModBlocks.STRIPPED_DESERT_POPLAR_WOOD.get(), ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get());

        stairBuilder(ModBlocks.RED_MEI_STAIRS.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.WHITE_MEI_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.GREEN_CALYX_MEI_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.DOUBLE_PINK_MEI_STAIRS.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.CRABAPPLE_STAIRS.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.APRICOT_STAIRS.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.PEACH_STAIRS.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.PEAR_STAIRS.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.PURPLE_LEAF_PLUM_STAIRS.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.OSMANTHUS_STAIRS.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.GINKGO_STAIRS.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.CHINESE_PARASOL_STAIRS.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.SWEETGUM_STAIRS.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.CAMPHOR_STAIRS.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.DOVE_TREE_STAIRS.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.CHINABERRY_STAIRS.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.DESERT_POPLAR_STAIRS.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_stairs")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_MEI_SLAB.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MEI_SLAB.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CALYX_MEI_SLAB.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOUBLE_PINK_MEI_SLAB.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRABAPPLE_SLAB.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.APRICOT_SLAB.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEACH_SLAB.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_SLAB.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_LEAF_PLUM_SLAB.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OSMANTHUS_SLAB.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GINKGO_SLAB.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHINESE_PARASOL_SLAB.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SWEETGUM_SLAB.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CAMPHOR_SLAB.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DOVE_TREE_SLAB.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHINABERRY_SLAB.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DESERT_POPLAR_SLAB.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_slab")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        doorBuilder(ModBlocks.RED_MEI_DOOR.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.WHITE_MEI_DOOR.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.GREEN_CALYX_MEI_DOOR.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.DOUBLE_PINK_MEI_DOOR.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.CRABAPPLE_DOOR.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.APRICOT_DOOR.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.PEACH_DOOR.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.PEAR_DOOR.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.PURPLE_LEAF_PLUM_DOOR.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.OSMANTHUS_DOOR.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.GINKGO_DOOR.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.CHINESE_PARASOL_DOOR.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.SWEETGUM_DOOR.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.CAMPHOR_DOOR.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.DOVE_TREE_DOOR.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.CHINABERRY_DOOR.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        doorBuilder(ModBlocks.DESERT_POPLAR_DOOR.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_door")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        trapdoorBuilder(ModBlocks.RED_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.WHITE_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.GREEN_CALYX_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.DOUBLE_PINK_MEI_TRAPDOOR.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.CRABAPPLE_TRAPDOOR.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.APRICOT_TRAPDOOR.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.PEACH_TRAPDOOR.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.PEAR_TRAPDOOR.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.PURPLE_LEAF_PLUM_TRAPDOOR.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.OSMANTHUS_TRAPDOOR.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.GINKGO_TRAPDOOR.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.CHINESE_PARASOL_TRAPDOOR.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.SWEETGUM_TRAPDOOR.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.CAMPHOR_TRAPDOOR.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.DOVE_TREE_TRAPDOOR.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.CHINABERRY_TRAPDOOR.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        trapdoorBuilder(ModBlocks.DESERT_POPLAR_TRAPDOOR.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_trapdoor")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        fenceBuilder(ModBlocks.RED_MEI_FENCE.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.WHITE_MEI_FENCE.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.GREEN_CALYX_MEI_FENCE.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.DOUBLE_PINK_MEI_FENCE.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.CRABAPPLE_FENCE.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.APRICOT_FENCE.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.PEACH_FENCE.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.PEAR_FENCE.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.PURPLE_LEAF_PLUM_FENCE.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.OSMANTHUS_FENCE.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.GINKGO_FENCE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.CHINESE_PARASOL_FENCE.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.SWEETGUM_FENCE.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.CAMPHOR_FENCE.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.DOVE_TREE_FENCE.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.CHINABERRY_FENCE.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.DESERT_POPLAR_FENCE.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_fence")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        fenceGateBuilder(ModBlocks.RED_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.WHITE_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.GREEN_CALYX_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.CRABAPPLE_FENCE_GATE.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.APRICOT_FENCE_GATE.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.PEACH_FENCE_GATE.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.PEAR_FENCE_GATE.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.OSMANTHUS_FENCE_GATE.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.GINKGO_FENCE_GATE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.CHINESE_PARASOL_FENCE_GATE.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.SWEETGUM_FENCE_GATE.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.CAMPHOR_FENCE_GATE.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.DOVE_TREE_FENCE_GATE.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.CHINABERRY_FENCE_GATE.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        fenceGateBuilder(ModBlocks.DESERT_POPLAR_FENCE_GATE.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_fence_gate")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        buttonBuilder(ModBlocks.RED_MEI_BUTTON.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.WHITE_MEI_BUTTON.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.GREEN_CALYX_MEI_BUTTON.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.DOUBLE_PINK_MEI_BUTTON.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.CRABAPPLE_BUTTON.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.APRICOT_BUTTON.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.PEACH_BUTTON.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.PEAR_BUTTON.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.PURPLE_LEAF_PLUM_BUTTON.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.OSMANTHUS_BUTTON.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.GINKGO_BUTTON.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.CHINESE_PARASOL_BUTTON.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.SWEETGUM_BUTTON.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.CAMPHOR_BUTTON.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.DOVE_TREE_BUTTON.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.CHINABERRY_BUTTON.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        buttonBuilder(ModBlocks.DESERT_POPLAR_BUTTON.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_button")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.RED_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.WHITE_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.GREEN_CALYX_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.DOUBLE_PINK_MEI_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CRABAPPLE_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.APRICOT_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.PEACH_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.PEAR_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.PURPLE_LEAF_PLUM_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.OSMANTHUS_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.GINKGO_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CHINESE_PARASOL_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.SWEETGUM_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CAMPHOR_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.DOVE_TREE_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.CHINABERRY_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        pressurePlateBuilder(RecipeCategory.REDSTONE, ModBlocks.DESERT_POPLAR_PRESSURE_PLATE.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_pressure_plate")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        signBuilder(ModItems.RED_MEI_SIGN.get(), Ingredient.of(ModBlocks.RED_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.RED_MEI_PLANKS.get()), has(ModBlocks.RED_MEI_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.WHITE_MEI_SIGN.get(), Ingredient.of(ModBlocks.WHITE_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.WHITE_MEI_PLANKS.get()), has(ModBlocks.WHITE_MEI_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.GREEN_CALYX_MEI_SIGN.get(), Ingredient.of(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()), has(ModBlocks.GREEN_CALYX_MEI_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.DOUBLE_PINK_MEI_SIGN.get(), Ingredient.of(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()), has(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.CRABAPPLE_SIGN.get(), Ingredient.of(ModBlocks.CRABAPPLE_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CRABAPPLE_PLANKS.get()), has(ModBlocks.CRABAPPLE_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.APRICOT_SIGN.get(), Ingredient.of(ModBlocks.APRICOT_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.APRICOT_PLANKS.get()), has(ModBlocks.APRICOT_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.PEACH_SIGN.get(), Ingredient.of(ModBlocks.PEACH_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.PEACH_PLANKS.get()), has(ModBlocks.PEACH_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.PEAR_SIGN.get(), Ingredient.of(ModBlocks.PEAR_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.PEAR_PLANKS.get()), has(ModBlocks.PEAR_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.PURPLE_LEAF_PLUM_SIGN.get(), Ingredient.of(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()), has(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.OSMANTHUS_SIGN.get(), Ingredient.of(ModBlocks.OSMANTHUS_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.OSMANTHUS_PLANKS.get()), has(ModBlocks.OSMANTHUS_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.GINKGO_SIGN.get(), Ingredient.of(ModBlocks.GINKGO_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.GINKGO_PLANKS.get()), has(ModBlocks.GINKGO_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.CHINESE_PARASOL_SIGN.get(), Ingredient.of(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CHINESE_PARASOL_PLANKS.get()), has(ModBlocks.CHINESE_PARASOL_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.SWEETGUM_SIGN.get(), Ingredient.of(ModBlocks.SWEETGUM_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.SWEETGUM_PLANKS.get()), has(ModBlocks.SWEETGUM_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.CAMPHOR_SIGN.get(), Ingredient.of(ModBlocks.CAMPHOR_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CAMPHOR_PLANKS.get()), has(ModBlocks.CAMPHOR_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.DOVE_TREE_SIGN.get(), Ingredient.of(ModBlocks.DOVE_TREE_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.DOVE_TREE_PLANKS.get()), has(ModBlocks.DOVE_TREE_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.CHINABERRY_SIGN.get(), Ingredient.of(ModBlocks.CHINABERRY_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.CHINABERRY_PLANKS.get()), has(ModBlocks.CHINABERRY_PLANKS.get()))
                .save(recipeOutput);
        signBuilder(ModItems.DESERT_POPLAR_SIGN.get(), Ingredient.of(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .group("wooden_sign")
                .unlockedBy(getHasName(ModBlocks.DESERT_POPLAR_PLANKS.get()), has(ModBlocks.DESERT_POPLAR_PLANKS.get()))
                .save(recipeOutput);

        hangingSign(recipeOutput, ModItems.RED_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_RED_MEI_LOG.get());
        hangingSign(recipeOutput, ModItems.WHITE_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_WHITE_MEI_LOG.get());
        hangingSign(recipeOutput, ModItems.GREEN_CALYX_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get());
        hangingSign(recipeOutput, ModItems.DOUBLE_PINK_MEI_HANGING_SIGN.get(), ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get());
        hangingSign(recipeOutput, ModItems.CRABAPPLE_HANGING_SIGN.get(), ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        hangingSign(recipeOutput, ModItems.APRICOT_HANGING_SIGN.get(), ModBlocks.STRIPPED_APRICOT_LOG.get());
        hangingSign(recipeOutput, ModItems.PEACH_HANGING_SIGN.get(), ModBlocks.STRIPPED_PEACH_LOG.get());
        hangingSign(recipeOutput, ModItems.PEAR_HANGING_SIGN.get(), ModBlocks.STRIPPED_PEAR_LOG.get());
        hangingSign(recipeOutput, ModItems.PURPLE_LEAF_PLUM_HANGING_SIGN.get(), ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get());
        hangingSign(recipeOutput, ModItems.OSMANTHUS_HANGING_SIGN.get(), ModBlocks.STRIPPED_OSMANTHUS_LOG.get());
        hangingSign(recipeOutput, ModItems.GINKGO_HANGING_SIGN.get(), ModBlocks.STRIPPED_GINKGO_LOG.get());
        hangingSign(recipeOutput, ModItems.CHINESE_PARASOL_HANGING_SIGN.get(), ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get());
        hangingSign(recipeOutput, ModItems.SWEETGUM_HANGING_SIGN.get(), ModBlocks.STRIPPED_SWEETGUM_LOG.get());
        hangingSign(recipeOutput, ModItems.CAMPHOR_HANGING_SIGN.get(), ModBlocks.STRIPPED_CAMPHOR_LOG.get());
        hangingSign(recipeOutput, ModItems.DOVE_TREE_HANGING_SIGN.get(), ModBlocks.STRIPPED_DOVE_TREE_LOG.get());
        hangingSign(recipeOutput, ModItems.CHINABERRY_HANGING_SIGN.get(), ModBlocks.STRIPPED_CHINABERRY_LOG.get());
        hangingSign(recipeOutput, ModItems.DESERT_POPLAR_HANGING_SIGN.get(), ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get());

        woodenBoat(recipeOutput, ModItems.RED_MEI_BOAT.get(), ModBlocks.RED_MEI_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.WHITE_MEI_BOAT.get(), ModBlocks.WHITE_MEI_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.GREEN_CALYX_MEI_BOAT.get(), ModBlocks.GREEN_CALYX_MEI_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.DOUBLE_PINK_MEI_BOAT.get(), ModBlocks.DOUBLE_PINK_MEI_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.CRABAPPLE_BOAT.get(), ModBlocks.CRABAPPLE_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.APRICOT_BOAT.get(), ModBlocks.APRICOT_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.PEACH_BOAT.get(), ModBlocks.PEACH_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.PEAR_BOAT.get(), ModBlocks.PEAR_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.PURPLE_LEAF_PLUM_BOAT.get(), ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.OSMANTHUS_BOAT.get(), ModBlocks.OSMANTHUS_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.GINKGO_BOAT.get(), ModBlocks.GINKGO_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.SWEETGUM_BOAT.get(), ModBlocks.SWEETGUM_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.CHINESE_PARASOL_BOAT.get(), ModBlocks.CHINESE_PARASOL_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.CAMPHOR_BOAT.get(), ModBlocks.CAMPHOR_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.DOVE_TREE_BOAT.get(), ModBlocks.DOVE_TREE_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.CHINABERRY_BOAT.get(), ModBlocks.CHINABERRY_PLANKS.get());
        woodenBoat(recipeOutput, ModItems.DESERT_POPLAR_BOAT.get(), ModBlocks.DESERT_POPLAR_PLANKS.get());

        chestBoat(recipeOutput, ModItems.RED_MEI_CHEST_BOAT.get(), ModBlocks.RED_MEI_PLANKS.get());
        chestBoat(recipeOutput, ModItems.WHITE_MEI_CHEST_BOAT.get(), ModBlocks.WHITE_MEI_PLANKS.get());
        chestBoat(recipeOutput, ModItems.GREEN_CALYX_MEI_CHEST_BOAT.get(), ModBlocks.GREEN_CALYX_MEI_PLANKS.get());
        chestBoat(recipeOutput, ModItems.DOUBLE_PINK_MEI_CHEST_BOAT.get(), ModBlocks.DOUBLE_PINK_MEI_PLANKS.get());
        chestBoat(recipeOutput, ModItems.CRABAPPLE_CHEST_BOAT.get(), ModBlocks.CRABAPPLE_PLANKS.get());
        chestBoat(recipeOutput, ModItems.APRICOT_CHEST_BOAT.get(), ModBlocks.APRICOT_PLANKS.get());
        chestBoat(recipeOutput, ModItems.PEACH_CHEST_BOAT.get(), ModBlocks.PEACH_PLANKS.get());
        chestBoat(recipeOutput, ModItems.PEAR_CHEST_BOAT.get(), ModBlocks.PEAR_PLANKS.get());
        chestBoat(recipeOutput, ModItems.PURPLE_LEAF_PLUM_CHEST_BOAT.get(), ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get());
        chestBoat(recipeOutput, ModItems.OSMANTHUS_CHEST_BOAT.get(), ModBlocks.OSMANTHUS_PLANKS.get());
        chestBoat(recipeOutput, ModItems.GINKGO_CHEST_BOAT.get(), ModBlocks.GINKGO_PLANKS.get());
        chestBoat(recipeOutput, ModItems.SWEETGUM_CHEST_BOAT.get(), ModBlocks.SWEETGUM_PLANKS.get());
        chestBoat(recipeOutput, ModItems.CHINESE_PARASOL_CHEST_BOAT.get(), ModBlocks.CHINESE_PARASOL_PLANKS.get());
        chestBoat(recipeOutput, ModItems.CAMPHOR_CHEST_BOAT.get(), ModBlocks.CAMPHOR_PLANKS.get());
        chestBoat(recipeOutput, ModItems.DOVE_TREE_CHEST_BOAT.get(), ModBlocks.DOVE_TREE_PLANKS.get());
        chestBoat(recipeOutput, ModItems.CHINABERRY_CHEST_BOAT.get(), ModBlocks.CHINABERRY_PLANKS.get());
        chestBoat(recipeOutput, ModItems.DESERT_POPLAR_CHEST_BOAT.get(), ModBlocks.DESERT_POPLAR_PLANKS.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STICK, 6)
                .requires(ModBlocks.CRAPE_MYRTLE_LOG)
                .group("sticks")
                .unlockedBy("has_crape_myrtle_logs", has(ModBlocks.CRAPE_MYRTLE_LOG))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "stick_from_crape_myrtle_log");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STICK, 6)
                .requires(ModBlocks.CRAPE_MYRTLE_WOOD)
                .group("sticks")
                .unlockedBy("has_crape_myrtle_logs", has(ModBlocks.CRAPE_MYRTLE_WOOD))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "stick_from_crape_myrtle_wood");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STICK, 2)
                .define('#', ModItems.MOTTLED_BAMBOO)
                .pattern("#")
                .pattern("#")
                .group("sticks")
                .unlockedBy("has_bamboo", has(ModItems.MOTTLED_BAMBOO))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "stick_from_mottled_bamboo_item");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.STICK, 2)
                .define('#', ModItems.BLACK_BAMBOO)
                .pattern("#")
                .pattern("#")
                .group("sticks")
                .unlockedBy("has_bamboo", has(ModItems.BLACK_BAMBOO))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "stick_from_black_bamboo_item");

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.SCAFFOLDING, 6)
                .define('~', Items.STRING)
                .define('I', ModItems.MOTTLED_BAMBOO)
                .pattern("I~I")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_bamboo", has(ModItems.MOTTLED_BAMBOO))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "scaffolding_from_mottled_bamboo_item");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, Blocks.SCAFFOLDING, 6)
                .define('~', Items.STRING)
                .define('I', ModItems.BLACK_BAMBOO)
                .pattern("I~I")
                .pattern("I I")
                .pattern("I I")
                .unlockedBy("has_bamboo", has(ModItems.BLACK_BAMBOO))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "scaffolding_from_black_bamboo_item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CRAFTING_TABLE)
                .define('#', ModItems.MOTTLED_BAMBOO)
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_bamboo", has(ModItems.MOTTLED_BAMBOO))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "crafting_table_from_mottled_bamboo_item");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.CRAFTING_TABLE)
                .define('#', ModItems.BLACK_BAMBOO)
                .pattern("##")
                .pattern("##")
                .unlockedBy("has_bamboo", has(ModItems.BLACK_BAMBOO))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "crafting_table_from_black_bamboo_item");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.GOLDEN_CRABAPPLE)
                .define('#', Items.GOLD_INGOT)
                .define('X', ModItems.CRABAPPLE)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .unlockedBy(getHasName(ModItems.CRABAPPLE), has(ModItems.CRABAPPLE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENCHANTED_GOLDEN_CRABAPPLE)
                .define('#', Items.GOLD_BLOCK)
                .define('X', ModItems.CRABAPPLE)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .unlockedBy(getHasName(ModItems.CRABAPPLE), has(ModItems.CRABAPPLE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GOLDEN_MEI)
                .requires(Items.GOLD_NUGGET, 4)
                .requires(ModItems.MEI)
                .unlockedBy(getHasName(ModItems.MEI), has(ModItems.MEI))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_MEI_SAPLING, 1)
                .requires(ModBlocks.DOUBLE_PINK_MEI_SAPLING)
                .requires(ModBlocks.DOUBLE_WHITE_MEI_SAPLING)
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_SAPLING), has(ModBlocks.DOUBLE_PINK_MEI_SAPLING))
                .unlockedBy(getHasName(ModBlocks.DOUBLE_WHITE_MEI_SAPLING), has(ModBlocks.DOUBLE_WHITE_MEI_SAPLING))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_WEEPING_MEI_SAPLING, 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.RED_MEI_SAPLING)
                .unlockedBy(getHasName(ModBlocks.RED_MEI_SAPLING), has(ModBlocks.RED_MEI_SAPLING))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_WEEPING_MEI_SAPLING, 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.DOUBLE_WHITE_MEI_SAPLING)
                .unlockedBy(getHasName(ModBlocks.DOUBLE_WHITE_MEI_SAPLING), has(ModBlocks.DOUBLE_WHITE_MEI_SAPLING))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_WEEPING_MEI_SAPLING, 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.GREEN_CALYX_MEI_SAPLING)
                .unlockedBy(getHasName(ModBlocks.GREEN_CALYX_MEI_SAPLING), has(ModBlocks.GREEN_CALYX_MEI_SAPLING))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_WEEPING_MEI_SAPLING, 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.DOUBLE_PINK_MEI_SAPLING)
                .unlockedBy(getHasName(ModBlocks.DOUBLE_PINK_MEI_SAPLING), has(ModBlocks.DOUBLE_PINK_MEI_SAPLING))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING, 1)
                .requires(ModBlocks.PINK_WEEPING_MEI_SAPLING)
                .requires(ModBlocks.WHITE_WEEPING_MEI_SAPLING)
                .unlockedBy(getHasName(ModBlocks.PINK_WEEPING_MEI_SAPLING), has(ModBlocks.PINK_WEEPING_MEI_SAPLING))
                .unlockedBy(getHasName(ModBlocks.WHITE_WEEPING_MEI_SAPLING), has(ModBlocks.WHITE_WEEPING_MEI_SAPLING))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "versicolor_weeping_mei_sapling_from_pink_and_white_weeping_mei_sapling");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING, 1)
                .pattern(" # ")
                .pattern("# #")
                .define('#', ModBlocks.VERSICOLOR_MEI_SAPLING)
                .unlockedBy(getHasName(ModBlocks.VERSICOLOR_MEI_SAPLING), has(ModBlocks.VERSICOLOR_MEI_SAPLING))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "versicolor_weeping_mei_sapling_from_versicolor_mei_sapling");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_CAMELLIA, 2)
                .requires(ModBlocks.CAMELLIA)
                .requires(ModBlocks.WHITE_CAMELLIA)
                .unlockedBy(getHasName(ModBlocks.CAMELLIA), has(ModBlocks.CAMELLIA))
                .unlockedBy(getHasName(ModBlocks.WHITE_CAMELLIA), has(ModBlocks.WHITE_CAMELLIA))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "versicolor_camellia_from_camellia");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_VERSICOLOR_CAMELLIA, 2)
                .requires(ModBlocks.TALL_CAMELLIA)
                .requires(ModBlocks.TALL_WHITE_CAMELLIA)
                .unlockedBy(getHasName(ModBlocks.TALL_CAMELLIA), has(ModBlocks.TALL_CAMELLIA))
                .unlockedBy(getHasName(ModBlocks.TALL_WHITE_CAMELLIA), has(ModBlocks.TALL_WHITE_CAMELLIA))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "tall_versicolor_camellia_from_tall_camellia");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_CAMELLIA, 2)
                .requires(ModBlocks.CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.CAMELLIA), has(ModBlocks.CAMELLIA))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CAMELLIA, 2)
                .requires(ModBlocks.TALL_CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.TALL_CAMELLIA), has(ModBlocks.TALL_CAMELLIA))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_WHITE_CAMELLIA, 2)
                .requires(ModBlocks.WHITE_CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.WHITE_CAMELLIA), has(ModBlocks.WHITE_CAMELLIA))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_CAMELLIA, 2)
                .requires(ModBlocks.TALL_WHITE_CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.TALL_WHITE_CAMELLIA), has(ModBlocks.TALL_WHITE_CAMELLIA))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_PINK_CAMELLIA, 2)
                .requires(ModBlocks.PINK_CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.PINK_CAMELLIA), has(ModBlocks.PINK_CAMELLIA))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_CAMELLIA, 2)
                .requires(ModBlocks.TALL_PINK_CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.TALL_PINK_CAMELLIA), has(ModBlocks.TALL_PINK_CAMELLIA))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TALL_VERSICOLOR_CAMELLIA, 2)
                .requires(ModBlocks.VERSICOLOR_CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.VERSICOLOR_CAMELLIA), has(ModBlocks.VERSICOLOR_CAMELLIA))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "tall_versicolor_camellia_from_versicolor_camellia");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERSICOLOR_CAMELLIA, 2)
                .requires(ModBlocks.TALL_VERSICOLOR_CAMELLIA, 2)
                .unlockedBy(getHasName(ModBlocks.TALL_VERSICOLOR_CAMELLIA), has(ModBlocks.TALL_VERSICOLOR_CAMELLIA))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "versicolor_camellia_from_tall_versicolor_camellia");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GOLD_BACKED_SCARLET_MUM, 2)
                .requires(ModBlocks.CHRYSANTHEMUM)
                .requires(ModBlocks.XIHU_LIUYUE)
                .unlockedBy(getHasName(ModBlocks.CHRYSANTHEMUM), has(ModBlocks.CHRYSANTHEMUM))
                .unlockedBy(getHasName(ModBlocks.XIHU_LIUYUE), has(ModBlocks.XIHU_LIUYUE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_PINK_CHINESE_ROSE, 2)
                .requires(ModBlocks.CHINESE_ROSE)
                .requires(ModBlocks.PINK_CHINESE_ROSE)
                .unlockedBy(getHasName(ModBlocks.CHINESE_ROSE), has(ModBlocks.CHINESE_ROSE))
                .unlockedBy(getHasName(ModBlocks.PINK_CHINESE_ROSE), has(ModBlocks.PINK_CHINESE_ROSE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_YELLOW_CHINESE_ROSE, 2)
                .requires(ModBlocks.CHINESE_ROSE)
                .requires(ModBlocks.YELLOW_CHINESE_ROSE)
                .unlockedBy(getHasName(ModBlocks.CHINESE_ROSE), has(ModBlocks.CHINESE_ROSE))
                .unlockedBy(getHasName(ModBlocks.YELLOW_CHINESE_ROSE), has(ModBlocks.YELLOW_CHINESE_ROSE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_WHITE_CHINESE_ROSE, 2)
                .requires(ModBlocks.CHINESE_ROSE)
                .requires(ModBlocks.WHITE_CHINESE_ROSE)
                .unlockedBy(getHasName(ModBlocks.CHINESE_ROSE), has(ModBlocks.CHINESE_ROSE))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE), has(ModBlocks.WHITE_CHINESE_ROSE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_WHITE_CHINESE_ROSE, 2)
                .requires(ModBlocks.PINK_CHINESE_ROSE)
                .requires(ModBlocks.WHITE_CHINESE_ROSE)
                .unlockedBy(getHasName(ModBlocks.PINK_CHINESE_ROSE), has(ModBlocks.PINK_CHINESE_ROSE))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE), has(ModBlocks.WHITE_CHINESE_ROSE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_WHITE_CHINESE_ROSE, 2)
                .requires(ModBlocks.YELLOW_CHINESE_ROSE)
                .requires(ModBlocks.WHITE_CHINESE_ROSE)
                .unlockedBy(getHasName(ModBlocks.YELLOW_CHINESE_ROSE), has(ModBlocks.YELLOW_CHINESE_ROSE))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE), has(ModBlocks.WHITE_CHINESE_ROSE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_WHITE_CHINESE_ROSE, 2)
                .requires(ModBlocks.PURPLE_CHINESE_ROSE)
                .requires(ModBlocks.WHITE_CHINESE_ROSE)
                .unlockedBy(getHasName(ModBlocks.PURPLE_CHINESE_ROSE), has(ModBlocks.PURPLE_CHINESE_ROSE))
                .unlockedBy(getHasName(ModBlocks.WHITE_CHINESE_ROSE), has(ModBlocks.WHITE_CHINESE_ROSE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_PEONY, 3)
                .requires(ModBlocks.PEONY)
                .requires(ModBlocks.LIGHT_PINK_PEONY)
                .requires(ModBlocks.VIOLET_PINK_PEONY)
                .unlockedBy(getHasName(ModBlocks.PEONY), has(ModBlocks.PEONY))
                .unlockedBy(getHasName(ModBlocks.LIGHT_PINK_PEONY), has(ModBlocks.LIGHT_PINK_PEONY))
                .unlockedBy(getHasName(ModBlocks.VIOLET_PINK_PEONY), has(ModBlocks.VIOLET_PINK_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VERMILION_PEONY, 3)
                .requires(ModBlocks.RED_PEONY)
                .requires(ModBlocks.LIGHT_RED_PEONY)
                .requires(ModBlocks.INK_RED_PEONY)
                .unlockedBy(getHasName(ModBlocks.RED_PEONY), has(ModBlocks.RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.LIGHT_RED_PEONY), has(ModBlocks.LIGHT_RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.INK_RED_PEONY), has(ModBlocks.INK_RED_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.VIOLET_PEONY, 3)
                .requires(ModBlocks.PURPLE_PEONY)
                .requires(ModBlocks.LIGHT_PURPLE_PEONY)
                .requires(ModBlocks.INK_PURPLE_PEONY)
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY), has(ModBlocks.PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.LIGHT_PURPLE_PEONY), has(ModBlocks.LIGHT_PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.INK_PURPLE_PEONY), has(ModBlocks.INK_PURPLE_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.GOLDEN_PEONY, 3)
                .requires(ModBlocks.YELLOW_PEONY)
                .requires(ModBlocks.LIGHT_YELLOW_PEONY)
                .requires(ModBlocks.OCHRE_YELLOW_PEONY)
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY), has(ModBlocks.YELLOW_PEONY))
                .unlockedBy(getHasName(ModBlocks.LIGHT_YELLOW_PEONY), has(ModBlocks.LIGHT_YELLOW_PEONY))
                .unlockedBy(getHasName(ModBlocks.OCHRE_YELLOW_PEONY), has(ModBlocks.OCHRE_YELLOW_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.COLORFUL_PEONY, 4)
                .requires(ModBlocks.PEONY)
                .requires(ModBlocks.RED_PEONY)
                .requires(ModBlocks.PURPLE_PEONY)
                .requires(ModBlocks.YELLOW_PEONY)
                .unlockedBy(getHasName(ModBlocks.PEONY), has(ModBlocks.PEONY))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY), has(ModBlocks.RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY), has(ModBlocks.PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY), has(ModBlocks.YELLOW_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.LIGHT_COLORFUL_PEONY, 4)
                .requires(ModBlocks.LIGHT_PINK_PEONY)
                .requires(ModBlocks.LIGHT_RED_PEONY)
                .requires(ModBlocks.LIGHT_PURPLE_PEONY)
                .requires(ModBlocks.LIGHT_YELLOW_PEONY)
                .unlockedBy(getHasName(ModBlocks.LIGHT_PINK_PEONY), has(ModBlocks.LIGHT_PINK_PEONY))
                .unlockedBy(getHasName(ModBlocks.LIGHT_RED_PEONY), has(ModBlocks.LIGHT_RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.LIGHT_PURPLE_PEONY), has(ModBlocks.LIGHT_PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.LIGHT_YELLOW_PEONY), has(ModBlocks.LIGHT_YELLOW_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.INK_COLORFUL_PEONY, 4)
                .requires(ModBlocks.VIOLET_PINK_PEONY)
                .requires(ModBlocks.INK_RED_PEONY)
                .requires(ModBlocks.INK_PURPLE_PEONY)
                .requires(ModBlocks.OCHRE_YELLOW_PEONY)
                .unlockedBy(getHasName(ModBlocks.VIOLET_PINK_PEONY), has(ModBlocks.VIOLET_PINK_PEONY))
                .unlockedBy(getHasName(ModBlocks.INK_RED_PEONY), has(ModBlocks.INK_RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.INK_PURPLE_PEONY), has(ModBlocks.INK_PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.OCHRE_YELLOW_PEONY), has(ModBlocks.OCHRE_YELLOW_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_WHITE_PEONY, 4)
                .requires(ModBlocks.WHITE_PEONY)
                .requires(ModBlocks.RED_PEONY)
                .requires(ModBlocks.PURPLE_PEONY)
                .requires(ModBlocks.YELLOW_PEONY)
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY), has(ModBlocks.WHITE_PEONY))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY), has(ModBlocks.RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY), has(ModBlocks.PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY), has(ModBlocks.YELLOW_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_WHITE_PEONY, 4)
                .requires(ModBlocks.PEONY)
                .requires(ModBlocks.WHITE_PEONY)
                .requires(ModBlocks.PURPLE_PEONY)
                .requires(ModBlocks.YELLOW_PEONY)
                .unlockedBy(getHasName(ModBlocks.PEONY), has(ModBlocks.PEONY))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY), has(ModBlocks.WHITE_PEONY))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY), has(ModBlocks.PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY), has(ModBlocks.YELLOW_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.YELLOW_WHITE_PEONY, 4)
                .requires(ModBlocks.PEONY)
                .requires(ModBlocks.RED_PEONY)
                .requires(ModBlocks.WHITE_PEONY)
                .requires(ModBlocks.YELLOW_PEONY)
                .unlockedBy(getHasName(ModBlocks.PEONY), has(ModBlocks.PEONY))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY), has(ModBlocks.RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY), has(ModBlocks.WHITE_PEONY))
                .unlockedBy(getHasName(ModBlocks.YELLOW_PEONY), has(ModBlocks.YELLOW_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PURPLE_WHITE_PEONY, 4)
                .requires(ModBlocks.PEONY)
                .requires(ModBlocks.RED_PEONY)
                .requires(ModBlocks.PURPLE_PEONY)
                .requires(ModBlocks.WHITE_PEONY)
                .unlockedBy(getHasName(ModBlocks.PEONY), has(ModBlocks.PEONY))
                .unlockedBy(getHasName(ModBlocks.RED_PEONY), has(ModBlocks.RED_PEONY))
                .unlockedBy(getHasName(ModBlocks.PURPLE_PEONY), has(ModBlocks.PURPLE_PEONY))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY), has(ModBlocks.WHITE_PEONY))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WU_HUA_LONG_YU_PEONY, 2)
                .requires(ModBlocks.VIOLET_PINK_PEONY)
                .requires(ModBlocks.WHITE_PEONY)
                .unlockedBy(getHasName(ModBlocks.VIOLET_PINK_PEONY), has(ModBlocks.VIOLET_PINK_PEONY))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEONY), has(ModBlocks.WHITE_PEONY))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.TWO_QIAO_PEONY, 2)
                .requires(ModBlocks.WEI_ZI_PEONY)
                .requires(ModBlocks.ZHAO_PINK_PEONY)
                .unlockedBy(getHasName(ModBlocks.WEI_ZI_PEONY), has(ModBlocks.WEI_ZI_PEONY))
                .unlockedBy(getHasName(ModBlocks.ZHAO_PINK_PEONY), has(ModBlocks.ZHAO_PINK_PEONY))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.VERSICOLOR_PEONY)
                .pattern(" d ")
                .pattern("zly")
                .pattern(" w ")
                .define('y', ModBlocks.YAO_HUANG_PEONY)
                .define('w', ModBlocks.WEI_ZI_PEONY)
                .define('z', ModBlocks.ZHAO_PINK_PEONY)
                .define('d', ModBlocks.DOU_GREEN_PEONY)
                .define('l', ModBlocks.LUOYANG_RED_PEONY)
                .unlockedBy(getHasName(ModBlocks.YAO_HUANG_PEONY), has(ModBlocks.YAO_HUANG_PEONY))
                .unlockedBy(getHasName(ModBlocks.WEI_ZI_PEONY), has(ModBlocks.WEI_ZI_PEONY))
                .unlockedBy(getHasName(ModBlocks.ZHAO_PINK_PEONY), has(ModBlocks.ZHAO_PINK_PEONY))
                .unlockedBy(getHasName(ModBlocks.DOU_GREEN_PEONY), has(ModBlocks.DOU_GREEN_PEONY))
                .unlockedBy(getHasName(ModBlocks.LUOYANG_RED_PEONY), has(ModBlocks.LUOYANG_RED_PEONY))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CRAPE_MYRTLE, 2)
                .requires(ModBlocks.CRAPE_MYRTLE_SAPLING, 2)
                .unlockedBy(getHasName(ModBlocks.CRAPE_MYRTLE_SAPLING), has(ModBlocks.CRAPE_MYRTLE_SAPLING))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.CRAPE_MYRTLE_SAPLING, 2)
                .requires(ModBlocks.CRAPE_MYRTLE, 2)
                .unlockedBy(getHasName(ModBlocks.CRAPE_MYRTLE), has(ModBlocks.CRAPE_MYRTLE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_CRAPE_MYRTLE, 2)
                .requires(ModBlocks.RED_CRAPE_MYRTLE_SAPLING, 2)
                .unlockedBy(getHasName(ModBlocks.RED_CRAPE_MYRTLE_SAPLING), has(ModBlocks.RED_CRAPE_MYRTLE_SAPLING))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RED_CRAPE_MYRTLE_SAPLING, 2)
                .requires(ModBlocks.RED_CRAPE_MYRTLE, 2)
                .unlockedBy(getHasName(ModBlocks.RED_CRAPE_MYRTLE), has(ModBlocks.RED_CRAPE_MYRTLE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_CRAPE_MYRTLE, 2)
                .requires(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING, 2)
                .unlockedBy(getHasName(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING), has(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.PINK_CRAPE_MYRTLE_SAPLING, 2)
                .requires(ModBlocks.PINK_CRAPE_MYRTLE, 2)
                .unlockedBy(getHasName(ModBlocks.PINK_CRAPE_MYRTLE), has(ModBlocks.PINK_CRAPE_MYRTLE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_CRAPE_MYRTLE, 2)
                .requires(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING, 2)
                .unlockedBy(getHasName(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING), has(ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING, 2)
                .requires(ModBlocks.WHITE_CRAPE_MYRTLE, 2)
                .unlockedBy(getHasName(ModBlocks.WHITE_CRAPE_MYRTLE), has(ModBlocks.WHITE_CRAPE_MYRTLE))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.RED_DYE)
                .requires(ModTags.Items.RED_DYE)
                .group("red_dye")
                .unlockedBy("has_red_dye_item", has(ModTags.Items.RED_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "red_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PINK_DYE)
                .requires(ModTags.Items.PINK_DYE)
                .group("pink_dye")
                .unlockedBy("has_pink_dye_item", has(ModTags.Items.PINK_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "pink_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.WHITE_DYE)
                .requires(ModTags.Items.WHITE_DYE)
                .group("white_dye")
                .unlockedBy("has_white_dye_item", has(ModTags.Items.WHITE_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "white_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.YELLOW_DYE)
                .requires(ModTags.Items.YELLOW_DYE)
                .group("yellow_dye")
                .unlockedBy("has_yellow_dye_item", has(ModTags.Items.YELLOW_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "yellow_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                .requires(ModTags.Items.ORANGE_DYE)
                .group("orange_dye")
                .unlockedBy("has_orange_dye_item", has(ModTags.Items.ORANGE_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "orange_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.PURPLE_DYE)
                .requires(ModTags.Items.PURPLE_DYE)
                .group("purple_dye")
                .unlockedBy("has_purple_dye_item", has(ModTags.Items.PURPLE_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "purple_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .requires(ModTags.Items.MAGENTA_DYE)
                .group("purple_dye")
                .unlockedBy("has_magenta_dye_item", has(ModTags.Items.MAGENTA_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "magenta_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIME_DYE)
                .requires(ModTags.Items.LIME_DYE)
                .group("lime_dye")
                .unlockedBy("has_lime_dye_item", has(ModTags.Items.LIME_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "lime_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GREEN_DYE)
                .requires(ModTags.Items.GREEN_DYE)
                .group("green_dye")
                .unlockedBy("has_green_dye_item", has(ModTags.Items.GREEN_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "green_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .requires(ModTags.Items.LIGHT_BLUE_DYE)
                .group("light_blue_dye")
                .unlockedBy("has_light_blue_dye_item", has(ModTags.Items.LIGHT_BLUE_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "light_blue_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLUE_DYE)
                .requires(ModTags.Items.BLUE_DYE)
                .group("blue_dye")
                .unlockedBy("has_blue_dye_item", has(ModTags.Items.BLUE_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "blue_dye_from_flowers");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.BLACK_DYE)
                .requires(ModTags.Items.BLACK_DYE)
                .group("black_dye")
                .unlockedBy("has_black_dye_item", has(ModTags.Items.BLACK_DYE))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "black_dye_from_flowers");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.BAMBOO_SHOOTS_SOUP)
                .requires(ModItems.PEELED_BAMBOO_SHOOTS)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModItems.PEELED_BAMBOO_SHOOTS), has(ModItems.PEELED_BAMBOO_SHOOTS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.LOTUS_ROOT_SOUP)
                .requires(ModItems.LOTUS_ROOT)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModItems.LOTUS_ROOT), has(ModItems.LOTUS_ROOT))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.LOTUS_SEED, 5)
                .requires(ModItems.LOTUS_SEED_POD)
                .unlockedBy(getHasName(ModItems.LOTUS_SEED_POD), has(ModItems.LOTUS_SEED_POD))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.LOTUS_SEED_SOUP)
                .requires(ModItems.LOTUS_SEED, 5)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModItems.LOTUS_SEED), has(ModItems.LOTUS_SEED))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.MUXUE_SOUP)
                .requires(ModBlocks.MUXUE_GRASS, 2)
                .requires(Items.BOWL)
                .unlockedBy(getHasName(ModBlocks.MUXUE_GRASS), has(ModBlocks.MUXUE_GRASS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEI_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.MEI_LEAVES)
                .unlockedBy("has_mei_leaves", has(CommonTags.Items.MEI_LEAVES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MEI_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.WEEPING_MEI)
                .unlockedBy("has_weeping_mei", has(CommonTags.Items.WEEPING_MEI))
                .save(recipeOutput, MoreOrnPlants.MODID + ":" + "mei_xiangnang_from_weeping_mei");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OSMANTHUS_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.OSMANTHUS_LEAVES)
                .unlockedBy("has_osmanthus_leaves", has(CommonTags.Items.OSMANTHUS_LEAVES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CYMBIDIUM_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.CYMBIDIUM)
                .unlockedBy("has_cymbidium", has(CommonTags.Items.CYMBIDIUM))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WINTERSWEET_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ModBlocks.WINTERSWEET)
                .unlockedBy("has_wintersweet", has(ModBlocks.WINTERSWEET))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LILAC_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', Items.LILAC)
                .unlockedBy("has_lilac", has(Items.LILAC))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHINESE_ROSE_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.CHINESE_ROSE)
                .unlockedBy("has_chinese_rose", has(CommonTags.Items.CHINESE_ROSE))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.RUGOSA_ROSE_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', Items.ROSE_BUSH)
                .unlockedBy("has_rose_bush", has(Items.ROSE_BUSH))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.APRICOT_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.APRICOT_LEAVES)
                .unlockedBy("has_apricot_leaves", has(CommonTags.Items.APRICOT_LEAVES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEACH_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.PEACH_LEAVES)
                .unlockedBy("has_peach_leaves", has(CommonTags.Items.PEACH_LEAVES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEAR_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', ModBlocks.PEAR_LEAVES)
                .unlockedBy("has_pear_leaves", has(ModBlocks.PEAR_LEAVES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.LOTUS_XIANGNANG)
                .pattern(" # ")
                .pattern("#*#")
                .pattern(" # ")
                .define('#', Items.STRING)
                .define('*', CommonTags.Items.LOTUS)
                .unlockedBy("has_lotus", has(CommonTags.Items.LOTUS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PEACH_WOODEN_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModTags.Items.PEACH_LOGS)
                .define('/', Items.STICK)
                .unlockedBy("has_peach_logs", has(ModTags.Items.PEACH_LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CAMPHOR_WOODEN_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModTags.Items.CAMPHOR_LOGS)
                .define('/', Items.STICK)
                .unlockedBy("has_camphor_logs", has(ModTags.Items.CAMPHOR_LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.CHINESE_PARASOL_WOODEN_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModTags.Items.CHINESE_PARASOL_LOGS)
                .define('/', Items.STICK)
                .unlockedBy("has_chinese_parasol_logs", has(ModTags.Items.CHINESE_PARASOL_LOGS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIYING_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModItems.ZIYING_BEAD)
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD), has(ModItems.ZIYING_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SUYU_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModItems.SUYU_BEAD)
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.SUYU_BEAD), has(ModItems.SUYU_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ZIYU_YUANYANG_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("/")
                .define('#', ModItems.ZIYU_YUANYANG_BEAD)
                .define('/', Items.STICK)
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD), has(ModItems.ZIYU_YUANYANG_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_AXE)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD), has(ModItems.ZIYING_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_AXE)
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD), has(ModItems.SUYU_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_AXE)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD)
                .pattern("XX")
                .pattern("X#")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD), has(ModItems.ZIYU_YUANYANG_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_PICKAXE)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD), has(ModItems.ZIYING_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_PICKAXE)
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD), has(ModItems.SUYU_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_PICKAXE)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD)
                .pattern("XXX")
                .pattern(" # ")
                .pattern(" # ")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD), has(ModItems.ZIYU_YUANYANG_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_HOE)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD), has(ModItems.ZIYING_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_HOE)
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD), has(ModItems.SUYU_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_HOE)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD)
                .pattern("XX")
                .pattern(" #")
                .pattern(" #")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD), has(ModItems.ZIYU_YUANYANG_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYING_SHOVEL)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYING_BEAD)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD), has(ModItems.ZIYING_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.SUYU_SHOVEL)
                .define('#', Items.STICK)
                .define('X', ModItems.SUYU_BEAD)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(ModItems.SUYU_BEAD), has(ModItems.SUYU_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.ZIYU_YUANYANG_SHOVEL)
                .define('#', Items.STICK)
                .define('X', ModItems.ZIYU_YUANYANG_BEAD)
                .pattern("X")
                .pattern("#")
                .pattern("#")
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD), has(ModItems.ZIYU_YUANYANG_BEAD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CLOUD_APRICOT_SAPLING)
                .pattern(" P ")
                .pattern("PCW")
                .pattern(" W ")
                .define('P', ModBlocks.PINK_APRICOT_SAPLING)
                .define('W', ModBlocks.WHITE_APRICOT_SAPLING)
                .define('C', ModItems.ZIYU_YUANYANG_BEAD)
                .unlockedBy(getHasName(ModBlocks.PINK_APRICOT_SAPLING), has(ModBlocks.PINK_APRICOT_SAPLING))
                .unlockedBy(getHasName(ModBlocks.WHITE_APRICOT_SAPLING), has(ModBlocks.WHITE_APRICOT_SAPLING))
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD), has(ModItems.ZIYU_YUANYANG_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.IMMORTAL_PEACH_SAPLING)
                .pattern(" O ")
                .pattern("WCB")
                .pattern(" O ")
                .define('O', ModBlocks.ORNAMENTAL_PEACH_SAPLING)
                .define('W', ModBlocks.WILD_PEACH_SAPLING)
                .define('B', ModBlocks.WHITE_PEACH_SAPLING)
                .define('C', ModItems.ZIYU_YUANYANG_BEAD)
                .unlockedBy(getHasName(ModBlocks.ORNAMENTAL_PEACH_SAPLING), has(ModBlocks.ORNAMENTAL_PEACH_SAPLING))
                .unlockedBy(getHasName(ModBlocks.WILD_PEACH_SAPLING), has(ModBlocks.WILD_PEACH_SAPLING))
                .unlockedBy(getHasName(ModBlocks.WHITE_PEACH_SAPLING), has(ModBlocks.WHITE_PEACH_SAPLING))
                .unlockedBy(getHasName(ModItems.ZIYU_YUANYANG_BEAD), has(ModItems.ZIYU_YUANYANG_BEAD))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIYU_YUANYANG_BEAD)
                .requires(ModItems.ZIYING_BEAD)
                .requires(ModItems.SUYU_BEAD)
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD), has(ModItems.ZIYING_BEAD))
                .unlockedBy(getHasName(ModItems.SUYU_BEAD), has(ModItems.SUYU_BEAD))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ZIYING_BEADLIGHT)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.ZIYING_BEAD)
                .unlockedBy(getHasName(ModItems.ZIYING_BEAD), has(ModItems.ZIYING_BEAD))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUYU_BEADLIGHT)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .define('#', ModItems.SUYU_BEAD)
                .unlockedBy(getHasName(ModItems.SUYU_BEAD), has(ModItems.SUYU_BEAD))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ZIYING_BEAD, 6)
                .requires(ModBlocks.ZIYING_BEADLIGHT)
                .unlockedBy(getHasName(ModBlocks.ZIYING_BEADLIGHT), has(ModBlocks.ZIYING_BEADLIGHT))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SUYU_BEAD, 6)
                .requires(ModBlocks.SUYU_BEADLIGHT)
                .unlockedBy(getHasName(ModBlocks.SUYU_BEADLIGHT), has(ModBlocks.SUYU_BEADLIGHT))
                .save(recipeOutput);
    }
}
