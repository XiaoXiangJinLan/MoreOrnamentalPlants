package com.jinlan.moreornplants.entity.custom;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.block.FlowerBlocks.CutFlowerBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusBlock;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.PeachBlock;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.GoalSelector;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.ForgeEventFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BaihuaCat extends Cat {
    private static final EntityDataAccessor<String> DATA_TEXTURE =
            SynchedEntityData.defineId(BaihuaCat.class, EntityDataSerializers.STRING);
    private static final EntityDataAccessor<Integer> DATA_COLLAR_COLOR =
            SynchedEntityData.defineId(BaihuaCat.class, EntityDataSerializers.INT);
    private static final Ingredient TEMPT_INGREDIENT = Ingredient.of(ModTags.Items.BAIHUA_CAT_FOOD);

    private TemptGoal baihuaTemptGoal;
    private int producePeachTimer = 0;
    private int produceApricotTimer = 0;
    private int produceCrabappleTimer = 0;
    private int regenCooldown = 0;

    public BaihuaCat(EntityType<? extends Cat> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        removeGoals(goalSelector);

        this.baihuaTemptGoal = new TemptGoal(this, 1.1D, TEMPT_INGREDIENT, false);
        this.goalSelector.addGoal(4, this.baihuaTemptGoal);

        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
    }

    private void removeGoals(GoalSelector selector) {
        selector.getAvailableGoals().removeIf(wrapped -> wrapped.getGoal() instanceof TemptGoal);
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.MOVEMENT_SPEED, 0.3)
                .add(Attributes.ATTACK_DAMAGE, 5.0);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_COLLAR_COLOR, DyeColor.RED.getId());
        this.entityData.define(DATA_TEXTURE, "standard");
    }

    public void setTextureKey(String key) {
        this.entityData.set(DATA_TEXTURE, key);
    }

    public String getTextureKey() {
        return this.entityData.get(DATA_TEXTURE);
    }

    public ResourceLocation getEyesTextureLocation() {
        String key = this.getTextureKey();
        String fileName;
        if (key == null || key.isEmpty() || "standard".equals(key)) {
            fileName = "baihua_cat_eyes.png";
        } else {
            fileName = "baihua_cat_" + key + "_eyes.png";
        }
        return new ResourceLocation(MoreOrnPlants.MOD_ID, "textures/entity/baihua_cat/" + fileName);
    }

    public @NotNull DyeColor getCollarColor() {
        return DyeColor.byId(this.entityData.get(DATA_COLLAR_COLOR));
    }

    public void setCollarColor(DyeColor color) {
        this.entityData.set(DATA_COLLAR_COLOR, color.getId());
    }

    @Override
    public void addAdditionalSaveData(@NotNull net.minecraft.nbt.CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putString("TextureKey", this.getTextureKey());
        compound.putByte("CollarColor", (byte) this.getCollarColor().getId());
        compound.putInt("ProducePeachTimer", this.producePeachTimer);
        compound.putInt("ProduceApricotTimer", this.produceApricotTimer);
        compound.putInt("ProduceCrabappleTimer", this.produceCrabappleTimer);
        compound.putInt("RegenCooldown", this.regenCooldown);
    }

    @Override
    public void readAdditionalSaveData(@NotNull net.minecraft.nbt.CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        if (compound.contains("TextureKey")) {
            this.setTextureKey(compound.getString("TextureKey"));
        }
        if (compound.contains("CollarColor", 99)) {
            this.setCollarColor(DyeColor.byId(compound.getInt("CollarColor")));
        }
        this.producePeachTimer = compound.getInt("ProducePeachTimer");
        this.produceApricotTimer = compound.getInt("ProduceApricotTimer");
        this.produceCrabappleTimer = compound.getInt("ProduceCrabappleTimer");
        this.regenCooldown = compound.getInt("RegenCooldown");
    }

    @Override
    public BaihuaCat getBreedOffspring(@NotNull ServerLevel level, @NotNull AgeableMob otherParent) {
        BaihuaCat baihuaCat = ModEntities.BAIHUA_CAT.get().create(level);
        if (baihuaCat != null && otherParent instanceof BaihuaCat baihuaCat1) {
            if (this.isTame()) {
                baihuaCat.setOwnerUUID(this.getOwnerUUID());
                baihuaCat.setTame(true);
                String thisTexture = this.getTextureKey();
                String otherTexture = baihuaCat1.getTextureKey();
                if ("standard".equals(thisTexture) || "standard".equals(otherTexture)) {
                    String[] allVariants = {"standard", "pink", "blue", "purple"};
                    String chosen = allVariants[this.random.nextInt(allVariants.length)];
                    baihuaCat.setTextureKey(chosen);
                } else {
                    baihuaCat.setTextureKey(this.random.nextBoolean() ? thisTexture : otherTexture);
                }
                if (this.random.nextBoolean()) {
                    baihuaCat.setCollarColor(this.getCollarColor());
                } else {
                    baihuaCat.setCollarColor(baihuaCat1.getCollarColor());
                }
            }
        }
        return baihuaCat;
    }

    @Override
    public void tick() {
        super.tick();
        if (this.baihuaTemptGoal != null && this.baihuaTemptGoal.isRunning() && !this.isTame() && this.tickCount % 100 == 0) {
            this.playSound(SoundEvents.CAT_BEG_FOR_FOOD, 1.0F, 1.0F);
        }
    }

    @Override
    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor level, @NotNull DifficultyInstance difficulty,
                                        @NotNull MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData, @javax.annotation.Nullable CompoundTag pDataTag) {
        spawnGroupData = super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData, pDataTag);
        if (!level.isClientSide()) {
            if (level.getBiome(this.blockPosition()).is(ModBiomes.CRABAPPLE_GROVE)) {
                this.setTextureKey("pink");
            } else {
                String[] variants = {"standard", "pink", "blue", "purple"};
                String chosen = variants[this.random.nextInt(variants.length)];
                this.setTextureKey(chosen);
            }
        }
        return spawnGroupData;
    }

    @Override
    public @NotNull InteractionResult mobInteract(Player pPlayer, @NotNull InteractionHand pHand) {
        ItemStack item = pPlayer.getItemInHand(pHand);
        if (this.level().isClientSide) {
            boolean flag = this.isOwnedBy(pPlayer) || this.isTame() || item.is(ModTags.Items.BAIHUA_CAT_FOOD) && !this.isTame();
            return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
        } else {
            if (this.isTame()) {
                if (item.getItem() instanceof DyeItem dye) {
                    DyeColor dyeColor = dye.getDyeColor();
                    if (dyeColor != this.getCollarColor()) {
                        if (!this.level().isClientSide) {
                            this.setCollarColor(dyeColor);
                            item.shrink(1);
                        }
                        return InteractionResult.sidedSuccess(this.level().isClientSide);
                    }
                }
                if (this.isFood(item) && this.getHealth() < this.getMaxHealth()) {
                    this.heal((float)item.getFoodProperties(this).getNutrition());
                    this.usePlayerItem(pPlayer, pHand, item);
                    return InteractionResult.CONSUME;
                }
                if (this.isPeachSapling(item) && this.producePeachTimer == 0) {
                    this.producePeachTimer = 200;
                    if (!pPlayer.getAbilities().instabuild) {
                        item.shrink(1);
                    }
                    this.playSound(SoundEvents.CAT_EAT, 0.5F, 1.0F);
                    return InteractionResult.SUCCESS;
                }
                if (this.isApricotSapling(item) && this.produceApricotTimer == 0) {
                    this.produceApricotTimer = 100;
                    if (!pPlayer.getAbilities().instabuild) {
                        item.shrink(1);
                    }
                    this.playSound(SoundEvents.CAT_EAT, 0.5F, 1.0F);
                    return InteractionResult.SUCCESS;
                }
                if (this.isCrabappleSapling(item) && this.produceCrabappleTimer == 0) {
                    this.produceCrabappleTimer = 100;
                    if (!pPlayer.getAbilities().instabuild) {
                        item.shrink(1);
                    }
                    this.playSound(SoundEvents.CAT_EAT, 0.5F, 1.0F);
                    return InteractionResult.SUCCESS;
                }
                return super.mobInteract(pPlayer, pHand);
            } else if (item.is(ModTags.Items.BAIHUA_CAT_FOOD) && !this.isTame()) {
                item.shrink(1);
                this.tryToTame(pPlayer);
                return InteractionResult.SUCCESS;
            } else {
                return super.mobInteract(pPlayer, pHand);
            }
        }
    }

    private void tryToTame(Player player) {
        if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, player)) {
            this.tame(player);
            this.setOrderedToSit(true);
            this.level().broadcastEntityEvent(this, (byte)7);
        } else {
            this.level().broadcastEntityEvent(this, (byte)6);
        }
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ModTags.Items.BAIHUA_CAT_FOOD);
    }

    public boolean isPeachSapling(ItemStack stack) {
        return stack.is(ModItems.IMMORTAL_PEACH.get());
    }
    public boolean isApricotSapling(ItemStack stack) {
        return stack.is(ModItems.CLOUD_APRICOT.get());
    }
    public boolean isCrabappleSapling(ItemStack stack) {
        return stack.is(ModItems.CRABAPPLE.get());
    }

    public SimpleParticleType getParticle() {
        String key = getTextureKey();
        return switch (key) {
            case "pink" -> ModParticleTypes.BAIHUA_CAT_PINK.get();
            case "blue" -> ModParticleTypes.BAIHUA_CAT_BLUE.get();
            case "purple" -> ModParticleTypes.BAIHUA_CAT_PURPLE.get();
            default -> ModParticleTypes.BAIHUA_CAT.get();
        };
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (this.level().isClientSide) {
            if (this.random.nextInt(8) == 0) {
                SimpleParticleType particle = this.getParticle();
                double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getBbWidth() * 1.2;
                double y = this.getY() + this.random.nextDouble() * this.getBbHeight() * 0.8 + 0.2;
                double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getBbWidth() * 1.2;
                this.level().addParticle(particle, x, y, z, 0.0, 0.05, 0.0);
            }
        }

        if (!this.level().isClientSide && this.isAlive() && this.isEffectiveAi()) {
            if (this.producePeachTimer > 0) {
                this.producePeachTimer--;
                if (this.producePeachTimer == 0) {
                    this.givePeach();
                }
            }
            if (this.produceApricotTimer > 0) {
                this.produceApricotTimer--;
                if (this.produceApricotTimer == 0) {
                    this.giveApricot();
                }
            }
            if (this.produceCrabappleTimer > 0) {
                this.produceCrabappleTimer--;
                if (this.produceCrabappleTimer == 0) {
                    this.giveCrabapple();
                }
            }

            if (this.getHealth() < this.getMaxHealth()) {
                if (this.regenCooldown <= 0) {
                    this.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 180, 2));
                    this.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 0));
                    this.regenCooldown = 200;
                } else {
                    this.regenCooldown--;
                }
            } else {
                this.regenCooldown = 0;
            }

            if (this.tickCount % 60 == 0) {
                this.growNearbyPlants();
            }
        }
    }

    protected void givePeach() {
        ItemStack stack = new ItemStack(ModBlocks.IMMORTAL_PEACH_SAPLING.get());
        this.spawnAtLocation(stack);
        this.playSound(SoundEvents.CAT_PURR, 1.0F, 1.0F);
    }
    protected void giveApricot() {
        ItemStack stack = new ItemStack(ModBlocks.CLOUD_APRICOT_SAPLING.get());
        this.spawnAtLocation(stack);
        this.playSound(SoundEvents.CAT_PURR, 1.0F, 1.0F);
    }
    protected void giveCrabapple() {
        ItemStack stack = new ItemStack(ModBlocks.UPRIGHT_CRABAPPLE_SAPLING.get());
        this.spawnAtLocation(stack);
        this.playSound(SoundEvents.CAT_PURR, 1.0F, 1.0F);
    }

    private void growNearbyPlants() {
        BlockPos center = this.blockPosition();
        int radius = 1; // 半径
        BlockPos.betweenClosed(center.offset(-radius, -1, -radius), center.offset(radius, 1, radius))
                .forEach(pos -> {
                    BlockState state = this.level().getBlockState(pos);
                    // 检查是否为可催熟植物（作物、切花等）
                    if (state.getBlock() instanceof CropBlock cropBlock) {
                        if (cropBlock.isValidBonemealTarget(this.level(), pos, state, false)) {
                            if (this.random.nextInt(2) == 0) {
                                cropBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    } else if (state.getBlock() instanceof WaterLotusBlock waterLotusBlock) {
                        if (waterLotusBlock.isValidBonemealTarget(this.level(), pos, state, false)) {
                            if (this.random.nextInt(2) == 0) {
                                waterLotusBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    } else if (state.getBlock() instanceof CutFlowerBlock cutFlowerBlock) {
                        if (cutFlowerBlock.isValidBonemealTarget(this.level(), pos, state, false)) {
                            if (this.random.nextInt(2) == 0) {
                                cutFlowerBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    } else if (state.getBlock() instanceof PeachBlock peachBlock) {
                        if (peachBlock.isValidBonemealTarget(this.level(), pos, state, false)) {
                            if (this.random.nextInt(10) == 0) {
                                peachBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    }
                });
    }

    private void spawnBonemealParticles(BlockPos pos) {
        if (this.level() instanceof ServerLevel serverLevel) {
            // 绿色粒子（类似骨粉催熟时的效果）
            serverLevel.sendParticles(net.minecraft.core.particles.ParticleTypes.HAPPY_VILLAGER,
                    pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5,
                    5, 0.2, 0.2, 0.2, 0.01);
        }
    }

    @Override
    public boolean wantsToAttack(@NotNull LivingEntity target, @NotNull LivingEntity owner) {
        if (target instanceof Creeper || target instanceof Ghast || target instanceof ArmorStand) {
            return false;
        } else {
            if (target instanceof Player) {
                return false;
            }
            return !(target instanceof AbstractHorse) && !(target instanceof TamableAnimal);
        }
    }

    @Override
    public boolean doHurtTarget(@NotNull Entity target) {
        float damage = (float) this.getAttributeValue(Attributes.ATTACK_DAMAGE);
        if (target instanceof Enemy || target instanceof NeutralMob) {
            damage *= 9.0F;
        }
        boolean hurt = target.hurt(this.damageSources().mobAttack(this), damage);
        if (hurt) {
            this.playSound(SoundEvents.CAT_HISS, 1.0F, 1.0F);
            this.doEnchantDamageEffects(this, target);
        }
        return hurt;
    }

    @Override
    public boolean hurt(@NotNull DamageSource source, float amount) {
        boolean hurt = super.hurt(source, amount);
        if (hurt && this.isAlive()) {
            this.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 2));
            this.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0));
        }
        return hurt;
    }
}
