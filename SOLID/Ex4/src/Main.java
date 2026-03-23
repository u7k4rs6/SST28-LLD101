public class Main {
    public static void main(String[] args) {
        System.out.println("=== Single Hostel Fee Calculator ===");

        Room myRoom = new Room(2);
        
        Services myServices = new Services(true, true, false);

        FeeCalculator calc = new FeeCalculator();
        double finalPrice = calc.calculateTotalFee(myRoom, myServices);

        System.out.println("Final Total (Room + Extra + Deposit) = Rs." + finalPrice);
    }
}