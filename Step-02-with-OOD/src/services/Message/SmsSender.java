package services.Message;

import models.Customer;

public class SmsSender implements MessageSender{
    public void sendMessage(Customer customer, String message) {
        System.out.println("Sending sms to " + customer.getMobile() + ": " + message);
    }
    
}