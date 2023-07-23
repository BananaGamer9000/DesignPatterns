public class Car implements Prototype{

    private int value;


    public Car(){   }

    public Car(int value){
        this.value = value;


    }

    @Override
    public Prototype clone() {
        return new Car(this.value);
    }

    public int getValue(){
        return value;
    }
}
