package notifier.baseNotifier;

import notifier.Notifier;

public abstract class NotifierDecorator implements Notifier {

    protected Notifier decorator;

    public NotifierDecorator(Notifier decorator) {
        this.decorator = decorator;
    }


}
