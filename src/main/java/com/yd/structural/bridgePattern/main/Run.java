package com.yd.structural.bridgePattern.main;

import com.yd.structural.bridgePattern.Product;
import com.yd.structural.bridgePattern.impl.Blue;
import com.yd.structural.bridgePattern.impl.ProductA;
import com.yd.structural.bridgePattern.impl.ProductB;
import com.yd.structural.bridgePattern.impl.Red;

public class Run {
    public static void main(String[] args) {
        Product A = new ProductA();
        A.setColor(new Red());
        A.operation();

        Product B = new ProductB();
        B.setColor(new Blue());
        B.operation();
    }
}
