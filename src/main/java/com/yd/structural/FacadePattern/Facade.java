package com.yd.structural.FacadePattern;

public class Facade implements Operation{

    private SystemOne systemOne;
    private SystemTwo systemTwo;
    private SystemThree systemThree;

    public Facade(SystemOne systemOne, SystemTwo systemTwo, SystemThree systemThree) {
        this.systemOne = systemOne;
        this.systemTwo = systemTwo;
        this.systemThree = systemThree;
    }

    @Override
    public void operateSystemOne() {
        systemOne.execute();
    }

    @Override
    public void operateSystemTwo() {
        systemTwo.execute();
    }

    @Override
    public void operateSystemThree() {
        systemThree.execute();
    }
}
