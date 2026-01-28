package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.CommonTags;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MoreOrnPlants.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(ItemTags.FLOWERS)
                .addTag(ItemTags.SMALL_FLOWERS)
                .addTag(ItemTags.TALL_FLOWERS)
                .add(ModBlocks.RED_MEI_SAPLING.asItem())
                .add(ModBlocks.WHITE_MEI_SAPLING.asItem())
                .add(ModBlocks.GREEN_CALYX_MEI_SAPLING.asItem())
                .add(ModBlocks.DOUBLE_PINK_MEI_SAPLING.asItem())
                .add(ModBlocks.VERSICOLOR_MEI_SAPLING.asItem())
                .add(ModBlocks.RED_WEEPING_MEI_SAPLING.asItem())
                .add(ModBlocks.WHITE_WEEPING_MEI_SAPLING.asItem())
                .add(ModBlocks.GREEN_WEEPING_MEI_SAPLING.asItem())
                .add(ModBlocks.PINK_WEEPING_MEI_SAPLING.asItem())
                .add(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.asItem())
                .add(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE_SAPLING.asItem())
                .add(ModBlocks.PINK_APRICOT_SAPLING.asItem())
                .add(ModBlocks.WHITE_APRICOT_SAPLING.asItem())
                .add(ModBlocks.ORNAMENTAL_PEACH_SAPLING.asItem())
                .add(ModBlocks.WILD_PEACH_SAPLING.asItem())
                .add(ModBlocks.PEAR_SAPLING.asItem())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.asItem())
                .add(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.asItem())
                .add(ModBlocks.ORANGE_OSMANTHUS_SAPLING.asItem())
                .add(ModBlocks.WHITE_OSMANTHUS_SAPLING.asItem())
                .add(ModBlocks.DOVE_TREE_SAPLING.asItem())
                .add(ModBlocks.CHINABERRY_SAPLING.asItem())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.asItem())
                .add(ModBlocks.CRAPE_MYRTLE_SAPLING.asItem())
                .add(ModBlocks.RED_MEI_LEAVES.asItem())
                .add(ModBlocks.WHITE_MEI_LEAVES.asItem())
                .add(ModBlocks.GREEN_CALYX_MEI_LEAVES.asItem())
                .add(ModBlocks.DOUBLE_PINK_MEI_LEAVES.asItem())
                .add(ModBlocks.VERSICOLOR_MEI_LEAVES.asItem())
                .add(ModBlocks.PINK_WEEPING_MEI.asItem())
                .add(ModBlocks.RED_WEEPING_MEI.asItem())
                .add(ModBlocks.WHITE_WEEPING_MEI.asItem())
                .add(ModBlocks.GREEN_WEEPING_MEI.asItem())
                .add(ModBlocks.VERSICOLOR_WEEPING_MEI.asItem())
                .add(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE_LEAVES.asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE.asItem())
                .add(ModBlocks.PINK_APRICOT_LEAVES.asItem())
                .add(ModBlocks.WHITE_APRICOT_LEAVES.asItem())
                .add(ModBlocks.ORNAMENTAL_PEACH_LEAVES.asItem())
                .add(ModBlocks.WILD_PEACH_LEAVES.asItem())
                .add(ModBlocks.PEAR_LEAVES.asItem())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.asItem())
                .add(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.asItem())
                .add(ModBlocks.ORANGE_OSMANTHUS_LEAVES.asItem())
                .add(ModBlocks.WHITE_OSMANTHUS_LEAVES.asItem())
                .add(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.asItem())
                .add(ModBlocks.CHINABERRY_LEAVES.asItem())
                .add(ModBlocks.DESERT_POPLAR_LEAVES.asItem())
                .add(ModBlocks.CRAPE_MYRTLE_LEAVES.asItem())
                .add(ModBlocks.PEACH_PINK_PETALS.asItem())
                .add(ModBlocks.FRAGRANT_SNOW_PETALS.asItem());

        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);
        this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);

        this.tag(Tags.Items.STRIPPED_LOGS)
                .add(ModBlocks.STRIPPED_RED_MEI_LOG.asItem())
                .add(ModBlocks.STRIPPED_WHITE_MEI_LOG.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG.asItem())
                .add(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG.asItem())
                .add(ModBlocks.STRIPPED_CRABAPPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_APRICOT_LOG.asItem())
                .add(ModBlocks.STRIPPED_PEACH_LOG.asItem())
                .add(ModBlocks.STRIPPED_PEAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_LOG.asItem())
                .add(ModBlocks.STRIPPED_OSMANTHUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_GINKGO_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHINESE_PARASOL_LOG.asItem())
                .add(ModBlocks.STRIPPED_SWEETGUM_LOG.asItem())
                .add(ModBlocks.STRIPPED_CAMPHOR_LOG.asItem())
                .add(ModBlocks.STRIPPED_DOVE_TREE_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHINABERRY_LOG.asItem())
                .add(ModBlocks.STRIPPED_DESERT_POPLAR_LOG.asItem());

        this.tag(Tags.Items.STRIPPED_WOODS)
                .add(ModBlocks.STRIPPED_RED_MEI_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WHITE_MEI_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CRABAPPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_APRICOT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PEACH_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PEAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PURPLE_LEAF_PLUM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_OSMANTHUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_GINKGO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHINESE_PARASOL_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SWEETGUM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CAMPHOR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DOVE_TREE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHINABERRY_WOOD.asItem())
                .add(ModBlocks.STRIPPED_DESERT_POPLAR_WOOD.asItem());

        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);

        this.tag(Tags.Items.FENCE_GATES_WOODEN)
                .add(ModBlocks.RED_MEI_FENCE_GATE.asItem())
                .add(ModBlocks.WHITE_MEI_FENCE_GATE.asItem())
                .add(ModBlocks.GREEN_CALYX_MEI_FENCE_GATE.asItem())
                .add(ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE.asItem())
                .add(ModBlocks.CRABAPPLE_FENCE_GATE.asItem())
                .add(ModBlocks.APRICOT_FENCE_GATE.asItem())
                .add(ModBlocks.PEACH_FENCE_GATE.asItem())
                .add(ModBlocks.PEAR_FENCE_GATE.asItem())
                .add(ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE.asItem())
                .add(ModBlocks.OSMANTHUS_FENCE_GATE.asItem())
                .add(ModBlocks.GINKGO_FENCE_GATE.asItem())
                .add(ModBlocks.CHINESE_PARASOL_FENCE_GATE.asItem())
                .add(ModBlocks.SWEETGUM_FENCE_GATE.asItem())
                .add(ModBlocks.CAMPHOR_FENCE_GATE.asItem())
                .add(ModBlocks.DOVE_TREE_FENCE_GATE.asItem())
                .add(ModBlocks.CHINABERRY_FENCE_GATE.asItem())
                .add(ModBlocks.DESERT_POPLAR_FENCE_GATE.asItem());

        this.copy(BlockTags.WOODEN_DOORS, ItemTags.WOODEN_DOORS);
        this.copy(BlockTags.WOODEN_TRAPDOORS, ItemTags.WOODEN_TRAPDOORS);
        this.copy(BlockTags.STANDING_SIGNS, ItemTags.SIGNS);
        this.copy(BlockTags.CEILING_HANGING_SIGNS, ItemTags.HANGING_SIGNS);

        this.tag(ItemTags.BOATS)
                .add(ModItems.RED_MEI_BOAT.get())
                .add(ModItems.WHITE_MEI_BOAT.get())
                .add(ModItems.GREEN_CALYX_MEI_BOAT.get())
                .add(ModItems.DOUBLE_PINK_MEI_BOAT.get())
                .add(ModItems.CRABAPPLE_BOAT.get())
                .add(ModItems.APRICOT_BOAT.get())
                .add(ModItems.PEACH_BOAT.get())
                .add(ModItems.PEAR_BOAT.get())
                .add(ModItems.PURPLE_LEAF_PLUM_BOAT.get())
                .add(ModItems.OSMANTHUS_BOAT.get())
                .add(ModItems.GINKGO_BOAT.get())
                .add(ModItems.SWEETGUM_BOAT.get())
                .add(ModItems.CHINESE_PARASOL_BOAT.get())
                .add(ModItems.CAMPHOR_BOAT.get())
                .add(ModItems.DOVE_TREE_BOAT.get())
                .add(ModItems.CHINABERRY_BOAT.get())
                .add(ModItems.DESERT_POPLAR_BOAT.get());

        this.tag(ItemTags.CHEST_BOATS)
                .add(ModItems.RED_MEI_CHEST_BOAT.get())
                .add(ModItems.WHITE_MEI_CHEST_BOAT.get())
                .add(ModItems.GREEN_CALYX_MEI_CHEST_BOAT.get())
                .add(ModItems.DOUBLE_PINK_MEI_CHEST_BOAT.get())
                .add(ModItems.CRABAPPLE_CHEST_BOAT.get())
                .add(ModItems.APRICOT_CHEST_BOAT.get())
                .add(ModItems.PEACH_CHEST_BOAT.get())
                .add(ModItems.PEAR_CHEST_BOAT.get())
                .add(ModItems.PURPLE_LEAF_PLUM_CHEST_BOAT.get())
                .add(ModItems.OSMANTHUS_CHEST_BOAT.get())
                .add(ModItems.GINKGO_CHEST_BOAT.get())
                .add(ModItems.SWEETGUM_CHEST_BOAT.get())
                .add(ModItems.CHINESE_PARASOL_CHEST_BOAT.get())
                .add(ModItems.CAMPHOR_CHEST_BOAT.get())
                .add(ModItems.DOVE_TREE_CHEST_BOAT.get())
                .add(ModItems.CHINABERRY_CHEST_BOAT.get())
                .add(ModItems.DESERT_POPLAR_CHEST_BOAT.get());

        this.copy(ModTags.Blocks.RED_MEI_LOGS, ModTags.Items.RED_MEI_LOGS);
        this.copy(ModTags.Blocks.WHITE_MEI_LOGS, ModTags.Items.WHITE_MEI_LOGS);
        this.copy(ModTags.Blocks.GREEN_CALYX_MEI_LOGS, ModTags.Items.GREEN_CALYX_MEI_LOGS);
        this.copy(ModTags.Blocks.DOUBLE_PINK_MEI_LOGS, ModTags.Items.DOUBLE_PINK_MEI_LOGS);
        this.copy(ModTags.Blocks.CRABAPPLE_LOGS, ModTags.Items.CRABAPPLE_LOGS);
        this.copy(ModTags.Blocks.APRICOT_LOGS, ModTags.Items.APRICOT_LOGS);
        this.copy(ModTags.Blocks.PEACH_LOGS, ModTags.Items.PEACH_LOGS);
        this.copy(ModTags.Blocks.PEAR_LOGS, ModTags.Items.PEAR_LOGS);
        this.copy(ModTags.Blocks.PURPLE_LEAF_PLUM_LOGS, ModTags.Items.PURPLE_LEAF_PLUM_LOGS);
        this.copy(ModTags.Blocks.OSMANTHUS_LOGS, ModTags.Items.OSMANTHUS_LOGS);
        this.copy(ModTags.Blocks.GINKGO_LOGS, ModTags.Items.GINKGO_LOGS);
        this.copy(ModTags.Blocks.CHINESE_PARASOL_LOGS, ModTags.Items.CHINESE_PARASOL_LOGS);
        this.copy(ModTags.Blocks.SWEETGUM_LOGS, ModTags.Items.SWEETGUM_LOGS);
        this.copy(ModTags.Blocks.CAMPHOR_LOGS, ModTags.Items.CAMPHOR_LOGS);
        this.copy(ModTags.Blocks.DOVE_TREE_LOGS, ModTags.Items.DOVE_TREE_LOGS);
        this.copy(ModTags.Blocks.CHINABERRY_LOGS, ModTags.Items.CHINABERRY_LOGS);
        this.copy(ModTags.Blocks.DESERT_POPLAR_LOGS, ModTags.Items.DESERT_POPLAR_LOGS);

        this.copy(BlockTags.SAPLINGS, ItemTags.SAPLINGS);
        this.copy(BlockTags.SMALL_FLOWERS, ItemTags.SMALL_FLOWERS);
        this.copy(BlockTags.TALL_FLOWERS, ItemTags.TALL_FLOWERS);

        this.tag(ModTags.Items.PLANT_IN_FLORILEGIUM)
                .addTag(CommonTags.Items.MEI_SAPLING)
                .addTag(CommonTags.Items.CRABAPPLE_SAPLING)
                .addTag(CommonTags.Items.APRICOT_SAPLING)
                .addTag(CommonTags.Items.PEACH_SAPLING)
                .add(ModBlocks.PEAR_SAPLING.get().asItem())
                .addTag(CommonTags.Items.PLUM_SAPLING)
                .addTag(CommonTags.Items.OSMANTHUS_SAPLING)
                .addTag(CommonTags.Items.GINKGO_SAPLING)
                .addTag(CommonTags.Items.CHINESE_PARASOL_SAPLING)
                .add(ModBlocks.SWEETGUM_SAPLING.get().asItem())
                .add(ModBlocks.CAMPHOR_SAPLING.get().asItem())
                .add(ModBlocks.DOVE_TREE_SAPLING.get().asItem())
                .add(ModBlocks.CHINABERRY_SAPLING.get().asItem())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.get().asItem())
                .addTag(CommonTags.Items.CYMBIDIUM)
                .addTag(CommonTags.Items.CHRYSANTHEMUM)
                .addTag(CommonTags.Items.LOTUS)
                .addTag(CommonTags.Items.HERBACEOUS_PEONY)
                .addTag(CommonTags.Items.CHINESE_ROSE)
                .add(ModBlocks.WINTERSWEET.get().asItem())
                .addTag(CommonTags.Items.CAMELLIA)
                .addTag(CommonTags.Items.AZALEA)
                .addTag(CommonTags.Items.TREE_PEONY)
                .addTag(CommonTags.Items.CRAPE_MYRTLE)
                .addTag(CommonTags.Items.BAMBOO)
                .addTag(CommonTags.Items.ORNAMENTAL_GRASS)
                .add(ModBlocks.COTTON_ROSE.get().asItem())
                .add(ModBlocks.PEACH_PINK_PETALS.asItem())
                .add(ModBlocks.FRAGRANT_SNOW_PETALS.asItem())
                .add(ModItems.BAMBOO_STICK.get())
                .add(Blocks.POPPY.asItem())
                .add(Blocks.ROSE_BUSH.asItem())
                .add(Blocks.SUNFLOWER.asItem())
                .add(Blocks.LILAC.asItem());

        this.tag(CommonTags.Items.CYMBIDIUM)
                .add(ModBlocks.SPRING_CYMBIDIUM.get().asItem())
                .add(ModBlocks.SUMMER_CYMBIDIUM.get().asItem())
                .add(ModBlocks.AUTUMN_CYMBIDIUM.get().asItem())
                .add(ModBlocks.WINTER_CYMBIDIUM.get().asItem());

        this.tag(CommonTags.Items.MEI_SAPLING)
                .add(ModBlocks.RED_MEI_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_MEI_SAPLING.get().asItem())
                .add(ModBlocks.GREEN_CALYX_MEI_SAPLING.get().asItem())
                .add(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get().asItem())
                .add(ModBlocks.VERSICOLOR_MEI_SAPLING.get().asItem())
                .add(ModBlocks.RED_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.GREEN_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.PINK_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get().asItem());

        this.tag(CommonTags.Items.MEI_LEAVES)
                .add(ModBlocks.RED_MEI_LEAVES.get().asItem(), ModBlocks.WHITE_MEI_LEAVES.get().asItem(), ModBlocks.GREEN_CALYX_MEI_LEAVES.get().asItem(),
                        ModBlocks.DOUBLE_PINK_MEI_LEAVES.get().asItem(), ModBlocks.VERSICOLOR_MEI_LEAVES.get().asItem())
                .add(ModBlocks.RED_WEEPING_MEI.get().asItem(), ModBlocks.WHITE_WEEPING_MEI.get().asItem(), ModBlocks.GREEN_WEEPING_MEI.get().asItem(),
                        ModBlocks.PINK_WEEPING_MEI.get().asItem(), ModBlocks.VERSICOLOR_WEEPING_MEI.get().asItem());

        this.tag(CommonTags.Items.TREE_PEONY)
                .add(Blocks.PEONY.asItem(), ModBlocks.TWO_QIAO_PEONY.get().asItem(), ModBlocks.VERSICOLOR_PEONY.get().asItem());

        this.tag(CommonTags.Items.HERBACEOUS_PEONY)
                .add(ModBlocks.PEONY.get().asItem())
                .add(ModBlocks.LIGHT_PINK_PEONY.get().asItem())
                .add(ModBlocks.VIOLET_PINK_PEONY.get().asItem())
                .add(ModBlocks.PINK_PEONY.get().asItem())
                .add(ModBlocks.RED_PEONY.get().asItem())
                .add(ModBlocks.LIGHT_RED_PEONY.get().asItem())
                .add(ModBlocks.INK_RED_PEONY.get().asItem())
                .add(ModBlocks.VERMILION_PEONY.get().asItem())
                .add(ModBlocks.PURPLE_PEONY.get().asItem())
                .add(ModBlocks.LIGHT_PURPLE_PEONY.get().asItem())
                .add(ModBlocks.INK_PURPLE_PEONY.get().asItem())
                .add(ModBlocks.VIOLET_PEONY.get().asItem())
                .add(ModBlocks.YELLOW_PEONY.get().asItem())
                .add(ModBlocks.LIGHT_YELLOW_PEONY.get().asItem())
                .add(ModBlocks.OCHRE_YELLOW_PEONY.get().asItem())
                .add(ModBlocks.GOLDEN_PEONY.get().asItem())
                .add(ModBlocks.WHITE_PEONY.get().asItem())
                .add(ModBlocks.INK_PEONY.get().asItem())
                .add(ModBlocks.BLUE_PEONY.get().asItem())
                .add(ModBlocks.GREEN_PEONY.get().asItem())
                .add(ModBlocks.COLORFUL_PEONY.get().asItem())
                .add(ModBlocks.LIGHT_COLORFUL_PEONY.get().asItem())
                .add(ModBlocks.INK_COLORFUL_PEONY.get().asItem())
                .add(ModBlocks.RED_WHITE_PEONY.get().asItem())
                .add(ModBlocks.PINK_WHITE_PEONY.get().asItem())
                .add(ModBlocks.YELLOW_WHITE_PEONY.get().asItem())
                .add(ModBlocks.PURPLE_WHITE_PEONY.get().asItem())
                .add(ModBlocks.WU_HUA_LONG_YU_PEONY.get().asItem())
                .add(ModBlocks.MAUVE_PEONY.get().asItem());

        this.tag(CommonTags.Items.CHINESE_ROSE)
                .add(ModBlocks.CHINESE_ROSE.get().asItem())
                .add(ModBlocks.PINK_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.YELLOW_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.WHITE_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.RED_PINK_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.RED_YELLOW_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.RED_WHITE_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.PINK_WHITE_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get().asItem());

        this.tag(CommonTags.Items.CHRYSANTHEMUM)
                .add(ModBlocks.CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.GOLDEN_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.GOLD_BACKED_SCARLET_MUM.get().asItem())
                .add(ModBlocks.WHITE_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.GREEN_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.PURPLE_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.PINK_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get().asItem());

        this.tag(CommonTags.Items.CAMELLIA)
                .add(ModBlocks.CAMELLIA.get().asItem(), ModBlocks.PINK_CAMELLIA.get().asItem(), ModBlocks.WHITE_CAMELLIA.get().asItem(), ModBlocks.VERSICOLOR_CAMELLIA.get().asItem());

        this.tag(CommonTags.Items.AZALEA)
                .add(Blocks.AZALEA.asItem(), Blocks.FLOWERING_AZALEA.asItem(), ModBlocks.RED_AZALEA.get().asItem());

        this.tag(CommonTags.Items.CRABAPPLE_SAPLING)
                .add(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get().asItem(), ModBlocks.WEEPING_CRABAPPLE_SAPLING.get().asItem());

        this.tag(CommonTags.Items.OSMANTHUS_SAPLING)
                .add(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get().asItem(), ModBlocks.ORANGE_OSMANTHUS_SAPLING.get().asItem(), ModBlocks.WHITE_OSMANTHUS_SAPLING.get().asItem());

        this.tag(CommonTags.Items.OSMANTHUS_LEAVES)
                .add(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get().asItem(), ModBlocks.ORANGE_OSMANTHUS_LEAVES.get().asItem(), ModBlocks.WHITE_OSMANTHUS_LEAVES.get().asItem());

        this.tag(CommonTags.Items.APRICOT_SAPLING)
                .add(ModBlocks.PINK_APRICOT_SAPLING.get().asItem(), ModBlocks.WHITE_APRICOT_SAPLING.get().asItem());

        this.tag(CommonTags.Items.APRICOT_LEAVES)
                .add(ModBlocks.PINK_APRICOT_LEAVES.get().asItem(), ModBlocks.WHITE_APRICOT_LEAVES.get().asItem());

        this.tag(CommonTags.Items.PEACH_SAPLING)
                .add(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get().asItem(), ModBlocks.WILD_PEACH_SAPLING.get().asItem());

        this.tag(CommonTags.Items.PEACH_LEAVES)
                .add(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get().asItem(), ModBlocks.WILD_PEACH_LEAVES.get().asItem());

        this.tag(CommonTags.Items.PLUM_SAPLING)
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get().asItem(), ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get().asItem());

        this.tag(CommonTags.Items.GINKGO_SAPLING)
                .add(ModBlocks.GOLDEN_GINKGO_SAPLING.get().asItem(), ModBlocks.GREEN_GINKGO_SAPLING.get().asItem());

        this.tag(CommonTags.Items.CHINESE_PARASOL_SAPLING)
                .add(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get().asItem(), ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get().asItem());

        this.tag(CommonTags.Items.CRAPE_MYRTLE)
                .add(ModBlocks.CRAPE_MYRTLE.get().asItem(), ModBlocks.CRAPE_MYRTLE_SAPLING.get().asItem());

        this.tag(CommonTags.Items.BAMBOO)
                .add(Items.BAMBOO, ModItems.MOTTLED_BAMBOO.get(), ModItems.BLACK_BAMBOO.get());

        this.tag(CommonTags.Items.LOTUS)
                .add(ModBlocks.LOTUS.get().asItem(), ModBlocks.WHITE_LOTUS.get().asItem());

        this.tag(CommonTags.Items.ORNAMENTAL_GRASS)
                .add(ModBlocks.FOUNTAIN_GRASS.asItem(), ModBlocks.PURPLE_FOUNTAIN_GRASS.asItem(), ModBlocks.PINK_FOUNTAIN_GRASS.asItem(), ModBlocks.WHITE_FOUNTAIN_GRASS.asItem())
                .add(ModBlocks.MISCANTHUS.asItem(), ModItems.GOLDEN_MISCANTHUS.get());

        this.tag(ModTags.Items.RED_DYE)
                .add(ModBlocks.RED_PEONY.asItem(), ModBlocks.LIGHT_RED_PEONY.asItem(), ModBlocks.INK_RED_PEONY.asItem(), ModBlocks.VERMILION_PEONY.asItem())
                .add(ModBlocks.CHINESE_ROSE.asItem())
                .add(ModBlocks.CAMELLIA.asItem())
                .add(ModBlocks.RED_AZALEA.asItem())
                .add(ModItems.SWEETGUM_LEAF_0.get(), ModItems.SWEETGUM_LEAF_1.get());

        this.tag(ModTags.Items.PINK_DYE)
                .add(ModBlocks.PINK_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.PEONY.asItem(), ModBlocks.LIGHT_PINK_PEONY.asItem(), ModBlocks.VIOLET_PINK_PEONY.asItem(), ModBlocks.PINK_PEONY.asItem(), ModBlocks.MAUVE_PEONY.asItem())
                .add(ModBlocks.PINK_CHINESE_ROSE.asItem())
                .add(ModBlocks.PINK_CAMELLIA.asItem())
                .add(ModBlocks.PEACH_PINK_PETALS.asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE.asItem())
                .add(ModBlocks.COTTON_ROSE.asItem())
                .add(ModBlocks.LOTUS.asItem())
                .add(ModItems.ORNAMENTAL_PEACH_PETALS.get(), ModItems.WILD_PEACH_PETALS.get())
                .add(ModBlocks.PINK_FOUNTAIN_GRASS.asItem());

        this.tag(ModTags.Items.WHITE_DYE)
                .add(ModBlocks.WHITE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.WHITE_PEONY.asItem())
                .add(ModBlocks.WHITE_CAMELLIA.asItem())
                .add(ModBlocks.WHITE_LOTUS.asItem())
                .add(ModBlocks.WHITE_FOUNTAIN_GRASS.asItem())
                .add(ModBlocks.FRAGRANT_SNOW_PETALS.asItem());

        this.tag(ModTags.Items.YELLOW_DYE)
                .add(ModBlocks.WINTERSWEET.asItem())
                .add(ModBlocks.CHRYSANTHEMUM.asItem())
                .add(ModBlocks.YELLOW_PEONY.asItem())
                .add(ModBlocks.LIGHT_YELLOW_PEONY.asItem())
                .add(ModBlocks.OCHRE_YELLOW_PEONY.asItem())
                .add(ModBlocks.GOLDEN_PEONY.asItem())
                .add(ModBlocks.YELLOW_CHINESE_ROSE.asItem())
                .add(ModItems.GOLDEN_MISCANTHUS.get())
                .add(ModItems.CHINESE_PARASOL_LEAF_0.get())
                .add(ModItems.GINKGO_LEAF.get());

        this.tag(ModTags.Items.ORANGE_DYE)
                .add(ModItems.CHINESE_PARASOL_LEAF_1.get());

        this.tag(ModTags.Items.PURPLE_DYE)
                .add(ModBlocks.PURPLE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.PURPLE_PEONY.asItem())
                .add(ModBlocks.LIGHT_PURPLE_PEONY.asItem())
                .add(ModBlocks.INK_PURPLE_PEONY.asItem())
                .add(ModBlocks.VIOLET_PEONY.asItem())
                .add(ModBlocks.CRAPE_MYRTLE.asItem())
                .add(ModBlocks.CRAPE_MYRTLE_SAPLING.asItem())
                .add(ModBlocks.FOUNTAIN_GRASS.asItem())
                .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.asItem());

        this.tag(ModTags.Items.LIME_DYE)
                .add(ModBlocks.GREEN_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.GREEN_PEONY.asItem());

        this.tag(ModTags.Items.GREEN_DYE)
                .add(ModBlocks.SPRING_CYMBIDIUM.asItem())
                .add(ModBlocks.SUMMER_CYMBIDIUM.asItem())
                .add(ModBlocks.AUTUMN_CYMBIDIUM.asItem())
                .add(ModBlocks.WINTER_CYMBIDIUM.asItem())
                .add(ModBlocks.LOTUS_LEAF.asItem())
                .add(ModBlocks.MISCANTHUS.asItem());

        this.tag(ModTags.Items.LIGHT_BLUE_DYE)
                .add(ModBlocks.BLUE_PEONY.asItem());

        this.tag(ModTags.Items.BLACK_DYE)
                .add(ModBlocks.INK_PEONY.asItem());

        this.tag(Tags.Items.CROPS)
                .addTag(CommonTags.Items.CROPS_LOTUS);

        this.tag(CommonTags.Items.CROPS_LOTUS)
                .add(ModBlocks.LOTUS.asItem(), ModBlocks.WHITE_LOTUS.asItem())
                .add(ModBlocks.LOTUS_LEAF.asItem());

        this.tag(Tags.Items.FOODS_SOUP)
                .add(ModItems.LOTUS_ROOT_SOUP.get())
                .add(ModItems.LOTUS_SEED_SOUP.get())
                .add(ModItems.BAMBOO_SHOOTS_SOUP.get());

        this.tag(Tags.Items.FOODS_VEGETABLE)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get())
                .add(ModItems.LOTUS_ROOT.get())
                .add(ModItems.LOTUS_SEED.get());

        this.tag(CommonTags.Items.FOODS_BAMBOO_SHOOTS)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get());

        this.tag(CommonTags.Items.FOODS_BAMBOO_SPROUTS)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get());

        this.tag(CommonTags.Items.FOODS_LOTUS_ROOT)
                .add(ModItems.LOTUS_ROOT.get());

        this.tag(CommonTags.Items.FOODS_LOTUS_SEED)
                .add(ModItems.LOTUS_SEED.get());

        this.tag(CommonTags.Items.FOODS_LOTUS_NUT)
                .add(ModItems.LOTUS_SEED.get());

        this.tag(ItemTags.GOAT_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get());

        this.tag(ItemTags.PANDA_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get());

        this.tag(ItemTags.RABBIT_FOOD)
                .add(ModItems.LOTUS_ROOT.get());

        this.tag(ItemTags.HORSE_FOOD)
                .add(ModItems.LOTUS_ROOT.get());

        this.tag(ItemTags.COW_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get());

        this.tag(ItemTags.CHICKEN_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get());

        this.tag(ItemTags.SHEEP_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get());

        this.tag(ItemTags.PIG_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get());

        this.tag(ItemTags.CAT_FOOD)
                .add(ModItems.LOTUS_ROOT_SOUP.get());

        this.tag(ItemTags.WOLF_FOOD)
                .add(ModItems.LOTUS_ROOT_SOUP.get());
    }
}
