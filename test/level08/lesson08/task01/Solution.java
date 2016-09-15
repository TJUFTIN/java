package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //String str[] = new String[] {"Л1","Л2","Л3","Л4","Л5","Л6","Л7","Л8","Л9","Л10","Л11","Л12","Л13","Л14","Л15","Л16","Л17","Л18","Л19","Л20"};
        Set<String> str = new HashSet<String>();
        str.add("Л1");
        str.add("Л2");
        str.add("Л3");
        str.add("Л4");
        str.add("Л5");
        str.add("Л6");
        str.add("Л7");
        str.add("Л8");
        str.add("Л9");
        str.add("Л10");
        str.add("Л11");
        str.add("Л12");
        str.add("Л13");
        str.add("Л14");
        str.add("Л15");
        str.add("Л16");
        str.add("Л17");
        str.add("Л18");
        str.add("Л19");
        str.add("Л20");

        return (HashSet<String>) str;
        //напишите тут ваш код

    }
}
