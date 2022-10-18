package com.javarush.khlopin.field;

import com.javarush.khlopin.units.*;
import com.javarush.khlopin.units.carnivores.Fox;
import com.javarush.khlopin.units.carnivores.Snake;
import com.javarush.khlopin.units.carnivores.Wolf;
import com.javarush.khlopin.settings.Preferences;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public Cell[][] field;
    private final AnimalCounter animalCounter = new AnimalCounter();

//    public ArrayList<Class<?>> animals = animalCounter.getAllUnits();


    public GameField() {

    }

    // Заселить поле животными и растениями
    public void initialize() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        field = new Cell[Preferences.X][Preferences.Y];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = new Cell(i,j);
                ArrayList<Class<?>> herbivorous = animalCounter.getAllUnits();
                for (Class<?> animal : herbivorous) {
                    Constructor<?> constructor = animal.getConstructor();
                    Animal animalTest = (Animal) constructor.newInstance();
                    int maxCount = animalTest.getProperties().maxCount;
                    int num = ThreadLocalRandom.current().nextInt(0, maxCount);
                    System.out.println(num);
                    Set<Unit> typeSet = new HashSet<>();
                }
            }
        }

    }

    // Сделать шаг (пробижаться по всем ячейкам)
    public void makeStep() {

    }

    // Вывести статистику
    public void printState() {

    }


}
