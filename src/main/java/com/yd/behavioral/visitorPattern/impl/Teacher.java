package com.yd.behavioral.visitorPattern.impl;

import com.yd.behavioral.visitorPattern.Person;
import com.yd.behavioral.visitorPattern.Visitor;

public class Teacher extends Person {
    private int workingAge;

    public Teacher(String name, int age, int workingAge) {
        super(name, age);
        this.workingAge = workingAge;
    }

    public Teacher() {
    }

    public int getWorkingAge() {
        return workingAge;
    }

    public void setWorkingAge(int workingAge) {
        this.workingAge = workingAge;
    }

    @Override
    public void acceptAccess(Visitor visitor) {
        visitor.visit(this);
    }
}
