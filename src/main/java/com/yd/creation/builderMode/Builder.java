package com.yd.creation.builderMode;

import com.yd.creation.builderMode.impl.ProductImpl;

public abstract class Builder {
    protected Product product = new ProductImpl();
    protected Strategy strategy = new Strategy() {
        @Override
        public void handle(Product product) {
            product.addParts("partA");
            product.addParts("partB");
            product.addParts("partC");
            product.addParts("partD");
        }
    };
    public abstract void setStrategy(Strategy strategy);
    public abstract void builderParts();
    public abstract Product getProduct();
}
