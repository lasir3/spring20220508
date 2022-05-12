CREATE DATABASE mydb4;
USE mydb4;

CREATE TABLE Customers
SELECT * FROM w3schools.Customers;

DESC Customers;

ALTER TABLE Customers
MODIFY COLUMN CustomerID INT PRIMARY KEY AUTO_INCREMENT;

CREATE TABLE Employees 
SELECT * FROM w3schools.Employees;

DESC Employees;

ALTER TABLE Employees
MODIFY COLUMN EmployeeID INT PRIMARY KEY AUTO_INCREMENT;

SELECT * FROM Customers; -- 91개
SELECT * FROM Employees; -- 10개

SELECT * FROM Customers ORDER BY CustomerID DESC;
DELETE FROM Customers WHERE CustomerID = 93;

SELECT * FROM Employees ORDER BY EmployeeID DESC;
DELETE FROM Employees WHERE EmployeeID = 14;