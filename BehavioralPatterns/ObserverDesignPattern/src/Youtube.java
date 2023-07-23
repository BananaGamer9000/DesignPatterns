import subChanel.Channel;
import subChanel.Subscriber;

public class Youtube {
    public static void main(String[] args) {


        /*
        The Observer Pattern makes it so when the state of the object changes(Joe Rogan Podcast)
        all its dependencies (subscribers) are notified and updated automatically
         */

        Channel jre = new Channel("TheJoeRoganPodcast");

        Subscriber george = new Subscriber("George");
        Subscriber john = new Subscriber("John");

        System.out.println(jre.subscribe(george));
        System.out.println(jre.subscribe(john));

        System.out.println();

        jre.notifySubscribers();

    }
}