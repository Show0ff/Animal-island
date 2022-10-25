package com.javarush.khlopin;



import com.javarush.khlopin.field.GameField;
import com.javarush.khlopin.view.View;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;


public class Runner {
    private static GameField gameField;

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        //TODO РЕАЛИЗОВАТЬ МНОГОПОТОЧКУ
        //TODO ОТРЕФАКТОРИТЬ КОД

        gameField = new GameField();
        View view = new View();
        gameField.initialize();
        for (int i = 0; i < 10; i++) {

            gameField.printState();
            gameField.makeStep();
        }

        gameField.printState();





    }
}
