import notifier.Notifier;
import notifier.baseNotifier.BasicNotifier;
import notifier.baseNotifier.decorators.FacebookNotifier;
import notifier.baseNotifier.decorators.InstagramNotifier;
import notifier.baseNotifier.decorators.WatsAppNotifier;

public class Apps {
    public static void main(String[] args) {

        /*
        The Decorator pattern allows you to dynamically add new behavior or
        functionalities to objects without modifying their structure
         */

        Notifier john = new BasicNotifier("John");
        john.sendNotification("Hey John you have a new message");

        System.out.println();

        Notifier johnFacebook = new FacebookNotifier(john);
        johnFacebook.sendNotification("New like on your photo");

        System.out.println();

        Notifier johnInstagram = new InstagramNotifier(john);
        johnInstagram.sendNotification("Someone followed you");

        System.out.println();

        Notifier johnWatsApp = new WatsAppNotifier(john);
        johnWatsApp.sendNotification("You have 3 unread messages");

    }
}