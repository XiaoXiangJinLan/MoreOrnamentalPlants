package com.jinlan.moreornplants.client;

import com.jinlan.moreornplants.Particle.BlossomParticle;
import com.jinlan.moreornplants.init.ModParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

@Environment(EnvType.CLIENT)
public class Particle implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.RED_MEI_LEAVES, spriteProvider ->
                (parameters, world, x, y, z, velocityX, velocityY, velocityZ) ->
                        new BlossomParticle(world, x, y, z, spriteProvider)
        );
        ParticleFactoryRegistry.getInstance().register(ModParticles.WHITE_MEI_LEAVES, spriteProvider ->
                (parameters, world, x, y, z, velocityX, velocityY, velocityZ) ->
                        new BlossomParticle(world, x, y, z, spriteProvider)
        );
        ParticleFactoryRegistry.getInstance().register(ModParticles.GREEN_CALYX_MEI_LEAVES, spriteProvider ->
                (parameters, world, x, y, z, velocityX, velocityY, velocityZ) ->
                        new BlossomParticle(world, x, y, z, spriteProvider)
        );
        ParticleFactoryRegistry.getInstance().register(ModParticles.DOUBLE_PINK_MEI_LEAVES, spriteProvider ->
                (parameters, world, x, y, z, velocityX, velocityY, velocityZ) ->
                        new BlossomParticle(world, x, y, z, spriteProvider)
        );
        ParticleFactoryRegistry.getInstance().register(ModParticles.VERSICOLOR_MEI_LEAVES, spriteProvider ->
                (parameters, world, x, y, z, velocityX, velocityY, velocityZ) ->
                        new BlossomParticle(world, x, y, z, spriteProvider)
        );
    }
}
