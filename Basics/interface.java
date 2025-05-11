// Define an interface
interface Payment {
    void processPayment(double amount); // Abstract method
}

// Implement the interface in a class
class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

class PayPalPayment implements Payment {
    //overriding the function
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of ₹" + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        // Create objects implementing the interface
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        // Process payments
        payment1.processPayment(5000);
        payment2.processPayment(3000);
    }
}
