package com.javarush.test.level20.lesson10.home02;

import java.io.*;

/* Десериализация
На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуйте объект в методе getOriginalObject предварительно определив, какого именно типа там объект.
Реализуйте интерфейс Serializable где необходимо.
*/
public class Solution implements Serializable{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Solution solution = new Solution();
        A a = solution.new A();
        B b = solution.new B();

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("1.txt"));
        outputStream.writeObject(a);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("1.txt"));
        solution.getOriginalObject(inputStream);
        inputStream.close();
    }

    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException
    {
        Object object =  objectStream.readObject();
        if (object instanceof B) {
            return (B)object;
        }
        return (A)object;
    }

    public class A implements Serializable{
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }
}
