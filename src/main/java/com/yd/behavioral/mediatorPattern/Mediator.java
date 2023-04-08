package com.yd.behavioral.mediatorPattern;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public abstract class Mediator {
    protected List<Colleague> colleagueList;

    public Mediator() {
    }

    public void setColleagueList(Colleague[] colleagues) {
        colleagueList = new LinkedList<>();
        colleagueList.addAll(Arrays.asList(colleagues));
    }

    public abstract void broadcast(String message, Colleague sender);

    public abstract void sendMessage(String message, Colleague sender, Colleague acceptor);
}
