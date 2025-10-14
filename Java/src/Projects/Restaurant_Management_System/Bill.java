package Projects.Restaurant_Management_System;

class Bill {
    private Order order;

    public Bill(Order order) {
        this.order = order;
    }

    public void generateBill() {
        double subtotal = order.calculateTotal();
        double gst = subtotal * 0.05;
        double discount = (subtotal > 500) ? subtotal * 0.1 : 0;
        double finalAmount = subtotal + gst - discount;

        System.out.println("\n--- BILL ---");
        for (OrderItem oi : order.getItems()) {
            System.out.println(oi);
        }
        System.out.println("----------------------");
        System.out.println("Subtotal: ₹" + subtotal);
        System.out.println("GST (5%): ₹" + gst);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Total Payable: ₹" + finalAmount);
        System.out.println("----------------------");
    }
}