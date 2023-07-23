package facade;

import facade.subsystems.InventoryService;
import facade.subsystems.PaymentService;
import facade.subsystems.ShippingService;

public class OrderFacade {

    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade() {
        inventoryService = new InventoryService();
        paymentService = new PaymentService();
        shippingService = new ShippingService();
    }

    //Provides the client an easy to use, interface by hiding
    //the complexity of the other classes
    public void placeOrder(String product, int quantity, String paymentMethod, double amount, String address) {
        inventoryService.checkAvailability(product);
        inventoryService.decreaseStock(product, quantity);
        paymentService.processPayment(paymentMethod, amount);
        shippingService.shipOrder(address);
        System.out.println("Order placed successfully!");
    }
}
