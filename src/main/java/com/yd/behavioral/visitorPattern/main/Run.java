package com.yd.behavioral.visitorPattern.main;

import com.yd.behavioral.visitorPattern.Person;
import com.yd.behavioral.visitorPattern.impl.Student;
import com.yd.behavioral.visitorPattern.impl.Teacher;

import java.util.LinkedList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();

        personList.add(new Student("张三",18,67));
        personList.add(new Student("李四",19,78));
        personList.add(new Student("王五",18,43));
        personList.add(new Student("赵六",18,79));
        personList.add(new Student("彬彬",18,32));
        personList.add(new Student("玲玲",18,56));
        personList.add(new Student("斌斌",18,81));

        personList.add(new Teacher("小艾老师",43,8));
        personList.add(new Teacher("小周老师",31,3));
        personList.add(new Teacher("树英老师",29,2));

        final int[] total = new int[2];

        for (Person person:personList){
            person.acceptAccess(p -> {
                //分别打印所有学生成绩并统计所有学生的成绩总和
                if (p.getClass() == Student.class){
                    total[0] += ((Student) p).getScore();
                    System.out.println(p.getName() + "的成绩为：" + ((Student) p).getScore());
                }
                //分别打印所有老师的工作年龄并给出最大工龄
                else {
                    total[1] = Math.max(total[1], ((Teacher) p).getWorkingAge());
                    System.out.println(p.getName() + "的工作年龄为：" + ((Teacher)p).getWorkingAge());
                }
            });
        }
        System.out.println("所有学生的总分：" + total[0]);
        System.out.println("所有老师中最大工龄为：" + total[1]);
    }
}
