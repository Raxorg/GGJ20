package com.frontanilla.ggj20;

import com.badlogic.gdx.ScreenAdapter;

public class Screen extends ScreenAdapter {

    private Stuff stuff;

    @Override
    public void render(float delta) {
        update(delta);
        drawFrame();
    }

    private void update(float delta) {

    }

    private void drawFrame() {

    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}