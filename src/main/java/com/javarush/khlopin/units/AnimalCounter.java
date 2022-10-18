package com.javarush.khlopin.units;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;


public class AnimalCounter {
    public static final String HERBIVOROUS_PATH = "src\\main\\java\\com\\javarush\\khlopin\\units\\herbivorous";
    public static final String CARNIVOROUS_PATH = "src\\main\\java\\com\\javarush\\khlopin\\units\\carnivores";
    public static final String PLANT_PATH = "src\\main\\java\\com\\javarush\\khlopin\\units\\plant";


    public int getCountOfHerbivorous() {
        File[] files = new File(HERBIVOROUS_PATH).listFiles();
        return Objects.requireNonNull(files).length;
    }

    public int getCountOfCarnivores() {
        File[] files = new File(CARNIVOROUS_PATH).listFiles();
        return Objects.requireNonNull(files).length;
    }


    public ArrayList<Class<?>> getCarnivores() throws ClassNotFoundException {
        ArrayList<String> directory = getDirectoryOfCarnivores();
        ArrayList<Class<?>> classes = new ArrayList<>();
        for (String s : directory) {
            int i = s.indexOf("com\\javarush\\khlopin\\units\\carnivores\\");
            String result = s.substring(i).replace("\\", ".");
            result = result.substring(0, result.length() - 5);
            classes.add(Class.forName(result));
        }
        return classes;
    }

    public ArrayList<Class<?>> getHerbivores() throws ClassNotFoundException {
        ArrayList<String> directory = getDirectoryOfHerbivores();
        ArrayList<Class<?>> classes = new ArrayList<>();
        for (String s : directory) {
            int i = s.indexOf("com\\javarush\\khlopin\\units\\herbivorous\\");
            String result = s.substring(i).replace("\\", ".");
            result = result.substring(0, result.length() - 5);
            classes.add(Class.forName(result));
        }
        return classes;
    }



    private ArrayList<String> getAnimalClasses(File folder) {
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> stringArrays = new ArrayList<>();
        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    stringArrays.add(file.getAbsolutePath());
                }
            }
        }
        return stringArrays;
    }

    private ArrayList<String> getDirectoryOfCarnivores() {
        File folder = new File(CARNIVOROUS_PATH);
        return getAnimalClasses(folder);
    }


    private ArrayList<String> getDirectoryOfHerbivores() {
        File folder = new File(HERBIVOROUS_PATH);
        return getAnimalClasses(folder);
    }

    private ArrayList<String> getDirectoryOfPlants() {
        File folder = new File(PLANT_PATH);
        return getAnimalClasses(folder);
    }


}

