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
        System.out.println("Choose your Sheep's name\nthen input the gender male or female");
        System.out.println("Your Sheep has a 100 health.");
        String setName = myScanner.next();
        String checkGender = myScanner.next();
        if (!checkGender.equals("male")){
            if (!checkGender.equals("female")) {
                Game.clear();
                System.out.println("Wrong input! Gender has to be female or male\n");
                createNewSheep();
            }
        }

        return new Sheep(setName, checkGender, 100, initialPrice, "Sheep");
    }
    public static Sheep createBabySheep(){
        Scanner myScanner = new Scanner(System.in);
        String setGender = Animal.list[r.nextInt(list.length)];
        System.out.println("Choose the name of your "+ setGender + " sheep baby:");
        return new Sheep(myScanner.next(),setGender,100, initialPrice, "Sheep");
    }
}
