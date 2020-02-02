package com.frontanilla.ggj20.logic;

import com.frontanilla.ggj20.Assets;

public class GameAudio {

    private Assets assets;

    public void init() {
        assets.getWeird().setLooping(true);
        assets.getWeird().play();
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }
}