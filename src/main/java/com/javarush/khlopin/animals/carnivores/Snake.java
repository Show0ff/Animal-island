package com.javarush.khlopin.animals.carnivores;

import com.javarush.khlopin.animals.plant.Plant;
import com.javarush.khlopin.animals.Carnivores;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.animals.herbivorous.*;

public class Snake extends Carnivores {

    public Properties properties;
    public Probabilities probabilities;

    public Snake() {
        this.properties = new Properties(15, 30, 1, 3, "\uD83D\uDC0D");

        this.probabilities = new Probabilities(this.getClass(), Plant.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Caterpillar.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Duck.class, 10);
        this.probabilities = new Probabilities(this.getClass(), Buffalo.class, 0);
        this.probabilities = new Probabilities(this.getClass(), WildBoar.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Sheep.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Goat.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Mouse.class, 40);
        this.probabilities = new Probabilities(this.getClass(), Rabbit.class, 20);
        this.probabilities = new Probabilities(this.getClass(), Deer.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Horse.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Eagle.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Bear.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Fox.class, 15);
        this.probabilities = new Probabilities(this.getClass(), Snake.class, 0);
        this.probabilities = new Probabilities(this.getClass(), Wolf.class, 0);
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
