package com.jinlan.moreornplants.entity.client;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.BaihuaCat;
import net.minecraft.client.renderer.entity.CatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.Cat;
import org.jetbrains.annotations.NotNull;

public class BaihuaCatRenderer extends CatRenderer {
    private static final ResourceLocation TEXTURE = new ResourceLocation(MoreOrnPlants.MOD_ID, "textures/entity/baihua_cat/baihua_cat.png");

    public BaihuaCatRenderer(EntityRendererProvider.Context p_173943_) {
        super(p_173943_);
        this.addLayer(new BaihuaCatEyesLayer(this));
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull Cat entity) {
        if (entity instanceof BaihuaCat baihuaCat) {
            String key = baihuaCat.getTextureKey();
            if (key != null && !key.isEmpty()) {
                String fileName;
                if ("standard".equals(key)) {
                    fileName = "baihua_cat.png";
                } else {
                    fileName = "baihua_cat_" + key + ".png";
                }
                return new ResourceLocation(MoreOrnPlants.MOD_ID,
                        "textures/entity/baihua_cat/" + fileName);
            }
        }
        return TEXTURE;
    }
}
