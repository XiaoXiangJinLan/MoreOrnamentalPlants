package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ForgeTags;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_, CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, MoreOrnPlants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {
        this.tag(ItemTags.FLOWERS)
                .addTag(ItemTags.SMALL_FLOWERS)
                .addTag(ItemTags.TALL_FLOWERS)
                .add(ModBlocks.RED_MEI_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_MEI_SAPLING.get().asItem())
                .add(ModBlocks.GREEN_CALYX_MEI_SAPLING.get().asItem())
                .add(ModBlocks.DOUBLE_PINK_MEI_SAPLING.get().asItem())
                .add(ModBlocks.VERSICOLOR_MEI_SAPLING.get().asItem())
                .add(ModBlocks.RED_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.GREEN_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.PINK_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING.get().asItem())
                .add(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get().asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE_SAPLING.get().asItem())
                .add(ModBlocks.PINK_APRICOT_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_APRICOT_SAPLING.get().asItem())
                .add(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get().asItem())
                .add(ModBlocks.WILD_PEACH_SAPLING.get().asItem())
                .add(ModBlocks.PEAR_SAPLING.get().asItem())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get().asItem())
                .add(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get().asItem())
                .add(ModBlocks.ORANGE_OSMANTHUS_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_OSMANTHUS_SAPLING.get().asItem())
                .add(ModBlocks.DOVE_TREE_SAPLING.get().asItem())
                .add(ModBlocks.CHINABERRY_SAPLING.get().asItem())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.get().asItem())
                .add(ModBlocks.CRAPE_MYRTLE_SAPLING.get().asItem(), ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get().asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModBlocks.RED_MEI_LEAVES.get().asItem())
                .add(ModBlocks.WHITE_MEI_LEAVES.get().asItem())
                .add(ModBlocks.GREEN_CALYX_MEI_LEAVES.get().asItem())
                .add(ModBlocks.DOUBLE_PINK_MEI_LEAVES.get().asItem())
                .add(ModBlocks.VERSICOLOR_MEI_LEAVES.get().asItem())
                .add(ModBlocks.PINK_WEEPING_MEI.get().asItem())
                .add(ModBlocks.RED_WEEPING_MEI.get().asItem())
                .add(ModBlocks.WHITE_WEEPING_MEI.get().asItem())
                .add(ModBlocks.GREEN_WEEPING_MEI.get().asItem())
                .add(ModBlocks.VERSICOLOR_WEEPING_MEI.get().asItem())
                .add(ModBlocks.UPRIGHT_CRABAPPLE_LEAVES.get().asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE_LEAVES.get().asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE.get().asItem())
                .add(ModBlocks.PINK_APRICOT_LEAVES.get().asItem())
                .add(ModBlocks.WHITE_APRICOT_LEAVES.get().asItem())
                .add(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get().asItem())
                .add(ModBlocks.WILD_PEACH_LEAVES.get().asItem())
                .add(ModBlocks.PEAR_LEAVES.get().asItem())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get().asItem())
                .add(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get().asItem())
                .add(ModBlocks.ORANGE_OSMANTHUS_LEAVES.get().asItem())
                .add(ModBlocks.WHITE_OSMANTHUS_LEAVES.get().asItem())
                .add(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.get().asItem())
                .add(ModBlocks.CHINABERRY_LEAVES.get().asItem())
                .add(ModBlocks.DESERT_POPLAR_LEAVES.get().asItem())
                .add(ModBlocks.CRAPE_MYRTLE_LEAVES.get().asItem(), ModBlocks.RED_CRAPE_MYRTLE_LEAVES.get().asItem())
                .add(ModBlocks.PINK_CRAPE_MYRTLE_LEAVES.get().asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get().asItem())
                .add(ModBlocks.RED_AZALEA_LEAVES.get().asItem(), ModBlocks.MAYING_RHODODENDRON_LEAVES.get().asItem(), ModBlocks.DEWDROP_RHODODENDRON_LEAVES.get().asItem(), ModBlocks.CHARMING_RHODODENDRON_LEAVES.get().asItem())
                .add(ModBlocks.GREAT_WHITE_RHODODENDRON_LEAVES.get().asItem(), ModBlocks.PURPLE_RHODODENDRON_LEAVES.get().asItem(), ModBlocks.PINK_RHODODENDRON_LEAVES.get().asItem(), ModBlocks.CHINESE_AZALEA_LEAVES.get().asItem())
                .add(ModBlocks.PEACH_PINK_PETALS.get().asItem(), ModBlocks.FRAGRANT_SNOW_PETALS.get().asItem(), ModBlocks.SPRING_PETALS.get().asItem())
                .add(ModBlocks.CHINESE_WISTERIA.get().asItem(), ModBlocks.WHITE_CHINESE_WISTERIA.get().asItem());

        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);
        this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
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

        this.tag(ForgeTags.Items.PLANT_IN_FLORILEGIUM)
                .addTag(ForgeTags.Items.MEI_SAPLING)
                .addTag(ForgeTags.Items.CRABAPPLE_SAPLING)
                .addTag(ForgeTags.Items.APRICOT_SAPLING)
                .addTag(ForgeTags.Items.PEACH_SAPLING)
                .add(ModBlocks.PEAR_SAPLING.get().asItem())
                .addTag(ForgeTags.Items.PLUM_SAPLING)
                .addTag(ForgeTags.Items.OSMANTHUS_SAPLING)
                .addTag(ForgeTags.Items.GINKGO_SAPLING)
                .addTag(ForgeTags.Items.CHINESE_PARASOL_SAPLING)
                .add(ModBlocks.SWEETGUM_SAPLING.get().asItem())
                .add(ModBlocks.CAMPHOR_SAPLING.get().asItem())
                .add(ModBlocks.DOVE_TREE_SAPLING.get().asItem())
                .add(ModBlocks.CHINABERRY_SAPLING.get().asItem())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.get().asItem())
                .addTag(ForgeTags.Items.CYMBIDIUM)
                .addTag(ForgeTags.Items.CHRYSANTHEMUM)
                .addTag(ForgeTags.Items.LOTUS)
                .addTag(ForgeTags.Items.HERBACEOUS_PEONY)
                .addTag(ForgeTags.Items.CHINESE_ROSE)
                .add(ModBlocks.WINTERSWEET.get().asItem())
                .addTag(ForgeTags.Items.CAMELLIA)
                .addTag(ForgeTags.Items.AZALEA)
                .addTag(ForgeTags.Items.TREE_PEONY)
                .addTag(ForgeTags.Items.CRAPE_MYRTLE)
                .addTag(ForgeTags.Items.BAMBOO)
                .addTag(ForgeTags.Items.ORNAMENTAL_GRASS)
                .add(ModBlocks.COTTON_ROSE.get().asItem())
                .addTag(ForgeTags.Items.WISTERIA)
                .add(ModBlocks.PEACH_PINK_PETALS.get().asItem(), ModBlocks.FRAGRANT_SNOW_PETALS.get().asItem(), ModBlocks.SPRING_PETALS.get().asItem())
                .add(ModItems.BAMBOO_STICK.get())
                .add(Blocks.POPPY.asItem())
                .add(Blocks.ROSE_BUSH.asItem())
                .add(Blocks.SUNFLOWER.asItem())
                .add(Blocks.LILAC.asItem());

        this.tag(ForgeTags.Items.CYMBIDIUM)
                .add(ModBlocks.SPRING_CYMBIDIUM.get().asItem())
                .add(ModBlocks.SUMMER_CYMBIDIUM.get().asItem())
                .add(ModBlocks.AUTUMN_CYMBIDIUM.get().asItem())
                .add(ModBlocks.WINTER_CYMBIDIUM.get().asItem());

        this.tag(ForgeTags.Items.MEI_SAPLING)
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

        this.tag(ForgeTags.Items.MEI_LEAVES)
                .add(ModBlocks.RED_MEI_LEAVES.get().asItem(), ModBlocks.WHITE_MEI_LEAVES.get().asItem(), ModBlocks.GREEN_CALYX_MEI_LEAVES.get().asItem(),
                        ModBlocks.DOUBLE_PINK_MEI_LEAVES.get().asItem(), ModBlocks.VERSICOLOR_MEI_LEAVES.get().asItem())
                .add(ModBlocks.RED_WEEPING_MEI.get().asItem(), ModBlocks.WHITE_WEEPING_MEI.get().asItem(), ModBlocks.GREEN_WEEPING_MEI.get().asItem(),
                        ModBlocks.PINK_WEEPING_MEI.get().asItem(), ModBlocks.VERSICOLOR_WEEPING_MEI.get().asItem());

        this.tag(ForgeTags.Items.TREE_PEONY)
                .add(Blocks.PEONY.asItem())
                .add(ModBlocks.YAO_HUANG_PEONY.get().asItem(), ModBlocks.WEI_ZI_PEONY.get().asItem())
                .add(ModBlocks.ZHAO_PINK_PEONY.get().asItem(), ModBlocks.DOU_GREEN_PEONY.get().asItem())
                .add(ModBlocks.LUOYANG_RED_PEONY.get().asItem(), ModBlocks.TWO_QIAO_PEONY.get().asItem(), ModBlocks.VERSICOLOR_PEONY.get().asItem());

        this.tag(ForgeTags.Items.HERBACEOUS_PEONY)
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

        this.tag(ForgeTags.Items.CHINESE_ROSE)
                .add(ModBlocks.CHINESE_ROSE.get().asItem())
                .add(ModBlocks.PINK_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.YELLOW_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.WHITE_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.RED_PINK_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.RED_YELLOW_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.RED_WHITE_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.PINK_WHITE_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.YELLOW_WHITE_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.BAOHUA_CHINESE_ROSE.get().asItem());

        this.tag(ForgeTags.Items.CHRYSANTHEMUM)
                .add(ModBlocks.CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.XIHU_LIUYUE.get().asItem())
                .add(ModBlocks.GOLD_BACKED_SCARLET_MUM.get().asItem())
                .add(ModBlocks.WHITE_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.GREEN_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.PURPLE_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.PINK_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get().asItem());

        this.tag(ForgeTags.Items.CAMELLIA)
                .add(ModBlocks.CAMELLIA.get().asItem())
                .add(ModBlocks.PINK_CAMELLIA.get().asItem())
                .add(ModBlocks.WHITE_CAMELLIA.get().asItem())
                .add(ModBlocks.VERSICOLOR_CAMELLIA.get().asItem());

        this.tag(ForgeTags.Items.AZALEA)
                .add(Blocks.AZALEA.asItem())
                .add(Blocks.FLOWERING_AZALEA.asItem())
                .add(ModBlocks.MAYING_RHODODENDRON.get().asItem(), ModBlocks.DEWDROP_RHODODENDRON.get().asItem(), ModBlocks.CHARMING_RHODODENDRON.get().asItem())
                .add(ModBlocks.GREAT_WHITE_RHODODENDRON.get().asItem(), ModBlocks.PURPLE_RHODODENDRON.get().asItem(), ModBlocks.PINK_RHODODENDRON.get().asItem())
                .add(ModBlocks.RED_AZALEA.get().asItem(), ModBlocks.CHINESE_AZALEA.get().asItem());

        this.tag(ForgeTags.Items.WISTERIA)
                .add(ModBlocks.CHINESE_WISTERIA.get().asItem(), ModBlocks.WHITE_CHINESE_WISTERIA.get().asItem());

        this.tag(ForgeTags.Items.CRABAPPLE_SAPLING)
                .add(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get().asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.OSMANTHUS_SAPLING)
                .add(ModBlocks.GOLDEN_OSMANTHUS_SAPLING.get().asItem())
                .add(ModBlocks.ORANGE_OSMANTHUS_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_OSMANTHUS_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.OSMANTHUS_LEAVES)
                .add(ModBlocks.GOLDEN_OSMANTHUS_LEAVES.get().asItem(), ModBlocks.ORANGE_OSMANTHUS_LEAVES.get().asItem(), ModBlocks.WHITE_OSMANTHUS_LEAVES.get().asItem());

        this.tag(ForgeTags.Items.APRICOT_SAPLING)
                .add(ModBlocks.PINK_APRICOT_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_APRICOT_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.APRICOT_LEAVES)
                .add(ModBlocks.PINK_APRICOT_LEAVES.get().asItem(), ModBlocks.WHITE_APRICOT_LEAVES.get().asItem());

        this.tag(ForgeTags.Items.PEACH_SAPLING)
                .add(ModBlocks.ORNAMENTAL_PEACH_SAPLING.get().asItem())
                .add(ModBlocks.WILD_PEACH_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.PEACH_LEAVES)
                .add(ModBlocks.ORNAMENTAL_PEACH_LEAVES.get().asItem(), ModBlocks.WILD_PEACH_LEAVES.get().asItem());

        this.tag(ForgeTags.Items.PLUM_SAPLING)
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.get().asItem())
                .add(ModBlocks.PURPLE_LEAF_PLUM_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.GINKGO_SAPLING)
                .add(ModBlocks.GOLDEN_GINKGO_SAPLING.get().asItem())
                .add(ModBlocks.GREEN_GINKGO_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.CHINESE_PARASOL_SAPLING)
                .add(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING.get().asItem())
                .add(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.CRAPE_MYRTLE)
                .add(ModBlocks.CRAPE_MYRTLE.get().asItem(), ModBlocks.CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModBlocks.RED_CRAPE_MYRTLE.get().asItem(), ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModBlocks.PINK_CRAPE_MYRTLE.get().asItem(), ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_CRAPE_MYRTLE.get().asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get().asItem());

        this.tag(ForgeTags.Items.BAMBOO)
                .add(Items.BAMBOO)
                .add(ModItems.MOTTLED_BAMBOO.get())
                .add(ModItems.BLACK_BAMBOO.get());

        this.tag(ForgeTags.Items.LOTUS)
                .add(ModBlocks.LOTUS.get().asItem())
                .add(ModBlocks.WHITE_LOTUS.get().asItem());

        this.tag(ForgeTags.Items.ORNAMENTAL_GRASS)
                .add(ModBlocks.FOUNTAIN_GRASS.get().asItem())
                .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().asItem())
                .add(ModBlocks.PINK_FOUNTAIN_GRASS.get().asItem())
                .add(ModBlocks.WHITE_FOUNTAIN_GRASS.get().asItem())
                .add(ModBlocks.MISCANTHUS.get().asItem())
                .add(ModItems.GOLDEN_MISCANTHUS.get());

        this.tag(ModTags.Items.RED_DYE)
                .add(ModBlocks.LUOYANG_RED_PEONY.get().asItem())
                .add(ModBlocks.RED_PEONY.get().asItem(), ModBlocks.LIGHT_RED_PEONY.get().asItem())
                .add(ModBlocks.INK_RED_PEONY.get().asItem(), ModBlocks.VERMILION_PEONY.get().asItem())
                .add(ModBlocks.CHINESE_ROSE.get().asItem())
                .add(ModBlocks.CAMELLIA.get().asItem())
                .add(ModBlocks.RED_AZALEA.get().asItem(), ModBlocks.MAYING_RHODODENDRON.get().asItem())
                .add(ModItems.SWEETGUM_LEAF_0.get())
                .add(ModItems.SWEETGUM_LEAF_1.get());

        this.tag(ModTags.Items.PINK_DYE)
                .add(ModBlocks.PINK_CHRYSANTHEMUM.get().asItem(), ModBlocks.LIGHT_PINK_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.ZHAO_PINK_PEONY.get().asItem())
                .add(ModBlocks.PEONY.get().asItem())
                .add(ModBlocks.LIGHT_PINK_PEONY.get().asItem())
                .add(ModBlocks.VIOLET_PINK_PEONY.get().asItem())
                .add(ModBlocks.PINK_PEONY.get().asItem())
                .add(ModBlocks.MAUVE_PEONY.get().asItem())
                .add(ModBlocks.PINK_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.PINK_CAMELLIA.get().asItem())
                .add(ModBlocks.PINK_RHODODENDRON.get().asItem())
                .add(ModBlocks.PEACH_PINK_PETALS.get().asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE.get().asItem())
                .add(ModBlocks.COTTON_ROSE.get().asItem())
                .add(ModBlocks.LOTUS.get().asItem())
                .add(ModBlocks.PINK_CRAPE_MYRTLE.get().asItem(), ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModItems.ORNAMENTAL_PEACH_PETALS.get())
                .add(ModItems.WILD_PEACH_PETALS.get())
                .add(ModBlocks.PINK_FOUNTAIN_GRASS.get().asItem());

        this.tag(ModTags.Items.WHITE_DYE)
                .add(ModBlocks.WHITE_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.WHITE_PEONY.get().asItem())
                .add(ModBlocks.WHITE_CAMELLIA.get().asItem())
                .add(ModBlocks.WHITE_CHINESE_ROSE.get().asItem(), ModBlocks.BAOHUA_CHINESE_ROSE.get().asItem())
                .add(ModBlocks.WHITE_LOTUS.get().asItem())
                .add(ModBlocks.WHITE_CRAPE_MYRTLE.get().asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_FOUNTAIN_GRASS.get().asItem())
                .add(ModBlocks.DEWDROP_RHODODENDRON.get().asItem(), ModBlocks.GREAT_WHITE_RHODODENDRON.get().asItem())
                .add(ModBlocks.FRAGRANT_SNOW_PETALS.get().asItem());

        this.tag(ModTags.Items.YELLOW_DYE)
                .add(ModBlocks.YAO_HUANG_PEONY.get().asItem())
                .add(ModBlocks.WINTERSWEET.get().asItem())
                .add(ModBlocks.CHRYSANTHEMUM.get().asItem(), ModBlocks.XIHU_LIUYUE.get().asItem())
                .add(ModBlocks.YELLOW_PEONY.get().asItem(), ModBlocks.LIGHT_YELLOW_PEONY.get().asItem())
                .add(ModBlocks.OCHRE_YELLOW_PEONY.get().asItem(), ModBlocks.GOLDEN_PEONY.get().asItem())
                .add(ModBlocks.CHINESE_AZALEA.get().asItem())
                .add(ModBlocks.YELLOW_CHINESE_ROSE.get().asItem())
                .add(ModItems.GOLDEN_MISCANTHUS.get())
                .add(ModItems.CHINESE_PARASOL_LEAF_0.get())
                .add(ModItems.GINKGO_LEAF.get());

        this.tag(ModTags.Items.ORANGE_DYE)
                .add(ModItems.CHINESE_PARASOL_LEAF_1.get());

        this.tag(ModTags.Items.PURPLE_DYE)
                .add(ModBlocks.WEI_ZI_PEONY.get().asItem())
                .add(ModBlocks.PURPLE_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.PURPLE_PEONY.get().asItem(), ModBlocks.LIGHT_PURPLE_PEONY.get().asItem())
                .add(ModBlocks.INK_PURPLE_PEONY.get().asItem(), ModBlocks.VIOLET_PEONY.get().asItem())
                .add(ModBlocks.PURPLE_RHODODENDRON.get().asItem())
                .addTag(ForgeTags.Items.CRAPE_MYRTLE)
                .add(ModBlocks.FOUNTAIN_GRASS.get().asItem())
                .add(ModBlocks.PURPLE_FOUNTAIN_GRASS.get().asItem());

        this.tag(ModTags.Items.MAGENTA_DYE)
                .add(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.CHARMING_RHODODENDRON.get().asItem())
                .add(ModBlocks.RED_CRAPE_MYRTLE.get().asItem(), ModBlocks.RED_CRAPE_MYRTLE_SAPLING.get().asItem());

        this.tag(ModTags.Items.LIME_DYE)
                .add(ModBlocks.SPRING_CYMBIDIUM.get().asItem())
                .add(ModBlocks.GREEN_CHRYSANTHEMUM.get().asItem())
                .add(ModBlocks.DOU_GREEN_PEONY.get().asItem())
                .add(ModBlocks.GREEN_PEONY.get().asItem());

        this.tag(ModTags.Items.GREEN_DYE)
                .add(ModBlocks.SUMMER_CYMBIDIUM.get().asItem(), ModBlocks.AUTUMN_CYMBIDIUM.get().asItem())
                .add(ModBlocks.LOTUS_LEAF.get().asItem())
                .add(ModBlocks.MISCANTHUS.get().asItem());

        this.tag(ModTags.Items.LIGHT_BLUE_DYE)
                .add(ModBlocks.BLUE_PEONY.get().asItem());

        this.tag(ModTags.Items.BLACK_DYE)
                .add(ModBlocks.WINTER_CYMBIDIUM.get().asItem())
                .add(ModBlocks.INK_PEONY.get().asItem());

        this.tag(ModTags.Items.ZIYING_FOX_FOOD)
                .addTag(ItemTags.FOX_FOOD)
                .addTag(ModTags.Items.ZIYING_FOX_APPEAL_TO);

        this.tag(ModTags.Items.ZIYING_FOX_APPEAL_TO)
                .addTag(ForgeTags.Items.WISTERIA)
                .addTag(ForgeTags.Items.CRAPE_MYRTLE)
                .add(ModBlocks.CRAPE_MYRTLE_LEAVES.get().asItem(), ModBlocks.RED_CRAPE_MYRTLE_LEAVES.get().asItem())
                .add(ModBlocks.PINK_CRAPE_MYRTLE_LEAVES.get().asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get().asItem());

        this.tag(ModTags.Items.SUYU_FOX_FOOD)
                .addTag(ItemTags.FOX_FOOD)
                .addTag(ModTags.Items.SUYU_FOX_APPEAL_TO);

        this.tag(ModTags.Items.SUYU_FOX_APPEAL_TO)
                .add(ModBlocks.WHITE_CHINESE_WISTERIA.get().asItem())
                .add(ModBlocks.WHITE_CRAPE_MYRTLE.get().asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.get().asItem())
                .add(ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.get().asItem());

        this.tag(ItemTags.FOX_FOOD)
                .add(ModItems.CRABAPPLE.get(), ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get());

        this.tag(ModTags.Items.BAIHUA_CAT_FOOD)
                .addTag(ItemTags.FLOWERS)
                .addTag(ItemTags.SAPLINGS)
                .addTag(ItemTags.LEAVES)
                .addTag(ForgeTags.Items.FRUITS)
                .addTag(ForgeTags.Items.VEGETABLES);

        this.tag(ForgeTags.Items.VEGETABLES)
                .addTag(ForgeTags.Items.VEGETABLES_BAMBOO_SHOOTS)
                .addTag(ForgeTags.Items.VEGETABLES_BAMBOO_SPROUTS)
                .addTag(ForgeTags.Items.VEGETABLES_LOTUS_ROOT)
                .addTag(ForgeTags.Items.VEGETABLES_LOTUS_SEED)
                .addTag(ForgeTags.Items.VEGETABLES_LOTUS_NUT);

        this.tag(ForgeTags.Items.FRUITS)
                .addTag(ForgeTags.Items.FRUITS_CRABAPPLE)
                .addTag(ForgeTags.Items.FRUITS_PEACH)
                .addTag(ForgeTags.Items.FRUITS_APRICOT);

        this.tag(ForgeTags.Items.VEGETABLES_BAMBOO_SHOOTS)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get());

        this.tag(ForgeTags.Items.VEGETABLES_BAMBOO_SPROUTS)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get());

        this.tag(ForgeTags.Items.VEGETABLES_LOTUS_ROOT)
                .add(ModItems.LOTUS_ROOT.get());

        this.tag(ForgeTags.Items.VEGETABLES_LOTUS_SEED)
                .add(ModItems.LOTUS_SEED.get());

        this.tag(ForgeTags.Items.VEGETABLES_LOTUS_NUT)
                .add(ModItems.LOTUS_SEED.get());

        this.tag(ForgeTags.Items.FRUITS_CRABAPPLE)
                .add(ModItems.CRABAPPLE.get())
                .add(ModItems.GOLDEN_CRABAPPLE.get())
                .add(ModItems.ENCHANTED_GOLDEN_CRABAPPLE.get());

        this.tag(ForgeTags.Items.FRUITS_PEACH)
                .add(ModItems.IMMORTAL_PEACH.get());

        this.tag(ForgeTags.Items.FRUITS_APRICOT)
                .add(ModItems.CLOUD_APRICOT.get());

        this.tag(ModTags.Items.ZIYING_TOOLS)
                .add(ModItems.ZIYING_SWORD.get(), ModItems.ZIYING_AXE.get(), ModItems.ZIYING_PICKAXE.get());

        this.tag(ModTags.Items.SUYU_TOOLS)
                .add(ModItems.SUYU_SWORD.get(), ModItems.SUYU_AXE.get(), ModItems.SUYU_PICKAXE.get());

        this.tag(ModTags.Items.ZIYU_YUANYANG_TOOLS)
                .add(ModItems.ZIYU_YUANYANG_SWORD.get(), ModItems.ZIYU_YUANYANG_AXE.get(), ModItems.ZIYU_YUANYANG_PICKAXE.get());

        this.tag(ItemTags.SWORDS)
                .add(ModItems.PEACH_WOODEN_SWORD.get(), ModItems.CAMPHOR_WOODEN_SWORD.get(), ModItems.ZHUIYUE_SWORD.get())
                .add(ModItems.ZIYING_SWORD.get(), ModItems.SUYU_SWORD.get(), ModItems.ZIYU_YUANYANG_SWORD.get());

        this.tag(ItemTags.AXES)
                .add(ModItems.ZIYING_AXE.get(), ModItems.SUYU_AXE.get(), ModItems.ZIYU_YUANYANG_AXE.get());

        this.tag(ItemTags.PICKAXES)
                .add(ModItems.ZIYING_PICKAXE.get(), ModItems.SUYU_PICKAXE.get(), ModItems.ZIYU_YUANYANG_PICKAXE.get());
    }
}
