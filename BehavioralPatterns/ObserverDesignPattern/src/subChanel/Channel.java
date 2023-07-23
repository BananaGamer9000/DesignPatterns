package subChanel;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private String title;
    private List<Subscriber> subs = new ArrayList<>();


    public Channel(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String subscribe(Subscriber sub){
        subs.add(sub);
        return sub.getName() + " Has subscribed";
    }

    public  String unsubscribe(Subscriber sub){
        subs.remove(sub);
        return sub.getName() + " Has unsubscribed";
    }

    public void notifySubscribers(){
        for(Subscriber subscriber : subs){
            subscriber.update();
        }
    }

}
