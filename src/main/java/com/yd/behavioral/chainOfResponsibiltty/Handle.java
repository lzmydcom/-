package com.yd.behavioral.chainOfResponsibiltty;

public interface Handle {
    boolean support(String requestType);

    void handleRequest();
}
