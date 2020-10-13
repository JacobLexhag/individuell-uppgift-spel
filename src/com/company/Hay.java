package com.company;

public class Hay extends Food {
    static int initialFoodPrice = 20;
    public Hay(int gainHealth, int foodPricePerKG, String name){
        super(gainHealth, foodPricePerKG, name);

    }
    public static Food buyHay(){
        return new Hay(10,20,"Hay");
    }
}
