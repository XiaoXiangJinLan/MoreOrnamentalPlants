package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.advancement.ModCriteriaTriggers;
import com.jinlan.moreornplants.config.ModBiomeConfig;
import com.jinlan.moreornplants.entity.ModEntities;
import com.jinlan.moreornplants.entity.custom.BaihuaCat;
import com.jinlan.moreornplants.entity.custom.SuyuFox;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import net.minecraft.core.Holder;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.EntityTypeTags;
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
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.Heightmap;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.neoforge.event.entity.living.MobSpawnEvent;
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
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        if (!event.getEntity().level().isClientSide) {
            ServerPlayer player = (ServerPlayer) event.getEntity();
            if (player.tickCount % 20 == 0) {
                ModCriteriaTriggers.FLOWERS_AND_MOON.get().trigger(player);
            }
        }
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
            InventoryState state = getInventoryState(player);
            Level level = player.level();
            if (state.hasZhuiyueSword() && state.hasCaiyunSword()
                    && !level.isRaining() && !level.isThundering()
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
            if (state.hasBaihuaSword() && state.hasFlower()) {
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
            if (maxHealth > 5.0f) {
                multiplier = maxHealth / 5.0f;
            }
            event.setAmount(multiplier * (event.getAmount() + 1));
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get()) && target1.getType().is(EntityTypeTags.ARTHROPOD)) {
            event.setAmount(event.getAmount() * ModBiomeConfig.CAMPHOR_SWORD_MULTIPLIER.get().floatValue());
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            if (target1.getType().is(EntityTypeTags.UNDEAD)) {
                target1.igniteForSeconds(20);
            }
            if (target1 instanceof Raider) {
                event.setAmount(event.getAmount() * ModBiomeConfig.CHINESE_PARASOL_SWORD_MULTIPLIER.get().floatValue());
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
            if (player.getRandom().nextFloat() < 0.5f) {
                multiplier *= ModBiomeConfig.ZIYU_YUANYANG_TOOLS_CRIT_MULTIPLIER.get().floatValue();
            }
            event.setAmount(event.getAmount() * multiplier);
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        } else if (weapon.is(ModItems.ZHUIYUE_SWORD.get())) {
            float multiplier;
            Level level = player.level();
            if (level.getMoonPhase() == 0) {
                multiplier = ModBiomeConfig.ZHUIYUE_SWORD_FULL_MOON_MULTIPLIER.get().floatValue();
            } else {
                int moonPhase = level.getMoonPhase();
                int distToFull = Math.min(moonPhase, 8 - moonPhase);
                multiplier = 1.0F + (4 - distToFull) / 4.0F;
            }
            if (state.hasCaiyunSword()) {
                multiplier *= 1.2F;
            }
            event.setAmount(event.getAmount() * multiplier);
        } else if (weapon.is(ModItems.CAIYUN_SWORD.get())) {
            float multiplier;
            Level level = player.level();
            if (level.isThundering()) {
                multiplier = ModBiomeConfig.CAIYUN_SWORD_THUNDER_MULTIPLIER.get().floatValue();
            } else if (!level.isRaining() && !level.isThundering()) {
                multiplier = ModBiomeConfig.CAIYUN_SWORD_CLEAR_MULTIPLIER.get().floatValue();
            } else {
                multiplier = ModBiomeConfig.CAIYUN_SWORD_RAIN_MULTIPLIER.get().floatValue();
            }
            if (state.hasZhuiyueSword()) {
                multiplier *= 1.2F;
            }
            event.setAmount(event.getAmount() * multiplier);
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get())) {
            float multiplier = 1.0F;
            if (state.hasFlower()) {
                multiplier *= ModBiomeConfig.BAIHUA_SWORD_FLOWER_MULTIPLIER.get().floatValue();
            }
            Level level = player.level();
            Holder<Biome> biome = level.getBiome(player.blockPosition());
            if (biome.is(Tags.Biomes.IS_FLORAL)) {
                multiplier *= ModBiomeConfig.BAIHUA_SWORD_FLORAL_BIOME_MULTIPLIER.get().floatValue();
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

        ItemStack offhand = player.getInventory().offhand.getFirst();
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
    public static void onEntityTick(EntityTickEvent.Post event) {
        if (!(event.getEntity() instanceof LivingEntity entity)) {
            return;
        }
        if (entity.level().isClientSide) return;
        if (!(entity instanceof Player || entity instanceof Villager || entity instanceof Animal ||
                entity instanceof AbstractGolem || entity instanceof Allay)) {
            return;
        }
        if (!ModBiomeConfig.ENABLE_BIOME_EFFECTS.get()) return;
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
                    MobEffectInstance currentRegen = entity.getEffect(MobEffects.REGENERATION);
                    if (currentRegen == null || currentRegen.getDuration() < 520) {
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
                event.setResult(MobSpawnEvent.PositionCheck.Result.FAIL);
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
}
