package com.yd.creation.builderMode.impl;

import com.yd.creation.builderMode.Product;

public class ProductImpl extends Product {
    @Override
    public void show() {
        System.out.println("我是真实产品，我拥有的部件如下：");
        for (String part:parts) {
            System.out.println(part);
        }
    }

    @Override
    public void addParts(String part) {
        parts.add(part);
    }

}
