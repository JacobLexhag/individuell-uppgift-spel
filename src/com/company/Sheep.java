package com.company;
import java.util.*;
public class Sheep extends Animal {

    static public int initialPrice = 50;
    public static ArrayList<String> availableFoodsToEatSheep = new ArrayList<>();

    public Sheep(String name, String gender, int health, int price, String breed){
        super(name, gender, health, price, breed);
    }

    public static Sheep createNewSheep(){
        Scanner myScanner = new Scanner(System.in);
        availableFoodsToEatSheep.add("Grass");
        availableFoodsToEatSheep.add("Hay");
        System.out.println("Choose your Sheep's name \nthen input the gender male or female");
        System.out.println("Your Sheep has a 100 health.");
        return new Sheep(myScanner.next(), myScanner.next(), 100, initialPrice, "Sheep");
    }
}
