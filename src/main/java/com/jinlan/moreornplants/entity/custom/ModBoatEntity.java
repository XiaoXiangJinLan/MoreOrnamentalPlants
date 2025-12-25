package com.jinlan.moreornplants.entity.custom;

import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.item.ModItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.function.IntFunction;

public class ModBoatEntity extends Boat {
    private static final EntityDataAccessor<Integer> DATA_TD_TYPE = SynchedEntityData.defineId(Boat.class, EntityDataSerializers.INT);

    public ModBoatEntity(EntityType<? extends Boat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public ModBoatEntity(Level level, double pX, double pY, double pZ) {
        this(ModEntities.MOD_BOAT.get(), level);
        this.setPos(pX, pY, pZ);
        this.xo = pX;
        this.yo = pY;
        this.zo = pZ;
    }

    @Override
    public Item getDropItem() {
        return switch (getModVariant()) {
            case RED_MEI -> ModItems.RED_MEI_BOAT.get();
            case WHITE_MEI -> ModItems.WHITE_MEI_BOAT.get();
            case GREEN_CALYX_MEI ->ModItems.GREEN_CALYX_MEI_BOAT.get();
            case DOUBLE_PINK_MEI ->ModItems.DOUBLE_PINK_MEI_BOAT.get();
            case CRABAPPLE ->ModItems.CRABAPPLE_BOAT.get();
            case APRICOT ->ModItems.APRICOT_BOAT.get();
            case PEACH ->ModItems.PEACH_BOAT.get();
            case PEAR ->ModItems.PEAR_BOAT.get();
            case PURPLE_LEAF_PLUM ->ModItems.PURPLE_LEAF_PLUM_BOAT.get();
            case OSMANTHUS ->ModItems.OSMANTHUS_BOAT.get();
            case GINKGO ->ModItems.GINKGO_BOAT.get();
            case SWEETGUM ->ModItems.SWEETGUM_BOAT.get();
            case CHINESE_PARASOL ->ModItems.CHINESE_PARASOL_BOAT.get();
            case CAMPHOR ->ModItems.CAMPHOR_BOAT.get();
            case DOVE_TREE ->ModItems.DOVE_TREE_BOAT.get();
            case CHINABERRY ->ModItems.CHINABERRY_BOAT.get();
        };
    }

    public void setVariant(Type pVariant) {
        this.entityData.set(DATA_TD_TYPE, pVariant.ordinal());
    }

    public Type getModVariant() {
        return Type.byId(this.entityData.get(DATA_TD_TYPE));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_TD_TYPE, Type.RED_MEI.ordinal());
    }

    protected void addAdditionalSavaData(CompoundTag pCompound) {
        pCompound.putString("Type", this.getModVariant().getSerializedName());
    }

    protected void readAdditionalSaveData(CompoundTag pCompound) {
        if (pCompound.contains("Type", 8)) {
            this.setVariant(Type.byName(pCompound.getString("Type")));
        }
    }

    public static enum Type implements StringRepresentable {
        RED_MEI(ModBlocks.RED_MEI_PLANKS.get(), "red_mei"),
        WHITE_MEI(ModBlocks.WHITE_MEI_PLANKS.get(), "white_mei"),
        GREEN_CALYX_MEI(ModBlocks.GREEN_CALYX_MEI_PLANKS.get(), "green_calyx_mei"),
        DOUBLE_PINK_MEI(ModBlocks.DOUBLE_PINK_MEI_PLANKS.get(), "double_pink_mei"),
        CRABAPPLE(ModBlocks.CRABAPPLE_PLANKS.get(), "crabapple"),
        APRICOT(ModBlocks.APRICOT_PLANKS.get(), "apricot"),
        PEACH(ModBlocks.PEACH_PLANKS.get(), "peach"),
        PEAR(ModBlocks.PEAR_PLANKS.get(), "pear"),
        PURPLE_LEAF_PLUM(ModBlocks.PURPLE_LEAF_PLUM_PLANKS.get(), "purple_leaf_plum"),
        OSMANTHUS(ModBlocks.OSMANTHUS_PLANKS.get(), "osmanthus"),
        GINKGO(ModBlocks.GINKGO_PLANKS.get(), "ginkgo"),
        SWEETGUM(ModBlocks.SWEETGUM_PLANKS.get(), "sweetgum"),
        CHINESE_PARASOL(ModBlocks.CHINESE_PARASOL_PLANKS.get(), "chinese_parasol"),
        CAMPHOR(ModBlocks.CAMPHOR_PLANKS.get(), "camphor"),
        DOVE_TREE(ModBlocks.DOVE_TREE_PLANKS.get(), "dove_tree"),
        CHINABERRY(ModBlocks.CHINABERRY_PLANKS.get(), "chinaberry");

        private final String name;
        private final Block planks;
        public static final StringRepresentable.EnumCodec<ModBoatEntity.Type> CODEC = StringRepresentable.fromEnum(ModBoatEntity.Type::values);
        private static final IntFunction<ModBoatEntity.Type> BY_ID = ByIdMap.continuous(Enum::ordinal, values(), ByIdMap.OutOfBoundsStrategy.ZERO);

        private Type(Block pPlanks, String pName) {
        this.name = pName;
        this.planks = pPlanks;
        }

        public String getSerializedName() {return this.name;}

        public String getName() {return this.name;}

        public Block getPlanks() {return this.planks;}

        public String toString() {return this.name;}

        public static ModBoatEntity.Type byId(int pId) {return BY_ID.apply(pId);}

        public static ModBoatEntity.Type byName(String pName) {
        return CODEC.byName(pName, RED_MEI);
    }
    }
}
