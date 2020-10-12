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




}
