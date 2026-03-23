package com.example.pen;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Easy Pen Demo ===");

        Pen myPen = new Pen();

        myPen.writeSomething("Hello sir");

        System.out.println("Wait, taking cap off...");
        myPen.takeCapOff();
        myPen.writeSomething("Hello sir");
        myPen.putCapOn();
    }
}