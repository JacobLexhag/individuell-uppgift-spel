package com.company;
import java.util.*;
public class Game {


    Scanner input = new Scanner(System.in);
    static ArrayList<Player> allPlayers = new ArrayList<Player>();
    int checkRound;
    int chooseHowManyPlayers;

    int rounds = 1;
    int realRounds;

    public Game() {
        tipsAndTricks();
        checkRounds();
        createPlayer();
        playGame();

    }

    public void playGame() {

        while (rounds <= realRounds) {
            if(allPlayers.size() == 0){
                break;
            }
            for (Player player : allPlayers) {
                clear();
                Animal.animalDie(player);
                displayPlayer();
                clear();
                System.out.println("Round " + rounds + " !\n");
                Store.playerMenu(player);
                player.playerLost(player);
                for (Animal animal : player.animals) {
                    animal.decreaseHealth();
                }
            }
            rounds++;
        }
        clear();
        Player.playerWin();
    }

    public void createPlayer() {
        int playerAmount = 0;
        System.out.println("How many players want to play (1-4) : ");
        try {
            playerAmount = Integer.parseInt(input.next());
        } catch (Exception ignored) {
            System.out.println("");
        }
        if (playerAmount >= 1 && playerAmount <= 4){
            chooseHowManyPlayers = playerAmount;
        }else{
            clear();
            System.out.println("Wrong input 1-4 players\n");
            createPlayer();
        }

        for (int i = 1; i <= chooseHowManyPlayers; i++) {
            System.out.println("Player " + i + " choose your name : ");
            Player player = new Player(1000, input.next());
            allPlayers.add(player);
        }

    }


    public void checkRounds() {
        System.out.println("\nChoose how many rounds you wanna play 5-30");
        try {
            checkRound = Integer.parseInt(input.next());
            if (checkRound >= 5 && checkRound <= 30) {
               realRounds = checkRound;
            }else{
                System.out.println("Wrong input try again, input number 5-30!");
                checkRounds();
            }
        } catch (Exception ignored) {
            System.out.println("Wrong input try again, input a number between 5-30!\n");
            checkRounds();
        }
    }

    public void displayPlayer() {
        int playerNumber = 1;
        System.out.println("Press ENTER to continue!\n------------------------------------------------------------------------");
        for (var player : allPlayers) {
            System.out.println("Player " + playerNumber + ": " + player.playerName + " has: " + player.money + " money left\n" +
                    player.playerName + " animals and foods owned is: \n------------------------------------------------------------------------");
            for (var animal : player.animals) {
                System.out.println(animal.name + " is a: " + animal.breed + " with the gender: " + animal.gender + " and has a: " +
                        animal.health + " health left");
                System.out.println("------------------------------------------------------------------------");
            }
            for (var food : player.foods) {
                System.out.println("1 KG of: " + food.name);
                System.out.println("------------------------------------------------------------------------");
            }
            playerNumber++;
        }
        input.nextLine();
    }

    public static void clear() {
        System.out.println("\n".repeat(50));
    }

    public static int sleep(int chooseTime) {
        try {
            Thread.sleep(chooseTime);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        return chooseTime;
    }

    public void tipsAndTricks() {
        System.out.println("Welcome to farm simulator game! here are some rules for the game:\n" +
                "------------------------------------------------------------------------------------------------");
        System.out.println("Remember to try to input the what the game asks you to do");
        System.out.println("Every player starts with a 1000 money, if that reaches 0 the player will lose and leave the game");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Buying animals");
        System.out.println("If you choose buy animal you will be able to buy as many animals as you want that round");
        System.out.println("Remember you only have 1000 money so if the money runs out you can't buy animals anymore");
        System.out.println("All animals starts with 100 health");
        System.out.println("Animals lose 10-30 percent of their health every round and die when they reach 0 health");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Sell animals");
        System.out.println("If you choose the sell option you will be able to sell as many animals as you wish that round");
        System.out.println("If you sell animals you will get money back (the less health the " +
                        "animal has the less money you will get back");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Buying food and feeding animals");
        System.out.println("If you choose food you will be able to buy food that you can use to feed your animals");
        System.out.println("The food is purchased in kilograms");
        System.out.println("Feeding your animals with 1 kilogram will add 10 percent health to your animal");
        System.out.println("(Remember) All animals does not eat every food! ");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Mating");
        System.out.println("When you choose mate you can then choose two of your animals to mate");
        System.out.println("To mate the two animals chosen must be of the same breed and different gender");
        System.out.println("There is a 50 percent chance that the animals chosen successfully mate");
        System.out.println("if successful the animals will produce 1-5 babies");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Write (skip) here when you have read the rules to start the game: ");
        if (input.next().equals("skip")){
            clear();
        }
        else{
            tipsAndTricks();
        }
    }
}
