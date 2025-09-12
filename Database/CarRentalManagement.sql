-- Create Owners table
CREATE TABLE owners (
    owner_id VARCHAR(10) PRIMARY KEY,
    owner_name VARCHAR(20),
    address VARCHAR(20),
    phone_no BIGINT,
    email_id VARCHAR(20)
);
INSERT INTO owners (owner_id, owner_name, address, phone_no, email_id) VALUES
('O001', 'Ravi Kumar', 'Chennai', 9876543210, 'ravi.k@example.com'),
('O002', 'Anita Sharma', 'Delhi', 9123456780, 'anita.s@example.com'),
('O003', 'John Doe', 'Mumbai', 9988776655, 'john.d@example.com');


-- Create Customers table
CREATE TABLE customers (
    customer_id VARCHAR(10) PRIMARY KEY,
    customer_name VARCHAR(20),
    address VARCHAR(20),
    phone_no BIGINT,
    email_id VARCHAR(20)
);

INSERT INTO customers (customer_id, customer_name, address, phone_no, email_id) VALUES
('C001', 'Arjun Mehta', 'Bangalore', 9871234567, 'arjun.m@example.com'),
('C002', 'Priya Singh', 'Hyderabad', 9765432109, 'priya.s@example.com'),
('C003', 'Rahul Verma', 'Pune', 9654321098, 'rahul.v@example.com'),
('C004', 'Sneha Iyer', 'Kolkata', 9543210987, 'sneha.i@example.com');


truncate table customers;
-- Create Cars table
CREATE TABLE cars (
    car_id VARCHAR(10) PRIMARY KEY,
    car_name VARCHAR(20),
    car_type VARCHAR(20),
    owner_id VARCHAR(10) NOT NULL,
    FOREIGN KEY (owner_id) REFERENCES owners(owner_id)
);
INSERT INTO cars (car_id, car_name, car_type, owner_id) VALUES
('CAR001', 'Honda City', 'Sedan', 'O001'),
('CAR002', 'Hyundai Creta', 'SUV', 'O002'),
('CAR003', 'Maruti Swift', 'Hatchback', 'O001'),
('CAR004', 'Toyota Innova', 'MPV', 'O003');


-- Create Rentals table
CREATE TABLE rentals (
    rental_id VARCHAR(10) PRIMARY KEY,
    customer_id VARCHAR(10) NOT NULL,
    car_id VARCHAR(10) NOT NULL,
    pickup_date DATE,
    return_date DATE,
    km_driven INT,
    fare_amount DECIMAL(10, 2),
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id),
    FOREIGN KEY (car_id) REFERENCES cars(car_id)
);

INSERT INTO rentals (rental_id, customer_id, car_id, pickup_date, return_date, km_driven, fare_amount) VALUES
('R001', 'C001', 'CAR001', '2023-08-01', '2023-08-03', 150, 3000.00),
('R002', 'C002', 'CAR002', '2023-08-01', '2023-08-04', 200, 4000.00),
('R003', 'C003', 'CAR003', '2023-08-02', '2023-08-05', 180, 3600.00),
('R004', 'C001', 'CAR004', '2023-08-03', '2023-08-06', 220, 4400.00),
('R005', 'C004', 'CAR001', '2023-08-04', '2023-08-07', 160, 3200.00),
('R006', 'C002', 'CAR003', '2023-08-05', '2023-08-08', 140, 2800.00),
('R007', 'C003', 'CAR002', '2023-08-06', '2023-08-09', 190, 3800.00);


select * from owners;
select * from customers;
select * from cars;
select * from rentals;

select rentals.car_id,cars.car_name,owners.owner_id from rentals
join cars on cars.car_id=rentals.car_id
join owners on owners.owner_id=cars.owner_id
where cars.car_name='Honda City' or cars.car_name='Maruti Swift'
order by cars.car_id;
