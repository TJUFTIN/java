package com.javarush.test.level08.lesson08.task03;

import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        Map<String,String> map = new HashMap<String, String>();

        map.put("a1","a2");
        map.put("b1","b2");
        map.put("c1","c2");
        map.put("d1","d2");
        map.put("e1","e2");
        map.put("f1","f2");
        map.put("g1","g2");
        map.put("h1","h2");
        map.put("i1","i2");
        map.put("j1","j2");

        //напишите тут ваш код
        return  (HashMap<String,String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        int a=0;
        //List<String> firstName = new ArrayList<String>();

//        while (iterator.hasNext()) {
//            Map.Entry<String,String> pair = iterator.next();
//            firstName.add(pair.getValue());
//        }
//
//        for (int i = 0; i < firstName.size(); i++)
//        {
//            for (int j = i+1; j < firstName.size(); j++)
//            {
//                if (firstName.get(i).equals(firstName.get(j))) {
//                    a++;
//                }
//            }
//        }

        while (iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            if (pair.getValue().equals(name)) {
                a++;
            }
        }

        return  a;
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        int b=0;
//        List<String> firstName = new ArrayList<String>();
//
//        while (iterator.hasNext()) {
//            Map.Entry<String,String> pair = iterator.next();
//            firstName.add(pair.getValue());
//        }
//
//        for (int i = 0; i < firstName.size(); i++)
//        {
//            for (int j = i+1; j < firstName.size(); j++)
//            {
//                if (firstName.get(i).equals(firstName.get(j))) {
//                    b++;
//                }
//            }
//        }

        while (iterator.hasNext()) {
            Map.Entry<String,String> pair = iterator.next();
            if (pair.getKey().equals(familiya)) {
                b++;
            }
        }

        return  b;
        //напишите тут ваш код

    }
}
