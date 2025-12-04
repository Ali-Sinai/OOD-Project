package services.Payment;

public class PayOnSite implements PaymentProcessor {
    @Override
    public void Pay(double amount) {
        System.out.println("Paid On Site: " + amount);
    }    
}
