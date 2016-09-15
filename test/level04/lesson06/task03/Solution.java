package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        String num1=reader.readLine();
        String num2=reader.readLine();
        String num3=reader.readLine();
        Integer numeric1=Integer.parseInt(num1);
        Integer numeric2=Integer.parseInt(num2);
        Integer numeric3=Integer.parseInt(num3);
        if (numeric1>numeric2)
        {
            if (numeric1 > numeric3)
            {
                System.out.println(numeric1);
                if (numeric2 > numeric3)
                {
                    System.out.println(numeric2);
                    System.out.println(numeric3);
                } else
                {
                    System.out.println(numeric3);
                    System.out.println(numeric2);
                }

            }
        }
        else {//numeric1<numeric2
            if (numeric2>numeric3) {
                System.out.println(numeric2);
                if (numeric1>numeric3) {
                    System.out.println(numeric1);
                    System.out.println(numeric3);
                } else {
                    System.out.println(numeric3);
                    System.out.println(numeric1);
                }
            } else {
                System.out.println(numeric3);
                System.out.println(numeric2);
                System.out.println(numeric1);
            }
        }

// напишите тут ваш код

    }
}
