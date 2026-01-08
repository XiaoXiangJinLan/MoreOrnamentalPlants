package com.jinlan.moreornplants.entity.custom;

import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ModChestBoatEntity extends ChestBoat {
    private static final EntityDataAccessor<Integer> DATA_TD_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public ModChestBoatEntity(EntityType<? extends ChestBoat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ModChestBoatEntity(Level level, double pX, double pY, double pZ) {
        this(ModEntities.MOD_CHEST_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public @NotNull Item getDropItem() {
        switch (getModVariant()) {
            case RED_MEI -> ModItems.RED_MEI_CHEST_BOAT.get();
            case WHITE_MEI -> ModItems.WHITE_MEI_CHEST_BOAT.get();
            case GREEN_CALYX_MEI ->ModItems.GREEN_CALYX_MEI_CHEST_BOAT.get();
            case DOUBLE_PINK_MEI ->ModItems.DOUBLE_PINK_MEI_CHEST_BOAT.get();
            case CRABAPPLE ->ModItems.CRABAPPLE_CHEST_BOAT.get();
            case APRICOT ->ModItems.APRICOT_CHEST_BOAT.get();
            case PEACH ->ModItems.PEACH_CHEST_BOAT.get();
            case PEAR ->ModItems.PEAR_CHEST_BOAT.get();
            case PURPLE_LEAF_PLUM ->ModItems.PURPLE_LEAF_PLUM_CHEST_BOAT.get();
            case OSMANTHUS ->ModItems.OSMANTHUS_CHEST_BOAT.get();
            case GINKGO ->ModItems.GINKGO_CHEST_BOAT.get();
            case SWEETGUM ->ModItems.SWEETGUM_CHEST_BOAT.get();
            case CHINESE_PARASOL ->ModItems.CHINESE_PARASOL_CHEST_BOAT.get();
            case CAMPHOR ->ModItems.CAMPHOR_CHEST_BOAT.get();
            case DOVE_TREE ->ModItems.DOVE_TREE_CHEST_BOAT.get();
            case CHINABERRY ->ModItems.CHINABERRY_CHEST_BOAT.get();
            case DESERT_POPLAR ->ModItems.DESERT_POPLAR_CHEST_BOAT.get();
        }
        return super.getDropItem();
    }

    public void setVariant(ModBoatEntity.Type pVariant) {
        this.entityData.set(DATA_TD_TYPE, pVariant.ordinal());
    }

    protected void defineSynchedData(SynchedEntityData.@NotNull Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_TD_TYPE, ModBoatEntity.Type.RED_MEI.ordinal());
    }

    protected void addAdditionalSavaData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(ModBoatEntity.Type.byName(pCompound.getString("Type")));
        }
    }

    public ModBoatEntity.Type getModVariant() {
        return ModBoatEntity.Type.byId(this.entityData.get(DATA_TD_TYPE));
    }

}
