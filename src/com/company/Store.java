package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Store {
    Scanner input = new Scanner(System.in);

    public Store() {

    }


    public static void player1Menu() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose what action you want to do : ");
        System.out.println("Write 'buy' to buy an animal");
        System.out.println("Write 'sell' to sell an animal");
        System.out.println("Write 'food' to buy some food for your animals");
        System.out.println("Write 'mate' to try to make your animals mate");

        if (input.next().equals("buy")) {
            while(Game.allPlayers.get(0).money > 0){
            System.out.println("write pig or horse ");
            switch (input.next()) {
                case "pig" -> Pig.createNewPig();
                case "horse" -> System.out.println("najs");
                case "sheep" -> System.out.println("eh");
                case "cow" -> System.out.println("ye");
                case "chicken" -> System.out.println("hej");
            }
            }
        }
        else if(input.next().equals("sell")){

        }
        else if(input.next().equals("food")){

        }
        else if(input.next().equals("mate")){

        }
        else {
            player1Menu();
        }

    }
}