package com.company;

import java.util.*;

public class Player {

    Scanner input = new Scanner(System.in);
    public String playerName;
    public int money;
    public ArrayList<Animal> animals = new ArrayList<>();
    public ArrayList<Food> foods = new ArrayList<>();



    public Player(int money , String playerName){
    this.money = money;
    this.playerName = playerName;

    }
    public static void mateAnimals(Player player){
        Game.clear();
        Scanner input = new Scanner(System.in);
        Animal firstBreedAnimal = null;
        Animal secondBreedAnimal = null;
                int i = 0;
                for (var animal : player.animals){
                    System.out.println(i + " : is your " +animal.gender+ " "+ animal.breed + " named '" + animal.name + "' and has " +
                            animal.health + " health");
                    System.out.println("-----------------------------------------------------");
                    i++;
                }
                System.out.println("Choose your 2 animals that you would like to try mate!");
                try {
                    firstBreedAnimal = player.animals.get(Integer.parseInt(input.next()));
                    secondBreedAnimal = player.animals.get(Integer.parseInt(input.next()));

                    if (firstBreedAnimal.breed.equals(secondBreedAnimal.breed) && !firstBreedAnimal.gender.equals(secondBreedAnimal.gender)) {
                        if (firstBreedAnimal.breed.equals("Pig")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    System.out.println(firstBreedAnimal.name+ " and "+ secondBreedAnimal.name+ " successfully mated and created: " +
                                            + howManyChildren+ " babies!\n-----------------------------------------------------------------------------" );
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Pig.createBabyPig());
                                    }
                                }else{
                                    System.out.println(firstBreedAnimal.name + " and "+secondBreedAnimal.name+ " did not successfully mate!\n");
                                    System.out.println("You can try again next round!");
                                    Game.sleep(3000);
                                    Game.clear();
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Horse")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    System.out.println(firstBreedAnimal.name+ " and "+ secondBreedAnimal.name+ " successfully mated and created: " +
                                            + howManyChildren+ " babies!\n-----------------------------------------------------------------------------" );
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Horse.createBabyHorse());
                                    }
                                }else{
                                    System.out.println(firstBreedAnimal.name + " and "+secondBreedAnimal.name+ " did not successfully mate!\n");
                                    System.out.println("You can try again next round!");
                                    Game.sleep(3000);
                                    Game.clear();
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Sheep")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    System.out.println(firstBreedAnimal.name+ " and "+ secondBreedAnimal.name+ " successfully mated and created: " +
                                            + howManyChildren+ " babies!\n-----------------------------------------------------------------------------" );
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Sheep.createBabySheep());
                                    }
                                }else{
                                    System.out.println(firstBreedAnimal.name + " and "+secondBreedAnimal.name+ " did not successfully mate!\n");
                                    System.out.println("You can try again next round!");
                                    Game.sleep(3000);
                                    Game.clear();
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Chicken")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    System.out.println(firstBreedAnimal.name+ " and "+ secondBreedAnimal.name+ " successfully mated and created: " +
                                            + howManyChildren+ " babies!\n-----------------------------------------------------------------------------" );
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Chicken.createBabyChicken());
                                    }
                                }else{
                                    System.out.println(firstBreedAnimal.name + " and "+secondBreedAnimal.name+ " did not successfully mate!\n");
                                    System.out.println("You can try again next round!");
                                    Game.sleep(3000);
                                    Game.clear();
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Cow")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    System.out.println(firstBreedAnimal.name+ " and "+ secondBreedAnimal.name+ " successfully mated and created: " +
                                            + howManyChildren+ " babies!\n-----------------------------------------------------------------------------" );
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Cow.createBabyCow());
                                    }
                                }else{
                                    System.out.println(firstBreedAnimal.name + " and "+secondBreedAnimal.name+ " did not successfully mate!\n");
                                    System.out.println("You can try again next round!");
                                    Game.sleep(3000);
                                    Game.clear();
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else {
                            Game.clear();
                            System.out.println("The animals chosen did not match, Try again!");
                            mateAnimals(player);
                        }
                    }else{
                        System.out.println(firstBreedAnimal.name + " and "+secondBreedAnimal.name+ " did not successfully mate!\n");
                    }
                }catch(Exception ignored){
                    System.out.println("Could not mate these animals try again");
                    mateAnimals(player);
                }

    }
    public void playerLost(Player player){
        int x = 0;
        if (money <= 850){
          if (player.animals.size() == 0){
              System.out.println(player.playerName +" you have lost the game! and will now be removed from the game");
              System.out.println("Press ENTER to continue the game for remaining players");
              input.nextLine();
              for (int i = Game.allPlayers.size() + 1; i >= x; i--){
                  Game.allPlayers.remove(player);
              }
          }else {
              System.out.println(player.playerName +" you have to sell some of your animals to get some money back!\n");
              Game.sleep(4000);
              Store.sellAnimal(player);
          }
        }else{
            System.out.println("");
        }
    }

    public static void playerWin(){
        int counter = 1;
        if (Game.allPlayers.size() == 0){
            System.out.println("All players lost!");
            return;
        }
        System.out.println("Game has ended here is the scoreboard:\n---------------------------------------------------------------------");
        for (var players : Game.allPlayers){
                for (var animals : players.animals) {
                    animals.increasePrice(players);
                }

                System.out.println(counter + " : " + players.playerName + " with: " + players.money + " money left!");
                counter++;
        }
        Game.allPlayers.sort((Player a, Player b) -> a.money > b.money ? -1 : 1);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("The winner is: "+ Game.allPlayers.get(0).playerName+"!");
    }
}







