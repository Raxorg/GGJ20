package com.frontanilla.ggj20;

import com.badlogic.gdx.math.Rectangle;

class Movement {

    private Input input;
    private Stuff stuff;

    void update(float delta) {
        input.checkKeys();

        Player player = stuff.getPlayer();
        Rectangle playerBounds = player.getBounds();

        playerBounds.x += player.getVelocity().x * delta;
        playerBounds.y += player.getVelocity().y * delta;

        if (playerBounds.y > 0) {
            player.getVelocity().y -= 50f;
        } else {
            player.getVelocity().y = 0;
            playerBounds.y = 0;
        }
    }

    void move(float x, float y) {
        Rectangle rectangle = stuff.getPlayer().getBounds();
        rectangle.x += x;
        rectangle.y += y;
    }

    void spacePressed() {
        if (stuff.getPlayer().getBounds().y == 0f) {
            stuff.getPlayer().getVelocity().y = 1000f;
        }
    }

    void setInput(Input input) {
        this.input = input;
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}