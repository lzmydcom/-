package com.yd.behavioral.mediatorPattern.impl;

import com.yd.behavioral.mediatorPattern.Colleague;
import com.yd.behavioral.mediatorPattern.Mediator;

public class ConcreteMediator extends Mediator {

    public ConcreteMediator() {
    }

    @Override
    public void broadcast(String message, Colleague sender) {
        if (colleagueList != null){
            for (Colleague colleague:colleagueList){
                if (!sender.equals(colleague)){
                    colleague.acceptBroadcast(message);
                }
            }
        }else throw new RuntimeException("colleagueList不能为空！");
    }

    @Override
    public void sendMessage(String message,Colleague sender, Colleague acceptor) {
        if (colleagueList != null){
            for (Colleague colleague:colleagueList){
                if (acceptor.equals(colleague)){
                    colleague.acceptMessage(message,sender);
                    return;
                }
            }
            throw new RuntimeException("中介者没有接受方的地址！");
        }else throw new RuntimeException("colleagueList不能为空！");
    }
}
