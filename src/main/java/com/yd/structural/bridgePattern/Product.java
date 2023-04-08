package com.yd.structural.bridgePattern;

public abstract class Product {

    protected String name;
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void operation();
}
