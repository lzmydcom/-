package com.yd.behavioral.mementoPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Caretaker {
    private final List<Memento>  mementoList = new ArrayList<>();

    public void setMementoList(Memento[] mementos) {
        Collections.addAll(mementoList, mementos);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index - 1);
    }

    public void showAllMemento() {
        for (Memento memento : mementoList) {
            System.out.println("第" + memento.getOrderNumber() + "次备份，状态为：" + memento.getState());
        }
    }
}