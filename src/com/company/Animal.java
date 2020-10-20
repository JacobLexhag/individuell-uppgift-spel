package com.company;
import java.util.*;
import java.util.Scanner;

public abstract class Animal {


    public int price;
    public String gender;
    public int health;
    public String name;
    public String breed;
    public static String[] list = {"male", "female"};
    public static Random r = new Random();


    public Animal(String name, String gender, int health, int price, String breed) {
        this.name = name;
        this.health = health;
        this.gender = gender;
        this.price = price;
        this.breed = breed;
    }

    public int getPrice() {
        return price * (health / 100);
    }

    public int increasePrice(Player player) {
        return player.money += getPrice();
    }

    public void decreaseHealth() {
        int decreaseHealthRandomNum = (10) + (int) (Math.random() * (30 - 10 + 1));
        health -= decreaseHealthRandomNum;
    }

    public void increaseHealth(Food food){
        health = Math.min(100, health + 10);
    }

    public static void animalDie(Player player){
        for (int j = player.animals.size() - 1; j >= 0; j--) {
            if (animal.health <= 0) {
                player.animals.remove(animal);
                System.out.println(player.playerName+ " your "+animal.breed + " named: "+animal.name+ " has died! ");
            }
        }
    }
}
