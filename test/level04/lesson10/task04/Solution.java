package com.javarush.test.level04.lesson10.task04;

import java.io.*;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i=1;
        int j=1;
        while (i<11) {
            while (j<11) {
                System.out.print("S");
                j++;
            }
            i++;
            j=1;
            System.out.println("\n");
        }
        //напишите тут ваш код

    }
}
