package com.company;

public abstract class Animal {

    public int health;
    public String name;
    public String gender;

    public Animal(String name, String gender, int health){
        this.name = name;
        this.gender = gender;
        this.health = health;
    }

    public static void createHorse(){
        Horse.createNewHorse();
    }
    public static void createPig(){
        Pig.createNewPig();
    }
    public static void createSheep(){
        Sheep.createNewSheep();
    }
    public static Animal createChicken(Chicken chicken){
        Chicken.createNewChicken();
        return chicken;
    }
    public static void createCow(){
        Cow.createNewCow();
    }


}
