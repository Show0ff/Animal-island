package com.javarush.khlopin.units;

import com.javarush.khlopin.settings.Preferences;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Carnivores extends Animal {


    public void eat(List<Unit> herbivoresList, Unit superUnit) {
        Iterator<Unit> iterator = herbivoresList.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            int randomInt = ThreadLocalRandom.current().nextInt(100);
            int currentProbability = Preferences.matrixOfPower[superUnit.getId()][unit.getId()];
            if (randomInt < currentProbability) {
                superUnit.getProperties().foodForSaturation += Preferences.ADD_SATIETY_FOR_FOOD;
                iterator.remove();
            } else {
                superUnit.getProperties().foodForSaturation -= Preferences.REDUCE_SATIETY_FOR_FOOD;
            }
        }
    }

}
