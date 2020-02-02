package com.frontanilla.ggj20.stuff;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class HealthPoint {

    private Texture texture;
    private Rectangle bounds;

    public HealthPoint() {
        bounds = new Rectangle();
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
}