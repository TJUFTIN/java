package com.javarush.test.level04.lesson06.task02;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести
сообщение «Имена идентичны». Если имена разные, но их длины равны –
вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader (System.in));
        String name1=reader.readLine();
        String name2=reader.readLine();
        int d1=name1.length();
        int d2=name2.length();
        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        } else {
            if (d1==d2) {
                System.out.println("Длины имен равны");
            }
        }
         //напишите тут ваш код

    }
}
