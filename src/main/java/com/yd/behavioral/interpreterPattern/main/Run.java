package com.yd.behavioral.interpreterPattern.main;

import com.yd.behavioral.interpreterPattern.impl.Context;

public class Run {
    public static void main(String[] args) {
        Context context = new Context();
        context.checkUp("B区的开发人员");
        context.checkUp("B区的测试人员");
        context.checkUp("A区的开发人员");
        context.checkUp("A区的测试人员");

        //没有D区
        context.checkUp("D区的维护人员");


    }
}
