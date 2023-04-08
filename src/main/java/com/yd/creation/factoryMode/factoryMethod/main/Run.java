package com.yd.creation.factoryMode.factoryMethod.main;

import com.yd.creation.factoryMode.factoryMethod.AbstractFactory;
import com.yd.creation.factoryMode.factoryMethod.FactoryA;
import com.yd.creation.factoryMode.factoryMethod.FactoryB;
import com.yd.creation.factoryMode.factoryMethod.Product;

public class Run {
    public static void main(String[] args){
        AbstractFactory factory;
        Product product;

        factory = new FactoryA();
        product = factory.createProduct();
        product.info();

        factory = new FactoryB();
        product = factory.createProduct();
        product.info();

    }
}
