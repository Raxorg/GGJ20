package com.frontanilla.ggj20.logic;

import com.frontanilla.ggj20.Stuff;
import com.frontanilla.ggj20.stuff.MutantWolf;

public class EnemyController {

    private Stuff stuff;

    public void update(float delta) {
        MutantWolf mutantWolf;
        for (int i = 0; i < stuff.getMutantWolves().size; i++) {
            mutantWolf = stuff.getMutantWolves().get(i);

        }
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}