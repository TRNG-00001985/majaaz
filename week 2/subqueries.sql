create database ecch;
use ecch;

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
drop table employees;

-- Find the names of employees who work in the same department as 'John'
SELECT EmployeeName
FROM Employees
WHERE DepartmentID = (
    SELECT DepartmentID
    FROM Employees
    WHERE EmployeeName = 'John'
) ;

-- Find departments that have more than one employee

Select DepartmentID,DepartmentName from departments where DepartmentID in (Select DepartmentID from  Employees group by DepartmentID having  count(EmployeeID) > 1); 

-- Find the projects that are not assigned to any department
Select ProjectName , ProjectID from Projects where DepartmentID not in(Select DepartmentID from Departments where DepartmentID is not null);

-- Find the department with the maximum number of employees.
SELECT DepartmentName from Departments where DepartmentID in (select DepartmentID from Employees group by DepartmentID order by  count(EmployeeID) desc limit 1);

-- Find employees who are working on projects in the 'Sales' department
SELECT EmployeeName from Employees where DepartmentID in (Select DepartmentID from  projects where DepartmentID in (Select DepartmentID from Departments where DepartmentName ='Sales'));
-- Find the names of departments that do not have any projects.
select DepartmentName from departments where DepartmentID not in (select distinct DepartmentID from Projects where DepartmentID is not null);
-- Find employees who are not working on any project.
SELECT e.EmployeeName
FROM Employees e
WHERE e.DepartmentID IN (
    SELECT d.DepartmentID
    FROM Departments d
    LEFT JOIN Projects p ON d.DepartmentID = p.DepartmentID
    WHERE p.ProjectID IS NULL
);
--  Find the department names and the number of employees in each department, only for departments with more than two employees.
SELECT d.DepartmentName, e.NumEmployees
FROM Departments d
JOIN (
    SELECT DepartmentID, COUNT(EmployeeID) AS NumEmployees
    FROM Employees
    GROUP BY DepartmentID
    HAVING COUNT(EmployeeID) > 2
) e ON d.DepartmentID = e.DepartmentID;
-- Find the projects handled by employees in the 'IT' department.
select ProjectName,ProjectID from projects where DepartmentID in(select DepartmentID from Departments where DepartmentName ='IT');
-- Find the names of employees who do not work in the 'Marketing' department.
select EmployeeName from Employees where DepartmentID not in(select DepartmentID from Departments where DepartmentName='Marketing');