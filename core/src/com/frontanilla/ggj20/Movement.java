package com.frontanilla.ggj20;

import com.badlogic.gdx.math.Rectangle;

public class Movement {

    private Stuff stuff;

    public void move(float x, float y){
        Rectangle rectangle = stuff.getPlayer().getBounds();
        rectangle.x += x;
        rectangle.y += y;
    }

    void spacePressed() {

    }

    public void setStuff(Stuff stuff) {
        this.stuff = stuff;
    }
}
