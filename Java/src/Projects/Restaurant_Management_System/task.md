/*Perfect — this is a great project idea to consolidate Core Java + OOPs + Collection Framework concepts into one solid console-based Restaurant Management System.
Let’s break it down fully — I’ll give you:
1.	✅ Problem statement
2.	🎯 Objectives & Scope
3.	🧱 Core OOP Classes (with relationships)
4.	💡 List of 10+ Features
5.	🧩 Suggested Technologies/Concepts to Apply
6.	🖥️ Program Flow (User and Owner flow)
7.	🧾 Sample Output
8.	💻 Implementation Plan (Step-by-step)
________________________________________
✅ 1. Problem Statement
Design and develop a console-based Restaurant Management System in Core Java using OOP principles and Java Collection Framework.
The system should allow customers to register, view the menu, place orders, and generate bills.
The restaurant owner should be able to view customers, manage menus, and view sales reports.
This application will simulate the basic workflow of a restaurant — menu browsing, ordering, billing, and customer management — all from the command line.
________________________________________
🎯 2. Objectives & Scope
•	To apply OOP principles such as Encapsulation, Inheritance, Polymorphism, and Abstraction.
•	To use Java Collections (ArrayList, HashMap, LinkedHashMap, etc.) for data storage and manipulation.
•	To simulate real-world restaurant operations in a console environment.
•	To allow role-based actions (Customer vs Owner) through a menu-driven interface.
________________________________________
🧱 3. Core OOP Classes and Relationships
Class Diagram (Simplified Textual Representation)
Restaurant
 ├── Menu
 │    ├── Item
 │
 ├── Order
 │    ├── OrderItem
 │
 ├── Customer
 │
 ├── Bill
 │
 └── RestaurantOwner
Main Classes
Class Name	Description
Restaurant	Entry point, manages menu, customers, orders, and owner operations
Menu	Contains list of Item objects
Item	Represents a single food item (id, name, price, category)
Customer	Holds customer details (id, name, contact, registered orders)
Order	Represents a customer's order, includes list of OrderItem
OrderItem	Represents a specific item with quantity in an order
Bill	Generates and displays bill for an order
RestaurantOwner	Special user with privileges to add menu items, see reports, etc.
________________________________________
💡 4. At Least 10 Features
#	Feature	Description
1	Customer Registration	New customers can register with name, phone, etc.
2	Menu Display	Display all menu items with name, price, category.
3	Add New Menu Items (Owner only)	Owner can add new items to menu.
4	Place an Order	Customers can select items and quantities.
5	View Cart	Customers can view current order before confirmation.
6	Generate Bill	After confirming, bill is generated with total + taxes.
7	View All Customers (Owner only)	Owner can list all registered customers.
8	Search Item by Name/Category	Customers can search for specific food items.
9	View All Orders	Owner can see all completed orders.
10	Sales Report (Owner only)	Owner can see total sales for the day.
11	Update/Delete Menu Items (Owner only)	Modify price or remove items.
12	Discount Feature	Add promotional discounts on total bill.
________________________________________
🧩 5. Concepts to Demonstrate
Concept	Where to Use
Encapsulation	Getters and setters in all model classes
Inheritance	User → Customer and RestaurantOwner
Polymorphism	Overloaded methods for addItem() or displayMenu()
Abstraction (Interface)	IBillable interface for bill calculation
Collection Framework	ArrayList for storing items/orders, HashMap for menu mapping
File I/O (optional)	To store menu or customer data persistently
Comparator / Comparable	For sorting menu items by price or name
________________________________________
🖥️ 6. Program Flow
Main Menu
Welcome to Java Restaurant Management System
1. Register as Customer
2. Login as Customer
3. Login as Owner
4. Exit
Customer Menu
1. View Menu
2. Search Item
3. Place Order
4. View My Orders
5. Generate Bill
6. Logout
Owner Menu
1. Add Menu Item
2. Update/Delete Menu Item
3. View All Customers
4. View All Orders
5. Generate Sales Report
6. Logout
________________________________________
🧾 7. Sample Output (Short Demo)
Welcome to Java Restaurant Management System
1. Register as Customer
2. Login as Customer
3. Login as Owner
4. Exit
Enter your choice: 1

Enter your name: Aditya
Enter your phone: 9876543210
Registration successful! Your customer ID: CUST001

---

Menu:
1. Paneer Butter Masala - ₹180
2. Veg Biryani - ₹150
3. Masala Dosa - ₹100

Enter item number to order: 1
Enter quantity: 2
Added to order!

Would you like to add more? (y/n): n

Generating Bill...
Total = ₹360
GST (5%) = ₹18
Final Amount = ₹378

Thank you, Aditya ! Enjoy your meal 🍴
________________________________________
💻 8. Implementation Plan (Step-by-Step)
1.	Create model classes:
Item, Menu, Customer, Order, OrderItem, Bill, RestaurantOwner
2.	Implement encapsulation with private fields and public getters/setters.
3.	Create RestaurantApp (main class) with console menu logic.
4.	Use ArrayList and HashMap for storing data in-memory.
5.	Implement menu-driven flow using Scanner for user input.
6.	Add exception handling for invalid inputs.
7.	Enhance billing — add tax, discounts, total summary.
8.	Add sorting/search functionality using Comparator.
9.	(Optional) Implement file saving/loading using FileWriter & BufferedReader.
10.	Test all flows — registration, ordering, owner functions.
________________________________________

*/

import java.util.*;

// ========== Abstract User Class ==========


// ========== Customer Class ==========


// ========== Restaurant Owner ==========


// ========== Menu Item ==========


// ========== Menu ==========


// ========== Order Item ==========


// ========== Order ==========


// ========== Bill ==========




package org.example;

