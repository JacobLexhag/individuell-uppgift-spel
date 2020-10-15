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
        System.out.println("Choose your horses name\nthen input the gender male or female");
        System.out.println("Your horse has a 100 health.");
        String setName = myScanner.next();
        String checkGender = myScanner.next();
        if (!checkGender.equals("male")){
            if (!checkGender.equals("female")) {
                Game.clear();
                System.out.println("Wrong input! Gender has to be female or male\n");
                createNewHorse();
            }
        }
        return new Horse(setName, checkGender, 100, initialPrice, "Horse");
    }
    public static Horse createBabyHorse(){
        Game.clear();
        Scanner myScanner = new Scanner(System.in);
        String setGender = Animal.list[r.nextInt(list.length)];
        System.out.println("Choose your horses name: ");
        return new Horse(myScanner.next(),setGender,100, initialPrice, "Horse");
    }
}
