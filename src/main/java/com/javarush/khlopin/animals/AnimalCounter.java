package com.javarush.khlopin.animals;

import java.io.File;
import java.util.Objects;


public class AnimalCounter {
    public static final String HERBIVOROUS_PATH = "C:\\IT\\Projects\\Animal-island\\src\\main\\java\\com\\javarush\\khlopin\\animals\\herbivorous";
    public static final String CARNIVOROUS_PATH = "C:\\IT\\Projects\\Animal-island\\src\\main\\java\\com\\javarush\\khlopin\\animals\\сarnivores";


    public int getCountOfHerbivorous() {
        File[] files = new File(HERBIVOROUS_PATH).listFiles();
        return Objects.requireNonNull(files).length;
    }

    public int getCountOfCarnivores() {
        File[] files = new File(CARNIVOROUS_PATH).listFiles();
        return Objects.requireNonNull(files).length;
    }
}

