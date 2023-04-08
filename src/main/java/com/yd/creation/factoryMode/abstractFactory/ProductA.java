package com.yd.creation.factoryMode.abstractFactory;

public abstract class ProductA implements Product{
    @Override
    public void info() {
        infoA();
    }
    public abstract void infoA();
}
