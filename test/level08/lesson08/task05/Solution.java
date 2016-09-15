package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

        return (HashMap<String,String>) map;
        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //HashMap<String, String> map = new HashMap<String, String>(map);
        ArrayList<String> str = new ArrayList();

        for (Map.Entry<String, String> pair: map.entrySet())
        {
            str.add(pair.getValue());
        }

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();

        for (int i = 0; i < str.size(); i++)
        {
            for (int j = i+1; j < str.size(); j++)
            {
                if (str.get(i).equals(str.get(j))) {
                removeItemFromMapByValue(map,str.get(i));
                removeItemFromMapByValue(map,str.get(j));
                }
            }
        }
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
