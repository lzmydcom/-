package com.yd.behavioral.templateMethod;

public class Student extends Person{
    @Override
    public void primitiveOperation1() {
        System.out.println("在座位上坐好，准备听课学习...");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("做作业，预习好功课");
    }
}
