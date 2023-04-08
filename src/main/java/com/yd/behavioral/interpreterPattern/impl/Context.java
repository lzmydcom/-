package com.yd.behavioral.interpreterPattern.impl;

import com.yd.behavioral.interpreterPattern.Expression;

public class Context {
    private Expression region;
    private Expression person;

    private NoTerminalExpression nte;

    public void setNte(NoTerminalExpression nte) {
        this.nte = nte;
    }

    public void setRegion(Expression region) {
        this.region = region;
    }

    public void setPerson(Expression person) {
        this.person = person;
    }

    public Context() {
        String[] regions = {"A区","B区","C区"};
        String[] persons = {"开发人员","测试人员","维护人员","策划人员","调研人员"};
        region = new TerminalExpression(regions);
        person = new TerminalExpression(persons);
        nte = new NoTerminalExpression(region,person);
    }

    public void checkUp(String info){
        if (info != null) {
            boolean interpreter = nte.interpreter(info);
            System.out.println(interpreter?"检查通过":"检查不通过");
        }
    }
}
