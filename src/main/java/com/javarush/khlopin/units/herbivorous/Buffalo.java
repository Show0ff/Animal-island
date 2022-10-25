package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.Unit;

import java.util.List;

public class Buffalo extends Herbivorous {

    private final Properties properties;

    public Buffalo() {
        this.properties = new Properties(700,10,3,100,"\uD83D\uDC03",5);

    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public int getId() {
        return getProperties().id;
    }


}
