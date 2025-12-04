package services.Message;

import constants.Notifier;

public class MessageSenderFactory {
    public static MessageSender creat(Notifier NotifierType){
        return switch (NotifierType) {
            case SMS -> new SmsSender();
            case EMAIL -> new EmailSender();
            default -> throw new IllegalArgumentException("Unknown notifier type: " + NotifierType);
        };
    }
}