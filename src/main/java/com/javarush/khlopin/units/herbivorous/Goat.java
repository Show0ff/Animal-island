package com.javarush.khlopin.units.herbivorous;


import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;


public class Goat extends Herbivorous {

    private final Properties properties;


    public Goat() {
        this.properties = new Properties(60,140,3,10,"\uD83D\uDC10",9);

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
