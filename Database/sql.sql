-- Online SQL Editor to Run SQL Online.
-- Use the editor to create new tables, insert data and all other SQL operations.
  
 -- SELECT * from Customers;
--SELECT * from orders;
---SELECT * from Shippings;


--SELECT * from Customers order by age desc;
--SELECT * from Customers where country="USA" order by age;

--SELECT * from Customers where first_name="Betty";

--SELECT * from Customers order by age desc limit 2

select country,count(*) as customer_count
from customers
group by country
order by customer_count Desc, country;

select country,count(*) as customer_count
from customers
group by country
order by customer_count Desc, country;

select country,avg(age) as avg_age
from customers
group by country
having avg(age)>=25
order by avg_age


select c.customer_id,CONCAT(c.first_name,' ',c.last_name)as customer_name,sum(o.amount) as total_spent
from customers c join orders o 
on o.customer_id= c.customer_id 
group by c.customer_id,c.first_name,c.last_name
order by total_spent desc;



select o.order_id,o.item,o.amount,c.customer_id,c.first_name,c.last_name
from orders  o inner join customers  c 
on c.customer_id= o.customer_id
group by c.customer_id,c.first_name,c.last_name
order by o.order_id;


select o.order_id,o.item,o.amount,c.customer_id,c.first_name,c.last_name
from orders  o inner join customers  c 
on c.customer_id= o.customer_id ;
--group by c.customer_id,c.first_name,c.last_name;
--order by o.order_id;


select o.order_id,o.item,o.amount,c.customer_id,c.first_name,c.last_name
from orders  o  join customers  c 
using (customer_id)
--group by c.customer_id,c.first_name,c.last_name
order by o.order_id;

--order by amount

select o.order_id,o.item,o.amount,c.customer_id,c.first_name,c.last_name
from orders as o inner join customers as c 
on c.customer_id= o.customer_id 
group by c.customer_id,c.first_name,c.last_name
order by o.amount;


select c.customer_id,c.first_name,c.last_name,o.order_id,o.item,o.amount
from  customers c left join orders o 
on o.customer_id=c.customer_id
order by c.customer_id;


