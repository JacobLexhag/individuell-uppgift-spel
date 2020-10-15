package com.company;
import java.util.*;
public class Game {


    Scanner input = new Scanner(System.in);
    static ArrayList<Player> allPlayers = new ArrayList<Player>();
    int checkRound;
    int chooseHowManyPlayers;

    int rounds = 1;


    public Game() {

        System.out.println("Welcome to a farm simulator game");

        checkRounds();
        createPlayer();
        playGame();

    }

    public void playGame() {

        while(rounds <= checkRound){

           for (Player player : allPlayers){
                clear();
                displayPlayer();
                sleep();
                clear();
                System.out.println("Round " + rounds + " !\n");
               for (Animal animal : player.animals){
                   animal.decreaseHealth();
                   System.out.println(animal.health);
               }
                Store.playerMenu(player);
            }
            rounds++;
        }
        System.out.println("Farming simulator has ended");
    }

    public void createPlayer() {

        System.out.println("How many player want to play (1-4) : ");
        try {
            chooseHowManyPlayers = Integer.parseInt(input.next());
        }catch(Exception ignored){
            System.out.println("Input a number between 1-4!");
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
        }catch(Exception ignored){
            System.out.println("Input a number between 5-30!");
            checkRounds();
        }

        while (!(checkRound >= 5 && checkRound <= 30)) {
            System.out.println("Try again input a number between 5 and 30 : ");
            checkRound = input.nextInt();

        }

    }
    public void displayPlayer(){
        int playerNumber = 1;
        System.out.println("Round will start in 15 seconds!\n----------------------------------------------------------------");
        for (var player : allPlayers){
            System.out.println("Player "+ playerNumber+ ": "+player.playerName+ " has: "+player.money+" money left\n" +
                    player.playerName+ " animals and foods owned is: \n----------------------------------------------------------------");
            for (var animal : player.animals){
                System.out.println(animal.name+" is a: "+ animal.breed+" with the gender: "+animal.gender+" and has a: "+
                        animal.health+" health left");
                System.out.println("----------------------------------------------------------------");
            }
            for (var food : player.foods){
                System.out.println("1 KG of: "+food.name);
                System.out.println("----------------------------------------------------------------");
            }
            playerNumber++;
        }

    }
    public static void clear(){
        System.out.println("\n".repeat(50));
    }
    public static void sleep(){
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException e){System.out.println(e);}

    }
}

