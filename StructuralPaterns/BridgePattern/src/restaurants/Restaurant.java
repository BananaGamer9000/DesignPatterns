package restaurants;

import pizzas.Pizza;

public abstract class Restaurant {

    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void addSauce();
    public abstract void addTopping();
    public abstract void addCrust();


    public void deliver(){
        addCrust();
        addSauce();
        addTopping();
        pizza.assemblePizza();
        pizza.cookPizza();
        System.out.println("Order in progress");
    }
}
