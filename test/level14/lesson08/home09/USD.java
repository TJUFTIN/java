package com.javarush.test.level14.lesson08.home09;

/**
 * Created by UNIX on 06.09.2015.
 */
public class USD extends Money {

    public USD(double amount)    {
        super(amount);
    }

    USD(int count)    {
        super(count);
    }

    @Override
    public String getCurrencyName()    {
        return "USD";
    }
}
