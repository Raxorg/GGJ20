package com.frontanilla.ggj20;

class Stuff {

    private Assets assets;

    private Player player;

    void init() {
        player = new Player();
        player.setRegion(assets.getTail());
    }

    Player getPlayer() {
        return player;
    }

    public void setAssets(Assets assets) {
        this.assets = assets;
    }
}