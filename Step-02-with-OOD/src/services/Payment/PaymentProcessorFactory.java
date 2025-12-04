package services.Payment;

import constants.PaymentMethods;

public class PaymentProcessorFactory {

    public static PaymentProcessor create(PaymentMethods method) {
        return switch (method) {
            case CARD -> new PayByCard();
            case PAYPAL -> new PayByPayPal();
            case CASH -> new PayByCash();
            case ONSITE -> new PayOnSite();
            default -> throw new IllegalArgumentException("Unknown payment type: " + method);
        };
    }
}
