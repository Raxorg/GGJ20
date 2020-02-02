package com.frontanilla.ggj20;

import com.frontanilla.ggj20.logic.Attack;
import com.frontanilla.ggj20.logic.Collision;
import com.frontanilla.ggj20.logic.Damage;
import com.frontanilla.ggj20.logic.EnemyController;
import com.frontanilla.ggj20.logic.Movement;
import com.frontanilla.ggj20.logic.Poison;

public class Logic {

    private Attack attack;
    private Collision collision;
    private Damage damage;
    private EnemyController enemyController;
    private Movement movement;
    private Poison poison;

    Logic() {
        attack = new Attack();
        collision = new Collision();
        damage = new Damage();
        enemyController = new EnemyController();
        movement = new Movement();
        poison = new Poison();

        enemyController.setLogic(this);
    }

    void init() {
        enemyController.init();
    }

    void update(float delta) {
        collision.update(delta);
        enemyController.update(delta);
        movement.update(delta);
        poison.update(delta);
    }

    void setInput(Input input) {
        movement.setInput(input);
    }

    void setStuff(Stuff stuff) {
        collision.setStuff(stuff);
        damage.setStuff(stuff);
        enemyController.setStuff(stuff);
        movement.setStuff(stuff);
        poison.setStuff(stuff);
    }

    Attack getAttack() {
        return attack;
    }

    public Damage getDamage() {
        return damage;
    }

    Movement getMovement() {
        return movement;
    }
}