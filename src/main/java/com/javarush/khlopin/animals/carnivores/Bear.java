package com.javarush.khlopin.animals.carnivores;

import com.javarush.khlopin.animals.plant.Plant;
import com.javarush.khlopin.animals.Carnivores;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.animals.herbivorous.*;

public class Bear extends Carnivores {
    public Properties properties;
    public Probabilities probabilities;

    public Bear() {
        this.properties = new Properties(500,5,2,80, "\uD83D\uDC3B");

        this.probabilities = new Probabilities(this.getClass(), Plant.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Caterpillar.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Duck.class, 10);
        this.probabilities = new Probabilities(this.getClass(), Buffalo.class, 20);
        this.probabilities = new Probabilities(this.getClass(), WildBoar.class, 50);
        this.probabilities = new Probabilities(this.getClass(), Sheep.class,70);
        this.probabilities = new Probabilities(this.getClass(), Goat.class,70);
        this.probabilities = new Probabilities(this.getClass(), Mouse.class,90);
        this.probabilities = new Probabilities(this.getClass(), Rabbit.class,80);
        this.probabilities = new Probabilities(this.getClass(), Deer.class,80);
        this.probabilities = new Probabilities(this.getClass(), Horse.class, 40);
        this.probabilities = new Probabilities(this.getClass(), Eagle.class,0);
        this.probabilities = new Probabilities(this.getClass(), Bear.class,0);
        this.probabilities = new Probabilities(this.getClass(), Fox.class,0);
        this.probabilities = new Probabilities(this.getClass(), Snake.class,80);
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