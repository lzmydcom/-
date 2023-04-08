package com.yd.behavioral.chainOfResponsibiltty;

import java.util.LinkedList;
import java.util.List;

public class ChainOfHandle {
    private static final List<Handle> chain = new LinkedList<>();
    static {
        chain.add(new HandleA());
        chain.add(new HandleB());
        chain.add(new HandleC());
    }

    public static void processRequest(String questType){
        for (Handle handle:chain){
            if (handle.support(questType)){
                handle.handleRequest();
                break;
            }
        }
    }

}
