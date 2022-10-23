package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.units.Unit;
import com.javarush.khlopin.units.carnivores.*;
import com.javarush.khlopin.units.plant.Plant;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;

import java.util.List;

public class Caterpillar extends Herbivorous {

    private final Properties properties;
    private Probabilities probabilities;

    public Caterpillar() {

        this.properties = new Properties(0.01,1000,0,0,"\uD83D\uDC1B",6);

//        this.probabilities = new Probabilities(this.getClass(), Plant.class, 100);
//        this.probabilities = new Probabilities(this.getClass(), Caterpillar.class, 0);
//        this.probabilities = new Probabilities(this.getClass(), Duck.class, 0);
//        this.probabilities = new Probabilities(this.getClass(), Buffalo.class, 0);
//        this.probabilities = new Probabilities(this.getClass(), WildBoar.class, 0);
//        this.probabilities = new Probabilities(this.getClass(), Sheep.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Goat.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Mouse.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Rabbit.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Deer.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Horse.class, 0);
//        this.probabilities = new Probabilities(this.getClass(), Eagle.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Bear.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Fox.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Snake.class,0);
//        this.probabilities = new Probabilities(this.getClass(), Wolf.class,0);
    }

    @Override
    public void eat(List<Unit> plants) {
        super.eat(plants);
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
