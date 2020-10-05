package com.company;

public abstract class Food {

    int foodPrice;
    int gainHealth;

    public Food(int gainHealth, int foodPrice){
        this.foodPrice = foodPrice;
        this.gainHealth = gainHealth;
    }

    public static void carrotGainHealth(){

    }
}
