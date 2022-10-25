package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.Unit;


import java.util.List;

public class Mouse extends Herbivorous {


    private final Properties properties;


    public Mouse() {
        this.properties = new Properties(0.05,500,1,0.001, "\uD83D\uDC01",11);

    }
    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public int getId() {
        return getProperties().id;
    }

    @Override
    public void eat(List<Unit> plants) {
        super.eat(plants);
    }
}
