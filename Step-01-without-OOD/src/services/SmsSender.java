package services;

public class SmsSender implements MessageSender{
    public void sendMessage(String to, String message) {
        System.out.println("Sending sms to " + to + ": " + message);
    }
    
}
