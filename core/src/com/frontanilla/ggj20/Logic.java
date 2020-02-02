package com.frontanilla.ggj20;

import com.frontanilla.ggj20.logic.Health;
import com.frontanilla.ggj20.logic.Movement;

class Logic {

    private Health health;
    private Movement movement;

    Logic() {
        health = new Health();
        movement = new Movement();
    }

    void update(float delta) {
        health.update(delta);
        movement.update(delta);
    }

    void setInput(Input input) {
        movement.setInput(input);
    }

    void setStuff(Stuff stuff) {
        movement.setStuff(stuff);
    }

    Movement getMovement() {
        return movement;
    }
}