package com.javarush.khlopin.units.herbivorous;

import com.javarush.khlopin.units.Unit;
import com.javarush.khlopin.units.Herbivorous;
import com.javarush.khlopin.settings.Properties;

import java.util.List;

public class Duck extends Herbivorous {


    private final Properties properties;

    public Duck() {
        this.properties = new Properties(1,200,4,0.15, "\uD83E\uDD86",8);;


    }

    @Override
    public void eat(List<Unit> plants) {
        super.eat(plants);
    }

//    public void eat(Caterpillar caterpillar) {
//    } //TODO УТКА ДОЛЖНА ЕСТЬ ГУСЕНИЦУ


    @Override
    public Properties getProperties() {
        return properties;
    }

    @Override
    public int getId() {
        return getProperties().id;
    }

}
