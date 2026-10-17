package com.jinlan.moreornplants.event;

import com.jinlan.moreornplants.MoreOrnPlants;
import com.jinlan.moreornplants.config.ModBiomeConfig;
import com.jinlan.moreornplants.init.ModParticleTypes;
import com.jinlan.moreornplants.item.ModItems;
import com.jinlan.moreornplants.util.ForgeTags;
import com.jinlan.moreornplants.util.ModTags;
import com.jinlan.moreornplants.worldgen.dimension.ModDimension;
import net.minecraft.core.Holder;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.NeutralMob;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.raid.Raider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.jinlan.moreornplants.init.ModDamageTypes.BIOME_DAMAGE;
import static com.jinlan.moreornplants.init.ModDamageTypes.biomeDamage;

@Mod.EventBusSubscriber(modid = MoreOrnPlants.MOD_ID)
public class CombatDamageEvents {
    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event) {
        if (event.getSource().is(BIOME_DAMAGE)) {
            return;
        }
        LivingEntity target = event.getEntity();
        if (target.level().dimension().equals(ModDimension.THE_QUNFANG_LEVEL) && !event.getSource().is(BIOME_DAMAGE)) {
            event.setAmount(event.getAmount() * 0.5f);
        }
        if (target instanceof Player player) {
            InventoryState state = getInventoryState(player);
            Level level = player.level();
            if (state.hasZhuiyueSword() && level.getMoonPhase() == 0) {
                event.setCanceled(true);
                return;
            }
            float damage = event.getAmount();
            if (state.hasBaihuaSword() && state.hasFlower()) {
                damage = Math.min(damage / 2.0f, 2.0f);
            }
            Holder<Biome> biome = level.getBiome(player.blockPosition());
            if (state.hasBaihuaSword() && biome.is(ForgeTags.Biomes.IS_FLORAL)) {
                damage = Math.min(damage / 2.0f, 2.0f);
            }
            float[] result = applyBeadDamageReduction(player, damage,
                    state.hasZiyingBead(), state.hasSuyuBead(), state.hasYuanyangBead());
            if (result[0] == 0) {
                event.setCanceled(true);
                return;
            }
            damage = result[1];
            if (state.hasZhuiyueSword()) {
                int moonPhase = level.getMoonPhase();
                float multiplier = 1.0f;
                if (moonPhase == 1 || moonPhase == 7) {
                    multiplier = 0.25f;
                } else if (moonPhase == 2 || moonPhase == 6) {
                    multiplier = 0.5f;
                } else if (moonPhase == 3 || moonPhase == 5) {
                    multiplier = 0.75f;
                }
                damage *= multiplier;
            }
            if (state.hasCaiyunSword()) {
                if (!level.isRaining() && !level.isThundering()) {
                    damage *= 0.5f;
                }
            }
            event.setAmount(damage);
        }

        if (!(event.getSource().getDirectEntity() instanceof Player player)) return;
        ItemStack weapon = player.getMainHandItem();
        ItemStack offhand = player.getOffhandItem();
        LivingEntity target1 = event.getEntity();
        InventoryState state = getInventoryState(player);
        if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
            if (target1 instanceof ZombieVillager zombieVillager && !zombieVillager.isConverting()) {
                event.setAmount(event.getAmount() * 0.5f);
                zombieVillager.startConverting(player.getUUID(), zombieVillager.getRandom().nextInt(81) + 120);
            } else if (target1.isInvertedHealAndHarm()) {
                float multiplier = 1.0f;
                float maxHealth = target1.getMaxHealth();
                if (maxHealth > 4.0f) {
                    float currentDamage = Math.max(4.0f, event.getAmount());
                    multiplier = maxHealth / 2.0f;
                    event.setAmount(multiplier * (currentDamage - 1));
                } else {
                    event.setAmount(multiplier * (event.getAmount() + maxHealth));
                }
            }
        } else if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get()) && target1.getMobType() == MobType.ARTHROPOD) {
            event.setAmount(event.getAmount() * ModBiomeConfig.CAMPHOR_SWORD_MULTIPLIER.get().floatValue());
        } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
            if (target1.isInvertedHealAndHarm()) {
                target1.setSecondsOnFire(20);
            }
            if (target1 instanceof Raider) {
                event.setAmount(event.getAmount() * ModBiomeConfig.CHINESE_PARASOL_SWORD_MULTIPLIER.get().floatValue());
            }
        } else if (weapon.is(ModTags.Items.ZIYING_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob || hasMeleeAttackGoal(target1))) {
            if (player.getRandom().nextFloat() < 0.75f) {
                event.setAmount(event.getAmount() * ModBiomeConfig.ZIYING_TOOLS_MULTIPLIER.get().floatValue());
            }
        } else if (weapon.is(ModTags.Items.SUYU_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob || hasMeleeAttackGoal(target1))) {
            event.setAmount(event.getAmount() * ModBiomeConfig.SUYU_TOOLS_MULTIPLIER.get().floatValue());
            target1.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 2), player);
        } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) && (target1 instanceof Enemy || target1 instanceof NeutralMob || hasMeleeAttackGoal(target1))) {
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
            if (biome.is(ForgeTags.Biomes.IS_FLORAL)) {
                multiplier *= ModBiomeConfig.BAIHUA_SWORD_FLORAL_BIOME_MULTIPLIER.get().floatValue() * 2;
            }
            event.setAmount(event.getAmount() * multiplier);
        }
        if (!event.getSource().is(BIOME_DAMAGE)) {
            boolean hasQunfangDraw = weapon.is(ModItems.QUNFANG_SCROLL.get()) || offhand.is(ModItems.QUNFANG_SCROLL.get());
            if (hasQunfangDraw) {
                float extraDamage = player.level().dimension().equals(ModDimension.THE_QUNFANG_LEVEL) ? 6.0F : 3.0F;
                int originalInvulnerableTime = target.invulnerableTime;
                float originalLastHurt = target.lastHurt;
                target.invulnerableTime = 0;
                target.lastHurt = 0;
                target.hurt(biomeDamage(player.level(), player), extraDamage);
                target.invulnerableTime = originalInvulnerableTime;
                target.lastHurt = originalLastHurt;
            }
        }
    }

    private static boolean hasMeleeAttackGoal(LivingEntity entity) {
        if (!(entity instanceof Mob mob)) {
            return false;
        }
        return mob.goalSelector.getAvailableGoals().stream()
                .anyMatch(wrapped -> wrapped.getGoal() instanceof MeleeAttackGoal);
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
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get()) || weapon.is(ModItems.QUNFANG_SCROLL.get())) {
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
        } else if (weapon.is(ModItems.BAIHUA_SWORD.get()) || weapon.is(ModItems.QUNFANG_SCROLL.get())) {
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
        ItemStack weapon = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();
        if (player.tickCount % 6 == 0) {
            if (weapon.is(ModTags.Items.ZIYING_TOOLS) || weapon.is(ModItems.ZIYING_BEAD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
            } else if (weapon.is(ModTags.Items.SUYU_TOOLS) || weapon.is(ModItems.SUYU_BEAD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
            } else if (weapon.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) || weapon.is(ModItems.ZIYU_YUANYANG_BEAD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
            } else if (weapon.is(ModItems.BAIHUA_SWORD.get()) || weapon.is(ModItems.QUNFANG_SCROLL.get())) {
                spawnSwordParticle2(player, ModParticleTypes.BAIHUA_CAT.get());
            }
            if (offHand.is(ModTags.Items.ZIYING_TOOLS) || offHand.is(ModItems.ZIYING_BEAD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYING_FOX.get());
            } else if (offHand.is(ModTags.Items.SUYU_TOOLS) || offHand.is(ModItems.SUYU_BEAD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.SUYU_FOX.get());
            } else if (offHand.is(ModTags.Items.ZIYU_YUANYANG_TOOLS) || offHand.is(ModItems.ZIYU_YUANYANG_BEAD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.ZIYU_YUANYANG.get());
            } else if (offHand.is(ModItems.BAIHUA_SWORD.get()) || offHand.is(ModItems.QUNFANG_SCROLL.get())) {
                spawnSwordParticle2(player, ModParticleTypes.BAIHUA_CAT.get());
            }
        }
        if (player.tickCount % 8 == 0) {
            if (weapon.is(ModItems.PEACH_WOODEN_SWORD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
            }
            if (offHand.is(ModItems.PEACH_WOODEN_SWORD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.IMMORTAL_PEACH_LEAVES.get());
            }
        }
        if (player.tickCount % 10 == 0) {
            if (weapon.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
            } else if (weapon.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get());
            }
            if (offHand.is(ModItems.CAMPHOR_WOODEN_SWORD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.CAMPHOR_LEAVES.get());
            } else if (offHand.is(ModItems.CHINESE_PARASOL_WOODEN_SWORD.get())) {
                spawnSwordParticle2(player, ModParticleTypes.YELLOW_CHINESE_PARASOL_LEAVES.get());
            }
        }
    }
}
