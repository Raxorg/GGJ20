package com.frontanilla.ggj20;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector3;

public class Input extends InputAdapter {

    private Logic logic;
    private Screen screen;
    // Input
    private Vector3 unprojected;

    void init() {
        unprojected = new Vector3();
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (pointer != 0) {
            return false;
        }
        unprojected.set(screen.getCamera().unproject(new Vector3(screenX, screenY, 0f)));
        logic.getAttack().attackButtonPressed();
        return true;
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Keys.SPACE) {
            logic.getPlayerMovement().spacePressed();
        }
        return true;
    }

    public void checkKeys() {
        if (Gdx.input.isKeyPressed(Keys.D)) {
            logic.getPlayerMovement().move(400f, 0f);
        }
        if (Gdx.input.isKeyPressed(Keys.A)) {
            logic.getPlayerMovement().move(-400f, 0f);
        }
    }

    void setLogic(Logic logic) {
        this.logic = logic;
    }

    void setScreen(Screen screen) {
        this.screen = screen;
    }
}