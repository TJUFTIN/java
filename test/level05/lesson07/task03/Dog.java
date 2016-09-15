package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    String name;
    int higth;
    String color;

    public void initialize(String name) {
        this.name=name;
    }
    public void initialize(String name,int higth) {
        this.name=name;
        this.higth=higth;
    }
    public void initialize(String name,int higth,String color) {
        this.name=name;
        this.higth=higth;
        this.color=color;
    }

    //напишите тут ваш код

}
