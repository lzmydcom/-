package com.yd.creation.builderMode.impl;

import com.yd.creation.builderMode.Builder;
import com.yd.creation.builderMode.Strategy;
import com.yd.creation.builderMode.Product;

public class ProductBuilder extends Builder {
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    @Override
    public void builderParts() {
        strategy.handle(product);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
