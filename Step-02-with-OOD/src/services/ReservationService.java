package services;

import constants.Notifier;
import constants.PaymentMethods;
import models.Reservation;

public class ReservationService {
    private Notifier notifier = Notifier.EMAIL; //default Notifier
    private PaymentProcessor paymentProcessor = new PaymentProcessor();

    public void makeReservation(Reservation res, PaymentMethods paymentType, Notifier notifier){
        System.out.println("Processing reservation for " + res.getCustomer().getName());
        double totalPrice = res.getNights() * res.getRoom().getPrice();
        if(res.getCustomer().getCity().equals("Paris")){
            System.out.println("Apply city discount for Paris!");
            res.getRoom().setPrice(res.getRoom().getPrice() * 0.9);
        }

        switch (paymentType){
            case CARD:
                paymentProcessor.payByCard(totalPrice);
                break;
            case PAYPAL:
                paymentProcessor.payByPayPal(totalPrice);
                break;
            case CASH:
                paymentProcessor.payByCash(totalPrice);
                break;
        }

        PrintInvoice.Print(res, totalPrice);

        switch (this.notifier){
           case EMAIL :
           EmailSender emailSender = new EmailSender();
           emailSender.sendEmail(res.getCustomer().getEmail(), "Your reservation confirmed!");
           break;
           default:
               System.out.println("There is no Message Provider");
        }
    }
}