package pizzas;

public class VeggiePizza extends Pizza{

    private String lettus = "lettus";


    @Override
    public void assemblePizza() {
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding topping: " + topping);
        System.out.println("Adding lettus: " + lettus);

    }

    @Override
    public void cookPizza() {
        System.out.println("Cooked while the crust is " + crust);

    }
}
