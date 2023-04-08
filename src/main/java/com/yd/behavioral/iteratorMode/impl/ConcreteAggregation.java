package com.yd.behavioral.iteratorMode.impl;

import com.yd.behavioral.iteratorMode.Aggregation;
import com.yd.behavioral.iteratorMode.Iterator;

import java.util.*;

public class ConcreteAggregation implements Aggregation {
    private final List<Object> ohs = new LinkedList<>();

    @Override
    public void setOhs(Object[] objs) {
        ohs.addAll(Arrays.asList(objs));
    }
    @Override
    public Object getObj(int index){
        return ohs.get(index);
    }
    @Override
    public int getSize(){
        return ohs.size();
    }
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
