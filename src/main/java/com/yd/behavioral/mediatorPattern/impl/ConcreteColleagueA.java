package com.yd.behavioral.mediatorPattern.impl;

import com.yd.behavioral.mediatorPattern.Colleague;
import com.yd.behavioral.mediatorPattern.Mediator;

public class ConcreteColleagueA extends Colleague {

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void acceptMessage(String message,Colleague sender) {
        System.out.println("我是A收到了来自"+sender+"的消息：" + message);
    }

    @Override
    public void acceptBroadcast(String message) {
        System.out.println("我是A我收到了广播消息：" + message);
    }

}
