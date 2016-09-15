package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);
        //fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }

    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
       String s;
//        int n,m;
//        for (int j = 0; j < list.size(); j++)
//        {
//            n = 0;
//            m = 0;
//            s=list.get(j);
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i)=='р') {
//                    for (int k = 0; k < s.length(); k++) {
//                        if (s.charAt(k)=='л') {
//                            n++;
//                        }
//                    }
//                    if (n == 0) {
//                        list.remove(j);
//                        j--;
//                    }
//
//                }
//            }
//
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i)=='л') {
//                    for (int k = 0; k < s.length(); k++) {
//                        if (s.charAt(k)=='р') {
//                            m++;
//                        }
//                    }
//                    if (m == 0) {
//                        list.add(j+1,list.get(j));
//                        j++;
//                    }
//
//                }
//            }
//
//        }
        for (int i = 0; i < list.size(); i++) {
            s = list.get(i);
            if (s.contains("р")) {
                if (!s.contains("л")) {
                    list.remove(i);
                    i--;
                }
            }
            if (s.contains("л")) {
                if (!s.contains("р")) {
                    list.add(i,s);
                    i++;
                }
            }
        }


        //напишите тут ваш код
        return list;
        //return null;
    }
}