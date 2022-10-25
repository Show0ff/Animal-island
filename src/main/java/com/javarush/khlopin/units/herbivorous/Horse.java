package com.javarush.khlopin.units.herbivorous;


import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;



public class Horse extends Herbivorous {

    private final Properties properties;

    public Horse() {
        this.properties = new Properties(400,20,4,60,"\uD83D\uDC0E",10);


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
