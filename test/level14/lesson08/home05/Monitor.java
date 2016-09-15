package com.javarush.test.level14.lesson08.home05;

/**
 * Created by UNIX on 05.09.2015.
 */
public class Monitor implements CompItem {
    @Override
    public String getName()    {
        return this.getClass().getSimpleName();
    }
}
