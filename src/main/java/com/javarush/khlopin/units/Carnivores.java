package com.javarush.khlopin.units;

import com.javarush.khlopin.settings.Probabilities;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Carnivores extends Animal {


    public void eat(List<Unit> herbivoresList, Unit unitSUPER) {
        int randomInt;
        Iterator<Unit> iterator = herbivoresList.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            randomInt = ThreadLocalRandom.current().nextInt(100);
            int currentProbability = matrixOfPower[unitSUPER.getId()][unit.getId()];
            if (randomInt < currentProbability) {
                iterator.remove();
            }
        }
    }

}
