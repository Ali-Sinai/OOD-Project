import constants1.PaymentMethods;
import models1.Customer;
import models1.LuxuryRoom;
import constants1.Notifier;
import services1.Reservation;
import models1.Room;
import services1.ReservationService;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Ali", "ali@example.com","09124483765", "Paris");
        Room room = new LuxuryRoom("203", 150);
        Reservation res = new Reservation(room, customer, 2);

        ReservationService service = new ReservationService();
        service.makeReservation(res, PaymentMethods.PAYPAL, Notifier.EMAIL);
    }
}