package com.yd.behavioral.statePattern.impl;

import com.yd.behavioral.statePattern.State;

public class StateFactory {
    private static final State stateA = new ConcreteStateA();
    private static final State stateB = new ConcreteStateB();

    public static State getStateA() {
        return stateA;
    }
    public static State getStateB() {
        return stateB;
    }
}
