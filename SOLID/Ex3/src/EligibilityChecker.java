public class EligibilityChecker {
    
    public boolean checkEligibility(StudentStats student) {
        boolean isEligible = true;

        if (student.cgpa < 7.5) {
            System.out.println("Failed: CGPA is too low.");
            isEligible = false;
        }

        if (student.attendance < 75) {
            System.out.println("Failed: Attendance is short.");
            isEligible = false;
        }

        if (student.backlogs > 0) {
            System.out.println("Failed: You have active backlogs.");
            isEligible = false;
        }

        return isEligible;
    }
}