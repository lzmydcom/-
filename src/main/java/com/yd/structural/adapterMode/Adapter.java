package com.yd.structural.adapterMode;

public class Adapter extends USB{
    private final TypeC typeC = new TypeC();
    @Override
    public void request() {
        typeC.specialRequest();
    }
}
