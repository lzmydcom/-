package com.yd.creation.prototypeMode.impl;

import com.yd.creation.prototypeMode.Prototype;

public class Product implements Prototype {
    private int id;

    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public Object Clone() {
        Product product = new Product();
        product.id = this.id;
        product.price = this.price;
        return product;
    }
}
