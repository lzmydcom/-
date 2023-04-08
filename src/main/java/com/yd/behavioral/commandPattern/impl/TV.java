package com.yd.behavioral.commandPattern.impl;

public class TV {

    private final String name;

    public TV(String name) {
        this.name = name;
    }

    /**
     * 开机命令
     */
    void executeOn(){
        System.out.println("TV 开机了");
    }

    /**
     * 关机命令
     */
    void executeOff(){
        System.out.println("TV 关机了");
    }

    @Override
    public String toString() {
        return name;
    }
}
