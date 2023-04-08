package com.yd.behavioral.mediatorPattern.mian;

import com.yd.behavioral.mediatorPattern.*;
import com.yd.behavioral.mediatorPattern.impl.ConcreteColleagueA;
import com.yd.behavioral.mediatorPattern.impl.ConcreteColleagueB;
import com.yd.behavioral.mediatorPattern.impl.ConcreteColleagueC;
import com.yd.behavioral.mediatorPattern.impl.ConcreteMediator;

public class Run {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague[] colleagues = {new ConcreteColleagueA(mediator),new ConcreteColleagueB(mediator),new ConcreteColleagueC(mediator)};
        mediator.setColleagueList(colleagues);

        colleagues[0].sendBroadcast("大家好,祝大家快乐每一天！");

        colleagues[0].sendMessage("C你好，我是A，很高兴见到你",colleagues[2]);

    }
}
