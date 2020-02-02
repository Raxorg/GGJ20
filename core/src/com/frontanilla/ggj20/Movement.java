package com.frontanilla.ggj20;

import com.badlogic.gdx.math.Rectangle;

public class Movement {

    public Rectangle rectangle;

    public void Create(){

    }

    public void move(Rectangle rectangle, float x, float y){
        rectangle.x += x;
        rectangle.y += y;
    }

}
