package com.javarush.khlopin.units;

import com.javarush.khlopin.exception.IslandApplicationException;
import com.javarush.khlopin.units.carnivores.*;
import com.javarush.khlopin.units.herbivorous.*;
import com.javarush.khlopin.units.plant.Grass;

public class UnitFactory {
    public static Unit bornUnitByName(String name) {

        return switch (name) {
            case "Bear" -> new Bear();
            case "Eagle" -> new Eagle();
            case "Fox" -> new Fox();
            case "Snake" -> new Snake();
            case "Wolf" -> new Wolf();
            case "Grass" -> new Grass();
            case "Buffalo" -> new Buffalo();
            case "Caterpillar" -> new Caterpillar();
            case "Deer" -> new Deer();
            case "Duck" -> new Duck();
            case "Goat" -> new Goat();
            case "Horse" -> new Horse();
            case "Mouse" -> new Mouse();
            case "Rabbit" -> new Rabbit();
            case "Sheep" -> new Sheep();
            case "WildBoar" -> new WildBoar();
            default -> throw new IslandApplicationException("Name of Unit is incorrect");
        };

    }
}
