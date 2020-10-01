package com.company;
import java.util.*;
public class Game  {



    Scanner input = new Scanner(System.in);
    int checkRound;
    ArrayList<Player> allPlayers = new ArrayList<Player>();


    public Game() {
        System.out.println("Welcome to a farm simulator game");
        checkRounds();
    }

    public void playGame(Player player){
        player.createPlayers();

        for(var bög : allPlayers){
            System.out.println(bög);
        }

    }



        public void checkRounds () {
            System.out.println("\nChoose how many rounds you wanna play 5-30");
            checkRound = input.nextInt();

            while (!(checkRound >= 5 && checkRound <= 30)) {
                System.out.println("Try again input a number between 5 and 30 : ");
                checkRound = input.nextInt();

            }

        }

        public void choiceMenu(){
            if (input.nextLine().equals("buy")){
                switch (input.nextLine()) {
                    case "pig" -> System.out.println("hello");
                    case "horse"-> System.out.println("fuck off");
                }
            }
        }

}
