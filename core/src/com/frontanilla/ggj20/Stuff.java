package com.frontanilla.ggj20;

class Stuff {

    private Assets assets;
    // Stuff
    private Player player;

    void init() {
        player = new Player();
        player.setTexture(assets.getArmL());
    }

    void setAssets(Assets assets) {
        this.assets = assets;
    }

    // Stuff getters

    Player getPlayer() {
        return player;
    }
}