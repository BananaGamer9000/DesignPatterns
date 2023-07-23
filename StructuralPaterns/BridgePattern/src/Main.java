import pizzas.PepperoniPizza;
import pizzas.VeggiePizza;
import restaurants.AmerricanRestaurant;
import restaurants.ItalianRestaurant;

public class Main {
    public static void main(String[] args) {

        /*
        The Bridge Pattern is basically two heirarchies connected by composition
         */


        AmerricanRestaurant american = new AmerricanRestaurant(new PepperoniPizza());
        ItalianRestaurant italia = new ItalianRestaurant(new VeggiePizza());

        american.deliver();

        System.out.println();

        italia.deliver();

    }
}