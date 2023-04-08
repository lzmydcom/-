package com.yd.structural.decoratorMode.impl;

import com.yd.structural.decoratorMode.Person;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("我是" + name + "...");
    }
}
