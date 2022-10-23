package com.javarush.khlopin.settings;


import com.javarush.khlopin.units.carnivores.Bear;
import com.javarush.khlopin.units.herbivorous.Caterpillar;
import com.javarush.khlopin.units.plant.Plant;

import java.util.*;

public class Probabilities {

    public static List<Probabilities> probabilities = new ArrayList<>();




    public String animal1;
    public String animal2;
    public int power;

    public Probabilities(String animal1, String animal2, int power) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.power = power;
    }

    static {
       probabilities.add(new Probabilities(Bear.class.getSimpleName(), Plant.class.getSimpleName(), 0));
       probabilities.add(new Probabilities(Bear.class.getSimpleName(), Caterpillar.class.getSimpleName(), 0));
    }

}
