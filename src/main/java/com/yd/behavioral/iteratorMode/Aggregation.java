package com.yd.behavioral.iteratorMode;

public interface Aggregation {
    Iterator createIterator();
    void setOhs(Object[] objects);
    Object getObj(int index);

    int getSize();
}
