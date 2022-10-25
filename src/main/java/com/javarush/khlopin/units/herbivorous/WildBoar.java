package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;


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

}
