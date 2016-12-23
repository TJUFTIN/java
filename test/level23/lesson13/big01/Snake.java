package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

/**
 * Created by IEUser on 22.12.2016.
 */
public class Snake {
    ArrayList<SnakeSection> sections;
    boolean isAlive;
    SnakeDirection direction;

    public ArrayList<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public Snake(int x, int y) {
        SnakeSection snakeHead = new SnakeSection(x, y);
        sections = new ArrayList<SnakeSection>();
        sections.add(snakeHead);
        isAlive = true;
    }

    public int getX () {
        return sections.get(0).getX();
    }

    public int getY () {
        return sections.get(0).getY();
    }

    void move() {
    }
}
