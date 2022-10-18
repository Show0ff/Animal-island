package com.javarush.khlopin.units;

import com.javarush.khlopin.field.Cell;
import com.javarush.khlopin.settings.Preferences;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal extends Unit {

    private boolean isMove = true;
    public abstract Properties getProperties();
    public abstract Probabilities getProbabilities();
    public void move(Cell cell) {
        int newRow = cell.getRow() + ThreadLocalRandom.current().nextInt(1, getProperties().maxSpeed);
        int newCol = cell.getCol() + ThreadLocalRandom.current().nextInt(1, getProperties().maxSpeed);

        if (newRow >= Preferences.Y || newCol >= Preferences.X || newCol < 0 || newRow < 0 ) {
            isMove = false;
        }

        if (newRow >= cell.getRow() && newCol >= cell.getCol()) {
            isMove = false;
        }

        if (isMove) {
            // из старой ячейки удаляем животное, а в новую записываем

        }
    }


    public void multiply() {
    }




}
