package com.yd.behavioral.iteratorMode.main;

import com.yd.behavioral.iteratorMode.Aggregation;
import com.yd.behavioral.iteratorMode.Iterator;
import com.yd.behavioral.iteratorMode.impl.ConcreteAggregation;

public class Run {
    public static void main(String[] args) {
        String[] books = {"斗破苍穹","星辰变","三体","安徒生童话","完美世界","格林童话"};
        Aggregation aggregation = new ConcreteAggregation();
        aggregation.setOhs(books);
        Iterator iterator = aggregation.createIterator();


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
