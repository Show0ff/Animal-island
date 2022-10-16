package com.javarush.khlopin.settings;


import com.javarush.khlopin.animals.AnimalCounter;

public class Preferences {
    private static final AnimalCounter animalCounter = new AnimalCounter();
    public static final int X = 100;
    public static final int Y = 20;


    public static final int[][] probabilities = new int[animalCounter.getCountOfHerbivorous()][animalCounter.getCountOfCarnivores()];


}
