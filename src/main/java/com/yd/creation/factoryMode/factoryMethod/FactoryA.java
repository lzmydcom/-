package com.yd.creation.factoryMode.factoryMethod;


public class FactoryA extends AbstractFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
