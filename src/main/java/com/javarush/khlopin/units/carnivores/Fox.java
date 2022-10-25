package com.javarush.khlopin.units.carnivores;

import com.javarush.khlopin.units.Carnivores;
import com.javarush.khlopin.settings.Properties;

public class Fox extends Carnivores {

    private final Properties properties;


    public Fox() {

        this.properties = new Properties(8,30,2,2, "\uD83E\uDD8A",2);

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
