package com.company;

import java.util.*;

public class Player {
    public ArrayList<Player> allPlayers = new ArrayList<Player>();
    Scanner input = new Scanner(System.in);
    int chooseHowManyPlayers;
    public String playerName;
    public int money;
    public Player player1;


    public Player(int money , String playerName){
    this.money = money;
    this.playerName = playerName;

    }
    public void createPlayers(){
        System.out.println("\nChoose how many players who are going to play 1-4");
        chooseHowManyPlayers = input.nextInt();
        if (chooseHowManyPlayers == 1) {
            System.out.println("Player 1 choose your name : ");

            player1 = new Player(1000, input.next());
            allPlayers.add(player1);
        }
        else if (chooseHowManyPlayers == 2) {
            System.out.println("Player 1 choose your name : ");
            Player player1 = new Player(1000, input.next());
            allPlayers.add(player1);
            System.out.println("Player 2 choose your name : ");
            Player player2 = new Player(1000, input.next());
            allPlayers.add(player2);
        }
        else if (chooseHowManyPlayers == 3) {
            System.out.println("Player 1 choose your name : ");
            Player player1 = new Player(1000, input.next());
            allPlayers.add(player1);
            System.out.println("Player 2 choose your name : ");
            Player player2 = new Player(1000, input.next());
            allPlayers.add(player2);
            System.out.println("Player 3 choose your name : ");
            Player player3 = new Player(1000, input.next());
            allPlayers.add(player3);
        }
        else{
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



}
