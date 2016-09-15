package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
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
        reader.close();

        FileInputStream inputStream = new FileInputStream(name1);
        FileOutputStream outputStream1 = new FileOutputStream(name2);
        List<Integer> array = new ArrayList<Integer>();
        while (inputStream.available() > 0) {
            array.add(inputStream.read());
        }
        inputStream.close();

        for (int i = array.size()-1; i >= 0 ; i--)        {
            outputStream1.write(array.get(i));
        }
        outputStream1.close();
    }
}
