package com.frontanilla.ggj20;

import com.badlogic.gdx.Gdx;
import com.frontanilla.ggj20.stuff.HealthBar;
import com.frontanilla.ggj20.stuff.Player;

import static com.frontanilla.ggj20.Constants.LIVE_SIZE;

public class Stuff {

    private Assets assets;
    // Stuff
    private Player player;
    private HealthBar healthBar;

    void init() {
        player = new Player();
        player.setTexture(assets.getIndigena());

        healthBar = new HealthBar();
        healthBar.setTexture(assets.getIndigena()); // TODO: Get health
        healthBar.getPosition().set(0, Gdx.graphics.getHeight() - LIVE_SIZE);
        healthBar.setLives(3);
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
}