package com.company;
import java.util.*;
public abstract class Food {

    int foodPricePerKG;
    int kilo;
    int gainHealth;
    String name;

    public Food(int gainHealth, int foodPricePerKG, String name ){
        this.foodPricePerKG = foodPricePerKG;
        this.gainHealth = gainHealth;
        this.name = name;
    }




}
