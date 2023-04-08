package com.yd.behavioral.strategyPattern.impl;

import com.yd.behavioral.strategyPattern.Strategy;

public class StrategyB implements Strategy {
    @Override
    public void operation() {
        System.out.println("使用策略B...");
    }
}
