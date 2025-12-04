package services.Message;

import models.Customer;

public class EmailSender implements MessageSender{
    public void sendMessage(Customer customer, String message){
        System.out.println("Sending email to " + customer.getEmail() + ": " + message);
    }
}