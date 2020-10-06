package com.company;
import java.util.*;
public class Cow extends Animal {

    public Cow(String name, String gender, int health, int price){
        super(name, gender, health, price);
    }

    public static void createNewCow(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Choose your Cows name, then input the gender male or female");
        System.out.println(" Your Cow has a 100 health.");
        new Cow(myScanner.next(), myScanner.next(), 100, 80);
    }
}
