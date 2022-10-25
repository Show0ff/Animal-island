package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.units.Unit;
import com.javarush.khlopin.units.carnivores.*;
import com.javarush.khlopin.units.plant.Plant;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;

import java.util.List;

public class Caterpillar extends Herbivorous {

    private final Properties properties;


    public Caterpillar() {

        this.properties = new Properties(0.01,1000,1,0,"\uD83D\uDC1B",6);

    }

    @Override
    public void eat(List<Unit> plants) {
        super.eat(plants);
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
