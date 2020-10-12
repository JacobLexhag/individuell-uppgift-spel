package com.company;
import java.util.*;
public class Cow extends Animal {

    public static int initialPrice = 80;

    public Cow(String name, String gender, int health, int price, String breed){
        super(name, gender, health, price, breed);
    }

    public static Cow createNewCow(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Choose your Cows name \nthen input the gender male or female");
        System.out.println("Your Cow has a 100 health.");
        return new Cow(myScanner.next(), myScanner.next(), 100, initialPrice, "Cow");
    }
}
