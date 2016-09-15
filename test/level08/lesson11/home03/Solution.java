package com.javarush.test.level08.lesson11.home03;

import java.util.HashMap;
import java.util.Map;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList()
    {
        Map<String,String> map = new HashMap<String, String>();
        map.put("a1","a2");
        map.put("b1","b2");
        map.put("a1","c2");
        map.put("d1","d2");
        map.put("e1","e2");
        map.put("f1","a2");
        map.put("g1","g2");
        map.put("h1","h2");
        map.put("i1","i2");
        map.put("j1","j2");

        //напишите тут ваш код

        return map;
    }

    public static void printPeopleList(Map<String, String> map)
    {
        for (Map.Entry<String, String> s : map.entrySet())
        {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
