package facade.subsystems;

public class InventoryService {

    public void checkAvailability(String product) {
        // Check if the product is available in the inventory
        System.out.println("Checking availability of " + product);
    }

    public void decreaseStock(String product, int quantity) {
        // Decrease the stock of the product by the given quantity
        System.out.println("Decreasing stock of " + product + " by " + quantity);
    }
}
