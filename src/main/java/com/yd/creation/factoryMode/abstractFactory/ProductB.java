package com.yd.creation.factoryMode.abstractFactory;

public abstract class ProductB implements Product{

    @Override
    public void info() {
        infoB();
    }

    public abstract void infoB();
}
