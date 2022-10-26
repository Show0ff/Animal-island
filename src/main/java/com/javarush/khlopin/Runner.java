package com.javarush.khlopin;



import com.javarush.khlopin.field.GameField;
import com.javarush.khlopin.view.View;



public class Runner {

    public static void main(String[] args)  {
        GameField gameField = new GameField();
        View view = new View();
        gameField.initialize();

        int number = view.printStart();
        for (int i = 0; i < number; i++) {
            view.printMap();

            view.printStatistic();

            gameField.makeStep();
        }
        view.printStatistic();


    }
}
