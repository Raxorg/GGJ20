package com.frontanilla.ggj20;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;

public class Input extends InputAdapter {

    private Logic logic;

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Keys.SPACE) {
            logic.getMovement().spacePressed();
        }
        return true;
    }

    public void checkKeys() {
        if (Gdx.input.isKeyPressed(Keys.D)) {
            logic.getMovement().move(10f, 0f);
        }
        if (Gdx.input.isKeyPressed(Keys.A)) {
            logic.getMovement().move(-10f, 0f);
        }
    }

    void setLogic(Logic logic) {
        this.logic = logic;
    }
}