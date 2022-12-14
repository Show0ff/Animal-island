package com.javarush.khlopin.units.carnivores;


import com.javarush.khlopin.units.Carnivores;

import com.javarush.khlopin.settings.Properties;


public class Snake extends Carnivores {

    private final Properties properties;


    public Snake() {
        this.properties = new Properties(15, 30, 1, 3, "\uD83D\uDC0D", 3);

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
