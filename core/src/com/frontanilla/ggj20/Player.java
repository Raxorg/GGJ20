package com.frontanilla.ggj20;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;

class Player {

    private TextureRegion region;
    private Rectangle bounds;

    Player(TextureRegion region) {
        this.region = region;
        bounds = new Rectangle();
    }

    TextureRegion getRegion() {
        return region;
    }

    Rectangle getBounds() {
        return bounds;
    }
}