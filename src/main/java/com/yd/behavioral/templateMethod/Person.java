package com.yd.behavioral.templateMethod;

public abstract class Person {
    public void templateMethod(){
        System.out.println("上课啦，去教室");
        primitiveOperation1();
        System.out.println("放学啦，离开教室");
        primitiveOperation2();
    }
    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
}
