package com.frontanilla.ggj20;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

class Stuff {

    private Player player;

    void init() {
        player = new Player(new TextureRegion(new Texture("badlogic.jpg")));
    }

    Player getPlayer() {
        return player;
    }
}