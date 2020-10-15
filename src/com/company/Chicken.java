package com.company;
import java.util.*;
public class Chicken extends Animal {

    public static int initialPrice = 40;
    public static ArrayList<String> availableFoodsToEatChicken = new ArrayList<>();

    public Chicken(String name, String gender, int health, int price, String breed){
        super(name, gender, health, price, breed);
    }

    public static Chicken createNewChicken(){
        Scanner myScanner = new Scanner(System.in);
        availableFoodsToEatChicken.add("Hay");
        System.out.println("Choose your Chickens name\nthen input the gender male or female");
        System.out.println("Your Chicken has a 100 health.");
        String setName = myScanner.next();
        String checkGender = myScanner.next();
        if (!checkGender.equals("male")){
            if (!checkGender.equals("female")) {
                Game.clear();
                System.out.println("Wrong input! Gender has to be female or male\n");
                createNewChicken();
            }
        }
        return new Chicken(setName, checkGender, 100, initialPrice, "Chicken");
    }
    public static Chicken createBabyChicken(){
        Game.clear();
        Scanner myScanner = new Scanner(System.in);
        String setGender = Animal.list[r.nextInt(list.length)];
        System.out.println("Choose your pigs name: ");
        return new Chicken(myScanner.next(),setGender,100, initialPrice, "Chicken");
    }
}
