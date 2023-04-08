package com.yd.behavioral.strategyPattern.main;

import com.yd.behavioral.strategyPattern.impl.Context;
import com.yd.behavioral.strategyPattern.impl.StrategyA;
import com.yd.behavioral.strategyPattern.impl.StrategyB;
import com.yd.behavioral.strategyPattern.impl.StrategyC;

public class Run {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyA());
        context.handle();
        context.setStrategy(new StrategyB());
        context.handle();
        context.setStrategy(new StrategyC());
        context.handle();
    }
}
