package com.yd.behavioral.observerPattern;

public interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}
