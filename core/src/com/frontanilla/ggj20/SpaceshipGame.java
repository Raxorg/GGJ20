package com.frontanilla.ggj20;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

public class SpaceshipGame extends Game {

    @Override
    public void create() {
        Assets assets = new Assets();
        Logic logic = new Logic();
        Input input = new Input();
        Screen screen = new Screen();
        Stuff stuff = new Stuff();

        assets.loadAssets();

        logic.setInput(input);
        logic.setStuff(stuff);

        input.setLogic(logic);
        input.setScreen(screen);

        screen.setLogic(logic);
        screen.setStuff(stuff);

        stuff.setAssets(assets);

        input.init();
        stuff.init();
        logic.init();

        setScreen(screen);
    }
}