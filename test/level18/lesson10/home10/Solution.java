package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File result = null;
        String name = "";
        Map<Integer,byte[]> array = new TreeMap<Integer,byte[]>();

        while (!(name = reader.readLine()).equals("end")) {
            String[] namePart = name.split("\\.");
            if (result == null) {
                StringBuilder str = new StringBuilder();
                for (int i = 0; i < namePart.length-1; i++)        {
                    str.append(namePart[i]+".");
                }
                String fileName = str.substring(0,str.length()-1);
                result = new File(fileName);
                result.createNewFile();
            }

            int num = (  Integer.parseInt(namePart[namePart.length - 1].substring(4))  );
            FileInputStream inputStream = new FileInputStream(name);

            while (inputStream.available() > 0) {
                byte[] arrayByte = new byte[inputStream.available()];
                inputStream.read(arrayByte);
                array.put(num,arrayByte);
            }
            inputStream.close();
        }
        reader.close();

        FileOutputStream outputStream = new FileOutputStream(result);
        for (Map.Entry<Integer,byte[]> pair : array.entrySet()) {
            outputStream.write(pair.getValue());
            outputStream.write(("\r\n").getBytes());
        }
        outputStream.close();
    }
}
