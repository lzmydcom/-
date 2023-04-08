package com.yd.behavioral.chainOfResponsibiltty;

public class HandleA implements Handle{

    private static final String requestType = "A";

    @Override
    public boolean support(String requestType) {
        return HandleA.requestType.equals(requestType);
    }

    @Override
    public void handleRequest() {
        System.out.println("成功处理了A类请求...");
    }
}
