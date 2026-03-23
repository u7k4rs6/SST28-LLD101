public class Main {
    public static void main(String[] args) {
        System.out.println("=== Easy Notification System ===");

        Message myMsg = new Message("Welcome!", "Hello new user, please verify your account.", "student@sst.edu");
        
        EmailSender emailer = new EmailSender();
        emailer.send(myMsg);

        System.out.println("\n---------------------------\n");

        Message textMsg = new Message("Alert", "Your OTP is 9876", "9876543210");
        SmsSender textSender = new SmsSender();
        textSender.send(textMsg);
    }
}