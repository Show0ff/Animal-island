package com.javarush.khlopin;

import com.javarush.khlopin.units.AnimalCounter;


public class Runner {
    public static void main(String[] args) throws ClassNotFoundException {

        AnimalCounter animalCounter = new AnimalCounter();
        System.out.println(animalCounter.getCarnivores());
        System.out.println("-------------------------");
        System.out.println(animalCounter.getHerbivores());
        System.out.println(animalCounter.getCountOfCarnivores());
        System.out.println(animalCounter.getCountOfHerbivorous());


    }
}
