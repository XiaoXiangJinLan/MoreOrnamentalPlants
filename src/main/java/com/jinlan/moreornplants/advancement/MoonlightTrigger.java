package com.jinlan.moreornplants.advancement;

import com.google.gson.JsonObject;
import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.advancements.critereon.*;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MoonlightTrigger extends SimpleCriterionTrigger<MoonlightTrigger.TriggerInstance> {

    public static final ResourceLocation ID =
            new ResourceLocation(MoreOrnPlants.MOD_ID, "moonlight_condition");

    @Override
    public @NotNull ResourceLocation getId() {
        return ID;
    }

    @Override
    protected @NotNull TriggerInstance createInstance(@NotNull JsonObject pJson, @NotNull ContextAwarePredicate pPlayer, @NotNull DeserializationContext pContext) {
        return new TriggerInstance(pPlayer);
    }

    public void trigger(ServerPlayer pPlayer) {
        this.trigger(pPlayer, (instance) -> instance.matches(pPlayer));
    }

    public static class TriggerInstance extends AbstractCriterionTriggerInstance {

        public TriggerInstance(ContextAwarePredicate pPlayer) {
            super(ID, pPlayer);
        }

        public boolean matches(ServerPlayer player) {
            ServerLevel level = player.serverLevel();

            if (level.dimension() != Level.OVERWORLD) {
                return false;
            }

            long dayTime = level.getDayTime() % 24000L;
            boolean isNight = dayTime >= 13000 && dayTime < 23000;

            int moonPhase = level.getMoonPhase();
            boolean isFullMoon = moonPhase == 0;

            boolean isClear = !level.isRaining() && !level.isThundering();

            return isNight && isFullMoon && isClear;
        }

        public static TriggerInstance moonlight() {
            return new TriggerInstance(ContextAwarePredicate.ANY);
        }
    }
}
