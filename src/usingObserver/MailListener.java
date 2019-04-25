package usingObserver;

public class MailListener {

    private String name;

    public MailListener(String name) {
        this.name = name;
    }

    public void send(MailType type, String message) {
        System.out.println("Name: " + name + "\nType: " + type + "\nMessage: " + message + "\n");
    }
}
