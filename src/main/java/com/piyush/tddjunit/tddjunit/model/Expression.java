package com.piyush.tddjunit.tddjunit.model;

public interface Expression {
    Money reduce(Bank bank, String to);

    public Expression plus(Expression addend);

    public Expression times(int multiplier);

}
