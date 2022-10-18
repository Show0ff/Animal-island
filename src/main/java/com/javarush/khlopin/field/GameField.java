package com.javarush.khlopin.field;

import com.javarush.khlopin.settings.Preferences;
import com.javarush.khlopin.units.*;
import com.javarush.khlopin.units.carnivores.*;
import com.javarush.khlopin.units.herbivorous.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public Cell[][] field = new Cell[Preferences.X][Preferences.Y];
    public final List<Animal> animals = Arrays.asList(new Wolf(), new Snake(), new Fox(), new Eagle(), new Bear(), new Buffalo(), new Caterpillar(),
            new Deer(), new Duck(), new Goat(), new Horse(), new Mouse(), new Rabbit(), new Sheep(), new WildBoar());



    public GameField() {

    }

    // Заселить поле животными и растениями
    public void initialize()  {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++)

            {
                for (Animal animal : animals) {
                    int num = ThreadLocalRandom.current().nextInt(0, animal.getProperties().maxCount);

                    List<Animal> animalList = new ArrayList<>();

                    for (int i1 = 0; i1 < num; i1++) {
                        animalList.add(animal);
                    }

                    Cell cell = new Cell(i,j);
                    cell.sets.put(animal,animalList);
                    field[i][j] = cell;
                    System.out.println(cell.sets);
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
