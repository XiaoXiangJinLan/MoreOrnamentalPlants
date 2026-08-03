package com.jinlan.moreornplants.entity.ai.goal;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.OcelotAttackGoal;

public class BaihuaCatAttackGoal extends OcelotAttackGoal {
    private final Mob mob;
    private int attackTime;

    public BaihuaCatAttackGoal(Mob mob) {
        super(mob);
        this.mob = mob;
    }

    @Override
    public void tick() {
        LivingEntity target = this.mob.getTarget();
        if (target == null) return;

        this.mob.getLookControl().setLookAt(target, 30.0F, 30.0F);
        double d0 = (this.mob.getBbWidth() * 5.0F) * (this.mob.getBbWidth() * 5.0F);
        double d1 = this.mob.distanceToSqr(target.getX(), target.getY(), target.getZ());
        double d2 = 0.8;
        if (d1 > d0 && d1 < 36.0) {
            d2 = 1.33;
        } else if (d1 < 225.0) {
            d2 = 0.6;
        }

        this.mob.getNavigation().moveTo(target, d2);
        this.attackTime = Math.max(this.attackTime - 1, 0);
        if (!(d1 > d0)) {
            if (this.attackTime <= 0) {
                this.attackTime = 8;
                this.mob.doHurtTarget(target);
            }
        }
    }
}
