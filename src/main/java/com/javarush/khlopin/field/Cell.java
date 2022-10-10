package com.javarush.khlopin.field;

import com.javarush.khlopin.animals.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell {

    int row;

    int col;

    private Map<String, Set<? extends Animal>> sets = new HashMap<>();

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void makeStep() {
        eat();

        move();

        multiply();
    }

    private static void eat() {

    }

    private static void move() {

    }

    private void multiply() {

    }


}
