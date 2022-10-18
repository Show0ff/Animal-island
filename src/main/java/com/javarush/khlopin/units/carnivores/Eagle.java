package com.javarush.khlopin.units.carnivores;

import com.javarush.khlopin.units.plant.Plant;
import com.javarush.khlopin.units.Carnivores;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.herbivorous.*;

public class Eagle extends Carnivores {

    private final Properties properties;
    private Probabilities probabilities;

    public Eagle() {
        this.properties = new Properties(6,20,3,1, "\uD83E\uDD85");

        this.probabilities = new Probabilities(this.getClass(), Plant.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Caterpillar.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Duck.class, 80);
        this.probabilities = new Probabilities(this.getClass(), Buffalo.class, 0);
        this.probabilities = new Probabilities(this.getClass(), WildBoar.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Sheep.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Goat.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Mouse.class, 90);
        this.probabilities = new Probabilities(this.getClass(), Rabbit.class, 90);
        this.probabilities = new Probabilities(this.getClass(), Deer.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Horse.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Eagle.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Bear.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Fox.class, 10);
        this.probabilities = new Probabilities(this.getClass(), Snake.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Wolf.class, 0);
    }


    public Probabilities getProbabilities() {
        return probabilities;
    }

    @Override
    public Properties getProperties() {
        return properties;
    }
}