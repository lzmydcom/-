package com.yd.behavioral.mementoPattern.main;

import com.yd.behavioral.mementoPattern.Caretaker;
import com.yd.behavioral.mementoPattern.Memento;
import com.yd.behavioral.mementoPattern.Originator;

public class Run {
    public static void main(String[] args) {
        Memento[] mementos;

        Originator originator = new Originator();
        originator.setState("A");
        Memento memento1 = originator.createMemento();
        originator.setState("B");
        Memento memento2 = originator.createMemento();
        originator.setState("C");
        Memento memento3 = originator.createMemento();
        mementos = new Memento[]{memento1, memento2, memento3};
        Caretaker caretaker = new Caretaker();
        caretaker.setMementoList(mementos);

        originator.setState("D");
        Memento memento4 = originator.createMemento();
        originator.setState("E");
        Memento memento5 = originator.createMemento();
        mementos = new Memento[]{memento4,memento5};
        caretaker.setMementoList(mementos);

        caretaker.showAllMemento();

        //获取当前原发器对象状态
        System.out.println("当前状态为：" + originator.getState());
        //用备忘录还原原发器状态，更改为C
        Memento memento = caretaker.getMemento(3);
        originator.setMemento(memento);
        //获取修改后原发器的状态
        System.out.println("当前状态为：" +  originator.getState());
    }
}
