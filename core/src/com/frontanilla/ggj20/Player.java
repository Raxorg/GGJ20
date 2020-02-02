package com.frontanilla.ggj20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

class Player {

    private Texture region;
    private Rectangle bounds;
    private Vector2 velocity;

    Player() {
        bounds = new Rectangle();
        velocity = new Vector2();
    }

    Texture getRegion() {
        return region;
    }

    void setRegion(Texture region) {
        this.region = region;
    }

    Rectangle getBounds() {
        return bounds;
    }

    Vector2 getVelocity() {
        return velocity;
    }
}