import abilityes.Fly;

public class Animals {
    public Fly flyingType;
    public String tryToFly(){
        return flyingType.fly();
    }
    public void setFlying(Fly newFlyingType){
        flyingType = newFlyingType;
    }



    public static void main(String[] args) {

        /*
        The Strategy Pattern uses a class to define the interface methods
        and then choose which ones to use since they are not mandatory to
        implement anymore down the chain
         */



        Animals spark = new Dog();
        Animals tweety = new Bird();

        spark.tryToFly();

        tweety.tryToFly();


    }
}