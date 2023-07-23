package restaurants;

import pizzas.Pizza;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Mayo");
    }

    @Override
    public void addTopping() {
        pizza.setTopping("Tomatoes");
    }

    @Override
    public void addCrust() {
        pizza.setCrust("Medium Chrispy");
    }
}
