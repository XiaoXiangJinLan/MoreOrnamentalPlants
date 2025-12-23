package com.jinlan.moreornplants;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.init.ModParticles;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class More_Orn_Plants implements ModInitializer {
	public static final String MOD_ID = "more_orn_plants";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModParticles.initialize();

        StrippableBlockRegistry.register(ModBlocks.RED_MEI_LOG, ModBlocks.STRIPPED_RED_MEI_LOG);
        StrippableBlockRegistry.register(ModBlocks.WHITE_MEI_LOG, ModBlocks.STRIPPED_WHITE_MEI_LOG);
        StrippableBlockRegistry.register(ModBlocks.GREEN_CALYX_MEI_LOG, ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG);
        StrippableBlockRegistry.register(ModBlocks.DOUBLE_PINK_MEI_LOG, ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG);
        StrippableBlockRegistry.register(ModBlocks.RED_MEI_WOOD, ModBlocks.STRIPPED_RED_MEI_WOOD);
        StrippableBlockRegistry.register(ModBlocks.WHITE_MEI_WOOD, ModBlocks.STRIPPED_WHITE_MEI_WOOD);
        StrippableBlockRegistry.register(ModBlocks.GREEN_CALYX_MEI_WOOD, ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD);
        StrippableBlockRegistry.register(ModBlocks.DOUBLE_PINK_MEI_WOOD, ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD);

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MEI_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_MEI_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CALYX_MEI_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DOUBLE_PINK_MEI_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERSICOLOR_MEI_LEAVES, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WEEPING_MEI, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_WEEPING_MEI_PLANT, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WEEPING_MEI, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WEEPING_MEI_PLANT, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WEEPING_MEI, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_WEEPING_MEI_PLANT, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WEEPING_MEI, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_WEEPING_MEI_PLANT, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERSICOLOR_WEEPING_MEI, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERSICOLOR_WEEPING_MEI_PLANT, 30, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CALYX_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DOUBLE_PINK_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_MEI_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_MEI_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_CALYX_MEI_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DOUBLE_PINK_MEI_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_RED_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WHITE_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GREEN_CALYX_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_LOG, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_RED_MEI_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WHITE_MEI_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_GREEN_CALYX_MEI_WOOD, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_DOUBLE_PINK_MEI_WOOD, 5, 5);

        LOGGER.info("Hello Fabric world!");
	}
}