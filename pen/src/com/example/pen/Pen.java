package com.example.pen;

public class Pen {
    public boolean isCapOn;
    public Refill theRefill;

    public Pen() {
        this.isCapOn = true; // By default cap is on
        this.theRefill = new Refill();
    }

    public void takeCapOff() {
        this.isCapOn = false;
        System.out.println("Cap is now off.");
    }

    public void putCapOn() {
        this.isCapOn = true;
        System.out.println("Cap is safely on.");
    }

    public void writeSomething(String text) {
        if (isCapOn == true) {
            System.out.println("Cannot write! Take the cap off first.");
            return;
        }

        if (theRefill.hasInk() == false) {
            System.out.println("Cannot write! The pen is out of ink.");
            return;
        }

        System.out.println("Writing: " + text);
        theRefill.useInk(); // deduct ink every time we write
        System.out.println("(Ink remaining: " + theRefill.inkLevel + "%)");
    }
}