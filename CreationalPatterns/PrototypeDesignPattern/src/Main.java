public class Main {
    public static void main(String[] args) {


        Car car1 = new Car(10);
        Car2 car2 = new Car2("Car2");

        Car copy1 = (Car) car1.clone();
        Car2 copy2 = (Car2) car2.clone();


        System.out.println("Original Value: " + car1.getValue());
        System.out.println("Copy Value: " + copy1.getValue());

        System.out.println();

        System.out.println("Original value: " + car2.getName());
        System.out.println("Copy value: " + copy2.getName());
    }
}