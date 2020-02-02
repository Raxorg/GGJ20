package com.frontanilla.ggj20.logic;

import com.badlogic.gdx.math.Rectangle;
import com.frontanilla.ggj20.Input;
import com.frontanilla.ggj20.stuff.Player;
import com.frontanilla.ggj20.Stuff;

public class Movement {

    private Input input;
    private Stuff stuff;

    public void update(float delta) {
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

    public void move(float x, float y) {
        Rectangle rectangle = stuff.getPlayer().getBounds();
        rectangle.x += x;
        rectangle.y += y;
    }

    public void spacePressed() {
        if (stuff.getPlayer().getBounds().y == 0f) {
            stuff.getPlayer().getVelocity().y = 1000f;
        }
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}