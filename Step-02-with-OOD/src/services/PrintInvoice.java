package services;

import models.Reservation;

public class PrintInvoice {
    public static void Print(Reservation res, Double totalPrice){
        System.out.println("----- INVOICE -----");
        System.out.println("hotel.Customer: " + res.getCustomer().getName());
        System.out.println("hotel.Room: " + res.getRoom().getNumber() + " (" + res.getRoom().getType() + ")");
        System.out.println("Total: " + totalPrice);
        System.out.println("-------------------");
    }
}
