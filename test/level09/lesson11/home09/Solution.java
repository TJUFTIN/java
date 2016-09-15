package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String,Cat> map = new HashMap<String, Cat>();
        map.put("a1",new Cat("1"));
        map.put("a2",new Cat("2"));
        map.put("a3",new Cat("3"));
        map.put("a4",new Cat("4"));
        map.put("a5",new Cat("5"));

        map.put("a6",new Cat("6"));
        map.put("a7",new Cat("7"));
        map.put("a8",new Cat("8"));
        map.put("a9",new Cat("9"));
        map.put("a10",new Cat("10"));

        return map;
        // /напишите тут ваш код
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> cat = new HashSet<Cat>();
        for (Map.Entry<String,Cat> pair : map.entrySet()) {
            cat.add(pair.getValue());
        }

        return cat;
        //напишите тут ваш код
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
