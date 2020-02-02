package com.frontanilla.ggj20;


import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {

    public Texture tail, armR, armL, forearmR, forearmL, head, body, thightR, thighL, legR, legL;

    public AssetManager assetManager;

    public  Assets(){
        this.assetManager = new AssetManager();
    }

    void loadAssets(){
        //Load Hombre Lobo
        assetManager.load("hombreLobo/cola.png", Texture.class);
        assetManager.load("hombreLobo/antebrazoD.png", Texture.class);
        assetManager.load("hombreLobo/antebrazoI.png", Texture.class);
        assetManager.load("hombreLobo/brazoD.png", Texture.class);
        assetManager.load("hombreLobo/brazoI.png", Texture.class);
        assetManager.load("hombreLobo/cabeza.png", Texture.class);
        assetManager.load("hombreLobo/cuerpo.png", Texture.class);
        assetManager.load("hombreLobo/musloD.png", Texture.class);
        assetManager.load("hombreLobo/musloI.png", Texture.class);
        assetManager.load("hombreLobo/piernaD.png", Texture.class);
        assetManager.load("hombreLobo/piernaI.png", Texture.class);

        assetManager.finishLoading();

        //Get Hombre lobo
        tail = assetManager.get("hombreLobo/cola.png", Texture.class);
        armR = assetManager.get("hombreLobo/antebrazoD.png", Texture.class);
        armL = assetManager.get("hombreLobo/antebrazoI.png", Texture.class);
        forearmR = assetManager.get("hombreLobo/brazoD.png", Texture.class);
        forearmL = assetManager.get("hombreLobo/brazoI.png", Texture.class);
        head = assetManager.get("hombreLobo/cabeza.png", Texture.class);
        body = assetManager.get("hombreLobo/cuerpo.png", Texture.class);
        thightR = assetManager.get("hombreLobo/musloD.png", Texture.class);
        thighL = assetManager.get("hombreLobo/musloI.png", Texture.class);
        legR = assetManager.get("hombreLobo/piernaD.png", Texture.class);
        legL = assetManager.get("hombreLobo/piernaI.png", Texture.class);


    }

    //getter Hombre Lobo
    public Texture getTail() {
        return tail;
    }

    public Texture getArmR() {
        return armR;
    }

    public Texture getArmL() {
        return armL;
    }

    public Texture getForearmR() {
        return forearmR;
    }

    public Texture getForearmL() {
        return forearmL;
    }

    public Texture getHead() {
        return head;
    }

    public Texture getBody() {
        return body;
    }

    public Texture getThightR() {
        return thightR;
    }

    public Texture getThighL() {
        return thighL;
    }

    public Texture getLegR() {
        return legR;
    }

    public Texture getLegL() {
        return legL;
    }
}
