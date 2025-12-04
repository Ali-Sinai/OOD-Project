package services.Message;

import models.Customer;

public interface MessageSender {
    public void sendMessage(Customer customer, String message);
}