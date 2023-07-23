package restaurants;

import pizzas.Pizza;

public class AmerricanRestaurant extends Restaurant {
    public AmerricanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() { pizza.setSauce("Cetchup");
    }

    @Override
    public void addTopping() {
        pizza.setTopping("Cheese");

    }

    @Override
    public void addCrust() {
        pizza.setCrust("Chrispy");

    }
}
