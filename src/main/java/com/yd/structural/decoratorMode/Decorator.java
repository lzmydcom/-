package com.yd.structural.decoratorMode;

public abstract class Decorator implements Component {
    protected Person person;

    public Decorator(Person person) {
        this.person = person;
    }
}
