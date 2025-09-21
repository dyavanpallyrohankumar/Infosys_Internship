package Projects.Flight_Booking_system;

import java.util.HashMap;
import java.util.Map;

public class PaymentService {

    private final Map<SeatClass, Integer> priceMap = new HashMap<>();

    public PaymentService() {
        // sample prices (INR)
        priceMap.put(SeatClass.ECONOMY, 5000);
        priceMap.put(SeatClass.BUSINESS, 15000);
        priceMap.put(SeatClass.FIRSTCLASS, 30000);
    }

    public int charge(SeatClass sc) throws PaymentFailedException {
        // In a real world system we'd call a payment gateway here.
        // For demo: always succeed. Could simulate failure randomly if desired.
        Integer price = priceMap.get(sc);
        if (price == null)
            throw new PaymentFailedException("Unable to determine price for seat class");
        // Simulate success
        return price;
    }

}
