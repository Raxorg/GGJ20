package com.frontanilla.ggj20;


import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {

    public Texture  //Enemies
                    hombreloboMutante,
                   indigena,
                   lanzaIndigena,
                   indigenaMutante,
                   LoboMutante,
                    //Player
                   playerMale,
                   playerFemale,
                    arma1,
                    arma2,
                    arma3,
                    arma4,
                    playerBag, //Dar la vuelta
                    playerJetpack, //Dar la vuelta
                    //HUD
                    hp;

    public AssetManager assetManager;

    public  Assets(){
        this.assetManager = new AssetManager();
    }

    void loadAssets(){
        //Load Enemies
        assetManager.load("hombreLoboMutante.png", Texture.class);
        assetManager.load("indigena.png", Texture.class);
        assetManager.load("lanza.png", Texture.class);
        assetManager.load("indigenaMutante.png", Texture.class);
        assetManager.load("LoboMutante.png", Texture.class);
        //Load Player
        assetManager.load("E_Bag.png", Texture.class);
        assetManager.load("E_Jetpack.png", Texture.class);
        assetManager.load("M_Spear.png", Texture.class);
        assetManager.load("M_Sword.png", Texture.class);
        assetManager.load("M_Sword2.png", Texture.class);
        assetManager.load("M_Sword3.png", Texture.class);
        assetManager.load("PlayerFemale.png", Texture.class);
        assetManager.load("PlayerMale.png", Texture.class);
        //Load Hud
        assetManager.load("health.png", Texture.class);


        assetManager.finishLoading();

        //Get Enemigos
        hombreloboMutante = assetManager.get("hombreLoboMutante.png", Texture.class);
        indigena = assetManager.get("indigena.png", Texture.class);
        lanzaIndigena = assetManager.get("lanza.png", Texture.class);
        indigenaMutante = assetManager.get("indigenaMutante.png", Texture.class);
        LoboMutante = assetManager.get("LoboMutante.png", Texture.class);
        //Get Jugador
        playerMale = assetManager.get("PlayerMale.png", Texture.class);
        playerFemale = assetManager.get("PlayerFemale.png", Texture.class);
        arma1 = assetManager.get("M_Spear.png", Texture.class);
        arma2 = assetManager.get("M_Sword.png", Texture.class);
        arma3 = assetManager.get("M_Sword2", Texture.class);
        arma4 = assetManager.get("M_Sword3", Texture.class);
        playerBag = assetManager.get("E_Bag.png", Texture.class);
        playerJetpack = assetManager.get("E_Jetpack.png", Texture.class);
        //Get hud
        hp = assetManager.get("health.png", Texture.class);
    }

    public Texture getHombreloboMutante() {
        return hombreloboMutante;
    }

    public Texture getIndigena() {
        return indigena;
    }

    public Texture getLanzaIndigena() {
        return lanzaIndigena;
    }

    public Texture getIndigenaMutante() {
        return indigenaMutante;
    }

    public Texture getLoboMutante() {
        return LoboMutante;
    }

    public Texture getPlayerMale() {
        return playerMale;
    }

    public Texture getPlayerFemale() {
        return playerFemale;
    }

    public Texture getArma1() {
        return arma1;
    }

    public Texture getArma2() {
        return arma2;
    }

    public Texture getArma3() {
        return arma3;
    }

    public Texture getArma4() {
        return arma4;
    }

    public Texture getPlayerBag() {
        return playerBag;
    }

    public Texture getPlayerJetpack() {
        return playerJetpack;
    }

    //get HUD


    public Texture getHp() {
        return hp;
    }
}
