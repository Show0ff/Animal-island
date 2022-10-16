package com.javarush.khlopin.animals.carnivores;

import com.javarush.khlopin.animals.plant.Plant;
import com.javarush.khlopin.animals.Carnivores;
import com.javarush.khlopin.settings.Probabilities;
import com.javarush.khlopin.settings.Properties;
import com.javarush.khlopin.animals.herbivorous.*;

public class Wolf extends Carnivores {
  public Probabilities probabilities;


  public Properties properties;

  public Wolf() {
    this.properties = new Properties(50,30,3,8, "\uD83D\uDC3A");
    this.probabilities = new Probabilities(this.getClass(), Plant.class, 0);
    this.probabilities = new Probabilities(this.getClass(), Caterpillar.class, 0);
    this.probabilities = new Probabilities(this.getClass(), Duck.class, 40);
    this.probabilities = new Probabilities(this.getClass(), Buffalo.class, 10);
    this.probabilities = new Probabilities(this.getClass(), WildBoar.class, 15);
    this.probabilities = new Probabilities(this.getClass(), Sheep.class,70);
    this.probabilities = new Probabilities(this.getClass(), Goat.class,60);
    this.probabilities = new Probabilities(this.getClass(), Mouse.class,80);
    this.probabilities = new Probabilities(this.getClass(), Rabbit.class,60);
    this.probabilities = new Probabilities(this.getClass(), Deer.class,15);
    this.probabilities = new Probabilities(this.getClass(), Horse.class, 10);
    this.probabilities = new Probabilities(this.getClass(), Eagle.class,0);
    this.probabilities = new Probabilities(this.getClass(), Bear.class,0);
    this.probabilities = new Probabilities(this.getClass(), Fox.class,0);
    this.probabilities = new Probabilities(this.getClass(), Snake.class,0);
    this.probabilities = new Probabilities(this.getClass(), Wolf.class,0);
  }
}
