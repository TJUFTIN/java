package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date data1 = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        //SimpleDateFormat dateFormat2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd, yyyy");
        SimpleDateFormat dateFormat3 = new SimpleDateFormat("MMM", Locale.ENGLISH);
        data1 = dateFormat1.parse(reader.readLine());
        //System.out.println(dateFormat2.format(data));
        System.out.println(dateFormat3.format(data1).toUpperCase() + " " + dateFormat2.format(data1));
        //System.out.println(data);

        //напишите тут ваш код
    }
}
