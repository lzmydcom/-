package com.yd.structural.decoratorMode.main;

import com.yd.structural.decoratorMode.Component;
import com.yd.structural.decoratorMode.Person;
import com.yd.structural.decoratorMode.impl.DecorateStudent;
import com.yd.structural.decoratorMode.impl.Student;

public class Run {
    public static void main(String[] args) {
        Student student = new Student("张三");
        Component zs = new DecorateStudent(student);
        zs.operation();
    }
}