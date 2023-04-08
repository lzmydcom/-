package com.yd.structural.proxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OperationInterceptor implements InvocationHandler {
    Object target;

    public OperationInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("加数：" + args[0] + "被加数：" + args[1]);
        Object invoke = method.invoke(target, args);
        System.out.println("结果是：" + invoke);
        return invoke;
    }
}
