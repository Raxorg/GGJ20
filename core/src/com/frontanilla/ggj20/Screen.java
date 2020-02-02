package com.frontanilla.ggj20;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import static com.frontanilla.ggj20.Constants.CAMERA_HEIGHT;
import static com.frontanilla.ggj20.Constants.CAMERA_WIDTH;
import static com.frontanilla.ggj20.Constants.LIVE_SIZE;

public class Screen extends ScreenAdapter {

    private Logic logic;
    private Stuff stuff;
    // Rendering
    private OrthographicCamera camera;
    private SpriteBatch batch;

    Screen() {
        camera = new OrthographicCamera();
        camera.setToOrtho(false, CAMERA_WIDTH, CAMERA_HEIGHT);
        batch = new SpriteBatch();
    }

    @Override
    public void render(float delta) {
        logic.update(delta);
        drawFrame();
    }

    private void drawFrame() {
        // Clear previous frame
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        // Use camera
        batch.setProjectionMatrix(camera.combined);
        // Draw current frame
        batch.begin();

        drawPlayer();
        drawHealthBar();
        drawMutantWolves();

        batch.end();
    }

    private void drawPlayer() {
        batch.draw(
                stuff.getPlayer().getTexture(),
                stuff.getPlayer().getBounds().x,
                stuff.getPlayer().getBounds().y);
    }

    private void drawHealthBar() {
        Vector2 position = stuff.getHealthBar().getPosition();
        for (int i = 0; i < stuff.getHealthBar().getLives(); i++) {
            batch.draw(
                    stuff.getHealthBar().getTexture(),
                    position.x + LIVE_SIZE * i, position.y,
                    LIVE_SIZE, LIVE_SIZE);
        }
    }

    private void drawMutantWolves() {
        Rectangle bounds;
        for (int i = 0; i < stuff.getMutantWolves().size; i++) {
            bounds = stuff.getMutantWolves().get(i).getBounds();
            batch.draw(
                    stuff.getMutantWolves().get(i).getTexture(),
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