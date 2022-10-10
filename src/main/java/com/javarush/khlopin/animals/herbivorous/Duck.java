package com.javarush.khlopin.animals.herbivorous;

import com.javarush.khlopin.Plant;
import com.javarush.khlopin.animals.Herbivorous;

public class Duck extends Herbivorous {

    @Override
    public void eat(Plant plant) {
        super.eat(plant);
    }

    public void eat(Caterpillar caterpillar) {

    }
}
