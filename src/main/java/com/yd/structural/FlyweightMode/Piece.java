package com.yd.structural.FlyweightMode;

public abstract class Piece {
    protected String color;
    public Piece(String color) {
        this.color = color;
    }

    public abstract void draw(int x, int y);
}
