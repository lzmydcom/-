package com.yd.behavioral.statePattern.main;

import com.yd.behavioral.statePattern.impl.Context;

import java.util.LinkedList;
import java.util.List;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Context context = new Context();
        Thread thread = context.getThread();
        thread.setDaemon(true);

        List<Thread> threadList = new LinkedList<>();
        for (int i = 0; i <= 20; i++) {
            threadList.add(new Thread(context::purchaseRequest));
        }

        for (int i = 0; i <= 20; i++){
            //每隔50毫秒发送一次货物购买请求
            Thread.sleep(50);
            threadList.get(i).start();
        }
    }
}