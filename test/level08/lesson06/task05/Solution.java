package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций). Ничего измерять не нужно.
*/

public class Solution
{
    public static List  getListForGet()
    {
//        List<Object> list = new ArrayList<Object>();
//        for (int i = 0; i < list.size(); i++)
//        {
//            list.get(i);
//        }
//
//        return list.get(i);
        return  new ArrayList();
        //напишите тут ваш код

    }

    public static List  getListForSet()
    {
        //напишите тут ваш код
        return  new ArrayList();
    }

    public static List  getListForAddOrInsert()
    {
        //напишите тут ваш код
        return  new LinkedList();
    }

    public static List  getListForRemove()
    {
        //напишите тут ваш код
        return  new LinkedList();

    }
}
