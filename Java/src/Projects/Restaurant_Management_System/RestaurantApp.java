package Projects.Restaurant_Management_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantApp {

    private static Scanner sc = new Scanner(System.in);
    private static Menu menu = new Menu();
    private static List<Customer> customers = new ArrayList<>();
    private static List<Order> allOrders = new ArrayList<>();
    private static RestaurantOwner owner = new RestaurantOwner("Admin", "9999999999");

    public static void main(String[] args) {
        seedMenu();
        mainMenu();
    }

    // ========== Main Menu ==========
    private static void mainMenu() {
        while (true) {
            System.out.println("\n=== RESTAURANT MANAGEMENT SYSTEM ===");
            System.out.println("1. Register as Customer");
            System.out.println("2. Login as Customer");
            System.out.println("3. Login as Owner");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerCustomer();
                    break;
                case 2:
                    customerLogin();
                    break;
                case 3:
                    ownerMenu();
                    break;
                case 4:
                    System.out.println("Thank you! Visit again.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ========== Customer Registration ==========
    private static void registerCustomer() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        Customer c = new Customer(name, phone);
        customers.add(c);
        System.out.println("Registered successfully! Your ID: " + c.getCustomerId());
    }

    // ========== Customer Login ==========
    private static void customerLogin() {
        System.out.print("Enter customer ID: ");
        String id = sc.nextLine();

        Customer customer = null;
        for (Customer c : customers) {
            if (c.getCustomerId().equalsIgnoreCase(id)) {
                customer = c;
                break;
            }
        }

        if (customer == null) {
            System.out.println("Customer not found!");
            return;
        }

        while (true) {
            System.out.println("\nWelcome, " + customer.getName());
            System.out.println("1. View Menu");
            System.out.println("2. Search Item");
            System.out.println("3. Place Order");
            System.out.println("4. View My Orders");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    menu.displayMenu();
                    break;
                case 2:
                    System.out.print("Enter keyword: ");
                    String kw = sc.nextLine();
                    menu.searchItem(kw);
                    break;
                case 3:
                    placeOrder(customer);
                    break;
                case 4:
                    viewCustomerOrders(customer);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ========== Place Order ==========
    private static void placeOrder(Customer customer) {
        Order order = new Order();
        while (true) {
            menu.displayMenu();
            System.out.print("Enter item ID to add (0 to finish): ");
            int id = sc.nextInt();
            if (id == 0)
                break;

            Item item = menu.getItemById(id);
            if (item == null) {
                System.out.println("Invalid item ID!");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            order.addItem(new OrderItem(item, qty));
        }

        if (order.getItems().isEmpty()) {
            System.out.println("No items added.");
            return;
        }

        customer.addOrder(order);
        allOrders.add(order);
        order.markCompleted();

        Bill bill = new Bill(order);
        bill.generateBill();
    }

    // ========== View Customer Orders ==========
    private static void viewCustomerOrders(Customer customer) {
        if (customer.getOrders().isEmpty()) {
            System.out.println("No orders yet!");
        } else {
            for (Order o : customer.getOrders()) {
                System.out.println(o);
            }
        }
    }

    // ========== Owner Menu ==========
    private static void ownerMenu() {
        System.out.print("Enter Owner password (hint: admin): ");
        String pwd = sc.nextLine();
        if (!pwd.equalsIgnoreCase("admin")) {
            System.out.println("Wrong password!");
            return;
        }

        while (true) {
            System.out.println("\n--- OWNER MENU ---");
            System.out.println("1. View Menu");
            System.out.println("2. Add Menu Item");
            System.out.println("3. Delete Menu Item");
            System.out.println("4. View All Customers");
            System.out.println("5. View All Orders");
            System.out.println("6. Generate Sales Report");
            System.out.println("7. Logout");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    menu.displayMenu();
                    break;
                case 2:
                    addMenuItem();
                    break;
                case 3:
                    deleteMenuItem();
                    break;
                case 4:
                    viewAllCustomers();
                    break;
                case 5:
                    viewAllOrders();
                    break;
                case 6:
                    generateSalesReport();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // ========== Add/Delete Menu Items ==========
    private static void addMenuItem() {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter category: ");
        String category = sc.nextLine();

        int id = menu.getAllItems().size() + 1;
        menu.addItem(new Item(id, name, price, category));
        System.out.println("Item added successfully!");
    }

    private static void deleteMenuItem() {
        menu.displayMenu();
        System.out.print("Enter item ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        menu.removeItem(id);
        System.out.println("Item deleted!");
    }

    // ========== View Customers and Orders ==========
    private static void viewAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers registered yet!");
        } else {
            for (Customer c : customers) {
                System.out.println(c);
            }
        }
    }

    private static void viewAllOrders() {
        if (allOrders.isEmpty()) {
            System.out.println("No orders placed yet!");
        } else {
            for (Order o : allOrders) {
                System.out.println(o);
            }
        }
    }

    // ========== Generate Sales Report ==========
    private static void generateSalesReport() {
        double total = 0;
        for (Order o : allOrders) {
            total += o.calculateTotal();
        }
        System.out.println("Total sales: ₹" + total);
        System.out.println("Total orders: " + allOrders.size());
    }

    // ========== Seed Default Menu ==========
    private static void seedMenu() {
        menu.addItem(new Item(1, "Paneer Butter Masala", 180, "Main Course"));
        menu.addItem(new Item(2, "Veg Biryani", 150, "Main Course"));
        menu.addItem(new Item(3, "Masala Dosa", 100, "Snacks"));
        menu.addItem(new Item(4, "Cold Coffee", 90, "Beverages"));
        menu.addItem(new Item(5, "Ice Cream", 70, "Dessert"));
    }
}