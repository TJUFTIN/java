package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        String a = "dfgg";
        String b = "ewterty";
        String c = "rytyutyu";
        ArrayList<String>[] string = new ArrayList[3];
        ArrayList<String> list0 = new ArrayList<String>();
        list0.add(a);
        list0.add(b);
        list0.add(c);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add(a);
        list1.add(b);
        list1.add(c);
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add(a);
        list2.add(b);
        list2.add(c);
        string[0] = list0;
        string[1] = list1;
        string[2] = list2;

        //напишите тут ваш код

        return string;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}