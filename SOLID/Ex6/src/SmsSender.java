public class SmsSender {
    public void send(Message msg) {
        System.out.println("Connecting to Telecom network...");
        System.out.println("To (Phone Number): " + msg.receiver);
        System.out.println("Text: " + msg.text);
        System.out.println("> SMS dispatched onto network.");
    }
}