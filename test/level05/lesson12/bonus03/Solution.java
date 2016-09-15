package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

//public class Solution
//{
//    public static void main(String[] args) throws Exception
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int maximum = 0;
//
//        int n;
//        int N = Integer.parseInt(reader.readLine());
//        while (N < 1)
//        {
//            System.out.println("Введите число больше 0!");
//            N = Integer.parseInt(reader.readLine());
//        }
//
////        for (; 0<(N = Integer.parseInt(reader.readLine())) ;)
////        {
////            N = Integer.parseInt(reader.readLine());
////            System.out.println("Введите число больше 0!");
////        }
//
//        for (int i = 0; i < N; i++)
//        {
//            if (maximum < (n = Integer.parseInt(reader.readLine())))
//            {
//                maximum = n;
//            }
//        }
//
//
//        //напишите тут ваш код
//
//        System.out.println(maximum);
//    }
//}



public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int max = 0;
        int num1, num2 ;
        num1   = Integer.parseInt(reader.readLine());
        if (n!=1)
        {
            while ( n-1 > 0 )
            {
                num2   = Integer.parseInt(reader.readLine());
                if (num1 > num2)
                    max = num1;
                else
                {
                    max = num2;
                    num1 = num2;
                }
                n--;
            }
        }
        else
        {
            max = num1;

        }
        System.out.println(max);
    }

}