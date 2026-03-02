package com.jinlan.moreornplants;

import com.jinlan.moreornplants.block.ModBlockEntities;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.init.*;
import com.jinlan.moreornplants.item.ModCreativeModeTabs;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.worldgen.biome.ModTerrablender;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.util.Map;

import static com.jinlan.moreornplants.config.ModBiomeConfig.SPEC;

@Mod(MoreOrnPlants.MODID)
public class MoreOrnPlants {
    public static final String MODID = "more_orn_plants";
    public static final Logger LOGGER = LogUtils.getLogger();

    private Map<Item, Item> cuttingMap;

    public MoreOrnPlants(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        ModEntities.register(modEventBus);
        ModParticleTypes.register(modEventBus);
        ModBlockStateProviderTypes.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacerTypes.register(modEventBus);
        ModTreeDecoratorTypes.register(modEventBus);
        ModBambooFeatures.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        modContainer.registerConfig(ModConfig.Type.COMMON, SPEC, "moreornplants-common.toml");
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");

        event.enqueueWork(ModTerrablender::registerBiomes);

        initCuttingMap();
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    private void initCuttingMap() {
        // 使用 Map.ofEntries 构建不可变映射（或 HashMap 亦可）
        cuttingMap = Map.ofEntries(
                Map.entry(ModBlocks.CHINESE_ROSE.asItem(), ModBlocks.CUT_CHINESE_ROSE.asItem()),
                Map.entry(ModBlocks.PINK_CHINESE_ROSE.asItem(), ModBlocks.CUT_PINK_ROSE.asItem()),
                Map.entry(ModBlocks.YELLOW_CHINESE_ROSE.asItem(), ModBlocks.CUT_YELLOW_ROSE.asItem()),
                Map.entry(ModBlocks.WHITE_CHINESE_ROSE.asItem(), ModBlocks.CUT_WHITE_ROSE.asItem()),
                Map.entry(ModBlocks.BAOHUA_CHINESE_ROSE.asItem(), ModBlocks.CUT_BAOHUA_CHINESE_ROSE.asItem()),
                Map.entry(ModBlocks.COTTON_ROSE.asItem(), ModBlocks.CUT_COTTON_ROSE.asItem()),
                Map.entry(ModBlocks.PEONY.asItem(), ModBlocks.CUT_PEONY.asItem()),
                Map.entry(ModBlocks.LIGHT_PINK_PEONY.asItem(), ModBlocks.CUT_LIGHT_PINK_PEONY.asItem()),
                Map.entry(ModBlocks.VIOLET_PINK_PEONY.asItem(), ModBlocks.CUT_VIOLET_PINK_PEONY.asItem()),
                Map.entry(ModBlocks.RED_PEONY.asItem(), ModBlocks.CUT_RED_PEONY.asItem()),
                Map.entry(ModBlocks.LIGHT_RED_PEONY.asItem(), ModBlocks.CUT_LIGHT_RED_PEONY.asItem()),
                Map.entry(ModBlocks.INK_RED_PEONY.asItem(), ModBlocks.CUT_INK_RED_PEONY.asItem()),
                Map.entry(ModBlocks.PURPLE_PEONY.asItem(), ModBlocks.CUT_PURPLE_PEONY.asItem()),
                Map.entry(ModBlocks.LIGHT_PURPLE_PEONY.asItem(), ModBlocks.CUT_LIGHT_PURPLE_PEONY.asItem()),
                Map.entry(ModBlocks.INK_PURPLE_PEONY.asItem(), ModBlocks.CUT_INK_PURPLE_PEONY.asItem()),
                Map.entry(ModBlocks.YELLOW_PEONY.asItem(), ModBlocks.CUT_YELLOW_PEONY.asItem()),
                Map.entry(ModBlocks.LIGHT_YELLOW_PEONY.asItem(), ModBlocks.CUT_LIGHT_YELLOW_PEONY.asItem()),
                Map.entry(ModBlocks.OCHRE_YELLOW_PEONY.asItem(), ModBlocks.CUT_OCHRE_YELLOW_PEONY.asItem()),
                Map.entry(ModBlocks.WHITE_PEONY.asItem(), ModBlocks.CUT_WHITE_PEONY.asItem()),
                Map.entry(ModBlocks.INK_PEONY.asItem(), ModBlocks.CUT_INK_PEONY.asItem()),
                Map.entry(ModBlocks.BLUE_PEONY.asItem(), ModBlocks.CUT_BLUE_PEONY.asItem()),
                Map.entry(ModBlocks.GREEN_PEONY.asItem(), ModBlocks.CUT_GREEN_PEONY.asItem()),
                Map.entry(ModBlocks.WU_HUA_LONG_YU_PEONY.asItem(), ModBlocks.CUT_WU_HUA_LONG_YU_PEONY.asItem()),
                Map.entry(ModBlocks.MAUVE_PEONY.asItem(), ModBlocks.CUT_MAUVE_PEONY.asItem()),
                Map.entry(ModBlocks.WINTERSWEET.asItem(), ModBlocks.CUT_WINTERSWEET.asItem())
        );
    }

    @SubscribeEvent
    public void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        Player player = event.getEntity();
        Level level = event.getLevel();

        // 只在服务端执行
        if (level.isClientSide) return;

        ItemStack mainHand = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();

        // 检查主手剪刀，副手粉色月季
        if (!mainHand.is(Items.SHEARS)) return;

        Item cutItem = cuttingMap.get(offHand.getItem());
        if (cutItem != null) {
            ItemStack result = new ItemStack(cutItem, 4);
            // 非创造模式下消耗物品和耐久
            if (!player.isCreative()) {
                offHand.shrink(1);
                mainHand.hurtAndBreak(1, player, Player.getSlotForHand(event.getHand()));
            }

            // 给予切花月季，背包满则掉落
            if (!player.getInventory().add(result)) {
                player.drop(result, false);
            }

            // 取消事件，防止其他逻辑干扰
            event.setCanceled(true);
            event.setCancellationResult(InteractionResult.SUCCESS);
        }
    }
}
