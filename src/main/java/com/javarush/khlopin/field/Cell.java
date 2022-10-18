package com.javarush.khlopin.field;

import com.javarush.khlopin.units.Animal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cell {

    private int row;
     private int col;

    public Map<Animal, List<Animal>> sets = new HashMap<>();


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

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
