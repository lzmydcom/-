package com.yd.creation.singletonMode;

public class Singleton {
    //私有化构造器
    private Singleton(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static final Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}
