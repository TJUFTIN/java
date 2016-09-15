package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());

        reader.close();
        int num, del = 0, mod1, mod2;

        if (num1 > num2) {
            num = num2;
        } else {
            num = num1;
        }

        for (int i = 1; i <= num; i++) {
            mod1 = num1 % i;
            mod2 = num2 % i;
            if (mod1 == 0 && mod2 == 0)  {
                del = i;
            }
        }

        System.out.println(del);
        System.out.println((num1 %= num2) + " " + (num2 %= num1));
    }
}
