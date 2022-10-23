package com.javarush.khlopin.units.plant;

import com.javarush.khlopin.settings.Properties;

public class Grass extends Plant {

   private final Properties properties;

   public Grass(){
       properties = new Properties(1,200,0,0,"🌿",15);
   }
    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public void multiply() {
        super.multiply();
    }

    @Override
    public int getId() {
        return getProperties().id;
    }
}
