package com.yd.creation.factoryMode.abstractFactory.impl;

import com.yd.creation.factoryMode.abstractFactory.Factory;
import com.yd.creation.factoryMode.abstractFactory.Product;

public class Factory1 implements Factory {
    @Override
    public Product createProductA() {
        return new ProductA1();
    }

    @Override
    public Product createProductB() {
        return new ProductB1();
    }
}
