package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.Unit;
import com.javarush.khlopin.units.carnivores.*;
import com.javarush.khlopin.units.plant.Plant;

import java.util.List;

public class Deer extends Herbivorous {


    private final Properties properties;

    public Deer() {
        this.properties = new Properties(300,20,4,50,"\uD83E\uDD8C",7);

    }

    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public int getId() {
        return getProperties().id;
    }

    @Override
    public void eat(List<Unit> plants) {
        super.eat(plants);
    }
}
