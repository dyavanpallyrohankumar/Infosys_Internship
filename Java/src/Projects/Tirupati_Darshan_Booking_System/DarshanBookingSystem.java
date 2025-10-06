package Projects.Tirupati_Darshan_Booking_System;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class DarshanBookingSystem implements DarshanManager_Interface {
    // o Holds all collections and implements the required methods

    List<Booking> bookings = new ArrayList<>();
    Set<Devotee> uniqueDevotees = new HashSet<>();
    Queue<Booking> standard_queue = new ArrayDeque<>();
    PriorityQueue<Booking> vip_queue = new PriorityQueue<>();
    Map<Devotee, Type> darshanSlots = new HashMap<>();

    @Override
    public void addBooking(Booking booking) {
        bookings.add(booking);
        uniqueDevotees.add(booking.getDevotee());
        if (booking.getType() == Type.VIP) {
            vip_queue.add(booking);
        } else {
            standard_queue.add(booking);

        }
        // darshanSlots.put(booking.getType(), booking.getDevotee().getName());
    }

    @Override
    public void assignSlots() {
        int hour = 9;
        int minute = 0;
        while (!vip_queue.isEmpty()) {
            Booking booking = vip_queue.poll();
            darshanSlots.put(booking.getDevotee(), booking.getType());
            System.out.println("Assigned VIP slot to " + booking.getDevotee().getName() + " at " + hour + ":"
                    + (minute < 10 ? "0" + minute : minute));
            minute += 10;
            if (minute == 60) {
                minute = 0;
                hour++;
            }
        }
    }

    @Override
    public void displayBookings() {
        for (Booking booking : bookings) {
            System.out.println(booking);
        }

    }

    @Override
    public void displayUniqueDevotees() {
        for (Devotee devotee : uniqueDevotees) {
            System.out.println(devotee);
        }
    }

    @Override
    public void displayDarshanSlots() {
        for (Map.Entry<Devotee, Type> entry : darshanSlots.entrySet()) {
            System.out.println("Devotee: " + entry.getKey() + ", Type: " + entry.getValue());
        }
    }

}
