package com.frontanilla.ggj20;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

class Player {

    private TextureRegion region;
    private Rectangle bounds;
    private Vector2 velocity;

    Player(TextureRegion region) {
        this.region = region;
        bounds = new Rectangle();
        velocity = new Vector2();
    }

    TextureRegion getRegion() {
        return region;
    }

    Rectangle getBounds() {
        return bounds;
    }

    public Vector2 getVelocity() {
        return velocity;
    }
}