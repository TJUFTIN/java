package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

//public class Solution
//{
//    public static void main(String[] args) throws Exception
//    {
//        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
//        int num[]= new int[6];
//        int a;
//        String s;
//
//        for (int i = 0; i < num.length; i++) {
//            num[i] = Integer.parseInt(reader.readLine());
//        }
//
//        for (int i = 1; i < num.length-1; i++) {
//            for (int j = 0; j < num.length-i; j++) {
//                if (num[j]>num[j+1]) {
//                    a=num[j+1];
//                    num[j+1]=num[j];
//                    num[j]=a;
//                }
//            }
//        }
//
//        for (int i = 0; i < num.length; i++)
//        {
//            System.out.println(num[i]);
//        }
//
//        //напишите тут ваш код
//    }
//}



public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] a = new int[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < a.length; i++){
            for (int j = a.length-1; j > i; j--){
                if(a[j] < a[j-1]) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}