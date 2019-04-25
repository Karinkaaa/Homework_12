package usingObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailPublisher2 {

    private List<MailListener> listeners;

    public MailPublisher2() {
        this.listeners = new ArrayList<>();
    }

    public void addListener(MailType type, MailListener listener) {
        listeners.add(listener);
    }

    public void removeListener(MailType type, MailListener listener) {
        listeners.remove(listener);
    }

    public void notifyMail(MailType type, String message) {
        for (MailListener listener : listeners) {
            listener.send(type, message);
        }
    }
}
