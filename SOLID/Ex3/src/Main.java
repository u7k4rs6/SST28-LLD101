public class Main {
    public static void main(String[] args) {
        System.out.println("=== Placement Checker ===");

        StudentStats student = new StudentStats("Ayaan", 8.1, 72, 0);

        EligibilityChecker checker = new EligibilityChecker();
        boolean passed = checker.checkEligibility(student);

        if (passed == true) {
            System.out.println(student.name + " is ELIGIBLE for placements.");
        } else {
            System.out.println(student.name + " is NOT ELIGIBLE.");
        }
    }
}