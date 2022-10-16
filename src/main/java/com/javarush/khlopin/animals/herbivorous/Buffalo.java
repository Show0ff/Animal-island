package com.javarush.khlopin.animals.herbivorous;

import com.javarush.khlopin.animals.Herbivorous;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;

public class Buffalo extends Herbivorous {

    private Probabilities probabilities;
    Properties properties = new Properties(700,10,3,100,"\uD83D\uDC03");

    public Properties getProperties() {
        return properties;
    }
}
