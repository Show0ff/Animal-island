package com.javarush.khlopin.field;

import com.javarush.khlopin.settings.Preferences;
import com.javarush.khlopin.units.*;
import com.javarush.khlopin.units.plant.Plant;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Cell {

    private final int row;
     private final int col;

    public Map<String, List<Unit>> sets = new HashMap<>();
    private final UnitDistributor unitDistributor = new UnitDistributor();


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void makeStep() {
        eat();

        move();

        multiply();
    }

    private void eat() {
        for (Map.Entry<String, List<Unit>> pair : sets.entrySet()) {
            List<Unit> value = pair.getValue();
            for (Unit unit : value) {
                if (unit instanceof Carnivores) {
                    List<Unit> herbivores = unitDistributor.getHerbivores();
                    for (Unit herbivore : herbivores) {
                        ((Carnivores) unit).eat(sets.get(herbivore.getClass().getSimpleName()),unit);
                    }
                } else if (unit instanceof Herbivorous) {
                    List<Unit> plants = unitDistributor.getPlants();
                    if (plants != null) {
                        ((Herbivorous) unit).eat(plants);
                    }
                }
            }
        }
    }

    private void move() {
        for (Map.Entry<String, List<Unit>> pair : sets.entrySet()) {
            List<Unit> value = pair.getValue();
            for (Unit unit : value) {
                if (unit instanceof Plant) {
                    continue;
                }
                boolean isExit = false;
                for (Cell[] cells : GameField.field) {
                    if (isExit) {
                        break;
                    }
                    for (Cell cell : cells) {

                        // В этих переменных получаем координаты коллекции sets поля field
                        int newRow = cell.getCol() + ThreadLocalRandom.current().nextInt(0, unit.getProperties().maxSpeed);
                        int newCol = cell.getRow() + ThreadLocalRandom.current().nextInt(0, unit.getProperties().maxSpeed);

                        boolean isMove = true;

                        if (newRow >= Preferences.Y || newCol >= Preferences.X || newCol < 0 || newRow < 0) {
                            isMove = false;
                        }
                        if (newRow >= getRow() && newCol >= getCol()) {
                            isMove = false;
                        }
                        if (isMove) {
                            Map<String, List<Unit>> setsOld = GameField.field[cell.getRow()][cell.getCol()].sets;
                            Map<String, List<Unit>> setsNew = GameField.field[newRow][newCol].sets;

                            setsNew.forEach(setsOld::putIfAbsent);

                        }
                    }
                }
            }
        }
    }

    private void multiply() {
        for (Map.Entry<String, List<Unit>> pair : sets.entrySet()) {
            String name = pair.getKey();
            List<Unit> units = pair.getValue();
            if (units != null) {
                int numberOfChildren = units.size() / 2;
                for (int i = 0; i < numberOfChildren; i++) {
                    Unit unit = UnitFactory.bornUnitByName(name);
                    units.add(unit);
                }
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
