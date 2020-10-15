package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Pig extends Animal{

    static public int initialPrice = 50;
    public static ArrayList<String> availableFoodsToEatPig = new ArrayList<>();


    public Pig(String name, String gender, int health, int price, String breed){
        super(name, gender, health, price, breed);
    }

    public static Pig createNewPig(){
        Scanner myScanner = new Scanner(System.in);
        availableFoodsToEatPig.add("Carrot");
        availableFoodsToEatPig.add("Hay");
        System.out.println("Choose your Pigs name \nthen input the gender male or female");
        System.out.println("Your Pig has a 100 health.");
        return new Pig(myScanner.next(), myScanner.next(), 100, initialPrice, "Pig");
    }

}
