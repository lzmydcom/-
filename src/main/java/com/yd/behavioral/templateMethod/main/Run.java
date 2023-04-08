package com.yd.behavioral.templateMethod.main;

import com.yd.behavioral.templateMethod.Person;
import com.yd.behavioral.templateMethod.Student;
import com.yd.behavioral.templateMethod.Teacher;

public class Run {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();
        student.templateMethod();
        System.out.println("==========================");
        teacher.templateMethod();
    }
}

