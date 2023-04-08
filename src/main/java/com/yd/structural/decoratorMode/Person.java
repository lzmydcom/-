package com.yd.structural.decoratorMode;

public abstract class Person implements Component{
    protected String name;

    public Person(String name) {
        this.name = name;
    }
}
