package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class Store {
    Scanner input = new Scanner(System.in);

    public Store() {

    }


    public static void playerMenu(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println("Now it's your turn " + player.playerName + " with: "+player.money+ " money left :\n----------------------------------------------------");
        System.out.println("Choose what action you want to do :\n----------------------------------------------------");
        System.out.println("Write (buy) to buy an animal");
        System.out.println("Write (sell) to sell an animal");
        System.out.println("Write (food) to buy some food for your animals");
        System.out.println("Write (feed) to feed your animals");
        System.out.println("Write (mate) to try to make your animals mate");
        System.out.println("Write (end) to end the round for: " + player.playerName);
        String chooseAction = input.nextLine();
        switch (chooseAction) {

            case "buy" -> {
                Game.clear();
                buyAnimal(player);
            }
            case "sell" -> {
                Game.clear();
                sellAnimal(player);
            }
            case "food" -> {
                Game.clear();
                buyFoodMenu(player);
            }
            case "feed" -> {
                Game.clear();
                feedMenu(player);
            }
            case "mate" -> {
                Game.clear();
                Player.mateAnimals(player);
            }
            case "end" -> {
                return;
            }
            default ->{
                Game.clear();
                playerMenu(player);
            }
        }

    }

    public static void buyAnimal(Player player) {
        Scanner input = new Scanner(System.in);
        if (player.money <= 40) {
            System.out.println("You don't have enough to buy an animal! \n---------------------------------------");
            playerMenu(player);
        }
        while (player.money >= 40) {
            System.out.println(player.playerName+ " is buying a animal\n------------------------------------------");
            System.out.println("Write (pig) to buy a pig (cost 50)");
            System.out.println("Write (horse) to buy a horse (cost 100)");
            System.out.println("Write (sheep) to buy a sheep (cost 50)");
            System.out.println("Write (cow) to buy a cow (cost 80)");
            System.out.println("Write (chicken) to buy a chicken (cost 40)");
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

                case "end" -> {
                    Game.clear();
                    return;
                }
            }
        }
    }

    public static void sellAnimal(Player player) {
        Scanner input = new Scanner(System.in);
        boolean runSellMethod = true;
        Animal sellAnimal = null;
        while (runSellMethod) {
            if (player.animals.size() == 0) {
                System.out.println(player.animals.size() + " animals owned you can't sell press ENTER to continue");
                input.nextLine();
                return;
            }
            System.out.println("Write (sell) to sell one of your animals");
            System.out.println("Write (end) to end the round for: " + player.playerName);
            String sellMethod = input.next();
            switch (sellMethod) {
                case "sell" -> {
                    Game.clear();
                    System.out.println(player.playerName + " this is a list of your animals.\nWrite the number of the animal you would like to sell" +
                            " then press enter :\n-----------------------------------------------------------------------");
                    int i = 0;
                    for (var animal : player.animals) {
                        System.out.println(i + ": is your " + animal.breed + " named '" + animal.name + "' and has " +
                                animal.health + " health");
                        i++;
                    }
                        try {
                            sellAnimal = player.animals.remove(Integer.parseInt(input.next()));
                            System.out.println("BEFORE ski" + player.money);
                            sellAnimal.increasePrice(player);
                            Game.clear();
                            System.out.println("You have sold your "+sellAnimal.breed +" with the name: " + sellAnimal.name);
                            System.out.println("You now have: " + player.money + " money left!\n");

                        } catch (Exception ignored) {
                             System.out.println("You have to write a number!\n");
                        }
                    if (player.animals.size() == 0) {
                        System.out.println("You sold your last animal! game will continue in a few seconds.");
                        Game.sleep(5000);
                        return;
                    }

                }
                case "end" -> {
                    return;
                }
            }
        }
    }

    public static void buyFoodMenu(Player player) {
        Scanner input = new Scanner(System.in);
        if (player.money < 20){
            System.out.println("You dont have enough to buy food, choose another option!");
            Game.clear();
            playerMenu(player);
        }
        while (player.money > 20) {
            for (var animal : player.animals) {
                System.out.println(animal.breed + " named " + animal.name + " has a: " + animal.health + " health left!");
            }
            System.out.println("-------------------------------------------------");
            System.out.println("Write (buy) to buy food for your animals");
            System.out.println("Write (end) to en the round for: " + player.playerName);
            switch (input.next()) {

                case "buy" -> {
                    Game.clear();
                    System.out.println("Animals does not eat all foods!");
                    System.out.println("Choose which food you would like to buy\n-------------------------------------------");
                    System.out.println("Write (carrot) to buy carrots (Pig, Horse)");
                    System.out.println("Write (hay) to buy hay (Sheep, Horse, Chicken)");
                    System.out.println("Write (grass) to buy grass (Sheep, Cow)");
                    switch (input.next()) {
                        case "carrot" -> {
                            int i = 0;
                            int userChoiceOfKG = 0;
                            try {
                                System.out.println("How many KG of Carrot's do you want (input a number only)");
                                userChoiceOfKG = Integer.parseInt(input.next());
                            } catch (Exception ignored) {
                                System.out.println("Input a number of 0!");
                            }
                            while (i < userChoiceOfKG) {
                                player.foods.add(Carrot.buyCarrot());
                                player.money -= Carrot.initialFoodPrice;
                                i++;
                            }
                            System.out.println(player.money + " money left\n-------------------------------------------");
                        }
                        case "hay" -> {
                            int i = 0;
                            int userChoiceOfKG = 0;
                            try {
                                System.out.println("How many KG of Hay do you want (input a number only)");
                                userChoiceOfKG = Integer.parseInt(input.next());
                            } catch (Exception ignored) {
                                System.out.println("Input a number of 0!");
                            }
                            while (i < userChoiceOfKG) {
                                player.foods.add(Hay.buyHay());
                                player.money -= Hay.initialFoodPrice;
                                i++;
                            }
                            System.out.println(player.money + " money left\n-------------------------------------------");
                        }
                        case "grass" -> {
                            int i = 0;
                            int userChoiceOfKG = 0;
                            try {
                                System.out.println("How many KG of Grass do you want (input a number only)");
                                userChoiceOfKG = Integer.parseInt(input.next());
                            } catch (Exception ignored) {
                                System.out.println("Input a number of 0!");
                            }
                            while (i < userChoiceOfKG) {
                                player.foods.add(Grass.buyGrass());
                                player.money -= Grass.initialFoodPrice;
                                i++;
                            }
                            System.out.println(player.money + " money left\n-------------------------------------------");
                        }
                    }
                }
                    case "end" -> {
                        return;
                    }
                }
            }
    }
        public static void feedMenu (Player player){
            Scanner input = new Scanner(System.in);
            var feedAnimal = true;
            Animal selectedAnimal = null;
            Food selectedFood = null;
            while (feedAnimal) {
                System.out.println("Write (feed) to feed one of your animals");
                System.out.println("Write (end) to end the round for " + player.playerName);
                String chooseFeedOrEnd = input.next();
                switch (chooseFeedOrEnd) {
                    case "feed" -> {
                        int i = 0;
                        int j = 0;
                        System.out.println("Pigs only eat: Carrots");
                        System.out.println("Horses only eat Carrot and Hay");
                        System.out.println("Sheep only eat Hay and Grass");
                        System.out.println("Chickens only eat Hay");
                        System.out.println("Cows only eat Grass");
                        System.out.println("-----------------------------------------------------");
                        try {
                            for (var animal : player.animals) {
                                System.out.println(i + " : is your " + animal.breed + " named '" + animal.name + "' and has " +
                                        animal.health + " health");
                                System.out.println("-----------------------------------------------------");
                                i++;
                            }
                            selectedAnimal = player.animals.get(Integer.parseInt(input.next()));
                            for (var food : player.foods) {
                                System.out.println(j + ": is 1 KG of: " + food.name + " and it adds "
                                        + food.gainHealth + " health to your animal!");
                                System.out.println("-----------------------------------------------------");
                                j++;
                            }
                            selectedFood = player.foods.get(Integer.parseInt(input.next()));
                        }catch (Exception ignored){
                            Game.clear();
                            System.out.println("The animal or food chosen did not exist try again!\n");
                            feedMenu(player);
                        }
                                if (Horse.availableFoodsToEatHorse.contains(selectedFood.name)) {
                                    selectedAnimal.increaseHealth(selectedFood);
                                    player.foods.remove(selectedFood);
                                } else if (Pig.availableFoodsToEatPig.contains(selectedFood.name)) {
                                    selectedAnimal.increaseHealth(selectedFood);
                                    player.foods.remove(selectedFood);
                                } else if (Sheep.availableFoodsToEatSheep.contains(selectedFood.name)) {
                                    selectedAnimal.increaseHealth(selectedFood);
                                    player.foods.remove(selectedFood);
                                } else if (Chicken.availableFoodsToEatChicken.contains(selectedFood.name)) {
                                    selectedAnimal.increaseHealth(selectedFood);
                                    player.foods.remove(selectedFood);
                                } else if (Cow.availableFoodsToEatCow.contains(selectedFood.name)) {
                                    selectedAnimal.increaseHealth(selectedFood);
                                    player.foods.remove(selectedFood);
                                } else {
                                    Game.clear();
                                    System.out.println(selectedAnimal.breed + " does not eat " + selectedFood.name +
                                            "!\n-----------------------------------------------------");
                                    feedMenu(player);
                                }
                                Game.clear();
                            System.out.println(selectedAnimal.name +" now has "+ selectedAnimal.health+"\n");
                    }
                    case "end" -> {
                        return;
                    }
                }
            }
        }


}

