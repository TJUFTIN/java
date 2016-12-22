package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static StringBuilder getCondition(Map<String, String> params) {
        StringBuilder str = new StringBuilder();
        for (Map.Entry<String,String> pair : params.entrySet()) {
            if (pair.getValue() != null && !pair.getValue().equals("null")) {
                str.append(pair.getKey());
                str.append(" = '");
                str.append(pair.getValue());
                str.append("' and ");
            }
        }

        if (str.length() > 0) {
            str = new StringBuilder(str.substring(0, str.length() - 5));
        }
        return str;
    }

    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("name","Ivanov");
        params.put("coutry","Ukraine");
        params.put("city","Kiev");
        params.put("age","null");

        System.out.println(getCondition(params));
    }
}
