import facade.OrderFacade;

public class Main {
    public static void main(String[] args) {

        /*
         The facade method in the Facade Pattern provides a simple and
         unified functionality to the client by using composition to
         interact with the underlying subsystems
         */

        OrderFacade orderFacade = new OrderFacade();
        String product = "Smartphone";
        int quantity = 2;
        String paymentMethod = "Credit Card";
        double amount = 1000.0;
        String address = "1234 Main St, City";

        orderFacade.placeOrder(product, quantity, paymentMethod, amount, address);
    }
}