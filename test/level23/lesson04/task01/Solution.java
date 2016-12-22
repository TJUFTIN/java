package com.javarush.test.level23.lesson04.task01;

/* Inner
Реализовать метод getTwoSolutions, который должен возвращать массив из 2-х экземпляров класса Solution.
Для каждого экземпляра класса Solution инициализировать поле innerClasses двумя значениями.
Инициализация всех данных должна происходить только в методе getTwoSolutions.
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] solutions = new Solution[2];

        Solution solution = new Solution();
        solution.innerClasses = new InnerClass[2];
        solution.innerClasses[0] = solution.new InnerClass();
        solution.innerClasses[1] = solution.new InnerClass();
        solutions[0] = solution;

        solution = new Solution();
        solution.innerClasses = new InnerClass[]{solution.new InnerClass(), solution.new InnerClass()};
        solutions[1] = solution;

        return solutions;
    }
}
