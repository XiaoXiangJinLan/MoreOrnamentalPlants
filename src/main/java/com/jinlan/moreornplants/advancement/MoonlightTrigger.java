package com.jinlan.moreornplants.advancement;

import com.google.gson.JsonObject;
import com.jinlan.moreornplants.MoreOrnPlants;
import net.minecraft.advancements.critereon.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class MoonlightTrigger extends SimpleCriterionTrigger<MoonlightTrigger.Instance> {
    private static final ResourceLocation ID = new ResourceLocation(MoreOrnPlants.MOD_ID, "flowers_and_moon");

    @Override
    public @NotNull ResourceLocation getId() {
        return ID;
    }

    @Override
    @NotNull
    protected Instance createInstance(JsonObject json, ContextAwarePredicate playerPredicate, DeserializationContext context) {
        // 如果有额外参数可以从 json 读取，这里没有
        return new Instance(playerPredicate);
    }

    public void trigger(ServerPlayer player) {
        this.trigger(player, instance -> instance.matches(player));
    }

    public static class Instance extends AbstractCriterionTriggerInstance {
        public Instance(ContextAwarePredicate playerPredicate) {
            super(MoonlightTrigger.ID, playerPredicate);
        }

        public boolean matches(ServerPlayer player) {
            if (!this.getPlayerPredicate().matches(EntityPredicate.createContext(player, player))) {
                return false;
            }

            Level level = player.serverLevel();
            boolean isNight = level.isNight();
            boolean isFullMoon = level.getMoonPhase() == 0;
            boolean isClear = !level.isRaining() && !level.isThundering();

            return isNight && isFullMoon && isClear;
        }

        @Override
        public @NotNull JsonObject serializeToJson(SerializationContext context) {
            // 如果没有额外数据，可以返回空 JsonObject
            // 如需将数据写入进度 json，可在此添加
            return new JsonObject();
        }
    }
}
