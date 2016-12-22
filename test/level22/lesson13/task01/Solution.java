package com.javarush.test.level22.lesson13.task01;

import java.util.ArrayList;
import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static String [] getTokens(String query, String delimiter) {
        if (query == null || query.isEmpty()) return null;
        if (delimiter == null || delimiter.isEmpty()) {
            String[] str1 = new String[1];
            str1[0] = query;
            return str1;
        }

        ArrayList<String> str = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        while (stringTokenizer.hasMoreTokens()) {
            str.add(stringTokenizer.nextToken());
        }

        String[] strings = new String[str.size()];
        for (int i = 0; i < str.size(); i++) {
            strings[i] = str.get(i);
        }

        return strings;
    }

    public static void main(String[] args) {
        String[] s = getTokens("level22.lesson13.task01", ".");
        for (String str : s) {
            System.out.println(str);
        }
    }
}
