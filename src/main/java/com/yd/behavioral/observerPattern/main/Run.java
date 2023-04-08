package com.yd.behavioral.observerPattern.main;

import com.yd.behavioral.observerPattern.Observer;
import com.yd.behavioral.observerPattern.impl.ConcreteObserverA;
import com.yd.behavioral.observerPattern.impl.ConcreteObserverB;
import com.yd.behavioral.observerPattern.impl.ConcreteObserverC;
import com.yd.behavioral.observerPattern.impl.ConcreteSubject;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        ConcreteSubject target = new ConcreteSubject();

        //给目标附加观察者
        List<Observer> observerList = new ArrayList<>();
        observerList.add(new ConcreteObserverA());
        observerList.add(new ConcreteObserverB());
        observerList.add(new ConcreteObserverC());
        target.setObserverList(observerList);

        System.out.println("当前目标状态是：" + target.getState());
        target.setState("状态B");

        System.out.println("当前目标状态为："  + target.getState());
    }
}
