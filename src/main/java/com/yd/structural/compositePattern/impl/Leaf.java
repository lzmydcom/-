package com.yd.structural.compositePattern.impl;

import com.yd.structural.compositePattern.Component;

public class Leaf implements Component {
    private String name;

    public Leaf(){}
    public Leaf(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        System.out.println(name);
    }
}