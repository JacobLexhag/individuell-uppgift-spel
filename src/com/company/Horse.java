package com.company;
import java.util.*;
public class Horse extends Animal{

    public Horse(String name, String gender, int health, int price){
        super(name, gender, health, price);
    }

    public static void createNewHorse(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Choose your horses name, then input the gender male or female");
        System.out.println(" Your horse has a 100 health.");
        new Horse(myScanner.next(), myScanner.next(), 100, 150);
    }
}
