package com.frontanilla.ggj20;

import com.frontanilla.ggj20.logic.Attack;
import com.frontanilla.ggj20.logic.CameraMovement;
import com.frontanilla.ggj20.logic.Collision;
import com.frontanilla.ggj20.logic.Damage;
import com.frontanilla.ggj20.logic.EnemyController;
import com.frontanilla.ggj20.logic.GameAudio;
import com.frontanilla.ggj20.logic.PlayerMovement;
import com.frontanilla.ggj20.logic.Poison;

public class Logic {

    private Attack attack;
    private CameraMovement cameraMovement;
    private Collision collision;
    private Damage damage;
    private EnemyController enemyController;
    private GameAudio gameAudio;
    private PlayerMovement playerMovement;
    private Poison poison;

    Logic() {
        attack = new Attack();
        cameraMovement = new CameraMovement();
        collision = new Collision();
        damage = new Damage();
        enemyController = new EnemyController();
        gameAudio = new GameAudio();
        playerMovement = new PlayerMovement();
        poison = new Poison();

        enemyController.setLogic(this);
    }

    void init() {
        gameAudio.init();
    }

    void update(float delta) {
        cameraMovement.update();
        collision.update(delta);
        damage.update(delta);
        enemyController.update(delta);
        playerMovement.update(delta);
        poison.update(delta);
    }

    void setAssets(Assets assets) {
        gameAudio.setAssets(assets);
    }

    void setInput(Input input) {
        playerMovement.setInput(input);
    }

    void setScreen(Screen screen) {
        cameraMovement.setScreen(screen);
    }

    void setStuff(Stuff stuff) {
        cameraMovement.setStuff(stuff);
        collision.setStuff(stuff);
        damage.setStuff(stuff);
        enemyController.setStuff(stuff);
        playerMovement.setStuff(stuff);
        poison.setStuff(stuff);
    }

    Attack getAttack() {
        return attack;
    }

    public Damage getDamage() {
        return damage;
    }

    PlayerMovement getPlayerMovement() {
        return playerMovement;
    }
}