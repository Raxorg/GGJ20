package com.frontanilla.ggj20;

import com.badlogic.gdx.utils.DelayedRemovalArray;
import com.frontanilla.ggj20.stuff.HealthBar;
import com.frontanilla.ggj20.stuff.MutantWolf;
import com.frontanilla.ggj20.stuff.Player;
import com.frontanilla.ggj20.stuff.SpaceshipBackground;

import static com.frontanilla.ggj20.Constants.CAMERA_HEIGHT;
import static com.frontanilla.ggj20.Constants.LIVE_SIZE;

public class Stuff {

    private Assets assets;
    // Stuff
    private SpaceshipBackground background;
    private Player player;
    private HealthBar healthBar;

    private DelayedRemovalArray<MutantWolf> mutantWolves;

    void init() {
        background = new SpaceshipBackground();
        background.setTexture(assets.getSpaceship());
        float ratio = 8000f / 1080f;
        float h = 1000f;
        float w = h * ratio;
        background.getBounds().setSize(w, h);

        player = new Player();
        player.setTexture(assets.getPlayerMale());
        player.getBounds().setSize(121f * 0.75f, 416f * 0.75f);

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

    public SpaceshipBackground getSpaceshipBackground() {
        return background;
    }

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