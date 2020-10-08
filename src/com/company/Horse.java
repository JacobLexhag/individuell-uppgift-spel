package com.company;
import java.util.*;
public class Horse extends Animal{

    public static int initialPrice = 150;
    public Horse(String name, String gender, int health, int price){
        super(name, gender, health, price);
    }

    public static Horse createNewHorse(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Choose your horses name \nthen input the gender male or female");
        System.out.println(" Your horse has a 100 health.");
        return new Horse(myScanner.next(), myScanner.next(), 100, initialPrice);
    }
}
