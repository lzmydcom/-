package com.yd.structural.FlyweightMode.impl;

import com.yd.structural.FlyweightMode.Piece;

public class BlackPiece extends Piece {

    public BlackPiece() {
        super("黑色");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(color + "的棋子下在了" + x + "," + y + "的位置");
    }
}
