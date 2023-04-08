package com.yd.behavioral.interpreterPattern.impl;

import com.yd.behavioral.interpreterPattern.Expression;

public class NoTerminalExpression implements Expression {
    private Expression te1;
    private Expression te2;

    private String regex = "的";

    public void setTe1(Expression te1) {
        this.te1 = te1;
    }

    public void setTe2(Expression te2) {
        this.te2 = te2;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public NoTerminalExpression(Expression te1, Expression te2) {
        this.te1 = te1;
        this.te2 = te2;
    }

    @Override
    public boolean interpreter(String info) {
        String[] strings = info.split(regex);
        return te1.interpreter(strings[0]) && te2.interpreter(strings[1]);
    }
}
