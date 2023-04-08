package com.yd.behavioral.commandPattern.main;

import com.yd.behavioral.commandPattern.impl.Invoker;
import com.yd.behavioral.commandPattern.impl.OffCommand;
import com.yd.behavioral.commandPattern.impl.OnCommand;
import com.yd.behavioral.commandPattern.impl.TV;

public class Run {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /*
         * 不同调用者对同一台TV发送不同命令
         */
        TV tv = new TV("康佳电视");
        OffCommand offCommand = new OffCommand();
        offCommand.setTv(tv);
        OnCommand onCommand = new OnCommand();
        onCommand.setTv(tv);

        Invoker invoker1 = new Invoker("张三");
        invoker1.setCommand(offCommand);
        invoker1.call();

        Invoker invoker2 = new Invoker("李四");
        invoker2.setCommand(onCommand);
        invoker2.call();

        System.out.println("===========================");
        /*
         * 同一调用者对同一TV发送不同命令
         */
        invoker1.setCommand(onCommand);
        invoker1.call();
        invoker1.setCommand(offCommand);
        invoker1.call();
    }
}
