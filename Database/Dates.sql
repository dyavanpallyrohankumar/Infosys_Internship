select * from Employees

select EmpName, JoinDate,
format(JoinDate, 'dd-MM-yyyy') as DayMonthYear,
format(JoinDate, 'yyyy-MM-dd') as ISOFormat,
format(JoinDate, 'MM/dd/yyyy') as USFormat,
format(JoinDate, 'dddd') as FullDAy,
format(JoinDate, 'MM') as ShortMonth,
format(JoinDate, 'MMM') as fullMonth,
format(JoinDate, 'yyyy') as YearOnly
from Employees;

select JoinDate,
Month(JoinDate) as month_number,
datename(Month, JoinDate) as Month_name,
year (JoinDate) as year_number,
Day(JoinDate) as date,
dateadd( month,6,JoinDate) as full_date_nad_time,
datediff(month,JoinDate,GETDATE()) as fullMonth
from Employees; 


--select coalesce(Salary,Bonus,0) from Employees
--if salary is not null then return salary
--else if Bonus is not null then return bonus
--else if salary is not null and Bonus is not null then return first given atribute
--else both are null then return 0