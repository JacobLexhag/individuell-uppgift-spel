package com.company;


import java.util.ArrayList;

public abstract class Animal {



    public int price;
    public String gender;
    public int health;
    public String name;
    public String breed;


    public Animal(String name, String gender, int health, int price, String breed){
        this.name = name;
        this.health = health;
        this.gender = gender;
        this.price = price;
        this.breed = breed;
    }

    public int getPrice(){
        return (int) Math.round (price * health / 100.0);
    }

    public int increasePrice(Player player){
        return player.money += getPrice();
    }

    public int decreaseHealth(){
        return health -= (10) + (int)(Math.random()* ( 30 - 10 + 1));
    }

    public int increaseHealth(Food food){
        return health += food.gainHealth;
    }


}
