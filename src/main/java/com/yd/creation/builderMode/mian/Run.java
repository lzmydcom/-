package com.yd.creation.builderMode.mian;

import com.yd.creation.builderMode.Builder;
import com.yd.creation.builderMode.Product;
import com.yd.creation.builderMode.impl.ProductBuilder;

public class Run {
    public static void main(String[] args) {
        //执行不同的策略，生产出的产品不一样
        //一个生成器对应一个产品，通过不同的生成策略来生成不同的产品
        Builder builder = new ProductBuilder();
        //不指定装配策略时，使用默认装配来生产产品
        builder.builderParts();

        Product product = builder.getProduct();
        product.show();

        //指定装配策略
        builder.setStrategy((product1 -> {
            product1.addParts("partA");
            product1.addParts("partD");
        }));
        //使用指定装配策略来生产产品
        builder.builderParts();
        product.show();
    }
}
