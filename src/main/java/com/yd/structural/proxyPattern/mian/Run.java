package com.yd.structural.proxyPattern.mian;

import com.yd.structural.proxyPattern.Operation;
import com.yd.structural.proxyPattern.OperationInterceptor;
import com.yd.structural.proxyPattern.Target;

import java.lang.reflect.Proxy;

public class Run {
    public static void main(String[] args) {
        Operation operation = new Target();
        OperationInterceptor operationInterceptor = new OperationInterceptor(operation);
        Operation o = (Operation)Proxy.newProxyInstance(operation.getClass().getClassLoader(), operation.getClass().getInterfaces(), operationInterceptor);
        Integer add = o.add(3, 8);

    }
}
