package com.frontanilla.ggj20;

class Logic {

    private Movement movement;

    Logic() {
        movement = new Movement();
    }

    void setStuff(Stuff stuff) {
        movement.setStuff(stuff);
    }

    public Movement getMovement() {
        return movement;
    }
}