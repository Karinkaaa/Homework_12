package usingObserver;

public class MailType {

    private String name;

    public MailType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
