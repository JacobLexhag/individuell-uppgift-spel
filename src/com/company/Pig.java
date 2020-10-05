package com.company;

import java.util.Scanner;

public class Pig extends Animal{

    public Pig(String name, String gender, int health){

        super(name, gender, health);
    }

    public static void createNewPig(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Choose your Pigs name, then input the gender male or female");
        System.out.println(" Your Pig has a 100 health.");
        new Pig(myScanner.next(), myScanner.next(), 100);
    }
}
