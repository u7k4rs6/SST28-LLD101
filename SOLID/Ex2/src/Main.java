public class Main {
    public static void main(String[] args) {
        System.out.println("=== Cafeteria System ===");

        MenuItem thali = new MenuItem("M1", "Veg Thali", 80.0);
        MenuItem coffee = new MenuItem("C1", "Coffee", 30.0);

        BillingSystem billing = new BillingSystem();
        
        double basePrice = billing.calculateBaseTotal(thali, 2, coffee, 1);
        System.out.println("Base Price: " + basePrice);

        String type = "student";
        double tax = billing.calculateTax(basePrice, type);
        System.out.println("Tax: " + tax);

        double discount = billing.calculateDiscount(basePrice, type);
        System.out.println("Discount: -" + discount);

        double finalPrice = basePrice + tax - discount;
        System.out.println("Total Amount to Pay: " + finalPrice);
    }
}