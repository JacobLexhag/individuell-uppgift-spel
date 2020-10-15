package com.company;
import java.util.*;
public class Horse extends Animal{

    public static int initialPrice = 150;
    public static ArrayList<String> availableFoodsToEatHorse = new ArrayList<>();

    public Horse(String name, String gender, int health, int price, String breed){
        super(name, gender, health, price, breed);
    }

    public static Horse createNewHorse(){
        Scanner myScanner = new Scanner(System.in);
        availableFoodsToEatHorse.add("Hay");
        availableFoodsToEatHorse.add("Carrot");
        System.out.println(" Choose your horses name \nthen input the gender male or female");
        System.out.println(" Your horse has a 100 health.");
        return new Horse(myScanner.next(), myScanner.next(), 100, initialPrice, "Horse");
    }
}
