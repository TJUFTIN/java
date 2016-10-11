package com.javarush.test.level20.lesson10.home06;

import java.io.*;

/* Запрет сериализации
Запретите сериализацию класса SubSolution используя NotSerializableException.
Сигнатуры классов менять нельзя
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream out) throws IOException
        {
            throw new NotSerializableException("Not now!");
        }

        private void readObject (ObjectInputStream in) throws IOException, ClassNotFoundException{
            throw new NotSerializableException("Not now!");
        }
        //throw new NotSerializableException("Not now!");
    }

}
