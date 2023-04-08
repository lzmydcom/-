package com.yd.creation.factoryMode.simpleFactory.main;

import com.yd.creation.factoryMode.simpleFactory.Product;
import com.yd.creation.factoryMode.simpleFactory.Factory;

public class Run {
    public static void main(String[] args) {
        //将创建对象的事交给factory去做
        Product product = Factory.createProduct("A");
        if (product != null) {
            product.info();
        }
        product = Factory.createProduct("B");
        if (product != null) {
            product.info();
        }
    }
}
