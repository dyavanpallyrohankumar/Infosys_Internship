create database LMS;
use LMS;
----------------------------------------------------------------------
CREATE TABLE Members(
member_id INT PRIMARY KEY,
member_name VARCHAR(50)
);
---------------------------------------------------------------------
create table Authors(
author_id int primary key,
author_name varchar(20));
-----------------------------------------------------------------------
create table Books (
	book_id int primary key,
	title varchar(100),
	author_id int,
	foreign key (author_id) references Authors(author_id)
);
------------------------------------------------------------------------
CREATE TABLE Borrow(
member_id INT,
borrow_id INT PRIMARY KEY,
book_id INT,
borrow_date DATE,
FOREIGN KEY(member_id) REFERENCES Members(member_id),
FOREIGN KEY(book_id) REFERENCES Books(book_id)
);

-------------------------------------------------------------------------
select * from Members;
select * from Authors;
select * from Books;
select * from Borrow;


select Members.member_name,Books.title,Authors.author_name,Borrow.borrow_date from Borrow
join Members on Borrow.member_id=Members.member_id
join Books on Borrow.book_id=Books.book_id
join Authors on Books.author_id=Authors.author_id;
