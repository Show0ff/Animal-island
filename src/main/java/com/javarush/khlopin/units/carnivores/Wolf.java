package com.javarush.khlopin.units.carnivores;

import com.javarush.khlopin.units.plant.Plant;
import com.javarush.khlopin.units.Carnivores;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.units.herbivorous.*;

public class Wolf extends Carnivores {
  private final Properties properties;

  public Wolf() {
    this.properties = new Properties(50,30,3,8, "\uD83D\uDC3A",4);
  }


  @Override
  public Properties getProperties() {
    return properties;
  }

  @Override
  public int getId() {
    return getProperties().id;
  }
}
