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
                .addTag(CommonTags.Items.MEI_SAPLING)
                .addTag(CommonTags.Items.CRABAPPLE_SAPLING)
                .addTag(CommonTags.Items.APRICOT_SAPLING)
                .addTag(CommonTags.Items.PEACH_SAPLING)
                .add(ModBlocks.PEAR_SAPLING.asItem())
                .add(ModBlocks.TAIWAN_CHERRY_SAPLING.asItem())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING.asItem())
                .addTag(CommonTags.Items.OSMANTHUS_SAPLING)
                .add(ModBlocks.DOVE_TREE_SAPLING.asItem())
                .add(ModBlocks.CHINABERRY_SAPLING.asItem())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.asItem())
                .addTag(CommonTags.Items.CRAPE_MYRTLE_SAPLING)
                .addTag(CommonTags.Items.MEI_LEAVES)
                .addTag(CommonTags.Items.CRABAPPLE_LEAVES)
                .addTag(CommonTags.Items.APRICOT_LEAVES)
                .addTag(CommonTags.Items.PEACH_LEAVES)
                .add(ModBlocks.PEAR_LEAVES.asItem())
                .add(ModBlocks.TAIWAN_CHERRY_LEAVES.asItem())
                .add(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.asItem())
                .addTag(CommonTags.Items.OSMANTHUS_LEAVES)
                .add(ModBlocks.DOVE_TREE_BLOSSOM_LEAVES.asItem())
                .add(ModBlocks.CHINABERRY_LEAVES.asItem())
                .add(ModBlocks.DESERT_POPLAR_LEAVES.asItem())
                .addTag(CommonTags.Items.CRAPE_MYRTLE_LEAVES)
                .addTag(CommonTags.Items.RHODODENDRON_LEAVES)
                .addTag(CommonTags.Items.WEEPING_MEI)
                .add(ModBlocks.PEACH_PINK_PETALS.asItem(), ModBlocks.FRAGRANT_SNOW_PETALS.asItem(), ModBlocks.SPRING_PETALS.asItem())
                .addTag(CommonTags.Items.WISTERIA);

        this.copy(BlockTags.LEAVES, ItemTags.LEAVES);
        this.copy(BlockTags.LOGS_THAT_BURN, ItemTags.LOGS_THAT_BURN);
        this.copy(Tags.Blocks.STRIPPED_LOGS, Tags.Items.STRIPPED_LOGS);
        this.copy(Tags.Blocks.STRIPPED_WOODS, Tags.Items.STRIPPED_WOODS);
        this.copy(BlockTags.PLANKS, ItemTags.PLANKS);
        this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
        this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
        this.copy(BlockTags.WOODEN_BUTTONS, ItemTags.WOODEN_BUTTONS);
        this.copy(BlockTags.WOODEN_PRESSURE_PLATES, ItemTags.WOODEN_PRESSURE_PLATES);
        this.copy(BlockTags.WOODEN_FENCES, ItemTags.WOODEN_FENCES);
        this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
        this.copy(Tags.Blocks.FENCE_GATES_WOODEN, Tags.Items.FENCE_GATES_WOODEN);
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
                .add(ModBlocks.PEAR_SAPLING.asItem())
                .add(ModBlocks.TAIWAN_CHERRY_SAPLING.asItem())
                .addTag(CommonTags.Items.PLUM_SAPLING)
                .addTag(CommonTags.Items.OSMANTHUS_SAPLING)
                .addTag(CommonTags.Items.GINKGO_SAPLING)
                .addTag(CommonTags.Items.CHINESE_PARASOL_SAPLING)
                .add(ModBlocks.SWEETGUM_SAPLING.asItem())
                .add(ModBlocks.CAMPHOR_SAPLING.asItem())
                .add(ModBlocks.DOVE_TREE_SAPLING.asItem())
                .add(ModBlocks.CHINABERRY_SAPLING.asItem())
                .add(ModBlocks.DESERT_POPLAR_SAPLING.asItem())
                .addTag(CommonTags.Items.CYMBIDIUM)
                .addTag(CommonTags.Items.CHRYSANTHEMUM)
                .addTag(CommonTags.Items.LOTUS)
                .addTag(CommonTags.Items.HERBACEOUS_PEONY)
                .addTag(CommonTags.Items.CHINESE_ROSE)
                .add(ModBlocks.WINTERSWEET.asItem())
                .addTag(CommonTags.Items.CAMELLIA)
                .addTag(CommonTags.Items.AZALEA)
                .addTag(CommonTags.Items.TREE_PEONY)
                .addTag(CommonTags.Items.CRAPE_MYRTLE)
                .addTag(CommonTags.Items.BAMBOO)
                .addTag(CommonTags.Items.ORNAMENTAL_GRASS)
                .add(ModBlocks.COTTON_ROSE.asItem())
                .add(ModBlocks.HARDY_BANANA.asItem())
                .addTag(CommonTags.Items.WISTERIA)
                .addTag(CommonTags.Items.NARCISSUS)
                .add(ModBlocks.WHITE_MOTH_ORCHID.asItem(), ModBlocks.PINK_MOTH_ORCHID.asItem(), ModBlocks.PURPLE_MOTH_ORCHID.asItem(), ModBlocks.GOLDEN_MOTH_ORCHID.asItem())
                .add(ModBlocks.PEACH_PINK_PETALS.asItem(), ModBlocks.FRAGRANT_SNOW_PETALS.asItem(), ModBlocks.SPRING_PETALS.asItem())
                .add(ModItems.BAMBOO_STICK.get(), ModBlocks.MUXUE_GRASS.asItem())
                .add(Blocks.POPPY.asItem())
                .add(Blocks.ROSE_BUSH.asItem())
                .add(Blocks.SUNFLOWER.asItem())
                .add(Blocks.LILAC.asItem());

        this.copy(CommonTags.Blocks.MEI_SAPLING, CommonTags.Items.MEI_SAPLING);
        this.copy(CommonTags.Blocks.MEI_LEAVES, CommonTags.Items.MEI_LEAVES);
        this.copy(CommonTags.Blocks.WEEPING_MEI, CommonTags.Items.WEEPING_MEI);

        this.copy(CommonTags.Blocks.CRABAPPLE_SAPLING, CommonTags.Items.CRABAPPLE_SAPLING);
        this.copy(CommonTags.Blocks.CRABAPPLE_LEAVES, CommonTags.Items.CRABAPPLE_LEAVES);

        this.copy(CommonTags.Blocks.OSMANTHUS_SAPLING, CommonTags.Items.OSMANTHUS_SAPLING);
        this.copy(CommonTags.Blocks.OSMANTHUS_LEAVES, CommonTags.Items.OSMANTHUS_LEAVES);

        this.copy(CommonTags.Blocks.APRICOT_SAPLING, CommonTags.Items.APRICOT_SAPLING);
        this.copy(CommonTags.Blocks.APRICOT_LEAVES, CommonTags.Items.APRICOT_LEAVES);

        this.copy(CommonTags.Blocks.PEACH_SAPLING, CommonTags.Items.PEACH_SAPLING);
        this.copy(CommonTags.Blocks.PEACH_LEAVES, CommonTags.Items.PEACH_LEAVES);

        this.copy(CommonTags.Blocks.PLUM_SAPLING, CommonTags.Items.PLUM_SAPLING);
        this.copy(CommonTags.Blocks.PLUM_LEAVES, CommonTags.Items.PLUM_LEAVES);

        this.copy(CommonTags.Blocks.GINKGO_SAPLING, CommonTags.Items.GINKGO_SAPLING);
        this.copy(CommonTags.Blocks.GINKGO_LEAVES, CommonTags.Items.GINKGO_LEAVES);

        this.copy(CommonTags.Blocks.CHINESE_PARASOL_SAPLING, CommonTags.Items.CHINESE_PARASOL_SAPLING);
        this.copy(CommonTags.Blocks.CHINESE_PARASOL_LEAVES, CommonTags.Items.CHINESE_PARASOL_LEAVES);

        this.copy(CommonTags.Blocks.CAMPHOR_LEAVES, CommonTags.Items.CAMPHOR_LEAVES);

        this.copy(CommonTags.Blocks.DOVE_TREE_LEAVES, CommonTags.Items.DOVE_TREE_LEAVES);

        this.copy(CommonTags.Blocks.CRAPE_MYRTLE_SAPLING, CommonTags.Items.CRAPE_MYRTLE_SAPLING);
        this.copy(CommonTags.Blocks.CRAPE_MYRTLE_LEAVES, CommonTags.Items.CRAPE_MYRTLE_LEAVES);
        this.copy(CommonTags.Blocks.CRAPE_MYRTLE, CommonTags.Items.CRAPE_MYRTLE);

        this.copy(CommonTags.Blocks.CYMBIDIUM, CommonTags.Items.CYMBIDIUM);

        this.copy(CommonTags.Blocks.TREE_PEONY, CommonTags.Items.TREE_PEONY);
        this.copy(CommonTags.Blocks.HERBACEOUS_PEONY, CommonTags.Items.HERBACEOUS_PEONY);

        this.copy(CommonTags.Blocks.CHINESE_ROSE, CommonTags.Items.CHINESE_ROSE);

        this.copy(CommonTags.Blocks.CHRYSANTHEMUM, CommonTags.Items.CHRYSANTHEMUM);

        this.copy(CommonTags.Blocks.CAMELLIA_LEAVES, CommonTags.Items.CAMELLIA_LEAVES);
        this.copy(CommonTags.Blocks.CAMELLIA, CommonTags.Items.CAMELLIA);

        this.copy(CommonTags.Blocks.RHODODENDRON_LEAVES, CommonTags.Items.RHODODENDRON_LEAVES);
        this.copy(CommonTags.Blocks.AZALEA, CommonTags.Items.AZALEA);
        this.copy(CommonTags.Blocks.RHODODENDRON, CommonTags.Items.RHODODENDRON);

        this.tag(CommonTags.Items.BAMBOO)
                .add(Items.BAMBOO, ModItems.MOTTLED_BAMBOO.get(), ModItems.BLACK_BAMBOO.get());

        this.copy(CommonTags.Blocks.LOTUS, CommonTags.Items.LOTUS);
        this.copy(CommonTags.Blocks.NARCISSUS, CommonTags.Items.NARCISSUS);
        this.copy(CommonTags.Blocks.WISTERIA, CommonTags.Items.WISTERIA);

        this.tag(CommonTags.Items.ORNAMENTAL_GRASS)
                .add(ModBlocks.FOUNTAIN_GRASS.asItem(), ModBlocks.PURPLE_FOUNTAIN_GRASS.asItem(), ModBlocks.PINK_FOUNTAIN_GRASS.asItem(), ModBlocks.WHITE_FOUNTAIN_GRASS.asItem())
                .add(ModBlocks.MISCANTHUS.asItem(), ModBlocks.GOLDEN_MISCANTHUS.asItem());

        this.tag(ModTags.Items.RED_DYE)
                .add(ModBlocks.LUOYANG_RED_PEONY.asItem())
                .add(ModBlocks.RED_PEONY.asItem(), ModBlocks.LIGHT_RED_PEONY.asItem(), ModBlocks.INK_RED_PEONY.asItem(), ModBlocks.VERMILION_PEONY.asItem())
                .add(ModBlocks.CHINESE_ROSE.asItem())
                .add(ModBlocks.CAMELLIA.asItem())
                .add(ModBlocks.RED_AZALEA.asItem(), ModBlocks.MAYING_RHODODENDRON.asItem())
                .add(ModItems.SWEETGUM_LEAF_0.get(), ModItems.SWEETGUM_LEAF_1.get());

        this.tag(ModTags.Items.PINK_DYE)
                .add(ModBlocks.PINK_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.ZHAO_PINK_PEONY.asItem())
                .add(ModBlocks.PEONY.asItem(), ModBlocks.LIGHT_PINK_PEONY.asItem(), ModBlocks.VIOLET_PINK_PEONY.asItem(), ModBlocks.PINK_PEONY.asItem(), ModBlocks.MAUVE_PEONY.asItem())
                .add(ModBlocks.PINK_CHINESE_ROSE.asItem())
                .add(ModBlocks.PINK_CAMELLIA.asItem())
                .add(ModBlocks.PINK_RHODODENDRON.asItem())
                .add(ModBlocks.PEACH_PINK_PETALS.asItem(), ModBlocks.SPRING_PETALS.asItem())
                .add(ModBlocks.WEEPING_CRABAPPLE.asItem())
                .add(ModBlocks.COTTON_ROSE.asItem())
                .add(ModBlocks.PINK_CRAPE_MYRTLE.asItem(), ModBlocks.PINK_CRAPE_MYRTLE_SAPLING.asItem())
                .add(ModBlocks.LOTUS.asItem())
                .add(ModBlocks.PINK_MOTH_ORCHID.asItem())
                .add(ModItems.ORNAMENTAL_PEACH_PETALS.get(), ModItems.WILD_PEACH_PETALS.get())
                .add(ModBlocks.PINK_FOUNTAIN_GRASS.asItem());

        this.tag(ModTags.Items.WHITE_DYE)
                .add(ModBlocks.WHITE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.WHITE_PEONY.asItem())
                .add(ModBlocks.WHITE_CHINESE_ROSE.asItem(), ModBlocks.BAOHUA_CHINESE_ROSE.asItem())
                .add(ModBlocks.WHITE_CAMELLIA.asItem())
                .add(ModBlocks.WHITE_LOTUS.asItem())
                .add(ModBlocks.WHITE_FOUNTAIN_GRASS.asItem())
                .add(ModBlocks.DEWDROP_RHODODENDRON.asItem(), ModBlocks.GREAT_WHITE_RHODODENDRON.asItem())
                .add(ModBlocks.WHITE_CRAPE_MYRTLE.asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.asItem())
                .add(ModBlocks.WHITE_CHINESE_WISTERIA.asItem())
                .add(ModBlocks.CHINESE_NARCISSUS.asItem())
                .add(ModBlocks.WHITE_MOTH_ORCHID.asItem())
                .add(ModBlocks.FRAGRANT_SNOW_PETALS.asItem());

        this.tag(ModTags.Items.YELLOW_DYE)
                .add(ModBlocks.YAO_HUANG_PEONY.asItem())
                .add(ModBlocks.WINTERSWEET.asItem())
                .add(ModBlocks.CHRYSANTHEMUM.asItem())
                .add(ModBlocks.YELLOW_PEONY.asItem(), ModBlocks.LIGHT_YELLOW_PEONY.asItem(), ModBlocks.OCHRE_YELLOW_PEONY.asItem(), ModBlocks.GOLDEN_PEONY.asItem())
                .add(ModBlocks.CHINESE_AZALEA.asItem())
                .add(ModBlocks.YELLOW_CHINESE_ROSE.asItem())
                .add(ModBlocks.GOLDEN_CHINESE_NARCISSUS.asItem())
                .add(ModBlocks.GOLDEN_MOTH_ORCHID.asItem())
                .add(ModBlocks.GOLDEN_MISCANTHUS.asItem())
                .add(ModItems.CHINESE_PARASOL_LEAF_0.get())
                .add(ModItems.GINKGO_LEAF.get());

        this.tag(ModTags.Items.ORANGE_DYE)
                .add(ModItems.CHINESE_PARASOL_LEAF_1.get());

        this.tag(ModTags.Items.PURPLE_DYE)
                .add(ModBlocks.WEI_ZI_PEONY.asItem())
                .add(ModBlocks.PURPLE_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.PURPLE_PEONY.asItem(), ModBlocks.LIGHT_PURPLE_PEONY.asItem(), ModBlocks.INK_PURPLE_PEONY.asItem(), ModBlocks.VIOLET_PEONY.asItem())
                .add(ModBlocks.PURPLE_RHODODENDRON.asItem())
                .add(ModBlocks.CRAPE_MYRTLE.asItem(), ModBlocks.CRAPE_MYRTLE_SAPLING.asItem())
                .add(ModBlocks.CHINESE_WISTERIA.asItem(), ModBlocks.NANJING_WISTERIA.asItem())
                .add(ModBlocks.PURPLE_MOTH_ORCHID.asItem())
                .add(ModBlocks.FOUNTAIN_GRASS.asItem(), ModBlocks.PURPLE_FOUNTAIN_GRASS.asItem());

        this.tag(ModTags.Items.MAGENTA_DYE)
                .add(ModBlocks.CHARMING_RHODODENDRON.asItem())
                .add(ModBlocks.RED_CRAPE_MYRTLE.asItem(), ModBlocks.RED_CRAPE_MYRTLE_SAPLING.asItem())
                .add(ModBlocks.RED_CHINESE_WISTERIA.asItem());

        this.tag(ModTags.Items.LIME_DYE)
                .add(ModBlocks.SPRING_CYMBIDIUM.asItem())
                .add(ModBlocks.GREEN_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.DOU_GREEN_PEONY.asItem())
                .add(ModBlocks.GREEN_PEONY.asItem());

        this.tag(ModTags.Items.GREEN_DYE)
                .add(ModBlocks.SUMMER_CYMBIDIUM.asItem(), ModBlocks.AUTUMN_CYMBIDIUM.asItem())
                .add(ModBlocks.LOTUS_LEAF.asItem())
                .add(ModBlocks.MISCANTHUS.asItem())
                .add(ModBlocks.HARDY_BANANA.asItem());

        this.tag(ModTags.Items.LIGHT_BLUE_DYE)
                .add(ModBlocks.BLUE_PEONY.asItem());

        this.tag(ModTags.Items.BLUE_DYE)
                .add(ModBlocks.BLUE_CHINESE_WISTERIA.asItem());

        this.tag(ModTags.Items.BLACK_DYE)
                .add(ModBlocks.WINTER_CYMBIDIUM.asItem())
                .add(ModBlocks.BLACK_CHRYSANTHEMUM.asItem())
                .add(ModBlocks.INK_PEONY.asItem());

        this.tag(ModTags.Items.ZIYING_FOX_FOOD)
                .addTag(ItemTags.FOX_FOOD)
                .addTag(ModTags.Items.ZIYING_FOX_APPEAL_TO);

        this.tag(ModTags.Items.ZIYING_FOX_APPEAL_TO)
                .addTag(CommonTags.Items.WISTERIA)
                .addTag(CommonTags.Items.CRAPE_MYRTLE)
                .addTag(CommonTags.Items.CRAPE_MYRTLE_LEAVES);

        this.tag(ModTags.Items.SUYU_FOX_FOOD)
                .addTag(ItemTags.FOX_FOOD)
                .addTag(ModTags.Items.SUYU_FOX_APPEAL_TO);

        this.tag(ModTags.Items.SUYU_FOX_APPEAL_TO)
                .add(ModBlocks.WHITE_CHINESE_WISTERIA.asItem())
                .add(ModBlocks.WHITE_CRAPE_MYRTLE.asItem(), ModBlocks.WHITE_CRAPE_MYRTLE_SAPLING.asItem())
                .add(ModBlocks.WHITE_CRAPE_MYRTLE_LEAVES.asItem());

        this.tag(ModTags.Items.BAIHUA_CAT_FOOD)
                .addTag(ItemTags.FLOWERS)
                .addTag(ItemTags.SAPLINGS)
                .addTag(ItemTags.LEAVES)
                .addTag(Tags.Items.FOODS_FRUIT)
                .addTag(Tags.Items.FOODS_VEGETABLE);

        this.tag(Tags.Items.CROPS)
                .addTag(CommonTags.Items.CROPS_LOTUS);

        this.tag(CommonTags.Items.CROPS_LOTUS)
                .add(ModBlocks.LOTUS.asItem(), ModBlocks.WHITE_LOTUS.asItem())
                .add(ModBlocks.LOTUS_LEAF.asItem());

        this.tag(Tags.Items.FOODS_FRUIT)
                .add(ModItems.CRABAPPLE.get(), ModItems.GOLDEN_CRABAPPLE.get(), ModItems.ENCHANTED_GOLDEN_CRABAPPLE.get())
                .add(ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get(), ModItems.MEI.get(), ModItems.GOLDEN_MEI.get());

        this.tag(Tags.Items.FOODS_SOUP)
                .add(ModItems.LOTUS_ROOT_SOUP.get())
                .add(ModItems.LOTUS_SEED_SOUP.get())
                .add(ModItems.BAMBOO_SHOOTS_SOUP.get())
                .add(ModItems.MUXUE_SOUP.get());

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
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get())
                .add(ModItems.CRABAPPLE.get(), ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get());

        this.tag(ItemTags.PANDA_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get());

        this.tag(ItemTags.FOX_FOOD)
                .add(ModItems.CRABAPPLE.get(), ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get());

        this.tag(ItemTags.COW_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get())
                .add(ModItems.CRABAPPLE.get(), ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get());

        this.tag(ItemTags.CHICKEN_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get())
                .add(ModItems.CRABAPPLE.get(), ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get());

        this.tag(ItemTags.SHEEP_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get())
                .add(ModItems.CRABAPPLE.get(), ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get());

        this.tag(ItemTags.PIG_FOOD)
                .add(ModItems.PEELED_BAMBOO_SHOOTS.get(), ModItems.LOTUS_ROOT.get(), ModItems.LOTUS_SEED.get())
                .add(ModItems.CRABAPPLE.get(), ModItems.CLOUD_APRICOT.get(), ModItems.IMMORTAL_PEACH.get());

        this.tag(ItemTags.CAT_FOOD)
                .add(ModItems.LOTUS_ROOT_SOUP.get());

        this.tag(ItemTags.WOLF_FOOD)
                .add(ModItems.LOTUS_ROOT_SOUP.get());

        this.tag(ItemTags.AXOLOTL_FOOD)
                .add(ModBlocks.MUXUE_GRASS.asItem());

        this.tag(ItemTags.TURTLE_FOOD)
                .add(ModBlocks.MUXUE_GRASS.asItem());

        this.tag(ModTags.Items.ZIYING_TOOLS)
                .add(ModItems.ZIYING_SWORD.get(), ModItems.ZIYING_AXE.get(), ModItems.ZIYING_PICKAXE.get(),
                        ModItems.ZIYING_HOE.get(), ModItems.ZIYING_SHOVEL.get());

        this.tag(ModTags.Items.SUYU_TOOLS)
                .add(ModItems.SUYU_SWORD.get(), ModItems.SUYU_AXE.get(), ModItems.SUYU_PICKAXE.get(),
                        ModItems.SUYU_HOE.get(), ModItems.SUYU_SHOVEL.get());

        this.tag(ModTags.Items.ZIYU_YUANYANG_TOOLS)
                .add(ModItems.ZIYU_YUANYANG_SWORD.get(), ModItems.ZIYU_YUANYANG_AXE.get(), ModItems.ZIYU_YUANYANG_PICKAXE.get(),
                        ModItems.ZIYU_YUANYANG_HOE.get(), ModItems.ZIYU_YUANYANG_SHOVEL.get());

        this.tag(ItemTags.SWORDS)
                .add(ModItems.PEACH_WOODEN_SWORD.get(), ModItems.CAMPHOR_WOODEN_SWORD.get(), ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())
                .add(ModItems.ZIYING_SWORD.get(), ModItems.SUYU_SWORD.get(), ModItems.ZIYU_YUANYANG_SWORD.get())
                .add(ModItems.ZHUIYUE_SWORD.get(), ModItems.CAIYUN_SWORD.get(), ModItems.BAIHUA_SWORD.get());

        this.tag(ItemTags.AXES)
                .add(ModItems.ZIYING_AXE.get(), ModItems.SUYU_AXE.get(), ModItems.ZIYU_YUANYANG_AXE.get());

        this.tag(ItemTags.PICKAXES)
                .add(ModItems.ZIYING_PICKAXE.get(), ModItems.SUYU_PICKAXE.get(), ModItems.ZIYU_YUANYANG_PICKAXE.get());

        this.tag(ItemTags.HOES)
                .add(ModItems.ZIYING_HOE.get(), ModItems.SUYU_HOE.get(), ModItems.ZIYU_YUANYANG_HOE.get());

        this.tag(ItemTags.SHOVELS)
                .add(ModItems.ZIYING_SHOVEL.get(), ModItems.SUYU_SHOVEL.get(), ModItems.ZIYU_YUANYANG_SHOVEL.get());

        this.tag(ItemTags.PIGLIN_LOVED)
                .add(ModItems.GOLDEN_CRABAPPLE.get(), ModItems.ENCHANTED_GOLDEN_CRABAPPLE.get(), ModItems.GOLDEN_MEI.get());

        this.tag(Tags.Items.MELEE_WEAPON_TOOLS)
                .add(ModItems.BAMBOO_STICK.get())
                .add(ModItems.PEACH_WOODEN_SWORD.get(), ModItems.CAMPHOR_WOODEN_SWORD.get(), ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())
                .add(ModItems.ZIYING_SWORD.get(), ModItems.SUYU_SWORD.get(), ModItems.ZIYU_YUANYANG_SWORD.get())
                .add(ModItems.ZIYING_AXE.get(), ModItems.SUYU_AXE.get(), ModItems.ZIYU_YUANYANG_AXE.get())
                .add(ModItems.ZHUIYUE_SWORD.get(), ModItems.CAIYUN_SWORD.get(), ModItems.BAIHUA_SWORD.get());

        this.tag(Tags.Items.MINING_TOOL_TOOLS)
                .add(ModItems.ZIYING_PICKAXE.get(), ModItems.SUYU_PICKAXE.get(), ModItems.ZIYU_YUANYANG_PICKAXE.get());
    }
}
