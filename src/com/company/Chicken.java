package com.company;
import java.util.*;
public class Chicken extends Animal {

    public static int initialPrice = 40;

    public Chicken(String name, String gender, int health, int price, String breed){
        super(name, gender, health, price, breed);
    }

    public static Chicken createNewChicken(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose your Chickens name \nthen input the gender male or female");
        System.out.println("Your Chicken has a 100 health.");
        return new Chicken(myScanner.next(), myScanner.next(), 100, initialPrice, "Chicken");
    }
}
