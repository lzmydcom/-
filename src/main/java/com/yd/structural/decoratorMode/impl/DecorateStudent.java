package com.yd.structural.decoratorMode.impl;

import com.yd.structural.decoratorMode.Decorator;
import com.yd.structural.decoratorMode.Person;

public class DecorateStudent extends Decorator {
    public DecorateStudent(Person person) {
        super(person);
    }

    @Override
    public void operation() {
        person.operation();
        System.out.println("我的职责要学习...");
    }
}
