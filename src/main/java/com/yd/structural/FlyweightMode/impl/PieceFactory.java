package com.yd.structural.FlyweightMode.impl;

import com.yd.structural.FlyweightMode.Piece;

import java.util.ArrayList;
import java.util.List;

public class PieceFactory {
    private static final List<Piece> pieces = new ArrayList<>(2);;
    static {
        pieces.add(new BlackPiece());
        pieces.add(new WhitePiece());
    }

    public static Piece getBlackPiece(){
        return pieces.get(0);
    }
    public static Piece getWhitePiece(){
        return pieces.get(1);
    }

}
