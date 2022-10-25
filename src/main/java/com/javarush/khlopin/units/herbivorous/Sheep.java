package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.Unit;

import java.util.List;

public class Sheep extends Herbivorous {

    private final Properties properties;


    public Sheep() {

        properties = new Properties(70,140,3,15,"\uD83D\uDC11",13);

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
