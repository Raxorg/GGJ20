package com.frontanilla.ggj20;

class Logic {

    private Movement movement;
    // Other
    private Stuff stuff;

    Logic() {
        movement = new Movement();
    }

    void spacePressed() {
        stuff.getPlayer().getVelocity().y = 100f;
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }

    public Movement getMovement() {
        return movement;
    }
}