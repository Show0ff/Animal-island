package com.javarush.khlopin.units;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Carnivores extends Animal {


    public void eat(List<Unit> herbivoresList, Unit superUnit) {
        int randomInt;
        Iterator<Unit> iterator = herbivoresList.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            randomInt = ThreadLocalRandom.current().nextInt(100);
            int currentProbability = matrixOfPower[superUnit.getId()][unit.getId()];
            if (randomInt < currentProbability) {
                superUnit.getProperties().foodForSaturation += 2;
                iterator.remove();
            } else {
                superUnit.getProperties().foodForSaturation -= 2;
            }
        }
    }

}
