package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String num1=reader.readLine();
        String num2=reader.readLine();
        String num3=reader.readLine();
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int n3=Integer.parseInt(num3);
        if (n1>n2) {
            if (n2>n3) {
                System.out.println(n2);
            } else {
                if (n1>n3) {
                    System.out.println(n3);
                } else {
                    System.out.println(n1);
                }
            }
        } else {
            if (n2<n3) {
                System.out.println(n2);
            } else {
                if (n1>n3) {
                    System.out.println(n1);
                } else {
                    System.out.println(n3);
                }
            }
        }

        //напишите тут ваш код
    }
}
