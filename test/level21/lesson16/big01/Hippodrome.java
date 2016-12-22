package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by IEUser on 03.12.2016.
 */
public class Hippodrome {
    ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();

        game.getHorses().add(new Horse("Horse_1", 3, 0));
        game.getHorses().add(new Horse("Horse_2", 3, 0));
        game.getHorses().add(new Horse("Horse_3", 3, 0));

        game.run();
        game.printWinner();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run () throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(20);
        }
    }

    public void move () {
        for (Horse horse : this.getHorses()) {
            horse.move();
        }
    }

    public void print () {
        for (Horse horse : this.getHorses()) {
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        double maxDistance = 0;
        Horse winHorse = null;

        for (Horse horse : this.getHorses()) {
            if (horse.getDistance() > 0) {
                maxDistance = horse.getDistance();
                winHorse = horse;
            }
        }

        return  winHorse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
