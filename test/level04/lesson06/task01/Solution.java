package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader (System.in));
        String num1=reader.readLine();
        String num2=reader.readLine();
        Integer n1=Integer.parseInt(num1);
        Integer n2=Integer.parseInt(num2);
        if (n1>n2) {
            System.out.println(n2);
        } else {
            System.out.println(n1);
        }

        //напишите тут ваш код

    }
}