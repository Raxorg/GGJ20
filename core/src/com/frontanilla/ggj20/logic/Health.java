package com.frontanilla.ggj20.logic;

import com.frontanilla.ggj20.Stuff;

public class Health {

    private Stuff stuff;
    // Logic
    private int lives;

    public void update(float delta) {

    }

    public int getLives() {
        return lives;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}