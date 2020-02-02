package com.frontanilla.ggj20;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Screen extends ScreenAdapter {

    private Logic logic;
    private Stuff stuff;
    // Rendering
    private SpriteBatch batch;

    Screen() {
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {
        logic.update(delta);
        drawFrame();
    }

    private void drawFrame() {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();

        batch.draw(
                stuff.getPlayer().getRegion(),
                stuff.getPlayer().getBounds().x,
                stuff.getPlayer().getBounds().y);

        batch.end();
    }

    public void setLogic(Logic logic) {
        this.logic = logic;
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}