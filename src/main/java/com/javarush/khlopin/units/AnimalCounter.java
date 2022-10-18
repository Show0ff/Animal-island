package com.javarush.khlopin.units;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;


public class AnimalCounter {
    private final String HERBIVOROUS_SOURCE_ROOT = "com\\javarush\\khlopin\\units\\herbivorous\\";
    private final String CARNIVORES_SOURCE_ROOT = "com\\javarush\\khlopin\\units\\carnivores\\";

    private  final String PLANT_SOURCE_ROOT = "com\\javarush\\khlopin\\units\\plant\\";
    private final String HERBIVOROUS_PATH = "src\\main\\java\\com\\javarush\\khlopin\\units\\herbivorous";
    private final String CARNIVOROUS_PATH = "src\\main\\java\\com\\javarush\\khlopin\\units\\carnivores";
    private final String PLANT_PATH = "src\\main\\java\\com\\javarush\\khlopin\\units\\plant";

    public final ArrayList<Class<?>> herbivorous = new ArrayList<>();
    public final ArrayList<Class<?>> carnivores = new ArrayList<>();
    public final ArrayList<Class<?>> plants = new ArrayList<>();



    public ArrayList<Class<?>> getAllUnits() {
        ArrayList<Class<?>> units = new ArrayList<>();
        units.addAll(herbivorous);
        units.addAll(plants);
        units.addAll(carnivores);
        return units;
    }

    public int getCountOfHerbivorous() {
        File[] files = new File(HERBIVOROUS_PATH).listFiles();
        return Objects.requireNonNull(files).length;
    }

    public int getCountOfCarnivores() {
        File[] files = new File(CARNIVOROUS_PATH).listFiles();
        return Objects.requireNonNull(files).length;
    }

    public int getCountOfPlants() {
        File[] files = new File(PLANT_PATH).listFiles();
        return Objects.requireNonNull(files).length;
    }


    public ArrayList<Class<?>> getCarnivores() throws ClassNotFoundException {
        ArrayList<String> directory = getDirectoryOfCarnivores();
        return getUnitClasses(directory, CARNIVORES_SOURCE_ROOT, carnivores);
    }

    public ArrayList<Class<?>> getHerbivores() throws ClassNotFoundException {
        ArrayList<String> directory = getDirectoryOfHerbivores();

        return getUnitClasses(directory, HERBIVOROUS_SOURCE_ROOT, herbivorous);
    }

    public ArrayList<Class<?>> getPlants() throws ClassNotFoundException {
        ArrayList<String> directory = getDirectoryOfPlants();

        return getUnitClasses(directory, PLANT_SOURCE_ROOT, plants);
    }

    private ArrayList<Class<?>> getUnitClasses(ArrayList<String> directory, String herbivorousSourceRoot, ArrayList<Class<?>> classes) throws ClassNotFoundException {
        for (String s : directory) {
            int i = s.indexOf(herbivorousSourceRoot);
            String result = s.substring(i).replace("\\", ".");
            result = result.substring(0, result.length() - 5);
            classes.add(Class.forName(result));
        }
        return classes;
    }


    private ArrayList<String> getStringClasses(File folder) {
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
        return getStringClasses(folder);
    }


    private ArrayList<String> getDirectoryOfHerbivores() {
        File folder = new File(HERBIVOROUS_PATH);
        return getStringClasses(folder);
    }

    private ArrayList<String> getDirectoryOfPlants() {
        File folder = new File(PLANT_PATH);
        return getStringClasses(folder);
    }
}

