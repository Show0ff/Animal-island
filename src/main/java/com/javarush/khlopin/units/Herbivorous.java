package com.javarush.khlopin.units;

import com.javarush.khlopin.settings.Preferences;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivorous extends Animal {
    public void eat(List<Unit> plants, Unit superUnit) {

        Iterator<Unit> iterator = plants.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            int randomInt = ThreadLocalRandom.current().nextInt(Preferences.CHANCE_TO_EAT_PLANT); //Вероятность поедания травы
            if (randomInt == 1) {
                superUnit.getProperties().satiety += Preferences.ADD_SATIETY_FOR_FOOD;
                iterator.remove();
            } else {
                superUnit.getProperties().satiety += Preferences.REDUCE_SATIETY_FOR_FOOD;
            }
        }
    }
}
