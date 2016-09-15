package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

//public class Solution
//{
//    public static void main(String[] args) throws IOException, ParseException
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String mon = reader.readLine();
//
//        SimpleDateFormat format = new SimpleDateFormat("MMMM", Locale.ENGLISH);
//
//        Date date = format.parse(mon);
//
////        System.out.println(date);
//
//        SimpleDateFormat format1 = new SimpleDateFormat("MM");
//        SimpleDateFormat format2 = new SimpleDateFormat("MMMM", Locale.ENGLISH);
//
//        System.out.println(format2.format(date) + " is " + format1.format(date) + " month");
//        //напишите тут ваш код
//    }
//
//}

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s=reader.readLine();
        Date d=new Date(s+" 1 1999");
        System.out.println(s +" is " + (d.getMonth()+1) + " month");
    }

}
