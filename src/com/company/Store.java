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
        System.out.println("Write (buy) to buy an animal");
        System.out.println("Write (sell) to sell an animal");
        System.out.println("Write (food) to buy some food for your animals");
        System.out.println("Write (mate) to try to make your animals mate");
        System.out.println("Write (end) to end the round for: " + player.playerName);
                String chooseAction = input.nextLine();
                switch (chooseAction) {

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
                    case "end"->{return;}

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
            switch (input.next()) {
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
                        System.out.println("You don't have enough money to buy a horse");
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
                        System.out.println("You don't have enough money to buy a sheep");
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

                case "end" -> { Game.clear(); return; }
            }
        }
    }

    public static void sellAnimal(Player player){
        Scanner input = new Scanner(System.in);
        boolean runSellMethod = true;
        Game.clear();
        while (runSellMethod) {
            System.out.println("Write (sell) to sell one of your animals");
            System.out.println("Write (end) to end the round for: " + player.playerName);
            String sellMethod = input.next();
            switch (sellMethod) {
                case "sell"-> {
                    System.out.println(player.playerName + " this is a list of your animal\nWrite the number of the animal you would like to sell" +
                            " then press enter :\n-----------------------------------------------------------------------");
                    int i = 0;

                    for (var animal : player.animals) {
                        System.out.println(i + ": is your " + animal.breed + " named '" + animal.name + "' and has " +
                                animal.health + " health");
                        i++;
                    }
                    try {
                        for (var animal : player.animals){
                            if (animal.breed.equals("Horse")){
                                System.out.println("hej hej");
                            }
                        }
                        player.animals.remove(Integer.parseInt(input.next()));
                        System.out.println("You now have: " + player.money + " money left!\n");
                    }
                    catch (Exception ignored){
                        System.out.println("You have to write a number!\n");
                    }
                }
                case "end" -> { return; }

            }
        }
    }
}



