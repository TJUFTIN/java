package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] c = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
        {
             c[i] = s.charAt(i);
        }

//        for (char ch: c) {
//            System.out.print(ch);
//        }
//        System.out.println("\n");

        if (Character.isLetter(c[0])) {
            c[0] = Character.toUpperCase(c[0]);
        }

        for (int i = 1; i < c.length; i++)
        {
            if (Character.isLetter(c[i]) && Character.isSpaceChar(c[i-1])) {
                c[i] = Character.toUpperCase(c[i]);
            }
        }

        for (char ch: c) {
            System.out.print(ch);
        }

        //напишите тут ваш код
    }


}
