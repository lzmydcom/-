package com.yd.behavioral.statePattern.impl;

import com.yd.behavioral.statePattern.State;

/**
 * 无货状态A
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(Context context) {
        System.out.println("正在办理购买成功后的手续，欢迎下次光临！");
    }
}
