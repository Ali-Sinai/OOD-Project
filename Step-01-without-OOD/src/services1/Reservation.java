package services1;

import models1.Customer;
import models1.Room;

public class Reservation {
    public Room room;
    public Customer customer;
    public int nights;

    public Reservation(Room r, Customer c, int nights) {
        this.room = r;
        this.customer = c;
        this.nights = nights;
    }
    public double totalPrice(){
        return room.price * nights;
    }
}