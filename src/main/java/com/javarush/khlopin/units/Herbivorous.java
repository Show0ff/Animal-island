package com.javarush.khlopin.units;

import com.javarush.khlopin.settings.Preferences;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Herbivorous extends Animal{
    public void eat(List<Unit> plants, Unit superUnit) {
        int randomInt;
        Iterator<Unit> iterator = plants.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            randomInt = ThreadLocalRandom.current().nextInt(Preferences.CHANCE_TO_EAT_PLANT); //Вероятность поедания травы
            if (randomInt == 1) {
                superUnit.getProperties().foodForSaturation += 2;
            iterator.remove();
            } else {
                superUnit.getProperties().foodForSaturation -= 2;
            }
        }
    }
}
