package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream1 = new FileOutputStream(name2);
        FileOutputStream outputStream2 = new FileOutputStream(name3);
        List<Integer> array = new ArrayList<Integer>();
        while (inputStream.available() > 0) {
            array.add(inputStream.read());
        }
        inputStream.close();

        if (array.size() % 2 == 0) {
            for (int i = 0; i < array.size()/2; i++)            {
                outputStream1.write(array.get(i));
                outputStream2.write(array.get(i+array.size()/2));
            }
        } else {
            for (int i = 0; i < array.size()/2+1; i++)            {
                outputStream1.write(array.get(i));
            }
            for (int i = array.size()/2+1; i < array.size(); i++)            {
                outputStream2.write(array.get(i));
            }
        }
        outputStream1.close();
        outputStream2.close();
    }
}
