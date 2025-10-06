package Projects.Tirupati_Darshan_Booking_System;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        DarshanManager_Interface manager = new DarshanBookingSystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of devotees to book darshan slots:");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for devotee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Type (VIP/Standard): ");
            Type typeInput = Type.valueOf(scanner.next().toUpperCase());
            manager.addBooking(new Booking(new Devotee(name, i + 1), typeInput));
        }
        manager.displayBookings();
        manager.assignSlots();
        manager.displayDarshanSlots();
        manager.displayUniqueDevotees();

        scanner.close();
    }
}
