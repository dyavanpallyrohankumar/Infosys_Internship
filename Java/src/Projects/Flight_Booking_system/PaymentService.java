package Projects.Flight_Booking_system;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {
    private final Map<SeatClass, Integer> priceMap = new HashMap<>();

    PaymentService() {
        priceMap.put(SeatClass.ECONOMY, 5000);
        priceMap.put(SeatClass.BUSINESS, 10000);
        priceMap.put(SeatClass.FIRSTCLASS, 15000);
    }

    public double charge(SeatClass seatClass) throws PaymentFailedException, InvalidSeatClassException {
        Integer price = priceMap.get(seatClass);
        if (seatClass == null) {
            throw new InvalidSeatClassException("Enter proper seatclass");
        }
        return price;
    }

}
