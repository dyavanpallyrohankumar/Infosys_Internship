CREATE TABLE Customers (
customer_id INT PRIMARY KEY,
customer_name VARCHAR(100),
city VARCHAR(50)
);


insert into Customers values (1,'Rohankumar','Maharastra'),
(2,'Aditya','Telangana'),
(3,'Priyanka','Tamil Nadu'),
(4,'Ramesh','Maharastra'),
(5,'Adrash','Karnataka'),
(6,'Janvi','Tamil Nadu'),
(7,'Rohit','Telangana');

--------------------------------------------------------------------------

CREATE TABLE Products (
product_id INT PRIMARY KEY,
product_name VARCHAR(100),
price DECIMAL(10,2)
);

insert into Products values 
(101,'Laptop','55000.00'),
(102,'HeadPhones','2000.00'),
(103,'Keyboard','1200.00');
----------------------------------------------------------------------------

create table Orders(
order_id int primary key ,
customer_id int,
product_id int,
quantity int,
foreign key (customer_id) references Customers(customer_id),
foreign key (product_id) references Products(product_id)
);


insert into Orders values 
(1001,1,101,2),
(1002,5,103,2),
(1003,2,102,8),
(1004,1,102,5);
----------------------------------------------------------------------------
create table Payments(
payment_id int primary key,
order_id int,
status varchar(20),
foreign key (order_id) references Orders(order_id)
);

insert into Payments values 
(10001,101,2),
(1002,103,2),
(1003,102,8),
(1004,102,5);
---------------------------------------------------------------------------------

insert into Orders values
(1001,1,101,1),
(1002,2,102,2),
(1003,1,103,3);

INSERT INTO Customers VALUES
(1, 'Mohan', 'Visakhapatnam'),
(2, 'Priyanka Mohan', 'Visakhapatnam');

INSERT INTO Products VALUES
(101, 'Laptop', 55000),
(102, 'Mobile', 20000),
(103, 'Headphones', 2500);

INSERT INTO Payments VALUES
(501,1001,'Paid'),
(502,1002,'Pending'),
(503,1003,'Paid');




select * from Customers;
select * from Products;
select * from Orders;
select * from Payments;


SELECT Customers.customer_name,Products.product_name,Orders.quantity,Payments.status
FROM Orders
JOIN Customers ON Customers.customer_id = Orders.customer_id
JOIN Products ON Orders.product_id=Products.product_id
JOIN Payments ON Payments.order_id = Orders.order_id;