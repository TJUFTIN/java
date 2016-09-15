package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        int[] num1 = new int[5];
        int[] num2 = new int[2];
        int[] num3 = new int[4];
        int[] num4 = new int[7];
        int[] num5 = new int[0];

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        list.add(num4);
        list.add(num5);

        return list;
        //напишите тут ваш код
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
