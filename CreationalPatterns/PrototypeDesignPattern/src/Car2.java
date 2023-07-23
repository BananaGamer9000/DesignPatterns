public class Car2 implements Prototype {

    private String name;



    public Car2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public Prototype clone() {
        return new Car2(this.name);
    }
}
