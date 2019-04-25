package usingObserver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailPublisher {

    private Map<MailType, List<MailListener>> listeners;

    public MailPublisher() {
        this.listeners = new HashMap<>();
    }

    public void addListener(MailType type, MailListener listener) {

        List<MailListener> list = listeners.get(type);
        if (list == null) {
            list = new ArrayList<>();
            listeners.put(type, list);
        }
        list.add(listener);
    }

    public void removeListener(MailType type, MailListener listener) {

        List<MailListener> list = listeners.get(type);
        if (list != null) {
            list.remove(listener);
        }
    }

    public void notifyMail(MailType type, String message) {

        List<MailListener> list = listeners.get(type);
        for (MailListener listener : list) {
            listener.send(type, message);
        }
    }
}
