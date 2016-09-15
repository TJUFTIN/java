package com.javarush.test.level19.lesson10.home09;

/* Контекстная реклама
В методе main подмените объект System.out написанной вами реадер-оберткой
Ваша реадер-обертка должна выводить на консоль контекстную рекламу после каждого второго println-а
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Рекламный текст: "JavaRush - курсы Java онлайн"

Пример вывода:
first
second
JavaRush - курсы Java онлайн
third
fourth
JavaRush - курсы Java онлайн
fifth
*/

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream oldStream = System.out;

        OutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        String say = "JavaRush - курсы Java онлайн";

        testString.printSomething();
        String result = outputStream.toString();
        String[] strings = result.split(System.lineSeparator());
        result = "";
        for (int i = 0; i < strings.length; i++)        {
            result += strings[i] + "\n";
            if (i % 2 == 1) {
                result += say + "\n";
            }
        }

        System.setOut(oldStream);
        System.out.println(result);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
