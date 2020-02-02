package com.frontanilla.ggj20;

class Logic {

    private Movement movement;

    Logic() {
        movement = new Movement();
    }

    void update(float delta) {
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