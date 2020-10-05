package com.company;
import java.util.*;
public class Chicken extends Animal {

    public Chicken(String name, String gender, int health){
        super(name, gender, health);
    }

    public static void createNewChicken(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Choose your Chickens name, then input the gender male or female");
        System.out.println(" Your Chicken has a 100 health.");
        new Chicken(myScanner.next(), myScanner.next(), 100);
    }
}
