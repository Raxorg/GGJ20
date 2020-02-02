package com.frontanilla.ggj20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

class Player {

    private Texture texture;
    private Rectangle bounds;
    private Vector2 velocity;

    Player() {
        bounds = new Rectangle();
        velocity = new Vector2();
    }

    Texture getTexture() {
        return texture;
    }

    void setTexture(Texture texture) {
        this.texture = texture;
    }

    Rectangle getBounds() {
        return bounds;
    }

    Vector2 getVelocity() {
        return velocity;
    }
}