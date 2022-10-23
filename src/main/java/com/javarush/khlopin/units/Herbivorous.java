package com.javarush.khlopin.units;

import com.javarush.khlopin.units.plant.Plant;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivorous extends Animal{
    public void eat(List<Unit> plants) {
        int randomInt;
        Iterator<Unit> iterator = plants.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            randomInt = ThreadLocalRandom.current().nextInt(2);
            if (randomInt == 1)
            iterator.remove();
        }
    }
}
