package com.yd.behavioral.chainOfResponsibiltty.main;

import com.yd.behavioral.chainOfResponsibiltty.ChainOfHandle;

public class Run {
    public static void main(String[] args) {
        ChainOfHandle.processRequest("C");
        ChainOfHandle.processRequest("B");
    }
}