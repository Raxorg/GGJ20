package com.frontanilla.ggj20;

import com.badlogic.gdx.Game;

public class SpaceshipGame extends Game {

    public void create() {
        Stuff stuff = new Stuff();
        Screen screen = new Screen();

        stuff.init();
        screen.setStuff(stuff);

        setScreen(screen);
    }
}