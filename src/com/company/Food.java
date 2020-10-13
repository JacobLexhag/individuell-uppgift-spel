package com.company;

public abstract class Food {

    int foodPricePerKG;
    int gainHealth;
    String name;

    public Food(int gainHealth, int foodPricePerKG, String name){
        this.foodPricePerKG = foodPricePerKG;
        this.gainHealth = gainHealth;
        this.name = name;
    }


}
