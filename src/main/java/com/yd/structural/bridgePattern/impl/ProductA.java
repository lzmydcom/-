package com.yd.structural.bridgePattern.impl;


import com.yd.structural.bridgePattern.Product;

public class ProductA extends Product {
    @Override
    public void operation() {
        setName("A");
        color.drawing(name);
    }
}
