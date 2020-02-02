package com.frontanilla.ggj20;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

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

        drawPlayer();
        drawHealthBar();

        batch.end();
    }

    private void drawPlayer() {
        batch.draw(
                stuff.getPlayer().getTexture(),
                stuff.getPlayer().getBounds().x,
                stuff.getPlayer().getBounds().y);
    }

    private void drawHealthBar() {
        Rectangle bounds;
        for (int i = 0; i < stuff.getHealthPoints().size; i++) {
            bounds = stuff.getHealthPoints().get(i).getBounds();
            batch.draw(
                    stuff.getHealthPoints().get(i).getTexture(),
                    bounds.x, bounds.y,
                    bounds.width, bounds.height);
        }
    }

    void setLogic(Logic logic) {
        this.logic = logic;
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}