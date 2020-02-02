package com.frontanilla.ggj20.logic;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.frontanilla.ggj20.Logic;
import com.frontanilla.ggj20.Stuff;
import com.frontanilla.ggj20.stuff.MutantWolf;

public class EnemyController {

    private Logic logic;
    private Stuff stuff;

    public void update(float delta) {
        MutantWolf mutantWolf;
        Vector2 wolfPosition = new Vector2();
        Vector2 playerPosition = new Vector2();
        playerPosition = stuff.getPlayer().getBounds().getPosition(playerPosition);
        for (int i = 0; i < stuff.getMutantWolves().size; i++) {
            mutantWolf = stuff.getMutantWolves().get(i);
            mutantWolf.getBounds().getPosition(wolfPosition);
            if (wolfPosition.dst(playerPosition) < 300f) {
                float right = wolfPosition.x < playerPosition.x ? 1f : -1f;
                mutantWolf.getBounds().x += 100f * delta * right;
                mutantWolf.setFlipped(right == -1f);
                if (wolfPosition.dst(playerPosition) < 10f &&
                        logic.getDamage().isDamageable()) {
                    logic.getDamage().takeDamage(1);
                }
            }
        }
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}