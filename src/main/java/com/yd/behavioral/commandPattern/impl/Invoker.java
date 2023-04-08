package com.yd.behavioral.commandPattern.impl;

import com.yd.behavioral.commandPattern.Command;

import java.lang.reflect.Field;

public class Invoker {
    private Command command;

    private final String name;

    public Invoker(String name) {
        this.name = name;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() throws NoSuchFieldException, IllegalAccessException {
        /*
         * 这里由于设计问题，获取不到command对象的tv属性，故使用暴力反射获取
         */
        Field tvField = command.getClass().getDeclaredField("tv");
        tvField.setAccessible(true);
        TV tv = (TV) tvField.get(command);
        System.out.println("调用者" + name + "向" + tv + "发送了" + command + "指令");
        command.execute();
    }

}
