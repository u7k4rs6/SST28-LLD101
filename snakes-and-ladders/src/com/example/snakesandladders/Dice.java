package com.example.snakesandladders;
import java.util.Random;

public class Dice {
    public int roll() {
        Random rand = new Random();
        int number = rand.nextInt(6) + 1;
        return number;
    }
}