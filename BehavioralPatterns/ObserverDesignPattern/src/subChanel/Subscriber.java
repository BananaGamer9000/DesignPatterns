package subChanel;

public class Subscriber {

    private String name;
    Channel chanel = new Channel("TheJoeRoganPodcast");

    public Subscriber(String name) {
        this.name = name;
    }



    public void update(){
        System.out.println("Hey " + this.name + " " + chanel.getTitle() + ": Has uploaded a new video");
    }


    public String getName() {
        return name;
    }


}
