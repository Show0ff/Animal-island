package com.javarush.khlopin.field;

import com.javarush.khlopin.units.Unit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell {

    private int row;
     private int col;

    private Map<String, Set<? extends Unit>> sets = new HashMap<>();


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
