package com.yd.behavioral.statePattern.impl;

import com.yd.behavioral.statePattern.State;

/**
 * 有货状态B
 */
public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("正在办理购买失败后的手续，请下次再来...");
    }
}
