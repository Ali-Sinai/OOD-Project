package services.Payment;

public class PayByPayPal implements PaymentProcessor {
    @Override
    public void Pay(double amount) {
        System.out.println("Paid by PayPal: " + amount);
    }    
}
