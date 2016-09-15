package com.javarush.test.level08.lesson11.home09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws ParseException
    {
        String s = "JULY 07 2014";
        System.out.println(isDateOdd(s));
    }

    public static boolean isDateOdd(String date) throws ParseException
    {
        boolean res;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM dd yyy", Locale.ENGLISH);
        Date day = dateFormat.parse(date);
        Date yearStart = new Date();

        yearStart.setHours(0);
        yearStart.setMinutes(0);
        yearStart.setMonth(0);
        yearStart.setSeconds(0);
        yearStart.setDate(1);
        yearStart.setYear(day.getYear());

//        System.out.println(day + "\n" + yearStart);

        long raz = day.getTime() - yearStart.getTime();
        int dayCount = (int) (raz/(24*60*60*1000));

        if (dayCount % 2 == 0) {
            res = false;
        } else {
            res = true;
        }

        return res;
    }
}
