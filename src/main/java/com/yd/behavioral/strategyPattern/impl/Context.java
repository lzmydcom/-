package com.yd.behavioral.strategyPattern.impl;

import com.yd.behavioral.strategyPattern.Strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void handle(){
        strategy.operation();
    }
}
