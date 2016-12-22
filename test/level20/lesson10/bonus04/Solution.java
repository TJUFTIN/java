package com.javarush.test.level20.lesson10.bonus04;

import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* Свой список
Посмотреть, как реализован LinkedList.
Элементы следуют так: 1->2->3->4  и так 4->3->2->1
По образу и подобию создать Solution.
Элементы должны следовать так:
1->3->7->15
    ->8...
 ->4->9
    ->10
2->5->11
    ->12
 ->6->13
    ->14
Удалили 2 и 9
1->3->7->15
    ->8
 ->4->10
Добавили 16,17,18,19,20 (всегда добавляются на самый последний уровень к тем элементам, которые есть)
1->3->7->15
       ->16
    ->8->17
       ->18
 ->4->10->19
        ->20
Удалили 18 и 20
1->3->7->15
       ->16
    ->8->17
 ->4->10->19
Добавили 21 и 22 (всегда добавляются на самый последний уровень к тем элементам, которые есть.
Последний уровень состоит из 15, 16, 17, 19. 19 последний добавленный элемент, 10 - его родитель.
На данный момент 10 не содержит оба дочерних элемента, поэтому 21 добавился к 10. 22 добавляется в следующий уровень.)
1->3->7->15->22
       ->16
    ->8->17
 ->4->10->19
        ->21

Во внутренней реализации элементы должны добавляться по 2 на каждый уровень
Метод getParent должен возвращать элемент, который на него ссылается.
Например, 3 ссылается на 7 и на 8, т.е.  getParent("8")=="3", а getParent("13")=="6"
Строки могут быть любыми.
При удалении элемента должна удаляться вся ветка. Например, list.remove("5") должен удалить "5", "11", "12"
Итерироваться элементы должны в порядке добавления
Доступ по индексу запрещен, воспользуйтесь при необходимости UnsupportedOperationException
Должно быть наследование AbstractList<String>, List<String>, Cloneable, Serializable
Метод main в тестировании не участвует
*/
public class Solution extends AbstractList<String> implements List<String>, Cloneable, Serializable{
    public static void main(String[] args) {
        List<String> list = new Solution();
        for (int i = 1; i < 16; i++) {
            list.add(String.valueOf(i));
        }
        System.out.println("Expected 3, actual is " + ((Solution) list).getParent("8"));
        list.remove("5");
        System.out.println("Expected null, actual is " + ((Solution) list).getParent("11"));
    }

    public Solution () {

    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean removeIf(Predicate<? super String> filter)
    {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<String> operator)
    {

    }

    @Override
    public void sort(Comparator<? super String> c)
    {

    }

    @Override
    public String get(int index)
    {
        return null;
    }

    @Override
    public void forEach(Consumer<? super String> action)
    {

    }

    @Override
    public Spliterator<String> spliterator()
    {
        return null;
    }

    @Override
    public Stream<String> stream()
    {
        return null;
    }

    @Override
    public Stream<String> parallelStream()
    {
        return null;
    }

    transient int size = 0;

    private static class Node {
        static int id = 0;
        String item;
        Node parent;
        Node left;
        Node rigth;
        //int nodeId;

        Node (String item, Node parent, Node left, Node rigth) {
            this.item = item;
            this.parent = parent;
            this.left = null;
            this.rigth = null;
            //this.nodeId = id++;
        }

        void clear() {
            this.item = null;
            this.parent = null;
            this.left = null;
            this.rigth = null;
            //this.nodeId = 0;
        }
    }

    private LinkedList<Node> list = new LinkedList<>();

    public String getParent(String value) {
        if (value == null) {
            for(Node node : list) {
                if (node.item == null) return node.parent.item;
            }
        } else {
            for (Node node : list) {
                if (node.item.equals(value)) return node.parent.item;
            }
        }
        return null;
    }



}
