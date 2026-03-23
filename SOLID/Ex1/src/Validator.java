public class Validator {
    public boolean checkDetails(String name, String email, String phone, String course) {
        if (name.equals("")) {
            System.out.println("Error: Name is empty");
            return false;
        }
        if (email.contains("@") == false) {
            System.out.println("Error: Email is invalid");
            return false;
        }
        if (course.equals("CSE") || course.equals("AI") || course.equals("SWE")) {
        } else {
            System.out.println("Error: Course not allowed");
            return false;
        }
        return true;
    }
}