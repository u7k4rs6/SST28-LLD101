package com.example.parkinglot;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Easy Parking System ===");

        ParkingSlot slot1 = new ParkingSlot(1);
        ParkingSlot slot2 = new ParkingSlot(2);

        Vehicle myCar = new Vehicle("DL-1234", "Car");
        Vehicle myBike = new Vehicle("MH-9999", "Bike");

        slot1.park(myCar);

        slot2.park(myBike);

        System.out.println("--- Few hours later ---");

        slot1.release();

        if (slot1.isOccupied == false) {
            System.out.println("Slot 1 is empty and ready for a new car.");
        }
    }
}