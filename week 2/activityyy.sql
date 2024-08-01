create database ecommerce;
use ecommerce;

create table Employees(
EmployeeID bigint primary key Auto_increment ,
EmployeeName varchar(50),
DepartmentID bigint 
);
alter table Employees
add foreign key(DepartmentID) references Departments(DepartmentID) ;

create table Departments(
DepartmentID bigint primary key  ,
DepartmentName varchar(50)

);


create table Projects(
ProjectID bigint primary key,
ProjectName varchar(50),
DepartmentID bigint,

foreign key(DepartmentID) references Departments(DepartmentID) ON DELETE SET NULL ON UPDATE CASCADE
);
drop table Employees;
insert into Employees(EmployeeName,DepartmentID) values ('John',1),('Jane',2),('Mark',1),('Emily',3);
insert into Departments(DepartmentID,DepartmentName) values(1,'Sales'),(2,'HR'),(3,'IT'),(4,'Marketing');
insert into Projects(ProjectID,ProjectName,DepartmentID) values (101,'Project A',1),(102,'Project B',2),(103,'Project C',3),(104,'Project D',4),(105,'Project E',null);

insert into Employees(EmployeeName,DepartmentID) values ('Karen',5);
insert into Departments(DepartmentID,DepartmentName) values(5,null);
insert into Projects(ProjectID,ProjectName,DepartmentID) values (101,'Project A',1),(102,'Project B',2),(103,'Project C',3),(104,'Project D',4),(105,'Project E',null);


-- Retrieve the list of employees along with their department names where employees are associated with departments.
select e.EmployeeID,e.EmployeeName,d.DepartmentName from Employees e  JOIN Departments d ON e.DepartmentID=d.DepartmentID;
 -- Retrieve all employees and their associated department names. If an employee does not belong to a department, show NULL.
select e.EmployeeID,e.EmployeeName,d.DepartmentName from Employees e  LEFT JOIN Departments d ON e.DepartmentID=d.DepartmentID; 
-- Retrieve all departments and the names of employees in those departments. If a department does not have any employees, show NULL.
select d.DepartmentID,d.DepartmentName,e.EmployeeName from Departments d left join Employees e On d.DepartmentID=e.DepartmentID;
-- Retrieve all possible combinations of employees and projects.
select * from Employees cross join Projects ;
-- Retrieve the list of employees whose department ID is greater than the department ID of 'HR' department.

SET @HR_DepartmentID = (SELECT DepartmentID FROM Departments WHERE DepartmentName = 'HR');
SELECT 
    e.EmployeeID,
    e.EmployeeName,
    e.DepartmentID
FROM 
    Employees e
WHERE 
    e.DepartmentID > @HR_DepartmentID;
    
    
-- Retrieve the list of projects along with their department names, where the projects are associated with departments
select p.ProjectID,p.ProjectName,p.DepartmentID from Projects p JOIN Departments d ON p.DepartmentID=d.DepartmentID;
-- Find employees who are not assigned to any department

SET @DepId =(SELECT DepartmentID from Departments Where DepartmentName is null);

select e.EmployeeName,e.EmployeeID from Employees e where e.DepartmentID=@DepId;
-- Find departments that have no employees
select d.DepartmentName, d.DepartmentID from Departments d Left join Employees e ON d.DepartmentID=e.DepartmentID 
where e.EmployeeID is null;
-- Find all departments along with the number of employees in each department
SELECT d.DepartmentID, d.DepartmentName, COUNT(e.EmployeeID) AS NumberOfEmployees
FROM Departments d
LEFT JOIN Employees e ON d.DepartmentID = e.DepartmentID
GROUP BY d.DepartmentID, d.DepartmentName;
