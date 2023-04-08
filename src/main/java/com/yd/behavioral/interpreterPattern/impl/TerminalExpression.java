package com.yd.behavioral.interpreterPattern.impl;

import com.yd.behavioral.interpreterPattern.Expression;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TerminalExpression implements Expression {

    private Set<String> terminator = new HashSet<>();

    public TerminalExpression(String[] strings) {
        Collections.addAll(terminator, strings);
    }

    public Set<String> getTerminator() {
        return terminator;
    }

    public void setTerminator(Set<String> terminator) {
        this.terminator = terminator;
    }

    @Override
    public boolean interpreter(String info) {
        return terminator.contains(info);
    }
}
