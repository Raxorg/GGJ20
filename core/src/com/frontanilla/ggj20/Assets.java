package com.frontanilla.ggj20;


import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {

    public Texture hombreloboMutante,
                   indigena,
                   indigenaMutante,
                   LoboMutante;
    public AssetManager assetManager;

    public  Assets(){
        this.assetManager = new AssetManager();
    }

    void loadAssets(){
        //Load Hombre Lobo
        assetManager.load("hombreLoboMutante.png", Texture.class);
        assetManager.load("indigena.png", Texture.class);
        assetManager.load("indigenaMutante.png", Texture.class);
        assetManager.load("LoboMutante.png", Texture.class);

        assetManager.finishLoading();

        //Get Hombre lobo
        hombreloboMutante = assetManager.get("hombreLoboMutante.png", Texture.class);
        indigena = assetManager.get("indigena.png", Texture.class);
        indigenaMutante = assetManager.get("indigenaMutante.png", Texture.class);
        LoboMutante = assetManager.get("LoboMutante.png", Texture.class);
    }

    public Texture getHombreloboMutante() {
        return hombreloboMutante;
    }

    public Texture getIndigena() {
        return indigena;
    }

    public Texture getIndigenaMutante() {
        return indigenaMutante;
    }

    public Texture getLoboMutante() {
        return LoboMutante;
    }
}
