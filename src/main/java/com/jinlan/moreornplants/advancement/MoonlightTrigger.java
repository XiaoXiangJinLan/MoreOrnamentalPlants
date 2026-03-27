package com.jinlan.moreornplants.advancement;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.advancements.CriterionTriggerInstance;
import net.minecraft.advancements.critereon.*;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class MoonlightTrigger extends SimpleCriterionTrigger<MoonlightTrigger.Instance> {
    @Override
    public @NotNull Codec<Instance> codec() {
        return Instance.CODEC;
    }

    public void trigger(ServerPlayer player) {
        this.trigger(player, instance -> instance.matches(player));
    }

    public record Instance(Optional<ContextAwarePredicate> player) implements CriterionTriggerInstance, SimpleInstance {

        public static final Codec<Instance> CODEC = RecordCodecBuilder.create(instance ->
                instance.group(
                        EntityPredicate.ADVANCEMENT_CODEC.optionalFieldOf("player").forGetter(Instance::player)
                ).apply(instance, Instance::new)
        );

        public boolean matches(ServerPlayer player) {
            if (this.player.isPresent() && !this.player.get().matches(EntityPredicate.createContext(player, player))) {
                return false;
            }

            ServerLevel level = player.serverLevel();
            boolean isNight = level.isNight();
            boolean isFullMoon = level.getMoonPhase() == 0;
            boolean isClear = !level.isRaining() && !level.isThundering();

            return isNight && isFullMoon && isClear;
        }
    }
}
