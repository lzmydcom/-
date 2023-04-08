package com.yd.structural.FlyweightMode.main;

import com.yd.structural.FlyweightMode.Piece;
import com.yd.structural.FlyweightMode.impl.PieceFactory;

public class Run {
    public static void main(String[] args) {
        Piece blackPiece = PieceFactory.getBlackPiece();
        blackPiece.draw(4,8);
        Piece whitePiece = PieceFactory.getWhitePiece();
        whitePiece.draw(3,8);
    }
}
