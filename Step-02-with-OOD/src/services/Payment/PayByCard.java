package services.Payment;

public class PayByCard implements PaymentProcessor {
    @Override
    public void Pay(double amount) {
        System.out.println("Paid by card: " + amount);
    }  
}
