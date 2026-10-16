package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.advancement.ModCriteriaTriggers;
import com.jinlan.moreornplants.block.FlowerBlocks.WaterLotusBlock;
import com.jinlan.moreornplants.block.WeepingBlocks.PeachBlock;
import com.jinlan.moreornplants.config.ModBiomeConfig;
import com.jinlan.moreornplants.entity.custom.ZiyingFox;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ModTags;
import com.jinlan.moreornplants.util.SeasonsTags;
import com.jinlan.moreornplants.worldgen.biome.ModBiomes;
import com.jinlan.moreornplants.worldgen.dimension.ModDimension;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;
import net.minecraftforge.event.entity.EntityLeaveLevelEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.MobSpawnEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.UUID;

import static com.jinlan.moreornplants.init.ModDamageTypes.biomeDamage;

@Mod.EventBusSubscriber(modid = MoreOrnPlants.MOD_ID)
public class ModEvents {
    private static final UUID LONGEVITY_BOOST_UUID = UUID.nameUUIDFromBytes("more_orn_plants:longevity_health".getBytes(StandardCharsets.UTF_8));
    private static final float LONGEVITY_EXTRA_HEALTH = 10.0F;
    private static final ThreadLocal<Integer> EXTRA_GROWTH = ThreadLocal.withInitial(() -> 0);
    private static final UUID QUNFANG_WEAKEN_ID = UUID.nameUUIDFromBytes("more_orn_plants:qunfang_hostile_weaken".getBytes(StandardCharsets.UTF_8));

    @SubscribeEvent
    public static void onEntityJoinLevel(EntityJoinLevelEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Creeper creeper) {
            creeper.goalSelector.addGoal(3, new AvoidEntityGoal<>(creeper, ZiyingFox.class, 9.0F, 1.1, 1.2));
        }

        if (!(entity instanceof LivingEntity living)) return;
        if (!(entity instanceof Enemy)) return;

        AttributeInstance attr = living.getAttribute(Attributes.MAX_HEALTH);
        if (attr == null) return;

        boolean inQunfang = event.getLevel().dimension().equals(ModDimension.THE_QUNFANG_LEVEL);
        boolean hasModifier = attr.getModifier(QUNFANG_WEAKEN_ID) != null;

        if (inQunfang && !hasModifier) {
            attr.addPermanentModifier(new AttributeModifier(
                    QUNFANG_WEAKEN_ID,
                    "qunfang_hostile_weaken",
                    -0.5,
                    AttributeModifier.Operation.MULTIPLY_TOTAL));
            living.setHealth(living.getMaxHealth());
        } else if (!inQunfang && hasModifier) {
            attr.removeModifier(QUNFANG_WEAKEN_ID);
        }
    }

    @SubscribeEvent
    public static void onEntityLeaveLevel(EntityLeaveLevelEvent event) {
        Entity entity = event.getEntity();
        if (!(entity instanceof LivingEntity living)) return;
        AttributeInstance attr = living.getAttribute(Attributes.MAX_HEALTH);
        if (attr != null) {
            attr.removeModifier(QUNFANG_WEAKEN_ID);
        }
    }

    @SubscribeEvent
    public static void onLivingTick(LivingEvent.LivingTickEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity.level().isClientSide) return;
        int tick = entity.tickCount;
        Holder<Biome> biomeHolder = entity.level().getBiome(entity.blockPosition());
        if (tick % 40 == 0) {
            if (entity instanceof Enemy) {
                if (ModBiomeConfig.ENABLE_WUTONG_BIOME_HURT_ENEMY.get() && (biomeHolder.is(ModBiomes.WUTONG_FOREST) || biomeHolder.is(ModBiomes.COLORED_FOREST))) {
                    if (!(entity instanceof ZombieVillager && entity.getHealth() <= 10.0F)) {
                        entity.setSecondsOnFire(2);
                        if (entity.fireImmune() || entity.hasEffect(MobEffects.FIRE_RESISTANCE)) {
                            entity.invulnerableTime = 0;
                            entity.hurt(entity.level().damageSources().magic(), 9.0F);
                            entity.invulnerableTime = 0;
                            entity.hurt(entity.level().damageSources().generic(), 9.0F);
                            entity.invulnerableTime = 0;
                            entity.hurt(entity.level().damageSources().wither(), 9.0F);
                            entity.invulnerableTime = 0;
                            entity.hurt(biomeDamage(entity.level()), 9.0F);
                        } else {
                            entity.hurt(entity.level().damageSources().inFire(), 9.0F);
                        }
                    }
                }
                if (ModBiomeConfig.ENABLE_RED_HIGHLANDS_HURT_ENEMY.get() && biomeHolder.is(ModBiomes.RED_HIGHLANDS)) {
                    float value = ModBiomeConfig.VALUE_OF_RED_HIGHLANDS_HURT_ENEMY.get().floatValue();
                    if (entity instanceof ZombieVillager) {
                        if (entity.getHealth() > 10.0F) {
                            entity.hurt(biomeDamage(entity.level()), value * 0.5f);
                        }
                    } else {
                        float health = entity.getHealth();
                        if (health <= 20.0F) {
                            entity.hurt(biomeDamage(entity.level()), value);
                        } else if (health <= 40.0F) {
                            entity.hurt(biomeDamage(entity.level()), value * 2);
                        } else if (health <= 60.0F) {
                            entity.hurt(biomeDamage(entity.level()), value * 3);
                        } else if (health <= 80.0F) {
                            entity.hurt(biomeDamage(entity.level()), value * 4);
                        } else if (health <= 100.0F) {
                            entity.hurt(biomeDamage(entity.level()), value * 5);
                        } else {
                            entity.hurt(biomeDamage(entity.level()), value * 10);
                        }
                    }
                }
                if (ModBiomeConfig.ENABLE_CAVES_BIOME_HURT_ENEMY.get() && biomeHolder.is(ModBiomes.ZIYING_CAVES)) {
                    entity.hurt(entity.level().damageSources().wither(), 3.0F);
                    entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 3));
                }
                if (ModBiomeConfig.ENABLE_CAVES_BIOME_HURT_ENEMY.get() && biomeHolder.is(ModBiomes.SUYU_CAVES)) {
                    entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 2));
                    entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, 2));
                }
                if (entity.isInvertedHealAndHarm()) {
                    if (biomeHolder.is(ModBiomes.THE_PEACH_BLOSSOM_SPRING)) {
                        if (ModBiomeConfig.ENABLE_PEACH_BIOME_HURT_ENEMY.get() && !(entity instanceof ZombieVillager)) {
                            entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 1));
                        }
                        if (ModBiomeConfig.ENABLE_PEACH_BIOME_AUTO_CURE.get() && entity instanceof ZombieVillager zombieVillager) {
                            if (!zombieVillager.isConverting()) {
                                zombieVillager.startConverting(null, zombieVillager.getRandom().nextInt(481) + 720);
                            }
                            if (zombieVillager.isConverting()) {
                                zombieVillager.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 80, 0));
                            }
                        }
                    }
                }
            }
        }
        if (!(entity instanceof Player || entity instanceof Villager || entity instanceof Animal ||
                entity instanceof AbstractGolem || entity instanceof Allay)) {
            return;
        }
        if (ModBiomeConfig.ENABLE_LONGEVITY_FOREST_EFFECTS.get() && tick % 100 != 0) {
            if (biomeHolder.is(ModBiomes.LONGEVITY_FOREST)) {
                AttributeInstance attribute = entity.getAttribute(Attributes.MAX_HEALTH);
                if (attribute != null && attribute.getModifier(LONGEVITY_BOOST_UUID) == null) {
                    AttributeModifier modifier = new AttributeModifier(
                            LONGEVITY_BOOST_UUID,
                            "longevity_boost",
                            LONGEVITY_EXTRA_HEALTH,
                            AttributeModifier.Operation.ADDITION
                    );
                    attribute.addPermanentModifier(modifier);
                    entity.setHealth(entity.getHealth() + LONGEVITY_EXTRA_HEALTH);
                }
                MobEffectInstance currentEffect = entity.getEffect(MobEffects.REGENERATION);
                if (currentEffect == null || currentEffect.getDuration() < 12200) {
                    entity.addEffect(new MobEffectInstance(
                            MobEffects.REGENERATION, 12600, 4));
                }
            }
        }

        if (tick % 40 == 0) {
            if (biomeHolder.is(ModBiomes.PENGLAI) && ModBiomeConfig.ENABLE_PENGLAI_EFFECTS.get()) {
                MobEffectInstance currentEffect1 = entity.getEffect(MobEffects.FIRE_RESISTANCE);
                MobEffectInstance currentEffect2 = entity.getEffect(MobEffects.WATER_BREATHING);
                MobEffectInstance currentEffect3 = entity.getEffect(MobEffects.DAMAGE_BOOST);
                MobEffectInstance currentEffect4 = entity.getEffect(MobEffects.LUCK);
                if (currentEffect1 == null || currentEffect1.getDuration() < 120300 ||
                        currentEffect2 == null || currentEffect2.getDuration() < 120300 ||
                        currentEffect3 == null || currentEffect3.getDuration() < 120300 ||
                        currentEffect4 == null || currentEffect4.getDuration() < 120300) {
                    entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1, 4));
                    entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 4));
                    entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 120600, 0));
                    entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 120600, 0));
                    entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 120600, 4));
                    entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 120600, 4));
                }
            }
            if (biomeHolder.is(ModBiomes.RED_HIGHLANDS) && ModBiomeConfig.ENABLE_RED_HIGHLANDS_EFFECTS.get()) {
                MobEffectInstance currentRegen = entity.getEffect(MobEffects.DAMAGE_BOOST);
                MobEffectInstance currentEffect2 = entity.getEffect(MobEffects.DAMAGE_RESISTANCE);
                MobEffectInstance currentEffect3 = entity.getEffect(MobEffects.DIG_SPEED);
                if (currentRegen == null || currentRegen.getDuration() < 6000 ||
                        currentEffect2 == null || currentEffect2.getDuration() < 6000 ||
                        currentEffect3 == null || currentEffect3.getDuration() < 6000) {
                    entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 6300, 2));
                    entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 6300, 2));
                    entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 6300, 2));
                }
            }
            if (biomeHolder.is(ModTags.Biomes.FLOWERS_AND_MOON) && ModBiomeConfig.ENABLE_FLOWER_BIOME_EFFECTS.get()) {
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
    public static void onCropGrowPre(BlockEvent.CropGrowEvent.Pre event) {
        if (!ModBiomeConfig.ENABLE_BIOME_SPEED_CROP.get()) return;
        if (!(event.getLevel() instanceof ServerLevel level)) return;
        if (EXTRA_GROWTH.get() > 0) return;
        BlockPos pos = event.getPos();
        BlockState state = event.getState();
        Holder<Biome> biome = level.getBiome(pos);

        boolean harvest = biome.is(ModTags.Biomes.HARVEST);
        boolean seasonal = isSeasonalMatch(state, biome);

        if (!harvest && !seasonal) return;
        int times = 2 + (level.getRandom().nextFloat() < 0.25f ? 1 : 0);
        if (harvest && seasonal) {
            times += 2;
        }
        EXTRA_GROWTH.set(1);
        try {
            for (int i = 0; i < times; i++) {
                state.randomTick(level, pos, level.getRandom());
            }
        } finally {
            EXTRA_GROWTH.set(0);
        }
    }

    private static boolean isSeasonalMatch(BlockState state, Holder<Biome> biome) {
        return (state.is(SeasonsTags.Blocks.SPRING_CROPS) && biome.is(ModTags.Biomes.SPRING_BIOME))
                || (state.is(SeasonsTags.Blocks.SUMMER_CROPS) && biome.is(ModTags.Biomes.SUMMER_BIOME))
                || (state.is(SeasonsTags.Blocks.AUTUMN_CROPS) && biome.is(ModTags.Biomes.AUTUMN_BIOME))
                || (state.is(SeasonsTags.Blocks.WINTER_CROPS) && biome.is(ModTags.Biomes.WINTER_BIOME));
    }

    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        if (!ModBiomeConfig.ENABLE_BIOME_SPEED_CROP.get()) return;
        if (!(event.getLevel() instanceof ServerLevel serverLevel)) return;
        BlockPos pos = event.getPos();
        BlockState state = serverLevel.getBlockState(pos);
        if (state.getBlock() instanceof WaterLotusBlock && state.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.UPPER) {
            BlockPos belowPos = pos.below();
            BlockState belowState = serverLevel.getBlockState(belowPos);
            if (belowState.getBlock() instanceof WaterLotusBlock && belowState.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.LOWER) {
                pos = belowPos;
                state = belowState;
            }
        }
        if (!serverLevel.getBiome(pos).is(ModTags.Biomes.HARVEST)) return;
        if (!isMatureCrop(state)) return;
        Player player = event.getPlayer();
        BlockEntity blockEntity = serverLevel.getBlockEntity(pos);
        List<ItemStack> drops = Block.getDrops(state, serverLevel, pos, blockEntity, player, player.getMainHandItem());
        for (ItemStack drop : drops) {
            Block.popResource(serverLevel, pos, drop);
        }
    }

    private static boolean isMatureCrop(BlockState state) {
        Block block = state.getBlock();

        if (block instanceof CropBlock crop) return crop.isMaxAge(state);
        if (block instanceof NetherWartBlock) return state.getValue(NetherWartBlock.AGE) >= 3;
        if (block instanceof SweetBerryBushBlock) return state.getValue(SweetBerryBushBlock.AGE) >= 3;
        if (block instanceof CocoaBlock) return state.getValue(CocoaBlock.AGE) >= 2;
        if (block instanceof WaterLotusBlock) return state.getValue(WaterLotusBlock.AGE) >= 3;
        if (block instanceof PeachBlock) return state.getValue(PeachBlock.AGE) >= 1;
        return false;
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
                    zombieVillager.startConverting(event.getEntity().getUUID(), zombieVillager.getRandom().nextInt(1201) + 1800);
                }
                event.setCancellationResult(InteractionResult.SUCCESS);
            } else {
                event.setCancellationResult(InteractionResult.CONSUME);
            }
        }
        if (itemstack.is(ModItems.IMMORTAL_PEACH.get())) {
            if (!zombieVillager.isConverting()) {
                if (!event.getEntity().getAbilities().instabuild) {
                    itemstack.shrink(1);
                }
                if (!event.getLevel().isClientSide) {
                    zombieVillager.startConverting(event.getEntity().getUUID(), zombieVillager.getRandom().nextInt(2401) + 3600);
                }
                event.setCancellationResult(InteractionResult.SUCCESS);
            } else {
                event.setCancellationResult(InteractionResult.CONSUME);
            }
        }
    }

    @SubscribeEvent
    public static void onPlayerWakeUp(PlayerWakeUpEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;
        if (!player.level().dimension().equals(ModDimension.THE_QUNFANG_LEVEL)) return;
        if (event.wakeImmediately()) return;

        if (player.getSleepTimer() < 100) return;

        ServerLevel level = player.serverLevel();
        if (level.isDay()) return;

        long dayTime = level.getDayTime();
        long targetTime = dayTime - (dayTime % 24000L) + 24000L;

        level.getServer().overworld().setDayTime(targetTime);
        level.setDayTime(targetTime);
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
