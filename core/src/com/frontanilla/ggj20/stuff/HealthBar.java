package com.frontanilla.ggj20.stuff;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class HealthBar {

    private Texture frame, health;
    private Vector2 position;

    public HealthBar() {
        position = new Vector2();
    }

    public Texture getFrame() {
        return frame;
    }

    public void setFrame(Texture frame) {
        this.frame = frame;
    }

    public Texture getHealth() {
        return health;
    }

    public void setHealth(Texture health) {
        this.health = health;
    }

    public Vector2 getPosition() {
        return position;
    }
}