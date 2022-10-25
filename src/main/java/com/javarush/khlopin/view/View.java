package com.javarush.khlopin.view;

import com.javarush.khlopin.field.Cell;
import com.javarush.khlopin.field.GameField;
import com.javarush.khlopin.units.Unit;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class View {
    private final int position = 2;
    private final String border = "═".repeat(position);

    public void showMap() {
        Cell[][] cells = GameField.field;
        final int cols = GameField.getCols();
        final int rows = GameField.getRows();
        StringBuilder stringBuilder = new StringBuilder("\n");
        for (int i = 0; i < rows; i++) {
            stringBuilder.append(i == 0
                    ? line(cols,'╔', '╦', '╗')
                    : line(cols, '╠', '╬', '╣')
            ).append("\n");
            for (int i1 = 0; i1 < cols; i1++) {
                String residentString = get(cells[i][i1]);
                stringBuilder.append(String.format("║%-" + position + "s", residentString));
            }
            stringBuilder.append("                              ║").append("\n");
        }
        stringBuilder.append(line(cols,'╚', '╩', '╝'));
        System.out.println(stringBuilder);
    }

    private String get(Cell cell) {
        String icon = null;
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
