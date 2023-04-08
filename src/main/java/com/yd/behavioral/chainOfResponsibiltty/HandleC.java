package com.yd.behavioral.chainOfResponsibiltty;

public class HandleC implements Handle{

    private static final String requestType = "C";

    @Override
    public boolean support(String requestType) {
        return HandleC.requestType.equals(requestType);
    }

    @Override
    public void handleRequest() {
        System.out.println("成功处理了C类请求...");
    }
}
