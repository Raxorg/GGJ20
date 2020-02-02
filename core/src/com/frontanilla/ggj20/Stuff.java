package com.frontanilla.ggj20;

import com.frontanilla.ggj20.stuff.HealthBar;
import com.frontanilla.ggj20.stuff.Player;

public class Stuff {

    private Assets assets;
    // Stuff
    private Player player;
    private HealthBar healthBar;

    void init() {
        player = new Player();
        player.setTexture(assets.getIndigena());

        healthBar = new HealthBar();
        healthBar.setFrame(null);
        healthBar.setHealth(null);
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