package com.frontanilla.ggj20.logic;

import com.frontanilla.ggj20.Stuff;

public class Damage {

    private Stuff stuff;

    void takeDamage(int damage) {
        stuff.getHealthBar().setLives(stuff.getHealthBar().getLives() - damage);
        if (stuff.getHealthBar().getLives() <= 0) {
            // TODO: GAME OVER
        }
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}