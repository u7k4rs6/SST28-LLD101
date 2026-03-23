public class EmailSender {
    public void send(Message msg) {
        System.out.println("Connecting to SMTP SERVER...");
        System.out.println("To: " + msg.receiver);
        System.out.println("Subject: " + msg.subject);
        System.out.println("Body: " + msg.text);
        System.out.println("> Email sent properly.");
    }
}