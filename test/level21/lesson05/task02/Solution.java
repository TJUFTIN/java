package com.javarush.test.level21.lesson05.task02;

import java.util.HashSet;
import java.util.Set;

/* Исправить ошибку
Сравнение объектов Solution не работает должным образом. Найти ошибку и исправить.
Метод main не участвует в тестировании.
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution n = (Solution) o;
        boolean firstPart = (first != null) ? first.equals(n.first) : n.first == null;
        boolean lastPart = (last != null) ? last.equals(n.last) : n.last == null;
        return firstPart && lastPart;
    }

    @Override
    public int hashCode()
    {
        int firstashCode = (first == null) ? 0 : first.hashCode();
        int lastashCode = (last == null) ? 0 : last.hashCode();
        return 31 * (firstashCode + lastashCode);
    }

    public static void main(String[] args) {

        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
