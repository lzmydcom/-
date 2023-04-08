package com.yd.behavioral.observerPattern.impl;

import com.yd.behavioral.observerPattern.Observer;

public class ConcreteObserverC implements Observer {
    @Override
    public void update() {
        System.out.println("更新了观察者C");
    }
}
