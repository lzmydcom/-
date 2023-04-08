package com.yd.behavioral.iteratorMode.impl;

import com.yd.behavioral.iteratorMode.Aggregation;
import com.yd.behavioral.iteratorMode.Iterator;

public class ConcreteIterator implements Iterator {

    private int index = 0;

    private Aggregation aggregation;

    public ConcreteIterator(ConcreteAggregation aggregation) {
        this.aggregation = aggregation;
    }

    public void setAggregation(Aggregation aggregation) {
        this.aggregation = aggregation;
    }

    @Override
    public boolean hasNext() {
        return index < aggregation.getSize();
    }

    @Override
    public Object next() {
        Object obj = aggregation.getObj(index);
        index++;
        return obj;
    }
}
