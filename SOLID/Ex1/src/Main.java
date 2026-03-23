public class Main {
    public static void main(String[] args) {
        System.out.println("--- Student Registration ---");

        Database myDatabase = new Database();
        Validator myValidator = new Validator();

        String inputName = "Riya";
        String inputEmail = "riya@sst.edu";
        String inputPhone = "9876543210";
        String inputCourse = "CSE";

        boolean isValid = myValidator.checkDetails(inputName, inputEmail, inputPhone, inputCourse);

        if (isValid == true) {
            String newId = "SST-1001";
            Student newStudent = new Student(newId, inputName, inputEmail, inputPhone, inputCourse);
            
            myDatabase.addStudent(newStudent);
            System.out.println("Success! Student registered with ID: " + newId);
        } else {
            System.out.println("Registration Failed.");
        }
    }
}