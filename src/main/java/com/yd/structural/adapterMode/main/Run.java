package com.yd.structural.adapterMode.main;

import com.yd.structural.adapterMode.Adapter;
import com.yd.structural.adapterMode.USB;

public class Run {
    public static void main(String[] args) {
        USB adapter = new Adapter();
        //使用适配器适配Type-C接口
        adapter.request();
    }
}
