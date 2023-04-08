package com.yd.behavioral.visitorPattern.impl;

import com.yd.behavioral.visitorPattern.Person;
import com.yd.behavioral.visitorPattern.Visitor;

public class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public Student() {
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void acceptAccess(Visitor visitor) {
        visitor.visit(this);
    }
}
