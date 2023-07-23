package facade.subsystems;

public class PaymentService {

    public void processPayment(String paymentMethod, double amount) {
        // Process the payment using the specified method and amount
        System.out.println("Processing payment of $" + amount + " using " + paymentMethod);
    }
}
