package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("d:/dev/" + text)));

        writer.write(text + "\n");

        while (true) {
            if (!text.equals("exit")) {
                text = reader.readLine();
                writer.write(text + "\n");
            } else {
                break;
            }
        }*/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        FileOutputStream writer = new FileOutputStream(text);

        while (true) {
            text = reader.readLine();
            if (text.equals("exit")) {
                writer.write(text.getBytes());
                break;
            } else {
                writer.write((text + "\r\n").getBytes());
            }
        }

        reader.close();
        writer.close();
    }
}
