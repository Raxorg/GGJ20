package com.frontanilla.ggj20;

import com.badlogic.gdx.graphics.Texture;

import java.util.ArrayList;

class Stuff {

    private Assets assets;

    private Player player;

    void init() {
        player = new Player();

        ArrayList<Texture> wolfRegions = new ArrayList<>();
        wolfRegions.add(assets.getArmR());
        wolfRegions.add(assets.getArmL());
        wolfRegions.add(assets.getForearmR());
        wolfRegions.add(assets.getForearmL());
        wolfRegions.add(assets.getHead());
        wolfRegions.add(assets.getTail());
        wolfRegions.add(assets.getBody());
        wolfRegions.add(assets.getThightR());
        wolfRegions.add(assets.getThighL());
        wolfRegions.add(assets.getLegR());
        wolfRegions.add(assets.getLegL());

        player.setTextures(wolfRegions);
    }

    Player getPlayer() {
        return player;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }
}