package com.frontanilla.ggj20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import java.util.ArrayList;

class Player {

    private ArrayList<Texture> textures;
    private Rectangle bounds;
    private Vector2 velocity;

    Player() {
        bounds = new Rectangle();
        velocity = new Vector2();
    }

    ArrayList<Texture> getTextures() {
        return textures;
    }

    void setTextures(ArrayList<Texture> textures) {
        this.textures = textures;
    }

    Rectangle getBounds() {
        return bounds;
    }

    Vector2 getVelocity() {
        return velocity;
    }
}