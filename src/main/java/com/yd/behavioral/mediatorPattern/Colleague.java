package com.yd.behavioral.mediatorPattern;

public abstract class Colleague {
    protected final Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

    public abstract void acceptMessage(String message,Colleague sender);

    public abstract void acceptBroadcast(String message);


    public void sendBroadcast(String message){
        mediator.broadcast(message,this);
    }

    public void sendMessage(String message, Colleague recipient){
        mediator.sendMessage(message,this, recipient);
    }

}
