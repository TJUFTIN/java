package com.javarush.test.level22.lesson09.task01;

import java.io.*;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader reader1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<String> data = new ArrayList<>();
        while (reader1.ready()) {
            data.addAll(Arrays.asList(reader1.readLine().split(" ")));
        }
        reader1.close();

        Map<String, String > pair = new HashMap<>();
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.size(); j++) {
                StringBuilder str = new StringBuilder(data.get(j));
                if (data.get(i).equals(str.reverse().toString()) && !pair.containsKey(str.reverse().toString()) && i != j) {
                    pair.put(data.get(i),str.toString());
                }
            }
        }

        for (Map.Entry<String,String> mapPair: pair.entrySet()) {
            Pair bufPair = new Pair();
            bufPair.first = mapPair.getKey();
            bufPair.second = mapPair.getValue();
            result.add(bufPair);
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
