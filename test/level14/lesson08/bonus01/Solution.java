package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)    {
        initExceptions();

        for (Exception exception : exceptions)        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()    {   //it's first exception
        try        {
            float i = 1 / 0;

        } catch (Exception e)        {
            exceptions.add(e);
        }

        try        {
           new FileInputStream("1");
        }
        catch (FileNotFoundException e)
        {
            exceptions.add(e);
        }

        int j = 0;

        while (j<8) {
            try            {
                float i = j / 0;
            } catch (Exception e) {
                exceptions.add(e);
            }

            j++;
        }

        /*
        try        {
            int j = 0;
            while (j<9) {
                float i = j / 0;
            }
        } catch (Exception e) {
            exceptions.add(e);
            j++;
        } */

        //Add your code here

    }
}
