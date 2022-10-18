package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.carnivores.*;
import com.javarush.khlopin.units.plant.Plant;

public class Mouse extends Herbivorous {


    private final Properties properties;
    private Probabilities probabilities;

    public Mouse() {
        this.properties = new Properties(0.05,500,1,0.001, "\uD83D\uDC01");

        this.probabilities = new Probabilities(this.getClass(), Plant.class, 100);
        this.probabilities = new Probabilities(this.getClass(), Caterpillar.class, 90);
        this.probabilities = new Probabilities(this.getClass(), Duck.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Buffalo.class, 0);
        this.probabilities = new Probabilities(this.getClass(), WildBoar.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Sheep.class,0);
        this.probabilities = new Probabilities(this.getClass(), Goat.class,0);
        this.probabilities = new Probabilities(this.getClass(), Mouse.class,0);
        this.probabilities = new Probabilities(this.getClass(), Rabbit.class,0);
        this.probabilities = new Probabilities(this.getClass(), Deer.class,0);
        this.probabilities = new Probabilities(this.getClass(), Horse.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Eagle.class,0);
        this.probabilities = new Probabilities(this.getClass(), Bear.class,0);
        this.probabilities = new Probabilities(this.getClass(), Fox.class,0);
        this.probabilities = new Probabilities(this.getClass(), Snake.class,0);
        this.probabilities = new Probabilities(this.getClass(), Wolf.class,0);
    }
    @Override
    public Properties getProperties() {
        return properties;
    }
    @Override
    public Probabilities getProbabilities() {
        return probabilities;
    }
}