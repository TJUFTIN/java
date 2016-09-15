package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer integ = 2;
        int num = 3;
        print(integ);
        print(num);
    }

    static void print(int i) {
        System.out.println(i);
    }
    static void print(Integer integer) {
        System.out.println(integer);
    }
    //Напишите тут ваши методы
}
