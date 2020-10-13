package com.company;

public class Grass extends Food{
    static int initialFoodPrice = 20;
    public Grass(int gainHealth, int foodPricePerKG, String name){
        super(gainHealth, foodPricePerKG, name);

    }
    public static Food buyGrass(){
        return new Grass(10,20,"Grass");
    }
}
