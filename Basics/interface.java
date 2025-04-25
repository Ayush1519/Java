// Define an interface
interface Payment {
    void processPayment(double amount); 
}


class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of ₹" + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        
        payment1.processPayment(5000);
        payment2.processPayment(3000);
    }
}
