package pizzas;

public class PepperoniPizza extends Pizza{

    private String peperoni = "peperoni";


    @Override
    public void assemblePizza() {
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding topping: " + topping);
        System.out.println("Adding peperoni: " + peperoni);

    }
    @Override
    public void cookPizza() {
        System.out.println("Cooked while the crust is " + crust);

    }
}
