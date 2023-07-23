package pizzas;
public abstract class Pizza {

    protected String sauce;
    protected String topping;
    protected String crust;

    public abstract void assemblePizza();
    public abstract void cookPizza();


    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }


}
