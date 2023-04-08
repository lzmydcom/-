package com.yd.creation.prototypeMode.main;

import com.yd.creation.prototypeMode.impl.Product;

public class Run {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1001);
        product.setPrice(9.9);
        System.out.println(product);
        Product clone = (Product) product.Clone();
        System.out.println("被克隆出来的对象:" + clone);
    }
}
