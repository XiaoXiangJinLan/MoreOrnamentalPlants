package com.jinlan.moreornplants.entity.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.client.renderer.entity.CatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cat;
import org.jetbrains.annotations.NotNull;

public class BaihuaCatRenderer extends CatRenderer {
    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(MoreOrnPlants.MODID, "textures/entity/baihua_cat/baihua_cat.png");

    public BaihuaCatRenderer(EntityRendererProvider.Context p_173943_) {
        super(p_173943_);
        this.addLayer(new BaihuaCatEyesLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Cat entity) {
        return TEXTURE;
    }
}
