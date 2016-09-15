package com.javarush.test.level04.lesson10.task03;

import java.io.*;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str=reader.readLine();
        String num=reader.readLine();
        int n=Integer.parseInt(num);
//        n=3;
//        str="23";

        int i=0;
        while (i<n) {
            System.out.println(str);
            i++;
        }
        //напишите тут ваш код

    }
}
