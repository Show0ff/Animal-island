package com.javarush.khlopin.field;

import com.javarush.khlopin.exception.IslandApplicationException;
import com.javarush.khlopin.settings.Preferences;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public static Cell[][] field = new Cell[Preferences.Y][Preferences.X];
    public UnitDistributor unitDistributor = new UnitDistributor();



    // Заселить поле животными и растениями
    public void initialize()  {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                Cell cell = new Cell(i, j);
                for (Unit unit : unitDistributor.getUnits()) {
                    int num = ThreadLocalRandom.current().nextInt(0, unit.getProperties().maxCount);
                    List<Unit> unitSet = new ArrayList<>();
                    for (int i1 = 0; i1 < num; i1++) {
                        unitSet.add(UnitFactory.bornUnitByName(unit.getClass().getSimpleName()));
                    }
                    cell.sets.put(unit.getClass().getSimpleName(), unitSet);
                    field[i][j] = cell;
                }
            }
        }
    }

    // Сделать шаг (пробижаться по всем ячейкам)
    public void makeStep()  {
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                cell.makeStep();
            }
        }
    }

    // Вывести статистику
    public void printState()  {
        Map<String, Integer> countMap = new HashMap<>();
        for (Cell[] cells : field) {
            for (Cell cell : cells) {
                Map<String, Integer> currentMap = new HashMap<>();
                for (Map.Entry<String, List<Unit>> stringListEntry : cell.sets.entrySet()) { // проходит по значению в одной клетке
                    if (stringListEntry.getValue().size() == 0) {
                        continue;
                    }
                    Method getProperties;
                    try {
                        getProperties = stringListEntry.getValue().get(0).getClass().getMethod("getProperties");
                    } catch (NoSuchMethodException e) {
                        throw new IslandApplicationException(e);
                    }
                    Properties invoke;
                    try {
                        invoke = (Properties) getProperties.invoke(stringListEntry.getValue().get(0));
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new IslandApplicationException(e);
                    }
                    currentMap.put(invoke.icon, stringListEntry.getValue().size() + currentMap.getOrDefault(stringListEntry.getKey(), 0));
                }
                currentMap.forEach((k, v) -> countMap.merge(k, v, Integer::sum));
            }
        }
        System.out.println(countMap);
    }

        public static int getCols () {
            return field[0].length;
        }

        public static int getRows () {
            return field.length;
        }

}