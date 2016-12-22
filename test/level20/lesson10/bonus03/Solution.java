package com.javarush.test.level20.lesson10.bonus03;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Кроссворд
1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> list = detectAllWords(crossword, "home", "same", "jj", "o", "pohej", "fulm");
        //List<Word> list = detectAllWords(crossword, "fulm");
        for (Word str: list) {
            System.out.println(str);
        }

        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> list = new ArrayList<>();
        Word word;
        int x1, y1, x2, y2, wordLength;

        for (int i = 0; i < words.length; i++) {
            word = new Word(words[i]);
            wordLength = word.text.length();
                        if (wordLength > 0 ) {
                for (int j = 0; j < crossword.length; j++) {
                    for (int k = 0; k < crossword[0].length; k++) {
                        if (crossword[j][k] == word.text.charAt(0)) {
                            x1 = j;
                            y1 = k;
                            if (wordLength > 1) {

                                x2 = x1-wordLength+1;
                                y2 = y1-wordLength+1;
                                boolean b = true;
                                int wordLength1 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength1-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength1 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1-wordLength+1,x1-wordLength+1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength1--;
                                            x2 = x1-wordLength1+1;
                                            y2 = y1-wordLength1+1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                                x2 = x1-wordLength+1;
                                y2 = y1;
                                b = true;
                                int wordLength2 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength2-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength2 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1,x1-wordLength+1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength2--;
                                            x2 = x1-wordLength2+1;
                                            y2 = y1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                                x2 = x1-wordLength+1;
                                y2 = y1+wordLength-1;
                                b = true;
                                int wordLength3 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength3-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength3 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1+wordLength-1,x1-wordLength+1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength3--;
                                            x2 = x1-wordLength3+1;
                                            y2 = y1+wordLength3-1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                                x2 = x1;
                                y2 = y1-wordLength+1;
                                b = true;
                                int wordLength4 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength4-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength4 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1-wordLength+1,x1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength4--;
                                            x2 = x1;
                                            y2 = y1-wordLength4+1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                                x2 = x1;
                                y2 = y1+wordLength-1;
                                b = true;
                                int wordLength5 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength5-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength5 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1+wordLength-1,x1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength5--;
                                            x2 = x1;
                                            y2 = y1+wordLength5-1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                                x2 = x1+wordLength-1;
                                y2 = y1-wordLength+1;
                                b = true;
                                int wordLength6 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength6-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength6 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1-wordLength+1,x1+wordLength-1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength6--;
                                            x2 = x1+wordLength6-1;
                                            y2 = y1-wordLength6+1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                                x2 = x1+wordLength-1;
                                y2 = y1;
                                b = true;
                                int wordLength7 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength7-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength7 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1,x1+wordLength-1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength7--;
                                            x2 = x1+wordLength7-1;
                                            y2 = y1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                                x2 = x1+wordLength-1;
                                y2 = y1+wordLength-1;
                                b = true;
                                int wordLength8 = wordLength;
                                if (x2 < 0 || y2 < 0 || x2 > (crossword.length -1) || y2 > (crossword[0].length -1)) b = false;
                                while (b) {
                                    try {
                                        if (crossword[x2][y2] != word.text.charAt(wordLength8-1)) {
                                            b = false;
                                        } else {
                                            if (wordLength8 == 2) {
                                                word.setStartPoint(y1,x1);
                                                word.setEndPoint(y1+wordLength-1,x1+wordLength-1);
                                                boolean duble = false;
                                                for (Word str: list) {
                                                    if (str.text.equals(word.text)) duble = true;
                                                }
                                                if (duble == false) list.add(word);
                                                word = new Word(words[i]);

                                                b = false;
                                            }
                                            wordLength8--;
                                            x2 = x1+wordLength8-1;
                                            y2 = y1+wordLength8-1;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e) {}
                                }

                            } else {
                                word.setStartPoint(x1,y1);
                                word.setEndPoint(x1,y1);
                                boolean duble = false;
                                for (Word str: list) {
                                    if (str.text.equals(word.text)) duble = true;
                                }
                                if (duble == false) list.add(word);
                                word = new Word(words[i]);
                            }
                        }
                    }
                }
            }


        }

        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
