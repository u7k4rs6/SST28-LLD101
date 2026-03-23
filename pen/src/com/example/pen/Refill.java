package com.example.pen;

public class Refill {
    public int inkLevel;

    public Refill() {
        this.inkLevel = 100; // Start with 100% ink
    }

    public boolean hasInk() {
        if (inkLevel > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void useInk() {
        if (inkLevel > 0) {
            inkLevel = inkLevel - 10;
        }
    }
}