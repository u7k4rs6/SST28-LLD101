package com.example.parkinglot;

public class ParkingSlot {
    public int slotNumber;
    public boolean isOccupied;
    public Vehicle parkedVehicle; // null if empty

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
        this.isOccupied = false;
        this.parkedVehicle = null;
    }

    public void park(Vehicle v) {
        this.parkedVehicle = v;
        this.isOccupied = true;
        System.out.println("Parked Vehicle " + v.licensePlate + " at slot " + slotNumber);
    }

    public void release() {
        if (this.isOccupied == false) {
            System.out.println("Slot " + slotNumber + " is already empty!");
            return;
        }
        System.out.println("Vehicle " + parkedVehicle.licensePlate + " leaving slot " + slotNumber);
        this.parkedVehicle = null;
        this.isOccupied = false;
    }
}