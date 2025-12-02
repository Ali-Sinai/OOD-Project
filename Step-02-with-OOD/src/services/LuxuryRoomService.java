package services;

import models.LuxuryRoom;

public class LuxuryRoomService {
    public void addFreeDinner(LuxuryRoom room){
        System.out.println("Free dinner added for luxury room " + room.getNumber());
    }
}
