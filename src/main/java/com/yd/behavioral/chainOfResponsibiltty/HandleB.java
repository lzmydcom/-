package com.yd.behavioral.chainOfResponsibiltty;

public class HandleB implements Handle {

    private static final String requestType = "B";

    @Override
    public boolean support(String requestType) {
        return HandleB.requestType.equals(requestType);
    }

    @Override
    public void handleRequest() {
        System.out.println("成功处理了B类请求...");
    }


}

