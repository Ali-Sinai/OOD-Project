package services.Payment;

public class PayByCash implements PaymentProcessor {
    @Override
    public void Pay(double amount) {
        System.out.println("Paid by cash: " + amount);
    }
}
