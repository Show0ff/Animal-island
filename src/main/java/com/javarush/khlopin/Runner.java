package com.javarush.khlopin;

import com.javarush.khlopin.field.GameField;
import com.javarush.khlopin.units.AnimalCounter;

import java.lang.reflect.InvocationTargetException;


public class Runner {
    public static void main(String[] args) throws ClassNotFoundException {

        AnimalCounter animalCounter = new AnimalCounter();
        animalCounter.getAllUnits();

    }
}
