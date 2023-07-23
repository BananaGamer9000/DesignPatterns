package notifier.baseNotifier.decorators;

import notifier.Notifier;
import notifier.baseNotifier.BasicNotifier;
import notifier.baseNotifier.NotifierDecorator;

public class InstagramNotifier extends NotifierDecorator {


    public InstagramNotifier(Notifier decorator) {
        super(decorator);
    }

    @Override
    public void sendNotification(String message) {
        decorator.sendNotification(message);
        System.out.println(((BasicNotifier) decorator).username + "Instagram Message" + message);
    }
}
