package com.company;
import java.util.*;
public class Cow extends Animal {

    public static int initialPrice = 80;
    public static ArrayList<String> availableFoodsToEatCow = new ArrayList<>();

    public Cow(String name, String gender, int health, int price, String breed){
        super(name, gender, health, price, breed);
    }

    public static Cow createNewCow(){
        Scanner myScanner = new Scanner(System.in);
        availableFoodsToEatCow.add("Grass");
        System.out.println("Choose your Cows name\nthen input the gender male or female");
        System.out.println("Your Cow has a 100 health.");
        String setName = myScanner.next();
        String checkGender = myScanner.next();
        if (!checkGender.equals("male")){
            if (!checkGender.equals("female")) {
                Game.clear();
                System.out.println("Wrong input! Gender has to be female or male\n");
                createNewCow();
            }
        }
        return new Cow(setName, checkGender, 100, initialPrice, "Cow");
    }
    public static Cow createBabyCow(){
        Scanner myScanner = new Scanner(System.in);
        String setGender = Animal.list[r.nextInt(list.length)];
        System.out.println("Choose the name of your "+ setGender + " cow baby:");
        return new Cow(myScanner.next(),setGender,100, initialPrice, "Cow");
    }
}
