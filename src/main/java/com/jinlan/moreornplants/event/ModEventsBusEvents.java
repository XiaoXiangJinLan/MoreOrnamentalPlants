package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.entity.custom.BaihuaCat;
import com.jinlan.moreornplants.entity.custom.SuyuFox;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

@EventBusSubscriber(modid = MoreOrnPlants.MODID)
public class ModEventsBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.ZIYING_FOX.get(), ZiyingFox.createAttributes().build());
        event.put(ModEntities.SUYU_FOX.get(), SuyuFox.createAttributes().build());
        event.put(ModEntities.BAIHUA_CAT.get(), BaihuaCat.createAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnPlacements(RegisterSpawnPlacementsEvent event) {
        event.register(ModEntities.ZIYING_FOX.get(),
                SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ZiyingFox::checkZiyingFoxSpawnRules,
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.SUYU_FOX.get(),
                SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                ZiyingFox::checkZiyingFoxSpawnRules,
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
        event.register(ModEntities.BAIHUA_CAT.get(),
                SpawnPlacementTypes.ON_GROUND,
                Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                Animal::checkAnimalSpawnRules,
                RegisterSpawnPlacementsEvent.Operation.REPLACE);
    }

    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Creeper creeper) {
            creeper.goalSelector.addGoal(3, new AvoidEntityGoal<>(creeper, ZiyingFox.class, 9.0F, 1.1, 1.2));
        }
    }

    @SubscribeEvent
    public static void onLivingDamage(LivingIncomingDamageEvent event) {
        LivingEntity target = event.getEntity();
        if (target instanceof Player player) {
            float originalDamage = event.getAmount();
            float[] result = applyBeadDamageReduction(player, originalDamage);
            if (result[0] == 0) {
                event.setCanceled(true);
                return;
            }
            event.setAmount(result[1]);
        }

        if (!(event.getSource().getDirectEntity() instanceof Player player)) return;
        ItemStack weapon = player.getMainHandItem();
        LivingEntity target1 = event.getEntity();
        if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get()) && target1.isInvertedHealAndHarm()) {
            event.setAmount(event.getAmount() * 9.9F);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get()) && target1.getType().is(EntityTypeTags.ARTHROPOD)) {
            event.setAmount(event.getAmount() * 2.2F);
        } else if (weapon.is(ModItems.ZIYING_SWORD.get()) && target1 instanceof Enemy) {
            if (player.getRandom().nextFloat() < 0.75f) {
                event.setAmount(event.getAmount() * 3.0f);
            }
        } else if (weapon.is(ModItems.SUYU_SWORD.get()) && target1 instanceof Enemy) {
            event.setAmount(event.getAmount() * 1.5f);
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        } else if (weapon.is(ModItems.ZIYU_YUANYANG_SWORD.get()) && target1 instanceof Enemy) {
            float multiplier = 1.25f;
            if (player.getRandom().nextFloat() < 0.5f) {
                multiplier *= 3.0f;
            }
            event.setAmount(event.getAmount() * multiplier);
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        }
    }

    private static boolean hasItemInInventory(Player player, Item item) {
        for (ItemStack stack : player.getInventory().items) {
            if (stack.is(item)) return true;
        }
        return player.getInventory().offhand.getFirst().is(item);
    }

    private static float[] applyBeadDamageReduction(Player player, float damage) {
        boolean immune = false;
        float reduction = 1.0f;
        RandomSource random = player.getRandom();

        boolean hasZiying = hasItemInInventory(player, ModItems.ZIYING_BEAD.get());
        boolean hasSuyu = hasItemInInventory(player, ModItems.SUYU_BEAD.get());
        boolean hasYuanyang = hasItemInInventory(player, ModItems.ZIYU_YUANYANG_BEAD.get());

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

    @SubscribeEvent
    public static void onEntityTick(EntityTickEvent.Post event) {
        if (!(event.getEntity() instanceof LivingEntity entity)) {
            return;
        }

        if (entity.level().isClientSide) return;

        if (!(entity instanceof Player || entity instanceof Villager || entity instanceof Animal ||
                entity instanceof AbstractGolem || entity instanceof Allay)) {
            return;
        }

        int tick = entity.tickCount;

        if (tick % 100 == 0) {
            Holder<Biome> biomeHolder = entity.level().getBiome(entity.blockPosition());
            if (biomeHolder.is(ModBiomes.LONGEVITY_FOREST)) {
                MobEffectInstance currentEffect = entity.getEffect(MobEffects.HEALTH_BOOST);
                if (currentEffect == null || currentEffect.getDuration() < 36200) {
                    entity.addEffect(new MobEffectInstance(
                            MobEffects.HEAL, 1, 4));
                }
                if (currentEffect == null || currentEffect.getDuration() < 36300) {
                    entity.addEffect(new MobEffectInstance(
                            MobEffects.HEALTH_BOOST, 36600, 4));
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
        }
    }

    @SubscribeEvent
    public static void onPlayerInteractEntity(PlayerInteractEvent.EntityInteract event) {
        if (!(event.getTarget() instanceof ZombieVillager zombieVillager)) return;

        ItemStack itemstack = event.getItemStack();
        if (itemstack.is(ModItems.GOLDEN_CRABAPPLE.get())) {
            if (zombieVillager.hasEffect(MobEffects.WEAKNESS)) {
                itemstack.consume(1, event.getEntity());
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
        if (!event.getEntity().level().isClientSide) return;
        Player player = event.getEntity();
        ItemStack weapon = player.getMainHandItem();
        if (weapon.is(ModItems.ZIYING_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.ZIYING_FOX.get(), 20);
        } else if (weapon.is(ModItems.SUYU_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.SUYU_FOX.get(), 20);
        } else if (weapon.is(ModItems.ZIYU_YUANYANG_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.ZIYU_YUANYANG.get(), 24);
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.CAMPHOR_LEAVES.get(), 16);
        }
    }

    @SubscribeEvent
    public static void onLeftClickEmpty(PlayerInteractEvent.LeftClickEmpty event) {
        if (!event.getEntity().level().isClientSide) return;
        Player player = event.getEntity();
        ItemStack weapon = player.getMainHandItem();
        if (weapon.is(ModItems.ZIYING_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.ZIYING_FOX.get(), 20);
        } else if (weapon.is(ModItems.SUYU_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.SUYU_FOX.get(), 20);
        } else if (weapon.is(ModItems.ZIYU_YUANYANG_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.ZIYU_YUANYANG.get(), 24);
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get(), 16);
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle(player, ModParticleTypes.CAMPHOR_LEAVES.get(), 16);
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
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        Player player = event.getEntity();
        if (!player.level().isClientSide) return;
        if (player.tickCount % 10 != 0) return;

        ItemStack weapon = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();
        if (weapon.is(ModItems.ZIYING_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
        } else if (weapon.is(ModItems.SUYU_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
        } else if (weapon.is(ModItems.ZIYU_YUANYANG_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
        } else if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
        }
        if (offHand.is(ModItems.ZIYING_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
        } else if (offHand.is(ModItems.SUYU_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
        } else if (offHand.is(ModItems.ZIYU_YUANYANG_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
        } else if (offHand.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
        } else if (offHand.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
            spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
        }
    }
}
