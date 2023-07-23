package notifier.baseNotifier;

import notifier.Notifier;

public class BasicNotifier implements Notifier {

    public String username;

    public BasicNotifier(String username) {
        this.username = username;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Username " + username + " Message " + message);
    }
}
