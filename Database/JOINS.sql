create table Departments(
DeptID int primary key,
Dept_name varchar(100));

insert into Departments values
(1,'HR'),
(2,'Development'),
(3,'IT'),
(4,'Marketing');
----------------------------------------------------------------------
CREATE TABLE Employees(
EmpID INT PRIMARY KEY,
EmpName VARCHAR(50),
DeptID INT,
Salary DECIMAL(10,2),
ManagerID INT NULL,
FOREIGN KEY (DeptID) REFERENCES Departments(DeptID)
);

insert into Employees values
(1,'maneesh',1,45000,NULL),
(2,'Santho',2,45000,NULL),
(3,'ROHAN',3,45000,NULL),
(4,'S:FJN',NULL,45000,NULL);
---------------------------------------------------------------------

-----------------------------------------------------------------------

-------------------------------------------------------------------------
truncate table Employees;
select * from Departments;
select * from Employees;

select * from Employees
 join Departments on Departments.DeptID=Employees.DeptID;

select * from Employees
left join Departments on Departments.DeptID=Employees.DeptID;

select * from Employees
cross join Departments
order by EmpID;

select * from Employees
right join Departments on Departments.DeptID=Employees.DeptID;

select * from Employees
full join Departments on Departments.DeptID=Employees.DeptID;

CREATE table UG_Students(
student_id int PRIMARY key,
student_name varchar(20)
);

CREATE table PG_Students(
student_id int PRIMARY key,
student_name varchar(20)
);

insert into UG_Students values
(1,'Rohan'),
(2,'ranjhi');



insert into UG_Students values
(101,'Rk'),
(201,'rin');

