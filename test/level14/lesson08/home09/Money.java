package com.javarush.test.level14.lesson08.home09;

public abstract class Money {
    public Money(double amount)    {    }

    private int count;

    Money (int count) {
        this.count = count;
    }

    public double getAmount() {
        return this.count;
    };

    public abstract String getCurrencyName();
}

