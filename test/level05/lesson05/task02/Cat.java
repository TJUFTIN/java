package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat(/*String name, int age, int weight, int strength*/)
    {
        String name;
        int age;
        int weight;
        int strength;
    }

    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
        cat1.name="Tom";
        cat1.age=1;
        cat1.weight=5;
        cat1.strength=7;
        Cat cat2 = new Cat();
        cat1.name="Tim";
        cat1.age=5;
        cat1.weight=7;
        cat1.strength=3;
        System.out.println(cat1.fight(cat2));
        //System.out.println(cat2.fight(cat1));
    }

    public boolean fight(Cat anotherCat)
    {
//        System.out.println(this.name);
//        System.out.println(name);
//        System.out.println(anotherCat.name);
//
//        return true;

        int agePlus = this.age > anotherCat.age ? 1 : 0;
        int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
        int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

        int score = agePlus + weightPlus + strengthPlus;
        return score > 2;//напишите тут ваш код
    }


}
