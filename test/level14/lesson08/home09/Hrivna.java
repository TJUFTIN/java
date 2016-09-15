package com.javarush.test.level14.lesson08.home09;

/**
 * Created by UNIX on 06.09.2015.
 */
public class Hrivna extends Money {
    public Hrivna(double amount)    {
        super(amount);
    }

    Hrivna(int count)    {
        super(count);
    }

    @Override
    public String getCurrencyName()    {
        return "HRN";
    }

}
