package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        String text = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try        {
            text = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        text = text.substring(text.indexOf("?")+1);
        String[] textStr = text.split("&");
        String result = "";
        for (int i = 0; i < textStr.length; i++) {
            if (!textStr[i].equals("")) {
                while (textStr[i].charAt(0) == '?') {
                    textStr[i] = textStr[i].substring(1);
                }
                String[] str = textStr[i].split("=");
                result = result.concat(" ").concat(str[0]);
            }

        }

        result = result.substring(1);
        System.out.println(result);

        for (int i = 0; i < textStr.length; i++) {
            String[] str = textStr[i].split("=");
            if (str[0].equals("obj")) {
                if (str.length > 1) {

                        try {
                            double a = Double.parseDouble(str[1]);
                            alert(a);
                        } catch (Exception e) {alert(str[1]);}

                }

            }
        }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
