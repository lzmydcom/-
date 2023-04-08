package com.yd.behavioral.commandPattern.impl;

import com.yd.behavioral.commandPattern.Command;

public class OnCommand implements Command {
    private TV tv;

    public OnCommand() {}

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        return "开机";
    }

    @Override
    public void execute() {
        tv.executeOn();
    }
}
