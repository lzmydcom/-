package com.yd.behavioral.templateMethod;

public class Teacher extends Person {
    @Override
    public void primitiveOperation1() {
        System.out.println("去讲台，教授学生...");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("回家坐好明天的备课...");
    }
}
