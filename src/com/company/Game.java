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
                System.out.println("Round " + rounds + " !\n");
                Store.playerMenu(player);
            }
        rounds++;
        }
        System.out.println("Farming simulator has ended");
    }

    public void createPlayer() {

        System.out.println("How many player want to play (1-4) : ");
        chooseHowManyPlayers = input.nextInt();
        for (int i = 1; i <= chooseHowManyPlayers; i++) {
            System.out.println("Player " + i + " choose your name : ");

            Player player = new Player(1000, input.next());
            allPlayers.add(player);

        }
    }



    public void checkRounds() {
        System.out.println("\nChoose how many rounds you wanna play 5-30");
        checkRound = input.nextInt();

        while (!(checkRound >= 5 && checkRound <= 30)) {
            System.out.println("Try again input a number between 5 and 30 : ");
            checkRound = input.nextInt();

        }

    }
    public void displayPlayer(Player player){

    }
    public static void clear(){
        System.out.println("\n".repeat(50));
    }




}
