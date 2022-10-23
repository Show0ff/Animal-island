package com.javarush.khlopin.field;

import com.javarush.khlopin.units.*;

import java.util.*;

public class Cell {

    private final int row;
     private final int col;

    public Map<String, List<Unit>> sets = new HashMap<String, List<Unit>>();
    private final UnitDistributor unitDistributor = new UnitDistributor();


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void makeStep() {
        eat();

//        move();

//        multiply();
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
            Iterator<Unit> iterator = value.iterator();
            while (iterator.hasNext()) {
                Unit unit = iterator.next();
                boolean isMove = unit.move(this);
                if (isMove) {
                    iterator.remove();
                }
            }
        }

    }

    private void multiply() { //TODO Убрать геттор и сделать класс который порождает животных
        Iterator<Map.Entry<String, List<Unit>>> iterator = sets.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Unit>> pair = iterator.next();
            String name = pair.getKey();
            List<Unit> units = pair.getValue();
            if (units != null) {
                int numberOfChildren = units.size()/2;
                for (int i = 0; i < numberOfChildren; i++) {
//                    Unit unit = UnitFactory.bornUnitByName(name);
//                    units.add(unit);
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
