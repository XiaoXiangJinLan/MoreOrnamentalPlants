package com.jinlan.moreornplants.entity.custom;

import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ItemParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.LookControl;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CaveVines;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.entity.living.BabyEntitySpawnEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Predicate;

public class ZiyingFox extends TamableAnimal {
    private static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(ZiyingFox.class, EntityDataSerializers.BYTE);
    static final Predicate<ItemEntity> ALLOWED_ITEMS = p_350086_ -> !p_350086_.hasPickUpDelay() && p_350086_.isAlive();
    static final Predicate<Entity> STALKABLE_PREY = p_28498_ -> p_28498_ instanceof Chicken || p_28498_ instanceof Rabbit;
    private static final Predicate<Entity> AVOID_PLAYERS = p_28463_ -> !p_28463_.isDiscrete() && EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(p_28463_);
    // 1.20.1 中直接计算婴儿尺寸
    private static final EntityDimensions BABY_DIMENSIONS = EntityType.FOX.getDimensions().scale(0.5F);
    private float interestedAngle;
    private float interestedAngleO;
    float crouchAmount;
    float crouchAmountO;
    private int ticksSinceEaten;
    private Goal landTargetGoal;
    private Goal turtleEggTargetGoal;
    private int produceBeadTimer = 0;
    private int regenCooldown = 0;

    public ZiyingFox(EntityType<? extends ZiyingFox> entityType, Level level) {
        super(entityType, level);
        this.lookControl = new ZiyingFoxLookControl();
        this.moveControl = new ZiyingFoxMoveControl();
        this.setPathfindingMalus(BlockPathTypes.DANGER_OTHER, 0.0F);
        this.setPathfindingMalus(BlockPathTypes.DAMAGE_OTHER, 0.0F);
        this.setCanPickUpLoot(true);
        this.registerGoals();
        this.reassessTameGoals();
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_FLAGS_ID, (byte) 0);
    }

    @Override
    protected void registerGoals() {
        // 攻击目标
        this.landTargetGoal = new NearestAttackableTargetGoal<>(
                this, Animal.class, 10, false, false,
                p_28604_ -> p_28604_ instanceof Chicken || p_28604_ instanceof Rabbit
        );
        this.turtleEggTargetGoal = new NearestAttackableTargetGoal<>(this, Turtle.class, 10, false, false, Turtle.BABY_ON_LAND_SELECTOR);
        Goal fishTargetGoal = new NearestAttackableTargetGoal<>(
                this, AbstractFish.class, 20, false, false,
                p_28600_ -> p_28600_ instanceof AbstractSchoolingFish
        );
        this.goalSelector.addGoal(2, new PanicGoal(this, 2.2));
        this.goalSelector.addGoal(0, new ZiyingFoxFloatGoal());
        this.goalSelector.addGoal(0, new ClimbOnTopOfPowderSnowGoal(this, this.level()));
        this.goalSelector.addGoal(1, new ZiyingFoxFaceplantGoal());
        this.goalSelector.addGoal(3, new ZiyingFoxBreedGoal(1.0));
        TemptGoal temptGoal = new TemptGoal(this, 1.1, this.getTemptItem(), false);
        this.goalSelector.addGoal(3, temptGoal);
        this.goalSelector.addGoal(4,
                new AvoidEntityGoal<>(this, Player.class, 8.0F, 1.6, 1.4,
                        p -> AVOID_PLAYERS.test(p) && !this.isOwnedBy(p) && !this.isDefending() && !isHoldingItemAppealTo(p)
                )
        );
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, Wolf.class, 8.0F, 1.6, 1.4,
                p -> !((Wolf) p).isTame() && !this.isDefending()));
        this.goalSelector.addGoal(4, new AvoidEntityGoal<>(this, PolarBear.class, 8.0F, 1.6, 1.4,
                p -> !this.isDefending()));
        this.goalSelector.addGoal(5, new ZiyingFoxStalkPreyGoal());
        this.goalSelector.addGoal(6, new ZiyingFoxPounceGoal());
        this.goalSelector.addGoal(6, new ZiyingFoxSeekShelterGoal(1.25));
        this.goalSelector.addGoal(7, new ZiyingFoxMeleeAttackGoal(1.2F, true));
        this.goalSelector.addGoal(7, new ZiyingFoxSleepGoal());
        this.goalSelector.addGoal(8, new ZiyingFoxFollowParentGoal(this, 1.25));
        this.goalSelector.addGoal(9, new StrollThroughVillageGoal(this, 32) {
            @Override
            public void start() {
                ZiyingFox.this.clearStates();
                super.start();
            }

            @Override
            public boolean canUse() {
                return super.canUse() && canFoxMove();
            }

            @Override
            public boolean canContinueToUse() {
                return super.canContinueToUse() && canFoxMove();
            }

            private boolean canFoxMove() {
                return !ZiyingFox.this.isSleeping() && !ZiyingFox.this.isSitting() && !ZiyingFox.this.isDefending() && ZiyingFox.this.getTarget() == null;
            }
        });
        this.goalSelector.addGoal(10, new ZiyingFoxEatBerriesGoal(1.2F, 12, 1));
        this.goalSelector.addGoal(10, new LeapAtTargetGoal(this, 0.4F));
        this.goalSelector.addGoal(11, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(11, new ZiyingFoxSearchForItemsGoal());
        this.goalSelector.addGoal(12, new ZiyingFoxLookAtPlayerGoal(this, Player.class, 24.0F));
        this.goalSelector.addGoal(13, new ZiyingFoxPerchAndSearchGoal());

        this.goalSelector.addGoal(2, new SitWhenOrderedToGoal(this));
        // 1.20.1 FollowOwnerGoal 构造器
        FollowOwnerGoal followOwnerGoal = new FollowOwnerGoal(this, 1.0, 10.0F, 2.0F, false) {
            @Override
            public boolean canUse() {
                if (ZiyingFox.this.isWandering() || ZiyingFox.this.isOrderedToSit()) {
                    return false;
                }
                return super.canUse();
            }
        };
        this.goalSelector.addGoal(6, followOwnerGoal);

        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
        this.targetSelector.addGoal(6, fishTargetGoal);

        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, Monster.class, true,
                target -> !(target instanceof Creeper) && !(target instanceof TamableAnimal && ((TamableAnimal) target).isTame())
        ));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.33F)
                .add(Attributes.MAX_HEALTH, 36.0)
                .add(Attributes.FOLLOW_RANGE, 32.0)
                .add(Attributes.ATTACK_DAMAGE, 9.0);
    }

    @Override
    public ZiyingFox getBreedOffspring(@NotNull ServerLevel level, @NotNull AgeableMob otherParent) {
        ZiyingFox ziyingFox = ModEntities.ZIYING_FOX.get().create(level);
        if (ziyingFox != null && otherParent instanceof ZiyingFox) {
            if (this.isTame()) {
                ziyingFox.setOwnerUUID(this.getOwnerUUID());
                ziyingFox.setTame(true);   // 1.20.1 只有单参数
            }
        }
        return ziyingFox;
    }

    public static boolean checkZiyingFoxSpawnRules(EntityType<? extends ZiyingFox> ziyingFox, LevelAccessor pLevel, MobSpawnType spawnType, BlockPos pPos, RandomSource random) {
        return pLevel.getBlockState(pPos.below()).is(ModTags.Blocks.ZIYING_FOX_SPAWNABLE_ON) && pLevel.getBrightness(LightLayer.BLOCK, pPos) >= 7;
    }

    @Override
    public void addAdditionalSaveData(@NotNull CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("Sleeping", this.isSleeping());
        compound.putBoolean("Sitting", this.isSitting());
        compound.putBoolean("Crouching", this.isCrouching());
        compound.putBoolean("Wandering", this.isWandering());
        compound.putInt("ProduceBeadTimer", this.produceBeadTimer);
        compound.putInt("RegenCooldown", this.regenCooldown);
    }

    @Override
    public void readAdditionalSaveData(@NotNull CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setSleeping(compound.getBoolean("Sleeping"));
        this.setSitting(compound.getBoolean("Sitting"));
        this.setIsCrouching(compound.getBoolean("Crouching"));
        this.setWandering(compound.getBoolean("Wandering"));
        this.produceBeadTimer = compound.getInt("ProduceBeadTimer");
        this.regenCooldown = compound.getInt("RegenCooldown");
    }

    // ========== 驯服交互 ==========
    @Override
    public @NotNull InteractionResult mobInteract(Player player, @NotNull InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (this.level().isClientSide) {
            boolean flag = this.isOwnedBy(player) || this.isTame() || itemstack.is(ModItems.GOLDEN_CRABAPPLE.get()) && !this.isTame();
            return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
        } else {
            if (this.isTame()) {
                if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    FoodProperties foodproperties = itemstack.getFoodProperties(this);
                    float f = foodproperties != null ? (float) foodproperties.getNutrition() : 1.0F;
                    this.heal(2.0F * f);
                    if (!player.getAbilities().instabuild) {
                        itemstack.shrink(1);
                    }
                    this.gameEvent(GameEvent.EAT);
                    return InteractionResult.SUCCESS;
                }
                if (this.isBeadFood(itemstack) && this.produceBeadTimer == 0) {
                    this.produceBeadTimer = 200;
                    if (!player.getAbilities().instabuild) {
                        itemstack.shrink(1);
                    }
                    this.playSound(SoundEvents.FOX_EAT, 0.5F, 1.0F);
                    return InteractionResult.SUCCESS;
                } else {
                    InteractionResult interactionresult = super.mobInteract(player, hand);
                    if (!interactionresult.consumesAction() && this.isOwnedBy(player)) {
                        // 循环状态：坐下 -> 跟随 -> 游荡 -> 坐下
                        if (this.isOrderedToSit()) {
                            // 当前是坐下，切换到跟随
                            this.setOrderedToSit(false);
                            this.setWandering(false);
                        } else if (this.isWandering()) {
                            // 当前是游荡，切换到坐下
                            this.setOrderedToSit(true);
                            this.setWandering(false);
                        } else {
                            // 当前是跟随，切换到游荡
                            this.setOrderedToSit(false);
                            this.setWandering(true);
                        }
                        this.jumping = false;
                        this.navigation.stop();
                        this.setTarget(null);
                        return InteractionResult.SUCCESS;
                    }
                    return interactionresult;
                }
            } else if (itemstack.is(ModItems.GOLDEN_CRABAPPLE.get()) && !this.isTame()) {
                if (!player.getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                this.tryToTame(player);
                return InteractionResult.SUCCESS;
            } else {
                return super.mobInteract(player, hand);
            }
        }
    }

    private void tryToTame(Player player) {
        if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, player)) {
            this.tame(player);
            this.navigation.stop();
            this.setTarget(null);
            this.setOrderedToSit(true);
            this.level().broadcastEntityEvent(this, (byte) 7);
        } else {
            this.level().broadcastEntityEvent(this, (byte) 6);
        }
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(ModTags.Items.ZIYING_FOX_FOOD);
    }

    public boolean isBeadFood(ItemStack stack) {
        return stack.is(ModTags.Items.ZIYING_FOX_APPEAL_TO);
    }

    public Ingredient getTemptItem() {
        return Ingredient.of(ModTags.Items.ZIYING_FOX_APPEAL_TO);
    }

    public boolean isHoldingItemAppealTo(LivingEntity entity) {
        if (entity instanceof Player player) {
            Ingredient ingredient = getTemptItem();
            return ingredient.test(player.getMainHandItem()) ||
                    ingredient.test(player.getOffhandItem());
        }
        return false;
    }

    @Override
    public void setTame(boolean tame) {
        super.setTame(tame);
        // 手动调用驯服效果
        if (tame) {
            this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(81.0);
            this.setHealth(81.0F);
        } else {
            this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(36.0);
        }
    }

    protected void reassessTameGoals() {
        if (this.landTargetGoal != null) {
            this.targetSelector.removeGoal(this.landTargetGoal);
        }
        if (this.turtleEggTargetGoal != null) {
            this.targetSelector.removeGoal(this.turtleEggTargetGoal);
        }
        if (!this.isTame()) {
            // 添加前再次确保不为 null
            if (this.landTargetGoal != null) {
                this.targetSelector.addGoal(4, this.landTargetGoal);
            }
            if (this.turtleEggTargetGoal != null) {
                this.targetSelector.addGoal(4, this.turtleEggTargetGoal);
            }
        }
    }

    @Override
    public @NotNull SoundEvent getEatingSound(@NotNull ItemStack itemStack) {
        return SoundEvents.FOX_EAT;
    }

    @Override
    public void aiStep() {
        if (!this.level().isClientSide && this.isAlive() && this.isEffectiveAi()) {
            this.ticksSinceEaten++;
            ItemStack itemstack = this.getItemBySlot(EquipmentSlot.MAINHAND);
            if (this.canEat(itemstack)) {
                if (this.ticksSinceEaten > 600) {
                    ItemStack itemstack1 = itemstack.finishUsingItem(this.level(), this);
                    if (!itemstack1.isEmpty()) {
                        this.setItemSlot(EquipmentSlot.MAINHAND, itemstack1);
                    }
                    this.ticksSinceEaten = 0;
                } else if (this.ticksSinceEaten > 560 && this.random.nextFloat() < 0.1F) {
                    this.playSound(this.getEatingSound(itemstack), 1.0F, 1.0F);
                    this.level().broadcastEntityEvent(this, (byte) 45);
                }
            }

            LivingEntity livingentity = this.getTarget();
            if (livingentity == null || !livingentity.isAlive()) {
                this.setIsCrouching(false);
                this.setIsInterested(false);
            }
        }

        if (this.isSleeping() || this.isImmobile()) {
            this.jumping = false;
            this.xxa = 0.0F;
            this.zza = 0.0F;
        }

        super.aiStep();
        if (this.isDefending() && this.random.nextFloat() < 0.05F) {
            this.playSound(SoundEvents.FOX_AGGRO, 1.0F, 1.0F);
        }

        if (this.level().isClientSide) {
            if (this.random.nextInt(10) == 0) {
                SimpleParticleType particle = this.getParticle();
                double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getBbWidth() * 0.8 + 0.2;
                double y = this.getY() + this.random.nextDouble() * this.getBbHeight() * 0.8 + 0.2;
                double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getBbWidth() * 0.8 + 0.2;
                this.level().addParticle(particle, x, y, z, 0.0, 0.05, 0.0);
            }
        }

        if (!this.level().isClientSide && this.isAlive() && this.isEffectiveAi()) {
            if (this.produceBeadTimer > 0) {
                this.produceBeadTimer--;
                if (this.produceBeadTimer == 0) {
                    this.spawnBead();
                }
            }
        }

        if (this.getHealth() < this.getMaxHealth()) {
            if (this.regenCooldown <= 0) {
                this.addEffect(this.getEffect());
                this.regenCooldown = 200;
            } else {
                this.regenCooldown--;
            }
        } else {
            this.regenCooldown = 0;
        }
    }

    protected SimpleParticleType getParticle() {
        return ModParticleTypes.ZIYING_FOX.get();
    }

    protected void spawnBead() {
        ItemStack bead = new ItemStack(this.getBeadItem());
        this.spawnAtLocation(bead);
        this.playSound(SoundEvents.FOX_SNIFF, 1.0F, 1.0F);
    }

    protected Item getBeadItem() {
        return ModItems.ZIYING_BEAD.get();
    }

    protected MobEffectInstance getEffect() {
        return new MobEffectInstance(MobEffects.REGENERATION, 100, 1);
    }

    private boolean canEat(ItemStack stack) {
        // 1.20.1 没有 DataComponents，使用 hasFood 判断
        return stack.getItem().isEdible() && this.getTarget() == null && this.onGround() && !this.isSleeping();
    }

    @Override
    protected void populateDefaultEquipmentSlots(RandomSource random, @NotNull DifficultyInstance difficulty) {
        if (random.nextFloat() < 0.2F) {
            float f = random.nextFloat();
            ItemStack itemstack;
            if (f < 0.05F) {
                itemstack = new ItemStack(Items.EMERALD);
            } else if (f < 0.2F) {
                itemstack = new ItemStack(Items.EGG);
            } else if (f < 0.4F) {
                itemstack = random.nextBoolean() ? new ItemStack(Items.RABBIT_FOOT) : new ItemStack(Items.RABBIT_HIDE);
            } else if (f < 0.6F) {
                itemstack = new ItemStack(Items.WHEAT);
            } else if (f < 0.8F) {
                itemstack = new ItemStack(Items.LEATHER);
            } else {
                itemstack = new ItemStack(Items.FEATHER);
            }
            this.setItemSlot(EquipmentSlot.MAINHAND, itemstack);
        }
    }

    @Override
    public void handleEntityEvent(byte id) {
        if (id == 45) {
            ItemStack itemstack = this.getItemBySlot(EquipmentSlot.MAINHAND);
            if (!itemstack.isEmpty()) {
                for (int i = 0; i < 8; i++) {
                    Vec3 vec3 = new Vec3(((double) this.random.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0)
                            .xRot(-this.getXRot() * (float) (Math.PI / 180.0))
                            .yRot(-this.getYRot() * (float) (Math.PI / 180.0));
                    this.level().addParticle(
                            new ItemParticleOption(ParticleTypes.ITEM, itemstack),
                            this.getX() + this.getLookAngle().x / 2.0,
                            this.getY(),
                            this.getZ() + this.getLookAngle().z / 2.0,
                            vec3.x,
                            vec3.y + 0.05,
                            vec3.z
                    );
                }
            }
        } else {
            super.handleEntityEvent(id);
        }
    }

    @Override
    public @NotNull SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor level, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType spawnType, @Nullable SpawnGroupData spawnGroupData, @Nullable CompoundTag tag) {
        this.populateDefaultEquipmentSlots(level.getRandom(), difficulty);
        return super.finalizeSpawn(level, difficulty, spawnType, spawnGroupData, tag);
    }

    @Override
    protected void usePlayerItem(@NotNull Player player, @NotNull InteractionHand hand, @NotNull ItemStack stack) {
        if (this.isFood(stack)) {
            this.playSound(this.getEatingSound(stack), 1.0F, 1.0F);
        }
        super.usePlayerItem(player, hand, stack);
    }

    @Override
    public @NotNull EntityDimensions getDimensions(@NotNull Pose pose) {
        return this.isBaby() ? BABY_DIMENSIONS : super.getDimensions(pose);
    }

    @Override
    public float getEyeHeight(@NotNull Pose pose) {
        return this.isBaby() ? 0.2975F : super.getEyeHeight(pose);
    }

    // ========== 状态标志位操作 ==========
    public boolean isSitting() {
        return this.isInSittingPose() || this.isOrderedToSit() || this.getFlag(1);
    }

    public void setSitting(boolean sitting) {
        this.setFlag(1, sitting);
    }

    @Override
    public void setOrderedToSit(boolean orderedToSit) {
        super.setOrderedToSit(orderedToSit);
        this.navigation.stop();
    }

    public boolean isWandering() {
        return this.getFlag(2);
    }

    public void setWandering(boolean wandering) {
        this.setFlag(2, wandering);
    }

    public boolean isFaceplanted() {
        return this.getFlag(64);
    }

    void setFaceplanted(boolean faceplanted) {
        this.setFlag(64, faceplanted);
    }

    boolean isDefending() {
        return this.getFlag(128);
    }

    void setDefending(boolean defending) {
        this.setFlag(128, defending);
    }

    @Override
    public boolean isSleeping() {
        return this.getFlag(32);
    }

    void setSleeping(boolean sleeping) {
        this.setFlag(32, sleeping);
    }

    private void setFlag(int flagId, boolean value) {
        if (value) {
            this.entityData.set(DATA_FLAGS_ID, (byte) (this.entityData.get(DATA_FLAGS_ID) | flagId));
        } else {
            this.entityData.set(DATA_FLAGS_ID, (byte) (this.entityData.get(DATA_FLAGS_ID) & ~flagId));
        }
    }

    private boolean getFlag(int flagId) {
        return (this.entityData.get(DATA_FLAGS_ID) & flagId) != 0;
    }

    @Override
    public boolean canTakeItem(@NotNull ItemStack itemstack) {
        EquipmentSlot equipmentslot = Mob.getEquipmentSlotForItem(itemstack);
        return this.getItemBySlot(equipmentslot).isEmpty() && equipmentslot == EquipmentSlot.MAINHAND && super.canTakeItem(itemstack);
    }

    @Override
    public boolean canHoldItem(@NotNull ItemStack stack) {
        ItemStack itemstack = this.getItemBySlot(EquipmentSlot.MAINHAND);
        return itemstack.isEmpty() || this.ticksSinceEaten > 0 && stack.getItem().isEdible() && !itemstack.getItem().isEdible();
    }

    private void spitOutItem(ItemStack stack) {
        if (!stack.isEmpty() && !this.level().isClientSide) {
            ItemEntity itementity = new ItemEntity(
                    this.level(), this.getX() + this.getLookAngle().x, this.getY() + 1.0, this.getZ() + this.getLookAngle().z, stack
            );
            itementity.setPickUpDelay(40);
            itementity.setThrower(this.getUUID());
            this.playSound(SoundEvents.FOX_SPIT, 1.0F, 1.0F);
            this.level().addFreshEntity(itementity);
        }
    }

    private void dropItemStack(ItemStack stack) {
        ItemEntity itementity = new ItemEntity(this.level(), this.getX(), this.getY(), this.getZ(), stack);
        this.level().addFreshEntity(itementity);
    }

    @Override
    protected void pickUpItem(ItemEntity itemEntity) {
        ItemStack itemstack = itemEntity.getItem();
        if (this.canHoldItem(itemstack)) {
            int i = itemstack.getCount();
            if (i > 1) {
                this.dropItemStack(itemstack.split(i - 1));
            }
            this.spitOutItem(this.getItemBySlot(EquipmentSlot.MAINHAND));
            this.onItemPickup(itemEntity);
            this.setItemSlot(EquipmentSlot.MAINHAND, itemstack.split(1));
            this.setGuaranteedDrop(EquipmentSlot.MAINHAND);
            this.take(itemEntity, itemstack.getCount());
            itemEntity.discard();
            this.ticksSinceEaten = 0;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.isEffectiveAi()) {
            boolean flag = this.isInWater();
            if (flag || this.getTarget() != null || this.level().isThundering()) {
                this.wakeUp();
            }
            if (flag || this.isSleeping()) {
                this.setSitting(false);
            }
            if (this.isFaceplanted() && this.level().random.nextFloat() < 0.2F) {
                BlockPos blockpos = this.blockPosition();
                BlockState blockstate = this.level().getBlockState(blockpos);
                this.level().levelEvent(2001, blockpos, Block.getId(blockstate));
            }
        }

        this.interestedAngleO = this.interestedAngle;
        if (this.isInterested()) {
            this.interestedAngle = this.interestedAngle + (1.0F - this.interestedAngle) * 0.4F;
        } else {
            this.interestedAngle = this.interestedAngle + (0.0F - this.interestedAngle) * 0.4F;
        }

        this.crouchAmountO = this.crouchAmount;
        if (this.isCrouching()) {
            this.crouchAmount += 0.2F;
            if (this.crouchAmount > 3.0F) {
                this.crouchAmount = 3.0F;
            }
        } else {
            this.crouchAmount = 0.0F;
        }
    }

    public boolean isPouncing() {
        return this.getFlag(16);
    }

    public void setIsPouncing(boolean isPouncing) {
        this.setFlag(16, isPouncing);
    }

    public boolean isJumping() {
        return this.jumping;
    }

    public boolean isFullyCrouched() {
        return this.crouchAmount == 3.0F;
    }

    public void setIsCrouching(boolean isCrouching) {
        this.setFlag(4, isCrouching);
    }

    @Override
    public boolean isCrouching() {
        return this.getFlag(4);
    }

    public void setIsInterested(boolean isInterested) {
        this.setFlag(8, isInterested);
    }

    public boolean isInterested() {
        return this.getFlag(8);
    }

    public float getHeadRollAngle(float partialTick) {
        return Mth.lerp(partialTick, this.interestedAngleO, this.interestedAngle) * 0.11F * (float) Math.PI;
    }

    public float getCrouchAmount(float partialTick) {
        return Mth.lerp(partialTick, this.crouchAmountO, this.crouchAmount);
    }

    @Override
    public void setTarget(@Nullable LivingEntity livingEntity) {
        if (this.isDefending() && livingEntity == null) {
            this.setDefending(false);
        }
        super.setTarget(livingEntity);
    }

    @Override
    public boolean wantsToAttack(@NotNull LivingEntity target, @NotNull LivingEntity owner) {
        if (target instanceof Creeper || target instanceof Ghast || target instanceof ArmorStand) {
            return false;
        } else if (target instanceof ZiyingFox || target instanceof Fox) {
            return false;
        } else {
            if (target instanceof Player) {
                return false;
            }
            if (target instanceof AbstractHorse abstracthorse && abstracthorse.isTamed()) {
                return false;
            }
            return !(target instanceof TamableAnimal tamable) || !tamable.isTame();
        }
    }

    @Override
    public boolean doHurtTarget(@NotNull Entity target) {
        float damage = (float) this.getAttributeValue(Attributes.ATTACK_DAMAGE);
        if (target instanceof Enemy || target instanceof NeutralMob) {
            damage *= 5.0F;
        }
        // 造成伤害
        boolean hurt = target.hurt(this.damageSources().mobAttack(this), damage);
        if (hurt) {
            this.playSound(SoundEvents.FOX_BITE, 1.0F, 1.0F);
            // 处理附魔效果（如火焰附加等）
            this.doEnchantDamageEffects(this, target);
        }
        return hurt;
    }

    @Override
    public boolean hurt(@NotNull DamageSource source, float amount) {
        if (source == this.level().damageSources().sweetBerryBush()) {
            return false;
        }
        boolean hurt = super.hurt(source, amount);
        if (hurt && this.isAlive()) {
            this.onHurt();
        }
        return hurt;
    }

    protected void onHurt() {
        this.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 1));
        this.playSound(SoundEvents.FOX_SCREECH, 1.0F, 1.0F);
    }

    void wakeUp() {
        this.setSleeping(false);
    }

    void clearStates() {
        this.setIsInterested(false);
        this.setIsCrouching(false);
        this.setSitting(false);
        this.setSleeping(false);
        this.setDefending(false);
        this.setFaceplanted(false);
    }

    boolean canMove() {
        return !this.isSleeping() && !this.isSitting() && !this.isFaceplanted();
    }

    @Override
    public void playAmbientSound() {
        SoundEvent soundevent = this.getAmbientSound();
        if (soundevent == SoundEvents.FOX_SCREECH) {
            this.playSound(soundevent, 2.0F, this.getVoicePitch());
        } else {
            super.playAmbientSound();
        }
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        if (this.isSleeping()) {
            return SoundEvents.FOX_SLEEP;
        } else {
            if (!this.level().isDay() && this.random.nextFloat() < 0.1F) {
                List<Player> list = this.level().getEntitiesOfClass(Player.class, this.getBoundingBox().inflate(16.0, 16.0, 16.0), EntitySelector.NO_SPECTATORS);
                if (list.isEmpty()) {
                    return SoundEvents.FOX_SCREECH;
                }
            }
            return SoundEvents.FOX_AMBIENT;
        }
    }

    @Override
    protected SoundEvent getHurtSound(@NotNull DamageSource damageSource) {
        return SoundEvents.FOX_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.FOX_DEATH;
    }

    @Override
    protected void dropAllDeathLoot(@NotNull DamageSource damageSource) {
        super.dropAllDeathLoot(damageSource);
    }

    @Override
    protected void dropEquipment() {
        super.dropEquipment();
        ItemStack itemstack = this.getItemBySlot(EquipmentSlot.MAINHAND);
        if (!itemstack.isEmpty()) {
            this.spawnAtLocation(itemstack);
            this.setItemSlot(EquipmentSlot.MAINHAND, ItemStack.EMPTY);
        }
    }

    public static boolean isPathClear(ZiyingFox fox, LivingEntity livingEntity) {
        double d0 = livingEntity.getZ() - fox.getZ();
        double d1 = livingEntity.getX() - fox.getX();
        double d2 = d0 / d1;
        int i = 6;
        for (int j = 0; j < 6; j++) {
            double d3 = d2 == 0.0 ? 0.0 : d0 * (double) ((float) j / 6.0F);
            double d4 = d2 == 0.0 ? d1 * (double) ((float) j / 6.0F) : d3 / d2;
            for (int k = 1; k < 4; k++) {
                if (!fox.level().getBlockState(BlockPos.containing(fox.getX() + d4, fox.getY() + (double) k, fox.getZ() + d3)).canBeReplaced()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public @NotNull Vec3 getLeashOffset() {
        return new Vec3(0.0, (double) (0.55F * this.getEyeHeight()), (double) (this.getBbWidth() * 0.4F));
    }

    // ========== 内部类（全部复制自狐狸，将 Fox 改为 ZiyingFox，并移除变种相关逻辑）==========
    class ZiyingFoxFaceplantGoal extends Goal {
        int countdown;

        public ZiyingFoxFaceplantGoal() {
            this.setFlags(EnumSet.of(Flag.LOOK, Flag.JUMP, Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            return ZiyingFox.this.isFaceplanted();
        }

        @Override
        public boolean canContinueToUse() {
            return this.canUse() && this.countdown > 0;
        }

        @Override
        public void start() {
            this.countdown = this.adjustedTickDelay(40);
        }

        @Override
        public void stop() {
            ZiyingFox.this.setFaceplanted(false);
        }

        @Override
        public void tick() {
            this.countdown--;
        }
    }

    public static class ZiyingFoxAlertableEntitiesSelector implements Predicate<LivingEntity> {
        public boolean test(LivingEntity entity) {
            if (entity instanceof ZiyingFox) {
                return false;
            } else if (entity instanceof Chicken || entity instanceof Rabbit || entity instanceof Monster) {
                return true;
            } else if (entity instanceof TamableAnimal) {
                return !((TamableAnimal) entity).isTame();
            } else if (!(entity instanceof Player) || !entity.isSpectator() && !((Player) entity).isCreative()) {
                return !entity.isSleeping() && !entity.isDiscrete();
            } else {
                return false;
            }
        }
    }

    abstract class ZiyingFoxBehaviorGoal extends Goal {
        private final TargetingConditions alertableTargeting = TargetingConditions.forCombat()
                .range(12.0)
                .ignoreLineOfSight()
                .selector(new ZiyingFoxAlertableEntitiesSelector());

        protected boolean hasShelter() {
            BlockPos blockpos = BlockPos.containing(ZiyingFox.this.getX(), ZiyingFox.this.getBoundingBox().maxY, ZiyingFox.this.getZ());
            return !ZiyingFox.this.level().canSeeSky(blockpos) && ZiyingFox.this.getWalkTargetValue(blockpos) >= 0.0F;
        }

        protected boolean alertable() {
            return ZiyingFox.this.level()
                    .getNearbyEntities(LivingEntity.class, this.alertableTargeting, ZiyingFox.this, ZiyingFox.this.getBoundingBox().inflate(12.0, 6.0, 12.0))
                    .isEmpty();
        }
    }

    class ZiyingFoxBreedGoal extends BreedGoal {
        public ZiyingFoxBreedGoal(double speedModifier) {
            super(ZiyingFox.this, speedModifier);
        }

        @Override
        public void start() {
            ((ZiyingFox) this.animal).clearStates();
            if (this.partner != null) {
                ((ZiyingFox) this.partner).clearStates();
            }
            super.start();
        }

        @Override
        protected void breed() {
            ServerLevel serverlevel = (ServerLevel) this.level;
            ZiyingFox ziyingFox = null;
            if (this.partner != null) {
                ziyingFox = (ZiyingFox) this.animal.getBreedOffspring(serverlevel, this.partner);
            }
            BabyEntitySpawnEvent event = null;
            if (partner != null) {
                event = new BabyEntitySpawnEvent(animal, partner, ziyingFox);
            }
            final boolean cancelled = MinecraftForge.EVENT_BUS.post(event);
            if (event != null) {
                ziyingFox = (ZiyingFox) event.getChild();
            }
            if (cancelled) {
                this.animal.setAge(6000);
                this.partner.setAge(6000);
                this.animal.resetLove();
                this.partner.resetLove();
                return;
            }
            if (ziyingFox != null) {
                this.animal.setAge(6000);
                this.partner.setAge(6000);
                this.animal.resetLove();
                this.partner.resetLove();
                ziyingFox.setAge(-24000);
                ziyingFox.moveTo(this.animal.getX(), this.animal.getY(), this.animal.getZ(), 0.0F, 0.0F);
                serverlevel.addFreshEntityWithPassengers(ziyingFox);
                this.level.broadcastEntityEvent(this.animal, (byte) 18);
                if (this.level.getGameRules().getBoolean(GameRules.RULE_DOMOBLOOT)) {
                    this.level.addFreshEntity(new ExperienceOrb(this.level, this.animal.getX(), this.animal.getY(), this.animal.getZ(), this.animal.getRandom().nextInt(7) + 1));
                }
            }
        }
    }

    public class ZiyingFoxEatBerriesGoal extends MoveToBlockGoal {
        private static final int WAIT_TICKS = 40;
        protected int ticksWaited;

        public ZiyingFoxEatBerriesGoal(double speedModifier, int searchRange, int verticalSearchRange) {
            super(ZiyingFox.this, speedModifier, searchRange, verticalSearchRange);
        }

        @Override
        public double acceptedDistance() {
            return 2.0;
        }

        @Override
        public boolean shouldRecalculatePath() {
            return this.tryTicks % 100 == 0;
        }

        @Override
        protected boolean isValidTarget(LevelReader level, @NotNull BlockPos pos) {
            BlockState blockstate = level.getBlockState(pos);
            return blockstate.is(Blocks.SWEET_BERRY_BUSH) && blockstate.getValue(SweetBerryBushBlock.AGE) >= 2 || CaveVines.hasGlowBerries(blockstate);
        }

        @Override
        public void tick() {
            if (this.isReachedTarget()) {
                if (this.ticksWaited >= 40) {
                    this.onReachedTarget();
                } else {
                    this.ticksWaited++;
                }
            } else if (!this.isReachedTarget() && ZiyingFox.this.random.nextFloat() < 0.05F) {
                ZiyingFox.this.playSound(SoundEvents.FOX_SNIFF, 1.0F, 1.0F);
            }
            super.tick();
        }

        protected void onReachedTarget() {
            if (ForgeEventFactory.getMobGriefingEvent(ZiyingFox.this.level(), ZiyingFox.this)) {
                BlockState blockstate = ZiyingFox.this.level().getBlockState(this.blockPos);
                if (blockstate.is(Blocks.SWEET_BERRY_BUSH)) {
                    this.pickSweetBerries(blockstate);
                } else if (CaveVines.hasGlowBerries(blockstate)) {
                    this.pickGlowBerry(blockstate);
                }
            }
        }

        private void pickGlowBerry(BlockState state) {
            CaveVines.use(ZiyingFox.this, state, ZiyingFox.this.level(), this.blockPos);
        }

        private void pickSweetBerries(BlockState state) {
            int i = state.getValue(SweetBerryBushBlock.AGE);
            state.setValue(SweetBerryBushBlock.AGE, 1);
            int j = 1 + ZiyingFox.this.level().random.nextInt(2) + (i == 3 ? 1 : 0);
            ItemStack itemstack = ZiyingFox.this.getItemBySlot(EquipmentSlot.MAINHAND);
            if (itemstack.isEmpty()) {
                ZiyingFox.this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.SWEET_BERRIES));
                j--;
            }
            if (j > 0) {
                Block.popResource(ZiyingFox.this.level(), this.blockPos, new ItemStack(Items.SWEET_BERRIES, j));
            }
            ZiyingFox.this.playSound(SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES, 1.0F, 1.0F);
            ZiyingFox.this.level().setBlock(this.blockPos, state.setValue(SweetBerryBushBlock.AGE, 1), 2);
            ZiyingFox.this.level().gameEvent(GameEvent.BLOCK_CHANGE, this.blockPos, GameEvent.Context.of(ZiyingFox.this));
        }

        @Override
        public boolean canUse() {
            return !ZiyingFox.this.isSleeping() && super.canUse();
        }

        @Override
        public void start() {
            this.ticksWaited = 0;
            ZiyingFox.this.setSitting(false);
            super.start();
        }
    }

    class ZiyingFoxFloatGoal extends FloatGoal {
        public ZiyingFoxFloatGoal() {
            super(ZiyingFox.this);
        }

        @Override
        public void start() {
            super.start();
            ZiyingFox.this.clearStates();
        }

        @Override
        public boolean canUse() {
            return ZiyingFox.this.isInWater() && ZiyingFox.this.getFluidHeight(FluidTags.WATER) > 0.25D || ZiyingFox.this.isInLava() || ZiyingFox.this.isInFluidType((fluidType, height) -> ZiyingFox.this.canSwimInFluidType(fluidType) && height > 0.25D);
        }
    }

    static class ZiyingFoxFollowParentGoal extends FollowParentGoal {
        private final ZiyingFox ziyingFox;

        public ZiyingFoxFollowParentGoal(ZiyingFox ziyingFox, double speedModifier) {
            super(ziyingFox, speedModifier);
            this.ziyingFox = ziyingFox;
        }

        @Override
        public boolean canUse() {
            return !this.ziyingFox.isDefending() && super.canUse();
        }

        @Override
        public boolean canContinueToUse() {
            return !this.ziyingFox.isDefending() && super.canContinueToUse();
        }

        @Override
        public void start() {
            this.ziyingFox.clearStates();
            super.start();
        }
    }

    class ZiyingFoxLookAtPlayerGoal extends LookAtPlayerGoal {
        public ZiyingFoxLookAtPlayerGoal(Mob mob, Class<? extends LivingEntity> lookAtType, float lookDistance) {
            super(mob, lookAtType, lookDistance);
        }

        @Override
        public boolean canUse() {
            return super.canUse() && !ZiyingFox.this.isFaceplanted() && !ZiyingFox.this.isInterested();
        }

        @Override
        public boolean canContinueToUse() {
            return super.canContinueToUse() && !ZiyingFox.this.isFaceplanted() && !ZiyingFox.this.isInterested();
        }
    }

    public class ZiyingFoxLookControl extends LookControl {
        public ZiyingFoxLookControl() {
            super(ZiyingFox.this);
        }

        @Override
        public void tick() {
            if (!ZiyingFox.this.isSleeping()) {
                super.tick();
            }
        }

        @Override
        protected boolean resetXRotOnTick() {
            return !ZiyingFox.this.isPouncing() && !ZiyingFox.this.isCrouching() && !ZiyingFox.this.isInterested() && !ZiyingFox.this.isFaceplanted();
        }
    }

    class ZiyingFoxMeleeAttackGoal extends MeleeAttackGoal {
        public ZiyingFoxMeleeAttackGoal(double speedModifier, boolean followingTargetEvenIfNotSeen) {
            super(ZiyingFox.this, speedModifier, followingTargetEvenIfNotSeen);
        }

        @Override
        protected void checkAndPerformAttack(@NotNull LivingEntity target, double distanceToTargetSqr) {
            double attackReachSqr = this.getAttackReachSqr(target);
            if (distanceToTargetSqr <= attackReachSqr && this.isTimeToAttack()) {
                this.resetAttackCooldown();
                this.mob.doHurtTarget(target);
                ZiyingFox.this.playSound(SoundEvents.FOX_BITE, 1.0F, 1.0F);
            }
        }

        @Override
        public void start() {
            ZiyingFox.this.setIsInterested(false);
            super.start();
        }

        @Override
        public boolean canUse() {
            return !ZiyingFox.this.isSitting() && !ZiyingFox.this.isSleeping() && !ZiyingFox.this.isCrouching() && !ZiyingFox.this.isFaceplanted() && super.canUse();
        }
    }

    class ZiyingFoxMoveControl extends MoveControl {
        public ZiyingFoxMoveControl() {
            super(ZiyingFox.this);
        }

        @Override
        public void tick() {
            if (ZiyingFox.this.canMove()) {
                super.tick();
            }
        }
    }

    public class ZiyingFoxPounceGoal extends JumpGoal {
        @Override
        public boolean canUse() {
            if (!ZiyingFox.this.isFullyCrouched()) {
                return false;
            } else {
                LivingEntity livingentity = ZiyingFox.this.getTarget();
                if (livingentity != null && livingentity.isAlive()) {
                    if (livingentity.getMotionDirection() != livingentity.getDirection()) {
                        return false;
                    } else {
                        boolean flag = ZiyingFox.isPathClear(ZiyingFox.this, livingentity);
                        if (!flag) {
                            ZiyingFox.this.getNavigation().createPath(livingentity, 0);
                            ZiyingFox.this.setIsCrouching(false);
                            ZiyingFox.this.setIsInterested(false);
                        }
                        return flag;
                    }
                } else {
                    return false;
                }
            }
        }

        @Override
        public boolean canContinueToUse() {
            LivingEntity livingentity = ZiyingFox.this.getTarget();
            if (livingentity != null && livingentity.isAlive()) {
                double d0 = ZiyingFox.this.getDeltaMovement().y;
                return (!(d0 * d0 < 0.05F) || !(Math.abs(ZiyingFox.this.getXRot()) < 15.0F) || !ZiyingFox.this.onGround()) && !ZiyingFox.this.isFaceplanted();
            } else {
                return false;
            }
        }

        @Override
        public boolean isInterruptable() {
            return false;
        }

        @Override
        public void start() {
            ZiyingFox.this.setJumping(true);
            ZiyingFox.this.setIsPouncing(true);
            ZiyingFox.this.setIsInterested(false);
            LivingEntity livingentity = ZiyingFox.this.getTarget();
            if (livingentity != null) {
                ZiyingFox.this.getLookControl().setLookAt(livingentity, 60.0F, 30.0F);
                Vec3 vec3 = new Vec3(livingentity.getX() - ZiyingFox.this.getX(), livingentity.getY() - ZiyingFox.this.getY(), livingentity.getZ() - ZiyingFox.this.getZ()).normalize();
                ZiyingFox.this.setDeltaMovement(ZiyingFox.this.getDeltaMovement().add(vec3.x * 0.8, 0.9, vec3.z * 0.8));
            }
            ZiyingFox.this.getNavigation().stop();
        }

        @Override
        public void stop() {
            ZiyingFox.this.setIsCrouching(false);
            ZiyingFox.this.crouchAmount = 0.0F;
            ZiyingFox.this.crouchAmountO = 0.0F;
            ZiyingFox.this.setIsInterested(false);
            ZiyingFox.this.setIsPouncing(false);
        }

        @Override
        public void tick() {
            LivingEntity livingentity = ZiyingFox.this.getTarget();
            if (livingentity != null) {
                ZiyingFox.this.getLookControl().setLookAt(livingentity, 60.0F, 30.0F);
            }
            if (!ZiyingFox.this.isFaceplanted()) {
                Vec3 vec3 = ZiyingFox.this.getDeltaMovement();
                if (vec3.y * vec3.y < 0.03F && ZiyingFox.this.getXRot() != 0.0F) {
                    ZiyingFox.this.setXRot(Mth.rotLerp(0.2F, ZiyingFox.this.getXRot(), 0.0F));
                } else {
                    double d0 = vec3.horizontalDistance();
                    double d1 = Math.signum(-vec3.y) * Math.acos(d0 / vec3.length()) * 180.0F / (float) Math.PI;
                    ZiyingFox.this.setXRot((float) d1);
                }
            }
            if (livingentity != null && ZiyingFox.this.distanceTo(livingentity) <= 2.0F) {
                ZiyingFox.this.doHurtTarget(livingentity);
            } else if (ZiyingFox.this.getXRot() > 0.0F
                    && ZiyingFox.this.onGround()
                    && (float) ZiyingFox.this.getDeltaMovement().y != 0.0F
                    && ZiyingFox.this.level().getBlockState(ZiyingFox.this.blockPosition()).is(Blocks.SNOW)) {
                ZiyingFox.this.setXRot(60.0F);
                ZiyingFox.this.setTarget(null);
                ZiyingFox.this.setFaceplanted(true);
            }
        }
    }

    class ZiyingFoxSearchForItemsGoal extends Goal {
        public ZiyingFoxSearchForItemsGoal() {
            this.setFlags(EnumSet.of(Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            if (!ZiyingFox.this.getItemBySlot(EquipmentSlot.MAINHAND).isEmpty()) {
                return false;
            } else if (ZiyingFox.this.getTarget() != null || ZiyingFox.this.getLastHurtByMob() != null) {
                return false;
            } else if (!ZiyingFox.this.canMove()) {
                return false;
            } else if (ZiyingFox.this.getRandom().nextInt(reducedTickDelay(10)) != 0) {
                return false;
            } else {
                List<ItemEntity> list = ZiyingFox.this.level().getEntitiesOfClass(ItemEntity.class, ZiyingFox.this.getBoundingBox().inflate(8.0, 8.0, 8.0), ZiyingFox.ALLOWED_ITEMS);
                return !list.isEmpty() && ZiyingFox.this.getItemBySlot(EquipmentSlot.MAINHAND).isEmpty();
            }
        }

        @Override
        public void tick() {
            List<ItemEntity> list = ZiyingFox.this.level().getEntitiesOfClass(ItemEntity.class, ZiyingFox.this.getBoundingBox().inflate(8.0, 8.0, 8.0), ZiyingFox.ALLOWED_ITEMS);
            ItemStack itemstack = ZiyingFox.this.getItemBySlot(EquipmentSlot.MAINHAND);
            if (itemstack.isEmpty() && !list.isEmpty()) {
                ZiyingFox.this.getNavigation().moveTo(list.get(0), 1.2F);
            }
        }

        @Override
        public void start() {
            List<ItemEntity> list = ZiyingFox.this.level().getEntitiesOfClass(ItemEntity.class, ZiyingFox.this.getBoundingBox().inflate(8.0, 8.0, 8.0), ZiyingFox.ALLOWED_ITEMS);
            if (!list.isEmpty()) {
                ZiyingFox.this.getNavigation().moveTo(list.get(0), 1.2F);
            }
        }
    }

    class ZiyingFoxPerchAndSearchGoal extends ZiyingFoxBehaviorGoal {
        private double relX;
        private double relZ;
        private int lookTime;
        private int looksRemaining;

        public ZiyingFoxPerchAndSearchGoal() {
            this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
        }

        @Override
        public boolean canUse() {
            return ZiyingFox.this.getLastHurtByMob() == null
                    && ZiyingFox.this.getRandom().nextFloat() < 0.02F
                    && !ZiyingFox.this.isSleeping()
                    && ZiyingFox.this.getTarget() == null
                    && ZiyingFox.this.getNavigation().isDone()
                    && !this.alertable()
                    && !ZiyingFox.this.isPouncing()
                    && !ZiyingFox.this.isCrouching();
        }

        @Override
        public boolean canContinueToUse() {
            return this.looksRemaining > 0;
        }

        @Override
        public void start() {
            this.resetLook();
            this.looksRemaining = 2 + ZiyingFox.this.getRandom().nextInt(3);
            ZiyingFox.this.setSitting(true);
            ZiyingFox.this.getNavigation().stop();
        }

        @Override
        public void stop() {
            ZiyingFox.this.setSitting(false);
        }

        @Override
        public void tick() {
            this.lookTime--;
            if (this.lookTime <= 0) {
                this.looksRemaining--;
                this.resetLook();
            }
            ZiyingFox.this.getLookControl().setLookAt(
                    ZiyingFox.this.getX() + this.relX,
                    ZiyingFox.this.getEyeY(),
                    ZiyingFox.this.getZ() + this.relZ,
                    (float) ZiyingFox.this.getMaxHeadYRot(),
                    (float) ZiyingFox.this.getMaxHeadXRot()
            );
        }

        private void resetLook() {
            double d0 = (Math.PI * 2) * ZiyingFox.this.getRandom().nextDouble();
            this.relX = Math.cos(d0);
            this.relZ = Math.sin(d0);
            this.lookTime = this.adjustedTickDelay(80 + ZiyingFox.this.getRandom().nextInt(20));
        }
    }

    class ZiyingFoxSeekShelterGoal extends FleeSunGoal {
        private int interval = reducedTickDelay(100);

        public ZiyingFoxSeekShelterGoal(double speedModifier) {
            super(ZiyingFox.this, speedModifier);
        }

        @Override
        public boolean canUse() {
            if (!ZiyingFox.this.isSleeping() && this.mob.getTarget() == null) {
                if (ZiyingFox.this.level().isThundering() && ZiyingFox.this.level().canSeeSky(this.mob.blockPosition())) {
                    return this.setWantedPos();
                } else if (this.interval > 0) {
                    this.interval--;
                    return false;
                } else {
                    this.interval = 100;
                    BlockPos blockpos = this.mob.blockPosition();
                    return ZiyingFox.this.level().isDay()
                            && ZiyingFox.this.level().canSeeSky(blockpos)
                            && !((ServerLevel) ZiyingFox.this.level()).isVillage(blockpos)
                            && this.setWantedPos();
                }
            } else {
                return false;
            }
        }

        @Override
        public void start() {
            ZiyingFox.this.clearStates();
            super.start();
        }
    }

    class ZiyingFoxSleepGoal extends ZiyingFoxBehaviorGoal {
        private static final int WAIT_TIME_BEFORE_SLEEP = reducedTickDelay(140);
        private int countdown = ZiyingFox.this.random.nextInt(WAIT_TIME_BEFORE_SLEEP);

        public ZiyingFoxSleepGoal() {
            this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.JUMP));
        }

        @Override
        public boolean canUse() {
            return ZiyingFox.this.xxa == 0.0F && ZiyingFox.this.yya == 0.0F && ZiyingFox.this.zza == 0.0F && (this.canSleep() || ZiyingFox.this.isSleeping());
        }

        @Override
        public boolean canContinueToUse() {
            return this.canSleep();
        }

        private boolean canSleep() {
            if (this.countdown > 0) {
                this.countdown--;
                return false;
            } else {
                return ZiyingFox.this.level().isDay() && this.hasShelter() && !this.alertable() && !ZiyingFox.this.isInPowderSnow;
            }
        }

        @Override
        public void stop() {
            this.countdown = ZiyingFox.this.random.nextInt(WAIT_TIME_BEFORE_SLEEP);
            ZiyingFox.this.clearStates();
        }

        @Override
        public void start() {
            ZiyingFox.this.setSitting(false);
            ZiyingFox.this.setIsCrouching(false);
            ZiyingFox.this.setIsInterested(false);
            ZiyingFox.this.setJumping(false);
            ZiyingFox.this.setSleeping(true);
            ZiyingFox.this.getNavigation().stop();
            ZiyingFox.this.getMoveControl().setWantedPosition(ZiyingFox.this.getX(), ZiyingFox.this.getY(), ZiyingFox.this.getZ(), 0.0);
        }
    }

    class ZiyingFoxStalkPreyGoal extends Goal {
        public ZiyingFoxStalkPreyGoal() {
            this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
        }

        @Override
        public boolean canUse() {
            if (ZiyingFox.this.isSleeping()) {
                return false;
            } else {
                LivingEntity livingentity = ZiyingFox.this.getTarget();
                return livingentity != null
                        && livingentity.isAlive()
                        && ZiyingFox.STALKABLE_PREY.test(livingentity)
                        && ZiyingFox.this.distanceToSqr(livingentity) > 36.0
                        && !ZiyingFox.this.isCrouching()
                        && !ZiyingFox.this.isInterested()
                        && !ZiyingFox.this.jumping;
            }
        }

        @Override
        public void start() {
            ZiyingFox.this.setSitting(false);
            ZiyingFox.this.setFaceplanted(false);
        }

        @Override
        public void stop() {
            LivingEntity livingentity = ZiyingFox.this.getTarget();
            if (livingentity != null && ZiyingFox.isPathClear(ZiyingFox.this, livingentity)) {
                ZiyingFox.this.setIsInterested(true);
                ZiyingFox.this.setIsCrouching(true);
                ZiyingFox.this.getNavigation().stop();
                ZiyingFox.this.getLookControl().setLookAt(livingentity, (float) ZiyingFox.this.getMaxHeadYRot(), (float) ZiyingFox.this.getMaxHeadXRot());
            } else {
                ZiyingFox.this.setIsInterested(false);
                ZiyingFox.this.setIsCrouching(false);
            }
        }

        @Override
        public void tick() {
            LivingEntity livingentity = ZiyingFox.this.getTarget();
            if (livingentity != null) {
                ZiyingFox.this.getLookControl().setLookAt(livingentity, (float) ZiyingFox.this.getMaxHeadYRot(), (float) ZiyingFox.this.getMaxHeadXRot());
                if (ZiyingFox.this.distanceToSqr(livingentity) <= 36.0) {
                    ZiyingFox.this.setIsInterested(true);
                    ZiyingFox.this.setIsCrouching(true);
                    ZiyingFox.this.getNavigation().stop();
                } else {
                    ZiyingFox.this.getNavigation().moveTo(livingentity, 1.5);
                }
            }
        }
    }
}