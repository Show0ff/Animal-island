package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.units.plant.Plant;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;

public class Duck extends Herbivorous {


    Properties properties = new Properties(1,200,4,0.15, "\uD83E\uDD86");

    @Override
    public void eat(Plant plant) {
        super.eat(plant);
    }

    public void eat(Caterpillar caterpillar) {

    }
}
