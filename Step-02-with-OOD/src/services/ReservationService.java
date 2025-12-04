package services;

import constants.Notifier;
import constants.PaymentMethods;
import models.Reservation;
import services.Message.MessageSender;
import services.Message.MessageSenderFactory;
import services.Payment.DiscountService;
import services.Payment.PaymentProcessor;
import services.Payment.PaymentProcessorFactory;

public class ReservationService {
    public void makeReservation(Reservation res, PaymentMethods paymentType, Notifier notifier){
        System.out.println("Processing reservation for " + res.getCustomer().getName());

        DiscountService.CalcDiscount(res.getCustomer(), res.getRoom());

        PaymentProcessor paymentProcessor = PaymentProcessorFactory.create(paymentType);
        paymentProcessor.Pay(totalPrice(res));

        PrintInvoice.Print(res, totalPrice(res));

        MessageSender messageSender = MessageSenderFactory.creat(notifier);
        messageSender.sendMessage(res.getCustomer(), "Your reservation confirmed!");
    }

    public double totalPrice(Reservation reservation){
        return reservation.getRoom().getPrice() * reservation.getNights();
    }
}