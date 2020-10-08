package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Store {
    Scanner input = new Scanner(System.in);

    public Store() {

    }


    public static void playerMenu(Player player) {
        Scanner input = new Scanner(System.in);

        System.out.println("Now it's your turn " + player.playerName + ":\n---------------------------------------");
        System.out.println("Choose what action you want to do :\n---------------------------------------");
        System.out.println("Write 'buy' to buy an animal");
        System.out.println("Write 'sell' to sell an animal");
        System.out.println("Write 'food' to buy some food for your animals");
        System.out.println("Write 'mate' to try to make your animals mate");

                switch (input.nextLine()) {
                    case "buy" -> {
                        Game.clear();
                        if (player.money <= 40) {
                            System.out.println("You don't have enough to buy an animal! \n---------------------------------------");
                            playerMenu(player);
                        }
                        while (player.money >= 40) {
                            Game.clear();
                            System.out.println("Write 'pig' to buy a pig");
                            System.out.println("Write 'horse' to buy a horse");
                            System.out.println("Write 'sheep' to buy a sheep");
                            System.out.println("Write 'cow' to buy a cow");
                            System.out.println("Write 'chicken' to buy a chicken");
                            switch (input.next()) {
                                case "pig" -> {
                                    if (Pig.initialPrice > player.money) {
                                        Game.clear();
                                        System.out.println("You don't have enough money to buy a pig");
                                    } else {
                                        // the player has enough money - create a pig and make the player pay
                                        player.animals.add(Pig.createNewPig());
                                        player.money -= Pig.initialPrice;
                                        System.out.println("Now you have " + player.money + " money left!");
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
                                        System.out.println("Now you have " + player.money + " money left!");
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
                                        System.out.println("Now you have " + player.money + " money left!");
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
                                        System.out.println("Now you have " + player.money + " money left!");
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
                                        System.out.println("Now you have " + player.money + " money left!");
                                    }
                                }
                            }

                        }
                    }
                    case"sell"-> {
                        System.out.println("hej");
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
    }



