package com.company;
import java.util.*;
import java.util.Scanner;

public abstract class Animal {


    public int price;
    public String gender;
    public int health;
    public String name;
    public String breed;
    public static String[] list = {"male", "female"};
    public static Random r = new Random();


    public Animal(String name, String gender, int health, int price, String breed) {
        this.name = name;
        this.health = health;
        this.gender = gender;
        this.price = price;
        this.breed = breed;
    }

    public int getPrice() {
        return price * (health / 100);
    }

    public int increasePrice(Player player) {
        return player.money += getPrice();
    }

    public void decreaseHealth() {
        int decreaseHealthRandomNum = (10) + (int) (Math.random() * (30 - 10 + 1));
        health -= decreaseHealthRandomNum;
    }

    public void increaseHealth(Food food){
        health = Math.min(100, health + 10);
    }

    public static void mateAnimals(Player player){
        Game.clear();
        Scanner input = new Scanner(System.in);
        Animal firstBreedAnimal = null;
        Animal secondBreedAnimal = null;
        System.out.println("Write (mate) to try to make your animals mate");
        System.out.println("Write (end) to end the round for: "+ player.playerName);
        String choiceOptionMate = input.next();
        switch (choiceOptionMate){
            case "mate"->{
                int i = 0;
                for (var animal : player.animals){
                    System.out.println(i + " : is your " + animal.breed + " named '" + animal.name + "' and has " +
                            animal.health + " health");
                    System.out.println("-----------------------------------------------------");
                    i++;
                }
                System.out.println("Choose your 2 animals that you would like to try mate!");
                try {
                    firstBreedAnimal = player.animals.get(Integer.parseInt(input.next()));
                    secondBreedAnimal = player.animals.get(Integer.parseInt(input.next()));

                    if (firstBreedAnimal.breed.equals(secondBreedAnimal.breed) && !firstBreedAnimal.gender.equals(secondBreedAnimal.gender)) {
                        System.out.println("KOM INNNNNNNNNNNNNNNNNNNNNNNN!");
                        if (firstBreedAnimal.breed.equals("Pig")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Pig.createBabyPig());
                                    }
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Horse")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Horse.createBabyHorse());
                                    }
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Sheep")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Sheep.createBabySheep());
                                    }
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Chicken")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Chicken.createBabyChicken());
                                    }
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else if (firstBreedAnimal.breed.equals("Cow")) {
                            int ranBreedAnimals = 10 + (int) (Math.random() * 21);
                            try {
                                if (ranBreedAnimals < 15) {
                                    int howManyChildren = 1 + (int) (Math.random() * 5);
                                    for (int j = 0; j < howManyChildren; j++) {
                                        player.animals.add(Cow.createBabyCow());
                                    }
                                }
                            } catch (Exception ignored) {
                                System.out.println("Animals could not mate at this time");
                            }
                        } else {
                            Game.clear();
                            System.out.println("The animals chosen did not match");
                            mateAnimals(player);
                        }
                    }
                }catch(Exception ignored){
                    System.out.println("Could not mate these animals try again");
                    mateAnimals(player);
                }
            }
            case "end"->{
                return;
            }
        }
    }

}
