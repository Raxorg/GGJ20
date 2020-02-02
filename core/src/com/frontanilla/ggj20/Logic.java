package com.frontanilla.ggj20;

import com.frontanilla.ggj20.logic.Collision;
import com.frontanilla.ggj20.logic.Health;
import com.frontanilla.ggj20.logic.Movement;

class Logic {

    private Collision collision;
    private Health health;
    private Movement movement;

    Logic() {
        collision = new Collision();
        health = new Health();
        movement = new Movement();
    }

    void update(float delta) {
        collision.update(delta);
        health.update(delta);
        movement.update(delta);
    }

    void setInput(Input input) {
        movement.setInput(input);
    }

    void setStuff(Stuff stuff) {
        collision.setStuff(stuff);
        movement.setStuff(stuff);
    }

    Movement getMovement() {
        return movement;
    }
}