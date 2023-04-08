package com.yd.behavioral.observerPattern.impl;

import com.yd.behavioral.observerPattern.Observer;
import com.yd.behavioral.observerPattern.Subject;

import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observerList;

    private String state = "状态A";

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public void setState(String state){
        this.state = state;
        //修改了目标的状态，需要通知所有观察者
        notifyObservers();
    }

    public String getState() {
        return state;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知所有观察者更新状态
     */
    @Override
    public void notifyObservers() {
        for (Observer observer:observerList){
            observer.update();
        }
    }
}
