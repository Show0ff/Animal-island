package com.javarush.khlopin.field;

import com.javarush.khlopin.units.*;
import com.javarush.khlopin.units.carnivores.Fox;
import com.javarush.khlopin.units.carnivores.Snake;
import com.javarush.khlopin.units.carnivores.Wolf;
import com.javarush.khlopin.settings.Preferences;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public Cell[][] field;
    private final AnimalCounter animalCounter = new AnimalCounter();

    public List<Animal> animals = Arrays.asList(new Snake(), new Wolf(), new Fox());


    public GameField() {

    }

    // Заселить поле животными и растениями
    public void initialize() {
        field = new Cell[Preferences.X][Preferences.Y];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = new Cell(i,j);


                for (Animal animal : animals) {
                    int num = ThreadLocalRandom.current().nextInt(0, animal.getProperties().maxCount);
                    Set<Unit> typeSet = new HashSet<>(); }


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
