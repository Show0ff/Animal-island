package com.javarush.khlopin.units.herbivorous;


import com.javarush.khlopin.settings.Preferences;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.Unit;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Duck extends Herbivorous {


    private final Properties properties;

    public Duck() {
        this.properties = new Properties(1, 200, 4, 0.15, "\uD83E\uDD86", 8);


    }


    @Override
    public void eat(List<Unit> herbivoresList, Unit superUnit) {
        int randomInt;
        Iterator<Unit> iterator = herbivoresList.iterator();
        while (iterator.hasNext()) {
            Unit unit = iterator.next();
            if (unit instanceof Caterpillar) {
                randomInt = ThreadLocalRandom.current().nextInt(100);
                int currentProbability = Preferences.matrixOfPower[superUnit.getId()][unit.getId()];
                if (randomInt < currentProbability) {
                    superUnit.getProperties().foodForSaturation += 10;
                    iterator.remove();
                } else {
                    superUnit.getProperties().foodForSaturation -= 1;
                }
            }
        }
    }

    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public int getId() {
        return getProperties().id;
    }

}
