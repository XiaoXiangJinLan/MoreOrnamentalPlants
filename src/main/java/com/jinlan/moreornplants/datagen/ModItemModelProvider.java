package com.jinlan.moreornplants.datagen;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreOrnPlants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        fenceItem(ModBlocks.RED_MEI_FENCE, ModBlocks.RED_MEI_PLANKS);
        fenceItem(ModBlocks.WHITE_MEI_FENCE, ModBlocks.WHITE_MEI_PLANKS);
        fenceItem(ModBlocks.GREEN_CALYX_MEI_FENCE, ModBlocks.GREEN_CALYX_MEI_PLANKS);
        fenceItem(ModBlocks.DOUBLE_PINK_MEI_FENCE, ModBlocks.DOUBLE_PINK_MEI_PLANKS);
        fenceItem(ModBlocks.CRABAPPLE_FENCE, ModBlocks.CRABAPPLE_PLANKS);
        fenceItem(ModBlocks.APRICOT_FENCE, ModBlocks.APRICOT_PLANKS);
        fenceItem(ModBlocks.PEACH_FENCE, ModBlocks.PEACH_PLANKS);
        fenceItem(ModBlocks.PEAR_FENCE, ModBlocks.PEAR_PLANKS);
        fenceItem(ModBlocks.PURPLE_LEAF_PLUM_FENCE, ModBlocks.PURPLE_LEAF_PLUM_PLANKS);
        fenceItem(ModBlocks.OSMANTHUS_FENCE, ModBlocks.OSMANTHUS_PLANKS);
        fenceItem(ModBlocks.GINKGO_FENCE, ModBlocks.GINKGO_PLANKS);
        fenceItem(ModBlocks.CHINESE_PARASOL_FENCE, ModBlocks.CHINESE_PARASOL_PLANKS);
        fenceItem(ModBlocks.SWEETGUM_FENCE, ModBlocks.SWEETGUM_PLANKS);
        fenceItem(ModBlocks.CAMPHOR_FENCE, ModBlocks.CAMPHOR_PLANKS);

        buttonItem(ModBlocks.RED_MEI_BUTTON, ModBlocks.RED_MEI_PLANKS);
        buttonItem(ModBlocks.WHITE_MEI_BUTTON, ModBlocks.WHITE_MEI_PLANKS);
        buttonItem(ModBlocks.GREEN_CALYX_MEI_BUTTON, ModBlocks.GREEN_CALYX_MEI_PLANKS);
        buttonItem(ModBlocks.DOUBLE_PINK_MEI_BUTTON, ModBlocks.DOUBLE_PINK_MEI_PLANKS);
        buttonItem(ModBlocks.CRABAPPLE_BUTTON, ModBlocks.CRABAPPLE_PLANKS);
        buttonItem(ModBlocks.APRICOT_BUTTON, ModBlocks.APRICOT_PLANKS);
        buttonItem(ModBlocks.PEACH_BUTTON, ModBlocks.PEACH_PLANKS);
        buttonItem(ModBlocks.PEAR_BUTTON, ModBlocks.PEAR_PLANKS);
        buttonItem(ModBlocks.PURPLE_LEAF_PLUM_BUTTON, ModBlocks.PURPLE_LEAF_PLUM_PLANKS);
        buttonItem(ModBlocks.OSMANTHUS_BUTTON, ModBlocks.OSMANTHUS_PLANKS);
        buttonItem(ModBlocks.GINKGO_BUTTON, ModBlocks.GINKGO_PLANKS);
        buttonItem(ModBlocks.CHINESE_PARASOL_BUTTON, ModBlocks.CHINESE_PARASOL_PLANKS);
        buttonItem(ModBlocks.SWEETGUM_BUTTON, ModBlocks.SWEETGUM_PLANKS);
        buttonItem(ModBlocks.CAMPHOR_BUTTON, ModBlocks.CAMPHOR_PLANKS);

        simplerBlockItem(ModBlocks.RED_MEI_DOOR);
        simplerBlockItem(ModBlocks.WHITE_MEI_DOOR);
        simplerBlockItem(ModBlocks.GREEN_CALYX_MEI_DOOR);
        simplerBlockItem(ModBlocks.DOUBLE_PINK_MEI_DOOR);
        simplerBlockItem(ModBlocks.CRABAPPLE_DOOR);
        simplerBlockItem(ModBlocks.APRICOT_DOOR);
        simplerBlockItem(ModBlocks.PEACH_DOOR);
        simplerBlockItem(ModBlocks.PEAR_DOOR);
        simplerBlockItem(ModBlocks.PURPLE_LEAF_PLUM_DOOR);
        simplerBlockItem(ModBlocks.OSMANTHUS_DOOR);
        simplerBlockItem(ModBlocks.GINKGO_DOOR);
        simplerBlockItem(ModBlocks.CHINESE_PARASOL_DOOR);
        simplerBlockItem(ModBlocks.SWEETGUM_DOOR);
        simplerBlockItem(ModBlocks.CAMPHOR_DOOR);

        evenSimplerBlockItem(ModBlocks.RED_MEI_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_MEI_SLAB);
        evenSimplerBlockItem(ModBlocks.RED_MEI_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.RED_MEI_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.WHITE_MEI_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_MEI_SLAB);
        evenSimplerBlockItem(ModBlocks.WHITE_MEI_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.WHITE_MEI_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.GREEN_CALYX_MEI_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_CALYX_MEI_SLAB);
        evenSimplerBlockItem(ModBlocks.GREEN_CALYX_MEI_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.GREEN_CALYX_MEI_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.DOUBLE_PINK_MEI_STAIRS);
        evenSimplerBlockItem(ModBlocks.DOUBLE_PINK_MEI_SLAB);
        evenSimplerBlockItem(ModBlocks.DOUBLE_PINK_MEI_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.DOUBLE_PINK_MEI_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.CRABAPPLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.CRABAPPLE_SLAB);
        evenSimplerBlockItem(ModBlocks.CRABAPPLE_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.CRABAPPLE_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.APRICOT_STAIRS);
        evenSimplerBlockItem(ModBlocks.APRICOT_SLAB);
        evenSimplerBlockItem(ModBlocks.APRICOT_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.APRICOT_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.PEACH_STAIRS);
        evenSimplerBlockItem(ModBlocks.PEACH_SLAB);
        evenSimplerBlockItem(ModBlocks.PEACH_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.PEACH_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.PEAR_STAIRS);
        evenSimplerBlockItem(ModBlocks.PEAR_SLAB);
        evenSimplerBlockItem(ModBlocks.PEAR_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.PEAR_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.PURPLE_LEAF_PLUM_STAIRS);
        evenSimplerBlockItem(ModBlocks.PURPLE_LEAF_PLUM_SLAB);
        evenSimplerBlockItem(ModBlocks.PURPLE_LEAF_PLUM_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.PURPLE_LEAF_PLUM_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.OSMANTHUS_STAIRS);
        evenSimplerBlockItem(ModBlocks.OSMANTHUS_SLAB);
        evenSimplerBlockItem(ModBlocks.OSMANTHUS_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.OSMANTHUS_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.GINKGO_STAIRS);
        evenSimplerBlockItem(ModBlocks.GINKGO_SLAB);
        evenSimplerBlockItem(ModBlocks.GINKGO_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.GINKGO_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.CHINESE_PARASOL_STAIRS);
        evenSimplerBlockItem(ModBlocks.CHINESE_PARASOL_SLAB);
        evenSimplerBlockItem(ModBlocks.CHINESE_PARASOL_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.CHINESE_PARASOL_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.SWEETGUM_STAIRS);
        evenSimplerBlockItem(ModBlocks.SWEETGUM_SLAB);
        evenSimplerBlockItem(ModBlocks.SWEETGUM_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SWEETGUM_FENCE_GATE);
        evenSimplerBlockItem(ModBlocks.CAMPHOR_STAIRS);
        evenSimplerBlockItem(ModBlocks.CAMPHOR_SLAB);
        evenSimplerBlockItem(ModBlocks.CAMPHOR_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.CAMPHOR_FENCE_GATE);

        trapdoorItem(ModBlocks.RED_MEI_TRAPDOOR);
        trapdoorItem(ModBlocks.WHITE_MEI_TRAPDOOR);
        trapdoorItem(ModBlocks.GREEN_CALYX_MEI_TRAPDOOR);
        trapdoorItem(ModBlocks.DOUBLE_PINK_MEI_TRAPDOOR);
        trapdoorItem(ModBlocks.CRABAPPLE_TRAPDOOR);
        trapdoorItem(ModBlocks.APRICOT_TRAPDOOR);
        trapdoorItem(ModBlocks.PEACH_TRAPDOOR);
        trapdoorItem(ModBlocks.PEAR_TRAPDOOR);
        trapdoorItem(ModBlocks.PURPLE_LEAF_PLUM_TRAPDOOR);
        trapdoorItem(ModBlocks.OSMANTHUS_TRAPDOOR);
        trapdoorItem(ModBlocks.GINKGO_TRAPDOOR);
        trapdoorItem(ModBlocks.CHINESE_PARASOL_TRAPDOOR);
        trapdoorItem(ModBlocks.SWEETGUM_TRAPDOOR);
        trapdoorItem(ModBlocks.CAMPHOR_TRAPDOOR);

        simpleItem(ModItems.RED_MEI_SIGN);
        simpleItem(ModItems.RED_MEI_HANGING_SIGN);
        simpleItem(ModItems.WHITE_MEI_SIGN);
        simpleItem(ModItems.WHITE_MEI_HANGING_SIGN);
        simpleItem(ModItems.GREEN_CALYX_MEI_SIGN);
        simpleItem(ModItems.GREEN_CALYX_MEI_HANGING_SIGN);
        simpleItem(ModItems.DOUBLE_PINK_MEI_SIGN);
        simpleItem(ModItems.DOUBLE_PINK_MEI_HANGING_SIGN);
        simpleItem(ModItems.CRABAPPLE_SIGN);
        simpleItem(ModItems.CRABAPPLE_HANGING_SIGN);
        simpleItem(ModItems.APRICOT_SIGN);
        simpleItem(ModItems.APRICOT_HANGING_SIGN);
        simpleItem(ModItems.PEACH_SIGN);
        simpleItem(ModItems.PEACH_HANGING_SIGN);
        simpleItem(ModItems.PEAR_SIGN);
        simpleItem(ModItems.PEAR_HANGING_SIGN);
        simpleItem(ModItems.PURPLE_LEAF_PLUM_SIGN);
        simpleItem(ModItems.PURPLE_LEAF_PLUM_HANGING_SIGN);
        simpleItem(ModItems.OSMANTHUS_SIGN);
        simpleItem(ModItems.OSMANTHUS_HANGING_SIGN);
        simpleItem(ModItems.GINKGO_SIGN);
        simpleItem(ModItems.GINKGO_HANGING_SIGN);
        simpleItem(ModItems.CHINESE_PARASOL_SIGN);
        simpleItem(ModItems.CHINESE_PARASOL_HANGING_SIGN);
        simpleItem(ModItems.SWEETGUM_SIGN);
        simpleItem(ModItems.SWEETGUM_HANGING_SIGN);
        simpleItem(ModItems.CAMPHOR_SIGN);
        simpleItem(ModItems.CAMPHOR_HANGING_SIGN);

        simpleItem(ModItems.RED_MEI_BOAT);
        simpleItem(ModItems.RED_MEI_CHEST_BOAT);
        simpleItem(ModItems.WHITE_MEI_BOAT);
        simpleItem(ModItems.WHITE_MEI_CHEST_BOAT);
        simpleItem(ModItems.GREEN_CALYX_MEI_BOAT);
        simpleItem(ModItems.GREEN_CALYX_MEI_CHEST_BOAT);
        simpleItem(ModItems.DOUBLE_PINK_MEI_BOAT);
        simpleItem(ModItems.DOUBLE_PINK_MEI_CHEST_BOAT);
        simpleItem(ModItems.CRABAPPLE_BOAT);
        simpleItem(ModItems.CRABAPPLE_CHEST_BOAT);
        simpleItem(ModItems.CAMPHOR_BOAT);
        simpleItem(ModItems.CAMPHOR_CHEST_BOAT);

        saplingItem(ModBlocks.RED_MEI_SAPLING);
        saplingItem(ModBlocks.WHITE_MEI_SAPLING);
        saplingItem(ModBlocks.GREEN_CALYX_MEI_SAPLING);
        saplingItem(ModBlocks.DOUBLE_PINK_MEI_SAPLING);
        saplingItem(ModBlocks.VERSICOLOR_MEI_SAPLING);
        saplingItem(ModBlocks.RED_WEEPING_MEI_SAPLING);
        saplingItem(ModBlocks.WHITE_WEEPING_MEI_SAPLING);
        saplingItem(ModBlocks.GREEN_WEEPING_MEI_SAPLING);
        saplingItem(ModBlocks.PINK_WEEPING_MEI_SAPLING);
        saplingItem(ModBlocks.VERSICOLOR_WEEPING_MEI_SAPLING);
        saplingItem(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING);
        saplingItem(ModBlocks.WEEPING_CRABAPPLE_SAPLING);
        saplingItem(ModBlocks.PINK_APRICOT_SAPLING);
        saplingItem(ModBlocks.WHITE_APRICOT_SAPLING);
        saplingItem(ModBlocks.ORNAMENTAL_PEACH_SAPLING);
        saplingItem(ModBlocks.WILD_PEACH_SAPLING);
        saplingItem(ModBlocks.PEAR_SAPLING);
        saplingItem(ModBlocks.FLOWERING_PURPLE_LEAF_PLUM_SAPLING);
        saplingItem(ModBlocks.PURPLE_LEAF_PLUM_SAPLING);
        saplingItem(ModBlocks.GOLDEN_OSMANTHUS_SAPLING);
        saplingItem(ModBlocks.ORANGE_OSMANTHUS_SAPLING);
        saplingItem(ModBlocks.WHITE_OSMANTHUS_SAPLING);
        saplingItem(ModBlocks.GOLDEN_GINKGO_SAPLING);
        saplingItem(ModBlocks.GREEN_GINKGO_SAPLING);
        saplingItem(ModBlocks.YELLOW_CHINESE_PARASOL_SAPLING);
        saplingItem(ModBlocks.GREEN_CHINESE_PARASOL_SAPLING);
        saplingItem(ModBlocks.SWEETGUM_SAPLING);
        saplingItem(ModBlocks.CAMPHOR_SAPLING);

        flowerItem(ModBlocks.RED_WEEPING_MEI);
        flowerItem(ModBlocks.WHITE_WEEPING_MEI);
        flowerItem(ModBlocks.GREEN_WEEPING_MEI);
        flowerItem(ModBlocks.PINK_WEEPING_MEI);
        flowerItem(ModBlocks.VERSICOLOR_WEEPING_MEI);

        flowerItem(ModBlocks.WEEPING_CRABAPPLE);

        flowerItem(ModBlocks.WINTERSWEET_BUSH);
        flowerItem(ModBlocks.CHRYSANTHEMUM);
        flowerItem(ModBlocks.GOLDEN_CHRYSANTHEMUM);
        flowerItem(ModBlocks.GOLD_BACKED_SCARLET_MUM);
        flowerItem(ModBlocks.WHITE_CHRYSANTHEMUM);
        flowerItem(ModBlocks.GREEN_CHRYSANTHEMUM);
        flowerItem(ModBlocks.PURPLE_CHRYSANTHEMUM);
        flowerItem(ModBlocks.VIOLET_PINK_CHRYSANTHEMUM);
        flowerItem(ModBlocks.PINK_CHRYSANTHEMUM);
        flowerItem(ModBlocks.LIGHT_PINK_CHRYSANTHEMUM);
        flowerItem(ModBlocks.SPRING_CYMBIDIUM);
        flowerItem(ModBlocks.PEONY);
        flowerItem(ModBlocks.LIGHT_PINK_PEONY);
        flowerItem(ModBlocks.VIOLET_PINK_PEONY);
        flowerItem(ModBlocks.PINK_PEONY);
        flowerItem(ModBlocks.RED_PEONY);
        flowerItem(ModBlocks.LIGHT_RED_PEONY);
        flowerItem(ModBlocks.INK_RED_PEONY);
        flowerItem(ModBlocks.VERMILION_PEONY);
        flowerItem(ModBlocks.PURPLE_PEONY);
        flowerItem(ModBlocks.LIGHT_PURPLE_PEONY);
        flowerItem(ModBlocks.INK_PURPLE_PEONY);
        flowerItem(ModBlocks.VIOLET_PEONY);
        flowerItem(ModBlocks.YELLOW_PEONY);
        flowerItem(ModBlocks.LIGHT_YELLOW_PEONY);
        flowerItem(ModBlocks.OCHRE_YELLOW_PEONY);
        flowerItem(ModBlocks.GOLDEN_PEONY);
        flowerItem(ModBlocks.WHITE_PEONY);
        flowerItem(ModBlocks.INK_PEONY);
        flowerItem(ModBlocks.BLUE_PEONY);
        flowerItem(ModBlocks.GREEN_PEONY);
        flowerItem(ModBlocks.COLORFUL_PEONY);
        flowerItem(ModBlocks.LIGHT_COLORFUL_PEONY);
        flowerItem(ModBlocks.INK_COLORFUL_PEONY);
        flowerItem(ModBlocks.RED_WHITE_PEONY);
        flowerItem(ModBlocks.PINK_WHITE_PEONY);
        flowerItem(ModBlocks.YELLOW_WHITE_PEONY);
        flowerItem(ModBlocks.PURPLE_WHITE_PEONY);
        flowerItem(ModBlocks.WU_HUA_LONG_YU_PEONY);
        flowerItem(ModBlocks.MAUVE_PEONY);
        flowerItem(ModBlocks.CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.PINK_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.YELLOW_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.WHITE_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.RED_PINK_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.RED_YELLOW_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.RED_WHITE_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.PINK_WHITE_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.YELLOW_WHITE_CHINESE_ROSE_BUSH);
        flowerItem(ModBlocks.CAMELLIA);
        flowerItem(ModBlocks.PINK_CAMELLIA);
        flowerItem(ModBlocks.WHITE_CAMELLIA);
        flowerItem(ModBlocks.VERSICOLOR_CAMELLIA);
        flowerItem(ModBlocks.CRIMSON_AZALEA);

        tallCrossItem(ModBlocks.WINTERSWEET);
        tallCrossItem(ModBlocks.TWO_QIAO_PEONY);
        tallCrossItem(ModBlocks.VERSICOLOR_PEONY);
        tallCrossItem(ModBlocks.CHINESE_ROSE);
        tallCrossItem(ModBlocks.PINK_CHINESE_ROSE);
        tallCrossItem(ModBlocks.YELLOW_CHINESE_ROSE);
        tallCrossItem(ModBlocks.WHITE_CHINESE_ROSE);
        tallCrossItem(ModBlocks.RED_PINK_CHINESE_ROSE);
        tallCrossItem(ModBlocks.RED_YELLOW_CHINESE_ROSE);
        tallCrossItem(ModBlocks.RED_WHITE_CHINESE_ROSE);
        tallCrossItem(ModBlocks.PINK_WHITE_CHINESE_ROSE);
        tallCrossItem(ModBlocks.YELLOW_WHITE_CHINESE_ROSE);

        peachPinkPetalsItem(ModBlocks.PEACH_PINK_PETALS);
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOrnPlants.MOD_ID,"block/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOrnPlants.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(MoreOrnPlants.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    private void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(MoreOrnPlants.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(MoreOrnPlants.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simplerBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder flowerItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/" + item.getId().getPath()));
    }

    private ItemModelBuilder tallCrossItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "block/" + block.getId().getPath() + "_top"));
    }

    private ItemModelBuilder peachPinkPetalsItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MoreOrnPlants.MOD_ID, "item/" + block.getId().getPath()));
    }

}
