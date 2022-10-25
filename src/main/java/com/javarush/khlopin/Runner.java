package com.javarush.khlopin;



import com.javarush.khlopin.field.GameField;
import com.javarush.khlopin.view.View;


public class Runner {

    public static void main(String[] args)  {
        //TODO РЕАЛИЗОВАТЬ МНОГОПОТОЧКУ
        //TODO ОТРЕФАКТОРИТЬ КОД

        GameField gameField = new GameField();
        View view = new View();
        gameField.initialize();
        for (int i = 0; i < 1000; i++) {
            view.printMap();

            view.printStatistic();

            gameField.makeStep();
        }

        view.printStatistic();




    }
}
