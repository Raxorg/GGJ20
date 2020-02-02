package com.frontanilla.ggj20;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class SpaceshipGame extends Game {

    public void create() {
        Logic logic = new Logic();
        Stuff stuff = new Stuff();
        Screen screen = new Screen();

        logic.setStuff(stuff);
        screen.setStuff(stuff);

        stuff.init();

        setScreen(screen);

        Gdx.input.setInputProcessor(new Input(this));
    }
}