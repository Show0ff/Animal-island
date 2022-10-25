package com.javarush.khlopin.units.herbivorous;


import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;


public class Rabbit extends Herbivorous {

    private final Properties properties;



    public Rabbit() {
        properties = new Properties(2, 150, 2, 0.45, "\uD83D\uDC07",12);

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
