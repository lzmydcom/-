package com.yd.behavioral.commandPattern.impl;

import com.yd.behavioral.commandPattern.Command;

public class OffCommand implements Command {
    private TV tv;

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public OffCommand() {
    }

    @Override
    public void execute() {
        tv.executeOff();
    }

    @Override
    public String toString() {
        return "关机";
    }
}
