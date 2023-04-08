package com.yd.creation.factoryMode.abstractFactory.main;

import com.yd.creation.factoryMode.abstractFactory.Factory;
import com.yd.creation.factoryMode.abstractFactory.Product;
import com.yd.creation.factoryMode.abstractFactory.impl.Factory1;
import com.yd.creation.factoryMode.abstractFactory.impl.Factory2;

public class Run {
    public static void main(String[] args) {
        Factory factory;

        factory= new Factory1();
        Product productA1 = factory.createProductA();
        Product productB1 = factory.createProductB();
        productA1.info();
        productB1.info();

        factory = new Factory2();
        Product productA2 = factory.createProductA();
        Product productB2 = factory.createProductB();
        productA2.info();
        productB2.info();
    }
}
