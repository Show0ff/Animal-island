package com.javarush.khlopin.settings;

public class Properties {

    public double maxWeight;
    public int maxCount;
    public int maxSpeed;
    public double foodForSaturation;
    public String icon;

    public Properties(double weight, int maxCount, int speed, double foodForSaturation, String icon) {
        this.maxWeight = weight;
        this.maxCount = maxCount;
        this.maxSpeed = speed;
        this.foodForSaturation = foodForSaturation;
        this.icon = icon;
    }
}
