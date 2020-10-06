package com.company;
import java.util.*;
public class Sheep extends Animal {

    public Sheep(String name, String gender, int health, int price){
        super(name, gender, health, price);
    }

    public static void createNewSheep(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Choose your Sheep's name, then input the gender male or female");
        System.out.println(" Your Sheep has a 100 health.");
        new Sheep(myScanner.next(), myScanner.next(), 100, 50);
    }
}
