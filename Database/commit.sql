use infosys;

select *from Employees;

BEGIN TRANSACTION

update Employees set Salary=25000 where EmpId=2;
insert into Employees values(9,'Rocky','HR',50000,null,'2023-03-20 14:45:00.000');
COMMIT

BEGIN TRANSACTION;

UPDATE Employees SET Salary = 25000 WHERE EmpId = 4;
INSERT INTO Employees VALUES (9, 'Rocky', 'HR', 50000, NULL, '2023-03-20 14:45:00.000'); -- fails due to duplicate key

ROLLBACK;
