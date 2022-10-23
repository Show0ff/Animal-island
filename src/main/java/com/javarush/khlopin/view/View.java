package com.javarush.khlopin.view;

import com.javarush.khlopin.field.Cell;
import com.javarush.khlopin.field.GameField;
import com.javarush.khlopin.units.Unit;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class View {
    private final int position = 3;
    private final String border = "═".repeat(position);

    public String showMap(GameField gameField) {
        Cell[][] cells = gameField.field;
        final int cols = gameField.getCols();
        final int rows = gameField.getRows();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            stringBuilder.append(i == 0
                    ? line(cols,'┏','┳','┓')
                    : line(cols, '┣','╋', '┨')
            ).append("\n");
            for (int i1 = 0; i1 < cols; i1++) {
                String residentString = get(cells[i][i1]);
                stringBuilder.append(String.format("║%-" + position + "s", residentString));
            }
        }
        stringBuilder.append(line(cols,'┗','┻','┚')).append("\n");
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }

    private String get(Cell cell) {
        String icon = null;
        System.out.println(cell);
        for (Map.Entry<String, List<Unit>> animalListEntry : cell.sets.entrySet()) {
            for (Unit unit : animalListEntry.getValue()) {
                icon = unit.getProperties().icon;
            }
        }
        return icon;
    }

    private String line(int cols, char left, char center, char right) {
        StringJoiner joiner = new StringJoiner("", "", String.valueOf(right));
        for (int col = 0; col < cols; col++) {
            String s = (col == 0 ? left : center) + border;
            joiner.add(s);
        }
        return (joiner.toString());
    }


}
