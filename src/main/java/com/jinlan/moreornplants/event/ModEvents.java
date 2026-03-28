package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
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
            float originalDamage = event.getAmount();
            InventoryState state = getInventoryState(player);
            float[] result = applyBeadDamageReduction(player, originalDamage,
                    state.hasZiyingBead(), state.hasSuyuBead(), state.hasYuanyangBead());
            if (result[0] == 0) {
                event.setCanceled(true);
                return;
            }
            event.setAmount(result[1]);
        }

        if (!(event.getSource().getDirectEntity() instanceof Player player)) return;
        ItemStack weapon = player.getMainHandItem();
        LivingEntity target1 = event.getEntity();
        InventoryState state = getInventoryState(player);
        if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get()) && target1.isInvertedHealAndHarm()) {
            event.setAmount(event.getAmount() * 9.99f);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get()) && target1.getMobType() == MobType.ARTHROPOD) {
            event.setAmount(event.getAmount() * 2.22f);
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            if (target1.isInvertedHealAndHarm()) {
                target1.setSecondsOnFire(20);
            }
            if (target1 instanceof Raider) {
                event.setAmount(event.getAmount() * 3.33f);
            }
        } else if (weapon.is(ModTags.Items.ZIYING_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob)) {
            if (player.getRandom().nextFloat() < 0.75f) {
                event.setAmount(event.getAmount() * 3.0f);
            }
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob)) {
            event.setAmount(event.getAmount() * 1.5f);
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob)) {
            float multiplier = 1.25f;
            if (player.getRandom().nextFloat() < 0.5f) {
                multiplier *= 3.0f;
            }
            event.setAmount(event.getAmount() * multiplier);
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        } else if (weapon.is(ModItems.ZHUIYUE_SWORD.get())) {
            float multiplier;
            Level level = player.level();
            if (level.getMoonPhase() == 0) {
                multiplier = 2.0F;
            } else {
                int moonPhase = level.getMoonPhase();
                int distToFull = Math.min(moonPhase, 8 - moonPhase);
                multiplier = 1.0F + (4 - distToFull) / 4.0F;
            }
            if (state.hasCaiyunSword()) {
                multiplier *= 1.2F;
            }
            event.setAmount(event.getAmount() * multiplier);
        }else if (weapon.is(ModItems.CAIYUN_SWORD.get())) {
            float multiplier;
            Level level = player.level();
            if (level.isThundering()) {
                multiplier = 0.5F;
            } else if (!level.isRaining() && !level.isThundering()) {
                multiplier = 1.5F;
            } else {
                multiplier = 1.0F;
            }
            if (state.hasZhuiyueSword()) {
                multiplier *= 1.2F;
            }
            event.setAmount(event.getAmount() * multiplier);
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            float multiplier = 1.0F;
            if (state.hasFlower()) {
                multiplier *= 5.0F;
            }
            Level level = player.level();
            Holder<Biome> biome = level.getBiome(player.blockPosition());
            if (biome.is(ModTags.Biomes.FLOWERS_AND_MOON)) {
                multiplier *= 9.0F;
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

        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(ModItems.ZIYING_BEAD.get())) hasZiyingBead = true;
            if (stack.is(ModItems.SUYU_BEAD.get())) hasSuyuBead = true;
            if (stack.is(ModItems.ZIYU_YUANYANG_BEAD.get())) hasYuanyangBead = true;
            if (stack.is(ModItems.ZHUIYUE_SWORD.get())) hasZhuiyueSword = true;
            if (stack.is(ModItems.CAIYUN_SWORD.get())) hasCaiyunSword = true;
            if (stack.is(ItemTags.FLOWERS)) hasFlower = true;
        }

        ItemStack offhand = player.getInventory().offhand.get(0);
        if (offhand.is(ModItems.ZIYING_BEAD.get())) hasZiyingBead = true;
        if (offhand.is(ModItems.SUYU_BEAD.get())) hasSuyuBead = true;
        if (offhand.is(ModItems.ZIYU_YUANYANG_BEAD.get())) hasYuanyangBead = true;
        if (offhand.is(ModItems.ZHUIYUE_SWORD.get())) hasZhuiyueSword = true;
        if (offhand.is(ModItems.CAIYUN_SWORD.get())) hasCaiyunSword = true;
        if (offhand.is(ItemTags.FLOWERS)) hasFlower = true;

        return new InventoryState(hasZiyingBead, hasSuyuBead, hasYuanyangBead,
                hasZhuiyueSword, hasCaiyunSword, hasFlower);
    }

    private record InventoryState(boolean hasZiyingBead, boolean hasSuyuBead, boolean hasYuanyangBead,
                                  boolean hasZhuiyueSword, boolean hasCaiyunSword, boolean hasFlower) {}


    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity.level().isClientSide) return;
        if (!(entity instanceof Player || entity instanceof Villager || entity instanceof Animal ||
                entity instanceof AbstractGolem || entity instanceof Allay)) {
            return;
        }

        int tick = entity.tickCount;

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

        if (biome.is(ModTags.Biomes.NO_ENEMY)) {
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
}
