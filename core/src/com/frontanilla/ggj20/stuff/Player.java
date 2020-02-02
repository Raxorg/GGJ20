package com.frontanilla.ggj20.stuff;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Player {

    private Texture texture;
    private Rectangle bounds;
    private Vector2 velocity;

    public Player() {
        bounds = new Rectangle();
        velocity = new Vector2();
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public Vector2 getVelocity() {
        return velocity;
    }
}