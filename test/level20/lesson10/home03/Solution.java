package com.javarush.test.level20.lesson10.home03;

import java.io.*;

/* Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найдите проблему и исправьте ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
Сигнатура класса В не содержит ошибку :)
Метод main не участвует в тестировании.
*/
public class Solution implements Serializable {


    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Solution solution = new Solution();
        B b = solution.new B("Bbb");

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("1.txt"));
        outputStream.writeObject(b);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("1.txt"));
        Object object = inputStream.readObject();
        inputStream.close();

        B newB = (B)object;
        System.out.println(newB);
    }

    public static class A {
        protected String name = "A";

        public A(String name) {
            this.name += name;
        }

        public A () {}
    }

    public class B extends A implements Serializable {
        public B(String name) {
            super(name);
            this.name += name;
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.writeObject(name);
        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            name = (String)in.readObject();
        }
    }
}
