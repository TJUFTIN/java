package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

//        for (int x : array) {
//            System.out.println(x);
//        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        int a=0;
        for (int j = 0; j < array.length-2; j++)
        {
            for (int i = array.length-1; i >=1+j; i--)
            {
                if (array[i-1]<array[i]) {
                    a = array[i];
                    array[i] = array[i-1];
                    array[i-1] = a;
                }

            }
        }

        //напишите тут ваш код
    }
}