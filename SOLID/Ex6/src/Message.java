public class Message {
    public String subject;
    public String text;
    public String receiver;

    public Message(String subject, String text, String receiver) {
        this.subject = subject;
        this.text = text;
        this.receiver = receiver;
    }
}