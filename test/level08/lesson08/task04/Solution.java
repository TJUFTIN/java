package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUN 1 1980"));
        map.put("a", new Date("JUN 1 1980"));
        map.put("b", new Date("MAY 1 1980"));
        map.put("c", new Date("FEB 1 1980"));
        map.put("d", new Date("AUG 1 1980"));
        map.put("e", new Date("DEC 1 1980"));
        map.put("f", new Date("SEP 1 1980"));
        map.put("g", new Date("NOV 1 1980"));
        map.put("h", new Date("JUN 1 1980"));
        map.put("i", new Date("JUN 1 1980"));
        //напишите тут ваш код
        return (HashMap<String,Date>) map;
    }

    public static /*HashMap<String, Date>*/ void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String,Date> pair = iterator.next();
            String key = pair.getKey();
            Date val = pair.getValue();
            int mon = val.getMonth();

            if (mon > 4 && mon < 8) {
                iterator.remove();
            }
        }
//        return (HashMap<String,Date>) map;
        //напишите тут ваш код

    }

//    public static void main (String[] args) {
//        HashMap<String,Date> dd = createMap();
//        dd = removeAllSummerPeople(dd);
//
//        for (Map.Entry<String,Date> pair:dd.entrySet()) {
//            String key = pair.getKey();
//            Date val = pair.getValue();
//
//            System.out.println(key + " " + val);
//        }
//    }
}
