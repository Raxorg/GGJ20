package com.frontanilla.ggj20.logic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.frontanilla.ggj20.Input;
import com.frontanilla.ggj20.Stuff;
import com.frontanilla.ggj20.stuff.Player;

public class PlayerMovement {

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

        float backgroundWidth = stuff.getSpaceshipBackground().getBounds().width;
        playerBounds.x = MathUtils.clamp(playerBounds.x, 0f, backgroundWidth - playerBounds.width);
    }

    public void move(float xSpeed, float ySpeed) {
        Rectangle rectangle = stuff.getPlayer().getBounds();
        rectangle.x += xSpeed * Gdx.graphics.getDeltaTime();
        if (xSpeed >= 0) {
            stuff.getPlayer().setFlipped(false);
        } else {
            stuff.getPlayer().setFlipped(true);
        }
        rectangle.y += ySpeed * Gdx.graphics.getDeltaTime();
    }

    public void spacePressed() {
        if (stuff.getPlayer().getBounds().y == 0f) {
            stuff.getPlayer().getVelocity().y = 1400f;
        }
    }

    public void setInput(Input input) {
        this.input = input;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}