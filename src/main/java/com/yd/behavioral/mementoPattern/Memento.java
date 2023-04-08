package com.yd.behavioral.mementoPattern;

public class Memento {
    private final String state;

    private final int orderNumber;
    public static int numberOfBackups = 0;
    public Memento(String state){
        this.state = state;
        numberOfBackups++;
        orderNumber = numberOfBackups;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getState() {
        return state;
    }


}
