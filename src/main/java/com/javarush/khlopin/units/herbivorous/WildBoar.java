package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.Unit;
import com.javarush.khlopin.units.carnivores.*;
import com.javarush.khlopin.units.plant.Plant;

import java.util.List;

public class WildBoar extends Herbivorous {
    private final Properties properties;


    public WildBoar() {
        this.properties = new Properties(400,50,2,50,"\uD83D\uDC11",14);
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
