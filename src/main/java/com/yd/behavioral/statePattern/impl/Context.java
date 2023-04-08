package com.yd.behavioral.statePattern.impl;

import com.yd.behavioral.statePattern.State;

public class Context {
    private int count = 5;
    private State state;

    private final Thread thread = new Thread(() -> {
        while (true){
            //模拟补货所用时间，睡眠100毫秒
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //补了5个货物
            count = 5;
            //设置状态为购买成功状态
            state = StateFactory.getStateA();
            try {
                Thread.currentThread().join();
            } catch (InterruptedException e) {
                System.out.println("补货中...");
            }

        }

    });

    public Thread getThread() {
        return thread;
    }

    public Context() {
        state = StateFactory.getStateA();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void stateDispatch() {

        synchronized (this) {
            if (count >= 1) {
                count--;
                System.out.println("购买成功！");
            } else {
                System.out.println("购买失败！当前无货！");
                state = StateFactory.getStateB();


                Thread.State threadState = thread.getState();

                if ("NEW".equals(threadState.name())) {
                    thread.start();
                }
                if ("WAITING".equals(threadState.name())){
                    thread.interrupt();
                }
            }
        }
    }

    public void purchaseRequest(){
        stateDispatch();
        state.handle(this);
    }
}
