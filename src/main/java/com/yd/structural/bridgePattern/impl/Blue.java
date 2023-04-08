package com.yd.structural.bridgePattern.impl;

import com.yd.structural.bridgePattern.Color;

public class Blue implements Color {
    @Override
    public void drawing(String name) {
        System.out.println("给产品:" + name + "渲染成:蓝色...");
    }
}
