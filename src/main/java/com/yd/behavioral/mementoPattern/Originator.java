package com.yd.behavioral.mementoPattern;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setMemento(Memento memento){
        this.state = memento.getState();
    }

    public Memento createMemento(){
        return new Memento(state);
    }

}
