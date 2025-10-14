package Projects.Restaurant_Management_System;

import java.util.*;

class Order {
    private static int counter = 1;
    private String orderId;
    private List<OrderItem> items = new ArrayList<>();
    private boolean completed;

    public Order() {
        this.orderId = "ORD" + counter++;
        this.completed = false;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isCompleted() {
        return completed;
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order ID: " + orderId + "\n");
        for (OrderItem oi : items) {
            sb.append(oi).append("\n");
        }
        sb.append("Total: ₹").append(calculateTotal());
        return sb.toString();
    }
}
