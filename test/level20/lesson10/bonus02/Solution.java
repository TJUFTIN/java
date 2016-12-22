package com.javarush.test.level20.lesson10.bonus02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* Алгоритмы-прямоугольники
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int x = 0;
        //int[] listX = new int[a.length];
        boolean previusIsOur = false;
        int value;
        List<Integer> listX1 = new ArrayList<Integer>();
        List<Integer> listX2 = new ArrayList<Integer>();

        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                value = a[i][j];

                if (value == 1) {
                    listX1.add(i);

                    if (j > 0) {
                        if (i > 0) {
                            if (a[i][j-1] == 0 && a[i-1][j] == 0) x++;
                        } else {
                            if (a[i][j-1] == 0) x++;
                        }
                    } else {
                        if (i > 0) {
                            if (a[i-1][j] == 0) {
                                x++;
                            }
                        } else {
                            x++;
                        }
                    }
                }
            }
            listX2.clear();
            listX2.addAll(0,listX1);
            listX1.clear();
        }
        System.out.println(x);
        return x;
    }
}
