package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.advancement.ModCriteriaTriggers;
import com.jinlan.moreornplants.config.ModBiomeConfig;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MoreOrnPlants.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Creeper creeper) {
            creeper.goalSelector.addGoal(3, new AvoidEntityGoal<>(creeper, ZiyingFox.class, 9.0F, 1.1, 1.2));
        }
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        LivingEntity target = event.getEntity();
        if (target instanceof Player player) {
            InventoryState state = getInventoryState(player);
            Level level = player.level();
            if (state.hasZhuiyueSword() && state.hasCaiyunSword()
                    && level.getMoonPhase() == 0) {
                event.setCanceled(true);
                return;
            }
            float originalDamage = event.getAmount();
            float[] result = applyBeadDamageReduction(player, originalDamage,
                    state.hasZiyingBead(), state.hasSuyuBead(), state.hasYuanyangBead());
            if (result[0] == 0) {
                event.setCanceled(true);
                return;
            }
            float damage = result[1];
            Holder<Biome> biome = level.getBiome(player.blockPosition());
            if (state.hasBaihuaSword() && state.hasFlower() || biome.is(ModTags.Biomes.FLOWERS_AND_MOON)) {
                damage = Math.min(damage / 2.0f, 2.0f);
            }
            event.setAmount(damage);
        }

        if (!(event.getSource().getDirectEntity() instanceof Player player)) return;
        ItemStack weapon = player.getMainHandItem();
        LivingEntity target1 = event.getEntity();
        InventoryState state = getInventoryState(player);
        if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get()) && target1.isInvertedHealAndHarm()) {
            float multiplier = 1.0f;
            float maxHealth = target1.getMaxHealth();
            if (maxHealth > 4.0f) {
                multiplier = maxHealth / 2.0f;
                event.setAmount(multiplier * (event.getAmount() - 1));
            } else {
                event.setAmount(multiplier * (event.getAmount() + maxHealth));
            }
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get()) && target1.getMobType() == MobType.ARTHROPOD) {
            event.setAmount(event.getAmount() * ModBiomeConfig.CAMPHOR_SWORD_MULTIPLIER.get().floatValue() * 2);
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            if (target1.isInvertedHealAndHarm()) {
                target1.setSecondsOnFire(20);
            }
            if (target1 instanceof Raider) {
                event.setAmount(event.getAmount() * ModBiomeConfig.CHINESE_PARASOL_SWORD_MULTIPLIER.get().floatValue() * 2);
            }
        } else if (weapon.is(ModTags.Items.ZIYING_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob)) {
            if (player.getRandom().nextFloat() < 0.75f) {
                event.setAmount(event.getAmount() * ModBiomeConfig.ZIYING_TOOLS_MULTIPLIER.get().floatValue());
            }
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob)) {
            event.setAmount(event.getAmount() * ModBiomeConfig.SUYU_TOOLS_MULTIPLIER.get().floatValue());
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob)) {
            float multiplier = ModBiomeConfig.ZIYU_YUANYANG_TOOLS_BASE_MULTIPLIER.get().floatValue();
            if (player.getRandom().nextFloat() < 0.55f) {
                multiplier *= ModBiomeConfig.ZIYU_YUANYANG_TOOLS_CRIT_MULTIPLIER.get().floatValue();
            }
            event.setAmount(event.getAmount() * multiplier);
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        } else if (weapon.is(ModItems.ZHUIYUE_SWORD.get())) {
            float multiplier;
            Level level = player.level();
            if (level.getMoonPhase() == 0) {
                multiplier = ModBiomeConfig.ZHUIYUE_SWORD_FULL_MOON_MULTIPLIER.get().floatValue() * 2;
            } else {
                int moonPhase = level.getMoonPhase();
                int distToFull = Math.min(moonPhase, 8 - moonPhase);
                multiplier = 1.0F + (4 - distToFull);
            }
            if (state.hasCaiyunSword()) {
                multiplier *= 1.5F;
            }
            event.setAmount(event.getAmount() * multiplier);
        }else if (weapon.is(ModItems.CAIYUN_SWORD.get())) {
            float multiplier;
            Level level = player.level();
            if (level.isThundering()) {
                multiplier = ModBiomeConfig.CAIYUN_SWORD_THUNDER_MULTIPLIER.get().floatValue() * 2;
            } else if (!level.isRaining() && !level.isThundering()) {
                multiplier = ModBiomeConfig.CAIYUN_SWORD_CLEAR_MULTIPLIER.get().floatValue() * 2;
            } else {
                multiplier = ModBiomeConfig.CAIYUN_SWORD_RAIN_MULTIPLIER.get().floatValue() * 2;
            }
            if (state.hasZhuiyueSword()) {
                multiplier *= 1.5F;
            }
            event.setAmount(event.getAmount() * multiplier);
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            float multiplier = 1.0F;
            if (state.hasFlower()) {
                multiplier *= ModBiomeConfig.BAIHUA_SWORD_FLOWER_MULTIPLIER.get().floatValue() * 2;
            }
            Level level = player.level();
            Holder<Biome> biome = level.getBiome(player.blockPosition());
            if (biome.is(ModTags.Biomes.FLOWERS_AND_MOON)) {
                multiplier *= ModBiomeConfig.BAIHUA_SWORD_FLORAL_BIOME_MULTIPLIER.get().floatValue() * 2;
            }
            event.setAmount(event.getAmount() * multiplier);
        }
    }

    private static float[] applyBeadDamageReduction(Player player, float damage,
                                                    boolean hasZiying, boolean hasSuyu, boolean hasYuanyang) {
        boolean immune = false;
        float reduction = 1.0f;
        RandomSource random = player.getRandom();

        if (hasZiying && random.nextFloat() < 0.25f) {
            immune = true;
        }

        if (hasSuyu) {
            reduction *= 0.75f;
        }

        if (hasYuanyang) {
            if (random.nextFloat() < 0.2f) {
                immune = true;
            } else {
                reduction *= 0.8f;
            }
        }

        if (immune) {
            return new float[]{0, 0};
        } else {
            return new float[]{1, damage * reduction};
        }
    }

    private static InventoryState getInventoryState(Player player) {
        boolean hasZiyingBead = false;
        boolean hasSuyuBead = false;
        boolean hasYuanyangBead = false;
        boolean hasZhuiyueSword = false;
        boolean hasCaiyunSword = false;
        boolean hasFlower = false;
        boolean hasBaihuaSword = false;

        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(ModItems.ZIYING_BEAD.get())) hasZiyingBead = true;
            if (stack.is(ModItems.SUYU_BEAD.get())) hasSuyuBead = true;
            if (stack.is(ModItems.ZIYU_YUANYANG_BEAD.get())) hasYuanyangBead = true;
            if (stack.is(ModItems.ZHUIYUE_SWORD.get())) hasZhuiyueSword = true;
            if (stack.is(ModItems.CAIYUN_SWORD.get())) hasCaiyunSword = true;
            if (stack.is(ItemTags.FLOWERS)) hasFlower = true;
            if (stack.is(ModItems.BAIHUA_SWORD.get())) hasBaihuaSword = true;
        }

        ItemStack offhand = player.getInventory().offhand.get(0);
        if (offhand.is(ModItems.ZIYING_BEAD.get())) hasZiyingBead = true;
        if (offhand.is(ModItems.SUYU_BEAD.get())) hasSuyuBead = true;
        if (offhand.is(ModItems.ZIYU_YUANYANG_BEAD.get())) hasYuanyangBead = true;
        if (offhand.is(ModItems.ZHUIYUE_SWORD.get())) hasZhuiyueSword = true;
        if (offhand.is(ModItems.CAIYUN_SWORD.get())) hasCaiyunSword = true;
        if (offhand.is(ItemTags.FLOWERS)) hasFlower = true;
        if (offhand.is(ModItems.BAIHUA_SWORD.get())) hasBaihuaSword = true;

        return new InventoryState(hasZiyingBead, hasSuyuBead, hasYuanyangBead,
                hasZhuiyueSword, hasCaiyunSword, hasFlower, hasBaihuaSword);
    }

    private record InventoryState(boolean hasZiyingBead, boolean hasSuyuBead, boolean hasYuanyangBead,
                                  boolean hasZhuiyueSword, boolean hasCaiyunSword, boolean hasFlower, boolean hasBaihuaSword) {}

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity.level().isClientSide) return;
        int tick = entity.tickCount;
        if (ModBiomeConfig.ENABLE_BIOME_HURT_ENEMY.get() && entity instanceof Enemy && tick % 40 == 0) {
            Holder<Biome> biomeHolder = entity.level().getBiome(entity.blockPosition());
            if (biomeHolder.is(ModBiomes.WUTONG_FOREST) || biomeHolder.is(ModBiomes.COLORED_FOREST)) {
                if (!(entity instanceof ZombieVillager && entity.getHealth() <= 10.0F)) {
                    entity.setSecondsOnFire(2);
                    if (entity.fireImmune() || entity.hasEffect(MobEffects.FIRE_RESISTANCE)) {
                        entity.invulnerableTime = 0;
                        entity.hurt(entity.level().damageSources().magic(), 9.0F);
                        entity.invulnerableTime = 0;
                        entity.hurt(entity.level().damageSources().generic(), 9.0F);
                        entity.invulnerableTime = 0;
                        entity.hurt(entity.level().damageSources().drown(), 9.0F);
                        entity.invulnerableTime = 0;
                        entity.hurt(entity.level().damageSources().wither(), 9.0F);
                    } else {
                        entity.hurt(entity.level().damageSources().inFire(), 9.0F);
                    }
                }
            }
            if (biomeHolder.is(ModBiomes.ZIYING_CAVES)) {
                entity.hurt(entity.level().damageSources().wither(), 3.0F);
                entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 3));
            }
            if (biomeHolder.is(ModBiomes.SUYU_CAVES)) {
                entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2));
                entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, 2));
            }
        }
        if (!(entity instanceof Player || entity instanceof Villager || entity instanceof Animal ||
                entity instanceof AbstractGolem || entity instanceof Allay)) {
            return;
        }
        if (!ModBiomeConfig.ENABLE_BIOME_EFFECTS.get()) return;
        if (tick % 100 != 0) {
            Holder<Biome> biomeHolder = entity.level().getBiome(entity.blockPosition());
            if (biomeHolder.is(ModBiomes.LONGEVITY_FOREST)) {
                MobEffectInstance currentEffect = entity.getEffect(MobEffects.HEALTH_BOOST);
                if (currentEffect == null || currentEffect.getDuration() < 1200) {
                    entity.addEffect(new MobEffectInstance(
                            MobEffects.HEALTH_BOOST, 36600, 4));
                    entity.addEffect(new MobEffectInstance(
                            MobEffects.HEAL, 1, 4));
                }
            }
        }

        if (tick % 40 == 0) {
            Holder<Biome> biomeHolder = entity.level().getBiome(entity.blockPosition());
            if (biomeHolder.is(ModBiomes.PENGLAI)) {
                MobEffectInstance currentEffect1 = entity.getEffect(MobEffects.FIRE_RESISTANCE);
                MobEffectInstance currentEffect2 = entity.getEffect(MobEffects.WATER_BREATHING);
                MobEffectInstance currentEffect3 = entity.getEffect(MobEffects.DAMAGE_BOOST);
                MobEffectInstance currentEffect4 = entity.getEffect(MobEffects.LUCK);
                if (currentEffect1 == null || currentEffect1.getDuration() < 48300 ||
                        currentEffect2 == null || currentEffect2.getDuration() < 48300 ||
                        currentEffect3 == null || currentEffect3.getDuration() < 48300 ||
                        currentEffect4 == null || currentEffect4.getDuration() < 48300) {
                    entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 4));
                    entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 4));
                    entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 48600, 0));
                    entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 48600, 0));
                    entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 48600, 4));
                    entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 48600, 4));
                }
            }
            Holder<Biome> biomeHolder3 = entity.level().getBiome(entity.blockPosition());
            if (biomeHolder3.is(ModBiomes.RED_HIGHLANDS)) {
                MobEffectInstance currentRegen = entity.getEffect(MobEffects.DAMAGE_BOOST);
                MobEffectInstance currentEffect2 = entity.getEffect(MobEffects.DAMAGE_RESISTANCE);
                MobEffectInstance currentEffect3 = entity.getEffect(MobEffects.DIG_SPEED);
                if (currentRegen == null || currentRegen.getDuration() < 12000 ||
                        currentEffect2 == null || currentEffect2.getDuration() < 12000 ||
                        currentEffect3 == null || currentEffect3.getDuration() < 12000) {
                    entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12300, 2));
                    entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 12300, 2));
                    entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 12300, 2));
                }
            }
            Holder<Biome> biomeHolder2 = entity.level().getBiome(entity.blockPosition());
            if (biomeHolder2.is(ModTags.Biomes.FLOWERS_AND_MOON)) {
                Level level = entity.level();
                if (level.isNight() && level.getMoonPhase() == 0 && !level.isRaining() && !level.isThundering()) {
                    MobEffectInstance currentRegen1 = entity.getEffect(MobEffects.REGENERATION);
                    if (currentRegen1 == null || currentRegen1.getDuration() < 520) {
                        entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 600, 0));
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onMobSpawnPositionCheck(MobSpawnEvent.PositionCheck event) {
        var level = event.getLevel();
        var mob = event.getEntity();
        var biome = level.getBiome(mob.blockPosition());

        if (ModBiomeConfig.ENABLE_BIOME_NO_ENEMY.get() && biome.is(ModTags.Biomes.NO_ENEMY)) {
            if (mob instanceof Enemy || mob.getType().getCategory() == MobCategory.MONSTER) {
                event.setResult(MobSpawnEvent.PositionCheck.Result.DENY);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerInteractEntity(PlayerInteractEvent.EntityInteract event) {
        if (!(event.getTarget() instanceof ZombieVillager zombieVillager)) return;

        ItemStack itemstack = event.getItemStack();
        if (itemstack.is(ModItems.GOLDEN_CRABAPPLE.get())) {
            if (zombieVillager.hasEffect(MobEffects.WEAKNESS)) {
                if (!event.getEntity().getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                if (!event.getLevel().isClientSide) {
                    zombieVillager.startConverting(event.getEntity().getUUID(), zombieVillager.getRandom().nextInt(1201) + 2400);
                }
                event.setCancellationResult(InteractionResult.SUCCESS);
            } else {
                event.setCancellationResult(InteractionResult.CONSUME);
            }
        }
    }

    private static void spawnSwordParticle(Player player, SimpleParticleType particleType, int count) {
        var level = player.level();
        var lookVec = player.getLookAngle();
        double startX = player.getX();
        double startY = player.getY() + player.getEyeHeight() - 0.2;
        double startZ = player.getZ();

        double rightX = lookVec.z;
        double rightZ = -lookVec.x;
        double upX = 0;
        double upY = 1;
        double upZ = 0;

        for (int i = 0; i < count; i++) {
            double distance = 1.2 + level.random.nextDouble() * 0.8;
            double lateral = (level.random.nextDouble() - 0.5) * 3.2;
            double vertical = (level.random.nextDouble() - 0.5);

            double x = startX + lookVec.x * distance + rightX * lateral + upX * vertical;
            double z = startZ + lookVec.z * distance + rightZ * lateral + upZ * vertical;
            double y = startY + lookVec.y * distance + upY * vertical;

            double vx = (level.random.nextDouble() - 0.5) * 0.2;
            double vz = (level.random.nextDouble() - 0.5) * 0.2;
            double vy = level.random.nextDouble() * 0.2;

            level.addParticle(particleType, x, y, z, vx, vy, vz);
        }
    }

    @SubscribeEvent
    public static void onAttackEntity(AttackEntityEvent event) {
        Player player = event.getEntity();
        ItemStack weapon = player.getMainHandItem();
        if (weapon.is(ModTags.Items.ZIYING_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYING_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.SUYU_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYU_YUANYANG.get(), 24);
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.CAMPHOR_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get(), 12);
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.BAIHUA_CAT.get(), 24);
        }
    }

    @SubscribeEvent
    public static void onLeftClickEmpty(PlayerInteractEvent.LeftClickEmpty event) {
        Player player = event.getEntity();
        ItemStack weapon = player.getMainHandItem();
        if (weapon.is(ModTags.Items.ZIYING_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYING_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.SUYU_FOX.get(), 20);
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS)) {
            spawnSwordParticle(player, ModParticleTypes.ZIYU_YUANYANG.get(), 24);
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.CAMPHOR_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get(), 12);
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.BAIHUA_CAT.get(), 24);
        }
    }

    private static void spawnSwordParticle2(Player player, SimpleParticleType particleType) {
        var level = player.level();
        double baseX = player.getX();
        double baseY = player.getY() + player.getBbHeight() / 2;
        double baseZ = player.getZ();

        for (int i = 0; i < 1; i++) {
            double radius = 1.2;
            double x = baseX + (level.random.nextDouble() - 0.5) * radius * 2;
            double y = baseY + (level.random.nextDouble() - 0.5) * radius * 1.2;
            double z = baseZ + (level.random.nextDouble() - 0.5) * radius * 2;

            double vx = (level.random.nextDouble() - 0.5) * 0.6;
            double vz = (level.random.nextDouble() - 0.5) * 0.6;
            double vy = level.random.nextDouble() * 0.2 + 0.1;

            level.addParticle(particleType, x, y, z, vx, vy, vz);
        }
    }

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        Player player = event.player;
        if (!player.level().isClientSide) return;
        if (player.tickCount % 10 != 0) return;

        ItemStack weapon = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();
        if (weapon.is(ModTags.Items.ZIYING_TOOLS) || weapon.is(ModItems.ZIYING_BEAD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS) || weapon.is(ModItems.SUYU_BEAD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) || weapon.is(ModItems.ZIYU_YUANYANG_BEAD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get());
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.BAIHUA_CAT.get());
        }
        if (offHand.is(ModTags.Items.ZIYING_TOOLS) || offHand.is(ModItems.ZIYING_BEAD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
        } else if (offHand.is(ModTags.Items.SUYU_TOOLS) || offHand.is(ModItems.SUYU_BEAD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
        } else if (offHand.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) || offHand.is(ModItems.ZIYU_YUANYANG_BEAD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
        } else if (offHand.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
        } else if (offHand.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
        } else if (offHand.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get());
        } else if (offHand.is(ModItems.BAIHUA_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.BAIHUA_CAT.get());
        }
    }

    @SubscribeEvent
    public static void onPlayerTick2(TickEvent.PlayerTickEvent event) {
        // 只在服务端执行，且只在 tick 结束时触发一次（避免重复）
        if (event.phase == TickEvent.Phase.END && !event.player.level().isClientSide) {
            ServerPlayer player = (ServerPlayer) event.player;
            // 调用你的自定义触发器
            ModCriteriaTriggers.FLOWERS_AND_MOON.trigger(player);
        }
    }
}
