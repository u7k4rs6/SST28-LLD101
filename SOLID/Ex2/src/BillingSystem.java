public class BillingSystem {
    public double calculateBaseTotal(MenuItem item1, int qty1, MenuItem item2, int qty2) {
        double total1 = item1.price * qty1;
        double total2 = item2.price * qty2;
        return total1 + total2;
    }

    public double calculateTax(double baseTotal, String customerType) {
        double taxRate = 0;
        if (customerType.equals("student")) {
            taxRate = 5.0; // 5% for students
        } else if (customerType.equals("staff")) {
            taxRate = 2.0; // 2% for staff
        } else {
            taxRate = 8.0; // 8% for normal people
        }
        
        double taxAmount = (baseTotal * taxRate) / 100;
        return taxAmount;
    }

    public double calculateDiscount(double baseTotal, String customerType) {
        double discount = 0;
        if (customerType.equals("student")) {
            if (baseTotal >= 180) {
                discount = 10.0;
            }
        }
        return discount;
    }
}