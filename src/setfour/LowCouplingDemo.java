package setfour;

// Interface representing a Payment method
interface PaymentMethod {
    void processPayment(double amount);
}

// Concrete class implementing the PaymentMethod interface
class CreditCardPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        // Additional logic for credit card payment processing
    }
}

// Another concrete class implementing the PaymentMethod interface
class PayPalPayment implements PaymentMethod {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Additional logic for PayPal payment processing
    }
}

// Class with low coupling that uses a PaymentMethod
class ShoppingCart {
    private PaymentMethod paymentMethod;

    // Constructor that accepts any class implementing the PaymentMethod interface
    public ShoppingCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Method to process payment using the provided PaymentMethod
    public void checkout(double totalAmount) {
        System.out.println("Checking out items...");
        paymentMethod.processPayment(totalAmount);
        // Additional logic for checkout
    }
}

public class LowCouplingDemo {

    public static void main(String[] args) {
        // Creating instances with low coupling
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();

        // Using low coupling to process payments
        ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
        ShoppingCart cart2 = new ShoppingCart(payPalPayment);

        // Checking out with different payment methods
        cart1.checkout(100.0);
        cart2.checkout(50.0);
    }
}
