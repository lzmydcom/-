package com.yd.behavioral.mediatorPattern.impl;

import com.yd.behavioral.mediatorPattern.Colleague;
import com.yd.behavioral.mediatorPattern.Mediator;

public class ConcreteColleagueC extends Colleague {

    public ConcreteColleagueC(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void acceptMessage(String message,Colleague sender) {
        System.out.println("我是C收到了来自"+sender+"的消息：" + message);
    }

    @Override
    public void acceptBroadcast(String message) {
        System.out.println("我是C我收到了广播消息：" + message);
    }
}
