package com.javarush.khlopin.field;

import com.javarush.khlopin.animals.Animal;
import com.javarush.khlopin.animals.AnimalCounter;
import com.javarush.khlopin.animals.Herbivorous;
import com.javarush.khlopin.animals.Unit;
import com.javarush.khlopin.settings.Preferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public Cell[][] field;
    private final AnimalCounter animalCounter = new AnimalCounter();

    public GameField() {
    }

    // Заселить поле животными и растениями
    public void initialize() {
        field = new Cell[Preferences.X][Preferences.Y];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = new Cell(i,j);


                ArrayList<? extends Animal> animals =
                for (Animal animal : animals) {
                    int num = ThreadLocalRandom.current().nextInt(0, animal.getProperties().maxCount);
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
