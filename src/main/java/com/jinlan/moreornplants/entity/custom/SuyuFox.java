package com.jinlan.moreornplants.entity.custom;

import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class SuyuFox extends ZiyingFox {
    public SuyuFox(EntityType<? extends ZiyingFox> entityType, Level level) {
        super(entityType, level);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.33F)
                .add(Attributes.MAX_HEALTH, 36.0)
                .add(Attributes.FOLLOW_RANGE, 32.0)
                .add(Attributes.ATTACK_DAMAGE, 9.0);
    }

    @Override
    public SuyuFox getBreedOffspring(@NotNull ServerLevel level, @NotNull AgeableMob otherParent) {
        SuyuFox suyuFox = ModEntities.SUYU_FOX.get().create(level);
        if (suyuFox != null && otherParent instanceof SuyuFox) {
            if (this.isTame()) {
                suyuFox.setOwnerUUID(this.getOwnerUUID());
                suyuFox.setTame(true);
            }
        }
        return suyuFox;
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ModTags.Items.SUYU_FOX_FOOD);
    }

    @Override
    public boolean isBeadFood(ItemStack stack) {
        return stack.is(ModTags.Items.SUYU_FOX_APPEAL_TO);
    }

    @Override
    protected Item getBeadItem() {
        return ModItems.SUYU_BEAD.get();
    }

    @Override
    public Ingredient getTemptItem() {
        return Ingredient.of(ModTags.Items.SUYU_FOX_APPEAL_TO);
    }

    @Override
    protected void onHurt() {
        this.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 0));
        this.playSound(SoundEvents.FOX_SCREECH, 1.0F, 1.0F);
    }
}
