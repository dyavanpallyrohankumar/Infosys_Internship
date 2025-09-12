
select * from Users;
select * from Department order by DeptName;
select * from  Course;
select * from Student;
select * from Subject;
create database campus;
use campus;
/* Tables :
Users;
Department;
Course;
Student;
Subject; */
--//////////////////////////////////////////////////////////////////////////////////////////////////

create table Users(
UserID int Primary key,
Username varchar(50) not null,
fullname varchar(150) not null,
role varchar(50),
created_by varchar(50),
created_at Datetime Default getdate(),
updated_by Varchar(50),
updated_at datetime
);

insert into Users(UserID,Username,fullname,role,created_by,created_at) values 
(1,'admin','System Admin','Admin','system',GETDATE()),
(2,'hod_cs','Sharma','Faculty','admin',GETDATE()),
(3,'hod_me','Singh','Faculty','admin',GETDATE()),
(4,'hod_ee','Verma','Faculty','admin',GETDATE()),
(5,'student1','Amit','Student','admin',GETDATE());

select fullname,role,COUNT(*) from Users group by Users.role order by Users.fullname;

SELECT fullname, role, COUNT(*) 
FROM Users 
GROUP BY fullname, role 
ORDER BY fullname;

delete  Users;
/*
| ID | Username  | Name         | Role    | Created By | Created At               | Updated By | Updated At |
|----|-----------|--------------|---------|------------|--------------------------|------------|------------|
| 1  | admin     | System Admin | Admin   | system     | 2025-08-29 14:15:43.480  | NULL       | NULL       |
| 2  | hod_cs    | Sharma       | Faculty | admin      | 2025-08-29 14:15:43.480  | NULL       | NULL       |
| 3  | hod_me    | Singh        | Faculty | admin      | 2025-08-29 14:15:43.480  | NULL       | NULL       |
| 4  | hod_ee    | Verma        | Faculty | admin      | 2025-08-29 14:15:43.480  | NULL       | NULL       |
| 5  | student1  | Amit         | Student | admin      | 2025-08-29 14:15:43.480  | NULL       | NULL       |
*/

--//////////////////////////////////////////////////////////////////////////////////////////////////
Create table Department(
DeptID int Primary key,
DeptName varchar(50) not null,
hod_name varchar(100),
created_by varchar(50),
created_at Datetime Default getdate(),
updated_by Varchar(50),
updated_at datetime
);


insert into Department(DeptID,DeptName,hod_name,created_by,created_at) values 
(1,'Computer Science','Sharma','admin',GETDATE()),
(2,'Mechanical','Singh','admin',GETDATE()),
(3,'Electrical','Verma','admin',GETDATE());

select * from Department order by DeptName;
/*

| ID | Department        | HOD   | Created By | Created At               | Updated By | Updated At |
|----|-------------------|-------|------------|--------------------------|------------|------------|
| 1  | Computer Science  | Sharma| admin      | 2025-08-29 14:20:54.417  | NULL       | NULL       |
| 2  | Mechanical        | Singh | admin      | 2025-08-29 14:20:54.417  | NULL       | NULL       |
| 3  | Electrical        | Verma | admin      | 2025-08-29 14:20:54.417  | NULL       | NULL       |

*/
--//////////////////////////////////////////////////////////////////////////////////////////////////
CREATE TABLE Course(
course_id INT PRIMARY KEY,
course_name VARCHAR(100) NOT NULL,
duration_years INT CHECK (duration_years BETWEEN 1 AND 5),
DeptID INT,
created_by VARCHAR(50),
created_at DATETIME DEFAULT GETDATE(),
updated_by VARCHAR(50),
updated_at DATETIME,
FOREIGN KEY (DeptID) REFERENCES
Department(DeptID)
);

INSERT INTO Course (course_id, course_name, duration_years, DeptID, created_by, created_at)
VALUES
(101, 'B.Tech Computer Science',4,1,'admin',GETDATE()),
(102, 'B.Tech Mechanical',4,2,'admin',GETDATE()),
(103, 'B.Tech Electrical',4,3,'admin',GETDATE()),
(104, 'Diploma in Computer Application',2,1,'admin',GETDATE()
);
/*
| course_id  | course_name                        | duration_years | DeptID | created_by | Created At               | Updated By | Updated At |
|------------|------------------------------------|------------------|---------------|------------|--------------------------|------------|------------|
|    101     | B.Tech Computer Science            | 4                | 1             | admin      | 2025-08-29 14:45:00.190  | NULL       | NULL       |
| 102 | B.Tech Mechanical                  | 4                | 2             | admin      | 2025-08-29 14:45:00.190  | NULL       | NULL       |
| 103 | B.Tech Electrical                  | 4                | 3             | admin      | 2025-08-29 14:45:00.190  | NULL       | NULL       |
| 104 | Diploma in Computer Application    | 2                | 1             | admin      | 2025-08-29 14:45:00.190  | NULL       | NULL       |
*/

--//////////////////////////////////////////////////////////////////////////////////////////////////

create table Student(
student_id int primary key,
roll_no varchar(20) unique,
first_name varchar(100) not null,
last_name varchar(100),
dob date,
gender char(1)check(gender in ('M','F')),
course_id int,
created_by varchar(50),
created_at datetime default getdate(),
updated_by varchar(50),
updated_at datetime,
foreign key (course_id)references Course(course_id)
);

insert into Student (Student_id,roll_no,first_name,last_name,dob,gender,course_id,created_by,created_at) values 
(1001,'CS101','Amit','Kumar','2002/01/15','M',101,'admin',GETDATE()),
(1002,'CS102','Priya','Sharma','2003/05/15','F',101,'admin',GETDATE()),
(1003,'ME101','Rahul','Varma','2001/12/15','M',102,'admin',GETDATE()),
(1004,'EE101','Senha','Patel','2005/11/15','F',103,'admin',GETDATE()),
(1005,'DCA101','Vikram','Rathod','2002/01/15','M',104,'admin',GETDATE());

/*
| ID   | Roll No | First Name | Last Name | DOB        | Gender | Course ID | Created By | Created At               | Updated By | Updated At |
|------|---------|------------|-----------|------------|--------|-----------|------------|--------------------------|------------|------------|
| 1001 | CS101   | Amit       | Kumar     | 2002-01-15 | M      | 101       | admin      | 2025-08-29 14:45:09.757  | NULL       | NULL       |
| 1002 | CS102   | Priya      | Sharma    | 2003-05-15 | F      | 101       | admin      | 2025-08-29 14:45:09.757  | NULL       | NULL       |
| 1003 | ME101   | Rahul      | Varma     | 2001-12-15 | M      | 102       | admin      | 2025-08-29 14:45:09.757  | NULL       | NULL       |
| 1004 | EE101   | Senha      | Patel     | 2005-11-15 | F      | 103       | admin      | 2025-08-29 14:45:09.757  | NULL       | NULL       |
| 1005 | DCA101  | Vikram     | Rathod    | 2002-01-15 | M      | 104       | admin      | 2025-08-29 14:45:09.757  | NULL       | NULL       |
*/
--//////////////////////////////////////////////////////////////////////////////////////////////////

create table Subject(
subject_id int primary key,
subject_name varchar(100) not null,
credits int check(credits>0),
course_id int,
created_by varchar(50),
created_at datetime default getdate(),
updated_by varchar(50),
updated_at datetime,
foreign key (course_id)references Course(course_id)
);


insert into Subject(subject_id,subject_name,credits,course_id,created_by,created_at)values
(201, 'Data Structures',4,101,'admin',GETDATE()),
(202, 'Operating System',4,101,'admin',GETDATE()),
(203, 'Thermodynamics',3,102,'admin',GETDATE()),
(204, 'Machine Design',3,102,'admin',GETDATE()),
(205, 'Circuits',4,103,'admin',GETDATE()),
(206, 'Power System',4,103,'admin',GETDATE()),
(207, 'Computer Basics',2,104,'admin',GETDATE());
/*
| ID  | Subject Name       | Credits | Course ID | Created By | Created At               | Updated By | Updated At |
|-----|--------------------|---------|-----------|------------|--------------------------|------------|------------|
| 201 | Data Structures    | 4       | 101       | admin      | 2025-08-29 14:58:56.580  | NULL       | NULL       |
| 202 | Operating System   | 4       | 101       | admin      | 2025-08-29 14:58:56.580  | NULL       | NULL       |
| 203 | Thermodynamics     | 3       | 102       | admin      | 2025-08-29 14:58:56.580  | NULL       | NULL       |
| 204 | Machine Design     | 3       | 102       | admin      | 2025-08-29 14:58:56.580  | NULL       | NULL       |
| 205 | Circuits           | 4       | 103       | admin      | 2025-08-29 14:58:56.580  | NULL       | NULL       |
| 206 | Power System       | 4       | 103       | admin      | 2025-08-29 14:58:56.580  | NULL       | NULL       |
| 207 | Computer Basics    | 2       | 104       | admin      | 2025-08-29 14:58:56.580  | NULL       | NULL       |
*/


--//////////////////////////////////////////////////////////////////////////////////////////////////
select * from Users;
select * from Department;
select * from  Course;
select * from Student;
select * from Subject;


--//Task
select * from Student order by first_name;--1Q
select * from Student order by dob desc;--2Q
select gender ,COUNT(gender)as total_count from Student group by gender;--//3Q
select course_id ,COUNT(student_id)as total_count from Student group by course_id;--//4Q
select * from Student where gender='M';--//5Q
select * from Student where dob>'2002/12/31';--//6Q
--//7Q
--//8Q
--//9Q
select course_id ,COUNT(subject_name)as total_count from Subject group by course_id;--//10Q
select * from Student where course_id=101 OR gender='M';--//11Q
select * from Student where dob<'2002/12/31' OR gender='F';--//12Q
