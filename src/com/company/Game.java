package com.company;
import java.util.*;
public class Game {

    ArrayList<Animal> player1Animals = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    ArrayList<Player> allPlayers = new ArrayList<Player>();
    int checkRound;
    int chooseHowManyPlayers;
    int rounds = 0;


    public Game() {

        System.out.println("Welcome to a farm simulator game");

        checkRounds();
        createPlayers();
        playGame();

        player1Animals.add(Animal.createChicken());

    }

    public void playGame() {
        while(!(rounds == checkRound)){
            choiceMenu();

        }


    }

    public void createPlayers() {
        System.out.println("\nChoose how many players who are going to play 1-4");
        chooseHowManyPlayers = input.nextInt();
        if (chooseHowManyPlayers == 1) {
            System.out.println("Player 1 choose your name : ");

            Player player1 = new Player(1000, input.next());
            allPlayers.add(player1);
        } else if (chooseHowManyPlayers == 2) {
            System.out.println("Player 1 choose your name : ");
            Player player1 = new Player(1000, input.next());
            allPlayers.add(player1);
            System.out.println("Player 2 choose your name : ");
            Player player2 = new Player(1000, input.next());
            allPlayers.add(player2);
        } else if (chooseHowManyPlayers == 3) {
            System.out.println("Player 1 choose your name : ");
            Player player1 = new Player(1000, input.next());
            allPlayers.add(player1);
            System.out.println("Player 2 choose your name : ");
            Player player2 = new Player(1000, input.next());
            allPlayers.add(player2);
            System.out.println("Player 3 choose your name : ");
            Player player3 = new Player(1000, input.next());
            allPlayers.add(player3);
        } else {
            System.out.println("Player 1 choose your name : ");
            Player player1 = new Player(1000, input.next());
            allPlayers.add(player1);
            System.out.println("Player 2 choose your name : ");
            Player player2 = new Player(1000, input.next());
            allPlayers.add(player2);
            System.out.println("Player 3 choose your name : ");
            Player player3 = new Player(1000, input.next());
            allPlayers.add(player3);
            System.out.println("Player 4 choose your name : ");
            Player player4 = new Player(1000, input.next());
            allPlayers.add(player4);
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

    public void choiceMenu() {
        System.out.println(allPlayers.get(0).playerName + " " + allPlayers.get(0).money);
        if (input.next().equals("buy")) {
            switch (input.next()) {
                case "pig" -> System.out.println("hello");
                case "horse" -> System.out.println("najs");
            }
        }


    }
}