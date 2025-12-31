package com.jinlan.moreornplants.init;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.feature.treedecorators.*;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTreeDecoratorTypes {
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATOR =
            DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, MoreOrnPlants.MOD_ID);

    public static final RegistryObject<TreeDecoratorType<WeepingMeiVineDecorator>> WEEPING_MEI_VINE_DECORATOR =
            TREE_DECORATOR.register("weeping_mei_vine_decorator", () -> new TreeDecoratorType<>(WeepingMeiVineDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<VersicolorWeepingMeiVineDecorator>> VERSICOLOR_WEEPING_MEI_VINE_DECORATOR =
            TREE_DECORATOR.register("versicolor_weeping_mei_vine_decorator", () -> new TreeDecoratorType<>(VersicolorWeepingMeiVineDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<WeepingCrabappleFlowerDecorator>> WEEPING_CRABAPPLE_FLOWER_DECORATOR =
            TREE_DECORATOR.register("weeping_crabapple_flower_decorator", () -> new TreeDecoratorType<>(WeepingCrabappleFlowerDecorator.CODEC));

    public static final RegistryObject<TreeDecoratorType<SnowAroundTrunk>> SNOW_AROUND_TRUNK =
            TREE_DECORATOR.register("snow_around_trunk", () -> new TreeDecoratorType<>(SnowAroundTrunk.CODEC));

    public static final RegistryObject<TreeDecoratorType<LeafPileDecorator>> LEAF_PILE_DECORATOR =
            TREE_DECORATOR.register("leaf_pile_decorator",
                    () -> new TreeDecoratorType<>(LeafPileDecorator.CODEC));

    public static void register(IEventBus eventBus){
        TREE_DECORATOR.register(eventBus);
    }
}
