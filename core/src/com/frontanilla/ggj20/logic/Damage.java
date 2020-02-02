package com.frontanilla.ggj20.logic;

import com.frontanilla.ggj20.Stuff;

public class Damage {

    private Stuff stuff;
    // Logic
    private float time;
    private boolean damageable;

    public void update(float delta) {
        time += delta;
        if (time > 3f) {
            time = 0f;
            damageable = true;
        }
    }

    void takeDamage(int damage) {
        stuff.getHealthBar().setLives(stuff.getHealthBar().getLives() - damage);
        if (stuff.getHealthBar().getLives() <= 0) {
            // TODO: GAME OVER
        }
        time = 0f;
        damageable = false;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }

    boolean isDamageable() {
        return damageable;
    }
}