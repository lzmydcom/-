package com.yd.creation.factoryMode.factoryMethod;


public class FactoryB extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
