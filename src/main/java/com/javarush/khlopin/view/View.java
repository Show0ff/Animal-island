package com.javarush.khlopin.view;


public class View {
    private final MapOfIsland mapOfIsland = new MapOfIsland();

    private final Statistic statistic = new Statistic();
    public void printMap() {
        System.out.println(mapOfIsland.drawMap());
    }

    public void printStatistic() {
        System.out.println(statistic.printState());
    }





}
