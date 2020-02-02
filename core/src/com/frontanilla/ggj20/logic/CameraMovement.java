package com.frontanilla.ggj20.logic;

import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.frontanilla.ggj20.Screen;
import com.frontanilla.ggj20.Stuff;

import static com.frontanilla.ggj20.Constants.CAMERA_WIDTH;

public class CameraMovement {

    private Screen screen;
    private Stuff stuff;

    public void update() {
        Vector3 position = screen.getCamera().position;
        position.x = stuff.getPlayer().getBounds().x;
        float backgroundWidth = stuff.getSpaceshipBackground().getBounds().width;
        position.x = MathUtils.clamp(
                screen.getCamera().position.x,
                CAMERA_WIDTH / 2f,
                backgroundWidth - CAMERA_WIDTH / 2f);
        screen.getCamera().update();
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}