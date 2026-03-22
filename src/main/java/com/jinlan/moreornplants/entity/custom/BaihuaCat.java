package com.jinlan.moreornplants.entity.custom;

import com.jinlan.moreornplants.block.FlowerBlocks.CutFlowerBlock;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusBlock;
import com.jinlan.moreornplants.block.ModBlocks;
import com.jinlan.moreornplants.block.WeepingBlocks.PeachBlock;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.*;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BaihuaCat extends Cat {
    private TemptGoal baihuaTemptGoal;
    private boolean isWandering;
    private FollowOwnerGoal followOwnerGoal;
    private int producePeachTimer = 0;
    private int produceApricotTimer = 0;
    private int regenCooldown = 0;

    public BaihuaCat(EntityType<? extends Cat> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.getAvailableGoals().stream()
                .filter(goal -> goal.getGoal() instanceof FollowOwnerGoal)
                .forEach(goal -> this.goalSelector.removeGoal(goal.getGoal()));
        this.goalSelector.getAvailableGoals().stream()
                .filter(g -> g.getGoal() instanceof TemptGoal)
                .forEach(g -> this.goalSelector.removeGoal(g.getGoal()));
        // 移除原版猫对兔子、海龟的攻击目标
        this.targetSelector.getAvailableGoals().stream()
                .filter(g -> g.getGoal() instanceof NonTameRandomTargetGoal)
                .forEach(g -> this.targetSelector.removeGoal(g.getGoal()));

        this.baihuaTemptGoal = new TemptGoal(this, 1.0, stack -> stack.is(ModTags.Items.BAIHUA_CAT_FOOD), true);
        this.goalSelector.addGoal(4, this.baihuaTemptGoal);
        // 添加驯服后的跟随目标（自定义，支持游荡）
        this.followOwnerGoal = new FollowOwnerGoal(this, 1.0, 10.0F, 2.0F) {
            @Override
            public boolean canUse() {
                if (BaihuaCat.this.isWandering() || BaihuaCat.this.isOrderedToSit()) {
                    return false;
                }
                return super.canUse();
            }
        };
        this.goalSelector.addGoal(6, this.followOwnerGoal);

        // 添加主人攻击目标（类似狼）
        this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        // HurtByTargetGoal（狼有此目标，猫没有，但我们可以添加反击目标）
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
    }

    public static AttributeSupplier.@NotNull Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.MOVEMENT_SPEED, 0.3)
                .add(Attributes.ATTACK_DAMAGE, 5.0);
    }


    @Override
    public void addAdditionalSaveData(@NotNull net.minecraft.nbt.CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("Wandering", this.isWandering);
        compound.putInt("ProducePeachTimer", this.producePeachTimer);
        compound.putInt("ProduceApricotTimer", this.produceApricotTimer);
        compound.putInt("RegenCooldown", this.regenCooldown);
    }

    @Override
    public void readAdditionalSaveData(@NotNull net.minecraft.nbt.CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setWandering(compound.getBoolean("Wandering"));
        this.producePeachTimer = compound.getInt("ProducePeachTimer");
        this.produceApricotTimer = compound.getInt("ProduceApricotTimer");
        this.regenCooldown = compound.getInt("RegenCooldown");
    }

    @Override
    public void tick() {
        super.tick();
        if (this.baihuaTemptGoal != null && this.baihuaTemptGoal.isRunning() && !this.isTame() && this.tickCount % 100 == 0) {
            this.playSound(SoundEvents.CAT_BEG_FOR_FOOD, 1.0F, 1.0F);
        }
    }

    @Override
    public @NotNull InteractionResult mobInteract(Player player, @NotNull InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (this.level().isClientSide) {
            boolean flag = this.isOwnedBy(player) || this.isTame() || itemstack.is(ModTags.Items.BAIHUA_CAT_FOOD) && !this.isTame();
            return flag ? InteractionResult.CONSUME : InteractionResult.PASS;
        } else {
            if (this.isTame()) {
                if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    this.heal(2.0F);
                    itemstack.consume(1, player);
                    return InteractionResult.SUCCESS;
                } if (this.isPeachSapling(itemstack) && this.producePeachTimer == 0) {
                    this.producePeachTimer = 200;
                    itemstack.consume(1, player);
                    this.playSound(SoundEvents.CAT_EAT, 0.5F, 1.0F);
                    return InteractionResult.SUCCESS;
                } if (this.isApricotSapling(itemstack) && this.produceApricotTimer == 0) {
                    this.produceApricotTimer = 100;
                    itemstack.consume(1, player);
                    this.playSound(SoundEvents.CAT_EAT, 0.5F, 1.0F);
                    return InteractionResult.SUCCESS;
                } else {
                    InteractionResult interactionresult = super.mobInteract(player, hand);
                    if (!interactionresult.consumesAction() && this.isOwnedBy(player)) {
                        if (this.isOrderedToSit()) {
                            this.setOrderedToSit(false);
                            this.setWandering(true);
                        } else if (this.isWandering()) {
                            this.setWandering(false);
                            this.setOrderedToSit(false);
                        } else {
                            this.setOrderedToSit(true);
                            this.setWandering(false);
                        }
                        this.jumping = false;
                        this.navigation.stop();
                        this.setTarget(null);
                        return InteractionResult.SUCCESS_NO_ITEM_USED;
                    }
                    return interactionresult;
                }
            } else if (itemstack.is(ModTags.Items.BAIHUA_CAT_FOOD) && !this.isTame()) {
                itemstack.consume(1, player);
                this.tryToTame(player);
                return InteractionResult.SUCCESS;
            } else {
                return super.mobInteract(player, hand);
            }
        }
    }

    private void tryToTame(Player player) {
        if (this.random.nextInt(3) == 0 && !net.neoforged.neoforge.event.EventHooks.onAnimalTame(this, player)) {
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
        return stack.is(ModItems.IMMORTAL_PEACH);
    }

    public boolean isApricotSapling(ItemStack stack) {
        return stack.is(ModItems.CLOUD_APRICOT);
    }

    public boolean isWandering() {
        return this.isWandering;
    }

    public void setWandering(boolean wandering) {
        this.isWandering = wandering;
        this.reassessTameGoals();
    }

    @Override
    public void setOrderedToSit(boolean orderedToSit) {
        super.setOrderedToSit(orderedToSit);
        if (orderedToSit) {
            this.setWandering(false);
        }
        this.reassessTameGoals();
    }

    @Override
    public void setTame(boolean tame, boolean applyTamingSideEffects) {
        super.setTame(tame, applyTamingSideEffects);
        this.reassessTameGoals();
    }

    @Override
    protected void reassessTameGoals() {
        if (this.followOwnerGoal != null) {
            this.goalSelector.removeGoal(this.followOwnerGoal);
            if (this.isTame() && !this.isWandering() && !this.isOrderedToSit()) {
                this.goalSelector.addGoal(6, this.followOwnerGoal);
            }
        }
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (this.level().isClientSide) {
            if (this.random.nextInt(9) == 0) {
                SimpleParticleType particle = ModParticleTypes.BAIHUA_CAT.get();
                double x = this.getX() + (this.random.nextDouble() - 0.5) * this.getBbWidth()* 1.2;
                double y = this.getY() + this.random.nextDouble() * this.getBbHeight()* 0.8;
                double z = this.getZ() + (this.random.nextDouble() - 0.5) * this.getBbWidth()* 1.2;
                this.level().addParticle(particle, x, y, z, 0.0, 0.1, 0.0);
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

            if (this.getHealth() < this.getMaxHealth()) {
                if (this.regenCooldown <= 0) {
                    this.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 180, 2));
                    this.regenCooldown = 200;
                } else {
                    this.regenCooldown--;
                }
            } else {
                this.regenCooldown = 0;
            }

            if (this.tickCount % 600 == 0) {
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

    private void growNearbyPlants() {
        BlockPos center = this.blockPosition();
        int radius = 3; // 半径
        BlockPos.betweenClosed(center.offset(-radius, -1, -radius), center.offset(radius, 1, radius))
                .forEach(pos -> {
                    BlockState state = this.level().getBlockState(pos);
                    // 检查是否为可催熟植物（作物、树苗等）
                    if (state.getBlock() instanceof CropBlock cropBlock) {
                        if (cropBlock.isValidBonemealTarget(this.level(), pos, state)) {
                            if (this.random.nextInt(2) == 0) {
                                cropBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    } else if (state.getBlock() instanceof SaplingBlock saplingBlock) {
                        if (saplingBlock.isValidBonemealTarget(this.level(), pos, state)) {
                            if (this.random.nextInt(2) == 0) {
                                saplingBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    } else if (state.getBlock() instanceof WaterLotusBlock waterLotusBlock) {
                        if (waterLotusBlock.isValidBonemealTarget(this.level(), pos, state)) {
                            if (this.random.nextInt(2) == 0) {
                                waterLotusBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    } else if (state.getBlock() instanceof CutFlowerBlock cutFlowerBlock) {
                        if (cutFlowerBlock.isValidBonemealTarget(this.level(), pos, state)) {
                            if (this.random.nextInt(2) == 0) {
                                cutFlowerBlock.performBonemeal((ServerLevel) this.level(), this.random, pos, state);
                                spawnBonemealParticles(pos);
                            }
                        }
                    } else if (state.getBlock() instanceof PeachBlock peachBlock) {
                        if (peachBlock.isValidBonemealTarget(this.level(), pos, state)) {
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
            if (target instanceof AbstractHorse abstracthorse && abstracthorse.isTamed()) {
                return false;
            }
            return !(target instanceof TamableAnimal tamable) || !tamable.isTame();
        }
    }

    @Override
    public boolean doHurtTarget(@NotNull Entity target) {
        float damage = (float) this.getAttributeValue(Attributes.ATTACK_DAMAGE);
        if (target instanceof Enemy) {
            damage *= 9.0F;
        }
        boolean hurt = target.hurt(this.damageSources().mobAttack(this), damage);
        if (hurt) {
            this.playSound(SoundEvents.CAT_HISS, 1.0F, 1.0F);
            if (this.level() instanceof ServerLevel serverlevel) {
                EnchantmentHelper.doPostAttackEffects(serverlevel, target, this.damageSources().mobAttack(this));
            }
        }
        return hurt;
    }

    @Override
    public boolean hurt(@NotNull DamageSource source, float amount) {
        boolean hurt = super.hurt(source, amount);
        if (hurt && this.isAlive()) {
            this.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 2));
        }
        return hurt;
    }
}
