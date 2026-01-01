package com.jinlan.moreornplants.datagen.loot;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.FlowerBlocks.PeachPinkPetalsBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusBlock;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyExplosionDecay;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    private static final LootItemCondition.Builder HAS_SHEARS_OR_SILK_TOUCH = HAS_SHEARS.or(HAS_SILK_TOUCH);
    private static final LootItemCondition.Builder HAS_NO_SHEARS_OR_SILK_TOUCH = HAS_SHEARS_OR_SILK_TOUCH.invert();
    private static final float[] NORMAL_LEAVES_STICK_CHANCES = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};

    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RED_MEI_LOG.get());
        this.dropSelf(ModBlocks.RED_MEI_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RED_MEI_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_RED_MEI_WOOD.get());
        this.dropSelf(ModBlocks.RED_MEI_PLANKS.get());
        this.dropSelf(ModBlocks.WHITE_MEI_LOG.get());
        this.dropSelf(ModBlocks.WHITE_MEI_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_WHITE_MEI_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_WHITE_MEI_WOOD.get());
        this.dropSelf(ModBlocks.WHITE_MEI_PLANKS.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_LOG.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_PLANKS.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_LOG.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get());
        this.dropSelf(ModBlocks.CRABAPPLE_LOG.get());
        this.dropSelf(ModBlocks.CRABAPPLE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CRABAPPLE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CRABAPPLE_WOOD.get());
        this.dropSelf(ModBlocks.CRABAPPLE_PLANKS.get());
        this.dropSelf(ModBlocks.APRICOT_LOG.get());
        this.dropSelf(ModBlocks.APRICOT_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_APRICOT_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_APRICOT_WOOD.get());
        this.dropSelf(ModBlocks.APRICOT_PLANKS.get());
        this.dropSelf(ModBlocks.PEACH_LOG.get());
        this.dropSelf(ModBlocks.PEACH_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PEACH_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PEACH_WOOD.get());
        this.dropSelf(ModBlocks.PEACH_PLANKS.get());
        this.dropSelf(ModBlocks.PEAR_LOG.get());
        this.dropSelf(ModBlocks.PEAR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PEAR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PEAR_WOOD.get());
        this.dropSelf(ModBlocks.PEAR_PLANKS.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_LOG.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get());
        this.dropSelf(ModBlocks.OSMANTHUS_LOG.get());
        this.dropSelf(ModBlocks.OSMANTHUS_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_OSMANTHUS_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_OSMANTHUS_WOOD.get());
        this.dropSelf(ModBlocks.OSMANTHUS_PLANKS.get());
        this.dropSelf(ModBlocks.GINKGO_LOG.get());
        this.dropSelf(ModBlocks.GINKGO_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_GINKGO_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_GINKGO_WOOD.get());
        this.dropSelf(ModBlocks.GINKGO_PLANKS.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_LOG.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_PLANKS.get());
        this.dropSelf(ModBlocks.SWEETGUM_LOG.get());
        this.dropSelf(ModBlocks.SWEETGUM_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_SWEETGUM_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_SWEETGUM_WOOD.get());
        this.dropSelf(ModBlocks.SWEETGUM_PLANKS.get());
        this.dropSelf(ModBlocks.CAMPHOR_LOG.get());
        this.dropSelf(ModBlocks.CAMPHOR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CAMPHOR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CAMPHOR_WOOD.get());
        this.dropSelf(ModBlocks.CAMPHOR_PLANKS.get());
        this.dropSelf(ModBlocks.DOVE_TREE_LOG.get());
        this.dropSelf(ModBlocks.DOVE_TREE_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_DOVE_TREE_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_DOVE_TREE_WOOD.get());
        this.dropSelf(ModBlocks.DOVE_TREE_PLANKS.get());
        this.dropSelf(ModBlocks.CHINABERRY_LOG.get());
        this.dropSelf(ModBlocks.CHINABERRY_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_CHINABERRY_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_CHINABERRY_WOOD.get());
        this.dropSelf(ModBlocks.CHINABERRY_PLANKS.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_LOG.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_DESERT_POPLAR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_DESERT_POPLAR_WOOD.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_PLANKS.get());
        this.dropSelf(ModBlocks.CRAPE_MYRTLE_LOG.get());
        this.dropSelf(ModBlocks.CRAPE_MYRTLE_WOOD.get());
        this.dropSelf(ModBlocks.WEEPING_CRABAPPLE.get());

        this.dropSelf(ModBlocks.RED_MEI_STAIRS.get());
        this.dropSelf(ModBlocks.RED_MEI_BUTTON.get());
        this.dropSelf(ModBlocks.RED_MEI_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.RED_MEI_FENCE.get());
        this.dropSelf(ModBlocks.RED_MEI_FENCE_GATE.get());
        this.dropSelf(ModBlocks.WHITE_MEI_STAIRS.get());
        this.dropSelf(ModBlocks.WHITE_MEI_BUTTON.get());
        this.dropSelf(ModBlocks.WHITE_MEI_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.WHITE_MEI_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_MEI_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_STAIRS.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_BUTTON.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_FENCE.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CRABAPPLE_STAIRS.get());
        this.dropSelf(ModBlocks.CRABAPPLE_BUTTON.get());
        this.dropSelf(ModBlocks.CRABAPPLE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CRABAPPLE_FENCE.get());
        this.dropSelf(ModBlocks.CRABAPPLE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.APRICOT_STAIRS.get());
        this.dropSelf(ModBlocks.APRICOT_BUTTON.get());
        this.dropSelf(ModBlocks.APRICOT_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.APRICOT_FENCE.get());
        this.dropSelf(ModBlocks.APRICOT_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PEACH_STAIRS.get());
        this.dropSelf(ModBlocks.PEACH_BUTTON.get());
        this.dropSelf(ModBlocks.PEACH_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PEACH_FENCE.get());
        this.dropSelf(ModBlocks.PEACH_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PEAR_STAIRS.get());
        this.dropSelf(ModBlocks.PEAR_BUTTON.get());
        this.dropSelf(ModBlocks.PEAR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PEAR_FENCE.get());
        this.dropSelf(ModBlocks.PEAR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_STAIRS.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_BUTTON.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_FENCE.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.OSMANTHUS_STAIRS.get());
        this.dropSelf(ModBlocks.OSMANTHUS_BUTTON.get());
        this.dropSelf(ModBlocks.OSMANTHUS_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.OSMANTHUS_FENCE.get());
        this.dropSelf(ModBlocks.OSMANTHUS_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GINKGO_STAIRS.get());
        this.dropSelf(ModBlocks.GINKGO_BUTTON.get());
        this.dropSelf(ModBlocks.GINKGO_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GINKGO_FENCE.get());
        this.dropSelf(ModBlocks.GINKGO_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_STAIRS.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_BUTTON.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_FENCE.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_FENCE_GATE.get());
        this.dropSelf(ModBlocks.SWEETGUM_STAIRS.get());
        this.dropSelf(ModBlocks.SWEETGUM_BUTTON.get());
        this.dropSelf(ModBlocks.SWEETGUM_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.SWEETGUM_FENCE.get());
        this.dropSelf(ModBlocks.SWEETGUM_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CAMPHOR_STAIRS.get());
        this.dropSelf(ModBlocks.CAMPHOR_BUTTON.get());
        this.dropSelf(ModBlocks.CAMPHOR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CAMPHOR_FENCE.get());
        this.dropSelf(ModBlocks.CAMPHOR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DOVE_TREE_STAIRS.get());
        this.dropSelf(ModBlocks.DOVE_TREE_BUTTON.get());
        this.dropSelf(ModBlocks.DOVE_TREE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.DOVE_TREE_FENCE.get());
        this.dropSelf(ModBlocks.DOVE_TREE_FENCE_GATE.get());
        this.dropSelf(ModBlocks.CHINABERRY_STAIRS.get());
        this.dropSelf(ModBlocks.CHINABERRY_BUTTON.get());
        this.dropSelf(ModBlocks.CHINABERRY_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.CHINABERRY_FENCE.get());
        this.dropSelf(ModBlocks.CHINABERRY_FENCE_GATE.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_STAIRS.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_BUTTON.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_FENCE.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_FENCE_GATE.get());

        this.add(ModBlocks.RED_MEI_SLAB.get(),
                createSlabItemTable(ModBlocks.RED_MEI_SLAB.get()));
        this.add(ModBlocks.WHITE_MEI_SLAB.get(),
                createSlabItemTable(ModBlocks.WHITE_MEI_SLAB.get()));
        this.add(ModBlocks.GREEN_CALYX_MEI_SLAB.get(),
                createSlabItemTable(ModBlocks.GREEN_CALYX_MEI_SLAB.get()));
        this.add(ModBlocks.DOUBLE_PINK_MEI_SLAB.get(),
                createSlabItemTable(ModBlocks.DOUBLE_PINK_MEI_SLAB.get()));
        this.add(ModBlocks.CRABAPPLE_SLAB.get(),
                createSlabItemTable(ModBlocks.CRABAPPLE_SLAB.get()));
        this.add(ModBlocks.APRICOT_SLAB.get(),
                createSlabItemTable(ModBlocks.APRICOT_SLAB.get()));
        this.add(ModBlocks.PEACH_SLAB.get(),
                createSlabItemTable(ModBlocks.PEACH_SLAB.get()));
        this.add(ModBlocks.PEAR_SLAB.get(),
                createSlabItemTable(ModBlocks.PEAR_SLAB.get()));
        this.add(ModBlocks.PURPLE_LEAF_PLUM_SLAB.get(),
                createSlabItemTable(ModBlocks.PURPLE_LEAF_PLUM_SLAB.get()));
        this.add(ModBlocks.OSMANTHUS_SLAB.get(),
                createSlabItemTable(ModBlocks.OSMANTHUS_SLAB.get()));
        this.add(ModBlocks.GINKGO_SLAB.get(),
                createSlabItemTable(ModBlocks.GINKGO_SLAB.get()));
        this.add(ModBlocks.CHINESE_PARASOL_SLAB.get(),
                createSlabItemTable(ModBlocks.CHINESE_PARASOL_SLAB.get()));
        this.add(ModBlocks.SWEETGUM_SLAB.get(),
                createSlabItemTable(ModBlocks.SWEETGUM_SLAB.get()));
        this.add(ModBlocks.CAMPHOR_SLAB.get(),
                createSlabItemTable(ModBlocks.CAMPHOR_SLAB.get()));
        this.add(ModBlocks.DOVE_TREE_SLAB.get(),
                createSlabItemTable(ModBlocks.DOVE_TREE_SLAB.get()));
        this.add(ModBlocks.CHINABERRY_SLAB.get(),
                createSlabItemTable(ModBlocks.CHINABERRY_SLAB.get()));
        this.add(ModBlocks.DESERT_POPLAR_SLAB.get(),
                createSlabItemTable(ModBlocks.DESERT_POPLAR_SLAB.get()));

        this.dropSelf(ModBlocks.RED_MEI_TRAPDOOR.get());
        this.dropSelf(ModBlocks.WHITE_MEI_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_TRAPDOOR.get());
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CRABAPPLE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.APRICOT_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PEACH_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PEAR_TRAPDOOR.get());
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.OSMANTHUS_TRAPDOOR.get());
        this.dropSelf(ModBlocks.GINKGO_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_TRAPDOOR.get());
        this.dropSelf(ModBlocks.SWEETGUM_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CAMPHOR_TRAPDOOR.get());
        this.dropSelf(ModBlocks.DOVE_TREE_TRAPDOOR.get());
        this.dropSelf(ModBlocks.CHINABERRY_TRAPDOOR.get());
        this.dropSelf(ModBlocks.DESERT_POPLAR_TRAPDOOR.get());

        this.add(ModBlocks.RED_MEI_DOOR.get(),
                createDoorTable(ModBlocks.RED_MEI_DOOR.get()));
        this.add(ModBlocks.WHITE_MEI_DOOR.get(),
                createDoorTable(ModBlocks.WHITE_MEI_DOOR.get()));
        this.add(ModBlocks.GREEN_CALYX_MEI_DOOR.get(),
                createDoorTable(ModBlocks.GREEN_CALYX_MEI_DOOR.get()));
        this.add(ModBlocks.DOUBLE_PINK_MEI_DOOR.get(),
                createDoorTable(ModBlocks.DOUBLE_PINK_MEI_DOOR.get()));
        this.add(ModBlocks.CRABAPPLE_DOOR.get(),
                createDoorTable(ModBlocks.CRABAPPLE_DOOR.get()));
        this.add(ModBlocks.APRICOT_DOOR.get(),
                createDoorTable(ModBlocks.APRICOT_DOOR.get()));
        this.add(ModBlocks.PEACH_DOOR.get(),
                createDoorTable(ModBlocks.PEACH_DOOR.get()));
        this.add(ModBlocks.PEAR_DOOR.get(),
                createDoorTable(ModBlocks.PEAR_DOOR.get()));
        this.add(ModBlocks.PURPLE_LEAF_PLUM_DOOR.get(),
                createDoorTable(ModBlocks.PURPLE_LEAF_PLUM_DOOR.get()));
        this.add(ModBlocks.OSMANTHUS_DOOR.get(),
                createDoorTable(ModBlocks.OSMANTHUS_DOOR.get()));
        this.add(ModBlocks.GINKGO_DOOR.get(),
                createDoorTable(ModBlocks.GINKGO_DOOR.get()));
        this.add(ModBlocks.CHINESE_PARASOL_DOOR.get(),
                createDoorTable(ModBlocks.CHINESE_PARASOL_DOOR.get()));
        this.add(ModBlocks.SWEETGUM_DOOR.get(),
                createDoorTable(ModBlocks.SWEETGUM_DOOR.get()));
        this.add(ModBlocks.CAMPHOR_DOOR.get(),
                createDoorTable(ModBlocks.CAMPHOR_DOOR.get()));
        this.add(ModBlocks.DOVE_TREE_DOOR.get(),
                createDoorTable(ModBlocks.DOVE_TREE_DOOR.get()));
        this.add(ModBlocks.CHINABERRY_DOOR.get(),
                createDoorTable(ModBlocks.CHINABERRY_DOOR.get()));
        this.add(ModBlocks.DESERT_POPLAR_DOOR.get(),
                createDoorTable(ModBlocks.DESERT_POPLAR_DOOR.get()));

        this.add(ModBlocks.RED_MEI_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.RED_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WHITE_MEI_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WHITE_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GREEN_CALYX_MEI_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GREEN_CALYX_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.DOUBLE_PINK_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.VERSICOLOR_MEI_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.VERSICOLOR_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PINK_APRICOT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WEEPING_CRABAPPLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WEEPING_CRABAPPLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PINK_APRICOT_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PINK_APRICOT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WHITE_APRICOT_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WHITE_APRICOT_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ORNAMENTAL_PEACH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WILD_PEACH_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WILD_PEACH_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PEAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PEAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PURPLE_LEAF_PLUM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.ORANGE_OSMANTHUS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.ORANGE_OSMANTHUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WHITE_OSMANTHUS_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.WHITE_OSMANTHUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GOLDEN_GINKGO_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GOLDEN_GINKGO_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GREEN_GINKGO_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GREEN_GINKGO_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.YELLOW_CHINESE_PARASOL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GREEN_CHINESE_PARASOL_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.SWEETGUM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.SWEETGUM_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.CAMPHOR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CAMPHOR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.NEW_CAMPHOR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CAMPHOR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.DOVE_TREE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.DOVE_TREE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.DOVE_TREE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.CHINABERRY_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CHINABERRY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.DESERT_POPLAR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.DESERT_POPLAR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.CRAPE_MYRTLE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.CRAPE_MYRTLE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.RED_WEEPING_MEI.get(), block ->
                createLeavesDrops(block, ModBlocks.RED_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.RED_WEEPING_MEI_PLANT.get(), block ->
                createWeepingMeiPlantDrops(block, ModBlocks.RED_WEEPING_MEI.get(), ModBlocks.RED_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WHITE_WEEPING_MEI.get(), block ->
                createLeavesDrops(block, ModBlocks.WHITE_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.WHITE_WEEPING_MEI_PLANT.get(), block ->
                createWeepingMeiPlantDrops(block, ModBlocks.WHITE_WEEPING_MEI.get(), ModBlocks.WHITE_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GREEN_WEEPING_MEI.get(), block ->
                createLeavesDrops(block, ModBlocks.GREEN_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.GREEN_WEEPING_MEI_PLANT.get(), block ->
                createWeepingMeiPlantDrops(block, ModBlocks.GREEN_WEEPING_MEI.get(), ModBlocks.GREEN_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PINK_WEEPING_MEI.get(), block ->
                createLeavesDrops(block, ModBlocks.PINK_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.PINK_WEEPING_MEI_PLANT.get(), block ->
                createWeepingMeiPlantDrops(block, ModBlocks.PINK_WEEPING_MEI.get(), ModBlocks.PINK_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.VERSICOLOR_WEEPING_MEI.get(), block ->
                createLeavesDrops(block, ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.add(ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT.get(), block ->
                createWeepingMeiPlantDrops(block, ModBlocks.VERSICOLOR_WEEPING_MEI.get(), ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.RED_MEI_SIGN.get(), block -> createSingleItemTable(ModItems.RED_MEI_SIGN.get()));
        this.add(ModBlocks.RED_MEI_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.RED_MEI_SIGN.get()));
        this.add(ModBlocks.WHITE_MEI_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_MEI_SIGN.get()));
        this.add(ModBlocks.WHITE_MEI_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.WHITE_MEI_SIGN.get()));
        this.add(ModBlocks.GREEN_CALYX_MEI_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_CALYX_MEI_SIGN.get()));
        this.add(ModBlocks.GREEN_CALYX_MEI_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREEN_CALYX_MEI_SIGN.get()));
        this.add(ModBlocks.DOUBLE_PINK_MEI_SIGN.get(), block -> createSingleItemTable(ModItems.DOUBLE_PINK_MEI_SIGN.get()));
        this.add(ModBlocks.DOUBLE_PINK_MEI_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.DOUBLE_PINK_MEI_SIGN.get()));
        this.add(ModBlocks.CRABAPPLE_SIGN.get(), block -> createSingleItemTable(ModItems.CRABAPPLE_SIGN.get()));
        this.add(ModBlocks.CRABAPPLE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CRABAPPLE_SIGN.get()));
        this.add(ModBlocks.APRICOT_SIGN.get(), block -> createSingleItemTable(ModItems.APRICOT_SIGN.get()));
        this.add(ModBlocks.APRICOT_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.APRICOT_SIGN.get()));
        this.add(ModBlocks.PEACH_SIGN.get(), block -> createSingleItemTable(ModItems.PEACH_SIGN.get()));
        this.add(ModBlocks.PEACH_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PEACH_SIGN.get()));
        this.add(ModBlocks.PEAR_SIGN.get(), block -> createSingleItemTable(ModItems.PEAR_SIGN.get()));
        this.add(ModBlocks.PEAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PEAR_SIGN.get()));
        this.add(ModBlocks.PURPLE_LEAF_PLUM_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_LEAF_PLUM_SIGN.get()));
        this.add(ModBlocks.PURPLE_LEAF_PLUM_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_LEAF_PLUM_SIGN.get()));
        this.add(ModBlocks.OSMANTHUS_SIGN.get(), block -> createSingleItemTable(ModItems.OSMANTHUS_SIGN.get()));
        this.add(ModBlocks.OSMANTHUS_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.OSMANTHUS_SIGN.get()));
        this.add(ModBlocks.GINKGO_SIGN.get(), block -> createSingleItemTable(ModItems.GINKGO_SIGN.get()));
        this.add(ModBlocks.GINKGO_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.GINKGO_SIGN.get()));
        this.add(ModBlocks.CHINESE_PARASOL_SIGN.get(), block -> createSingleItemTable(ModItems.CHINESE_PARASOL_SIGN.get()));
        this.add(ModBlocks.CHINESE_PARASOL_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CHINESE_PARASOL_SIGN.get()));
        this.add(ModBlocks.SWEETGUM_SIGN.get(), block -> createSingleItemTable(ModItems.SWEETGUM_SIGN.get()));
        this.add(ModBlocks.SWEETGUM_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.SWEETGUM_SIGN.get()));
        this.add(ModBlocks.CAMPHOR_SIGN.get(), block -> createSingleItemTable(ModItems.CAMPHOR_SIGN.get()));
        this.add(ModBlocks.CAMPHOR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CAMPHOR_SIGN.get()));
        this.add(ModBlocks.DOVE_TREE_SIGN.get(), block -> createSingleItemTable(ModItems.DOVE_TREE_SIGN.get()));
        this.add(ModBlocks.DOVE_TREE_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.DOVE_TREE_SIGN.get()));
        this.add(ModBlocks.CHINABERRY_SIGN.get(), block -> createSingleItemTable(ModItems.CHINABERRY_SIGN.get()));
        this.add(ModBlocks.CHINABERRY_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.CHINABERRY_SIGN.get()));
        this.add(ModBlocks.DESERT_POPLAR_SIGN.get(), block -> createSingleItemTable(ModItems.DESERT_POPLAR_SIGN.get()));
        this.add(ModBlocks.DESERT_POPLAR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.DESERT_POPLAR_SIGN.get()));

        this.add(ModBlocks.RED_MEI_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.RED_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.RED_MEI_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.RED_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.WHITE_MEI_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.WHITE_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.WHITE_MEI_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.WHITE_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.GREEN_CALYX_MEI_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.GREEN_CALYX_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.GREEN_CALYX_MEI_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREEN_CALYX_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.DOUBLE_PINK_MEI_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.DOUBLE_PINK_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.DOUBLE_PINK_MEI_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.DOUBLE_PINK_MEI_HANGING_SIGN.get()));
        this.add(ModBlocks.CRABAPPLE_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.CRABAPPLE_HANGING_SIGN.get()));
        this.add(ModBlocks.CRABAPPLE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CRABAPPLE_HANGING_SIGN.get()));
        this.add(ModBlocks.APRICOT_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.APRICOT_HANGING_SIGN.get()));
        this.add(ModBlocks.APRICOT_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.APRICOT_HANGING_SIGN.get()));
        this.add(ModBlocks.PEACH_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PEACH_HANGING_SIGN.get()));
        this.add(ModBlocks.PEACH_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PEACH_HANGING_SIGN.get()));
        this.add(ModBlocks.PEAR_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PEAR_HANGING_SIGN.get()));
        this.add(ModBlocks.PEAR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PEAR_HANGING_SIGN.get()));
        this.add(ModBlocks.PURPLE_LEAF_PLUM_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.PURPLE_LEAF_PLUM_HANGING_SIGN.get()));
        this.add(ModBlocks.PURPLE_LEAF_PLUM_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.PURPLE_LEAF_PLUM_HANGING_SIGN.get()));
        this.add(ModBlocks.OSMANTHUS_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.OSMANTHUS_HANGING_SIGN.get()));
        this.add(ModBlocks.OSMANTHUS_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.OSMANTHUS_HANGING_SIGN.get()));
        this.add(ModBlocks.GINKGO_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.GINKGO_HANGING_SIGN.get()));
        this.add(ModBlocks.GINKGO_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GINKGO_HANGING_SIGN.get()));
        this.add(ModBlocks.CHINESE_PARASOL_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.CHINESE_PARASOL_HANGING_SIGN.get()));
        this.add(ModBlocks.CHINESE_PARASOL_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CHINESE_PARASOL_HANGING_SIGN.get()));
        this.add(ModBlocks.SWEETGUM_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.SWEETGUM_HANGING_SIGN.get()));
        this.add(ModBlocks.SWEETGUM_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.SWEETGUM_HANGING_SIGN.get()));
        this.add(ModBlocks.CAMPHOR_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.CAMPHOR_HANGING_SIGN.get()));
        this.add(ModBlocks.CAMPHOR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CAMPHOR_HANGING_SIGN.get()));
        this.add(ModBlocks.DOVE_TREE_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.DOVE_TREE_HANGING_SIGN.get()));
        this.add(ModBlocks.DOVE_TREE_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.DOVE_TREE_HANGING_SIGN.get()));
        this.add(ModBlocks.CHINABERRY_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.CHINABERRY_HANGING_SIGN.get()));
        this.add(ModBlocks.CHINABERRY_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.CHINABERRY_HANGING_SIGN.get()));
        this.add(ModBlocks.DESERT_POPLAR_HANGING_SIGN.get(), block -> createSingleItemTable(ModItems.DESERT_POPLAR_HANGING_SIGN.get()));
        this.add(ModBlocks.DESERT_POPLAR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.DESERT_POPLAR_HANGING_SIGN.get()));

        this.dropSelf(ModBlocks.RED_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_RED_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.RED_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.WHITE_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_WHITE_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.GREEN_CALYX_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_GREEN_CALYX_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.GREEN_CALYX_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_DOUBLE_PINK_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.VERSICOLOR_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_VERSICOLOR_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.VERSICOLOR_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.RED_WEEPING_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_RED_WEEPING_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.RED_WEEPING_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_WHITE_WEEPING_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.GREEN_WEEPING_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_GREEN_WEEPING_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.GREEN_WEEPING_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.PINK_WEEPING_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_PINK_WEEPING_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.PINK_WEEPING_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get());
        this.add(ModBlocks.POTTED_VERSICOLOR_WEEPING_MEI_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get()));
        this.dropSelf(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get());
        this.add(ModBlocks.POTTED_UPRIGHT_CRABAPPLE_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get()));
        this.dropSelf(ModBlocks.WEEPING_CRABAPPLE_SAPLING.get());
        this.add(ModBlocks.POTTED_WEEPING_CRABAPPLE_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.WEEPING_CRABAPPLE_SAPLING.get()));
        this.dropSelf(ModBlocks.PINK_APRICOT_SAPLING.get());
        this.add(ModBlocks.POTTED_PINK_APRICOT_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.PINK_APRICOT_SAPLING.get()));
        this.dropSelf(ModBlocks.WHITE_APRICOT_SAPLING.get());
        this.add(ModBlocks.POTTED_WHITE_APRICOT_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_APRICOT_SAPLING.get()));
        this.dropSelf(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get());
        this.add(ModBlocks.POTTED_ORNAMENTAL_PEACH_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get()));
        this.dropSelf(ModBlocks.WILD_PEACH_SAPLING.get());
        this.add(ModBlocks.POTTED_WILD_PEACH_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.WILD_PEACH_SAPLING.get()));
        this.dropSelf(ModBlocks.PEAR_SAPLING.get());
        this.add(ModBlocks.POTTED_PEAR_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.PEAR_SAPLING.get()));
        this.dropSelf(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get());
        this.add(ModBlocks.POTTED_FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get()));
        this.dropSelf(ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get());
        this.add(ModBlocks.POTTED_PURPLE_LEAF_PLUM_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get()));
        this.dropSelf(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get());
        this.add(ModBlocks.POTTED_GOLDEN_OSMANTHUS_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get()));
        this.dropSelf(ModBlocks.ORANGE_OSMANTHUS_SAPLING.get());
        this.add(ModBlocks.POTTED_ORANGE_OSMANTHUS_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.ORANGE_OSMANTHUS_SAPLING.get()));
        this.dropSelf(ModBlocks.WHITE_OSMANTHUS_SAPLING.get());
        this.add(ModBlocks.POTTED_WHITE_OSMANTHUS_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_OSMANTHUS_SAPLING.get()));
        this.dropSelf(ModBlocks.GOLDEN_GINKGO_SAPLING.get());
        this.add(ModBlocks.POTTED_GOLDEN_GINKGO_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.GOLDEN_GINKGO_SAPLING.get()));
        this.dropSelf(ModBlocks.GREEN_GINKGO_SAPLING.get());
        this.add(ModBlocks.POTTED_GREEN_GINKGO_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.GREEN_GINKGO_SAPLING.get()));
        this.dropSelf(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get());
        this.add(ModBlocks.POTTED_YELLOW_CHINESE_PARASOL_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get()));
        this.dropSelf(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get());
        this.add(ModBlocks.POTTED_GREEN_CHINESE_PARASOL_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get()));
        this.dropSelf(ModBlocks.SWEETGUM_SAPLING.get());
        this.add(ModBlocks.POTTED_SWEETGUM_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.SWEETGUM_SAPLING.get()));
        this.dropSelf(ModBlocks.CAMPHOR_SAPLING.get());
        this.add(ModBlocks.POTTED_CAMPHOR_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.CAMPHOR_SAPLING.get()));
        this.dropSelf(ModBlocks.DOVE_TREE_SAPLING.get());
        this.add(ModBlocks.POTTED_DOVE_TREE_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.DOVE_TREE_SAPLING.get()));
        this.dropSelf(ModBlocks.CHINABERRY_SAPLING.get());
        this.add(ModBlocks.POTTED_CHINABERRY_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.CHINABERRY_SAPLING.get()));
        this.dropSelf(ModBlocks.DESERT_POPLAR_SAPLING.get());
        this.add(ModBlocks.POTTED_DESERT_POPLAR_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.DESERT_POPLAR_SAPLING.get()));
        this.dropSelf(ModBlocks.CRAPE_MYRTLE_SAPLING.get());
        this.add(ModBlocks.POTTED_CRAPE_MYRTLE_SAPLING.get(),
                createPotFlowerItemTable(ModBlocks.CRAPE_MYRTLE_SAPLING.get()));

        this.dropSelf(ModBlocks.CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.GOLDEN_CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_GOLDEN_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.GOLDEN_CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.GOLD_BACKED_SCARLET_MUM.get());
        this.add(ModBlocks.POTTED_GOLD_BACKED_SCARLET_MUM.get(),
                createPotFlowerItemTable(ModBlocks.GOLD_BACKED_SCARLET_MUM.get()));
        this.dropSelf(ModBlocks.WHITE_CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_WHITE_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.GREEN_CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_GREEN_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.GREEN_CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.PURPLE_CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_PURPLE_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.PURPLE_CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_VIOLET_PINK_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.PINK_CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_PINK_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.PINK_CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get());
        this.add(ModBlocks.POTTED_LIGHT_PINK_CHRYSANTHEMUM.get(),
                createPotFlowerItemTable(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get()));
        this.dropSelf(ModBlocks.SPRING_CYMBIDIUM.get());
        this.add(ModBlocks.POTTED_SPRING_CYMBIDIUM.get(),
                createPotFlowerItemTable(ModBlocks.SPRING_CYMBIDIUM.get()));
        this.dropSelf(ModBlocks.PEONY.get());
        this.add(ModBlocks.POTTED_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.PEONY.get()));
        this.dropSelf(ModBlocks.LIGHT_PINK_PEONY.get());
        this.add(ModBlocks.POTTED_LIGHT_PINK_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.LIGHT_PINK_PEONY.get()));
        this.dropSelf(ModBlocks.VIOLET_PINK_PEONY.get());
        this.add(ModBlocks.POTTED_VIOLET_PINK_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.VIOLET_PINK_PEONY.get()));
        this.dropSelf(ModBlocks.PINK_PEONY.get());
        this.add(ModBlocks.POTTED_PINK_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.PINK_PEONY.get()));
        this.dropSelf(ModBlocks.RED_PEONY.get());
        this.add(ModBlocks.POTTED_RED_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.RED_PEONY.get()));
        this.dropSelf(ModBlocks.LIGHT_RED_PEONY.get());
        this.add(ModBlocks.POTTED_LIGHT_RED_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.LIGHT_RED_PEONY.get()));
        this.dropSelf(ModBlocks.INK_RED_PEONY.get());
        this.add(ModBlocks.POTTED_INK_RED_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.INK_RED_PEONY.get()));
        this.dropSelf(ModBlocks.VERMILION_PEONY.get());
        this.add(ModBlocks.POTTED_VERMILION_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.VERMILION_PEONY.get()));
        this.dropSelf(ModBlocks.PURPLE_PEONY.get());
        this.add(ModBlocks.POTTED_PURPLE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.PURPLE_PEONY.get()));
        this.dropSelf(ModBlocks.LIGHT_PURPLE_PEONY.get());
        this.add(ModBlocks.POTTED_LIGHT_PURPLE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.LIGHT_PURPLE_PEONY.get()));
        this.dropSelf(ModBlocks.INK_PURPLE_PEONY.get());
        this.add(ModBlocks.POTTED_INK_PURPLE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.INK_PURPLE_PEONY.get()));
        this.dropSelf(ModBlocks.VIOLET_PEONY.get());
        this.add(ModBlocks.POTTED_VIOLET_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.VIOLET_PEONY.get()));
        this.dropSelf(ModBlocks.YELLOW_PEONY.get());
        this.add(ModBlocks.POTTED_YELLOW_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.YELLOW_PEONY.get()));
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PEONY.get());
        this.add(ModBlocks.POTTED_LIGHT_YELLOW_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.LIGHT_YELLOW_PEONY.get()));
        this.dropSelf(ModBlocks.OCHRE_YELLOW_PEONY.get());
        this.add(ModBlocks.POTTED_OCHRE_YELLOW_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.OCHRE_YELLOW_PEONY.get()));
        this.dropSelf(ModBlocks.GOLDEN_PEONY.get());
        this.add(ModBlocks.POTTED_GOLDEN_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.GOLDEN_PEONY.get()));
        this.dropSelf(ModBlocks.WHITE_PEONY.get());
        this.add(ModBlocks.POTTED_WHITE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_PEONY.get()));
        this.dropSelf(ModBlocks.INK_PEONY.get());
        this.add(ModBlocks.POTTED_INK_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.INK_PEONY.get()));
        this.dropSelf(ModBlocks.BLUE_PEONY.get());
        this.add(ModBlocks.POTTED_BLUE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.BLUE_PEONY.get()));
        this.dropSelf(ModBlocks.GREEN_PEONY.get());
        this.add(ModBlocks.POTTED_GREEN_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.GREEN_PEONY.get()));
        this.dropSelf(ModBlocks.COLORFUL_PEONY.get());
        this.add(ModBlocks.POTTED_COLORFUL_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.COLORFUL_PEONY.get()));
        this.dropSelf(ModBlocks.LIGHT_COLORFUL_PEONY.get());
        this.add(ModBlocks.POTTED_LIGHT_COLORFUL_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.LIGHT_COLORFUL_PEONY.get()));
        this.dropSelf(ModBlocks.INK_COLORFUL_PEONY.get());
        this.add(ModBlocks.POTTED_INK_COLORFUL_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.INK_COLORFUL_PEONY.get()));
        this.dropSelf(ModBlocks.RED_WHITE_PEONY.get());
        this.add(ModBlocks.POTTED_RED_WHITE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.RED_WHITE_PEONY.get()));
        this.dropSelf(ModBlocks.PINK_WHITE_PEONY.get());
        this.add(ModBlocks.POTTED_PINK_WHITE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.PINK_WHITE_PEONY.get()));
        this.dropSelf(ModBlocks.YELLOW_WHITE_PEONY.get());
        this.add(ModBlocks.POTTED_YELLOW_WHITE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.YELLOW_WHITE_PEONY.get()));
        this.dropSelf(ModBlocks.PURPLE_WHITE_PEONY.get());
        this.add(ModBlocks.POTTED_PURPLE_WHITE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.PURPLE_WHITE_PEONY.get()));
        this.dropSelf(ModBlocks.WU_HUA_LONG_YU_PEONY.get());
        this.add(ModBlocks.POTTED_WU_HUA_LONG_YU_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.WU_HUA_LONG_YU_PEONY.get()));
        this.dropSelf(ModBlocks.MAUVE_PEONY.get());
        this.add(ModBlocks.POTTED_MAUVE_PEONY.get(),
                createPotFlowerItemTable(ModBlocks.MAUVE_PEONY.get()));
        this.dropSelf(ModBlocks.CAMELLIA.get());
        this.add(ModBlocks.POTTED_CAMELLIA.get(),
                createPotFlowerItemTable(ModBlocks.CAMELLIA.get()));
        this.dropSelf(ModBlocks.PINK_CAMELLIA.get());
        this.add(ModBlocks.POTTED_PINK_CAMELLIA.get(),
                createPotFlowerItemTable(ModBlocks.PINK_CAMELLIA.get()));
        this.dropSelf(ModBlocks.WHITE_CAMELLIA.get());
        this.add(ModBlocks.POTTED_WHITE_CAMELLIA.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_CAMELLIA.get()));
        this.dropSelf(ModBlocks.VERSICOLOR_CAMELLIA.get());
        this.add(ModBlocks.POTTED_VERSICOLOR_CAMELLIA.get(),
                createPotFlowerItemTable(ModBlocks.VERSICOLOR_CAMELLIA.get()));
        this.dropSelf(ModBlocks.CRIMSON_AZALEA.get());
        this.add(ModBlocks.POTTED_CRIMSON_AZALEA.get(),
                createPotFlowerItemTable(ModBlocks.CRIMSON_AZALEA.get()));
        this.dropSelf(ModBlocks.WINTER_JASMINE.get());
        this.add(ModBlocks.POTTED_WINTER_JASMINE.get(),
                createPotFlowerItemTable(ModBlocks.WINTER_JASMINE.get()));

        this.dropSelf(ModBlocks.CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.PINK_CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.YELLOW_CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.WHITE_CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.RED_PINK_CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.RED_YELLOW_CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.RED_WHITE_CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.PINK_WHITE_CHINESE_ROSE_BUSH.get());
        this.dropSelf(ModBlocks.YELLOW_WHITE_CHINESE_ROSE_BUSH.get());

        this.add(ModBlocks.POTTED_WINTERSWEET.get(),
                createPotFlowerItemTable(ModBlocks.WINTERSWEET.get()));
        this.add(ModBlocks.POTTED_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_PINK_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.PINK_CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_YELLOW_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.YELLOW_CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_WHITE_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.WHITE_CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_RED_PINK_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.RED_PINK_CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_RED_YELLOW_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.RED_YELLOW_CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_RED_WHITE_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.RED_WHITE_CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_PINK_WHITE_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.PINK_WHITE_CHINESE_ROSE.get()));
        this.add(ModBlocks.POTTED_YELLOW_WHITE_CHINESE_ROSE.get(),
                createPotFlowerItemTable(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get()));

        this.add(ModBlocks.WINTERSWEET.get(), createSinglePropConditionTable(ModBlocks.WINTERSWEET.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.TWO_QIAO_PEONY.get(), createSinglePropConditionTable(ModBlocks.TWO_QIAO_PEONY.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.VERSICOLOR_PEONY.get(), createSinglePropConditionTable(ModBlocks.VERSICOLOR_PEONY.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.PINK_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.PINK_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.YELLOW_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.YELLOW_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.WHITE_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.WHITE_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.RED_PINK_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.RED_PINK_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.RED_YELLOW_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.RED_YELLOW_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.RED_WHITE_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.RED_WHITE_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.PINK_WHITE_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.PINK_WHITE_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get(), createSinglePropConditionTable(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.CRAPE_MYRTLE.get(), createSinglePropConditionTable(ModBlocks.CRAPE_MYRTLE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        this.add(ModBlocks.COTTON_ROSE.get(), createSinglePropConditionTable(ModBlocks.COTTON_ROSE.get(),
                DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));

        this.dropSelf(ModBlocks.MOTTLED_BAMBOO.get());
        this.dropOther(ModBlocks.MOTTLED_BAMBOO_SAPLING.get(), ModItems.MOTTLED_BAMBOO_SHOOTS.get());
        this.add(ModBlocks.POTTED_MOTTLED_BAMBOO.get(),
                createPotFlowerItemTable(ModBlocks.MOTTLED_BAMBOO.get()));
        this.dropSelf(ModBlocks.BLACK_BAMBOO.get());
        this.dropOther(ModBlocks.BLACK_BAMBOO_SAPLING.get(), ModItems.BLACK_BAMBOO_SHOOTS.get());
        this.add(ModBlocks.POTTED_BLACK_BAMBOO.get(),
                createPotFlowerItemTable(ModBlocks.BLACK_BAMBOO.get()));

        this.add(ModBlocks.LOTUS.get(), block -> createLotusDrops(ModBlocks.LOTUS.get()));
        this.add(ModBlocks.WHITE_LOTUS.get(), block -> createLotusDrops(ModBlocks.WHITE_LOTUS.get()));
        this.add(ModBlocks.LOTUS_LEAF.get(), block -> LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModBlocks.LOTUS_LEAF.get().asItem()))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModItems.LOTUS_ROOT.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1))))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                                        .hasProperty(WaterLotusBlock.AGE, 2))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModItems.LOTUS_ROOT.get())
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                                        .hasProperty(WaterLotusBlock.AGE, 3))))
        );

        this.add(ModBlocks.PEACH_PINK_PETALS.get(), block -> {
            LootPool.Builder pool = LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                    .add(LootItem.lootTableItem(ModBlocks.PEACH_PINK_PETALS.get())
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F))
                                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(PeachPinkPetalsBlock.AMOUNT, 1))))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))
                                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(PeachPinkPetalsBlock.AMOUNT, 2))))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(3.0F))
                                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(PeachPinkPetalsBlock.AMOUNT, 3))))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F))
                                    .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                            .setProperties(StatePropertiesPredicate.Builder.properties()
                                                    .hasProperty(PeachPinkPetalsBlock.AMOUNT, 4))))
                            .apply(ApplyExplosionDecay.explosionDecay()));
            return LootTable.lootTable().withPool(pool);
        });

        this.dropSelf(ModBlocks.ORNAMENTAL_PEACH_PETALS.get());
        this.dropSelf(ModBlocks.WILD_PEACH_PETALS.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_LEAF_0.get());
        this.dropSelf(ModBlocks.CHINESE_PARASOL_LEAF_1.get());
        this.dropSelf(ModBlocks.SWEETGUM_LEAF_PILE_0.get());
        this.dropSelf(ModBlocks.SWEETGUM_LEAF_PILE_1.get());
        this.dropSelf(ModBlocks.GINKGO_LEAF_PILE.get());

    }

    protected LootTable.Builder createWeepingMeiPlantDrops(Block plantBlock, Block flowerBlock, Block saplingBlock, float... saplingChances) {
        LootPool.Builder shearPool = LootPool.lootPool()
                .add(LootItem.lootTableItem(flowerBlock))
                .when(HAS_SHEARS_OR_SILK_TOUCH);

        LootPool.Builder saplingPool = LootPool.lootPool()
                .add(this.applyExplosionCondition(plantBlock,
                                LootItem.lootTableItem(saplingBlock))
                        .when(BonusLevelTableCondition.bonusLevelFlatChance(Enchantments.BLOCK_FORTUNE, saplingChances)))
                .when(HAS_NO_SHEARS_OR_SILK_TOUCH);

        LootPool.Builder stickPool = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1.0F))
                .when(HAS_NO_SHEARS_OR_SILK_TOUCH)
                .add(this.applyExplosionDecay(plantBlock,
                                LootItem.lootTableItem(Items.STICK)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F))))
                        .when(BonusLevelTableCondition.bonusLevelFlatChance(
                                Enchantments.BLOCK_FORTUNE,
                                NORMAL_LEAVES_STICK_CHANCES)));

        return LootTable.lootTable()
                .withPool(shearPool)
                .withPool(saplingPool)
                .withPool(stickPool);
    }

    private LootTable.Builder createLotusDrops(Block lotusBlock) {
        return LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(lotusBlock.asItem()))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(lotusBlock)
                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModItems.LOTUS_ROOT.get()))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(lotusBlock)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                                        .hasProperty(WaterLotusBlock.AGE, 2))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModItems.LOTUS_ROOT.get()))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(lotusBlock)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                                        .hasProperty(WaterLotusBlock.AGE, 3))))
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModItems.LOTUS_SEED_POD.get()))
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(lotusBlock)
                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                        .hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)
                                        .hasProperty(WaterLotusBlock.AGE, 3))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
