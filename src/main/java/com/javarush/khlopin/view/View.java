package com.javarush.khlopin.view;

import com.javarush.khlopin.field.GameField;

import java.util.StringJoiner;

public class View {
    private final GameField gameField = new GameField();
    private final int position = 3;
    private final String border = "═".repeat(position);

    public String showMap() {
        final int cols = gameField.getCols();
        final int rows = gameField.getRows();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            stringBuilder.append(i == 0
                    ? line(cols,'┏','┳','┓')
                    : line(cols, '┣','╋', '┨')
            ).append("\n");
        }
        stringBuilder.append(line(cols,'┗','┻','┚')).append("\n");
        System.out.println(stringBuilder);
        return stringBuilder.toString();
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
