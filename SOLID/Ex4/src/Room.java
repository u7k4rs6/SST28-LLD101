public class Room {
    public int roomType; // 1=Single, 2=Double, 3=Triple
    public double basePrice;

    public Room(int roomType) {
        this.roomType = roomType;
        if (roomType == 1) {
            this.basePrice = 14000.0;
        } else if (roomType == 2) {
            this.basePrice = 15000.0;
        } else if (roomType == 3) {
            this.basePrice = 12000.0;
        } else {
            this.basePrice = 16000.0; // Deluxe
        }
    }
}