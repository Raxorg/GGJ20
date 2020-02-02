package com.frontanilla.ggj20;

import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.frontanilla.ggj20.stuff.HealthBar;
import com.frontanilla.ggj20.stuff.MutantWolf;
import com.frontanilla.ggj20.stuff.Player;

import static com.frontanilla.ggj20.Constants.CAMERA_HEIGHT;
import static com.frontanilla.ggj20.Constants.LIVE_SIZE;

public class Stuff {

    private Assets assets;
    // Stuff
    private Player player;
    private HealthBar healthBar;

    private DelayedRemovalArray<MutantWolf> mutantWolves;

    void init() {
        player = new Player();
        player.setTexture(assets.getPlayerMale());
        player.getBounds().setSize(121f / 2f, 416f / 2f);

        healthBar = new HealthBar();
        healthBar.setTexture(assets.getHp());
        healthBar.getPosition().set(0, CAMERA_HEIGHT - LIVE_SIZE);
        healthBar.setLives(3);

        mutantWolves = new DelayedRemovalArray<>();
        MutantWolf mutantWolf = new MutantWolf();
        mutantWolf.setTexture(assets.getMutantWolf());
        mutantWolf.getBounds().set(700f, 0f, 333f / 2f, 293f / 2f);
        mutantWolves.add(mutantWolf);
    }

    void setAssets(Assets assets) {
        this.assets = assets;
    }

    // Stuff getters

    public Player getPlayer() {
        return player;
    }

    public HealthBar getHealthBar() {
        return healthBar;
    }

    public DelayedRemovalArray<MutantWolf> getMutantWolves() {
        return mutantWolves;
    }
}