package services.Payment;

import java.util.Map;
import models.*;

public class DiscountService {
    static Map<String, Double> map = Map.of(
    "Paris", 0.9
);
    public static void CalcDiscount(Customer customer, Room room) {
        Double discount = map.get(customer.getCity());
        if (discount == null) {
            return;
        }
        room.setPrice(room.getPrice() * discount);
        System.out.println("Apply city discount for " + customer.getCity() + "!");
    }
}
