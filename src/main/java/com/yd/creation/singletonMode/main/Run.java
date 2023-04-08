package com.yd.creation.singletonMode.main;

import com.yd.creation.singletonMode.Singleton;

public class Run {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton singleton = Singleton.getInstance();

        instance.setName("张三");
        assert false;
        System.out.println((instance == singleton) && instance.getName().equals(singleton.getName()));
    }
}
