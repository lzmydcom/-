package com.yd.structural.bridgePattern.impl;

import com.yd.structural.bridgePattern.Product;

public class ProductB extends Product {
    @Override
    public void operation() {
        setName("B");
        color.drawing(name);
    }
}
