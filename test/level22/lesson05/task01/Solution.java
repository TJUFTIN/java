package com.javarush.test.level22.lesson05.task01;

/* Найти подстроку
Метод getPartOfString должен возвращать подстроку начиная с символа после 1-го пробела и до конца слова,
которое следует после 4-го пробела.
Пример: "JavaRush - лучший сервис обучения Java."
Результат: "- лучший сервис обучения"
На некорректные данные бросить исключение TooShortStringException (сделать исключением).
Сигнатуру метода getPartOfString не менять.
Метод main не участвует в тестировании.
*/

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string == null)
            throw new TooShortStringException();
        int firstSpace = string.indexOf(" ");
        if (firstSpace == -1)
            throw new TooShortStringException();
        int lastSpace = string.indexOf(" ", firstSpace + 1);
        if (lastSpace == -1)
            throw new TooShortStringException();
        lastSpace = string.indexOf(" ", lastSpace + 1);
        if (lastSpace == -1)
            throw new TooShortStringException();
        lastSpace = string.indexOf(" ", lastSpace + 1);
        if (lastSpace == -1)
            throw new TooShortStringException();
        String afterLastSpace = string.substring(lastSpace + 1);
        System.out.println(afterLastSpace);
        char[] afterLastSpaceArray = afterLastSpace.toCharArray();
        int index = 0;
        if (!Character.isLetter(afterLastSpaceArray[0]))
            throw new TooShortStringException();
        for (int i = 1; i < afterLastSpaceArray.length; i++)
        {
            if (Character.isLetter(afterLastSpaceArray[i]))
                index = i;
            else
                break;
        }
        return string.substring(firstSpace+1, lastSpace + index + 2);
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main (String[] args) throws TooShortStringException
    {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }
}
/*public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string.isEmpty() || string == null) throw  new TooShortStringException();
        int strStart = 0;
        int strEnd = 0;
        int spaceNum = 0;
        int index = -1;

        while (spaceNum < 5) {
            spaceNum++;
            index = string.indexOf(' ', index + 1);

            if (index == -1) {
                if (spaceNum < 5) {
                    throw new TooShortStringException();
                } else {
                    strEnd = string.length() - strStart;
                    //System.out.println(strStart + " " + strEnd);
                    String res = string.substring(strStart,strEnd);
                    return res;
                }
            }
            if (spaceNum == 1) {
                strStart = index;
            }
            strEnd = string.length() - strStart;
            if (spaceNum == 5) {
                strEnd = index;
            }
            //System.out.println(strStart + " " + strEnd);
        }

        String res = string.substring(strStart,strEnd);
        return res;
    }

    public static class TooShortStringException extends RuntimeException {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString ("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString (" JavaRush - лучший сервис "));
        System.out.println(getPartOfString (" JavaRush - лучший сервис"));
    }
}*/
