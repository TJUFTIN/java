package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> child = new ArrayList<Human>();
        Human son1 = new Human("Сын1", true, 20, new ArrayList<Human>());
        Human son2 = new Human("Сын2", true, 21, new ArrayList<Human>());
        Human dot1 = new Human("Дочь1", false, 22, new ArrayList<Human>());
        child.add(son1);
        child.add(son2);
        child.add(dot1);

        ArrayList<Human> father1 = new ArrayList<Human>();
        Human father = new Human("Папа", true, 40, child);
        father1.add(father);

        ArrayList<Human> mother1 = new ArrayList<Human>();
        Human mother = new Human("Мама", false, 39, child);
        mother1.add(mother);

        Human ded1 = new Human("Дед1", true, 71, father1);
        Human ded2 = new Human("Дед2", true, 70, mother1);
        Human bab1 = new Human("Баб1", false, 69, father1);
        Human bab2 = new Human("Баб2", false, 68, mother1);

        for (Human ab : child) {
            System.out.println(ab);
        }

        System.out.println(father);
        System.out.println(mother);
        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);

        //напишите тут ваш код
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();
        //напишите тут ваш код

        public Human (String name, boolean sex, int age, ArrayList<Human> children) {
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children=children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
