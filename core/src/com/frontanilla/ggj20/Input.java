package com.frontanilla.ggj20;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

public class Input extends InputAdapter {

    private SpaceshipGame game;

    Input(SpaceshipGame game) {
        this.game = game;
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Keys.SPACE) {

        }
        return true;
    }
}