package com.frontanilla.ggj20;

import com.badlogic.gdx.math.Rectangle;

class Movement {

    private Stuff stuff;

    void update(float delta) {
        stuff.getPlayer().getBounds().x += stuff.getPlayer().getVelocity().x * delta;
        stuff.getPlayer().getBounds().y += stuff.getPlayer().getVelocity().y * delta;
    }

    void move(float x, float y) {
        Rectangle rectangle = stuff.getPlayer().getBounds();
        rectangle.x += x;
        rectangle.y += y;
    }

    void spacePressed() {
        stuff.getPlayer().getVelocity().y = 100f;
    }

    void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}
