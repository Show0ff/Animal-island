package com.javarush.khlopin.settings;

public class Properties {

    double maxWeight;
    int maxCount;
    int maxSpeed;
    double foodForSaturation;
    String icon;

    public Properties(double weight, int maxCount, int speed, double foodForSaturation, String icon) {
        this.maxWeight = weight;
        this.maxCount = maxCount;
        this.maxSpeed = speed;
        this.foodForSaturation = foodForSaturation;
        this.icon = icon;
    }
}
