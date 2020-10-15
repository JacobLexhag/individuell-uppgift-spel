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
        System.out.println("Choose your Pigs name\nthen input the gender male or female");
        System.out.println("Your Pig has a 100 health.");
        String setName = myScanner.next();
        String checkGender = myScanner.next();
            if (!checkGender.equals("male")){
                if (!checkGender.equals("female")) {
                    Game.clear();
                    System.out.println("Wrong input! Gender has to be female or male\n");
                    createNewPig();
                }
            }
        return new Pig(setName, checkGender, 100, initialPrice, "Pig");
    }
    public static Pig createBabyPig(){
        Game.clear();
        Scanner myScanner = new Scanner(System.in);
        String setGender = Animal.list[r.nextInt(list.length)];
        System.out.println("Choose the name of your "+ setGender + " pig baby:");
        return new Pig(myScanner.next(),setGender,100, initialPrice, "Pig");
    }

}
