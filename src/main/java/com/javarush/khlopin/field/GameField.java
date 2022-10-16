package com.javarush.khlopin.field;

import com.javarush.khlopin.settings.Preferences;

public class GameField {
    public Cell[][] field;

    public GameField() {
    }

    // Заселить поле животными и растениями
    public void initialize() {
        field = new Cell[Preferences.X][Preferences.Y];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = new Cell(i,j);
            }
        }
    }

    // Сделать шаг (пробижаться по всем ячейкам)
    public void makeStep() {

    }

    // Вывести статистику
    public void printState() {

    }


}
