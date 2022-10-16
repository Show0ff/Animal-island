package com.javarush.khlopin.animals.herbivorous;

import com.javarush.khlopin.animals.plant.Plant;
import com.javarush.khlopin.animals.Herbivorous;
import com.javarush.khlopin.settings.Properties;

public class Caterpillar extends Herbivorous {

    Properties properties = new Properties(0.01,1000,0,0,"\uD83D\uDC1B");

    @Override
    public void eat(Plant plant) {
        super.eat(plant);
    }
}
