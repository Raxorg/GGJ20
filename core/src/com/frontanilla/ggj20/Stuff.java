package com.frontanilla.ggj20;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.frontanilla.ggj20.stuff.HealthPoint;
import com.frontanilla.ggj20.stuff.Player;

public class Stuff {

    private Assets assets;
    // Stuff
    private Player player;
    private DelayedRemovalArray<HealthPoint> healthPoints;

    void init() {
        player = new Player();
        player.setTexture(assets.getIndigena());

        healthPoints = new DelayedRemovalArray<>();

        HealthPoint hp1 = new HealthPoint();
        hp1.setTexture(assets.getIndigenaMutante());
        hp1.getBounds().set(0, Gdx.graphics.getHeight() - 100f, 100f, 100f);
        healthPoints.add(hp1);
    }

    void setAssets(Assets assets) {
        this.assets = assets;
    }

    // Stuff getters

    public Player getPlayer() {
        return player;
    }

    public DelayedRemovalArray<HealthPoint> getHealthPoints() {
        return healthPoints;
    }
}