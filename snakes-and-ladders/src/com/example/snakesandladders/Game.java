package com.example.snakesandladders;

public class Game {
    public Player p1;
    public Player p2;
    public Dice theDice;
    
    public int snakeHead = 15;
    public int snakeTail = 5;
    public int ladderBottom = 4;
    public int ladderTop = 14;

    public Game(String name1, String name2) {
        this.p1 = new Player(name1);
        this.p2 = new Player(name2);
        this.theDice = new Dice();
    }

    public void playTurn(Player p) {
        System.out.print(p.name + " is at " + p.position + ".");
        
        int steps = theDice.roll();
        System.out.print(" Rolls " + steps + ".");

        p.position = p.position + steps;

        if (p.position > 20) {
            p.position = 20;
        }

        if (p.position == snakeHead) {
            System.out.print(" Bitten by snake!");
            p.position = snakeTail;
        }

        if (p.position == ladderBottom) {
            System.out.print(" Climbed a ladder!");
            p.position = ladderTop;
        }

        System.out.println(" Lands on " + p.position);
    }

    public void start() {
        System.out.println("Starting the simple game to 20...");
        System.out.println("Snake is at 15 -> 5. Ladder is at 4 -> 14\n");

        while(true) {
            playTurn(p1);
            if (p1.position == 20) {
                System.out.println(p1.name + " WON!");
                break;
            }

            playTurn(p2);
            if (p2.position == 20) {
                System.out.println(p2.name + " WON!");
                break;
            }
        }
    }
}