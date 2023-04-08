package com.yd.structural.proxyPattern;

public class Target implements Operation{
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
