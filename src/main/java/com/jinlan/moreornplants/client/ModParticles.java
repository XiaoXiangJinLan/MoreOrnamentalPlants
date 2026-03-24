package com.jinlan.moreornplants.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.particle.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreOrnPlants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModParticles {
    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ModParticleTypes.RED_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.GREEN_CALYX_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.DOUBLE_PINK_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.VERSICOLOR_MEI_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.UPRIGHT_CRABAPPLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WEEPING_CRABAPPLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PINK_APRICOT_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_APRICOT_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CLOUD_APRICOT_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.ORNAMENTAL_PEACH_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new PeachParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WILD_PEACH_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new PeachParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.IMMORTAL_PEACH_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new PeachParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PEAR_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.FLOWERING_PURPLE_LEAF_PLUM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PURPLE_LEAF_PLUM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.GOLDEN_OSMANTHUS_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.ORANGE_OSMANTHUS_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_OSMANTHUS_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.GOLDEN_GINKGO_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new ChineseParasolParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.SWEETGUM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new ChineseParasolParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CAMPHOR_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new CamphorParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.DOVE_TREE_BLOSSOM_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new ChineseParasolParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CHINABERRY_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.DESERT_POPLAR_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CRAPE_MYRTLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.RED_CRAPE_MYRTLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PINK_CRAPE_MYRTLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_CRAPE_MYRTLE_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.CAMELLIA_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new CamphorParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.WHITE_CAMELLIA_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new CamphorParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.PINK_CAMELLIA_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new CamphorParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.VERSICOLOR_CAMELLIA_LEAVES.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new CamphorParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.BAIHUA_CAT.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.BAIHUA_CAT_PINK.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.BAIHUA_CAT_BLUE.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.BAIHUA_CAT_PURPLE.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.ZIYING_FOX.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
        event.registerSpriteSet(ModParticleTypes.SUYU_FOX.get(), ((spriteProvider) ->
                (parameters, pLevel, pX, pY, pZ, velocitypX, velocitypY, velocitypZ) ->
                        new BlossomParticle(pLevel, pX, pY, pZ, spriteProvider)
        ));
    }
}
