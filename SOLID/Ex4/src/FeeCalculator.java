public class FeeCalculator {
    public double calculateTotalFee(Room room, Services services) {
        double total = room.basePrice + services.calculateExtras();
        
        double grandTotal = total + 5000.0;

        System.out.println("Monthly Cost: " + total);
        System.out.println("Security Deposit: 5000.0");
        System.out.println("Grand Total Details calculated successfully.");
        return grandTotal;
    }
}