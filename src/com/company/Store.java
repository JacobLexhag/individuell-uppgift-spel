package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Store {
    Scanner input = new Scanner(System.in);
    static boolean endRound;
    public Store() {

    }


    public static void playerMenu(Player player) {
        Scanner input = new Scanner(System.in);

        if (endRound){
            return;
        }
        else {
            System.out.println("Let's play "+ player.playerName + "\n---------------------------------------");
        }

        System.out.println("Now it's your turn " + player.playerName + ":\n---------------------------------------");
        System.out.println("Choose what action you want to do :\n---------------------------------------");
        System.out.println("Write 'buy' to buy an animal");
        System.out.println("Write 'sell' to sell an animal");
        System.out.println("Write 'food' to buy some food for your animals");
        System.out.println("Write 'mate' to try to make your animals mate");

                switch (input.nextLine()) {

                    case "buy" -> {
                        buyAnimal(player);
                    }
                    case"sell"-> {
                        sellAnimal(player);
                    }
                    case "food"-> {
                        System.out.println("hedå");
                    }
                    case "mate"-> {
                        System.out.println("hedeade");
                    }

                    default -> playerMenu(player);
                }
        }

    public static void buyAnimal(Player player) {
        Scanner input = new Scanner(System.in);
        Game.clear();
        if (player.money <= 40) {
            System.out.println("You don't have enough to buy an animal! \n---------------------------------------");
            playerMenu(player);
        }
        while (player.money >= 40) {
            System.out.println(player.playerName);
            System.out.println("Write (pig) to buy a pig");
            System.out.println("Write (horse) to buy a horse");
            System.out.println("Write (sheep) to buy a sheep");
            System.out.println("Write (cow) to buy a cow");
            System.out.println("Write (chicken) to buy a chicken");
            System.out.println("Write (end) to end the round");
            switch (input.nextLine()) {
                case "pig" -> {
                    if (Pig.initialPrice > player.money) {
                        Game.clear();
                        System.out.println("You don't have enough money to buy a pig");
                    } else {
                        // the player has enough money - create a pig and make the player pay
                        player.animals.add(Pig.createNewPig());
                        player.money -= Pig.initialPrice;
                        Game.clear();
                        System.out.println("Now you have " + player.money + " money left!\n----------------------------------");

                    }
                }
                case "horse" -> {
                    if (Horse.initialPrice > player.money) {
                        Game.clear();
                        System.out.println("You don't have enough money to buy a sheep");
                    } else {
                        // the player has enough money - create a pig and make the player pay
                        player.animals.add(Horse.createNewHorse());
                        player.money -= Horse.initialPrice;
                        Game.clear();
                        System.out.println("Now you have " + player.money + " money left!\n----------------------------------");
                    }
                }
                case "sheep" -> {
                    if (Sheep.initialPrice > player.money) {
                        Game.clear();
                        System.out.println("You don't have enough money to buy a horse");
                    } else {
                        // the player has enough money - create a pig and make the player pay
                        player.animals.add(Sheep.createNewSheep());
                        player.money -= Sheep.initialPrice;
                        Game.clear();
                        System.out.println("Now you have " + player.money + " money left!\n----------------------------------");
                    }
                }
                case "cow" -> {
                    if (Cow.initialPrice > player.money) {
                        Game.clear();
                        System.out.println("You don't have enough money to buy a cow");
                    } else {
                        // the player has enough money - create a pig and make the player pay
                        player.animals.add(Cow.createNewCow());
                        player.money -= Cow.initialPrice;
                        Game.clear();
                        System.out.println("Now you have " + player.money + " money left!\n----------------------------------");
                    }
                }
                case "chicken" -> {
                    if (Chicken.initialPrice > player.money) {
                        Game.clear();
                        System.out.println("You don't have enough money to buy a chicken");
                    } else {
                        // the player has enough money - create a pig and make the player pay
                        player.animals.add(Chicken.createNewChicken());
                        player.money -= Chicken.initialPrice;
                        Game.clear();
                        System.out.println("Now you have " + player.money + " money left!\n----------------------------------");
                    }
                }

                case "end" -> {
                    endRound = true;
                    playerMenu(player);
                }

            }
        }
    }

    public static void sellAnimal(Player player){
        System.out.println(player.playerName + " this is a list of your animals\nPress the number of the animals you would like to sell" +
                "then press enter :\n------------------------------------" );

        for (var animal : player.animals){
            System.out.println(animal.name);
        }
    }
}



