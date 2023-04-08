package com.yd.structural.FacadePattern.main;

import com.yd.structural.FacadePattern.Facade;
import com.yd.structural.FacadePattern.SystemOne;
import com.yd.structural.FacadePattern.SystemThree;
import com.yd.structural.FacadePattern.SystemTwo;

public class Run {
    public static void main(String[] args) {

        SystemOne systemOne = new SystemOne();
        SystemTwo systemTwo = new SystemTwo();
        SystemThree systemThree = new SystemThree();
        Facade facade = new Facade(systemOne, systemTwo, systemThree);

        facade.operateSystemOne();
        facade.operateSystemTwo();
        facade.operateSystemThree();
    }
}
