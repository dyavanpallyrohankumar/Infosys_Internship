-- Create Customers table
CREATE TABLE customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(20),
    address VARCHAR(20),
    phone_no BIGINT,
    email_id VARCHAR(20)
);

INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id) VALUES
('C001', 'Alice Johnson', 'New York', 9876543210, 'alice@example.com'),
('C002', 'Bob Smith', 'Los Angeles', 9123456780, 'bob@example.com'),
('C003', 'Charlie Brown', 'Chicago', 9988776655, 'charlie@example.com'),
('C004', 'Diana Prince', 'Houston', 9871234567, 'diana@example.com'),
('C005', 'Eva Green', 'Phoenix', 9765432109, 'eva@example.com');


-- Create Delivery Partners table
CREATE TABLE delivery_partners (
    partner_id VARCHAR(10) PRIMARY KEY,
    partner_name VARCHAR(20),
    phone_no BIGINT,
    rating INT
);

INSERT INTO delivery_partners (partner_id, partner_name, phone_no, rating) VALUES
('P001', 'Zomato Express', 9001122334, 5),
('P002', 'Swiggy Fast', 9002233445, 4),
('P003', 'Uber Eats', 9003344556, 3),
('P004', 'Dunzo Delivery', 9004455667, 4),
('P005', 'Food Panda', 9005566778, 2);


-- Create Hotel Details table
CREATE TABLE hotel_details (
    hotel_id VARCHAR(10) PRIMARY KEY,
    hotel_name VARCHAR(20),
    hotel_type VARCHAR(20),
    rating INT
);

INSERT INTO hotel_details (hotel_id, hotel_name, hotel_type, rating) VALUES
('H001', 'Spice Villa', 'Indian', 5),
('H002', 'Dragon Wok', 'Chinese', 4),
('H003', 'Pizza Palace', 'Italian', 3),
('H004', 'Burger Barn', 'Fast Food', 4),
('H005', 'Taco Town', 'Mexican', 3);


-- Create Orders table with foreign keys
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id VARCHAR(10),
    hotel_id VARCHAR(10),
    partner_id VARCHAR(10),
    order_date DATE,
    order_amount INT,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (hotel_id) REFERENCES hotel_details(hotel_id),
    FOREIGN KEY (partner_id) REFERENCES delivery_partners(partner_id)
);

INSERT INTO orders (order_id, customer_id, hotel_id, partner_id, order_date, order_amount) VALUES
-- Same date: 2023-08-01
(101, 'C001', 'H001', 'P001', '2023-08-01', 450),
(106, 'C002', 'H002', 'P002', '2023-08-01', 300),
(107, 'C003', 'H003', 'P003', '2023-08-01', 500),

-- Same date: 2023-08-03
(102, 'C002', 'H003', 'P002', '2023-08-03', 700),
(108, 'C004', 'H004', 'P004', '2023-08-03', 650),

-- Different dates
(103, 'C003', 'H002', 'P003', '2023-08-05', 300),
(104, 'C004', 'H005', 'P004', '2023-08-07', 250),
(105, 'C005', 'H004', 'P005', '2023-08-09', 600),
(109, 'C001', 'H005', 'P001', '2023-08-10', 400),
(110, 'C005', 'H001', 'P005', '2023-08-12', 550);



select orders.order_date,
Count(orders.order_date) as Total_orders,
sum(orders.order_amount) as TOTAL_SALE
from orders
group by order_date
order by orders.order_date