package com.javarush.khlopin.units.carnivores;

import com.javarush.khlopin.units.plant.Plant;
import com.javarush.khlopin.units.Carnivores;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.herbivorous.*;

public class Eagle extends Carnivores {

    private final Properties properties;


    public Eagle() {
        this.properties = new Properties(6,20,3,1, "\uD83E\uDD85", 1);

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
