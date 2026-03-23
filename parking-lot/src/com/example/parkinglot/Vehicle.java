package com.example.parkinglot;

public class Vehicle {
    public String licensePlate;
    public String type; // "Car", "Bike", "Truck"

    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }
}