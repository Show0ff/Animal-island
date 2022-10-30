package com.javarush.khlopin;



import com.javarush.khlopin.exception.IslandApplicationException;
import com.javarush.khlopin.field.Cell;
import com.javarush.khlopin.field.GameField;
import com.javarush.khlopin.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.TimeUnit;


public class Runner {

    public static void main(String[] args)  {
        GameField gameField = new GameField();
        View view = new View();
        gameField.initialize();
        view.printStatistic();

        int number = view.printStart();
        for (int i = 0; i < number; i++) {
            ExecutorService threadPoolExecutor = Executors.newCachedThreadPool();
            List<Cell> cellList = new ArrayList<>();

            for (Cell[] cells : GameField.field) {
                cellList.addAll(Arrays.asList(cells));
            }
            try {
                threadPoolExecutor.invokeAll(cellList, 6, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                throw new IslandApplicationException();
            }
            threadPoolExecutor.shutdown();

            view.printMap();
            view.printStatistic();

        }

    }
}
